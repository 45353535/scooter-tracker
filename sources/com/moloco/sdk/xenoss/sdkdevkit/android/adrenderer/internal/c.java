package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import hg.g0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f55925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableStateFlow f55926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateFlow f55927c;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55928r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f55929s;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$a$a, reason: collision with other inner class name */
        public static final class C0689a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f55931r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f55932s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ gg.v f55933t;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c$a$a$a, reason: collision with other inner class name */
            public static final class C0690a implements FlowCollector {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ gg.v f55934b;

                public C0690a(gg.v vVar) {
                    this.f55934b = vVar;
                }

                public final Object a(int i10, Continuation continuation) {
                    Object objW = this.f55934b.w(lf.t.a(i10), continuation);
                    return objW == pf.b.g() ? objW : Unit.f93236a;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return a(((lf.t) obj).g(), continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0689a(gg.v vVar, Continuation continuation) {
                super(2, continuation);
                this.f55933t = vVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(StateFlow stateFlow, Continuation continuation) {
                return ((C0689a) create(stateFlow, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                C0689a c0689a = new C0689a(this.f55933t, continuation);
                c0689a.f55932s = obj;
                return c0689a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f55931r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    StateFlow stateFlow = (StateFlow) this.f55932s;
                    C0690a c0690a = new C0690a(this.f55933t);
                    this.f55931r = 1;
                    if (stateFlow.collect(c0690a, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                throw new lf.g();
            }
        }

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(gg.v vVar, Continuation continuation) {
            return ((a) create(vVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = c.this.new a(continuation);
            aVar.f55929s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f55928r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                gg.v vVar = (gg.v) this.f55929s;
                MutableStateFlow mutableStateFlow = c.this.f55926b;
                C0689a c0689a = new C0689a(vVar, null);
                this.f55928r = 1;
                if (hg.i.l(mutableStateFlow, c0689a, this) == objG) {
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

    public /* synthetic */ c(int i10, CoroutineScope coroutineScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, coroutineScope);
    }

    public final StateFlow b() {
        return this.f55927c;
    }

    public final void c(int i10) {
        this.f55926b.setValue(h0.c(i10, this.f55925a, null, 4, null));
    }

    public c(int i10, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f55925a = scope;
        MutableStateFlow mutableStateFlowA = hg.l0.a(h0.c(i10, scope, null, 4, null));
        this.f55926b = mutableStateFlowA;
        this.f55927c = hg.i.T(hg.i.j(new a(null)), scope, g0.a.b(hg.g0.f73226a, 0L, 0L, 3, null), ((StateFlow) mutableStateFlowA.getValue()).getValue());
    }
}
