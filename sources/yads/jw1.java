package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class jw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f112485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f112486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f112487d;

    public jw1(int i10, int i11, int i12, int i13) {
        this.f112484a = i10;
        this.f112485b = i11;
        this.f112486c = i12;
        this.f112487d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw1)) {
            return false;
        }
        jw1 jw1Var = (jw1) obj;
        return this.f112484a == jw1Var.f112484a && this.f112485b == jw1Var.f112485b && this.f112486c == jw1Var.f112486c && this.f112487d == jw1Var.f112487d;
    }

    public final int hashCode() {
        return this.f112487d + bb3.a(this.f112486c, bb3.a(this.f112485b, this.f112484a * 31, 31), 31);
    }

    public final String toString() {
        return "MuteControlResources(mutedResourceId=" + this.f112484a + ", unmutedResourceId=" + this.f112485b + ", mutedContentDescriptionId=" + this.f112486c + ", unmutedContentDescriptionId=" + this.f112487d + ")";
    }
}
