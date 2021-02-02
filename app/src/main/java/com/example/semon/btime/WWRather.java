package com.example.semon.btime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;
public class WWRather extends AppCompatActivity implements Animation.AnimationListener{
    boolean blnButtonRotation = true;
    int intNumber = 6;
    long lngDegrees = 0;
    int nextGeneral=0;
    SharedPreferences sharedPreferences;

    ImageView selected,imageRoulette;
    TextView general,soldier;
    Button b_start,b_up,b_down;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().addFlags(1024);
        requestWindowFeature(1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wwrather);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        b_start = (Button)findViewById(R.id.buttonStart);
        b_up = (Button)findViewById(R.id.buttonUp);
        b_down = (Button)findViewById(R.id.buttonDown);
        general=(TextView)findViewById(R.id.generalText);
        soldier=(TextView)findViewById(R.id.soldierText);

        selected = (ImageView)findViewById(R.id.imageSelected);
        imageRoulette = (ImageView)findViewById(R.id.rouletteImage);


        this.sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        this.intNumber = this.sharedPreferences.getInt("INT_NUMBER",6);
        setImageRoulette(this.intNumber);

    }
    @Override
    public void onAnimationStart(Animation animation)
    {
        this.blnButtonRotation = false;
        b_start.setVisibility(View.VISIBLE);

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        String soldier2=String.valueOf((int)(((double)this.intNumber)
                - Math.floor(((double)this.lngDegrees) / (360.0d / ((double)this.intNumber)))));
        soldier.setText("Soldier:ታዛዝ: NO "+soldier2);
        if (nextGeneral!=0){
            general.setText("General:አዛዝ: NO "+nextGeneral);
        }
        else {
            if (Integer.parseInt(soldier2)==nextGeneral){
                int nextGene=nextGeneral+1;
                general.setText("General:ታዛዝ: NO "+nextGene);
            }
            else {
                general.setText("General:አዛዝ: NO 1" );
            }
        }
        nextGeneral=Integer.parseInt(soldier2);
        this.blnButtonRotation = true;
        b_start.setVisibility(View.VISIBLE);

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }

    public void onClickButtonRotation(View v)
    {
        if(this.blnButtonRotation)
        {
            int ran = new Random().nextInt(360) + 3600;
            RotateAnimation rotateAnimation = new RotateAnimation((float)this.lngDegrees, (float)
                    (this.lngDegrees + ((long)ran)),1,0.5f,1,0.5f);

            this.lngDegrees = (this.lngDegrees + ((long)ran)) % 360;
            rotateAnimation.setDuration((long)ran);
            rotateAnimation.setFillAfter(true);
            rotateAnimation.setInterpolator(new DecelerateInterpolator());
            rotateAnimation.setAnimationListener(this);
            imageRoulette.setAnimation(rotateAnimation);
            imageRoulette.startAnimation(rotateAnimation);

        }
    }

    public void buttonUp(View v)
    {
        if(this.intNumber < 10)
        {
            this.intNumber++;
            setImageRoulette(this.intNumber);
            SharedPreferences.Editor editor = this.sharedPreferences.edit();
            editor.putInt("INT_NUMBER",this.intNumber);
            //editor.commit();

        }
    }


    public void buttonDown(View v)
    {
        if(this.intNumber > 2)
        {
            intNumber--;
            setImageRoulette(this.intNumber);

            SharedPreferences.Editor editor = this.sharedPreferences.edit();
            editor.putInt("INT_NUMBER",this.intNumber);
            //editor.commit();

        }
    }

    private void setImageRoulette(int myNumber)
    {
        switch(myNumber)
        {
            case 1:
                imageRoulette.setImageDrawable(getResources().getDrawable(R.drawable.roulette));
                return;
            case 2:
                imageRoulette.setImageDrawable(getResources().getDrawable(R.drawable.roulette_2));
                return;

            case 3:
                imageRoulette.setImageDrawable(getResources().getDrawable(R.drawable.roulette_3));
                return;
            case 4:
                imageRoulette.setImageDrawable(getResources().getDrawable(R.drawable.roulette_4));
                return;

            case 5:
                imageRoulette.setImageDrawable(getResources().getDrawable(R.drawable.roulette_5));
                return;
            case 6:
                imageRoulette.setImageDrawable(getResources().getDrawable(R.drawable.roulette_6));
                return;

            case 7:
                imageRoulette.setImageDrawable(getResources().getDrawable(R.drawable.roulette_7));
                return;
            case 8:
                imageRoulette.setImageDrawable(getResources().getDrawable(R.drawable.roulette_8));
                return;

            case 9:
                imageRoulette.setImageDrawable(getResources().getDrawable(R.drawable.roulette_9));
                return;
            case 10:
                imageRoulette.setImageDrawable(getResources().getDrawable(R.drawable.roulette_10));
                return;


        }
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
