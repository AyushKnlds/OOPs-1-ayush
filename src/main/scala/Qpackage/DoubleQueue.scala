package Qpackage

import scala.collection.immutable.Queue

class DoubleQueue extends QQu
{
  override def Enque(): Unit =
  {
    println("elements in the queue:");
    var queue = Queue(7, 14, 21, 28, 35);
    queue.foreach{(element:Int) => print((element) + " ")}
    println();
    println("Enqueues the Element After Doubling Them:");
    queue.foreach{(element:Int) => print((element*2) + " ")}
    println();
    println("First Element  after Enqueuing is: " + (queue.front)*2);
    var dq = queue.dequeue;
    println("Dequeued First Element From Queue: " + dq)

  }

}
