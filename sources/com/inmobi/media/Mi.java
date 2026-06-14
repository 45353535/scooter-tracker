package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Mi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37381c;

    public Mi(int i10, int i11, int i12) {
        this.f37379a = i10;
        this.f37380b = i11;
        this.f37381c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mi)) {
            return false;
        }
        Mi mi = (Mi) obj;
        return this.f37379a == mi.f37379a && this.f37380b == mi.f37380b && this.f37381c == mi.f37381c;
    }

    public final int hashCode() {
        return this.f37381c + AbstractC3712fi.a(this.f37380b, this.f37379a * 31, 31);
    }

    public final String toString() {
        return "SemVer(major=" + this.f37379a + ", minor=" + this.f37380b + ", patch=" + this.f37381c + ")";
    }
}
