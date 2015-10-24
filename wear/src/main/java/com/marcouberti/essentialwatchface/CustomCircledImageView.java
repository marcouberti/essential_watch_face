package com.marcouberti.essentialwatchface;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.wearable.view.CircledImageView;
import android.util.AttributeSet;

/**
 * Created by Marco on 05/09/15.
 */
public class CustomCircledImageView extends CircledImageView {

    Paint paint = new Paint();
    public int[] gradients;

    public CustomCircledImageView(Context context) {
        super(context);
        initPaint(context);
    }

    public CustomCircledImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint(context);
    }

    public CustomCircledImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initPaint(context);
    }

    private void initPaint(Context ctx){
        gradients = ctx.getResources().getIntArray(R.array.violet_illusion_array);
        paint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Shader shader = new LinearGradient(0, 0, 0, this.getCircleRadius()*2, gradients,
                null, Shader.TileMode.MIRROR);

        Matrix matrix = new Matrix();
        matrix.setRotate(180);
        shader.setLocalMatrix(matrix);

        paint.setShader(shader);
        float R = this.getCircleRadius();
        if(R > this.getMeasuredWidth()/2) R = this.getMeasuredWidth()/2;
        canvas.drawCircle(this.getMeasuredWidth()/2, this.getMeasuredHeight()/2, R, paint);
    }
}
