package com.android.volley;

import android.text.TextUtils;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7519b;

    public g(String str, String str2) {
        this.f7518a = str;
        this.f7519b = str2;
    }

    public final String a() {
        return this.f7518a;
    }

    public final String b() {
        return this.f7519b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (TextUtils.equals(this.f7518a, gVar.f7518a) && TextUtils.equals(this.f7519b, gVar.f7519b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f7518a.hashCode() * 31) + this.f7519b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f7518a + ",value=" + this.f7519b + C4240b4.j.f42674e;
    }
}
