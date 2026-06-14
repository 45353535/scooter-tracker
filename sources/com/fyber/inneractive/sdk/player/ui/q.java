package com.fyber.inneractive.sdk.player.ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.util.g1;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f23372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f23373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f23375d;

    public q(s sVar, View view, int[] iArr, int i10) {
        this.f23375d = sVar;
        this.f23372a = view;
        this.f23373b = iArr;
        this.f23374c = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        onSingleTapConfirmed(motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f23372a.getRootView().getLocationOnScreen(this.f23373b);
            float rawX = motionEvent.getRawX() - this.f23373b[0];
            float rawY = motionEvent.getRawY() - this.f23373b[1];
            g1 g1Var = this.f23375d.f23356a;
            g1Var.f23868a = rawX;
            g1Var.f23869b = rawY;
        }
        s sVar = this.f23375d;
        n nVar = sVar.f23362g;
        if (nVar != null) {
            ((z) nVar).a(this.f23374c, sVar.f23356a);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }
}
