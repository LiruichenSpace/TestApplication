package com.li002.testapplication.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.li002.testapplication.feature.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    static public String trans_message="com.li002.TestApplication.transmessage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        Log.d("MainActivity:", "onCreate() ");
        Button button=(Button)findViewById(R.id.main_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CallActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        TextView textView=findViewById(R.id.main_edit_message);
        textView.setText("");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int i = item.getItemId();
        if (i == R.id.setting_item) {
            Intent intent=new Intent(MainActivity.this,Settings.class);
            startActivityForResult(intent,1);
        } else if (i == R.id.help_item) {
           Intent intent=new Intent(MainActivity.this,ListTest.class);
           startActivity(intent);
        } else {
            return false;
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:{
                if(resultCode==RESULT_OK){String string = data.getStringExtra("back_message");
                Toast toast = new Toast(this);
                if(!string.isEmpty())
                toast.makeText(this, string, Toast.LENGTH_SHORT).show();
                Log.d("onActivityResult: ", string);}
            }break;
            default:
        }
    }
}
