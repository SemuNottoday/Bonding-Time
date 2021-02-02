package com.example.semon.btime;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

import android.app.AlertDialog;
public class MainActivity extends AppCompatActivity {

    CardView talk,order,playlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        talk=(CardView) findViewById(R.id.btnfriends);
        talk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,OverAllSetting.class);
                startActivity(intent);
            }
        });
        order=(CardView) findViewById(R.id.btntizaze);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,WWRather.class);
                startActivity(intent);
            }
        });
    }
/*

    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(R.string.app_name);
        builder.setIcon(R.drawable.cover);
        builder.setMessage("Do You Want to Exit?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert=builder.create();
        alert.show();
    }
*/
}
