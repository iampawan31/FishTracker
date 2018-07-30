package com.iampawan31.pawankumar.fishtracker.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.iampawan31.pawankumar.fishtracker.R;
import com.iampawan31.pawankumar.fishtracker.main.MainContract.Presenter;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);
    }
}
