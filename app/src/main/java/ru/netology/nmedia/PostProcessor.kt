package ru.netology.nmedia

object PostProcessor {
    fun processQuantity(qty: Int): String {
        if (qty < 1_000) return qty.toString()
        else if (qty < 10_000) return (qty / 1_000).toString() + "." + (qty % 1000 / 100).toString() + "K"
        else if (qty < 100_000) return (qty / 1_000).toString() + "K"
        else if (qty < 1_000_000) return (qty / 1_000_000).toString() + "." + (qty % 1_000_000 / 100_000).toString() + "M"
        else return (qty / 1_000_000).toString() + "M"
    }
}
