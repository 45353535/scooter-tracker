package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes6.dex */
public class b2 extends v1 {
    public b2(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        super(bVar, activity, kVar);
    }

    @Override // com.applovin.impl.v1
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    @Override // com.applovin.impl.v1
    public /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.widget.ImageView r18, com.applovin.impl.adview.g r19, final com.applovin.impl.adview.l r20, com.applovin.impl.a r21, android.widget.ProgressBar r22, com.applovin.impl.i0 r23, android.view.View r24, android.view.View r25, com.applovin.adview.AppLovinAdView r26, com.applovin.impl.adview.k r27, android.widget.ImageView r28, android.view.ViewGroup r29) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.b2.a(android.widget.ImageView, com.applovin.impl.adview.g, com.applovin.impl.adview.l, com.applovin.impl.a, android.widget.ProgressBar, com.applovin.impl.i0, android.view.View, android.view.View, com.applovin.adview.AppLovinAdView, com.applovin.impl.adview.k, android.widget.ImageView, android.view.ViewGroup):void");
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, View view, ProgressBar progressBar) {
        if (view != null) {
            view.setVisibility(0);
        }
        s.a(this.f11127d, view);
        if (gVar != null) {
            a(this.f11126c.n(), (this.f11126c.u0() ? 3 : 5) | 48, gVar);
        }
        if (progressBar != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 20, ((Boolean) this.f11124a.a(x4.f11402q2)).booleanValue() ? 80 : 48);
            layoutParams.setMargins(0, 0, 0, ((Integer) this.f11124a.a(x4.f11410r2)).intValue());
            this.f11127d.addView(progressBar, layoutParams);
        }
        if (kVar != null) {
            this.f11127d.addView(kVar, this.f11128e);
        }
    }
}
