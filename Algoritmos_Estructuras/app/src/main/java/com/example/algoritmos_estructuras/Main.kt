package com.example.algoritmos_estructuras

import com.example.algoritmos_estructuras.enums.OrderStatus
import com.example.algoritmos_estructuras.models.Order
import com.example.algoritmos_estructuras.models.Product
import com.example.algoritmos_estructuras.services.OrderService

fun main() {
    val orderService = OrderService()

    // Crear productos
    val product1 = Product("1", "Laptop", 1000.0)
    val product2 = Product("2", "Mouse", 50.0)

    // Crear pedidos
    val order1 = Order("101", listOf(product1, product2), OrderStatus.Pending)
    val order2 = Order("102", listOf(product1), OrderStatus.Pending)

    // Agregar pedidos
    orderService.placeOrder(order1)
    orderService.placeOrder(order2)

    // Procesar pedidos
    orderService.processNextOrder()
    orderService.listOrders()
}