package com.applovin.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f10005b;

    private o4(String str, Map map) {
        this.f10004a = str;
        this.f10005b = map;
    }

    public static o4 a(String str) {
        return a(str, null);
    }

    public String b() {
        return this.f10004a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f10004a + "'params='" + this.f10005b + "'}";
    }

    public static o4 a(String str, Map map) {
        return new o4(str, map);
    }

    public Map a() {
        return this.f10005b;
    }
}
