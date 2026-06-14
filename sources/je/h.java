package je;

import kotlin.jvm.internal.Intrinsics;
import ve.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static final void a(Long l10, long j10, z method) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (l10 == null || l10.longValue() < 0 || Intrinsics.areEqual(method, z.f106771b.c()) || l10.longValue() == j10) {
            return;
        }
        throw new IllegalStateException(("Content-Length mismatch: expected " + l10 + " bytes, but received " + j10 + " bytes").toString());
    }
}
