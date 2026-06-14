package f1;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j4 f70144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f70145b;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final s1 invoke() {
            return new s1(j2.this.f70144a.c());
        }
    }

    public j2(j4 androidComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        this.f70144a = androidComponent;
        this.f70145b = lf.i.a(new a());
    }

    public s1 a() {
        return (s1) this.f70145b.getValue();
    }
}
