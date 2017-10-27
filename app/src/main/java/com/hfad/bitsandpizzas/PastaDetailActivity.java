package com.hfad.bitsandpizzas;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class PastaDetailActivity extends AppCompatActivity {
    public static final String EXTRA_PASTA_ID = "pastaId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        int pastaId = (Integer)getIntent().getExtras().get(EXTRA_PASTA_ID);
        String pastaName = Pasta.pastas[pastaId].getName();
        TextView textView = (TextView)findViewById(R.id.pasta_text);
        textView.setText(pastaName);
        int pastaImage = Pasta.pastas[pastaId].getImageResourceId();
        ImageView imageView = (ImageView)findViewById(R.id.pasta_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this, pastaImage));
        imageView.setContentDescription(pastaName);
        String pastaDesc = Pasta.pastas[pastaId].getDesc();
        TextView textView1 = (TextView)findViewById(R.id.pasta_desc);
        textView1.setText(pastaDesc);
    }
}