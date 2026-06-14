package oe;

import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import pe.m;
import ve.c0;
import ve.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f96720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final yh.d f96721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ue.a f96722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final pe.b f96723d;

    /* synthetic */ class a extends kotlin.jvm.internal.y implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f96724b = new a();

        a() {
            super(0, a0.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final a0 invoke() {
            return new a0();
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96725r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f96726s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f96727t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ boolean f96728u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f96729v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ pe.d f96730w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, boolean z11, pe.d dVar, Continuation continuation) {
            super(3, continuation);
            this.f96728u = z10;
            this.f96729v = z11;
            this.f96730w = dVar;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m.a aVar, re.d dVar, Continuation continuation) {
            b bVar = new b(this.f96728u, this.f96729v, this.f96730w, continuation);
            bVar.f96726s = aVar;
            bVar.f96727t = dVar;
            return bVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            re.d dVar;
            m.a aVar;
            Object objG = pf.b.g();
            int i10 = this.f96725r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                m.a aVar2 = (m.a) this.f96726s;
                dVar = (re.d) this.f96727t;
                this.f96726s = aVar2;
                this.f96727t = dVar;
                this.f96725r = 1;
                Object objA = aVar2.a(dVar, this);
                if (objA != objG) {
                    aVar = aVar2;
                    obj = objA;
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            dVar = (re.d) this.f96727t;
            aVar = (m.a) this.f96726s;
            kotlin.d.b(obj);
            re.d dVar2 = dVar;
            je.b bVar = (je.b) obj;
            if (this.f96728u && !c0.f96720a.contains(bVar.d().getMethod())) {
                return bVar;
            }
            boolean z10 = this.f96729v;
            ie.c cVarB = this.f96730w.b();
            this.f96726s = null;
            this.f96727t = null;
            this.f96725r = 2;
            Object objC = c0.c(aVar, dVar2, bVar, z10, cVarB, this);
            return objC == objG ? objG : objC;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {
        /* synthetic */ Object A;
        int B;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f96731r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f96732s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f96733t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f96734u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f96735v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f96736w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f96737x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Object f96738y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        boolean f96739z;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.B |= Integer.MIN_VALUE;
            return c0.c(null, null, null, false, null, this);
        }
    }

    static {
        z.a aVar = ve.z.f106771b;
        f96720a = SetsKt.setOf((Object[]) new ve.z[]{aVar.b(), aVar.c()});
        f96721b = df.a.a("io.ktor.client.plugins.HttpRedirect");
        f96722c = new ue.a();
        f96723d = pe.i.b("HttpRedirect", a.f96724b, new Function1() { // from class: oe.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c0.b((pe.d) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(pe.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.f(pe.m.f98287a, new b(((a0) createClientPlugin.e()).b(), ((a0) createClientPlugin.e()).a(), createClientPlugin, null));
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0196 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0197 -> B:35:0x019e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(pe.m.a r17, re.d r18, je.b r19, boolean r20, ie.c r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.c0.c(pe.m$a, re.d, je.b, boolean, ie.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final pe.b f() {
        return f96723d;
    }

    private static final boolean g(ve.c0 c0Var) {
        int iE0 = c0Var.e0();
        c0.a aVar = ve.c0.f106561d;
        return iE0 == aVar.s().e0() || iE0 == aVar.k().e0() || iE0 == aVar.S().e0() || iE0 == aVar.F().e0() || iE0 == aVar.O().e0();
    }
}
