package f1;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class i5 implements v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f70078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f70079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f70080c;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final m3 invoke() {
            return new m3(i5.this.a(), i5.this.c());
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ j4 f70082f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ z6 f70083g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j4 j4Var, z6 z6Var) {
            super(0);
            this.f70082f = j4Var;
            this.f70083g = z6Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final r4 invoke() {
            return new r4(this.f70082f.getContext(), this.f70082f.d(), this.f70082f.k(), this.f70083g.b(), null, 16, null);
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f70084f = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final b6 invoke() {
            return new b6();
        }
    }

    public i5(j4 androidComponent, z6 applicationComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        this.f70078a = lf.i.a(new b(androidComponent, applicationComponent));
        this.f70079b = lf.i.a(c.f70084f);
        this.f70080c = lf.i.a(new a());
    }

    @Override // f1.v2
    public r4 a() {
        return (r4) this.f70078a.getValue();
    }

    @Override // f1.v2
    public m3 b() {
        return (m3) this.f70080c.getValue();
    }

    public b6 c() {
        return (b6) this.f70079b.getValue();
    }
}
