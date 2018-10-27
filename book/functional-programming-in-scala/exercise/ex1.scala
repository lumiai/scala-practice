def fib(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, prev: Int, cur: Int):
        if (n == 0) prev 
        else go(n - 1, cur, prev + cur)
    go(n, 0, 1)
}