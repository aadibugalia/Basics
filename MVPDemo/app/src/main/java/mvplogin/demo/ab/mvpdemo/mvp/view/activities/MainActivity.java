package mvplogin.demo.ab.mvpdemo.mvp.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mvplogin.demo.ab.mvpdemo.R;
import mvplogin.demo.ab.mvpdemo.mvp.view.fragments.login.LoginFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onResume() {
        super.onResume();
        getSupportFragmentManager().beginTransaction().add(R.id.container, new LoginFragment()).commit();
    }
}
