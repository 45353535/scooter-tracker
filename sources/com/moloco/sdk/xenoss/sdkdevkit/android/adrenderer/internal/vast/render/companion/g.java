package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import hg.g0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c f57793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StateFlow f57794d;

    public static final class a implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow f57795b;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g$a$a, reason: collision with other inner class name */
        public static final class C0753a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f57796b;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g$a$a$a, reason: collision with other inner class name */
            public static final class C0754a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public /* synthetic */ Object f57797r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public int f57798s;

                public C0754a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f57797r = obj;
                    this.f57798s |= Integer.MIN_VALUE;
                    return C0753a.this.emit(null, this);
                }
            }

            public C0753a(FlowCollector flowCollector) {
                this.f57796b = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g.a.C0753a.C0754a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g$a$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g.a.C0753a.C0754a) r0
                    int r1 = r0.f57798s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f57798s = r1
                    goto L18
                L13:
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g$a$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f57797r
                    java.lang.Object r1 = pf.b.g()
                    int r2 = r0.f57798s
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.d.b(r6)
                    goto L49
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.d.b(r6)
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f57796b
                    lf.t r5 = (lf.t) r5
                    int r5 = r5.g()
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d$a r5 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h.b(r5)
                    r0.f57798s = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    kotlin.Unit r5 = kotlin.Unit.f93236a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g.a.C0753a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(Flow flow) {
            this.f57795b = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f57795b.collect(new C0753a(flowCollector), continuation);
            return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
        }
    }

    public /* synthetic */ g(int i10, CoroutineScope coroutineScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, coroutineScope);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    public StateFlow l() {
        return this.f57794d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f
    public void reset() {
        this.f57793c.c(this.f57792b);
    }

    public g(int i10, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f57792b = i10;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c(i10, scope, null);
        this.f57793c = cVar;
        this.f57794d = hg.i.T(new a(cVar.b()), scope, g0.a.b(g0.f73226a, 0L, 0L, 3, null), h.c(i10));
    }
}
