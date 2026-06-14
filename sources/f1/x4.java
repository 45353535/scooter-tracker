package f1;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class x4 implements j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f71497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f71498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f71499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f71500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f71501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Lazy f71502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f71503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f71504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lazy f71505i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f71506j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Lazy f71507k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f71508l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f71509m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f71510n;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f71511f = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final s3 invoke() {
            return s3.d();
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f71512f = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final y invoke() {
            return new y();
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final ContentResolver invoke() {
            return x4.this.getContext().getContentResolver();
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final zf invoke() {
            return new zf(x4.this.getContext(), x4.this.j());
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final r2 invoke() {
            return new r2(x4.this.m(), x4.this.l(), null, null, 12, null);
        }
    }

    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final DisplayMetrics invoke() {
            return x4.this.getContext().getResources().getDisplayMetrics();
        }
    }

    public static final class g extends Lambda implements Function0 {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final e4 invoke() {
            Resources resources = x4.this.getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            return new e4(resources);
        }
    }

    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return x4.this.getContext().getSharedPreferences("cbPrefs", 0);
        }
    }

    public static final class i extends Lambda implements Function0 {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final ce invoke() {
            return new ce(x4.this.i());
        }
    }

    public static final class j extends Lambda implements Function0 {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return x4.this.getContext().getSharedPreferences("cbPrefsTracking", 0);
        }
    }

    public static final class k extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final k f71521f = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final r7 invoke() {
            return new r7();
        }
    }

    public static final class l extends Lambda implements Function0 {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final WindowManager invoke() {
            Object systemService = x4.this.getContext().getSystemService("window");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            return (WindowManager) systemService;
        }
    }

    public x4(Context context, Application app) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(app, "app");
        this.f71497a = context;
        this.f71498b = app;
        this.f71499c = lf.i.a(new h());
        this.f71500d = lf.i.a(new j());
        this.f71501e = lf.i.a(a.f71511f);
        this.f71502f = lf.i.a(k.f71521f);
        this.f71503g = lf.i.a(b.f71512f);
        this.f71504h = lf.i.a(new g());
        this.f71505i = lf.i.a(new i());
        this.f71506j = lf.i.a(new l());
        this.f71507k = lf.i.a(new f());
        this.f71508l = lf.i.a(new e());
        this.f71509m = lf.i.a(new d());
        this.f71510n = lf.i.a(new c());
    }

    @Override // f1.j4
    public y a() {
        return (y) this.f71503g.getValue();
    }

    @Override // f1.j4
    public ContentResolver b() {
        Object value = this.f71510n.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ContentResolver) value;
    }

    @Override // f1.j4
    public t6 c() {
        return (t6) this.f71502f.getValue();
    }

    @Override // f1.j4
    public ce d() {
        return (ce) this.f71505i.getValue();
    }

    @Override // f1.j4
    public s3 e() {
        Object value = this.f71501e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (s3) value;
    }

    @Override // f1.j4
    public zf f() {
        return (zf) this.f71509m.getValue();
    }

    @Override // f1.j4
    public Application g() {
        return this.f71498b;
    }

    @Override // f1.j4
    public Context getContext() {
        return this.f71497a;
    }

    @Override // f1.j4
    public SharedPreferences h() {
        Object value = this.f71500d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    @Override // f1.j4
    public SharedPreferences i() {
        Object value = this.f71499c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    @Override // f1.j4
    public r2 j() {
        return (r2) this.f71508l.getValue();
    }

    @Override // f1.j4
    public e4 k() {
        return (e4) this.f71504h.getValue();
    }

    public DisplayMetrics l() {
        Object value = this.f71507k.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (DisplayMetrics) value;
    }

    public WindowManager m() {
        return (WindowManager) this.f71506j.getValue();
    }
}
