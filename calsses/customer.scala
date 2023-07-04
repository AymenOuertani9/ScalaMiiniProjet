package classes
class Customer(
    var customerId: String,
    var name: String,
    var email: String
) {
  def setcustomerId(customerIdSet: String): Unit = {
    customerId = customerIdSet;
  }
  def getcustomerId(): String = {
    return customerId
  }

  def setname(nameSet: String): Unit = {
    name = nameSet;
  }
  def getname(): String = {
    return name
  }

  def setemail(emailSet: String): Unit = {
    email = emailSet;
  }
  def getemail(): String = {
    return email
  }

  def placeOrder(book: Book, quantity: Int): Unit = {
    book.quantity = book.quantity - quantity
  }
}
