package com.example.algoritmos_estructuras.services

import com.example.algoritmos_estructuras.enums.OrderStatus
import com.example.algoritmos_estructuras.models.Order
import com.example.algoritmos_estructuras.utils.Queue


class OrderService {
    private val ordersQueue = Queue<Order>()
    private val orderHistory = mutableMapOf<String, Order>()

    fun placeOrder(order: Order) {
        ordersQueue.enqueue(order)
        orderHistory[order.orderId] = order
    }

    fun processNextOrder() {
        val order = ordersQueue.dequeue()
        order?.let {
            it.status = OrderStatus.Processing
            println("Processing order ${it.orderId}")
        } ?: println("No orders to process")
    }

    fun listOrders() {
        orderHistory.values.forEach {
            println("OrderID: ${it.orderId}, Status: ${it.status}, Total: ${it.calculateTotal()}")
        }
    }
}