package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(final String text) {
        if (isBlank(text)) {
            return 0;
        }

        return sum(toInt(split(text)));
    }

    private boolean isBlank(final String text) {
        return text == null || text.isEmpty();
    }

    private String[] split(final String text) {

        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (matcher.find()) {
            String customDelimiter = matcher.group(1);
            return matcher.group(2).split(customDelimiter);
        }

        return text.split("[,:]");
    }

    private int[] toInt(final String[] strings) {
        int[] numbers = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            numbers[i] = toPositive(strings[i]);
        }
        return numbers;
    }

    private int toPositive(final String string) {
        int number = Integer.parseInt(string);
        if (number < 0) {
            throw new IllegalArgumentException("숫자는 음수면 안됩니다.");
        }
        return number;
    }

    private int sum(int[] numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        return result;
    }
}
