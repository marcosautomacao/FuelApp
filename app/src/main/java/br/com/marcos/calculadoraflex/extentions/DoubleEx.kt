package br.com.marcos.calculadoraflex.extentions

fun Double.format(digits: Int) =
    java.lang.String.format("%.${digits}f", this)