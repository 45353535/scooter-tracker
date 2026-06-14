package com.facebook.ads.redexgen.core;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C19067t implements InterfaceC3259kk {
    public long A00;
    public final long A01;
    public final AnonymousClass45 A03 = new AnonymousClass45();
    public final AnonymousClass45 A02 = new AnonymousClass45();

    public C19067t(long j10, long j11, long j12) {
        this.A00 = j10;
        this.A01 = j12;
        this.A03.A04(0L);
        this.A02.A04(j11);
    }

    public final void A00(long j10) {
        this.A00 = j10;
    }

    public final void A01(long j10, long j11) {
        if (A02(j10)) {
            return;
        }
        this.A03.A04(j10);
        this.A02.A04(j11);
    }

    public final boolean A02(long j10) {
        long lastIndexedTimeUs = this.A03.A03(this.A03.A02() - 1);
        return j10 - lastIndexedTimeUs < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3259kk
    public final long A7b() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2127Gw
    public final long A7l() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2127Gw
    public final C2126Gv A8t(long j10) {
        int iA0C = AbstractC18094a.A0C(this.A03, j10, true, true);
        C2128Gx c2128Gx = new C2128Gx(this.A03.A03(iA0C), this.A02.A03(iA0C));
        if (c2128Gx.A01 != j10) {
            int targetIndex = this.A03.A02();
            if (iA0C != targetIndex - 1) {
                int targetIndex2 = iA0C + 1;
                long jA03 = this.A03.A03(targetIndex2);
                int targetIndex3 = iA0C + 1;
                C2128Gx nextSeekPoint = new C2128Gx(jA03, this.A02.A03(targetIndex3));
                return new C2126Gv(c2128Gx, nextSeekPoint);
            }
        }
        return new C2126Gv(c2128Gx);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3259kk
    public final long A99(long j10) {
        return this.A03.A03(AbstractC18094a.A0C(this.A02, j10, true, true));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2127Gw
    public final boolean AAa() {
        return true;
    }
}
