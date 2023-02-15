class MovingAverage:

    def __init__(self, size: int):
        self.size = size
        self.total = 0
        self.queue = []

    def next(self, val: int) -> float:
        self.total += val
        self.queue.append(val)
        if len(self.queue) > self.size:
            removed = self.queue.pop(0)
            self.total -= removed

        return self.total / len(self.queue)


# Your MovingAverage object will be instantiated and called as such:
# obj = MovingAverage(size)
# param_1 = obj.next(val)