package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class df extends kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9 f64426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64427b;

    public df(h9 h9Var, String str) {
        this.f64426a = h9Var;
        this.f64427b = str;
    }

    @Override // com.startapp.sdk.internal.kf
    public final boolean a(Object obj) {
        if (obj instanceof x9) {
            h9 h9Var = this.f64426a;
            g9 g9Var = ((x9) obj).f65531j0;
            if (h9Var == g9Var.f64550a) {
                String str = this.f64427b;
                return str == null || str.equals(g9Var.f64553d);
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && df.class == obj.getClass()) {
            df dfVar = (df) obj;
            if (vi.a(this.f64426a, dfVar.f64426a) && vi.a((Object) this.f64427b, (Object) dfVar.f64427b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f64426a, this.f64427b};
        WeakHashMap weakHashMap = vi.f65408a;
        return Arrays.deepHashCode(objArr);
    }
}
