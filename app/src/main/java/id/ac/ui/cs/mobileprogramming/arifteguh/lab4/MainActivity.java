package id.ac.ui.cs.mobileprogramming.arifteguh.lab4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    Fragment1 fragment1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = new Fragment1();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.mainLayout, fragment1)
                .commit();
    }

    @Override
    public void onBackPressed(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.mainLayout, fragment1);
        transaction.commit();
    }

}