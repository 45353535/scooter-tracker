package yads;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;

/* JADX INFO: loaded from: classes4.dex */
public final class ui2 implements kp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l43 f116667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w92 f116668b = new w92();

    public ui2(l43 l43Var) {
        this.f116667a = l43Var;
    }

    @Override // yads.kp
    public final void a() {
        this.f116668b.a(w83.f117346f);
    }

    @Override // yads.kp
    public final jp a(yc0 yc0Var, long j10) {
        int i10;
        int i11;
        int iA;
        long j11 = yc0Var.f118152d;
        int iMin = (int) Math.min(20000L, yc0Var.f118151c - j11);
        this.f116668b.c(iMin);
        yc0Var.b(this.f116668b.f117356a, 0, iMin, false);
        w92 w92Var = this.f116668b;
        int i12 = -1;
        int i13 = -1;
        long j12 = -9223372036854775807L;
        while (true) {
            int i14 = w92Var.f117358c;
            int i15 = w92Var.f117357b;
            if (i14 - i15 < 4) {
                return j12 != -9223372036854775807L ? new jp(-2, j12, j11 + ((long) i12)) : jp.f112424d;
            }
            if (vi2.a(i15, w92Var.f117356a) != 442) {
                w92Var.e(w92Var.f117357b + 1);
            } else {
                w92Var.e(w92Var.f117357b + 4);
                long jA = wi2.a(w92Var);
                if (jA != -9223372036854775807L) {
                    long jB = this.f116667a.b(jA);
                    if (jB > j10) {
                        return j12 == -9223372036854775807L ? new jp(-1, jB, j11) : new jp(0, -9223372036854775807L, j11 + ((long) i13));
                    }
                    if (jB + SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US > j10) {
                        return new jp(0, -9223372036854775807L, j11 + ((long) w92Var.f117357b));
                    }
                    j12 = jB;
                    i13 = w92Var.f117357b;
                }
                int i16 = w92Var.f117358c;
                int i17 = w92Var.f117357b;
                if (i16 - i17 < 10) {
                    w92Var.e(i16);
                } else {
                    w92Var.e(i17 + 9);
                    int iM = w92Var.m() & 7;
                    int i18 = w92Var.f117358c;
                    int i19 = w92Var.f117357b;
                    if (i18 - i19 < iM) {
                        w92Var.e(i16);
                    } else {
                        w92Var.e(i19 + iM);
                        int i20 = w92Var.f117358c;
                        int i21 = w92Var.f117357b;
                        if (i20 - i21 < 4) {
                            w92Var.e(i16);
                        } else if (vi2.a(i21, w92Var.f117356a) == 443) {
                            w92Var.e(w92Var.f117357b + 4);
                            int iR = w92Var.r();
                            int i22 = w92Var.f117358c;
                            int i23 = w92Var.f117357b;
                            if (i22 - i23 < iR) {
                                w92Var.e(i16);
                            } else {
                                w92Var.e(i23 + iR);
                                while (true) {
                                    i10 = w92Var.f117358c;
                                    i11 = w92Var.f117357b;
                                    if (i10 - i11 < 4 || (iA = vi2.a(i11, w92Var.f117356a)) == 442 || iA == 441 || (iA >>> 8) != 1) {
                                        break;
                                    }
                                    w92Var.e(w92Var.f117357b + 4);
                                    if (w92Var.f117358c - w92Var.f117357b < 2) {
                                        w92Var.e(i16);
                                        break;
                                    }
                                    w92Var.e(Math.min(w92Var.f117358c, w92Var.f117357b + w92Var.r()));
                                }
                            }
                        } else {
                            while (true) {
                                i10 = w92Var.f117358c;
                                i11 = w92Var.f117357b;
                                if (i10 - i11 < 4) {
                                    break;
                                }
                                break;
                                w92Var.e(Math.min(w92Var.f117358c, w92Var.f117357b + w92Var.r()));
                            }
                        }
                    }
                }
                i12 = w92Var.f117357b;
            }
        }
    }
}
