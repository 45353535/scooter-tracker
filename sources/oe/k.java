package oe;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import ve.g;
import ye.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final yh.d f96791a = df.a.a("io.ktor.client.plugins.defaultTransformers");

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96792r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f96793s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f96794t;

        /* JADX INFO: renamed from: oe.k$a$a, reason: collision with other inner class name */
        public static final class C1115a extends c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ve.g f96795a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final long f96796b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f96797c;

            C1115a(ve.g gVar, Object obj) {
                this.f96797c = obj;
                this.f96795a = gVar == null ? g.a.f106629a.a() : gVar;
                this.f96796b = ((byte[]) obj).length;
            }

            @Override // ye.c
            public Long a() {
                return Long.valueOf(this.f96796b);
            }

            @Override // ye.c
            public ve.g b() {
                return this.f96795a;
            }

            @Override // ye.c.a
            public byte[] d() {
                return (byte[]) this.f96797c;
            }
        }

        public static final class b extends c.AbstractC1337c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Long f96798a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ve.g f96799b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f96800c;

            b(ef.e eVar, ve.g gVar, Object obj) {
                this.f96800c = obj;
                String strJ = ((re.d) eVar.b()).getHeaders().j(ve.u.f106718a.g());
                this.f96798a = strJ != null ? Long.valueOf(Long.parseLong(strJ)) : null;
                this.f96799b = gVar == null ? g.a.f106629a.a() : gVar;
            }

            @Override // ye.c
            public Long a() {
                return this.f96798a;
            }

            @Override // ye.c
            public ve.g b() {
                return this.f96799b;
            }

            @Override // ye.c.AbstractC1337c
            public io.ktor.utils.io.e d() {
                return (io.ktor.utils.io.e) this.f96800c;
            }
        }

        a(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ef.e eVar, Object obj, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f96793s = eVar;
            aVar.f96794t = obj;
            return aVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ye.c c1115a;
            Object objG = pf.b.g();
            int i10 = this.f96792r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                ef.e eVar = (ef.e) this.f96793s;
                Object obj2 = this.f96794t;
                ve.p headers = ((re.d) eVar.b()).getHeaders();
                ve.u uVar = ve.u.f106718a;
                if (headers.j(uVar.c()) == null) {
                    ((re.d) eVar.b()).getHeaders().e(uVar.c(), "*/*");
                }
                ve.g gVarD = ve.y.d((ve.x) eVar.b());
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (gVarD == null) {
                        gVarD = g.d.f106662a.a();
                    }
                    c1115a = new ye.e(str, gVarD, null, 4, null);
                } else {
                    c1115a = obj2 instanceof byte[] ? new C1115a(gVarD, obj2) : obj2 instanceof io.ktor.utils.io.e ? new b(eVar, gVarD, obj2) : obj2 instanceof ye.c ? (ye.c) obj2 : m.a(gVarD, (re.d) eVar.b(), obj2);
                }
                if ((c1115a != null ? c1115a.b() : null) != null) {
                    ((re.d) eVar.b()).getHeaders().l(uVar.i());
                    k.f96791a.i("Transformed with default transformers request body for " + ((re.d) eVar.b()).i() + " from " + kotlin.jvm.internal.v0.b(obj2.getClass()));
                    this.f96793s = null;
                    this.f96792r = 1;
                    if (eVar.e(c1115a, this) == objG) {
                        return objG;
                    }
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

    static final class b extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f96801r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f96802s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f96803t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private /* synthetic */ Object f96804u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f96805v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ ie.c f96806w;

        static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f96807r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f96808s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Object f96809t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ se.c f96810u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, se.c cVar, Continuation continuation) {
                super(2, continuation);
                this.f96809t = obj;
                this.f96810u = cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(io.ktor.utils.io.i0 i0Var, Continuation continuation) {
                return ((a) create(i0Var, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.f96809t, this.f96810u, continuation);
                aVar.f96808s = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f96807r;
                try {
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        io.ktor.utils.io.i0 i0Var = (io.ktor.utils.io.i0) this.f96808s;
                        io.ktor.utils.io.e eVar = (io.ktor.utils.io.e) this.f96809t;
                        io.ktor.utils.io.k kVarA = i0Var.a();
                        this.f96807r = 1;
                        obj = io.ktor.utils.io.h.c(eVar, kVarA, Long.MAX_VALUE, this);
                        if (obj == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.d.b(obj);
                    }
                    ((Number) obj).longValue();
                    return Unit.f93236a;
                } catch (CancellationException e10) {
                    kotlinx.coroutines.i.d(this.f96810u, e10);
                    throw e10;
                } catch (Throwable th2) {
                    kotlinx.coroutines.i.c(this.f96810u, "Receive failed", th2);
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ie.c cVar, Continuation continuation) {
            super(3, continuation);
            this.f96806w = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit j(eg.s sVar, Throwable th2) {
            sVar.complete();
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ef.e eVar, se.d dVar, Continuation continuation) {
            b bVar = new b(this.f96806w, continuation);
            bVar.f96804u = eVar;
            bVar.f96805v = dVar;
            return bVar.invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01db  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x033e  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0346  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) throws ve.a {
            /*
                Method dump skipped, instruction units count: 918
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: oe.k.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void b(ie.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        cVar.s().l(re.g.f99440g.b(), new a(null));
        cVar.w().l(se.f.f100026g.a(), new b(cVar, null));
        m.b(cVar);
    }
}
