package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.o0;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes6.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ClickRecognitionState f8248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f8249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PointF f8250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f8252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final OnClickListener f8253i;

    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    public interface OnClickListener {
        void onClick(View view, MotionEvent motionEvent);
    }

    public AppLovinTouchToClickListener(com.applovin.impl.sdk.k kVar, x4 x4Var, Context context, OnClickListener onClickListener) {
        this.f8245a = ((Long) kVar.a(x4.f11278c0)).longValue();
        this.f8246b = ((Integer) kVar.a(x4.f11287d0)).intValue();
        this.f8247c = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(x4.f11323h0)).intValue());
        this.f8248d = ClickRecognitionState.values()[((Integer) kVar.a(x4Var)).intValue()];
        this.f8252h = context;
        this.f8253i = onClickListener;
    }

    private void a(View view, MotionEvent motionEvent) {
        this.f8253i.onClick(view, motionEvent);
        this.f8251g = true;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.f8251g && this.f8248d == ClickRecognitionState.ACTION_POINTER_UP) {
                    a(view, motionEvent);
                }
            } else if (!this.f8251g && this.f8248d == ClickRecognitionState.ACTION_UP) {
                a(view, motionEvent);
            } else if (this.f8248d == ClickRecognitionState.DISABLED) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f8249e;
                float fA = a(this.f8250f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.f8251g) {
                    long j10 = this.f8245a;
                    if ((j10 < 0 || jElapsedRealtime < j10) && ((i10 = this.f8246b) < 0 || fA < i10)) {
                        a(view, motionEvent);
                    }
                }
            }
        } else if (this.f8248d != ClickRecognitionState.ACTION_DOWN) {
            this.f8249e = SystemClock.elapsedRealtime();
            this.f8250f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.f8251g = false;
        } else if (a(motionEvent)) {
            a(view, motionEvent);
        }
        return true;
    }

    private float a(PointF pointF, PointF pointF2) {
        float f10 = pointF.x - pointF2.x;
        float f11 = pointF.y - pointF2.y;
        return a((float) Math.sqrt((f10 * f10) + (f11 * f11)));
    }

    private float a(float f10) {
        return f10 / this.f8252h.getResources().getDisplayMetrics().density;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.f8247c <= 0) {
            return true;
        }
        Point pointB = o0.b(this.f8252h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i10 = this.f8247c;
        float f10 = i10;
        return rawX >= f10 && rawY >= f10 && rawX <= ((float) (pointB.x - i10)) && rawY <= ((float) (pointB.y - i10));
    }
}
