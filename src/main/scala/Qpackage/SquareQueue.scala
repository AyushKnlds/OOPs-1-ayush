package Qpackage

import scala.collection.immutable.Queue

private class SquareQueue extends QQu
{
  override  def Enque(): Unit =
  {
    println("Elements in the Queue Are:");
    var queue = Queue(9, 18, 27, 36, 45);
    queue.foreach{(element:Int) => print((element) + " ")}
    println();
    println("Enqueues the Element After Squaring Them:");
    queue.foreach{(element:Int) => print((element*element) + " ")}
    println();
    println("First Element after Enqueuing is: " + (queue.front)*(queue.front));
    var dq = queue.dequeue;
    println("Dequeued First Element From Queue: " + dq);
  }

}
