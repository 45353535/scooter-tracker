package uc;

import android.content.Context;
import android.view.ViewGroup;
import com.ironsource.C4424m2;
import com.my.target.common.menu.MenuActionType;
import ic.c0;
import ic.d0;
import ic.e0;
import ic.f0;
import id.r0;
import id.z0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import jd.c;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements uc.t {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f105421t = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f105422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jd.f f105423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ed.c f105424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final uc.u f105425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final tc.d f105426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f105427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Lazy f105428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Lazy f105429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private uc.v f105430i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final yc.f f105431j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final wc.b f105432k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Lazy f105433l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Lazy f105434m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final wd.e f105435n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map f105436o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f105437p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f105438q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f105439r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Lazy f105440s;

    private final class a extends b {
        public a() {
            super();
        }

        @Override // uc.b0.b, jc.c
        public void a(jc.a adForm) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            super.a(adForm);
            if (b0.B(b0.this, adForm, false, 2, null)) {
                if (b0.this.f105436o.isEmpty()) {
                    b0.this.d0();
                }
            } else {
                d(adForm, new id.a0("Failed to setup ad element (" + adForm + ')'));
            }
        }

        @Override // uc.b0.b, jc.c
        public void b(jc.a adForm) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            super.b(adForm);
            b0.this.f().c(adForm);
        }

        @Override // uc.b0.b, jc.c
        public void d(jc.a adForm, id.a0 error) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            Intrinsics.checkNotNullParameter(error, "error");
            super.d(adForm, error);
            b0.this.o(error);
            b0.this.f().c(adForm);
        }

        @Override // uc.b0.b, jc.c
        public void e(jc.a adForm, id.a0 error) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            Intrinsics.checkNotNullParameter(error, "error");
            super.e(adForm, error);
            b0.this.o(error);
            b0.this.f().c(adForm);
        }
    }

    private abstract class b implements jc.c {
        public b() {
        }

        @Override // jc.c
        public void a(jc.a adForm) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            ic.v.g(b0.this.f105423b, "AdsElement (" + adForm + ") - onAdFormLoaded", new Object[0]);
            b0.this.f105436o.remove(adForm);
        }

        @Override // jc.c
        public void b(jc.a adForm) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            ic.v.g(b0.this.f105423b, "AdsElement (" + adForm + ") - onAdFormShown", new Object[0]);
        }

        @Override // jc.c
        public void c(jc.a adForm, id.a0 error) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            Intrinsics.checkNotNullParameter(error, "error");
            ic.v.b(b0.this.f105423b, "AdsElement (" + adForm + ") - onAdFormFailToShow - " + error, new Object[0]);
        }

        @Override // jc.c
        public void d(jc.a adForm, id.a0 error) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            Intrinsics.checkNotNullParameter(error, "error");
            ic.v.b(b0.this.f105423b, "AdsElement (" + adForm + ") - onAdFormFailToLoad - " + error, new Object[0]);
            b0.this.f105436o.remove(adForm);
        }

        @Override // jc.c
        public void e(jc.a adForm, id.a0 error) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            Intrinsics.checkNotNullParameter(error, "error");
            ic.v.b(b0.this.f105423b, "AdsElement (" + adForm + ") - onAdFormExpired - " + error, new Object[0]);
        }
    }

    private final class c implements wc.b {
        public c() {
        }

        @Override // wc.b
        public void a(id.t brokenCreativeEvent) {
            Intrinsics.checkNotNullParameter(brokenCreativeEvent, "brokenCreativeEvent");
            b0.this.n(brokenCreativeEvent);
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    private final class e extends b {
        public e() {
            super();
        }

        @Override // uc.b0.b, jc.c
        public void a(jc.a adForm) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            super.a(adForm);
            if (!b0.this.A(adForm, true)) {
                d(adForm, new id.a0("Failed to setup ad element (" + adForm + ')'));
            }
            if (b0.this.f105436o.isEmpty()) {
                b0.this.d0();
            }
        }

        @Override // uc.b0.b, jc.c
        public void d(jc.a adForm, id.a0 error) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            Intrinsics.checkNotNullParameter(error, "error");
            super.d(adForm, error);
            b0 b0Var = b0.this;
            b0Var.k(adForm, b0Var.U());
        }

        @Override // uc.b0.b, jc.c
        public void e(jc.a adForm, id.a0 error) {
            Intrinsics.checkNotNullParameter(adForm, "adForm");
            Intrinsics.checkNotNullParameter(error, "error");
            super.e(adForm, error);
            b0 b0Var = b0.this;
            b0Var.k(adForm, b0Var.U());
        }
    }

    private final class f implements yc.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f105445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f105446b;

        public static final class a implements ic.u {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f105447b;

            public a(Object obj) {
                this.f105447b = obj;
            }

            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                ((ic.i) this.f105447b).b();
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        }

        public static final class b implements ic.u {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f105448b;

            public b(Object obj) {
                this.f105448b = obj;
            }

            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                ((ic.i) this.f105448b).b();
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        }

        public static final class c implements ic.u {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f105449b;

            public c(Object obj) {
                this.f105449b = obj;
            }

            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                ((ic.i) this.f105449b).b();
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        }

        public static final class d implements ic.u {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f105450b;

            public d(Object obj) {
                this.f105450b = obj;
            }

            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                ((ic.i) this.f105450b).b();
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        }

        public static final class e extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f105451r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b0 f105452s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f105453t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ String f105454u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ Class f105455v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ String f105456w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ b0 f105457x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ Integer f105458y;

            public static final class a implements ic.u {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Object f105459b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ b0 f105460c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Integer f105461d;

                public a(Object obj, b0 b0Var, Integer num) {
                    this.f105459b = obj;
                    this.f105460c = b0Var;
                    this.f105461d = num;
                }

                @Override // pd.w
                public /* synthetic */ void c(Throwable th2) {
                    ic.t.a(this, th2);
                }

                @Override // pd.w
                public final void onRun() {
                    jd.m mVar = (jd.m) this.f105459b;
                    this.f105460c.u(mVar, false, this.f105461d != null, new C1314f(mVar));
                }

                @Override // pd.w, java.lang.Runnable
                public /* synthetic */ void run() {
                    pd.v.b(this);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(b0 b0Var, String str, String str2, Class cls, String str3, Continuation continuation, b0 b0Var2, Integer num) {
                super(2, continuation);
                this.f105452s = b0Var;
                this.f105453t = str;
                this.f105454u = str2;
                this.f105455v = cls;
                this.f105456w = str3;
                this.f105457x = b0Var2;
                this.f105458y = num;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new e(this.f105452s, this.f105453t, this.f105454u, this.f105455v, this.f105456w, continuation, this.f105457x, this.f105458y);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f105451r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                Object objC = this.f105452s.C(this.f105453t);
                if (objC == null) {
                    this.f105452s.p(this.f105454u, this.f105453t);
                } else if (!this.f105455v.isInstance(objC)) {
                    this.f105452s.q(this.f105454u, this.f105453t, this.f105456w);
                } else if (this.f105455v.isInstance(objC)) {
                    jd.h.d(new a(objC, this.f105457x, this.f105458y));
                }
                return Unit.f93236a;
            }
        }

        /* JADX INFO: renamed from: uc.b0$f$f, reason: collision with other inner class name */
        static final class C1314f implements ic.u {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ jd.m f105462b;

            C1314f(jd.m mVar) {
                this.f105462b = mVar;
            }

            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                this.f105462b.q(false);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        }

        public static final class g extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f105463r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b0 f105464s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f105465t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ String f105466u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ Class f105467v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ String f105468w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ boolean f105469x;

            public static final class a implements ic.u {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Object f105470b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f105471c;

                public a(Object obj, boolean z10) {
                    this.f105470b = obj;
                    this.f105471c = z10;
                }

                @Override // pd.w
                public /* synthetic */ void c(Throwable th2) {
                    ic.t.a(this, th2);
                }

                @Override // pd.w
                public final void onRun() {
                    ((jd.m) this.f105470b).r(this.f105471c);
                }

                @Override // pd.w, java.lang.Runnable
                public /* synthetic */ void run() {
                    pd.v.b(this);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(b0 b0Var, String str, String str2, Class cls, String str3, Continuation continuation, boolean z10) {
                super(2, continuation);
                this.f105464s = b0Var;
                this.f105465t = str;
                this.f105466u = str2;
                this.f105467v = cls;
                this.f105468w = str3;
                this.f105469x = z10;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new g(this.f105464s, this.f105465t, this.f105466u, this.f105467v, this.f105468w, continuation, this.f105469x);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f105463r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                Object objC = this.f105464s.C(this.f105465t);
                if (objC == null) {
                    this.f105464s.p(this.f105466u, this.f105465t);
                } else if (!this.f105467v.isInstance(objC)) {
                    this.f105464s.q(this.f105466u, this.f105465t, this.f105468w);
                } else if (this.f105467v.isInstance(objC)) {
                    jd.h.d(new a(objC, this.f105469x));
                }
                return Unit.f93236a;
            }
        }

        public static final class h extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f105472r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b0 f105473s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f105474t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ String f105475u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ Class f105476v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ String f105477w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ Integer f105478x;

            public static final class a implements ic.u {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Object f105479b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Integer f105480c;

                public a(Object obj, Integer num) {
                    this.f105479b = obj;
                    this.f105480c = num;
                }

                @Override // pd.w
                public /* synthetic */ void c(Throwable th2) {
                    ic.t.a(this, th2);
                }

                @Override // pd.w
                public final void onRun() {
                    ((ic.x) this.f105479b).b(this.f105480c);
                }

                @Override // pd.w, java.lang.Runnable
                public /* synthetic */ void run() {
                    pd.v.b(this);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(b0 b0Var, String str, String str2, Class cls, String str3, Continuation continuation, Integer num) {
                super(2, continuation);
                this.f105473s = b0Var;
                this.f105474t = str;
                this.f105475u = str2;
                this.f105476v = cls;
                this.f105477w = str3;
                this.f105478x = num;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new h(this.f105473s, this.f105474t, this.f105475u, this.f105476v, this.f105477w, continuation, this.f105478x);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f105472r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                Object objC = this.f105473s.C(this.f105474t);
                if (objC == null) {
                    this.f105473s.p(this.f105475u, this.f105474t);
                } else if (!this.f105476v.isInstance(objC)) {
                    this.f105473s.q(this.f105475u, this.f105474t, this.f105477w);
                } else if (this.f105476v.isInstance(objC)) {
                    jd.h.d(new a(objC, this.f105478x));
                }
                return Unit.f93236a;
            }
        }

        public static final class i implements ic.s {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b0 f105481a;

            i(b0 b0Var) {
                this.f105481a = b0Var;
            }

            @Override // pd.u
            public /* bridge */ /* synthetic */ void a(Object obj) {
                b(((Boolean) obj).booleanValue());
            }

            public void b(boolean z10) {
                uc.v vVarX = this.f105481a.X();
                if (vVarX != null) {
                    vVarX.f();
                }
            }

            @Override // pd.u
            public /* synthetic */ void c(Throwable th2) {
                ic.r.a(this, th2);
            }

            @Override // pd.h
            public /* synthetic */ void execute(Object obj) {
                pd.t.a(this, obj);
            }
        }

        public static final class j extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f105482r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b0 f105483s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f105484t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ String f105485u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ Class f105486v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ String f105487w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ long f105488x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ long f105489y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            final /* synthetic */ float f105490z;

            public static final class a implements ic.u {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Object f105491b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ long f105492c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ long f105493d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ float f105494e;

                public a(Object obj, long j10, long j11, float f10) {
                    this.f105491b = obj;
                    this.f105492c = j10;
                    this.f105493d = j11;
                    this.f105494e = f10;
                }

                @Override // pd.w
                public /* synthetic */ void c(Throwable th2) {
                    ic.t.a(this, th2);
                }

                @Override // pd.w
                public final void onRun() {
                    ((ic.z) this.f105491b).c(this.f105492c, this.f105493d, this.f105494e);
                }

                @Override // pd.w, java.lang.Runnable
                public /* synthetic */ void run() {
                    pd.v.b(this);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(b0 b0Var, String str, String str2, Class cls, String str3, Continuation continuation, long j10, long j11, float f10) {
                super(2, continuation);
                this.f105483s = b0Var;
                this.f105484t = str;
                this.f105485u = str2;
                this.f105486v = cls;
                this.f105487w = str3;
                this.f105488x = j10;
                this.f105489y = j11;
                this.f105490z = f10;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f105483s, this.f105484t, this.f105485u, this.f105486v, this.f105487w, continuation, this.f105488x, this.f105489y, this.f105490z);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f105482r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                Object objC = this.f105483s.C(this.f105484t);
                if (objC == null) {
                    this.f105483s.p(this.f105485u, this.f105484t);
                } else if (!this.f105486v.isInstance(objC)) {
                    this.f105483s.q(this.f105485u, this.f105484t, this.f105487w);
                } else if (this.f105486v.isInstance(objC)) {
                    jd.h.d(new a(objC, this.f105488x, this.f105489y, this.f105490z));
                }
                return Unit.f93236a;
            }
        }

        public static final class k extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f105495r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b0 f105496s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f105497t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ String f105498u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ Class f105499v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ String f105500w;

            public static final class a implements ic.u {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Object f105501b;

                public a(Object obj) {
                    this.f105501b = obj;
                }

                @Override // pd.w
                public /* synthetic */ void c(Throwable th2) {
                    ic.t.a(this, th2);
                }

                @Override // pd.w
                public final void onRun() {
                    ((ic.a0) this.f105501b).k();
                }

                @Override // pd.w, java.lang.Runnable
                public /* synthetic */ void run() {
                    pd.v.b(this);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(b0 b0Var, String str, String str2, Class cls, String str3, Continuation continuation) {
                super(2, continuation);
                this.f105496s = b0Var;
                this.f105497t = str;
                this.f105498u = str2;
                this.f105499v = cls;
                this.f105500w = str3;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new k(this.f105496s, this.f105497t, this.f105498u, this.f105499v, this.f105500w, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f105495r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                Object objC = this.f105496s.C(this.f105497t);
                if (objC == null) {
                    this.f105496s.p(this.f105498u, this.f105497t);
                } else if (!this.f105499v.isInstance(objC)) {
                    this.f105496s.q(this.f105498u, this.f105497t, this.f105500w);
                } else if (this.f105499v.isInstance(objC)) {
                    jd.h.d(new a(objC));
                }
                return Unit.f93236a;
            }
        }

        public static final class l extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f105502r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b0 f105503s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f105504t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ String f105505u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ Class f105506v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ String f105507w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ long f105508x;

            public static final class a implements ic.u {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Object f105509b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ long f105510c;

                public a(Object obj, long j10) {
                    this.f105509b = obj;
                    this.f105510c = j10;
                }

                @Override // pd.w
                public /* synthetic */ void c(Throwable th2) {
                    ic.t.a(this, th2);
                }

                @Override // pd.w
                public final void onRun() {
                    ((c0) this.f105509b).a(this.f105510c);
                }

                @Override // pd.w, java.lang.Runnable
                public /* synthetic */ void run() {
                    pd.v.b(this);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(b0 b0Var, String str, String str2, Class cls, String str3, Continuation continuation, long j10) {
                super(2, continuation);
                this.f105503s = b0Var;
                this.f105504t = str;
                this.f105505u = str2;
                this.f105506v = cls;
                this.f105507w = str3;
                this.f105508x = j10;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new l(this.f105503s, this.f105504t, this.f105505u, this.f105506v, this.f105507w, continuation, this.f105508x);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f105502r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                Object objC = this.f105503s.C(this.f105504t);
                if (objC == null) {
                    this.f105503s.p(this.f105505u, this.f105504t);
                } else if (!this.f105506v.isInstance(objC)) {
                    this.f105503s.q(this.f105505u, this.f105504t, this.f105507w);
                } else if (this.f105506v.isInstance(objC)) {
                    jd.h.d(new a(objC, this.f105508x));
                }
                return Unit.f93236a;
            }
        }

        public static final class m extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f105511r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b0 f105512s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f105513t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ String f105514u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ Class f105515v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ String f105516w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ b0 f105517x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ Integer f105518y;

            public static final class a implements ic.u {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Object f105519b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ b0 f105520c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Integer f105521d;

                public a(Object obj, b0 b0Var, Integer num) {
                    this.f105519b = obj;
                    this.f105520c = b0Var;
                    this.f105521d = num;
                }

                @Override // pd.w
                public /* synthetic */ void c(Throwable th2) {
                    ic.t.a(this, th2);
                }

                @Override // pd.w
                public final void onRun() {
                    jd.m mVar = (jd.m) this.f105519b;
                    this.f105520c.u(mVar, true, this.f105521d != null, new n(mVar));
                }

                @Override // pd.w, java.lang.Runnable
                public /* synthetic */ void run() {
                    pd.v.b(this);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(b0 b0Var, String str, String str2, Class cls, String str3, Continuation continuation, b0 b0Var2, Integer num) {
                super(2, continuation);
                this.f105512s = b0Var;
                this.f105513t = str;
                this.f105514u = str2;
                this.f105515v = cls;
                this.f105516w = str3;
                this.f105517x = b0Var2;
                this.f105518y = num;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new m(this.f105512s, this.f105513t, this.f105514u, this.f105515v, this.f105516w, continuation, this.f105517x, this.f105518y);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f105511r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                Object objC = this.f105512s.C(this.f105513t);
                if (objC == null) {
                    this.f105512s.p(this.f105514u, this.f105513t);
                } else if (!this.f105515v.isInstance(objC)) {
                    this.f105512s.q(this.f105514u, this.f105513t, this.f105516w);
                } else if (this.f105515v.isInstance(objC)) {
                    jd.h.d(new a(objC, this.f105517x, this.f105518y));
                }
                return Unit.f93236a;
            }
        }

        static final class n implements ic.u {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ jd.m f105522b;

            n(jd.m mVar) {
                this.f105522b = mVar;
            }

            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                this.f105522b.q(true);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        }

        public static final class o extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f105523r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b0 f105524s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f105525t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ String f105526u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ Class f105527v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ String f105528w;

            public static final class a implements ic.u {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Object f105529b;

                public a(Object obj) {
                    this.f105529b = obj;
                }

                @Override // pd.w
                public /* synthetic */ void c(Throwable th2) {
                    ic.t.a(this, th2);
                }

                @Override // pd.w
                public final void onRun() {
                    ((ic.f) this.f105529b).m();
                }

                @Override // pd.w, java.lang.Runnable
                public /* synthetic */ void run() {
                    pd.v.b(this);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o(b0 b0Var, String str, String str2, Class cls, String str3, Continuation continuation) {
                super(2, continuation);
                this.f105524s = b0Var;
                this.f105525t = str;
                this.f105526u = str2;
                this.f105527v = cls;
                this.f105528w = str3;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new o(this.f105524s, this.f105525t, this.f105526u, this.f105527v, this.f105528w, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f105523r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                Object objC = this.f105524s.C(this.f105525t);
                if (objC == null) {
                    this.f105524s.p(this.f105526u, this.f105525t);
                } else if (!this.f105527v.isInstance(objC)) {
                    this.f105524s.q(this.f105526u, this.f105525t, this.f105528w);
                } else if (this.f105527v.isInstance(objC)) {
                    jd.h.d(new a(objC));
                }
                return Unit.f93236a;
            }
        }

        public static final class p implements ic.u {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f105530b;

            public p(Object obj) {
                this.f105530b = obj;
            }

            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                ((d0) this.f105530b).e();
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        }

        public static final class q implements ic.u {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f105531b;

            public q(Object obj) {
                this.f105531b = obj;
            }

            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                ((d0) this.f105531b).e();
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        }

        public static final class r implements ic.u {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f105532b;

            public r(Object obj) {
                this.f105532b = obj;
            }

            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                ((d0) this.f105532b).e();
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        }

        public static final class s implements ic.u {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f105533b;

            public s(Object obj) {
                this.f105533b = obj;
            }

            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                ((d0) this.f105533b).e();
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        }

        public static final class t extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f105534r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b0 f105535s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f105536t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ String f105537u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ Class f105538v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ String f105539w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ String f105540x;

            public static final class a implements ic.u {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Object f105541b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f105542c;

                public a(Object obj, String str) {
                    this.f105541b = obj;
                    this.f105542c = str;
                }

                @Override // pd.w
                public /* synthetic */ void c(Throwable th2) {
                    ic.t.a(this, th2);
                }

                @Override // pd.w
                public final void onRun() {
                    ((e0) this.f105541b).a(this.f105542c);
                }

                @Override // pd.w, java.lang.Runnable
                public /* synthetic */ void run() {
                    pd.v.b(this);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public t(b0 b0Var, String str, String str2, Class cls, String str3, Continuation continuation, String str4) {
                super(2, continuation);
                this.f105535s = b0Var;
                this.f105536t = str;
                this.f105537u = str2;
                this.f105538v = cls;
                this.f105539w = str3;
                this.f105540x = str4;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new t(this.f105535s, this.f105536t, this.f105537u, this.f105538v, this.f105539w, continuation, this.f105540x);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f105534r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                Object objC = this.f105535s.C(this.f105536t);
                if (objC == null) {
                    this.f105535s.p(this.f105537u, this.f105536t);
                } else if (!this.f105538v.isInstance(objC)) {
                    this.f105535s.q(this.f105537u, this.f105536t, this.f105539w);
                } else if (this.f105538v.isInstance(objC)) {
                    jd.h.d(new a(objC, this.f105540x));
                }
                return Unit.f93236a;
            }
        }

        public static final class u extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f105543r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b0 f105544s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f105545t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ String f105546u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ Class f105547v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ String f105548w;

            public static final class a implements ic.u {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Object f105549b;

                public a(Object obj) {
                    this.f105549b = obj;
                }

                @Override // pd.w
                public /* synthetic */ void c(Throwable th2) {
                    ic.t.a(this, th2);
                }

                @Override // pd.w
                public final void onRun() {
                    ((jd.m) this.f105549b).p();
                }

                @Override // pd.w, java.lang.Runnable
                public /* synthetic */ void run() {
                    pd.v.b(this);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public u(b0 b0Var, String str, String str2, Class cls, String str3, Continuation continuation) {
                super(2, continuation);
                this.f105544s = b0Var;
                this.f105545t = str;
                this.f105546u = str2;
                this.f105547v = cls;
                this.f105548w = str3;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new u(this.f105544s, this.f105545t, this.f105546u, this.f105547v, this.f105548w, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f105543r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                Object objC = this.f105544s.C(this.f105545t);
                if (objC == null) {
                    this.f105544s.p(this.f105546u, this.f105545t);
                } else if (!this.f105547v.isInstance(objC)) {
                    this.f105544s.q(this.f105546u, this.f105545t, this.f105548w);
                } else if (this.f105547v.isInstance(objC)) {
                    jd.h.d(new a(objC));
                }
                return Unit.f93236a;
            }
        }

        public static final class v extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f105550r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b0 f105551s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f105552t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ String f105553u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ Class f105554v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ String f105555w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ Integer f105556x;

            public static final class a implements ic.u {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Object f105557b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Integer f105558c;

                public a(Object obj, Integer num) {
                    this.f105557b = obj;
                    this.f105558c = num;
                }

                @Override // pd.w
                public /* synthetic */ void c(Throwable th2) {
                    ic.t.a(this, th2);
                }

                @Override // pd.w
                public final void onRun() {
                    ((ic.x) this.f105557b).a(this.f105558c);
                }

                @Override // pd.w, java.lang.Runnable
                public /* synthetic */ void run() {
                    pd.v.b(this);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public v(b0 b0Var, String str, String str2, Class cls, String str3, Continuation continuation, Integer num) {
                super(2, continuation);
                this.f105551s = b0Var;
                this.f105552t = str;
                this.f105553u = str2;
                this.f105554v = cls;
                this.f105555w = str3;
                this.f105556x = num;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new v(this.f105551s, this.f105552t, this.f105553u, this.f105554v, this.f105555w, continuation, this.f105556x);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f105550r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                Object objC = this.f105551s.C(this.f105552t);
                if (objC == null) {
                    this.f105551s.p(this.f105553u, this.f105552t);
                } else if (!this.f105554v.isInstance(objC)) {
                    this.f105551s.q(this.f105553u, this.f105552t, this.f105555w);
                } else if (this.f105554v.isInstance(objC)) {
                    jd.h.d(new a(objC, this.f105556x));
                }
                return Unit.f93236a;
            }
        }

        public f(b0 b0Var, Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f105446b = b0Var;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            this.f105445a = applicationContext;
        }

        private final void h(String str) {
            uc.v vVarX = this.f105446b.X();
            if (vVarX != null) {
                vVarX.d();
            }
            jd.j.c(this.f105445a, str, new i(this.f105446b));
        }

        @Override // yc.f
        public void a(String targetElementName, Integer num) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            b0 b0Var = this.f105446b;
            eg.i.d(b0Var.Q(b0Var), b0Var.O(b0Var).d(), null, new v(b0Var, targetElementName, "unmute", ic.x.class, "Mutable", null, num), 2, null);
        }

        @Override // yc.f
        public void b(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            h(url);
        }

        @Override // yc.f
        public void c(String targetElementName, Integer num) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            b0 b0Var = this.f105446b;
            eg.i.d(b0Var.Q(b0Var), b0Var.O(b0Var).d(), null, new h(b0Var, targetElementName, "mute", ic.x.class, "Mutable", null, num), 2, null);
        }

        @Override // yc.f
        public void d(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            uc.v vVarX = this.f105446b.X();
            if (vVarX != null) {
                vVarX.g();
            }
            h(url);
        }

        @Override // yc.f
        public void e(String targetElementName, Integer num) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            b0 b0Var = this.f105446b;
            eg.i.d(b0Var.Q(b0Var), b0Var.O(b0Var).d(), null, new e(b0Var, targetElementName, MenuActionType.HIDE, jd.m.class, "VisibilityChanger", null, b0Var, num), 2, null);
        }

        @Override // yc.f
        public void f(String targetElementName) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            b0 b0Var = this.f105446b;
            eg.i.d(b0Var.Q(b0Var), b0Var.O(b0Var).d(), null, new o(b0Var, targetElementName, "simulateClick", ic.f.class, "AdElement", null), 2, null);
        }

        @Override // yc.f
        public void g(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            new c.a(url, c.e.Get).f(ec.a.c()).c();
        }

        @Override // yc.f
        public void b() {
            b0 b0Var = this.f105446b;
            for (ic.f fVar : b0Var.T()) {
                if (ic.i.class.isInstance(fVar)) {
                    jd.h.d(new a(fVar));
                }
            }
            for (ic.f fVar2 : b0Var.U()) {
                if (ic.i.class.isInstance(fVar2)) {
                    jd.h.d(new b(fVar2));
                }
            }
            for (ic.w wVar : b0Var.W()) {
                if (ic.i.class.isInstance(wVar)) {
                    jd.h.d(new c(wVar));
                }
            }
            f0 f0VarV = b0Var.V();
            if (ic.i.class.isInstance(f0VarV)) {
                jd.h.d(new d(f0VarV));
            }
        }

        @Override // yc.f
        public void a(String targetElementName, long j10) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            b0 b0Var = this.f105446b;
            eg.i.d(b0Var.Q(b0Var), b0Var.O(b0Var).d(), null, new l(b0Var, targetElementName, "schedule", c0.class, "Schedule", null, j10), 2, null);
        }

        @Override // yc.f
        public void c(String targetElementName) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            b0 b0Var = this.f105446b;
            eg.i.d(b0Var.Q(b0Var), b0Var.O(b0Var).d(), null, new k(b0Var, targetElementName, "repeat", ic.a0.class, "Repeatable", null), 2, null);
        }

        @Override // yc.f
        public void d(String targetElementName, Integer num) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            b0 b0Var = this.f105446b;
            eg.i.d(b0Var.Q(b0Var), b0Var.O(b0Var).d(), null, new m(b0Var, targetElementName, C4424m2.f43623v, jd.m.class, "VisibilityChanger", null, b0Var, num), 2, null);
        }

        @Override // yc.f
        public void e() {
            b0 b0Var = this.f105446b;
            for (ic.f fVar : b0Var.T()) {
                if (d0.class.isInstance(fVar)) {
                    jd.h.d(new p(fVar));
                }
            }
            for (ic.f fVar2 : b0Var.U()) {
                if (d0.class.isInstance(fVar2)) {
                    jd.h.d(new q(fVar2));
                }
            }
            for (ic.w wVar : b0Var.W()) {
                if (d0.class.isInstance(wVar)) {
                    jd.h.d(new r(wVar));
                }
            }
            f0 f0VarV = b0Var.V();
            if (d0.class.isInstance(f0VarV)) {
                jd.h.d(new s(f0VarV));
            }
        }

        @Override // yc.f
        public void f(String targetElementName, long j10, long j11, float f10) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            b0 b0Var = this.f105446b;
            eg.i.d(b0Var.Q(b0Var), b0Var.O(b0Var).d(), null, new j(b0Var, targetElementName, "progress", ic.z.class, "Progress", null, j10, j11, f10), 2, null);
        }

        @Override // yc.f
        public void a(String targetElementName, String str) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            b0 b0Var = this.f105446b;
            eg.i.d(b0Var.Q(b0Var), b0Var.O(b0Var).d(), null, new t(b0Var, targetElementName, "start", e0.class, "Startable", null, str), 2, null);
        }

        @Override // yc.f
        public void c() {
            uc.v vVarX = this.f105446b.X();
            if (vVarX != null) {
                vVarX.c();
            }
        }

        @Override // yc.f
        public void a(String targetElementName, boolean z10) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            b0 b0Var = this.f105446b;
            eg.i.d(b0Var.Q(b0Var), b0Var.O(b0Var).d(), null, new g(b0Var, targetElementName, "lockVisibility", jd.m.class, "VisibilityChanger", null, z10), 2, null);
        }

        @Override // yc.f
        public void a(String stateGroups) {
            Intrinsics.checkNotNullParameter(stateGroups, "stateGroups");
            this.f105446b.Z().a(stateGroups);
        }

        @Override // yc.f
        public void a() {
            uc.v vVarX = this.f105446b.X();
            if (vVarX != null) {
                vVarX.a();
            }
        }

        @Override // yc.f
        public void b(z0 privacySheetParams) {
            Intrinsics.checkNotNullParameter(privacySheetParams, "privacySheetParams");
            uc.v vVarX = this.f105446b.X();
            if (vVarX != null) {
                vVarX.b(privacySheetParams);
            }
        }

        @Override // yc.f
        public void e(String targetElementName) {
            Intrinsics.checkNotNullParameter(targetElementName, "targetElementName");
            b0 b0Var = this.f105446b;
            eg.i.d(b0Var.Q(b0Var), b0Var.O(b0Var).d(), null, new u(b0Var, targetElementName, "unlockVisibility", jd.m.class, "VisibilityChanger", null), 2, null);
        }
    }

    private final class g extends f0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b0 f105559d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b0 b0Var, yc.b eventCallback) {
            super(eventCallback);
            Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
            this.f105559d = b0Var;
        }

        @Override // ic.f0, ic.x
        public void a(Integer num) {
            s().a(num);
        }

        @Override // ic.f0, ic.x
        public void b(Integer num) {
            s().b(num);
        }

        @Override // ic.f0, ic.d0
        public void e() {
            uc.v vVarX = this.f105559d.X();
            if (vVarX != null) {
                vVarX.e();
            }
        }

        @Override // ic.f0
        public String t() {
            return s().f();
        }

        @Override // ic.f0, ic.i
        public void b() {
            uc.v vVarX = this.f105559d.X();
            if (vVarX != null) {
                vVarX.b();
            }
        }
    }

    static final class h extends Lambda implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final jc.b invoke() {
            Context applicationContext = b0.this.f105427f;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return new jc.b(applicationContext, b0.this.Y());
        }
    }

    static final class i extends Lambda implements Function0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ id.d f105562g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(id.d dVar) {
            super(0);
            this.f105562g = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final ic.g invoke() {
            Object obj = b0.this.f105422a;
            Context applicationContext = b0.this.f105427f;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return new ic.g(obj, applicationContext, b0.this.Y(), this.f105562g);
        }
    }

    static final class j extends Lambda implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            ViewGroup viewGroupF = b0.this.f().f();
            if (viewGroupF != null) {
                return Integer.valueOf(viewGroupF.getId());
            }
            return null;
        }
    }

    static final class k extends Lambda implements Function0 {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            b0 b0Var = b0.this;
            return new g(b0Var, b0Var.i("system"));
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f105565r;

        l(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b0.this.new l(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f105565r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            if (b0.this.a0()) {
                b0.this.b0();
                b0.this.c0();
            }
            return Unit.f93236a;
        }
    }

    public static final class m implements ic.u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f105567b;

        public m(Object obj) {
            this.f105567b = obj;
        }

        @Override // pd.w
        public /* synthetic */ void c(Throwable th2) {
            ic.t.a(this, th2);
        }

        @Override // pd.w
        public final void onRun() {
            ((ic.f) this.f105567b).o();
        }

        @Override // pd.w, java.lang.Runnable
        public /* synthetic */ void run() {
            pd.v.b(this);
        }
    }

    public static final class n implements ic.u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f105568b;

        public n(Object obj) {
            this.f105568b = obj;
        }

        @Override // pd.w
        public /* synthetic */ void c(Throwable th2) {
            ic.t.a(this, th2);
        }

        @Override // pd.w
        public final void onRun() {
            ((ic.f) this.f105568b).o();
        }

        @Override // pd.w, java.lang.Runnable
        public /* synthetic */ void run() {
            pd.v.b(this);
        }
    }

    public static final class o implements ic.u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f105569b;

        public o(Object obj) {
            this.f105569b = obj;
        }

        @Override // pd.w
        public /* synthetic */ void c(Throwable th2) {
            ic.t.a(this, th2);
        }

        @Override // pd.w
        public final void onRun() {
            ((ic.f) this.f105569b).o();
        }

        @Override // pd.w, java.lang.Runnable
        public /* synthetic */ void run() {
            pd.v.b(this);
        }
    }

    public static final class p implements ic.u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f105570b;

        public p(Object obj) {
            this.f105570b = obj;
        }

        @Override // pd.w
        public /* synthetic */ void c(Throwable th2) {
            ic.t.a(this, th2);
        }

        @Override // pd.w
        public final void onRun() {
            ((ic.f) this.f105570b).o();
        }

        @Override // pd.w, java.lang.Runnable
        public /* synthetic */ void run() {
            pd.v.b(this);
        }
    }

    public static final class q implements ic.u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f105571b;

        public q(Object obj) {
            this.f105571b = obj;
        }

        @Override // pd.w
        public /* synthetic */ void c(Throwable th2) {
            ic.t.a(this, th2);
        }

        @Override // pd.w
        public final void onRun() {
            ((c0) this.f105571b).pause();
        }

        @Override // pd.w, java.lang.Runnable
        public /* synthetic */ void run() {
            pd.v.b(this);
        }
    }

    public static final class r implements ic.u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f105572b;

        public r(Object obj) {
            this.f105572b = obj;
        }

        @Override // pd.w
        public /* synthetic */ void c(Throwable th2) {
            ic.t.a(this, th2);
        }

        @Override // pd.w
        public final void onRun() {
            ((c0) this.f105572b).pause();
        }

        @Override // pd.w, java.lang.Runnable
        public /* synthetic */ void run() {
            pd.v.b(this);
        }
    }

    public static final class s implements ic.u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f105573b;

        public s(Object obj) {
            this.f105573b = obj;
        }

        @Override // pd.w
        public /* synthetic */ void c(Throwable th2) {
            ic.t.a(this, th2);
        }

        @Override // pd.w
        public final void onRun() {
            ((c0) this.f105573b).pause();
        }

        @Override // pd.w, java.lang.Runnable
        public /* synthetic */ void run() {
            pd.v.b(this);
        }
    }

    public static final class t implements ic.u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f105574b;

        public t(Object obj) {
            this.f105574b = obj;
        }

        @Override // pd.w
        public /* synthetic */ void c(Throwable th2) {
            ic.t.a(this, th2);
        }

        @Override // pd.w
        public final void onRun() {
            ((c0) this.f105574b).pause();
        }

        @Override // pd.w, java.lang.Runnable
        public /* synthetic */ void run() {
            pd.v.b(this);
        }
    }

    public static final class u implements ic.u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f105575b;

        public u(Object obj) {
            this.f105575b = obj;
        }

        @Override // pd.w
        public /* synthetic */ void c(Throwable th2) {
            ic.t.a(this, th2);
        }

        @Override // pd.w
        public final void onRun() {
            ((c0) this.f105575b).l();
        }

        @Override // pd.w, java.lang.Runnable
        public /* synthetic */ void run() {
            pd.v.b(this);
        }
    }

    public static final class v implements ic.u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f105576b;

        public v(Object obj) {
            this.f105576b = obj;
        }

        @Override // pd.w
        public /* synthetic */ void c(Throwable th2) {
            ic.t.a(this, th2);
        }

        @Override // pd.w
        public final void onRun() {
            ((c0) this.f105576b).l();
        }

        @Override // pd.w, java.lang.Runnable
        public /* synthetic */ void run() {
            pd.v.b(this);
        }
    }

    public static final class w implements ic.u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f105577b;

        public w(Object obj) {
            this.f105577b = obj;
        }

        @Override // pd.w
        public /* synthetic */ void c(Throwable th2) {
            ic.t.a(this, th2);
        }

        @Override // pd.w
        public final void onRun() {
            ((c0) this.f105577b).l();
        }

        @Override // pd.w, java.lang.Runnable
        public /* synthetic */ void run() {
            pd.v.b(this);
        }
    }

    public static final class x implements ic.u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f105578b;

        public x(Object obj) {
            this.f105578b = obj;
        }

        @Override // pd.w
        public /* synthetic */ void c(Throwable th2) {
            ic.t.a(this, th2);
        }

        @Override // pd.w
        public final void onRun() {
            ((c0) this.f105578b).l();
        }

        @Override // pd.w, java.lang.Runnable
        public /* synthetic */ void run() {
            pd.v.b(this);
        }
    }

    static final class y extends Lambda implements Function0 {

        static final class a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f105580f = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final qd.a invoke() {
                Function0 function0B = ec.a.b();
                if (function0B != null) {
                    return (qd.a) function0B.invoke();
                }
                return null;
            }
        }

        y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final cd.a invoke() {
            a aVar = a.f105580f;
            b0 b0Var = b0.this;
            CoroutineScope coroutineScopeQ = b0Var.Q(b0Var);
            b0 b0Var2 = b0.this;
            return new cd.a(aVar, coroutineScopeQ, b0Var2.O(b0Var2));
        }
    }

    static final class z extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ id.d f105581f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(id.d dVar) {
            super(0);
            this.f105581f = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final ad.a invoke() {
            return new ad.a(this.f105581f.i());
        }
    }

    public b0(Context context, id.d adPhaseParams, Object assetsHolder, jd.f tag, ed.c adState, uc.u adPhaseControllerListener, tc.d adAnimationController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adPhaseParams, "adPhaseParams");
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(adState, "adState");
        Intrinsics.checkNotNullParameter(adPhaseControllerListener, "adPhaseControllerListener");
        Intrinsics.checkNotNullParameter(adAnimationController, "adAnimationController");
        this.f105422a = assetsHolder;
        this.f105423b = tag;
        this.f105424c = adState;
        this.f105425d = adPhaseControllerListener;
        this.f105426e = adAnimationController;
        this.f105427f = context.getApplicationContext();
        this.f105428g = lf.i.a(new y());
        this.f105429h = lf.i.a(new i(adPhaseParams));
        this.f105431j = new f(this, context);
        this.f105432k = new c();
        this.f105433l = lf.i.a(new z(adPhaseParams));
        this.f105434m = lf.i.a(new k());
        this.f105435n = new xd.a(Q(this).getCoroutineContext().plus(O(this).f()));
        this.f105436o = new ConcurrentHashMap();
        this.f105437p = new CopyOnWriteArrayList();
        this.f105438q = new CopyOnWriteArrayList();
        this.f105439r = new CopyOnWriteArrayList();
        this.f105440s = lf.i.a(new h());
    }

    public static /* synthetic */ boolean B(b0 b0Var, jc.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return b0Var.A(aVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(ic.f item) {
        Intrinsics.checkNotNullParameter(item, "$item");
        item.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ic.j O(b0 b0Var) {
        return b0Var.f105424c.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineScope Q(b0 b0Var) {
        return b0Var.f105424c.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f0 V() {
        return (f0) this.f105434m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ec.b Y() {
        return (ec.b) this.f105428g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ad.b Z() {
        return (ad.b) this.f105433l.getValue();
    }

    private final wc.a h(id.a aVar) {
        id.s sVarD = aVar.d();
        if (sVarD != null) {
            return new wc.a(f().e().h(), aVar.j(), sVarD, this.f105432k);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(ic.f item) {
        Intrinsics.checkNotNullParameter(item, "$item");
        item.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(id.t tVar) {
        uc.v vVarX;
        if (this.f105424c.h() || (vVarX = X()) == null) {
            return;
        }
        vVarX.a(tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(String str, String str2) {
        ic.v.b(this.f105423b, "EventTask - " + str + ", target object (" + str2 + ") not found", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(String str, String str2, String str3) {
        ic.v.b(this.f105423b, "EventTask - " + str + ", target object (" + str2 + ") not " + str3, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(jd.m mVar, boolean z10, boolean z11, Runnable runnable) {
        if ((mVar instanceof ic.f) && this.f105424c.d() && !this.f105424c.h()) {
            this.f105426e.g((ic.f) mVar, z10 ? id.f.Appear : id.f.Disappear, z11, z10 ? runnable : null, z10 ? null : runnable);
        } else {
            runnable.run();
        }
    }

    public static /* synthetic */ void v(b0 b0Var, f0 f0Var, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        b0Var.m(f0Var, list);
    }

    public final boolean A(jc.a item, boolean z10) {
        Intrinsics.checkNotNullParameter(item, "item");
        boolean zX = item.x();
        if (zX) {
            this.f105426e.a(item, z10, id.f.Appear);
        }
        return zX;
    }

    public final Object C(String name) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(name, "name");
        if (StringsKt.y0(name)) {
            return null;
        }
        Iterator it = this.f105437p.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt.N(((ic.f) next).h().j(), name, true)) {
                break;
            }
        }
        Object next3 = (ic.f) next;
        if (next3 == null) {
            Iterator it2 = this.f105438q.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (StringsKt.N(((ic.f) next2).h().j(), name, true)) {
                    break;
                }
            }
            next3 = (ic.f) next2;
            if (next3 == null) {
                Iterator it3 = this.f105439r.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    if (StringsKt.N(((ic.w) next3).u().a(), name, true)) {
                        break;
                    }
                }
            }
        }
        if (next3 != null) {
            return next3;
        }
        if (Intrinsics.areEqual(V().t(), name)) {
            return V();
        }
        return null;
    }

    public final void G(final ic.f item, boolean z10) {
        Intrinsics.checkNotNullParameter(item, "item");
        ic.v.g(this.f105423b, "Show AdElement - " + item.h().j() + ", animated: " + z10, new Object[0]);
        ic.u uVar = new ic.u() { // from class: uc.x
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                b0.F(item);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        };
        if (z10) {
            tc.c.a(this.f105426e, item, id.f.Appear, false, uVar, null, 20, null);
        } else {
            uVar.run();
        }
    }

    public final void H(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ic.v.g(this.f105423b, "Destroy TargetObjects", new Object[0]);
        Iterator it = items.iterator();
        while (it.hasNext()) {
            m((f0) it.next(), items);
        }
        items.clear();
    }

    public final void I(List items, boolean z10) {
        Intrinsics.checkNotNullParameter(items, "items");
        ic.v.g(this.f105423b, "Show AdElements, animated: " + z10, new Object[0]);
        Iterator it = items.iterator();
        while (it.hasNext()) {
            G((ic.f) it.next(), z10);
        }
    }

    public final void P() {
        ic.v.g(this.f105423b, "Cancel loading AdElements", new Object[0]);
        Iterator it = this.f105436o.entrySet().iterator();
        while (it.hasNext()) {
            this.f105435n.cancel((Runnable) ((Map.Entry) it.next()).getValue());
        }
        this.f105436o.clear();
    }

    public final void R() {
        ic.v.g(this.f105423b, "Destroy AdPhase", new Object[0]);
        this.f105426e.b(f());
        final ic.g gVarF = f();
        jd.h.d(new ic.u() { // from class: uc.z
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                gVarF.a();
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    public final jc.b S() {
        return (jc.b) this.f105440s.getValue();
    }

    public final List T() {
        return this.f105437p;
    }

    public final List U() {
        return this.f105438q;
    }

    public final List W() {
        return this.f105439r;
    }

    public uc.v X() {
        return this.f105430i;
    }

    @Override // uc.t
    public void a(uc.v vVar) {
        this.f105430i = vVar;
    }

    public final boolean a0() {
        List listA = f().e().a();
        if (listA.isEmpty()) {
            o(new id.a0("AdPhase does not contain any ads part"));
            return false;
        }
        if (b()) {
            d0();
            return false;
        }
        if (!this.f105424c.c()) {
            return false;
        }
        this.f105437p.addAll(f(listA, new a()));
        if (!this.f105437p.isEmpty()) {
            return true;
        }
        o(new id.a0("No supported ads found for the given parameters"));
        return false;
    }

    public final void b0() {
        this.f105438q.addAll(f(f().e().e(), new e()));
    }

    public final void c0() {
        List<r0> listG = f().e().g();
        List list = this.f105439r;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listG, 10));
        for (r0 r0Var : listG) {
            arrayList.add(new ic.w(r0Var, i(r0Var.a())));
        }
        list.addAll(arrayList);
    }

    public final void d0() {
        if (this.f105424c.a(true)) {
            this.f105425d.d(this);
        }
    }

    @Override // uc.t
    public void e() {
        ic.v.g(this.f105423b, "AdPhase - onCollapsed", new Object[0]);
        V().s().h();
        for (ic.f fVar : T()) {
            if (ic.f.class.isInstance(fVar)) {
                jd.h.d(new m(fVar));
            }
        }
        for (ic.f fVar2 : U()) {
            if (ic.f.class.isInstance(fVar2)) {
                jd.h.d(new n(fVar2));
            }
        }
        for (ic.w wVar : W()) {
            if (ic.f.class.isInstance(wVar)) {
                jd.h.d(new o(wVar));
            }
        }
        f0 f0VarV = V();
        if (ic.f.class.isInstance(f0VarV)) {
            jd.h.d(new p(f0VarV));
        }
    }

    @Override // uc.t
    public ic.g f() {
        return (ic.g) this.f105429h.getValue();
    }

    @Override // uc.t
    public void g() {
        ic.v.g(this.f105423b, "AdPhase - onExpanded", new Object[0]);
        V().s().e();
    }

    public final yc.b i(String sourceName) {
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        return new yc.c(sourceName, new ad.c(Z()), new tc.e(this.f105426e, new j()), new yc.a(this.f105431j, sourceName), Q(this), O(this), f().e().f(sourceName));
    }

    public final void k(final ic.f item, List list) {
        Intrinsics.checkNotNullParameter(item, "item");
        ic.v.g(this.f105423b, "Destroy AdElement - " + item.h().j(), new Object[0]);
        this.f105426e.c(item);
        if (list != null) {
            list.remove(item);
        }
        jd.h.d(new ic.u() { // from class: uc.w
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                item.a();
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    public final void l(final ic.f item, boolean z10) {
        Intrinsics.checkNotNullParameter(item, "item");
        ic.v.g(this.f105423b, "Hide AdElement - " + item.h().j() + ", animated: " + z10, new Object[0]);
        ic.u uVar = new ic.u() { // from class: uc.a0
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                b0.j(item);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        };
        if (z10) {
            tc.c.a(this.f105426e, item, id.f.Disappear, false, null, uVar, 12, null);
        } else {
            uVar.run();
        }
    }

    public final void m(final f0 item, List list) {
        Intrinsics.checkNotNullParameter(item, "item");
        ic.v.g(this.f105423b, "Destroy TargetObject - " + item.t(), new Object[0]);
        if (list != null) {
            b1.a(list).remove(item);
        }
        jd.h.d(new ic.u() { // from class: uc.y
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                ic.t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                item.a();
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                pd.v.b(this);
            }
        });
    }

    public final void o(id.a0 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.f105424c.a(false)) {
            this.f105425d.c(this, error);
        }
    }

    @Override // uc.t
    public void onShown() {
        if (this.f105424c.i()) {
            ic.v.g(this.f105423b, "AdPhase - onShown", new Object[0]);
            I(this.f105437p, true);
            I(this.f105438q, true);
            V().s().m();
        }
    }

    public final void r(List item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ic.v.g(this.f105423b, "Destroy AdElements", new Object[0]);
        Iterator it = item.iterator();
        while (it.hasNext()) {
            k((ic.f) it.next(), item);
        }
        item.clear();
    }

    public final void s(List items, boolean z10) {
        Intrinsics.checkNotNullParameter(items, "items");
        ic.v.g(this.f105423b, "Hide AdElements, animated: " + z10, new Object[0]);
        Iterator it = items.iterator();
        while (it.hasNext()) {
            l((ic.f) it.next(), z10);
        }
    }

    public final void t(jc.a adForm, jc.c adFormListener) {
        Intrinsics.checkNotNullParameter(adForm, "adForm");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        ic.v.g(this.f105423b, "Load AdElement - " + adForm.h().j(), new Object[0]);
        uc.s sVar = new uc.s(adForm);
        this.f105436o.put(adForm, sVar);
        try {
            this.f105435n.execute(sVar);
        } catch (Throwable th2) {
            adFormListener.d(adForm, id.a0.f74366b.a(th2));
        }
    }

    public String toString() {
        String string = this.f105423b.toString();
        Intrinsics.checkNotNullExpressionValue(string, "tag.toString()");
        return string;
    }

    @Override // uc.t
    public boolean a(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return f().d(container, this.f105437p, this.f105438q);
    }

    @Override // uc.t
    public boolean b() {
        return this.f105424c.b();
    }

    @Override // uc.t
    public void c() {
        ic.v.g(this.f105423b, "AdPhase - load", new Object[0]);
        eg.i.d(Q(this), O(this).f(), null, new l(null), 2, null);
    }

    @Override // uc.t
    public void d() {
        ic.v.g(this.f105423b, "AdPhase - performShow", new Object[0]);
        for (ic.f fVar : T()) {
            if (c0.class.isInstance(fVar)) {
                jd.h.d(new u(fVar));
            }
        }
        for (ic.f fVar2 : U()) {
            if (c0.class.isInstance(fVar2)) {
                jd.h.d(new v(fVar2));
            }
        }
        for (ic.w wVar : W()) {
            if (c0.class.isInstance(wVar)) {
                jd.h.d(new w(wVar));
            }
        }
        f0 f0VarV = V();
        if (c0.class.isInstance(f0VarV)) {
            jd.h.d(new x(f0VarV));
        }
        if (this.f105424c.m()) {
            I(this.f105437p, false);
            I(this.f105438q, false);
        }
        this.f105424c.l();
    }

    public final List f(List elementsParams, jc.c adFormListener) {
        Intrinsics.checkNotNullParameter(elementsParams, "elementsParams");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(elementsParams, 10));
        Iterator it = elementsParams.iterator();
        while (it.hasNext()) {
            arrayList.add(g((id.a) it.next(), adFormListener));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            t((jc.a) it2.next(), adFormListener);
        }
        return arrayList;
    }

    @Override // uc.t
    public void a(boolean z10) {
        ic.v.g(this.f105423b, "AdPhase - performHide, isFinishing: " + z10, new Object[0]);
        for (ic.f fVar : T()) {
            if (c0.class.isInstance(fVar)) {
                jd.h.d(new q(fVar));
            }
        }
        for (ic.f fVar2 : U()) {
            if (c0.class.isInstance(fVar2)) {
                jd.h.d(new r(fVar2));
            }
        }
        for (ic.w wVar : W()) {
            if (c0.class.isInstance(wVar)) {
                jd.h.d(new s(wVar));
            }
        }
        f0 f0VarV = V();
        if (c0.class.isInstance(f0VarV)) {
            jd.h.d(new t(f0VarV));
        }
        s(this.f105437p, z10);
        s(this.f105438q, z10);
    }

    public final jc.a g(id.a elementParams, jc.c adFormListener) {
        Intrinsics.checkNotNullParameter(elementParams, "elementParams");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        ic.v.g(this.f105423b, "Create AdElement - " + elementParams.j(), new Object[0]);
        return S().b(this.f105422a, elementParams, adFormListener, i(elementParams.j()), h(elementParams));
    }

    @Override // uc.t
    public void a() {
        ic.v.g(this.f105423b, "AdPhase - destroy", new Object[0]);
        P();
        r(this.f105437p);
        r(this.f105438q);
        R();
        H(this.f105439r);
        v(this, V(), null, 2, null);
        a((uc.v) null);
        this.f105424c.a();
    }
}
