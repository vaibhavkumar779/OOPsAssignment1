package OOPS
import scala.collection.mutable.ListBuffer


//To insert double of an element
class DoubleQueue(queue : ListBuffer[Int]) extends Queue {

  override def enqueue(elementToBePushed: Int): Unit = {

    queue += (elementToBePushed * 2)
  }

}