package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes7.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioTrack f21605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f21608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f21609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f21610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f21611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f21612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f21613i;

    public void a(AudioTrack audioTrack, boolean z10) {
        this.f21605a = audioTrack;
        this.f21606b = z10;
        this.f21611g = -9223372036854775807L;
        this.f21608d = 0L;
        this.f21609e = 0L;
        this.f21610f = 0L;
        if (audioTrack != null) {
            this.f21607c = audioTrack.getSampleRate();
        }
    }

    public long b() {
        throw new UnsupportedOperationException();
    }

    public long c() {
        throw new UnsupportedOperationException();
    }

    public final void d() {
        if (this.f21611g != -9223372036854775807L) {
            return;
        }
        this.f21605a.pause();
    }

    public boolean e() {
        return false;
    }

    public final void a(long j10) {
        this.f21612h = a();
        this.f21611g = SystemClock.elapsedRealtime() * 1000;
        this.f21613i = j10;
        this.f21605a.stop();
    }

    public final long a() {
        if (this.f21611g != -9223372036854775807L) {
            return Math.min(this.f21613i, this.f21612h + ((((SystemClock.elapsedRealtime() * 1000) - this.f21611g) * ((long) this.f21607c)) / 1000000));
        }
        int playState = this.f21605a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) this.f21605a.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f21606b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f21610f = this.f21608d;
            }
            playbackHeadPosition += this.f21610f;
        }
        if (this.f21608d > playbackHeadPosition) {
            this.f21609e++;
        }
        this.f21608d = playbackHeadPosition;
        return playbackHeadPosition + (this.f21609e << 32);
    }
}
