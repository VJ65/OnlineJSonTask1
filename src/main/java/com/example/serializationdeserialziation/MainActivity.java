package com.example.serializationdeserialziation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson=new Gson();




        String json= "{\"first_Name\":\"Hamda\",\"age\":18,\"mail\":\"hamdaafzal54@gmail.com\"}";

        Students students= gson.fromJson(json,Students.class);



    }
}
