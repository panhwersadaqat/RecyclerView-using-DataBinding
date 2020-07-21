package com.thefuturestic.recyclerviewdatabinding;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.thefuturestic.recyclerviewdatabinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.recyclerView.setLayoutManager(linearLayoutManager);

        populateData();
    }

    private void populateData() {
        List<DataModel> dataModelList = new ArrayList<>();

        dataModelList.add(new DataModel("sample one", "1"));
        dataModelList.add(new DataModel("sample two", "2"));
        dataModelList.add(new DataModel("sample three", "3"));
        dataModelList.add(new DataModel("sample four", "4"));
        dataModelList.add(new DataModel("sample five", "5"));

        binding.recyclerView.setAdapter(new MyRecyclerViewAdapter(dataModelList, this));
    }
}
