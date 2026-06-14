package com.inmobi.media;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class H8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f36994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f36997d;

    public H8(View mToken, int i10, int i11) {
        Intrinsics.checkNotNullParameter(mToken, "mToken");
        this.f36994a = mToken;
        this.f36995b = i10;
        this.f36996c = i11;
        this.f36997d = Long.MAX_VALUE;
    }
}
