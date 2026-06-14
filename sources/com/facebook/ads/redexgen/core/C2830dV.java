package com.facebook.ads.redexgen.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2830dV extends ViewOutlineProvider {
    public final /* synthetic */ C2833dY A00;

    public C2830dV(C2833dY c2833dY) {
        this.A00 = c2833dY;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 8.0f);
    }
}
