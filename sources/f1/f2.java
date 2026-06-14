package f1;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import f1.ga;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class f2 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f69784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f69785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f69786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f69787d;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ j4 f69788f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j4 j4Var) {
            super(0);
            this.f69788f = j4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final j1 invoke() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f69788f.getContext());
            Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
            return new j1(defaultSharedPreferences);
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return f2.this.b().a();
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ j4 f69790f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ kd f69791g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ f2 f69792h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j4 j4Var, kd kdVar, f2 f2Var) {
            super(0);
            this.f69790f = j4Var;
            this.f69791g = kdVar;
            this.f69792h = f2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final g0 invoke() {
            SharedPreferences sharedPreferencesI = this.f69790f.i();
            ag agVarA = this.f69791g.a();
            w2 w2Var = new w2(sharedPreferencesI, agVarA);
            g0 g0Var = new g0(new q6(w2Var, agVarA), new b2(w2Var), new q9(w2Var), new s2(), new j3(w2Var), this.f69792h.d(), this.f69792h.b(), this.f69792h.c());
            g0Var.c(new ga.b());
            return g0Var;
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ j4 f69793f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(j4 j4Var) {
            super(0);
            this.f69793f = j4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final f4 invoke() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f69793f.getContext());
            Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
            return new f4(defaultSharedPreferences);
        }
    }

    public f2(j4 androidComponent, kd trackerComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        this.f69784a = lf.i.a(new c(androidComponent, trackerComponent, this));
        this.f69785b = lf.i.a(new d(androidComponent));
        this.f69786c = lf.i.a(new a(androidComponent));
        this.f69787d = lf.i.a(new b());
    }

    @Override // f1.o1
    public g0 a() {
        return (g0) this.f69784a.getValue();
    }

    public j1 b() {
        return (j1) this.f69786c.getValue();
    }

    public String c() {
        return (String) this.f69787d.getValue();
    }

    public f4 d() {
        return (f4) this.f69785b.getValue();
    }
}
