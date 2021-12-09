package OOPS
import scala.collection.mutable.ListBuffer

//To insert Square of an element
class SquareQueue(queue: ListBuffer[Int]) extends Queue {

  override def enqueue(elementToBePushed: Int): Unit = {

    queue += (elementToBePushed * elementToBePushed)
  }
}