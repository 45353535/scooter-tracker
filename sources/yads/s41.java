package yads;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;

/* JADX INFO: loaded from: classes4.dex */
public final class s41 implements ru2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f115686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf1 f115687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wf1 f115688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f115689d;

    public s41(long j10, long j11, long j12) {
        this.f115689d = j10;
        this.f115686a = j12;
        wf1 wf1Var = new wf1();
        this.f115687b = wf1Var;
        wf1 wf1Var2 = new wf1();
        this.f115688c = wf1Var2;
        wf1Var.a(0L);
        wf1Var2.a(j11);
    }

    @Override // yads.ru2
    public final long a() {
        return this.f115686a;
    }

    @Override // yads.nu2
    public final boolean b() {
        return true;
    }

    @Override // yads.nu2
    public final long c() {
        return this.f115689d;
    }

    @Override // yads.ru2
    public final long a(long j10) {
        return this.f115687b.a(w83.a(this.f115688c, j10));
    }

    @Override // yads.nu2
    public final lu2 b(long j10) {
        int iA = w83.a(this.f115687b, j10);
        long jA = this.f115687b.a(iA);
        pu2 pu2Var = new pu2(jA, this.f115688c.a(iA));
        if (jA != j10) {
            wf1 wf1Var = this.f115687b;
            if (iA != wf1Var.f117442a - 1) {
                int i10 = iA + 1;
                return new lu2(pu2Var, new pu2(wf1Var.a(i10), this.f115688c.a(i10)));
            }
        }
        return new lu2(pu2Var, pu2Var);
    }

    public final boolean c(long j10) {
        wf1 wf1Var = this.f115687b;
        return j10 - wf1Var.a(wf1Var.f117442a - 1) < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }
}
