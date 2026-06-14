package com.fyber.inneractive.sdk.player.cache;

import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f21444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f21446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f21447e;

    public e(g gVar, String str) {
        this.f21447e = gVar;
        this.f21443a = str;
        this.f21444b = new long[gVar.f21456g];
    }

    public final File a(int i10) {
        return new File(this.f21447e.f21450a, this.f21443a + "." + i10);
    }

    public final File b(int i10) {
        return new File(this.f21447e.f21450a, this.f21443a + "." + i10 + ".tmp");
    }
}
