package f1;

/* JADX INFO: loaded from: classes6.dex */
public final class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f70070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f70071b;

    public i3(int i10, int i11) {
        this.f70070a = i10;
        this.f70071b = i11;
    }

    public final int a() {
        return this.f70071b;
    }

    public final int b() {
        return this.f70070a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return this.f70070a == i3Var.f70070a && this.f70071b == i3Var.f70071b;
    }

    public int hashCode() {
        return (this.f70070a * 31) + this.f70071b;
    }

    public String toString() {
        return "DisplaySize(width=" + this.f70070a + ", height=" + this.f70071b + ")";
    }
}
