class MovingAverage {
    double total;
    Queue<Integer> queue;
    int size;

    public MovingAverage(int size) {
        this.size = size;
        this.total = 0;
        this.queue = new LinkedList<Integer>();
    }

    public double next(int val) {
        total += val;
        queue.add(val);
        if (queue.size() > size) {
            total -= queue.poll();
        }
        return total / queue.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
 

class MovingAverage {
    double total;
    ArrayList<Integer> queue;
    int size;

    public MovingAverage(int size) {
        this.size = size;
        this.total = 0;
        this.queue = new ArrayList<Integer>();
    }

    public double next(int val) {
        total += val;
        queue.add(val);
        if (queue.size() > size) {
            total -= queue.get(0);
            queue.remove(0);
        }
        return total / queue.size();
    }
}