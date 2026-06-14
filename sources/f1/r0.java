package f1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
public final class r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f70884c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f70885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f70886b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public r0(int i10, int i11) {
        this.f70885a = i10;
        this.f70886b = i11;
    }

    public final int a() {
        return this.f70886b;
    }

    public final int b() {
        return this.f70885a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f70885a == r0Var.f70885a && this.f70886b == r0Var.f70886b;
    }

    public int hashCode() {
        return (this.f70885a * 31) + this.f70886b;
    }

    public String toString() {
        return "Dimensions(width=" + this.f70885a + ", height=" + this.f70886b + ")";
    }
}
