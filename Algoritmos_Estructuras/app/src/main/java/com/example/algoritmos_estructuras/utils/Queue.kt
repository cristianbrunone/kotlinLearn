package com.example.algoritmos_estructuras.utils

class Queue<T> {
    private val elements: MutableList<T> = mutableListOf()
    fun enqueue(item: T) = elements.add(item)
    fun dequeue(): T? = if (isEmpty()) null else elements.removeAt(0)
    fun peek(): T? = elements.firstOrNull()
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size
}