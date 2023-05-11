package com.example.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var todoAdapter: ToDoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        todoAdapter = ToDoAdapter(mutableListOf())
        rvToDoTasks.adapter = todoAdapter
        rvToDoTasks.layoutManager = LinearLayoutManager(this)

        btAddTask.setOnClickListener{
            val todoTitle = etToDoTaskName.text.toString()
            if(todoTitle.isNotEmpty()){
                val todo = Task(todoTitle, false)
                todoAdapter.addTodo(todo)
                etToDoTaskName.text.clear()
            }
        }

        btDeleteTask.setOnClickListener {
            todoAdapter.deleteFinishedTask()
        }
    }
}
