package com.facebook.ads.redexgen.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2831dW extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C2833dY A01;

    public C2831dW(C2833dY c2833dY, float f10) {
        this.A01 = c2833dY;
        this.A00 = f10;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00);
    }
}
