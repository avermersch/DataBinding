package com.example.formation.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.formation.databinding.databinding.ActivityConverterBinding;
import com.example.formation.databinding.databinding.ActivityMainBinding;

public class ConverterActivity extends AppCompatActivity {

    private Converter myvalue;
    private ActivityConverterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        myvalue = new Converter("5");

        binding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_converter);

        binding.setConverter(myvalue);
    }

}
