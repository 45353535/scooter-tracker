package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeSet f22995a = new TreeSet(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f22996b;

    public final void a(l lVar, long j10) {
        while (this.f22996b + j10 > 10485760) {
            try {
                g gVar = (g) this.f22995a.first();
                synchronized (lVar) {
                    lVar.a(gVar, true);
                }
            } catch (a unused) {
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        g gVar = (g) obj;
        g gVar2 = (g) obj2;
        long j10 = gVar.f22983f;
        long j11 = gVar2.f22983f;
        if (j10 - j11 != 0) {
            return j10 < j11 ? -1 : 1;
        }
        if (!gVar.f22978a.equals(gVar2.f22978a)) {
            return gVar.f22978a.compareTo(gVar2.f22978a);
        }
        long j12 = gVar.f22979b - gVar2.f22979b;
        if (j12 == 0) {
            return 0;
        }
        return j12 < 0 ? -1 : 1;
    }
}
