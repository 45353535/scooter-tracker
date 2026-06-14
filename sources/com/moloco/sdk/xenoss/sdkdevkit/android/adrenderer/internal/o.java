package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l;
import eg.x1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.ortb.model.e f56548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f56549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g f56550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0 f56551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f56552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.moloco.sdk.internal.h0 f56553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MutableStateFlow f56554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final StateFlow f56555i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Job f56556j;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56557r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f56558s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ l.a f56560u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f56561v;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o$a$a, reason: collision with other inner class name */
        public static final class C0703a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f56562r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ long f56563s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ k0 f56564t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ o f56565u;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o$a$a$a, reason: collision with other inner class name */
            public static final class C0704a extends kotlin.coroutines.jvm.internal.k implements Function2 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public int f56566r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ k0 f56567s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ o f56568t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0704a(k0 k0Var, o oVar, Continuation continuation) {
                    super(2, continuation);
                    this.f56567s = k0Var;
                    this.f56568t = oVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0704a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0704a(this.f56567s, this.f56568t, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = pf.b.g();
                    int i10 = this.f56566r;
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        k0 k0Var = this.f56567s;
                        if (k0Var == null) {
                            return null;
                        }
                        o oVar = this.f56568t;
                        o0 o0Var = oVar.f56551e;
                        com.moloco.sdk.internal.ortb.model.f ext = oVar.f56548b.getExt();
                        String mtid = ext != null ? ext.getMtid() : null;
                        this.f56566r = 1;
                        obj = o0Var.a(k0Var, mtid, this);
                        if (obj == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.d.b(obj);
                    }
                    return (k0) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0703a(long j10, k0 k0Var, o oVar, Continuation continuation) {
                super(2, continuation);
                this.f56563s = j10;
                this.f56564t = k0Var;
                this.f56565u = oVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0703a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0703a(this.f56563s, this.f56564t, this.f56565u, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f56562r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    long j10 = this.f56563s;
                    C0704a c0704a = new C0704a(this.f56564t, this.f56565u, null);
                    this.f56562r = 1;
                    obj = x1.f(j10, c0704a, this);
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
                return k0Var == null ? this.f56564t : k0Var;
            }
        }

        public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f56569r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ long f56570s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ o f56571t;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o$a$b$a, reason: collision with other inner class name */
            public static final class C0705a extends kotlin.coroutines.jvm.internal.k implements Function2 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public int f56572r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ o f56573s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0705a(o oVar, Continuation continuation) {
                    super(2, continuation);
                    this.f56573s = oVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0705a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0705a(this.f56573s, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = pf.b.g();
                    int i10 = this.f56572r;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.d.b(obj);
                        return obj;
                    }
                    kotlin.d.b(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g gVar = this.f56573s.f56550d;
                    String adm = this.f56573s.f56548b.getAdm();
                    String strA = com.moloco.sdk.internal.ortb.model.j.a(this.f56573s.f56548b);
                    this.f56572r = 1;
                    Object objB = gVar.b(adm, strA, false, this);
                    return objB == objG ? objG : objB;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j10, o oVar, Continuation continuation) {
                super(2, continuation);
                this.f56570s = j10;
                this.f56571t = oVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.f56570s, this.f56571t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f56569r;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    return obj;
                }
                kotlin.d.b(obj);
                long j10 = this.f56570s;
                C0705a c0705a = new C0705a(this.f56571t, null);
                this.f56569r = 1;
                Object objD = x1.d(j10, c0705a, this);
                return objD == objG ? objG : objD;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l.a aVar, long j10, Continuation continuation) {
            super(2, continuation);
            this.f56560u = aVar;
            this.f56561v = j10;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = o.this.new a(this.f56560u, this.f56561v, continuation);
            aVar.f56558s = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r1v10, types: [kotlinx.coroutines.Deferred] */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 282
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f56574r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f56575s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f56576t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ l.a f56578v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ long f56579w;

        public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f56580r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ long f56581s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ k0 f56582t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ o f56583u;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o$b$a$a, reason: collision with other inner class name */
            public static final class C0706a extends kotlin.coroutines.jvm.internal.k implements Function2 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public int f56584r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ k0 f56585s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ o f56586t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0706a(k0 k0Var, o oVar, Continuation continuation) {
                    super(2, continuation);
                    this.f56585s = k0Var;
                    this.f56586t = oVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0706a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0706a(this.f56585s, this.f56586t, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = pf.b.g();
                    int i10 = this.f56584r;
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        k0 k0Var = this.f56585s;
                        if (k0Var == null) {
                            return null;
                        }
                        o oVar = this.f56586t;
                        o0 o0Var = oVar.f56551e;
                        String mtid = oVar.f56548b.getExt().getMtid();
                        this.f56584r = 1;
                        obj = o0Var.a(k0Var, mtid, this);
                        if (obj == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.d.b(obj);
                    }
                    return (k0) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j10, k0 k0Var, o oVar, Continuation continuation) {
                super(2, continuation);
                this.f56581s = j10;
                this.f56582t = k0Var;
                this.f56583u = oVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f56581s, this.f56582t, this.f56583u, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f56580r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    long j10 = this.f56581s;
                    C0706a c0706a = new C0706a(this.f56582t, this.f56583u, null);
                    this.f56580r = 1;
                    obj = x1.f(j10, c0706a, this);
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
                return k0Var == null ? this.f56582t : k0Var;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l.a aVar, long j10, Continuation continuation) {
            super(2, continuation);
            this.f56578v = aVar;
            this.f56579w = j10;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = o.this.new b(this.f56578v, this.f56579w, continuation);
            bVar.f56576t = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 387
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public o(com.moloco.sdk.internal.ortb.model.e bid, CoroutineScope scope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g loadVast, o0 decLoader, boolean z10) {
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(loadVast, "loadVast");
        Intrinsics.checkNotNullParameter(decLoader, "decLoader");
        this.f56548b = bid;
        this.f56549c = scope;
        this.f56550d = loadVast;
        this.f56551e = decLoader;
        this.f56552f = z10;
        this.f56553g = new h0.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f56066b);
        MutableStateFlow mutableStateFlowA = hg.l0.a(Boolean.FALSE);
        this.f56554h = mutableStateFlowA;
        this.f56555i = hg.i.c(mutableStateFlowA);
    }

    public final com.moloco.sdk.internal.h0 c() {
        return this.f56553g;
    }

    public final void d(com.moloco.sdk.internal.h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "<set-?>");
        this.f56553g = h0Var;
    }

    public final void f(Deferred deferred, l.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "VastAdLoad", "Vast AD failed to load: " + cVar, null, false, 12, null);
        Job.a.a(deferred, null, 1, null);
        this.f56553g = new h0.a(cVar);
        if (aVar != null) {
            aVar.a(cVar);
        }
    }

    public final void h(long j10, l.a aVar) {
        Job job = this.f56556j;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f56556j = eg.i.d(this.f56549c, null, null, new a(aVar, j10, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public StateFlow isLoaded() {
        return this.f56555i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void j(long j10, l.a aVar) {
        if (this.f56552f) {
            m(j10, aVar);
        } else {
            h(j10, aVar);
        }
    }

    public final void k(Deferred deferred, l.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        Job.a.a(deferred, null, 1, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f56009c;
        this.f56553g = new h0.a(cVar);
        if (aVar != null) {
            aVar.b(aVar2);
        }
    }

    public final void m(long j10, l.a aVar) {
        Job job = this.f56556j;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f56556j = eg.i.d(this.f56549c, null, null, new b(aVar, j10, null), 3, null);
    }
}
