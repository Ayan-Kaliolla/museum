package kz.kaliolla.museum.activivty;

import android.content.Intent;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

import butterknife.BindView;
import butterknife.ButterKnife;
import kz.kaliolla.museum.R;


public class SplashScreenActivity extends AppCompatActivity {
    @BindView(R.id.root)
    ConstraintLayout root;
    @BindView(R.id.logo)
    View logo;
    @BindView(R.id.welcome_text)
    View welcomeText;
    @BindView(R.id.progress)
    View progress;
    @BindView(R.id.year)
    View year;

    private FastOutSlowInInterpolator fastOutSlowInInterpolator = new FastOutSlowInInterpolator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        ButterKnife.bind(this);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                next();
            }
        }, 5000);
    }

    private void next() {
        startActivity(new Intent(this, QRActivity.class));
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        startAnimation(true);
    }

    private void startAnimation(boolean show) {
        Animation alphaAnimation;
        if (show) {
            alphaAnimation = new AlphaAnimation(0, 1f);
        } else {
            alphaAnimation = new AlphaAnimation(1f, 0);
        }
        alphaAnimation.setInterpolator(fastOutSlowInInterpolator);
        alphaAnimation.setDuration(1000);
        alphaAnimation.setFillAfter(true);

        logo.startAnimation(alphaAnimation);
        welcomeText.startAnimation(alphaAnimation);
        progress.startAnimation(alphaAnimation);
        year.startAnimation(alphaAnimation);
    }
}