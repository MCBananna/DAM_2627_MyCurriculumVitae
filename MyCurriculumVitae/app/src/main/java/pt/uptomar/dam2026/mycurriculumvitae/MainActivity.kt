package pt.uptomar.dam2026.mycurriculumvitae

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import java.io.Console

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Control button behavior
        findViewById<Button>(R.id.button).setOnClickListener {
            showCV()
        }
    }

    /**
     * Controls the visibility of both the CV and the Name
     */
    fun showCV(){
        val textBox = findViewById<EditText>(R.id.editTextText)
        val name = findViewById<TextView>(R.id.name)
        val cv = findViewById<TextView>(R.id.CV)
        val button = findViewById<Button>(R.id.button)

        if (textBox.text.toString().lowercase() == "yes" || textBox.text.toString().lowercase() == "sim"){
            cv.visibility = View.VISIBLE
            name.visibility = View.VISIBLE
            textBox.visibility = View.GONE
            button.visibility = View.GONE
        }
    }
}