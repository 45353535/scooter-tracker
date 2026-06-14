package f1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f71125d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r0 f71126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r0 f71127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r0 f71128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t3 f71129h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f71130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f71131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f71132c;

    public static final class a {
        public a() {
        }

        public final t3 a() {
            return t3.f71129h;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        r0 r0Var = new r0(0, 0);
        f71126e = r0Var;
        r0 r0Var2 = new r0(8, 8);
        f71127f = r0Var2;
        r0 r0Var3 = new r0(28, 28);
        f71128g = r0Var3;
        f71129h = new t3(r0Var, r0Var2, r0Var3);
    }

    public t3(r0 margin, r0 padding, r0 size) {
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f71130a = margin;
        this.f71131b = padding;
        this.f71132c = size;
    }

    public final r0 b() {
        return this.f71130a;
    }

    public final r0 c() {
        return this.f71131b;
    }

    public final r0 d() {
        return this.f71132c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3)) {
            return false;
        }
        t3 t3Var = (t3) obj;
        return Intrinsics.areEqual(this.f71130a, t3Var.f71130a) && Intrinsics.areEqual(this.f71131b, t3Var.f71131b) && Intrinsics.areEqual(this.f71132c, t3Var.f71132c);
    }

    public int hashCode() {
        return (((this.f71130a.hashCode() * 31) + this.f71131b.hashCode()) * 31) + this.f71132c.hashCode();
    }

    public String toString() {
        return "ButtonAttributes(margin=" + this.f71130a + ", padding=" + this.f71131b + ", size=" + this.f71132c + ")";
    }
}
