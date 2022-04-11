package com.iitp.signage.questionnaire

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.iitp.saltlux_talkbot.Talk
import com.iitp.saltlux_talkbot.Talker
import com.iitp.signage.databinding.ItemChatBotBinding
import com.iitp.signage.databinding.ItemChatUserBinding
import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Inject

private const val VIEW_TYPE_BOT = 0
private const val VIEW_TYPE_USER = 1

@FragmentScoped
class TalkAdapter @Inject constructor() :
    ListAdapter<Talk, RecyclerView.ViewHolder>(TalkDiffCallback()) {

    override fun onCurrentListChanged(
        previousList: MutableList<Talk>,
        currentList: MutableList<Talk>
    ) {
        super.onCurrentListChanged(previousList, currentList)
        if (currentList.size > 1) {
            notifyItemChanged(currentList.lastIndex - 1)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        val isHighlight = position == currentList.lastIndex
        when (holder) {
            is BotViewHolder -> holder.bind(isHighlight, item)
            is UserViewHolder -> holder.bind(isHighlight, item)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (getItem(position).talker) {
            Talker.BOT -> VIEW_TYPE_BOT
            Talker.USER -> VIEW_TYPE_USER
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            VIEW_TYPE_BOT -> BotViewHolder.from(parent)
            VIEW_TYPE_USER -> UserViewHolder.from(parent)
            else -> error("unsupported view type!!")
        }
    }

    class BotViewHolder private constructor(private val binding: ItemChatBotBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(
            isHighlight: Boolean,
            item: Talk
        ) {
            binding.apply {
                text = item.message
                this.isHighlight = isHighlight
                executePendingBindings()
            }
        }

        companion object {
            fun from(parent: ViewGroup): BotViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemChatBotBinding.inflate(layoutInflater, parent, false)
                return BotViewHolder(binding)
            }
        }
    }

    class UserViewHolder private constructor(private val binding: ItemChatUserBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(
            isHighlight: Boolean,
            item: Talk
        ) {
            binding.apply {
                text = item.message
                this.isHighlight = isHighlight
                executePendingBindings()
            }
        }

        companion object {
            fun from(parent: ViewGroup): UserViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemChatUserBinding.inflate(layoutInflater, parent, false)
                return UserViewHolder(binding)
            }
        }
    }

    class TalkDiffCallback : DiffUtil.ItemCallback<Talk>() {
        override fun areItemsTheSame(oldItem: Talk, newItem: Talk): Boolean {
            return oldItem.id == newItem.id && oldItem.talker == newItem.talker
        }

        override fun areContentsTheSame(oldItem: Talk, newItem: Talk): Boolean {
            return oldItem == newItem
        }
    }
}