package f1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.SurfaceView;
import f1.ja;
import f1.lg;
import f1.ze;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class n8 implements z6 {
    public final Lazy A;
    public final Lazy B;
    public final Lazy C;
    public final Lazy D;
    public final Lazy E;
    public final Lazy F;
    public final Lazy G;
    public final Lazy H;
    public final Lazy I;
    public final Lazy J;
    public final Lazy K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j4 f70571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f70572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f70573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f70574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f70575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Lazy f70576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f70577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f70578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lazy f70579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f70580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Lazy f70581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f70582l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f70583m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f70584n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Lazy f70585o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Lazy f70586p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Lazy f70587q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Lazy f70588r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Lazy f70589s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Lazy f70590t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Lazy f70591u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Lazy f70592v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Lazy f70593w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Lazy f70594x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Lazy f70595y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Lazy f70596z;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final wc invoke() {
            return new wc(n8.this.f70571a.i());
        }
    }

    public static final class a0 extends Lambda implements Function0 {
        public a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final o6 invoke() {
            PackageManager packageManager = n8.this.f70571a.getContext().getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            return new o6(packageManager, null, 2, null);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70599a;

        static {
            int[] iArr = new int[ze.b.values().length];
            try {
                iArr[ze.b.f71830e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ze.b.f71829d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f70599a = iArr;
        }
    }

    public static final class b0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b0 f70600f = new b0();

        public b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final i1.a invoke() {
            return new i1.a(0L, 0L, 0L, 7, null);
        }
    }

    public static final class c extends Lambda implements Function0 {

        public static final class a extends Lambda implements Function5 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ n8 f70602f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(n8 n8Var) {
                super(5);
                this.f70602f = n8Var;
            }

            @Override // kotlin.jvm.functions.Function5
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final cf invoke(Context cxt, SurfaceView s10, n0 n0Var, t6 h10, f1.m mVar) {
                Intrinsics.checkNotNullParameter(cxt, "cxt");
                Intrinsics.checkNotNullParameter(s10, "s");
                Intrinsics.checkNotNullParameter(h10, "h");
                Intrinsics.checkNotNullParameter(mVar, "<anonymous parameter 4>");
                return new cf(cxt, null, this.f70602f.f(), s10, n0Var, h10, this.f70602f.F(), 2, null);
            }
        }

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Function5 invoke() {
            return new a(n8.this);
        }
    }

    public static final class c0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c0 f70603f = new c0();

        public c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final hd invoke() {
            return new hd();
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final l5 invoke() {
            return new l5(n8.this.B(), n8.this.z(), null, 0L, 0, 28, null);
        }
    }

    public static final class d0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ i1 f70605f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ n8 f70606g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ kd f70607h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(i1 i1Var, n8 n8Var, kd kdVar) {
            super(0);
            this.f70605f = i1Var;
            this.f70606g = n8Var;
            this.f70607h = kdVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final wf invoke() {
            return new wf(this.f70605f.b(), this.f70606g.y(), this.f70606g.j(), this.f70606g.s(), this.f70606g.f70571a.c(), this.f70605f.a(), this.f70607h.a());
        }
    }

    public static final class e extends Lambda implements Function0 {

        public static final class a extends Lambda implements Function5 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ n8 f70609f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(n8 n8Var) {
                super(5);
                this.f70609f = n8Var;
            }

            @Override // kotlin.jvm.functions.Function5
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f1.f invoke(Context context, SurfaceView s10, n0 n0Var, t6 h10, f1.m fc2) {
                Intrinsics.checkNotNullParameter(context, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(s10, "s");
                Intrinsics.checkNotNullParameter(h10, "h");
                Intrinsics.checkNotNullParameter(fc2, "fc");
                return new f1.f(null, s10, n0Var, h10, this.f70609f.F(), this.f70609f.D(), null, fc2, 65, null);
            }
        }

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Function5 invoke() {
            return new a(n8.this);
        }
    }

    public static final class e0 extends Lambda implements Function0 {
        public e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final nf invoke() {
            return new nf(n8.this.f70571a.getContext());
        }
    }

    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final e6 invoke() {
            return new e6(n8.this.N(), new m1(), null, 4, null);
        }
    }

    public static final class f0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ kd f70613g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(kd kdVar) {
            super(0);
            this.f70613g = kdVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final gg invoke() {
            return new gg(n8.this.e(), n8.this.h(), n8.this.g(), n8.this.u(), n8.this.b(), this.f70613g.a(), n8.this.m(), n8.this.k());
        }
    }

    public static final class g extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f70614f = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final s6 invoke() {
            return new s6();
        }
    }

    public static final class g0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ o1 f70615f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(o1 o1Var) {
            super(0);
            this.f70615f = o1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final f1.g0 invoke() {
            return this.f70615f.a();
        }
    }

    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return new l2(n8.this.f70571a.getContext(), n8.this.f70571a.b());
        }
    }

    public static final class h0 extends Lambda implements Function0 {
        public h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final f1.i invoke() {
            return new f1.i(n8.this.f70571a.getContext());
        }
    }

    public static final class i extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final i f70618f = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final i8 invoke() {
            return new i8();
        }
    }

    public static final class i0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final i0 f70619f = new i0();

        public i0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final oa invoke() {
            return new oa(null, 1, null);
        }
    }

    public static final class j extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final j f70620f = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final y9 invoke() {
            return new y9();
        }
    }

    public static final class j0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ o1 f70622g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(o1 o1Var) {
            super(0);
            this.f70622g = o1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final x2 invoke() {
            return new x2(n8.this.f70571a.getContext(), n8.this.p(), n8.this.j(), n8.this.b(), n8.this.f70571a.i(), n8.this.s(), n8.this.t(), n8.this.k(), this.f70622g.a(), null, n8.this.n());
        }
    }

    public static final class k extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final k f70623f = new k();

        public static final class a extends Lambda implements Function4 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f70624f = new a();

            public a() {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ja invoke(c9 va2, ja.b l10, CoroutineDispatcher d10, f1.m mVar) {
                Intrinsics.checkNotNullParameter(va2, "va");
                Intrinsics.checkNotNullParameter(l10, "l");
                Intrinsics.checkNotNullParameter(d10, "d");
                return new ja(va2, l10, 0.0f, null, mVar, d10, null, 76, null);
            }
        }

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Function4 invoke() {
            return a.f70624f;
        }
    }

    public static final class k0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function1 f70625f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ n8 f70626g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(Function1 function1, n8 n8Var) {
            super(0);
            this.f70625f = function1;
            this.f70626g = n8Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final AtomicReference invoke() {
            return new AtomicReference(this.f70625f.invoke(this.f70626g.f70571a));
        }
    }

    public static final class l extends Lambda implements Function0 {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final hf invoke() {
            return new hf(n8.this.f70571a.getContext(), n8.this.f70571a.j(), n8.this.f70571a.f());
        }
    }

    public static final class m extends Lambda implements Function0 {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final qb invoke() {
            ze zeVar = new ze(0L, 0, 0, 0L, 0L, 0L, 0, null, 255, null);
            return new qb(zeVar.c(), zeVar.d(), zeVar.e(), zeVar.f(), zeVar.g(), zeVar.h(), zeVar.a(), n8.this.j());
        }
    }

    public static final class n extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ i1 f70629f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ n8 f70630g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ kd f70631h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(i1 i1Var, n8 n8Var, kd kdVar) {
            super(0);
            this.f70629f = i1Var;
            this.f70630g = n8Var;
            this.f70631h = kdVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final x5 invoke() {
            return new x5(this.f70629f.b(), this.f70630g.h(), this.f70630g.g(), this.f70630g.j(), this.f70630g.b(), this.f70630g.s(), this.f70631h.a());
        }
    }

    public static final class o extends Lambda implements Function0 {

        public static final class a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ n8 f70633f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(n8 n8Var) {
                super(0);
                this.f70633f = n8Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Long invoke() {
                return Long.valueOf(((ga) this.f70633f.b().get()).E);
            }
        }

        public static final class b extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ n8 f70634f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(n8 n8Var) {
                super(0);
                this.f70634f = n8Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Long invoke() {
                return Long.valueOf(((ga) this.f70634f.b().get()).F);
            }
        }

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final q8 invoke() {
            CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(eg.m1.b(null, 1, null).plus(eg.o0.b()));
            y1 y1Var = new y1(o2.a(), eg.o0.b(), null, 4, null);
            f1.q qVar = new f1.q(new hh.x(), eg.o0.b());
            l6 l6Var = new l6(coroutineScopeA);
            return new q8(coroutineScopeA, y1Var, qVar, new e7(y1Var, l6Var, eg.o0.b()), l6Var, eg.o0.b(), new a(n8.this), 52428800L, new b(n8.this));
        }
    }

    public static final class p extends Lambda implements Function0 {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final ze.b invoke() {
            ze.b bVarI;
            ze zeVarC;
            ga gaVar = (ga) n8.this.b().get();
            if (gaVar == null || (zeVarC = gaVar.c()) == null || (bVarI = zeVarC.i()) == null) {
                bVarI = ze.b.f71829d;
            }
            eg.e("Video player type: " + bVarI, null, 2, null);
            return bVarI;
        }
    }

    public static final class q extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final q f70636f = new q();

        public static final class a extends Lambda implements Function3 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f70637f = new a();

            public a() {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f1.v invoke(n0 n0Var, lg.b vp, t6 t6Var) {
                Intrinsics.checkNotNullParameter(vp, "vp");
                Intrinsics.checkNotNullParameter(t6Var, "<anonymous parameter 2>");
                return new f1.v(n0Var, vp, null, 4, null);
            }
        }

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Function3 invoke() {
            return a.f70637f;
        }
    }

    public static final class r extends Lambda implements Function0 {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final z7 invoke() {
            Object obj = n8.this.b().get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return new z7((ga) obj);
        }
    }

    public static final class s extends Lambda implements Function0 {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final i2 invoke() {
            return new i2(n8.this.r(), n8.this.d(), null, null, 12, null);
        }
    }

    public static final class t extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final t f70640f = new t();

        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final d5 invoke() {
            return new d5(null, 1, null);
        }
    }

    public static final class u extends Lambda implements Function0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ i1 f70642g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(i1 i1Var) {
            super(0);
            this.f70642g = i1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final b3 invoke() {
            return new b3(n8.this.g(), n8.this.r(), n8.this.j(), n8.this.h(), n8.this.C(), this.f70642g.b());
        }
    }

    public static final class v extends Lambda implements Function0 {
        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final s8 invoke() {
            return new s8(n8.this.d());
        }
    }

    public static final class w extends Lambda implements Function0 {
        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final f1.m invoke() {
            return new f1.m(n8.this.f70571a.getContext(), n8.this.b());
        }
    }

    public static final class x extends Lambda implements Function0 {
        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final z3 invoke() {
            return new z3(n8.this.f70571a.getContext());
        }
    }

    public static final class y extends Lambda implements Function0 {
        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final h9 invoke() {
            return new h9(n8.this.f70571a.getContext(), n8.this.f70571a.e(), n8.this.x(), n8.this.f70571a.a(), null, 16, null);
        }
    }

    public static final class z extends Lambda implements Function0 {
        public z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final ba invoke() {
            return new ba(n8.this.i(), n8.this.S(), null, 4, null);
        }
    }

    public n8(j4 androidComponent, i1 executorComponent, o1 privacyComponent, Function1 sdkConfigFactory, kd trackerComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(executorComponent, "executorComponent");
        Intrinsics.checkNotNullParameter(privacyComponent, "privacyComponent");
        Intrinsics.checkNotNullParameter(sdkConfigFactory, "sdkConfigFactory");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        this.f70571a = androidComponent;
        this.f70572b = lf.i.a(new f0(trackerComponent));
        this.f70573c = lf.i.a(b0.f70600f);
        this.f70574d = lf.i.a(new g0(privacyComponent));
        this.f70575e = lf.i.a(new j0(privacyComponent));
        this.f70576f = lf.i.a(new l());
        this.f70577g = lf.i.a(new r());
        this.f70578h = lf.i.a(new o());
        this.f70579i = lf.i.a(new d0(executorComponent, this, trackerComponent));
        this.f70580j = lf.i.a(i.f70618f);
        this.f70581k = lf.i.a(new a());
        this.f70582l = lf.i.a(new h0());
        this.f70583m = lf.i.a(new y());
        this.f70584n = lf.i.a(new w());
        this.f70585o = lf.i.a(new k0(sdkConfigFactory, this));
        this.f70586p = lf.i.a(c0.f70603f);
        this.f70587q = lf.i.a(new n(executorComponent, this, trackerComponent));
        this.f70588r = lf.i.a(j.f70620f);
        this.f70589s = lf.i.a(g.f70614f);
        this.f70590t = lf.i.a(t.f70640f);
        this.f70591u = lf.i.a(new v());
        this.f70592v = lf.i.a(new a0());
        this.f70593w = lf.i.a(new p());
        this.f70594x = lf.i.a(new u(executorComponent));
        this.f70595y = lf.i.a(new s());
        this.f70596z = lf.i.a(new m());
        this.A = lf.i.a(new e());
        this.B = lf.i.a(new c());
        this.C = lf.i.a(q.f70636f);
        this.D = lf.i.a(k.f70623f);
        this.E = lf.i.a(new z());
        this.F = lf.i.a(new x());
        this.G = lf.i.a(new h());
        this.H = lf.i.a(new e0());
        this.I = lf.i.a(new f());
        this.J = lf.i.a(new d());
        this.K = lf.i.a(i0.f70619f);
    }

    @Override // f1.z6
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public x2 u() {
        return (x2) this.f70575e.getValue();
    }

    public e6 B() {
        return (e6) this.I.getValue();
    }

    public s6 C() {
        return (s6) this.f70589s.getValue();
    }

    public final Function4 D() {
        return (Function4) this.D.getValue();
    }

    public final ze.b E() {
        return (ze.b) this.f70593w.getValue();
    }

    public final Function3 F() {
        return (Function3) this.C.getValue();
    }

    public final q1 G() {
        return (q1) this.f70595y.getValue();
    }

    public final q1 H() {
        return (q1) this.f70594x.getValue();
    }

    public cc N() {
        return (cc) this.f70573c.getValue();
    }

    public final Function5 Q() {
        return (Function5) this.B.getValue();
    }

    public final Function5 R() {
        return (Function5) this.A.getValue();
    }

    public final l2 S() {
        return (l2) this.G.getValue();
    }

    @Override // f1.z6
    public f1.g0 a() {
        return (f1.g0) this.f70574d.getValue();
    }

    @Override // f1.z6
    public AtomicReference b() {
        return (AtomicReference) this.f70585o.getValue();
    }

    @Override // f1.z6
    public be c() {
        return (be) this.K.getValue();
    }

    @Override // f1.z6
    public y3 d() {
        return (y3) this.f70590t.getValue();
    }

    @Override // f1.z6
    public x5 e() {
        return (x5) this.f70587q.getValue();
    }

    public s8 f() {
        return (s8) this.f70591u.getValue();
    }

    @Override // f1.z6
    public wf g() {
        return (wf) this.f70579i.getValue();
    }

    @Override // f1.z6
    public f1.m h() {
        return (f1.m) this.f70584n.getValue();
    }

    public final z3 i() {
        return (z3) this.F.getValue();
    }

    @Override // f1.z6
    public f1.i j() {
        return (f1.i) this.f70582l.getValue();
    }

    @Override // f1.z6
    public wc k() {
        return (wc) this.f70581k.getValue();
    }

    @Override // f1.z6
    public Function5 l() {
        int i10 = b.f70599a[E().ordinal()];
        if (i10 == 1) {
            return R();
        }
        if (i10 == 2) {
            return Q();
        }
        throw new lf.m();
    }

    @Override // f1.z6
    public h1.a m() {
        return (h1.a) this.f70577g.getValue();
    }

    @Override // f1.z6
    public hf n() {
        return (hf) this.f70576f.getValue();
    }

    @Override // f1.z6
    public gg o() {
        return (gg) this.f70572b.getValue();
    }

    @Override // f1.z6
    public h9 p() {
        return (h9) this.f70583m.getValue();
    }

    @Override // f1.z6
    public l5 q() {
        return (l5) this.J.getValue();
    }

    @Override // f1.z6
    public qb r() {
        return (qb) this.f70596z.getValue();
    }

    @Override // f1.z6
    public i8 s() {
        return (i8) this.f70580j.getValue();
    }

    @Override // f1.z6
    public y9 t() {
        return (y9) this.f70588r.getValue();
    }

    @Override // f1.z6
    public o6 v() {
        return (o6) this.f70592v.getValue();
    }

    @Override // f1.z6
    public q1 w() {
        q1 q1VarH;
        int i10 = b.f70599a[E().ordinal()];
        if (i10 == 1) {
            q1VarH = H();
        } else {
            if (i10 != 2) {
                throw new lf.m();
            }
            q1VarH = G();
        }
        eg.e("Video repository: " + q1VarH, null, 2, null);
        return q1VarH;
    }

    public final ba x() {
        return (ba) this.E.getValue();
    }

    public final hd y() {
        return (hd) this.f70586p.getValue();
    }

    public nf z() {
        return (nf) this.H.getValue();
    }

    public /* synthetic */ n8(j4 j4Var, i1 i1Var, o1 o1Var, Function1 function1, kd kdVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j4Var, i1Var, o1Var, (i10 & 8) != 0 ? v7.f71369a : function1, kdVar);
    }
}
