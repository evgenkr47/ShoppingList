package com.example.shoppinglist.data

import com.example.shoppinglist.domain.ShopItem

class ShopListMapper {
    fun mapEntityToDbModel(shopItem: ShopItem) = ShopItemDbModel(

            id = shopItem.id,
            count = shopItem.count,
            name = shopItem.name,
            enabled = shopItem.enabled

        )

    fun mapDbModelToEntity(shopItemDbModel: ShopItemDbModel) = ShopItem(

            id = shopItemDbModel.id,
            count = shopItemDbModel.count,
            name = shopItemDbModel.name,
            enabled = shopItemDbModel.enabled
        )

    fun mapListDbModelToListEntity(list: List<ShopItemDbModel>) = list.map {
        mapDbModelToEntity(it)
    }
}