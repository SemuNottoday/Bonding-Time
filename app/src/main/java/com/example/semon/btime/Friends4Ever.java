package com.example.semon.btime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

public class Friends4Ever extends AppCompatActivity {

    Button next;
    TextView displayEnglish,displayAmharic,playerdisplay;
    int player=0;
    ArrayList<Integer> holder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends4_ever);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent=getIntent();
        String NoUser=intent.getStringExtra("noUser");
        String Language=intent.getStringExtra("language");
        final int noUser=Integer.parseInt(NoUser);
        final int lan=Integer.parseInt(Language);/*
        indexdisplay=(TextView) findViewById(R.id.indexDisplay);*/
        displayEnglish=(TextView) findViewById(R.id.textdisplayEnglish);
        displayAmharic=(TextView) findViewById(R.id.textdisplayAmharic);
        playerdisplay=(TextView) findViewById(R.id.playerdisplay);
        holder=new ArrayList<Integer>();

        next=(Button) findViewById(R.id.btnnext);
        final Random random=new Random();

        final int[] questionsEnglish={R.string.one2,R.string.one3,R.string.one4,
                R.string.one5,R.string.one6,R.string.one7,R.string.one8,
                R.string.one9,R.string.one10,R.string.one11,R.string.one12,
                R.string.one13,R.string.one14,R.string.one15,R.string.one16,
                R.string.one17,R.string.one18,R.string.one19,R.string.one20,
                R.string.one21,R.string.one22,R.string.one23,R.string.one24,
                R.string.one25,R.string.one26,R.string.one27,R.string.one28,
                R.string.one29,R.string.one30,R.string.one31,R.string.one32,
                R.string.one33,R.string.one34,R.string.one35,R.string.one36,
                R.string.one37,R.string.one38,R.string.one39,R.string.one40,
                R.string.one41,R.string.one42,R.string.one43,R.string.one44,
                R.string.one45,R.string.one46,R.string.one47,R.string.one48,
                R.string.one49,R.string.one50,R.string.one51,R.string.one52,
                R.string.one53,R.string.one54,R.string.one55,R.string.one56,
                R.string.one57,R.string.one58,R.string.one59,R.string.one60,
                R.string.one61,R.string.one62,R.string.one63,R.string.one64,
                R.string.one65,R.string.one66,R.string.one67,R.string.one68,
                R.string.one69,R.string.one70,R.string.one71,R.string.one72,
                R.string.one73,R.string.one74,R.string.one75,R.string.one76,
                R.string.one77,R.string.one78,R.string.one79,R.string.one80,
                R.string.one81,R.string.one82,R.string.one83,R.string.one84,
                R.string.one85,R.string.one86,R.string.one87,R.string.one88,
                R.string.one89,R.string.one90,R.string.one91,R.string.one92,
                R.string.one93,R.string.one94,R.string.one95,R.string.one96,
                R.string.one97,R.string.one98,R.string.one99,R.string.one100,
                R.string.one101,R.string.one102,R.string.one103,R.string.one104,
                R.string.one103,R.string.one104,R.string.one105,R.string.one106,
                R.string.one107,R.string.one108,R.string.one109,R.string.one110,
                R.string.one113,R.string.one112,R.string.one113,R.string.one114,
                R.string.one115,R.string.one116,R.string.one117,R.string.one118,
                R.string.one119,R.string.one120,R.string.one121,R.string.one122,
                R.string.one123,R.string.one124,R.string.one125,R.string.one126,
                R.string.one127,R.string.one128,R.string.one129,R.string.one130,
                R.string.one131,R.string.one132,R.string.one133,R.string.one134,
                R.string.one135,R.string.one136,R.string.one137,R.string.one138,
                R.string.one139,R.string.one140,R.string.one141,R.string.one142,
                R.string.one143,R.string.one144,R.string.one145,R.string.one146,
                R.string.one147,R.string.one148,R.string.one149,R.string.one150,
                R.string.one151,R.string.one152,R.string.one153,R.string.one154,
                R.string.one155,R.string.one156,R.string.one157,R.string.one158,
                R.string.one159,R.string.one160,R.string.one161,R.string.one162,
                R.string.one163,R.string.one164,R.string.one165,R.string.one166,
                R.string.one167,R.string.one168,R.string.one169,R.string.one170,
                R.string.one171,R.string.one172,R.string.one173,R.string.one174,
                R.string.one175,R.string.one176,R.string.one177,R.string.one178,
                R.string.one179,R.string.one180,R.string.one181,R.string.one182,
                R.string.one183,R.string.one184,R.string.one185,R.string.one186,
                R.string.one187,R.string.one188,R.string.one189,R.string.one190,
                R.string.one191,R.string.one192,R.string.one193,R.string.one194,
                R.string.one195,R.string.one196,R.string.one197,R.string.one198,
                R.string.one199,R.string.one200,R.string.one201,R.string.one202,
                R.string.one203,R.string.one204,R.string.one205,R.string.one206,
                R.string.one207,R.string.one208,R.string.one209,R.string.one210,
                R.string.one211,R.string.one212,R.string.one213,R.string.one214,
                R.string.one215,R.string.one216,R.string.one217,R.string.one218,
                R.string.one219,R.string.one220,R.string.one221,R.string.one222,
                R.string.one223,R.string.one224,R.string.one225,R.string.one226,
                R.string.one227,R.string.one228,R.string.one229,R.string.one230,
                R.string.one231,R.string.one232,R.string.one233,R.string.one234,
                R.string.one235,R.string.one236,R.string.one237,R.string.one238,
                R.string.one239,R.string.one240,R.string.one241,R.string.one242,
                R.string.one243,R.string.one244,R.string.one245,R.string.one246,
                R.string.one247,R.string.one248,R.string.one249,R.string.one250,
                R.string.one251,R.string.one252,R.string.one253,R.string.one254,
                R.string.one255,R.string.one256,R.string.one257,R.string.one258,

                R.string.one259,R.string.one260,R.string.one261,R.string.one262,
                R.string.one263,R.string.one264,R.string.one265,R.string.one266,
                R.string.one267,R.string.one268,R.string.one269,R.string.one270,
                R.string.one271,R.string.one272,R.string.one273,R.string.one274,
                R.string.one275,R.string.one276,R.string.one27,R.string.one278,
                R.string.one279,R.string.one280,R.string.one281,R.string.one282,
                R.string.one283,R.string.one284,R.string.one285,R.string.one286,
                R.string.one287,R.string.one288,R.string.one289,R.string.one290,
                R.string.one291,R.string.one292,R.string.one293,R.string.one294,
                R.string.one295,R.string.one296,R.string.one297,R.string.one298,
                R.string.one299,R.string.one300,R.string.one301};
        final int[] questionsAmharic={R.string.two2,R.string.two3,R.string.two4,
                R.string.two5,R.string.two6,R.string.two7,R.string.two8,
                R.string.two9,R.string.two10,R.string.two11,R.string.two12,
                R.string.two13,R.string.two14,R.string.two15,R.string.two16,
                R.string.two17,R.string.two18,R.string.two19,R.string.two20,
                R.string.two21,R.string.two22,R.string.two23,R.string.two24,
                R.string.two25,R.string.two26,R.string.two27,R.string.two28,
                R.string.two29,R.string.two30,R.string.two31,R.string.two32,
                R.string.two33,R.string.two34,R.string.two35,R.string.two36,
                R.string.two37,R.string.two38,R.string.two39,R.string.two40,
                R.string.two41,R.string.two42,R.string.two43,R.string.two44,
                R.string.two45,R.string.two46,R.string.two47,R.string.two48,
                R.string.two49,R.string.two50,R.string.two51,R.string.two52,
                R.string.two53,R.string.two54,R.string.two55,R.string.two56,
                R.string.two57,R.string.two58,R.string.two59,R.string.two60,
                R.string.two61,R.string.two62,R.string.two63,R.string.two64,
                R.string.two65,R.string.two66,R.string.two67,R.string.two68,
                R.string.two69,R.string.two70,R.string.two71,R.string.two72,
                R.string.two73,R.string.two74,R.string.two75,R.string.two76,
                R.string.two77,R.string.two78,R.string.two79,R.string.two80,
                R.string.two81,R.string.two82,R.string.two83,R.string.two84,
                R.string.two85,R.string.two86,R.string.two87,R.string.two88,
                R.string.two89,R.string.two90,R.string.two91,R.string.two92,
                R.string.two93,R.string.two94,R.string.two95,R.string.two96,
                R.string.two97,R.string.two98,R.string.two99,R.string.two100,
                R.string.two101,R.string.two102,R.string.two103,R.string.two104,
                R.string.two103,R.string.two104,R.string.two105,R.string.two106,
                R.string.two107,R.string.two108,R.string.two109,R.string.two110,
                R.string.two113,R.string.two112,R.string.two113,R.string.two114,
                R.string.two115,R.string.two116,R.string.two117,R.string.two118,
                R.string.two119,R.string.two120,R.string.two121,R.string.two122,
                R.string.two123,R.string.two124,R.string.two125,R.string.two126,
                R.string.two127,R.string.two128,R.string.two129,R.string.two130,
                R.string.two131,R.string.two132,R.string.two133,R.string.two134,
                R.string.two135,R.string.two136,R.string.two137,R.string.two138,
                R.string.two139,R.string.two140,R.string.two141,R.string.two142,
                R.string.two143,R.string.two144,R.string.two145,R.string.two146,
                R.string.two147,R.string.two148,R.string.two149,R.string.two150,
                R.string.two151,R.string.two152,R.string.two153,R.string.two154,
                R.string.two155,R.string.two156,R.string.two157,R.string.two158,
                R.string.two159,R.string.two160,R.string.two161,R.string.two162,
                R.string.two163,R.string.two164,R.string.two165,R.string.two166,
                R.string.two167,R.string.two168,R.string.two169,R.string.two170,
                R.string.two171,R.string.two172,R.string.two173,R.string.two174,
                R.string.two175,R.string.two176,R.string.two177,R.string.two178,
                R.string.two179,R.string.two180,R.string.two181,R.string.two182,
                R.string.two183,R.string.two184,R.string.two185,R.string.two186,
                R.string.two187,R.string.two188,R.string.two189,R.string.two190,
                R.string.two191,R.string.two192,R.string.two193,R.string.two194,
                R.string.two195,R.string.two196,R.string.two197,R.string.two198,
                R.string.two199,R.string.two200,R.string.two201,R.string.two202,
                R.string.two203,R.string.two204,R.string.two205,R.string.two206,
                R.string.two207,R.string.two208,R.string.two209,R.string.two210,
                R.string.two211,R.string.two212,R.string.two213,R.string.two214,
                R.string.two215,R.string.two216,R.string.two217,R.string.two218,
                R.string.two219,R.string.two220,R.string.two221,R.string.two222,
                R.string.two223,R.string.two224,R.string.two225,R.string.two226,
                R.string.two227,R.string.two228,R.string.two229,R.string.two230,
                R.string.two231,R.string.two232,R.string.two233,R.string.two234,
                R.string.two235,R.string.two236,R.string.two237,R.string.two238,
                R.string.two239,R.string.two240,R.string.two241,R.string.two242,
                R.string.two243,R.string.two244,R.string.two245,R.string.two246,
                R.string.two247,R.string.two248,R.string.two249,R.string.two250,
                R.string.two251,R.string.two252,R.string.two253,R.string.two254,
                R.string.two255,R.string.two256,R.string.two257,R.string.two258,

                R.string.two259,R.string.two260,R.string.two261,R.string.two262,
                R.string.two263,R.string.two264,R.string.two265,R.string.two266,
                R.string.two267,R.string.two268,R.string.two269,R.string.two270,
                R.string.two271,R.string.two272,R.string.two273,R.string.two274,
                R.string.two275,R.string.two276,R.string.two27,R.string.two278,
                R.string.two279,R.string.two280,R.string.two281,R.string.two282,
                R.string.two283,R.string.two284,R.string.two285,R.string.two286,
                R.string.two287,R.string.two288,R.string.two289,R.string.two290,
                R.string.two291,R.string.two292,R.string.two293,R.string.two294,
                R.string.two295,R.string.two296,R.string.two297,R.string.two298,
                R.string.two299,R.string.two300,R.string.two301};


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int te=generator(holder);
                if (lan==1){
                    displayAmharic.setText(questionsAmharic[te]);
                   // indexdisplay.setText("No "+ te+" Out of 300 Questions");
                    displayAmharic.animate();
                    displayEnglish.setText("AMHARIC");
                    displayEnglish.setTextSize(30);
                    displayEnglish.setGravity(Gravity.CENTER_HORIZONTAL);
                }
                else if (lan==2)
                {
                    displayAmharic.setText(questionsEnglish[te]);
                   // indexdisplay.setText("No "+ te+" Out of 300 Questions");
                    displayAmharic.animate();
                    displayEnglish.setText("ENGLISH");
                    displayEnglish.setTextSize(30);
                    displayEnglish.setGravity(Gravity.CENTER_HORIZONTAL);
                }
                else {
                    displayEnglish.setText(questionsEnglish[te]);
                    displayAmharic.setText(questionsAmharic[te]);
                   // indexdisplay.setText("No "+ te+" Out of 300 Questions");
                }

                if (player<noUser)
                {
                    player++;
                }
                else
                    {
                        player=1;
                    }
                playerdisplay.setText("Player "+player+"'s Turn");
            }
        });
    }
    public int generator(ArrayList<Integer> selected)
    {
        Random random=new Random();
        int posi=random.nextInt(301);
        while (selected.contains(posi))
        {
            posi=random.nextInt(301);
        }
        holder.add(posi);
        return posi;
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
