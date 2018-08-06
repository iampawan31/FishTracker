package com.iampawan31.pawankumar.fishtracker.main;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class MainPresenterTest {
    @Mock
    private MainContract.View view;

    private MainPresenter presenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        presenter = new MainPresenter(view);
    }

    @Test
    public void handleSignInButtonClick() {
        presenter.handleSignInButtonClick();
        verify(view).showSignInScreen();
    }

    @Test
    public void handleSignUpButtonClick() {
        presenter.handleSignUpButtonClick();
        verify(view).showSignUpScreen();
    }
}