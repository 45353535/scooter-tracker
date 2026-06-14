package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import com.fyber.inneractive.sdk.player.exoplayer2.util.n;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22641b;

    public c(int i10, long j10) {
        this.f22640a = i10;
        this.f22641b = j10;
    }

    public static c a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, n nVar) {
        bVar.a(nVar.f23134a, 0, 8, false);
        nVar.e(0);
        return new c(nVar.b(), nVar.e());
    }
}
