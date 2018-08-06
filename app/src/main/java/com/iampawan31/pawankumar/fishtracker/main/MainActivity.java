package com.iampawan31.pawankumar.fishtracker.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

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

    @Override
    public void showSignInScreen() {
        Toast.makeText(this, "Taking user to the sign in page", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this, "Taking user to the sign up page", Toast.LENGTH_SHORT).show();
    }
}
