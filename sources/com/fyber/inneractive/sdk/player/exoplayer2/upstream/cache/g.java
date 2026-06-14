package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public abstract class g implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f22982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f22983f;

    public g(String str, long j10, long j11, long j12, File file) {
        this.f22978a = str;
        this.f22979b = j10;
        this.f22980c = j11;
        this.f22981d = file != null;
        this.f22982e = file;
        this.f22983f = j12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (!this.f22978a.equals(gVar.f22978a)) {
            return this.f22978a.compareTo(gVar.f22978a);
        }
        long j10 = this.f22979b - gVar.f22979b;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }
}
