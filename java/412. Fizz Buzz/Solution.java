class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i < n + 1; i++) {
            result.add(createString(i));
        }

        return result;
    }

    public String createString(int number) {
        StringBuilder sb = new StringBuilder();

        if (isDivisibleBy3(number)) sb.append("Fizz");
        if (isDivisibleBy5(number)) sb.append("Buzz");
        if (!isDivisibleBy3(number) && !isDivisibleBy5(number)) sb.append(number);

        return sb.toString();
    }

    public boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }

    public boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }
}