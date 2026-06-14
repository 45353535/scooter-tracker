package com.taurusx.tax.g.n0;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static c f66183w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ConcurrentHashMap<String, Object> f66184z = new ConcurrentHashMap<>();

    public static c z() {
        if (f66183w == null) {
            f66183w = new c();
        }
        return f66183w;
    }

    public void w(String str) {
        try {
            this.f66184z.remove(str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void z(String str, Object obj) {
        try {
            this.f66184z.put(str, obj);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public Object z(String str) {
        try {
            return this.f66184z.get(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
