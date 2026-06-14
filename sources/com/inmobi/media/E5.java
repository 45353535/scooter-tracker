package com.inmobi.media;

import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public final class E5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f36772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public D5 f36774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H5 f36775e;

    public E5(H5 h52, String str) {
        this.f36775e = h52;
        this.f36771a = str;
        this.f36772b = new long[h52.f36985h];
    }

    public final File a(int i10) {
        return new File(this.f36775e.f36979b, this.f36771a + "." + i10);
    }

    public final File b(int i10) {
        return new File(this.f36775e.f36979b, this.f36771a + "." + i10 + ".tmp");
    }
}
