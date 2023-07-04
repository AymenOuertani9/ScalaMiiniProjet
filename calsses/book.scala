package classes
class Book(
    var title: StringBuffer,
    var author: String,
    var price: Double,
    var quantity: Int
) {

  def gettitle(): StringBuffer = {
    return title
  }
  def settitle(titleSet: StringBuffer): Unit = {
    title = titleSet
  }

  def setauthor(authorSet: String): Unit = {
    author = authorSet;
  }
  def getauthor(): String = {
    return author
  }

  def setprice(priceSet: Double): Unit = {
    price = priceSet;
  }
  def getprice(): Double = {
    return price
  }

  def setquantity(quantitySet: Int): Unit = {
    quantity = quantitySet;
  }
  def getquantity(): Int = {
    return quantity
  }

  def calculateTotalPrice(quantity: Int): Double = {
    return price * quantity
  }
}
