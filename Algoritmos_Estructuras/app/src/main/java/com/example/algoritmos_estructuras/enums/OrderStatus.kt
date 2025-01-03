package com.example.algoritmos_estructuras.enums

sealed class OrderStatus() {
    object Pending : OrderStatus()
    object Processing : OrderStatus()
    object Delivered : OrderStatus()
    object Cancelled : OrderStatus()
}
