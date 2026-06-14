package com.fyber.inneractive.sdk.flow.endcard;

import android.view.MotionEvent;
import android.view.View;
import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.util.g1;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.ui.n f20654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f20655c = new int[2];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f20656d = new g1();

    public e(int i10, com.fyber.inneractive.sdk.player.ui.n nVar) {
        this.f20653a = i10;
        this.f20654b = nVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        view.getRootView().getLocationOnScreen(this.f20655c);
        float rawX = motionEvent.getRawX() - this.f20655c[0];
        float rawY = motionEvent.getRawY() - this.f20655c[1];
        g1 g1Var = this.f20656d;
        g1Var.f23868a = rawX;
        g1Var.f23869b = rawY;
        ((z) this.f20654b).a(this.f20653a, g1Var);
        return true;
    }
}
