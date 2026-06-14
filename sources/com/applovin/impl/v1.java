package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.ad.b;

/* JADX INFO: loaded from: classes6.dex */
abstract class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.applovin.impl.sdk.k f11124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Activity f11125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.applovin.impl.sdk.ad.b f11126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ViewGroup f11127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final FrameLayout.LayoutParams f11128e;

    v1(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f11128e = layoutParams;
        this.f11126c = bVar;
        this.f11124a = kVar;
        this.f11125b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f11127d = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        frameLayout.setLayoutParams(layoutParams);
    }

    public void a(View view) {
        this.f11127d.removeView(view);
    }

    public void a(com.applovin.impl.adview.g gVar) {
        if (gVar == null || gVar.getParent() != null) {
            return;
        }
        a(this.f11126c.n(), (this.f11126c.u0() ? 3 : 5) | 48, gVar);
    }

    void a(b.d dVar, int i10, com.applovin.impl.adview.g gVar) {
        gVar.a(dVar.f10540a, dVar.f10544e, dVar.f10543d, i10);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gVar.getLayoutParams());
        int i11 = dVar.f10542c;
        layoutParams.setMargins(i11, dVar.f10541b, i11, 0);
        layoutParams.gravity = i10;
        this.f11127d.addView(gVar, layoutParams);
    }
}
