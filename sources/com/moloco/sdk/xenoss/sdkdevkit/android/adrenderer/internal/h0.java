package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import hg.g0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h0 {

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56147r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f56148s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f56149t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f56150u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, Continuation continuation) {
            super(2, continuation);
            this.f56150u = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f56150u, continuation);
            aVar.f56149t = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0073 -> B:16:0x0049). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r7.f56148s
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L24
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                int r1 = r7.f56147r
                java.lang.Object r4 = r7.f56149t
                kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
                kotlin.d.b(r8)
                goto L5f
            L24:
                int r1 = r7.f56147r
                java.lang.Object r4 = r7.f56149t
                kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
                kotlin.d.b(r8)
                goto L49
            L2e:
                kotlin.d.b(r8)
                java.lang.Object r8 = r7.f56149t
                kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
                int r1 = r7.f56150u
                lf.t r5 = lf.t.a(r1)
                r7.f56149t = r8
                r7.f56147r = r1
                r7.f56148s = r4
                java.lang.Object r4 = r8.emit(r5, r7)
                if (r4 != r0) goto L48
                goto L75
            L48:
                r4 = r8
            L49:
                r8 = 0
                int r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g0.a(r1, r8)
                if (r8 <= 0) goto L76
                r7.f56149t = r4
                r7.f56147r = r1
                r7.f56148s = r3
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r8 = eg.k0.a(r5, r7)
                if (r8 != r0) goto L5f
                goto L75
            L5f:
                int r1 = r1 + (-1)
                int r1 = lf.t.c(r1)
                lf.t r8 = lf.t.a(r1)
                r7.f56149t = r4
                r7.f56147r = r1
                r7.f56148s = r2
                java.lang.Object r8 = r4.emit(r8, r7)
                if (r8 != r0) goto L49
            L75:
                return r0
            L76:
                kotlin.Unit r8 = kotlin.Unit.f93236a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f56151r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f56152s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f56153t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.t0 f56154u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Flow f56155v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.t0 f56156w;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.t0 f56157b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef f56158c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ gg.v f56159d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.t0 f56160e;

            public a(kotlin.jvm.internal.t0 t0Var, Ref$ObjectRef ref$ObjectRef, gg.v vVar, kotlin.jvm.internal.t0 t0Var2) {
                this.f56157b = t0Var;
                this.f56158c = ref$ObjectRef;
                this.f56159d = vVar;
                this.f56160e = t0Var2;
            }

            public final Object a(boolean z10, Continuation continuation) {
                if (z10) {
                    b.l(this.f56157b, this.f56158c, this.f56159d, this.f56160e);
                } else {
                    b.m(this.f56158c);
                }
                return Unit.f93236a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0$b$b, reason: collision with other inner class name */
        public static final class C0695b extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f56161r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.t0 f56162s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef f56163t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.t0 f56164u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ gg.v f56165v;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0$b$b$a */
            public static final class a implements FlowCollector {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ kotlin.jvm.internal.t0 f56166b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ kotlin.jvm.internal.t0 f56167c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ gg.v f56168d;

                public a(kotlin.jvm.internal.t0 t0Var, kotlin.jvm.internal.t0 t0Var2, gg.v vVar) {
                    this.f56166b = t0Var;
                    this.f56167c = t0Var2;
                    this.f56168d = vVar;
                }

                public final Object a(int i10, Continuation continuation) {
                    this.f56166b.f93331b = i10;
                    kotlin.jvm.internal.t0 t0Var = this.f56167c;
                    if (i10 == t0Var.f93331b) {
                        return Unit.f93236a;
                    }
                    t0Var.f93331b = i10;
                    Object objW = this.f56168d.w(lf.t.a(i10), continuation);
                    return objW == pf.b.g() ? objW : Unit.f93236a;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return a(((lf.t) obj).g(), continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0695b(kotlin.jvm.internal.t0 t0Var, Ref$ObjectRef ref$ObjectRef, kotlin.jvm.internal.t0 t0Var2, gg.v vVar, Continuation continuation) {
                super(2, continuation);
                this.f56162s = t0Var;
                this.f56163t = ref$ObjectRef;
                this.f56164u = t0Var2;
                this.f56165v = vVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0695b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0695b(this.f56162s, this.f56163t, this.f56164u, this.f56165v, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f56161r;
                try {
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        Flow flowA = h0.a(this.f56162s.f93331b);
                        a aVar = new a(this.f56162s, this.f56164u, this.f56165v);
                        this.f56161r = 1;
                        if (flowA.collect(aVar, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.d.b(obj);
                    }
                    this.f56163t.f93280b = null;
                    return Unit.f93236a;
                } catch (Throwable th2) {
                    this.f56163t.f93280b = null;
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.jvm.internal.t0 t0Var, Flow flow, kotlin.jvm.internal.t0 t0Var2, Continuation continuation) {
            super(2, continuation);
            this.f56154u = t0Var;
            this.f56155v = flow;
            this.f56156w = t0Var2;
        }

        public static final Unit k(Ref$ObjectRef ref$ObjectRef) {
            m(ref$ObjectRef);
            return Unit.f93236a;
        }

        public static final void l(kotlin.jvm.internal.t0 t0Var, Ref$ObjectRef ref$ObjectRef, gg.v vVar, kotlin.jvm.internal.t0 t0Var2) {
            if (t0Var.f93331b == 0 || ref$ObjectRef.f93280b != null) {
                return;
            }
            ref$ObjectRef.f93280b = eg.i.d(vVar, null, null, new C0695b(t0Var, ref$ObjectRef, t0Var2, vVar, null), 3, null);
        }

        public static final void m(Ref$ObjectRef ref$ObjectRef) {
            Job job = (Job) ref$ObjectRef.f93280b;
            if (job != null) {
                Job.a.a(job, null, 1, null);
            }
            ref$ObjectRef.f93280b = null;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(gg.v vVar, Continuation continuation) {
            return ((b) create(vVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.f56154u, this.f56155v, this.f56156w, continuation);
            bVar.f56153t = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
        
            if (gg.t.b(r4, r9, r8) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
        
            if (r9.collect(r3, r8) == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r8.f56152s
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1a:
                kotlin.d.b(r9)
                goto L84
            L1e:
                java.lang.Object r1 = r8.f56151r
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                java.lang.Object r4 = r8.f56153t
                gg.v r4 = (gg.v) r4
                kotlin.d.b(r9)
                goto L4c
            L2a:
                kotlin.d.b(r9)
                java.lang.Object r9 = r8.f56153t
                gg.v r9 = (gg.v) r9
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                kotlin.jvm.internal.t0 r5 = r8.f56154u
                int r5 = r5.f93331b
                lf.t r5 = lf.t.a(r5)
                r8.f56153t = r9
                r8.f56151r = r1
                r8.f56152s = r4
                java.lang.Object r4 = r9.w(r5, r8)
                if (r4 != r0) goto L4b
                goto L83
            L4b:
                r4 = r9
            L4c:
                kotlinx.coroutines.flow.Flow r9 = r8.f56155v
                r5 = 0
                if (r9 != 0) goto L6a
                kotlin.jvm.internal.t0 r9 = r8.f56156w
                kotlin.jvm.internal.t0 r2 = r8.f56154u
                l(r9, r1, r4, r2)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0 r9 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0
                r9.<init>()
                r8.f56153t = r5
                r8.f56151r = r5
                r8.f56152s = r3
                java.lang.Object r9 = gg.t.b(r4, r9, r8)
                if (r9 != r0) goto L84
                goto L83
            L6a:
                kotlinx.coroutines.flow.Flow r9 = hg.i.p(r9)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0$b$a r3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0$b$a
                kotlin.jvm.internal.t0 r6 = r8.f56156w
                kotlin.jvm.internal.t0 r7 = r8.f56154u
                r3.<init>(r6, r1, r4, r7)
                r8.f56153t = r5
                r8.f56151r = r5
                r8.f56152s = r2
                java.lang.Object r9 = r9.collect(r3, r8)
                if (r9 != r0) goto L84
            L83:
                return r0
            L84:
                kotlin.Unit r9 = kotlin.Unit.f93236a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Flow a(int i10) {
        return hg.i.B(new a(i10, null));
    }

    public static final StateFlow b(int i10, CoroutineScope scope, Flow flow) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.t0 t0Var = new kotlin.jvm.internal.t0();
        t0Var.f93331b = i10;
        kotlin.jvm.internal.t0 t0Var2 = new kotlin.jvm.internal.t0();
        t0Var2.f93331b = i10;
        return hg.i.T(hg.i.j(new b(t0Var2, flow, t0Var, null)), scope, g0.a.b(hg.g0.f73226a, 0L, 0L, 3, null), lf.t.a(i10));
    }

    public static /* synthetic */ StateFlow c(int i10, CoroutineScope coroutineScope, Flow flow, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            flow = null;
        }
        return b(i10, coroutineScope, flow);
    }
}
