package com.inmobi.media;

import java.util.Map;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class S2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f37686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f37687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f37688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f37690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f37691h;

    public S2(int i10, String url, Map map, boolean z10, boolean z11, int i11, long j10, long j11) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f37684a = i10;
        this.f37685b = url;
        this.f37686c = map;
        this.f37687d = z10;
        this.f37688e = z11;
        this.f37689f = i11;
        this.f37690g = j10;
        this.f37691h = j11;
    }

    public /* synthetic */ S2(String str, boolean z10, boolean z11, int i10, int i11) {
        this(new Random().nextInt() & Integer.MAX_VALUE, str, null, z10, z11, i10, System.currentTimeMillis(), System.currentTimeMillis());
    }
}
