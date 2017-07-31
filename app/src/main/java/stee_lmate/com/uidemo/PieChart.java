package stee_lmate.com.uidemo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;

/**
 * Created by xuti on 2017/7/28.
 */

public class PieChart extends View {
    private boolean mShowText;
    private int mTextPos;
    private Paint mTextPaint;

    public PieChart(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.PieChart,
                0, 0);

        try {
            mShowText = a.getBoolean(R.styleable.PieChart_showText, false);
            mTextPos = a.getInteger(R.styleable.PieChart_labelPosition, 0);
        } finally {
            a.recycle();
        }
//        test();
    }

    private void test() {
        resolveSizeAndState(0,0,0);
        setMeasuredDimension(0,0);
//        LinearGradient shader = new LinearGradient();
//        mTextPaint.setShader(shader);
        new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onDown(MotionEvent e) {
                return super.onDown(e);
            }

            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                Scroller scroller = new Scroller(getContext());
                scroller.fling(0,0,0,0,0,0,0,0);
                return super.onFling(e1, e2, velocityX, velocityY);
            }
        };
    }

    public boolean isShowText() {
        return mShowText;
    }

    public void setShowText(boolean showText) {
        mShowText = showText;
        invalidate();
        requestLayout();
    }




}
