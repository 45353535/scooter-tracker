package yads;

import android.text.TextUtils;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes4.dex */
public final class bz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109155b;

    public bz0(String str, String str2) {
        this.f109154a = str;
        this.f109155b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bz0.class == obj.getClass()) {
            bz0 bz0Var = (bz0) obj;
            if (TextUtils.equals(this.f109154a, bz0Var.f109154a) && TextUtils.equals(this.f109155b, bz0Var.f109155b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f109155b.hashCode() + (this.f109154a.hashCode() * 31);
    }

    public final String toString() {
        return "Header[name=" + this.f109154a + ",value=" + this.f109155b + C4240b4.j.f42674e;
    }
}
