class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        Map<Character, Integer> secretMap = new HashMap<>();
        Map<Character, Integer> guessMap = new HashMap<>();

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                secretMap.put(secret.charAt(i), secretMap.getOrDefault(secret.charAt(i), 0) + 1);
                guessMap.put(guess.charAt(i), guessMap.getOrDefault(guess.charAt(i), 0) + 1);
            }
        }

        for (Character c : guessMap.keySet()) {
            if (secretMap.containsKey(c)) {
                cows += Math.min(secretMap.get(c), guessMap.get(c));
            }
        }

        return "" + String.valueOf(bulls) + "A" + String.valueOf(cows) + "B";
    }
}