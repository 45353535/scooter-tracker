package yads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes4.dex */
public class ti1 extends da0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116258b;

    public ti1(IllegalStateException illegalStateException, ui1 ui1Var) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        sb2.append(ui1Var == null ? null : ui1Var.f116659a);
        super(sb2.toString(), illegalStateException);
        this.f116258b = w83.f117341a >= 21 ? a(illegalStateException) : null;
    }

    public static String a(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        return null;
    }
}
