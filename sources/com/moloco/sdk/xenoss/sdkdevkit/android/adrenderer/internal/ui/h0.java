package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h0 {

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57024r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ State f57025s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ State f57026t;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h0$a$a, reason: collision with other inner class name */
        public static final class C0730a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ State f57027b;

            public C0730a(State state) {
                this.f57027b = state;
            }

            public final Object a(int i10, Continuation continuation) {
                h0.d(this.f57027b).invoke();
                return Unit.f93236a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((lf.t) obj).g(), continuation);
            }
        }

        public static final class b implements Flow {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Flow f57028b;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h0$a$b$a, reason: collision with other inner class name */
            public static final class C0731a implements FlowCollector {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f57029b;

                /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h0$a$b$a$a, reason: collision with other inner class name */
                public static final class C0732a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    public /* synthetic */ Object f57030r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    public int f57031s;

                    public C0732a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f57030r = obj;
                        this.f57031s |= Integer.MIN_VALUE;
                        return C0731a.this.emit(null, this);
                    }
                }

                public C0731a(FlowCollector flowCollector) {
                    this.f57029b = flowCollector;
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
                        boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h0.a.b.C0731a.C0732a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h0$a$b$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h0.a.b.C0731a.C0732a) r0
                        int r1 = r0.f57031s
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f57031s = r1
                        goto L18
                    L13:
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h0$a$b$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h0$a$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f57030r
                        java.lang.Object r1 = pf.b.g()
                        int r2 = r0.f57031s
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.d.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.d.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f57029b
                        r2 = r5
                        lf.t r2 = (lf.t) r2
                        int r2 = r2.g()
                        if (r2 != 0) goto L48
                        r0.f57031s = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        kotlin.Unit r5 = kotlin.Unit.f93236a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h0.a.b.C0731a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public b(Flow flow) {
                this.f57028b = flow;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f57028b.collect(new C0731a(flowCollector), continuation);
                return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(State state, State state2, Continuation continuation) {
            super(2, continuation);
            this.f57025s = state;
            this.f57026t = state2;
        }

        public static final lf.t c(State state) {
            return lf.t.a(h0.a(state));
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f57025s, this.f57026t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f57024r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                final State state = this.f57025s;
                b bVar = new b(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h0.a.c(state);
                    }
                }));
                C0730a c0730a = new C0730a(this.f57026t);
                this.f57024r = 1;
                if (bVar.collect(c0730a, this) == objG) {
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

    public static final int a(State state) {
        return ((lf.t) state.getValue()).g();
    }

    public static final Unit b(BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar, boolean z10, boolean z11, Function0 function0, Function0 function02, Function1 function1, Function10 function10, boolean z12, Flow flow, int i10, int i11, Composer composer, int i12) {
        c(boxScope, oVar, z10, z11, function0, function02, function1, function10, z12, flow, composer, i10 | 1, i11);
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final androidx.compose.foundation.layout.BoxScope r22, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o r23, final boolean r24, final boolean r25, final kotlin.jvm.functions.Function0 r26, final kotlin.jvm.functions.Function0 r27, final kotlin.jvm.functions.Function1 r28, final kotlin.jvm.functions.Function10 r29, final boolean r30, kotlinx.coroutines.flow.Flow r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h0.c(androidx.compose.foundation.layout.BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function10, boolean, kotlinx.coroutines.flow.Flow, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Function0 d(State state) {
        return (Function0) state.getValue();
    }
}
