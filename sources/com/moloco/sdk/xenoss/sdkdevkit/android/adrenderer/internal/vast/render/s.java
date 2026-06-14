package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s;
import hg.g0;
import hg.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f58331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f58332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f58333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t0 f58334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function0 f58335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function0 f58336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MutableStateFlow f58337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final StateFlow f58338i;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58339r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Context f58341t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Integer f58342u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Integer f58343v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Integer num, Integer num2, Continuation continuation) {
            super(2, continuation);
            this.f58341t = context;
            this.f58342u = num;
            this.f58343v = num2;
        }

        public static final Unit c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return s.this.new a(this.f58341t, this.f58342u, this.f58343v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objG = pf.b.g();
            int i10 = this.f58339r;
            k kVar = null;
            try {
            } catch (Exception unused) {
                if (kVar != null) {
                    kVar.destroy();
                }
                s.this.destroy();
            }
            if (i10 == 0) {
                kotlin.d.b(obj);
                a0 a0Var = s.this.f58331b;
                if (a0Var != null) {
                    Context context = this.f58341t;
                    com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = s.this.f58333d;
                    t0 t0Var = s.this.f58334e;
                    Integer num = this.f58342u;
                    int iIntValue = num != null ? num.intValue() : 0;
                    Integer num2 = this.f58343v;
                    int iIntValue2 = num2 != null ? num2.intValue() : 0;
                    Function0 function0 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return s.a.a();
                        }
                    };
                    Function1 function1 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return s.a.c((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) obj2);
                        }
                    };
                    this.f58339r = 1;
                    objB = n.b(a0Var, context, aVar, t0Var, iIntValue, iIntValue2, function0, function1, (384 & 128) != 0 ? false : false, (384 & 256) != 0 ? null : null, this);
                    if (objB == objG) {
                        return objG;
                    }
                }
                s.this.f58337h.setValue(kVar);
                return Unit.f93236a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            objB = obj;
            kVar = (k) objB;
            s.this.f58337h.setValue(kVar);
            return Unit.f93236a;
        }

        public static final Unit a() {
            return Unit.f93236a;
        }
    }

    public static final class b implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow f58344b;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f58345b;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s$b$a$a, reason: collision with other inner class name */
            public static final class C0771a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public /* synthetic */ Object f58346r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public int f58347s;

                public C0771a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f58346r = obj;
                    this.f58347s |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f58345b = flowCollector;
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
                    boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s.b.a.C0771a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s$b$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s.b.a.C0771a) r0
                    int r1 = r0.f58347s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f58347s = r1
                    goto L18
                L13:
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s$b$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f58346r
                    java.lang.Object r1 = pf.b.g()
                    int r2 = r0.f58347s
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
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f58345b
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k) r5
                    if (r5 == 0) goto L3f
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j r5 = r5.k()
                    goto L40
                L3f:
                    r5 = 0
                L40:
                    r0.f58347s = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    kotlin.Unit r5 = kotlin.Unit.f93236a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(Flow flow) {
            this.f58344b = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f58344b.collect(new a(flowCollector), continuation);
            return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
        }
    }

    public s(a0 a0Var, Integer num, Integer num2, String str, CoroutineScope scope, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, t0 externalLinkHandler, Function0 function0, Function0 function02) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        this.f58331b = a0Var;
        this.f58332c = str;
        this.f58333d = customUserEventBuilderService;
        this.f58334e = externalLinkHandler;
        this.f58335f = function0;
        this.f58336g = function02;
        MutableStateFlow mutableStateFlowA = l0.a(null);
        this.f58337h = mutableStateFlowA;
        eg.i.d(scope, null, null, new a(context, num, num2, null), 3, null);
        this.f58338i = hg.i.T(new b(mutableStateFlowA), scope, g0.a.b(g0.f73226a, 0L, 0L, 3, null), null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p
    public StateFlow O() {
        return this.f58338i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        MutableStateFlow mutableStateFlow = this.f58337h;
        k kVar = (k) mutableStateFlow.getValue();
        if (kVar != null) {
            kVar.destroy();
        }
        mutableStateFlow.setValue(null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p
    public void i() {
        Function0 function0 = this.f58336g;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p
    public void u() {
        String str = this.f58332c;
        if (str != null) {
            Function0 function0 = this.f58335f;
            if (function0 != null) {
                function0.invoke();
            }
            this.f58334e.a(str);
        }
    }
}
