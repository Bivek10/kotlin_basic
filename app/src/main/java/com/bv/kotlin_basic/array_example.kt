package com.bv.kotlin_basic


class Product( var id:Int, var quantity:Int, var price:Double)



interface  CartContract{
    fun addToCart(product: Product)
    fun removeFromCart(product: Product)
    fun updateToCart(product: Product)
    fun generateInvoice()
}

class Cart:CartContract
    var products:MutableList<Product> = mutableListOf()

    override fun addToCart(product: Product) {
        products.add(product);
    }

    override fun removeFromCart(product: Product) {

        val isPresent:Product ?= products.find { it.id == product.id }
        if (isPresent != null){
            products.remove(isPresent)
        }
    }

    override fun updateToCart(product: Product) {
        products.find {
            it.id == product.id
        }.apply {
            this?.quantity = product.quantity
            this?.price = product.price
        }

    }

    override fun generateInvoice() {
        TODO("Not yet implemented")
    }

}