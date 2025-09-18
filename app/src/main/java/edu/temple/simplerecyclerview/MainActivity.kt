package edu.temple.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val displayNumView = findViewByID<TextView>(R.id.numDisplay)

        val numArray = Array(50){i + 1}

        with (recyclerView){

            adapter = NumberDisplayAdapter(this@MainActivity, numArray)

            onItemSelectedListener = object : OnItemSelectedListener {
                override fun onItemSelected(parent : RecyclerView<*>, view: View?, position: Int, id: Long) {
                    parent?.run {
                        RecyclerView.textSize = getItemAtPosition(position).toString().toFloat()
                    }
                }

                override fun
            }
        }


        override fun LayoutManager(parent: RecyclerView)


        //TODO Step 4: Provide a RecyclerView.Adapter
        numArray(RecyclerView.Adapter<Int>: numArray)
    }
}