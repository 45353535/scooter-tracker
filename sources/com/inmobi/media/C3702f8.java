package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.f8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3702f8 extends AbstractC3676e8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f38562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38563c;

    public C3702f8(int i10, long j10, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f38561a = url;
        this.f38562b = j10;
        this.f38563c = i10;
    }
}
