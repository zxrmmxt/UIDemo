package stee_lmate.com.uidemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //继承View的自定义控件方式
    public void customizeView(View view){
        startActivity(new Intent(this,CustomizeViewActivity.class));
    }
}
