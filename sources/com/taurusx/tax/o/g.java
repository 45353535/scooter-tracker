package com.taurusx.tax.o;

import com.taurusx.tax.o.g0;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class g {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f66428y = "uri";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g0 f66429w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Map<String, String> f66430z;

    public g(Map<String, String> map, g0 g0Var) {
        this.f66430z = map;
        this.f66429w = g0Var;
    }

    public String c(String str) {
        return this.f66430z.get(str);
    }

    public float w(String str) {
        if (this.f66430z.get(str) == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    public int y(String str) {
        String str2 = this.f66430z.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str2, 10);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public abstract void z();

    public boolean z(g0.f fVar) {
        return false;
    }

    public boolean z(String str) {
        return "true".equals(this.f66430z.get(str));
    }
}
