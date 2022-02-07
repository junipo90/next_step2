package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String text) {
        int result = 0;
        if (text == null || text.isEmpty()) {
            return result;
        }
//        if (text.contains("//") && text.contains("\n")) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (matcher.find()) {
            String customDelimiter = matcher.group(1);
            String[] strings = matcher.group(2).split(customDelimiter);
            result = getResult(result, strings);
            return result;
        }
//        }

//        if (text.contains(",") || text.contains(":")) {
        String[] strings = text.split("[,:]");
        result = getResult(result, strings);
        return result;
//        }

//        return -1;
    }

    private int getResult(int result, String[] strings) {
        for (String string : strings) {
            int num = Integer.parseInt(string);
            if (num < 0) {
                throw new IllegalArgumentException("숫자는 음수면 안됩니다.");
            }
            result += num;
        }
        return result;
    }
}
