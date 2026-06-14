package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.util.TreeSet;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeSet f22986c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22987d;

    public h(int i10, String str, long j10) {
        this.f22984a = i10;
        this.f22985b = str;
        this.f22987d = j10;
    }

    public final m a(long j10) {
        m mVar = new m(this.f22985b, j10, -1L, -9223372036854775807L, null);
        m mVar2 = (m) this.f22986c.floor(mVar);
        if (mVar2 != null && mVar2.f22979b + mVar2.f22980c > j10) {
            return mVar2;
        }
        m mVar3 = (m) this.f22986c.ceiling(mVar);
        return mVar3 == null ? new m(this.f22985b, j10, -1L, -9223372036854775807L, null) : new m(this.f22985b, j10, mVar3.f22979b - j10, -9223372036854775807L, null);
    }
}
