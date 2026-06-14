package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l;
import eg.x1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class y0 implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f58840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.ortb.model.e f58841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0 f58842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f58843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableStateFlow f58844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateFlow f58845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.moloco.sdk.internal.h0 f58846h;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58847r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f58848s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58849t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ l.a f58851v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ long f58852w;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y0$a$a, reason: collision with other inner class name */
        public static final class C0777a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f58853r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ long f58854s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ k0 f58855t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ y0 f58856u;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y0$a$a$a, reason: collision with other inner class name */
            public static final class C0778a extends kotlin.coroutines.jvm.internal.k implements Function2 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public Object f58857r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public int f58858s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ k0 f58859t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ y0 f58860u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0778a(k0 k0Var, y0 y0Var, Continuation continuation) {
                    super(2, continuation);
                    this.f58859t = k0Var;
                    this.f58860u = y0Var;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0778a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0778a(this.f58859t, this.f58860u, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    k0 k0Var;
                    com.moloco.sdk.internal.ortb.model.f ext;
                    Object objG = pf.b.g();
                    int i10 = this.f58858s;
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        k0 k0Var2 = this.f58859t;
                        String mtid = null;
                        if (k0Var2 == null) {
                            return null;
                        }
                        y0 y0Var = this.f58860u;
                        try {
                            o0 o0Var = y0Var.f58842d;
                            com.moloco.sdk.internal.ortb.model.e eVar = y0Var.f58841c;
                            if (eVar != null && (ext = eVar.getExt()) != null) {
                                mtid = ext.getMtid();
                            }
                            this.f58857r = k0Var2;
                            this.f58858s = 1;
                            Object objA = o0Var.a(k0Var2, mtid, this);
                            if (objA == objG) {
                                return objG;
                            }
                            k0Var = k0Var2;
                            obj = objA;
                        } catch (Exception unused) {
                            return k0Var2;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        k0Var = (k0) this.f58857r;
                        try {
                            kotlin.d.b(obj);
                        } catch (Exception unused2) {
                            return k0Var;
                        }
                    }
                    return (k0) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0777a(long j10, k0 k0Var, y0 y0Var, Continuation continuation) {
                super(2, continuation);
                this.f58854s = j10;
                this.f58855t = k0Var;
                this.f58856u = y0Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0777a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0777a(this.f58854s, this.f58855t, this.f58856u, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f58853r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    long j10 = this.f58854s;
                    C0778a c0778a = new C0778a(this.f58855t, this.f58856u, null);
                    this.f58853r = 1;
                    obj = x1.f(j10, c0778a, this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                k0 k0Var = (k0) obj;
                return k0Var == null ? this.f58855t : k0Var;
            }
        }

        public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f58861r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ long f58862s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ y0 f58863t;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y0$a$b$a, reason: collision with other inner class name */
            public static final class C0779a extends kotlin.coroutines.jvm.internal.k implements Function2 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public int f58864r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ y0 f58865s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0779a(y0 y0Var, Continuation continuation) {
                    super(2, continuation);
                    this.f58865s = y0Var;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0779a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0779a(this.f58865s, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = pf.b.g();
                    int i10 = this.f58864r;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.d.b(obj);
                        return obj;
                    }
                    kotlin.d.b(obj);
                    Function1 function1 = this.f58865s.f58843e;
                    this.f58864r = 1;
                    Object objInvoke = function1.invoke(this);
                    return objInvoke == objG ? objG : objInvoke;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j10, y0 y0Var, Continuation continuation) {
                super(2, continuation);
                this.f58862s = j10;
                this.f58863t = y0Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.f58862s, this.f58863t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f58861r;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    return obj;
                }
                kotlin.d.b(obj);
                long j10 = this.f58862s;
                C0779a c0779a = new C0779a(this.f58863t, null);
                this.f58861r = 1;
                Object objF = x1.f(j10, c0779a, this);
                return objF == objG ? objG : objF;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l.a aVar, long j10, Continuation continuation) {
            super(2, continuation);
            this.f58851v = aVar;
            this.f58852w = j10;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = y0.this.new a(this.f58851v, this.f58852w, continuation);
            aVar.f58849t = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r1v10, types: [kotlinx.coroutines.Deferred, kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 290
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public y0(CoroutineScope scope, com.moloco.sdk.internal.ortb.model.e eVar, o0 decLoader, Function1 loadAndReadyMraid) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(decLoader, "decLoader");
        Intrinsics.checkNotNullParameter(loadAndReadyMraid, "loadAndReadyMraid");
        this.f58840b = scope;
        this.f58841c = eVar;
        this.f58842d = decLoader;
        this.f58843e = loadAndReadyMraid;
        MutableStateFlow mutableStateFlowA = hg.l0.a(Boolean.FALSE);
        this.f58844f = mutableStateFlowA;
        this.f58845g = mutableStateFlowA;
        this.f58846h = new h0.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f56028g);
    }

    public final com.moloco.sdk.internal.h0 c() {
        return this.f58846h;
    }

    public final void d(com.moloco.sdk.internal.h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "<set-?>");
        this.f58846h = h0Var;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public StateFlow isLoaded() {
        return this.f58845g;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void j(long j10, l.a aVar) {
        eg.i.d(this.f58840b, null, null, new a(aVar, j10, null), 3, null);
    }
}
