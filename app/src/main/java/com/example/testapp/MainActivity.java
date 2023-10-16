package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.testapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button2.setOnClickListener(view -> nextActivity());
    }public  void nextActivity(){
        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("TEXT",binding.editText.getText().toString());
        startActivity(intent);
    }
}