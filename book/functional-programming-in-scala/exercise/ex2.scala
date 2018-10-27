@annotation.tailrec
def isSorted[A](as: Array[A], gt: (A, A) => Boolean): Boolean = {
    if (as.length == 1) true
    else if (gt(as(0),as(1))) false
    else isSorted(as.takeRight(as.length - 1), gt)

}