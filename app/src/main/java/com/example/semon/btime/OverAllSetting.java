package com.example.semon.btime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class OverAllSetting extends AppCompatActivity {

    String [] noPlayers={"2","3","4","5","6","7","8","9","10"};
    String [] languageSele={"Amharic","English","Both"};

    CardView ok;
    String NoPlayers="3",Langueage="3";
    ArrayAdapter<String> adapter,adapter2;
    Spinner spinner,spinner2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overallsetting_layout);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,noPlayers);
        spinner=(Spinner) findViewById(R.id.NoPeoplePlaying);
        spinner.setAdapter(adapter);

        adapter2=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,languageSele);
        spinner2=(Spinner) findViewById(R.id.LanguageList);
        spinner2.setAdapter(adapter2);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        NoPlayers="2";
                        break;
                    case 1:
                        NoPlayers="3";
                        break;
                    case 2:
                        NoPlayers="4";
                        break;
                    case 3:
                        NoPlayers="5";
                        break;
                    case 4:
                        NoPlayers="6";
                        break;
                    case 5:
                        NoPlayers="7";
                        break;
                    case 6:
                        NoPlayers="8";
                        break;
                    case 7:
                        NoPlayers="9";
                        break;
                    case 8:
                        NoPlayers="10";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        Langueage="1";
                        break;
                    case 1:
                        Langueage="2";
                        break;
                    case 2:
                        Langueage="3";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ok=(CardView) findViewById(R.id.next);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=NoPlayers;
                String lang=Langueage;

                Intent intent=new Intent(OverAllSetting.this,Friends4Ever.class);
                intent.putExtra("noUser",user);
                intent.putExtra("language",lang);
                startActivity(intent);
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (id==android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
