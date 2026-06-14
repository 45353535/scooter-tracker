package f1;

import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class j7 implements m6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f70152a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f70153b = a.f70157f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f70154c = c.f70159f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f70155d = b.f70158f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function2 f70156e = e.f70161f;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f70157f = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k3 invoke(u8 impressionDependency) {
            Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
            return new k3(impressionDependency.b(), impressionDependency.q(), impressionDependency.m(), impressionDependency.e(), impressionDependency.f(), impressionDependency.o(), impressionDependency.k(), impressionDependency.p(), impressionDependency.c(), null, 512, null);
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f70158f = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z5 invoke(u8 impressionDependency) {
            Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
            return new z5(impressionDependency.b(), impressionDependency.a(), impressionDependency.g(), impressionDependency.c());
        }
    }

    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f70159f = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m9 invoke(u8 impressionDependency) {
            Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
            return new m9(impressionDependency.b(), impressionDependency.n(), impressionDependency.a(), impressionDependency.c(), impressionDependency.j(), impressionDependency.d(), impressionDependency.h(), impressionDependency.p(), impressionDependency.i());
        }
    }

    public static final class d extends Lambda implements Function2 {
        public d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final la invoke(u8 impressionDependency, ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
            return new la(impressionDependency, (p4) j7.this.f70153b.invoke(impressionDependency), (ca) j7.this.f70154c.invoke(impressionDependency), (f5) j7.this.f70155d.invoke(impressionDependency), (p) j7.this.f70156e.invoke(impressionDependency, viewGroup));
        }
    }

    public static final class e extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final e f70161f = new e();

        public e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final lf invoke(u8 impressionDependency, ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
            return new lf(impressionDependency.d(), impressionDependency.r(), impressionDependency.h(), viewGroup, impressionDependency.c(), impressionDependency.j(), impressionDependency.k());
        }
    }

    @Override // f1.m6
    public Function2 a() {
        return this.f70152a;
    }
}
