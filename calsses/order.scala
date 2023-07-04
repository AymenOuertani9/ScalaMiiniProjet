package classes
class Order(
    var orderId: String,
    var customer: Customer,
    var book: Book,
    var orderDate: String
) {

  
  def setorderId(orderIdSet: String): Unit = {
    orderId = orderIdSet;
  }
  def getorderId(): String = {
    return orderId
  }

  def setcustomer(customerSet: Customer): Unit = {
    customer = customerSet;
  }
  def getcustomer(): Customer = {
    return customer
  }

  def setbook(bookSet: Book): Unit = {
    book = bookSet;
  }
  def getbook(): Book = {
    return book
  }

  def setorderDate(orderDateSet: String): Unit = {
    orderDate = orderDateSet;
  }
  def getorderDate(): String = {
    return orderDate
  }

  def calculateOrderTotal(): Double = {
    return book.getprice() * book.quantity
  }
}
