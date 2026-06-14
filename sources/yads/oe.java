package yads;

import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class oe implements wf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f114280b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f114281a;

    public oe(Executor executor) {
        this.f114281a = executor;
    }

    public static void a(uf ufVar) {
        ufVar.a();
        ufVar.b();
        boolean z10 = lb1.f113032a;
    }

    public final void b(final uf ufVar) {
        this.f114281a.execute(new Runnable() { // from class: yads.rz
            @Override // java.lang.Runnable
            public final void run() {
                oe.a(this.f115647b, ufVar);
            }
        });
    }

    public static final void a(oe oeVar, uf ufVar) {
        Object objB;
        oeVar.getClass();
        a(ufVar);
        try {
            Result.Companion companion = Result.f93230c;
            AppMetricaLibraryAdapter.reportEvent("ads_sdk", ufVar.f116628a, ufVar.f116629b);
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.g(objB) != null) {
            boolean z10 = lb1.f113032a;
        }
    }
}
