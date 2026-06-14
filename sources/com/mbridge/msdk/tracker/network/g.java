package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f51878b;

    public g(String str, String str2) {
        this.f51877a = str;
        this.f51878b = str2;
    }

    public final String a() {
        return this.f51877a;
    }

    public final String b() {
        return this.f51878b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (TextUtils.equals(this.f51877a, gVar.f51877a) && TextUtils.equals(this.f51878b, gVar.f51878b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f51877a.hashCode() * 31) + this.f51878b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f51877a + ",value=" + this.f51878b + C4240b4.j.f42674e;
    }
}
