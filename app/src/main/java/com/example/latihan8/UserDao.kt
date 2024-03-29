package com.example.latihan8

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.database.User

@Dao
interface UserDao {
    @Query("SELECT * FROM users")
    fun getAllUsers(): List<User>

    @Insert
    fun insertUser(user: User)
}