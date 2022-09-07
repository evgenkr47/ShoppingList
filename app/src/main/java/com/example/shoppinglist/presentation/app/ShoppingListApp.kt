package com.example.shoppinglist.presentation.app

import android.app.Application
import com.example.shoppinglist.di.DaggerApplicationComponent

class ShoppingListApp: Application() {
     val component by lazy{
        DaggerApplicationComponent.factory().create(this)
    }
}