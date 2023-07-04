package classes
import scala.collection.mutable.ListBuffer

class OrderHistory(
    orders : ListBuffer[Order]
){
    def addOrder(order: Order): Unit = {
        orders += order
    }

    def getTotalRevenue(): Double = {
        var total_revenu : Double = 0
        orders.foreach(total_revenu += _.book.price)
        return total_revenu
    }

    def getMostExpensiveOrder(): Order = {
        var orders_totals = ListBuffer.empty[(Order,Double)]
        orders.foreach(element=>{
            var order_total : Double = element.calculateOrderTotal()
            var tuple = (element , order_total)
            orders_totals += tuple
        }
        )
        print(orders_totals)
        return orders_totals(0)._1
    }

    def printOrderDetails(order: Order): Unit = {
        print("order of " + order.customer.name + " placed on " + order.orderDate + " with total price of " + order.calculateOrderTotal()  )
    }
}