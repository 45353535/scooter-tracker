package yads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class cj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f109421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f109422c;

    public cj1(String str, boolean z10, boolean z11) {
        this.f109420a = str;
        this.f109421b = z10;
        this.f109422c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == cj1.class) {
            cj1 cj1Var = (cj1) obj;
            if (TextUtils.equals(this.f109420a, cj1Var.f109420a) && this.f109421b == cj1Var.f109421b && this.f109422c == cj1Var.f109422c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((j4.a(this.f109420a, 31, 31) + (this.f109421b ? 1231 : 1237)) * 31) + (this.f109422c ? 1231 : 1237);
    }
}
