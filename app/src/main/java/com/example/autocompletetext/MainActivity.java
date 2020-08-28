package com.example.autocompletetext;

import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String[] data = new String[] {
            "python", "perl", "php", "java", "swift","c++","c","c#","javascript","ruby","eudora"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView autoCompleteTextView=findViewById(R.id.search);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_checked,data);
        autoCompleteTextView.setAdapter(adapter);
        MultiAutoCompleteTextView multiAutoCompleteTextView=findViewById(R.id.search1);
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,data);
        multiAutoCompleteTextView.setAdapter(adapter1);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
