// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> {
    val allOrderedProducts = this.customers.flatMap {
        it.getOrderedProducts() }.toSet()
    return this.customers.fold(allOrderedProducts){
        productsOrderedByAll, customer -> productsOrderedByAll.
            intersect(customer.getOrderedProducts()).toSet()
    }
}

fun Customer.getOrderedProducts(): List<Product> =
        this.orders.flatMap { it.products }