package com.appodeal.ads.adapters.admobnative.view;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f11958a;

    public c(float f10) {
        this.f11958a = f10;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (view == null || outline == null) {
            return;
        }
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f11958a);
    }
}
