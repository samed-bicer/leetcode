class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        def createStr(number):
            string = ''
            if number % 3 == 0:
                string += 'Fizz'
            if number % 5 == 0:
                string += 'Buzz'
            if number % 5 != 0 and number % 3 != 0:
                string += str(number)

            return string


        result = []

        for i in range(1, n + 1):
            result.append(createStr(i))

        return result
    