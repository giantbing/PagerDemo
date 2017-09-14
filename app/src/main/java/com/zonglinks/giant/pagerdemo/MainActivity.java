package com.zonglinks.giant.pagerdemo;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private MyViewPagger viewPager;
    private TextView change,changeNew;
    private List<ImageView> imageViews = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (MyViewPagger)findViewById(R.id.viewPager);
        change = (TextView)findViewById(R.id.change);
        changeNew= (TextView)findViewById(R.id.changenew);
        initData();
        initView();
    }
    private void initView(){

        viewPager.setOffscreenPageLimit(3);
//        two_layout.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                return viewPager.dispatchTouchEvent(motionEvent);
//            }
//        });
        viewPager.setPageTransformer(true, new GallyPageTransformer());
        viewPager.setAdapter(new MyViewPager(imageViews));
        viewPager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,WebViewActivity.class);
                startActivity(intent);
            }
        });
        changeNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,WebNewActivity.class);
                startActivity(intent);
            }
        });
    }
    private void initData(){
        final ImageView first = new ImageView(MainActivity.this);
        final ImageView second = new ImageView(MainActivity.this);
        final ImageView third = new ImageView(MainActivity.this);
        final ImageView fourth = new ImageView(MainActivity.this);
        first.setImageResource(R.mipmap.image1);
        second.setImageResource(R.mipmap.image2);
        third.setImageResource(R.mipmap.image3);
        fourth.setImageResource(R.mipmap.image4);

        imageViews.add(first);
        imageViews.add(second);
        imageViews.add(third);
        imageViews.add(fourth);
    }
}
