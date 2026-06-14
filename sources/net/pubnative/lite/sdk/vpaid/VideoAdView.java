package net.pubnative.lite.sdk.vpaid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public class VideoAdView extends FrameLayout {
    private GestureDetector gestureDetector;
    private VisibilityListener mVisibilityListener;
    private int visibilityLastTrackedValue;

    public interface VisibilityListener {
        void onVisibilityChanged(int i10);
    }

    public VideoAdView(Context context) {
        super(context);
        this.visibilityLastTrackedValue = 0;
        init();
    }

    private void init() {
        this.gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: net.pubnative.lite.sdk.vpaid.VideoAdView.1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
                return true;
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VisibilityListener visibilityListener = this.mVisibilityListener;
        if (visibilityListener != null) {
            visibilityListener.onVisibilityChanged(4);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.gestureDetector.onTouchEvent(motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        this.visibilityLastTrackedValue = i10;
        VisibilityListener visibilityListener = this.mVisibilityListener;
        if (visibilityListener != null) {
            visibilityListener.onVisibilityChanged(i10);
        }
    }

    public void setVisibilityListener(VisibilityListener visibilityListener) {
        if (visibilityListener != null) {
            this.mVisibilityListener = visibilityListener;
            visibilityListener.onVisibilityChanged(this.visibilityLastTrackedValue);
        }
    }

    public VideoAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.visibilityLastTrackedValue = 0;
        init();
    }

    public VideoAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.visibilityLastTrackedValue = 0;
        init();
    }
}
