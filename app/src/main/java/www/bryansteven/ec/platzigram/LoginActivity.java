package www.bryansteven.ec.platzigram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import www.bryansteven.ec.platzigram.Views.ContainerHomeActivity;
import www.bryansteven.ec.platzigram.Views.NewAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goNewAccount(View view){
        Intent i = new Intent(this, NewAccountActivity.class);
        startActivity(i);
    }

    public void goHome(View view){
        Intent i = new Intent(this, ContainerHomeActivity.class);
        startActivity(i);
    }
}
