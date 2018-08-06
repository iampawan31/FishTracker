package com.iampawan31.pawankumar.fishtracker.main;

public class MainPresenter implements MainContract.Presenter {
    private MainContract.View view;

    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void handleSignInButtonClick() {
        view.showSignInScreen();
    }

    @Override
    public void handleSignUpButtonClick() {
        view.showSignUpScreen();
    }
}
