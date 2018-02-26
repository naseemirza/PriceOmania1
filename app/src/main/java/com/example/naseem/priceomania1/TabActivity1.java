package com.example.naseem.priceomania1;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.iarcuschin.simpleratingbar.SimpleRatingBar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class TabActivity1 extends AppCompatActivity   {

  TextView mobilenametext,priceTextd;


    SimpleRatingBar ratingBar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab1);

        ratingBar = (SimpleRatingBar) findViewById(R.id.ratingBarID);



        mobilenametext=(TextView)findViewById(R.id.mobilenametext);
        priceTextd=(TextView)findViewById(R.id.priceTextd);

        Intent intent=getIntent();
        String Mname = intent.getExtras().getString("Mname");
        String Mprice = intent.getExtras().getString("Mprice");

        mobilenametext.setText(Mname);
        priceTextd.setText(Mprice);


    }

}
