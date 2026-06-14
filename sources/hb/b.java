package hb;

import androidx.collection.SieveCacheKt;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.math.RoundingMode;
import oa.h0;
import oa.m0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f73069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f73070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h0 f73071c;

    public b(long j10, long j11, long j12) {
        this.f73071c = new h0(new long[]{j11}, new long[]{0}, j10);
        this.f73069a = j12;
        int i10 = -2147483647;
        if (j10 == -9223372036854775807L) {
            this.f73070b = -2147483647;
            return;
        }
        long jE1 = o0.e1(j11 - j12, 8L, j10, RoundingMode.HALF_UP);
        if (jE1 > 0 && jE1 <= SieveCacheKt.NodeLinkMask) {
            i10 = (int) jE1;
        }
        this.f73070b = i10;
    }

    public boolean a(long j10) {
        return this.f73071c.b(j10, SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US);
    }

    public void b(long j10, long j11) {
        if (a(j10)) {
            return;
        }
        this.f73071c.a(j10, j11);
    }

    void c(long j10) {
        this.f73071c.c(j10);
    }

    @Override // hb.g
    public int getAverageBitrate() {
        return this.f73070b;
    }

    @Override // hb.g
    public long getDataEndPosition() {
        return this.f73069a;
    }

    @Override // oa.m0
    public long getDurationUs() {
        return this.f73071c.getDurationUs();
    }

    @Override // oa.m0
    public m0.a getSeekPoints(long j10) {
        return this.f73071c.getSeekPoints(j10);
    }

    @Override // hb.g
    public long getTimeUs(long j10) {
        return this.f73071c.getTimeUs(j10);
    }

    @Override // oa.m0
    public boolean isSeekable() {
        return this.f73071c.isSeekable();
    }
}
