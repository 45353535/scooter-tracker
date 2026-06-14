package f1;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class s9 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f71065l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f71066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f71067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f71068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f71069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f71070e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public va f71072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Function0 f71073h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f71071f = b.f71081f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ob f71074i = ob.f70733c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f71075j = "Reward in %d seconds";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final eg.s f71076k = eg.m1.b(null, 1, null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f71077b = new b("STARTED", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f71078c = new b("PAUSED", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f71079d = new b("STOPPED", 2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f71080e = new b("COMPLETED", 3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f71081f = new b("NOT_STARTED", 4);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ b[] f71082g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f71083h;

        static {
            b[] bVarArrD = d();
            f71082g = bVarArrD;
            f71083h = qf.a.a(bVarArrD);
        }

        public b(String str, int i10) {
        }

        public static final /* synthetic */ b[] d() {
            return new b[]{f71077b, f71078c, f71079d, f71080e, f71081f};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f71082g.clone();
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71084a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f71081f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f71078c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f71079d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f71084a = iArr;
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f71085r;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return s9.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f71085r;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            do {
                if (s9.this.m() == b.f71077b) {
                    long jUptimeMillis = (SystemClock.uptimeMillis() - s9.this.f71068c) - s9.this.f71069d;
                    s9 s9Var = s9.this;
                    s9Var.f71067b = kotlin.ranges.g.f(s9Var.f71066a - jUptimeMillis, 0L);
                    va vaVarK = s9.this.k();
                    if (vaVarK != null) {
                        vaVarK.f(s9.this.f71067b, s9.this.f71066a);
                    }
                    if (s9.this.f71067b == 0) {
                        s9.this.f71071f = b.f71080e;
                        Function0 function0I = s9.this.i();
                        if (function0I != null) {
                            function0I.invoke();
                        }
                    } else {
                        this.f71085r = 1;
                    }
                }
                return Unit.f93236a;
            } while (eg.k0.a(16L, this) != objG);
            return objG;
        }
    }

    public s9(long j10, Function0 function0) {
        this.f71066a = j10;
        this.f71067b = j10;
        g(function0);
    }

    public final void b() {
        e(null);
        kotlinx.coroutines.a0.k(this.f71076k, null, 1, null);
    }

    public final void e(va vaVar) {
        this.f71072g = vaVar;
        if (vaVar != null) {
            vaVar.f(this.f71067b, this.f71066a);
        }
    }

    public final void f(ob mode, String str, String str2) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f71074i = mode;
        if (str != null) {
            this.f71075j = str;
        }
        va vaVar = this.f71072g;
        if (vaVar != null) {
            vaVar.h(mode, str, str2);
        }
    }

    public final void g(Function0 function0) {
        this.f71073h = function0;
    }

    public final Function0 i() {
        return this.f71073h;
    }

    public final va k() {
        return this.f71072g;
    }

    public final b m() {
        return this.f71071f;
    }

    public final void n() {
        if (this.f71071f == b.f71077b) {
            this.f71071f = b.f71078c;
            this.f71070e = SystemClock.uptimeMillis();
        }
    }

    public final void o() {
        b bVar = this.f71071f;
        b bVar2 = b.f71077b;
        if (bVar == bVar2 || bVar == b.f71080e) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i10 = c.f71084a[this.f71071f.ordinal()];
        if (i10 == 1) {
            this.f71068c = jUptimeMillis;
            this.f71069d = 0L;
        } else if (i10 == 2) {
            this.f71069d += jUptimeMillis - this.f71070e;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f71068c = jUptimeMillis;
            this.f71069d = 0L;
        }
        this.f71071f = bVar2;
        eg.i.d(kotlinx.coroutines.i.a(eg.o0.c().plus(this.f71076k)), null, null, new d(null), 3, null);
    }
}
