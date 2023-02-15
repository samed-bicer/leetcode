class Solution:
    def getHint(self, secret: str, guess: str) -> str:
        bulls = 0
        cows = 0
        secretMap = {}
        guessMap = {}

        for i in range(len(secret)):
            if secret[i] == guess[i]:
                bulls += 1
            else:
                secretMap[secret[i]] = (secretMap.get(secret[i], 0) + 1)
                guessMap[guess[i]]= (guessMap.get(guess[i], 0) + 1)

        for key in guessMap.keys():
            if key in secretMap:
                cows += min(secretMap.get(key), guessMap.get(key))

        return f'{bulls}A{cows}B'