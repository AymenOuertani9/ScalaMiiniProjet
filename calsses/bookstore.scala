package classes
import scala.collection.mutable.ListBuffer

class Bookstore(var books: ListBuffer[Book]) {
    def addBook(book: Book) : Unit = {
        books += book
    }
    def removeBook(book: Book): Unit = {
        var index : Int = -1
        index = books.indexOf(book)
        if index != -1 then {
            books.drop(index)
        }
    }

    def searchByAuthor(author: String): List[Book] = {
        return books.find(item => item.author == author).toList
    }

    def searchByTitle(title: String): List[Book] = {
        return books.find(item => item.getauthor() == title).toList
    }

    def placeOrder(customer: Customer, book: Book, quantity: Int): Order = {
        var order = Order("order-22" , customer , book , java.time.LocalDate.now.toString())
        return order
    }
}
