package com.iampawan31.pawankumar.fishtracker.main;

public interface MainContract {
    interface Presenter {
        void handleSignInButtonClick();
        void handleSignUpButtonClick();
    }

    interface View {
        void showSignInScreen();
        void showSignUpScreen();
    }
}
