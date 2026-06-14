package yads;

import io.appmetrica.analytics.IReporter;
import java.util.Map;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class yg implements dm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f118175a;

    public yg(Lazy lazy) {
        this.f118175a = lazy;
    }

    @Override // yads.dm2
    public final void a(zl2 zl2Var) {
        try {
            ((IReporter) this.f118175a.getValue()).reportEvent(zl2Var.f118733a, zl2Var.f118734b);
        } catch (Throwable unused) {
            boolean z10 = lb1.f113032a;
        }
    }

    @Override // yads.dm2
    public final void reportAnr(Map map) {
        try {
            ((IReporter) this.f118175a.getValue()).reportAnr(map);
        } catch (Throwable unused) {
            boolean z10 = lb1.f113032a;
        }
    }

    @Override // yads.nl0
    public final void reportError(String str, Throwable th2) {
        try {
            ((IReporter) this.f118175a.getValue()).reportError(str, th2);
        } catch (Throwable unused) {
            boolean z10 = lb1.f113032a;
        }
    }

    @Override // yads.dm2
    public final void reportUnhandledException(Throwable th2) {
        try {
            ((IReporter) this.f118175a.getValue()).reportUnhandledException(th2);
        } catch (Throwable unused) {
            boolean z10 = lb1.f113032a;
        }
    }
}
