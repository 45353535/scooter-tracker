package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f23156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.s f23157d = com.fyber.inneractive.sdk.player.exoplayer2.s.f22815d;

    public final void a(long j10) {
        this.f23155b = j10;
        if (this.f23154a) {
            this.f23156c = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final long b() {
        long j10 = this.f23155b;
        if (!this.f23154a) {
            return j10;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f23156c;
        com.fyber.inneractive.sdk.player.exoplayer2.s sVar = this.f23157d;
        if (sVar.f22816a != 1.0f) {
            return (jElapsedRealtime * ((long) sVar.f22818c)) + j10;
        }
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.b.f21703a;
        return (jElapsedRealtime != -9223372036854775807L ? 1000 * jElapsedRealtime : -9223372036854775807L) + j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a(com.fyber.inneractive.sdk.player.exoplayer2.s sVar) {
        if (this.f23154a) {
            a(b());
        }
        this.f23157d = sVar;
        return sVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a() {
        return this.f23157d;
    }
}
