package f1;

import android.app.Application;
import android.content.Context;
import com.chartboost.sdk.internal.interruption.InterruptionController;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class ed implements nc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f69719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f69720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Application f69721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f69722d = lf.i.a(new a());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f69723e = lf.i.a(new b());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Lazy f69724f = lf.i.a(new f());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f69725g = lf.i.a(c.f69734f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f69726h = lf.i.a(new e());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lazy f69727i = lf.i.a(d.f69735f);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f69728j = lf.i.a(new i());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Lazy f69729k = lf.i.a(new h());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f69730l = lf.i.a(new g());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f69731m = lf.i.a(new j());

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final x4 invoke() {
            Context applicationContext = ed.this.g().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return new x4(applicationContext, ed.this.g());
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final n8 invoke() {
            return new n8(ed.this.d(), ed.this.h(), ed.this.l(), null, ed.this.b(), 8, null);
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f69734f = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final a2 invoke() {
            return new a2();
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f69735f = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final j7 invoke() {
            return new j7();
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final i5 invoke() {
            return new i5(ed.this.d(), ed.this.a());
        }
    }

    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final f2 invoke() {
            return new f2(ed.this.d(), ed.this.b());
        }
    }

    public static final class g extends Lambda implements Function0 {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final mb invoke() {
            return new mb(ed.this.d(), ed.this.b());
        }
    }

    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final fc invoke() {
            return new fc(ed.this.d(), ed.this.h(), ed.this.a(), ed.this.k(), ed.this.b());
        }
    }

    public static final class i extends Lambda implements Function0 {

        public static final class a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ ed f69741f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ed edVar) {
                super(0);
                this.f69741f = edVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final j4 invoke() {
                return this.f69741f.d();
            }
        }

        public static final class b extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ ed f69742f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ed edVar) {
                super(0);
                this.f69742f = edVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final z6 invoke() {
                return this.f69742f.a();
            }
        }

        public static final class c extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ ed f69743f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(ed edVar) {
                super(0);
                this.f69743f = edVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final g0 invoke() {
                return this.f69743f.l().a();
            }
        }

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final qf invoke() {
            return new qf(lf.i.a(new a(ed.this)), lf.i.a(new b(ed.this)), lf.i.a(new c(ed.this)));
        }
    }

    public static final class j extends Lambda implements Function0 {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final u6 invoke() {
            return new u6(ed.this.d());
        }
    }

    @Override // f1.nc
    public kd b() {
        return (kd) this.f69728j.getValue();
    }

    @Override // f1.nc
    public n5 c() {
        return (n5) this.f69731m.getValue();
    }

    @Override // f1.nc
    public j4 d() {
        return (j4) this.f69722d.getValue();
    }

    public String e() {
        String str = this.f69719a;
        return str == null ? "" : str;
    }

    public String f() {
        String str = this.f69720b;
        return str == null ? "" : str;
    }

    public final Application g() {
        Application application = this.f69721c;
        if (application != null) {
            return application;
        }
        eg.j("Missing application. Cannot start Chartboost SDK.", null, 2, null);
        throw new le();
    }

    public i1 h() {
        return (i1) this.f69725g.getValue();
    }

    public m6 i() {
        return (m6) this.f69727i.getValue();
    }

    public boolean j() {
        return this.f69721c != null;
    }

    public v2 k() {
        return (v2) this.f69726h.getValue();
    }

    public o1 l() {
        return (o1) this.f69724f.getValue();
    }

    public fa m() {
        return (fa) this.f69730l.getValue();
    }

    public r9 n() {
        return (r9) this.f69729k.getValue();
    }

    public boolean o() {
        String str;
        String str2 = this.f69719a;
        return (str2 == null || str2.length() == 0 || (str = this.f69720b) == null || str.length() == 0) ? false : true;
    }

    @Override // f1.nc
    public z6 a() {
        return (z6) this.f69723e.getValue();
    }

    public void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application == null) {
            eg.j("Failed to initialize Chartboost SDK. Application is null.", null, 2, null);
            return;
        }
        this.f69721c = application;
        try {
            InterruptionController.c(InterruptionController.f17965b, g(), null, 2, null);
            eg.m("InterruptionController initialized.", null, 2, null);
        } catch (Exception e10) {
            eg.i("Error initializing InterruptionController.", e10);
        }
    }

    public void c(String appId, String appSignature) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appSignature, "appSignature");
        this.f69719a = appId;
        this.f69720b = appSignature;
    }
}
