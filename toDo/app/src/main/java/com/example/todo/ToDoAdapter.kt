package com.example.todo

import android.graphics.Paint.STRIKE_THRU_TEXT_FLAG
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import android.widget.CheckBox

class ToDoAdapter(private val tasksToDo: MutableList<Task>) : RecyclerView.Adapter<ToDoAdapter.TaskViewHolder>() {

    inner class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTaskToDo: TextView = itemView.findViewById(R.id.tvTaskToDo)
        val cbCompleted: CheckBox = itemView.findViewById(R.id.cbCompleted)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.task_to_do, parent, false)
        return TaskViewHolder(view)
    }

    fun addTodo(task: Task){
        tasksToDo.add(task)
        notifyItemInserted(tasksToDo.size-1)
    }

    fun deleteFinishedTask(){
        tasksToDo.removeAll{
            task ->
            task.isChecked
        }
        notifyDataSetChanged()
    }

    private fun toggleStrikeThrough(tvTaskToDo: TextView, isChecked: Boolean){
        if (isChecked) {
            tvTaskToDo.paintFlags = tvTaskToDo.paintFlags or STRIKE_THRU_TEXT_FLAG
        } else {
            tvTaskToDo.paintFlags = tvTaskToDo.paintFlags and STRIKE_THRU_TEXT_FLAG.inv()
        }
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val curTask = tasksToDo[position]
        holder.tvTaskToDo.text = curTask.title
        holder.cbCompleted.isChecked = curTask.isChecked
        toggleStrikeThrough(holder.tvTaskToDo, curTask.isChecked)
        holder.cbCompleted.setOnCheckedChangeListener { _, isChecked ->
            toggleStrikeThrough(holder.tvTaskToDo, isChecked)
            curTask.isChecked = !curTask.isChecked
        }
    }

    override fun getItemCount(): Int {
        return tasksToDo.size
    }
}
