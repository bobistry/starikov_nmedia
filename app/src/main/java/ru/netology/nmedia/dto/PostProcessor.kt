package ru.netology.nmedia.dto

object PostProcessor {
    fun processQuantity(qty: Int) = when {
        qty < 1_000 -> qty.toString()
        qty < 10_000 -> (qty / 1_000).toString() + "." + (qty % 1000 / 100).toString() + "K"
        qty < 100_000 -> (qty / 1_000).toString() + "K"
        qty < 1_000_000 ->  (qty / 1_000_000).toString() + "." + (qty % 1_000_000 / 100_000).toString() + "M"
        else -> (qty / 1_000_000).toString() + "M"
    }
}
