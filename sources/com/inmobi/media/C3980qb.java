package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3980qb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f39370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f39371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f39372f;

    public C3980qb(String fileName, long j10, int i10, long j11, boolean z10, int i11) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.f39367a = fileName;
        this.f39368b = j10;
        this.f39369c = i10;
        this.f39370d = j11;
        this.f39371e = z10;
        this.f39372f = i11;
    }

    public /* synthetic */ C3980qb(String str, long j10, int i10, long j11, boolean z10, int i11, int i12) {
        this(str, j10, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0L : j11, (i12 & 16) != 0 ? false : z10, (i12 & 32) != 0 ? 0 : i11);
    }
}
