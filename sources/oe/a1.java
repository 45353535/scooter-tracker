package oe;

import androidx.collection.SieveCacheKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import pe.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final yh.d f96698a = df.a.a("io.ktor.client.plugins.HttpTimeout");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final pe.b f96699b = pe.i.b("HttpTimeout", a.f96700b, new Function1() { // from class: oe.y0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return a1.d((pe.d) obj);
        }
    });

    /* synthetic */ class a extends kotlin.jvm.internal.a implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f96700b = new a();

        a() {
            super(0, x0.class, "<init>", "<init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final x0 invoke() {
            return new x0(null, null, null, 7, null);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96701r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f96702s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f96703t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Long f96704u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Long f96705v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ Long f96706w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Long l10, Long l11, Long l12, Continuation continuation) {
            super(3, continuation);
            this.f96704u = l10;
            this.f96705v = l11;
            this.f96706w = l12;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m.a aVar, re.d dVar, Continuation continuation) {
            b bVar = new b(this.f96704u, this.f96705v, this.f96706w, continuation);
            bVar.f96702s = aVar;
            bVar.f96703t = dVar;
            return bVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f96701r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            m.a aVar = (m.a) this.f96702s;
            re.d dVar = (re.d) this.f96703t;
            boolean zN = a1.n(dVar);
            w0 w0Var = w0.f96943a;
            x0 x0Var = (x0) dVar.f(w0Var);
            if (x0Var == null && a1.e(this.f96704u, this.f96705v, this.f96706w, zN)) {
                x0 x0Var2 = new x0(null, null, null, 7, null);
                dVar.l(w0Var, x0Var2);
                x0Var = x0Var2;
            }
            if (x0Var != null) {
                Long l10 = this.f96705v;
                Long l11 = this.f96706w;
                Long l12 = this.f96704u;
                Long lB = x0Var.b();
                if (lB != null) {
                    l10 = lB;
                }
                x0Var.e(l10);
                Long lD = x0Var.d();
                if (lD != null) {
                    l11 = lD;
                }
                x0Var.g(l11);
                if (zN) {
                    Long lC = x0Var.c();
                    if (lC != null) {
                        l12 = lC;
                    }
                    x0Var.f(l12);
                    a1.j(aVar, dVar, x0Var.c());
                }
            }
            this.f96702s = null;
            this.f96701r = 1;
            Object objA = aVar.a(dVar, this);
            return objA == objG ? objG : objA;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96707r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Long f96708s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ re.d f96709t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Job f96710u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Long l10, re.d dVar, Job job, Continuation continuation) {
            super(2, continuation);
            this.f96708s = l10;
            this.f96709t = dVar;
            this.f96710u = job;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f96708s, this.f96709t, this.f96710u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f96707r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                long jLongValue = this.f96708s.longValue();
                this.f96707r = 1;
                if (eg.k0.a(jLongValue, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            q0 q0Var = new q0(this.f96709t);
            yh.d dVar = a1.f96698a;
            re.d dVar2 = this.f96709t;
            if (df.b.a(dVar)) {
                dVar.i("Request timeout: " + dVar2.i());
            }
            Job job = this.f96710u;
            String message = q0Var.getMessage();
            Intrinsics.checkNotNull(message);
            kotlinx.coroutines.z.d(job, message, q0Var);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public static final ne.a c(re.e request, Throwable th2) {
        Object objB;
        Intrinsics.checkNotNullParameter(request, "request");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connect timeout has expired [url=");
        sb2.append(request.h());
        sb2.append(", connect_timeout=");
        x0 x0Var = (x0) request.c(w0.f96943a);
        if (x0Var == null || (objB = x0Var.b()) == null) {
            objB = "unknown";
        }
        sb2.append(objB);
        sb2.append(" ms]");
        return new ne.a(sb2.toString(), th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(pe.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.f(pe.m.f98287a, new b(((x0) createClientPlugin.e()).c(), ((x0) createClientPlugin.e()).b(), ((x0) createClientPlugin.e()).d(), null));
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(Long l10, Long l11, Long l12, boolean z10) {
        return ((!z10 || l10 == null) && l11 == null && l12 == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(CoroutineScope coroutineScope, re.d dVar, Long l10) {
        if (l10 == null || l10.longValue() == Long.MAX_VALUE) {
            return;
        }
        final Job jobD = eg.i.d(coroutineScope, new eg.e0("request-timeout"), null, new c(l10, dVar, dVar.g(), null), 2, null);
        dVar.g().q(new Function1() { // from class: oe.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a1.k(jobD, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Job job, Throwable th2) {
        Job.a.a(job, null, 1, null);
        return Unit.f93236a;
    }

    public static final int l(long j10) {
        if (j10 == Long.MAX_VALUE) {
            return 0;
        }
        if (j10 < SieveCacheKt.NodeMetaAndPreviousMask) {
            return Integer.MIN_VALUE;
        }
        if (j10 > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        return (int) j10;
    }

    public static final pe.b m() {
        return f96699b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(re.d dVar) {
        if (ve.u0.b(dVar.i().o())) {
            return false;
        }
        dVar.d();
        dVar.d();
        return true;
    }

    public static final void o(re.d dVar, Function1 block) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        w0 w0Var = w0.f96943a;
        x0 x0Var = new x0(null, null, null, 7, null);
        block.invoke(x0Var);
        dVar.l(w0Var, x0Var);
    }
}
