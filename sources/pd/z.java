package pd;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f98266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f98267b;

    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return z.this.f98266a + " @" + g0.d(z.this);
        }
    }

    public z(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f98266a = name;
        this.f98267b = lf.i.a(new a());
    }

    private final String b() {
        return (String) this.f98267b.getValue();
    }

    public String toString() {
        return b();
    }
}
