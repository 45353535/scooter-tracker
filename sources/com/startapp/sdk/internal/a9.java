package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import com.startapp.sdk.adsbase.adinformation.ImageResourceConfig;

/* JADX INFO: loaded from: classes11.dex */
public final class a9 implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageResourceConfig f64260a;

    public a9(ImageResourceConfig imageResourceConfig) {
        this.f64260a = imageResourceConfig;
    }

    @Override // com.startapp.sdk.internal.j2
    public final void a(Bitmap bitmap, int i10) {
        ImageResourceConfig imageResourceConfig = this.f64260a;
        imageResourceConfig.f63972a = bitmap;
        if (bitmap != null) {
            imageResourceConfig.f63974c = bitmap;
        }
    }
}
