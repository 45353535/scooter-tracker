package yg;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
final class t implements u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f119069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f119070b;

    public static final class a implements Function0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ KClass f119072c;

        public a(KClass kClass) {
            this.f119072c = kClass;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new m((KSerializer) t.this.b().invoke(this.f119072c));
        }
    }

    public t(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f119069a = compute;
        this.f119070b = new v();
    }

    @Override // yg.u2
    public KSerializer a(KClass key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.f119070b.get(xf.a.b(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        n1 n1Var = (n1) obj;
        Object objA = n1Var.f119035a.get();
        if (objA == null) {
            objA = n1Var.a(new a(key));
        }
        return ((m) objA).f119028a;
    }

    public final Function1 b() {
        return this.f119069a;
    }
}
