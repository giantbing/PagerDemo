package com.zonglinks.giant.pagerdemo;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Created by giant on 2017/9/14.
 */

public class MyViewPagger extends ViewPager {
    private int pagerWidth,pagerHighs;

    public MyViewPagger(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        pagerWidth = (int)(w* 3.0f / 5.0f);
        pagerHighs = h;
        ViewGroup.LayoutParams lp = this.getLayoutParams();
        if (lp == null) {
            lp = new ViewGroup.LayoutParams(pagerWidth,pagerHighs);
        } else {

            lp.width =  pagerWidth;
            lp.height = pagerHighs;
        }
        this.setLayoutParams(lp);
        this.setPageMargin(10);
    }
}
