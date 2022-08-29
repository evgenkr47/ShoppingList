package com.example.shoppinglist.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ShopItemDbModel::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
    abstract fun getShopListDao(): ShopListDao
    companion object{
        private var database: AppDatabase ?= null
        private const val DB_NAME = "db"
        @Synchronized
        fun getInstance(context: Context): AppDatabase{
            return if (database == null){
                database = Room.databaseBuilder(context, AppDatabase::class.java, DB_NAME).build()
                database as AppDatabase
            }
            else{
                database as AppDatabase
            }
        }
    }
}