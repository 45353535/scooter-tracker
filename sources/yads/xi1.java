package yads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes4.dex */
public final class xi1 extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f117823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ui1 f117824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f117825e;

    public xi1(int i10, yv0 yv0Var, dj1 dj1Var, boolean z10) {
        this("Decoder init failed: [" + i10 + "], " + yv0Var, dj1Var, yv0Var.f118398m, z10, null, a(i10));
    }

    public static String a(int i10) {
        return "com.monetization.ads.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
    }

    public xi1(String str, Throwable th2, String str2, boolean z10, ui1 ui1Var, String str3) {
        super(str, th2);
        this.f117822b = str2;
        this.f117823c = z10;
        this.f117824d = ui1Var;
        this.f117825e = str3;
    }

    public static String a(Exception exc) {
        if (exc instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) exc).getDiagnosticInfo();
        }
        return null;
    }
}
