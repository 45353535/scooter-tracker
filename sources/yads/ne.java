package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ne {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f113828d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tg f113829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gg1 f113830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt2 f113831c;

    public /* synthetic */ ne() {
        tg tgVar = new tg();
        gg1 gg1Var = new gg1();
        Object obj = vt2.f117186j;
        this(tgVar, gg1Var, ut2.a());
    }

    public final void a(Context context) {
        Object objB;
        hr2 hr2VarA = this.f113831c.a(context);
        boolean z10 = hr2VarA != null && hr2VarA.f111748q0;
        this.f113830b.getClass();
        Boolean bool = (Boolean) gg1.a(context, hg1.f111580h.f111583b);
        if ((bool == null || bool.booleanValue()) && !z10 && f113828d.compareAndSet(false, true)) {
            boolean z11 = !this.f113829a.f116233a.b(context);
            try {
                Result.Companion companion = Result.f93230c;
                AppMetricaLibraryAdapter.activate(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().withAdvIdentifiersTracking(z11).build());
                objB = Result.b(Unit.f93236a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            if (Result.g(objB) != null) {
                boolean z12 = lb1.f113032a;
            }
        }
    }

    public ne(tg tgVar, gg1 gg1Var, vt2 vt2Var) {
        this.f113829a = tgVar;
        this.f113830b = gg1Var;
        this.f113831c = vt2Var;
    }
}
