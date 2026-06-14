package com.fyber.inneractive.sdk.player.ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f23376a;

    public r(GestureDetector gestureDetector) {
        this.f23376a = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f23376a.onTouchEvent(motionEvent);
    }
}
