fun renderProductTable(): String {
    return html {
        table {
            tr(getTitleColor()) {
                td(getCellColor(0, 0)){
                    text("Product")
                }
                td(getCellColor(1, 0)) {
                    text("Price")
                }
                td(getCellColor(2, 0)) {
                    text("Popularity")
                }
            }
            val products = getProducts()
            products.forEachIndexed { index, product ->
                tr(getTitleColor()) {
                    td(getCellColor(0, index + 1)){
                        text(product.description)
                    }
                    td(getCellColor(1, index + 1)) {
                        text(product.price)
                    }
                    td(getCellColor(2, index + 1)) {
                        text(product.popularity)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) % 2 == 0) "#dce4ff" else "#eff2ff"
