package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bmi.adapter.AdapterOldStatus;
import com.example.bmi.model.OldStatues;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    RecyclerView list;
    AdapterOldStatus adapter;
    Button btn_add_record;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        list = findViewById(R.id.list);
        btn_add_record = findViewById(R.id.btn_add_record);

        ArrayList<OldStatues> models = new ArrayList<>();
        models.add(new OldStatues("20/1/2020","60 Kg","170 Cm"));
        models.add(new OldStatues("20/1/2020","60 Kg","170 Cm"));
        models.add(new OldStatues("20/1/2020","60 Kg","170 Cm"));
        list.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AdapterOldStatus(models, this);
        list.setAdapter(adapter);

        btn_add_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AddRecordActivity.class);
                startActivity(intent);
            }
        });


    }
}