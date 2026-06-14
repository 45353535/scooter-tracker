package net.pubnative.lite.sdk.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public class CustomImageView extends ImageView {
    private GestureDetector gestureDetector;

    public CustomImageView(Context context) {
        super(context);
        init();
    }

    private void init() {
        this.gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: net.pubnative.lite.sdk.views.CustomImageView.1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
                return true;
            }
        });
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.gestureDetector.onTouchEvent(motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    public CustomImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public CustomImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init();
    }
}
