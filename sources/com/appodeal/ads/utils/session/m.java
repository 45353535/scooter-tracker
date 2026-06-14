package com.appodeal.ads.utils.session;

import android.os.SystemClock;
import com.appodeal.ads.modules.common.internal.context.ActivityProvider;
import com.vungle.ads.internal.protos.Sdk;
import eg.e0;
import eg.o0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15090r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f15091s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f15092t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ q f15093u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f15094v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Ref$ObjectRef ref$ObjectRef, q qVar, Ref$BooleanRef ref$BooleanRef, Continuation continuation) {
        super(2, continuation);
        this.f15092t = ref$ObjectRef;
        this.f15093u = qVar;
        this.f15094v = ref$BooleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        m mVar = new m(this.f15092t, this.f15093u, this.f15094v, continuation);
        mVar.f15091s = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((ActivityProvider.State) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        f fVar;
        Object objG = pf.b.g();
        int i10 = this.f15090r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            ActivityProvider.State state = (ActivityProvider.State) this.f15091s;
            Job job = (Job) this.f15092t.f93280b;
            if (job != null) {
                Job.a.a(job, null, 1, null);
            }
            boolean z10 = this.f15093u.f15102d.getResumedActivity() != null;
            if (z10) {
                Ref$BooleanRef ref$BooleanRef = this.f15094v;
                if (ref$BooleanRef.f93279b) {
                    ref$BooleanRef.f93279b = false;
                } else {
                    MutableStateFlow mutableStateFlow = (MutableStateFlow) this.f15093u.f15107i.getValue();
                    do {
                        value2 = mutableStateFlow.getValue();
                        fVar = (f) value2;
                    } while (!mutableStateFlow.b(value2, f.b(fVar, null, e.a(fVar.f15074b, 0L, 0L, System.currentTimeMillis(), SystemClock.elapsedRealtime(), 0L, Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE), null, 5)));
                }
                q qVar = this.f15093u;
                MutableStateFlow mutableStateFlow2 = qVar.f15105g;
                do {
                    value = mutableStateFlow2.getValue();
                    if (((h) value) == h.f15077c) {
                        qVar.h();
                    }
                } while (!mutableStateFlow2.b(value, h.f15076b));
            } else {
                this.f15093u.d(true);
                Ref$ObjectRef ref$ObjectRef = this.f15092t;
                q qVar2 = this.f15093u;
                ref$ObjectRef.f93280b = eg.i.d(qVar2.f15101c, null, null, new l(qVar2, null), 3, null);
            }
            this.f15093u.f15108j.setValue(kotlin.coroutines.jvm.internal.b.a(z10));
            q qVar3 = this.f15093u;
            this.f15090r = 1;
            d dVar = qVar3.f15100b;
            dVar.getClass();
            Object objG2 = eg.g.g(o0.c().plus(new e0("ApdLifecycleCallbacks")), new c(dVar, state, null), this);
            if (objG2 != pf.b.g()) {
                objG2 = Unit.f93236a;
            }
            if (objG2 == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        return Unit.f93236a;
    }
}
