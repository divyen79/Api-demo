package com.invitationmaker.lss.apidemo

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private val context: Context, private val users: List<User>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    inner class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTV: TextView = view.findViewById(R.id.nameTV)
        val usernameTV: TextView = view.findViewById(R.id.usernameTV)

        init {
            view.setOnClickListener {
                val user = users[adapterPosition]
                val intent = Intent(context, UserDetailsActivity::class.java)
                intent.putExtra("name", user.name)
                intent.putExtra("username", user.username)
                intent.putExtra("email", user.email)
                intent.putExtra("phone", user.phone)
                intent.putExtra("website", user.website)
                context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = users[position]
        holder.nameTV.text = user.name
        holder.usernameTV.text = user.username
    }
}

