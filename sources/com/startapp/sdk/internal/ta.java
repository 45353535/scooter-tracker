package com.startapp.sdk.internal;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class ta implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ za f65305a;

    public ta(za zaVar) {
        this.f65305a = zaVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f65305a.A = true;
        return false;
    }
}
