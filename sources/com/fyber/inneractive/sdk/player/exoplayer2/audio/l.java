package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AudioTimestamp f21614j = new AudioTimestamp();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f21615k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f21616l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f21617m;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final void a(AudioTrack audioTrack, boolean z10) {
        super.a(audioTrack, z10);
        this.f21615k = 0L;
        this.f21616l = 0L;
        this.f21617m = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final long b() {
        return this.f21617m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final long c() {
        return this.f21614j.nanoTime;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final boolean e() {
        boolean timestamp = this.f21605a.getTimestamp(this.f21614j);
        if (timestamp) {
            long j10 = this.f21614j.framePosition;
            if (this.f21616l > j10) {
                this.f21615k++;
            }
            this.f21616l = j10;
            this.f21617m = j10 + (this.f21615k << 32);
        }
        return timestamp;
    }
}
