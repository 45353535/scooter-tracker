package com.applovin.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f8695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8696d;

    public e(String str, String str2) {
        this(str, str2, null, false);
    }

    public String a() {
        return this.f8694b;
    }

    public Map b() {
        return this.f8695c;
    }

    public String c() {
        return this.f8693a;
    }

    public boolean d() {
        return this.f8696d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f8693a + "', backupUrl='" + this.f8694b + "', headers='" + this.f8695c + "', shouldFireInWebView='" + this.f8696d + "'}";
    }

    public e(String str, String str2, Map map, boolean z10) {
        this.f8693a = str;
        this.f8694b = str2;
        this.f8695c = map;
        this.f8696d = z10;
    }
}
