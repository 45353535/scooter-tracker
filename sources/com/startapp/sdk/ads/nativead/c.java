package com.startapp.sdk.ads.nativead;

import android.graphics.Bitmap;
import com.startapp.sdk.internal.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f63834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f63835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f63836c;

    public c(NativeAdDetails nativeAdDetails, Runnable runnable) {
        this.f63836c = nativeAdDetails;
        this.f63835b = runnable;
    }

    @Override // com.startapp.sdk.internal.j2
    public final void a(Bitmap bitmap, int i10) {
        if (i10 == 0) {
            this.f63836c.setImageBitmap(bitmap);
        } else {
            this.f63836c.setSecondaryImageBitmap(bitmap);
        }
        int i11 = this.f63834a + 1;
        this.f63834a = i11;
        if (i11 == 2) {
            this.f63835b.run();
        }
    }
}
