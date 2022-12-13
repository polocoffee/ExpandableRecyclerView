package com.banklannister.expandablerecyclerview.utils

import com.banklannister.expandablerecyclerview.model.MainModel
import com.banklannister.expandablerecyclerview.model.SubItemModel

object SampleData {

    private val flowerList = listOf(
        SubItemModel("Rose"),
        SubItemModel("Daisy"),
        SubItemModel("Lily"),
        SubItemModel("Narcissus"),
        SubItemModel("Lotus"),
        SubItemModel("Jasmine"),
        SubItemModel("Tulip")
    )

    val collectios = listOf(
        MainModel("All Flowers",flowerList),
        MainModel("Want to buy",flowerList.reversed()),
        MainModel("Popular Flowers",flowerList.shuffled()),
    )

}