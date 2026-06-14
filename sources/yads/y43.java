package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class y43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f118080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f118081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f118082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f118083d;

    public y43(int i10, int i11, int i12, byte[] bArr) {
        this.f118080a = i10;
        this.f118081b = bArr;
        this.f118082c = i11;
        this.f118083d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y43.class == obj.getClass()) {
            y43 y43Var = (y43) obj;
            if (this.f118080a == y43Var.f118080a && this.f118082c == y43Var.f118082c && this.f118083d == y43Var.f118083d && Arrays.equals(this.f118081b, y43Var.f118081b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f118081b) + (this.f118080a * 31)) * 31) + this.f118082c) * 31) + this.f118083d;
    }
}
