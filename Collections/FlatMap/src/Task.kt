// Return all products the given customer has ordered
fun Customer.getOrderedProducts(): List<Product> =
        orders.flatMap {  }

// Return all products that were ordered by at least one customer
fun Shop.getOrderedProducts(): Set<Product> =
        TODO()
