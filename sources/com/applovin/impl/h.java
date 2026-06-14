package com.applovin.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8954d;

    public h(int i10, int i11, int i12, int i13) {
        this.f8951a = i10;
        this.f8952b = i11;
        this.f8953c = i12;
        this.f8954d = i13;
    }

    protected boolean a(Object obj) {
        return obj instanceof h;
    }

    public int b() {
        return this.f8953c;
    }

    public int c() {
        return this.f8952b;
    }

    public int d() {
        return this.f8951a;
    }

    public Map e() {
        HashMap map = new HashMap(4);
        map.put("asr_num", Integer.valueOf(this.f8951a));
        map.put("air_num", Integer.valueOf(this.f8952b));
        map.put("fsr_num", Integer.valueOf(this.f8953c));
        map.put("fir_num", Integer.valueOf(this.f8954d));
        return map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.a(this) && d() == hVar.d() && c() == hVar.c() && b() == hVar.b() && a() == hVar.a();
    }

    public int hashCode() {
        return ((((((d() + 59) * 59) + c()) * 59) + b()) * 59) + a();
    }

    public String toString() {
        return "AdRequestNumberInfo(adUnitSessionAdRequestNumber=" + d() + ", adUnitInstallAdRequestNumber=" + c() + ", adFormatSessionAdRequestNumber=" + b() + ", adFormatInstallAdRequestNumber=" + a() + ")";
    }

    public int a() {
        return this.f8954d;
    }
}
