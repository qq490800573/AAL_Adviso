package com.iitp.signagekiosk.util.voiceanimation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.iitp.signagekiosk.R;

/**
 * Created by yugy on 2014/3/23.
 */
public class VoiceView extends View {

    private static final String TAG = VoiceView.class.getName();

    private Bitmap mRecordingBitmap;
    private Paint mPaint;
    private Paint mShadowPaint;
    private RectF mShadowBound;
    private final AnimatorSet mAnimatorSet = new AnimatorSet();

    private float mMinRadius;
    private float mMaxRadius;
    private float mCurrentRadius;

    public VoiceView(Context context) {
        super(context);
        init();
    }

    public VoiceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        mRecordingBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.vs_micbtn_on);

        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.BLACK);
        mPaint.setAlpha(70);

        mShadowPaint = new Paint(0);
        mShadowPaint.setColor(getContext().getResources().getColor(R.color.bright_sky_blue, null));
        mShadowPaint.setMaskFilter(new BlurMaskFilter(40f, BlurMaskFilter.Blur.NORMAL));
        mShadowBound = new RectF();

        mMinRadius = ScreenUtils.dp2px(getContext(), 58) / 2f;
        mCurrentRadius = mMinRadius;

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mMaxRadius = Math.min(w, h) / 2f;
        Log.d(TAG, "MaxRadius: " + mMaxRadius);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = getWidth();
        int height = getHeight();

        if (mCurrentRadius > mMinRadius) {
            canvas.drawCircle(width / 2f, height / 2f, mCurrentRadius, mPaint);
        }

        int drawLeft = (width - mRecordingBitmap.getWidth()) / 2;
        int drawTop = (height - mRecordingBitmap.getHeight()) / 2;
        int drawRight = drawLeft + mRecordingBitmap.getWidth();
        int drawBottom = drawTop + mRecordingBitmap.getHeight();

        float shadowSizeOffset = 30f;
        mShadowBound.set(drawLeft, drawTop, drawRight, drawBottom);
        mShadowBound.inset(shadowSizeOffset, shadowSizeOffset);
        mShadowBound.offset(8f, 12f);
        canvas.drawOval(mShadowBound, mShadowPaint);
        setLayerType(View.LAYER_TYPE_SOFTWARE, mShadowPaint);
//        canvas.drawBitmap(mRecordingBitmap, drawLeft, drawTop, null);
    }

    public void animateRadius(float radius) {
        if (radius <= mCurrentRadius) {
            return;
        }
        if (radius > mMaxRadius) {
            radius = mMaxRadius;
        } else if (radius < mMinRadius) {
            radius = mMinRadius;
        }
        if (radius == mCurrentRadius) {
            return;
        }
        if (mAnimatorSet.isRunning()) {
            mAnimatorSet.cancel();
        }
        mAnimatorSet.playSequentially(
                ObjectAnimator.ofFloat(this, "CurrentRadius", getCurrentRadius(), radius).setDuration(10),
                ObjectAnimator.ofFloat(this, "CurrentRadius", radius, mMinRadius).setDuration(10)
        );
        mAnimatorSet.start();
    }

    public float getCurrentRadius() {
        return mCurrentRadius;
    }

    public void setCurrentRadius(float currentRadius) {
        mCurrentRadius = currentRadius;
        invalidate();
    }

}
