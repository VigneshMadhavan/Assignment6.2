package com.vigneshtraining.assignment62;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class DetailActivity extends AppCompatActivity implements View.OnClickListener {


    private Toolbar toolbar;
    public static String TITLE="title";
    public static String DECRIPTION="description";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_details);

        toolbar = (Toolbar) findViewById(R.id.myToolBar);

        TextView descTxt= (TextView) findViewById(R.id.descTxt2);

        Intent intentObject = getIntent();
        String title = intentObject.getStringExtra(TITLE);
        String descr = intentObject.getStringExtra(DECRIPTION);


        descTxt.setText(descr);
        toolbar.setTitle(title);
        //setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        //Toast.makeText(this,"Back",Toast.LENGTH_LONG).show();
        Intent backIntent=new Intent(this,MainActivity.class);

        startActivity(backIntent);
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        finish();
    }
}
