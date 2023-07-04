import classes.Book
import scala.collection.mutable.ListBuffer
import classes.Bookstore
object exercise {
  def main(args: Array[String]): Unit = {
    var book_test1 = Book(new StringBuffer("Somewhere there") , "me" , 20 , 20)
    var Bookstore_test1 = Bookstore(ListBuffer.empty[Book]).addBook(book_test1)
  }
}
