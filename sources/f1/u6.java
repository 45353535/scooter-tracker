package f1;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class u6 implements n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f71240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f71241b;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ j4 f71242f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j4 j4Var) {
            super(0);
            this.f71242f = j4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final bc invoke() {
            return new bc(this.f71242f.getContext(), this.f71242f.d(), this.f71242f.k());
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f71243f = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final zd invoke() {
            return new zd();
        }
    }

    public u6(j4 androidComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        this.f71240a = lf.i.a(new a(androidComponent));
        this.f71241b = lf.i.a(b.f71243f);
    }
}
