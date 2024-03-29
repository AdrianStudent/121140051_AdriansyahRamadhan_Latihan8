package com.example.latihan8

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.database.User
import com.example.database.UserDao

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}