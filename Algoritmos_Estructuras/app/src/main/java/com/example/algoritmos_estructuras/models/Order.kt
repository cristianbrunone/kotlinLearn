package com.example.algoritmos_estructuras.models

import com.example.algoritmos_estructuras.enums.OrderStatus


data class Order(
    val orderId: String,
    val products: List<Product>,
    var status: OrderStatus
) {
    fun calculateTotal(): Double = products.sumOf { it.price }
}