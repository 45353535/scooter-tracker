package com.appodeal.ads.utils.session;

import android.os.SystemClock;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.context.ActivityProvider;
import eg.e0;
import eg.o0;
import hg.l0;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements g, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f15099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f15100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f15101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.appodeal.ads.context.o f15102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d0 f15103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f15104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MutableStateFlow f15105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Job f15106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lazy f15107i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final MutableStateFlow f15108j;

    public q(CoroutineScope scope, com.appodeal.ads.context.o contextProvider, d0 sessionsInteractor, s sessionReporter) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(sessionsInteractor, "sessionsInteractor");
        Intrinsics.checkNotNullParameter(sessionReporter, "sessionReporter");
        this.f15099a = sessionReporter;
        this.f15100b = new d();
        this.f15101c = scope;
        this.f15102d = contextProvider;
        this.f15103e = sessionsInteractor;
        this.f15104f = new AtomicBoolean(false);
        this.f15105g = l0.a(h.f15076b);
        this.f15107i = lf.i.a(new Function0() { // from class: com.appodeal.ads.utils.session.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q.e(this.f15098b);
            }
        });
        this.f15108j = l0.a(Boolean.TRUE);
    }

    @Override // com.appodeal.ads.utils.session.s
    public final long a() {
        return this.f15099a.a();
    }

    @Override // com.appodeal.ads.utils.session.s
    public final void b() {
        this.f15099a.b();
    }

    @Override // com.appodeal.ads.utils.session.s
    public final StateFlow c() {
        return this.f15099a.c();
    }

    @Override // com.appodeal.ads.utils.session.s
    public final void d() {
        this.f15099a.d();
    }

    @Override // com.appodeal.ads.utils.session.s
    public final StateFlow e() {
        return this.f15099a.e();
    }

    @Override // com.appodeal.ads.utils.session.g
    public final f f() {
        if (!this.f15104f.get()) {
            return null;
        }
        d(false);
        return (f) ((MutableStateFlow) this.f15107i.getValue()).getValue();
    }

    @Override // com.appodeal.ads.utils.session.s
    public final void g() {
        this.f15099a.g();
    }

    public final void h() {
        Object value;
        MutableStateFlow mutableStateFlow = (MutableStateFlow) this.f15107i.getValue();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value, this.f15103e.b((f) value, ((Number) this.f15099a.c().getValue()).intValue())));
        if (((f) ((MutableStateFlow) this.f15107i.getValue()).getValue()).e().size() >= ((Number) this.f15099a.c().getValue()).intValue()) {
            this.f15099a.g();
        }
        LogExtKt.logInternal$default("SessionTracker", "New session started: " + ((f) ((MutableStateFlow) this.f15107i.getValue()).getValue()).a().b(), null, 4, null);
    }

    public static final MutableStateFlow e(q qVar) {
        return l0.a(qVar.f15103e.a(((Number) qVar.f15099a.c().getValue()).intValue()));
    }

    @Override // com.appodeal.ads.utils.session.s
    public final void a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f15099a.a(jsonObject);
    }

    public final void b(ActivityProvider.LifecycleCallback lifecycleCallback) {
        Object value;
        Intrinsics.checkNotNullParameter(lifecycleCallback, "lifecycleCallback");
        Intrinsics.checkNotNullParameter(lifecycleCallback, "lifecycleCallback");
        d dVar = this.f15100b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(lifecycleCallback, "lifecycleCallback");
        MutableStateFlow mutableStateFlow = dVar.f15062a;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value, SetsKt.plus((Set<? extends ActivityProvider.LifecycleCallback>) value, lifecycleCallback)));
    }

    public final void d(boolean z10) {
        Object value;
        f fVarB;
        if (this.f15104f.get()) {
            MutableStateFlow mutableStateFlow = (MutableStateFlow) this.f15107i.getValue();
            do {
                value = mutableStateFlow.getValue();
                f currentSessionInfo = (f) value;
                d0 d0Var = this.f15103e;
                d0Var.getClass();
                Intrinsics.checkNotNullParameter(currentSessionInfo, "currentSessionInfo");
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                e eVar = currentSessionInfo.f15074b;
                long j10 = eVar.f15070g;
                long j11 = j10 != 0 ? jCurrentTimeMillis - j10 : 0L;
                long j12 = eVar.f15071h;
                long j13 = j12 != 0 ? jElapsedRealtime - j12 : 0L;
                b bVar = currentSessionInfo.f15073a;
                b bVarB = b.b(bVar, 0, bVar.f15053b + j11, bVar.f15054c + j13, 9);
                e eVar2 = currentSessionInfo.f15074b;
                Long lValueOf = Long.valueOf(jCurrentTimeMillis);
                if (z10) {
                    lValueOf = null;
                }
                long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
                Long lValueOf2 = Long.valueOf(jElapsedRealtime);
                if (z10) {
                    lValueOf2 = null;
                }
                long jLongValue2 = lValueOf2 != null ? lValueOf2.longValue() : 0L;
                e eVar3 = currentSessionInfo.f15074b;
                fVarB = f.b(currentSessionInfo, bVarB, e.a(eVar2, eVar3.f15068e + j11, eVar3.f15069f + j13, jLongValue, jLongValue2, 0L, 271), null, 4);
                eg.i.d(kotlinx.coroutines.i.a(o0.b().plus(new e0("ApdSessionsInteractor"))), null, null, new a0(d0Var, fVarB.f15073a, fVarB.f15074b, null), 3, null);
            } while (!mutableStateFlow.b(value, fVarB));
        }
    }
}
