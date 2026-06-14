package j$.util;

import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes2.dex */
public final class C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C f84780c = new C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f84781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84782b;

    public C() {
        this.f84781a = false;
        this.f84782b = 0;
    }

    public C(int i10) {
        this.f84781a = true;
        this.f84782b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        boolean z10 = this.f84781a;
        return (z10 && c10.f84781a) ? this.f84782b == c10.f84782b : z10 == c10.f84781a;
    }

    public final int hashCode() {
        if (this.f84781a) {
            return this.f84782b;
        }
        return 0;
    }

    public final String toString() {
        if (this.f84781a) {
            return "OptionalInt[" + this.f84782b + C4240b4.j.f42674e;
        }
        return "OptionalInt.empty";
    }
}
