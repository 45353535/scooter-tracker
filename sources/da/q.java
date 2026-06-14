package da;

import android.media.MediaCodec;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public class q extends t9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f68539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f68540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f68541d;

    public q(Throwable th2, r rVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Decoder failed: ");
        sb2.append(rVar == null ? null : rVar.f68542a);
        super(sb2.toString(), th2);
        this.f68539b = rVar;
        String diagnosticInfo = th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null;
        this.f68540c = diagnosticInfo;
        this.f68541d = o0.f98837a >= 23 ? a(th2) : o0.c0(diagnosticInfo);
    }

    private static int a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getErrorCode();
        }
        return 0;
    }
}
