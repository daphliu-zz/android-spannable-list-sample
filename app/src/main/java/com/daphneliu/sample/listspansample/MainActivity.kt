package com.daphneliu.sample.listspansample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.list)
        textView.text = StringUtils.fromHtml(HTML)
    }

    companion object {
        private val HTML = """
            <ul>
                <li>Item 1</li>
                <li>Item 2</li>
                <li>Item 3
                    <ol>
                        <li>Nested item 1</li>
                        <li>Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
                        Nulla et tellus eu magna facilisis eleifend. Vestibulum faucibus pulvinar tincidunt. 
                        Nullam non mauris nisi.</li>
                    </ol>
                </li>
                <li>Item 4</li>
                <li>Item 5
                    <ol>
                        <li>Nested item 1</li>
                        <li>Nested item 2
                            <ol>
                                <li>Double nested item 1</li>
                                <li>Double nested item 2</li>
                            </ol>
                        </li>
                        <li>Nested item 3</li>
                    </ol>
                </li>
                <li>Item 6</li>
            </ul>
        """.trimIndent()
    }
}
