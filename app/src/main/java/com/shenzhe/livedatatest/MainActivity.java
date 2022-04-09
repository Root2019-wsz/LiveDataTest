package com.shenzhe.livedatatest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MutableLiveData<String> liveData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        liveData = new MutableLiveData<>();

        liveData.observe(MainActivity.this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.d("over-----",s);
            }
        });
    }
    public void onClick(View view){
        liveData.postValue("1111111");
    }
}