package com.example.latihan8

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private var userList: List<User>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    inner class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userNameTextView: TextView = itemView.findViewById(R.id.textViewName)
        val userEmailTextView: TextView = itemView.findViewById(R.id.textViewEmail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val currentUser = userList[position]
        holder.userNameTextView.text = currentUser.name
        holder.userEmailTextView.text = currentUser.email // Anda perlu menyesuaikan dengan atribut yang sesuai dari objek User
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    fun setData(users: List<User>) {
        userList = users
        notifyDataSetChanged()
    }
}
