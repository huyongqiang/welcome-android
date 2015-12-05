package com.stephentuso.welcomeexample;

import android.graphics.Color;

import com.stephentuso.welcome.WelcomeScreenBuilder;
import com.stephentuso.welcome.ui.BackgroundColor;
import com.stephentuso.welcome.util.WelcomeScreenConfiguration;
import com.stephentuso.welcome.ui.WelcomeActivity;

/**
 * Created by stephentuso on 11/15/15.
 */
public class MyWelcomeActivity extends WelcomeActivity{
    @Override
    protected WelcomeScreenConfiguration configuration() {
        return new WelcomeScreenBuilder(this)
                .theme(R.style.CustomWelcomeScreenTheme)
                .defaultBackgroundColor(new BackgroundColor(Color.WHITE))
                .titlePage(R.drawable.periodic_table, "Welcome to\nPeriodic Table")
                .basicPage(R.drawable.periodic_table, "Information at your fingertips", "Easily access formulas, constants, and of course, the 118 elements.")
                .basicPage(R.drawable.periodic_table, "Dynamic", "Tap an element or pinch to zoom in and view basic properties. Tap again to view the full info page.")
                .basicPage(R.drawable.periodic_table, "Customizable", "Choose which properties the table shows, sort the element list, how each element's color is calculated, and more.")
                .canSkip(true)
                .backButtonSkips(false)
                .swipeToDismiss(true)
                .build();
    }
}
