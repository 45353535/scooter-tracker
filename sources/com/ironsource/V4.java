package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class V4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f41865h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f41866i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f41867j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f41868k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f41869l = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f41871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, String> f41873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private L9 f41876g;

    public V4(String str, String str2, Map<String, String> map, Ec ec2) {
        this.f41872c = -1;
        this.f41871b = str;
        this.f41870a = str2;
        this.f41873d = map;
        this.f41874e = 0;
        this.f41875f = false;
        this.f41876g = null;
    }

    public void a(boolean z10) {
        this.f41875f = z10;
    }

    public synchronized void b(int i10) {
        this.f41874e = i10;
    }

    public L9 c() {
        return this.f41876g;
    }

    public boolean d() {
        return this.f41875f;
    }

    public int e() {
        return this.f41874e;
    }

    public String f() {
        return this.f41870a;
    }

    public Map<String, String> g() {
        return this.f41873d;
    }

    public String h() {
        return this.f41871b;
    }

    public Ec i() {
        if (this.f41876g != null) {
            return c().b();
        }
        return null;
    }

    public int j() {
        return this.f41872c;
    }

    public boolean k() {
        Map<String, String> map = this.f41873d;
        if (map == null || !map.containsKey("rewarded")) {
            return false;
        }
        return Boolean.parseBoolean(this.f41873d.get("rewarded"));
    }

    public boolean a(int i10) {
        return this.f41872c == i10;
    }

    public Map<String, String> b() {
        HashMap map = new HashMap();
        map.put("demandSourceId", this.f41871b);
        map.put("demandSourceName", this.f41870a);
        Map<String, String> map2 = this.f41873d;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public void c(int i10) {
        this.f41872c = i10;
    }

    public void a() {
        Map<String, String> map = this.f41873d;
        if (map != null) {
            map.clear();
        }
        this.f41873d = null;
    }

    public V4(L9 l92) {
        this(l92.e(), l92.g(), l92.a(), l92.b());
        this.f41876g = l92;
    }
}
