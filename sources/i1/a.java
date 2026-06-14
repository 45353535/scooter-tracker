package i1;

import e1.c;
import eg.g;
import eg.o0;
import f1.cc;
import f1.eg;
import f1.te;
import hh.a0;
import hh.v;
import hh.w;
import hh.x;
import hh.z;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements cc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0915a f73861b = new C0915a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile v f73862c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f73863a;

    /* JADX INFO: renamed from: i1.a$a, reason: collision with other inner class name */
    public static final class C0915a {
        public /* synthetic */ C0915a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0915a() {
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f73864r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f73865s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f73867u;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f73865s = obj;
            this.f73867u |= Integer.MIN_VALUE;
            return a.this.c(null, this);
        }
    }

    public static final class c extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f73868r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f73870t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Map f73871u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Map map, Continuation continuation) {
            super(2, continuation);
            this.f73870t = str;
            this.f73871u = map;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new c(this.f73870t, this.f73871u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f73868r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            a aVar = a.this;
            String str = this.f73870t;
            Map map = this.f73871u;
            this.f73868r = 1;
            Object objF = a.f(aVar, str, map, "GET", null, this, 8, null);
            return objF == objG ? objG : objF;
        }
    }

    public static final class d extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f73872r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f73873s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f73874t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ a f73875u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f73876v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Map f73877w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, a aVar, String str3, Map map, Continuation continuation) {
            super(2, continuation);
            this.f73873s = str;
            this.f73874t = str2;
            this.f73875u = aVar;
            this.f73876v = str3;
            this.f73877w = map;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f73873s, this.f73874t, this.f73875u, this.f73876v, this.f73877w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f73872r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            w.a aVar = w.f73770e;
            String str = this.f73873s;
            if (str == null) {
                str = "application/json; charset=utf-8";
            }
            a0 a0VarH = a0.Companion.h(this.f73874t, aVar.a(str));
            a aVar2 = this.f73875u;
            String str2 = this.f73876v;
            Map map = this.f73877w;
            this.f73872r = 1;
            Object objG2 = aVar2.g(str2, map, "POST", a0VarH, this);
            return objG2 == objG ? objG : objG2;
        }
    }

    public a(long j10, long j11, long j12) {
        x.a aVar = new x.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        x.a aVarO = aVar.e(j10, timeUnit).Q(j11, timeUnit).O(j12, timeUnit);
        v vVar = f73862c;
        if (vVar != null) {
            eg.e("Adding custom networking interceptor: " + vVar.getClass().getSimpleName(), null, 2, null);
            aVarO.a(vVar);
        }
        this.f73863a = aVarO.c();
    }

    public static /* synthetic */ Object f(a aVar, String str, Map map, String str2, a0 a0Var, Continuation continuation, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            a0Var = null;
        }
        return aVar.g(str, map, str2, a0Var, continuation);
    }

    @Override // f1.cc
    public Object a(String str, String str2, Map map, String str3, Continuation continuation) {
        return g.g(o0.b(), new d(str3, str2, this, str, map, null), continuation);
    }

    @Override // f1.cc
    public Object b(String str, Map map, Continuation continuation) {
        return g.g(o0.b(), new c(str, map, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(hh.z r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.a.c(hh.z, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object g(String str, Map map, String str2, a0 a0Var, Continuation continuation) {
        try {
            z.a aVarH = new z.a().n(str).h(str2, a0Var);
            for (Map.Entry entry : map.entrySet()) {
                aVarH.a((String) entry.getKey(), (String) entry.getValue());
            }
            return c(aVarH.b(), continuation);
        } catch (IllegalArgumentException e10) {
            eg.d("Invalid URL: " + str, e10);
            String message = e10.getMessage();
            if (message == null) {
                message = "malformed URL";
            }
            return new te(false, -1, null, new c.a.e("Invalid URL: " + message, e10), null, 20, null);
        }
    }

    public /* synthetic */ a(long j10, long j11, long j12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 5L : j10, (i10 & 2) != 0 ? 5L : j11, (i10 & 4) != 0 ? 5L : j12);
    }
}
