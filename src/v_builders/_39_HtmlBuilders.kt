package v_builders

import util.TODO
import util.doc39
import v_builders.data.Product
import v_builders.data.getProducts
import v_builders.htmlLibrary.*

fun getTitleColor() = "#b9c9fe"
fun getCellColor(row: Int, column: Int) = if ((row + column) % 2 == 0) "#dce4ff" else "#eff2ff"

fun todoTask39(): Nothing = TODO(
        """
        Task 39.
        1) Fill the table with the proper values from products.
        2) Color the table like a chess board (using getTitleColor() and getCellColor() functions above).
        Pass a color as an argument to functions 'tr', 'td'.
        You can run the 'Html Demo' configuration in IntelliJ IDEA to see the rendered table.
    """,
        documentation = doc39()
)

fun renderProductTable(): String {
    return html {
        table {
            tr(getTitleColor(), {

                td(getCellColor(0, 0), "left", {
                    text("Product")
                })
                td(getCellColor(0, 1), "left", {
                    getTitleColor()
                    text("Price")
                })
                td(getCellColor(0, 2), "left", {
                    getTitleColor()
                    text("Popularity")
                })


            })
            for ( (index, value) in getProducts().withIndex()) {
                tr {
                    td(getCellColor(index+1, 0), "left", { text(value.description) })
                    td(getCellColor(index+1, 1), "left", { text(value.price) })
                    td(getCellColor(index+1, 2), "left", { text(value.popularity) })
                }
            }
        }
    }.toString()
}
