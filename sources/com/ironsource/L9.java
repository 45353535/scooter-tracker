package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class L9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f41268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f41269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f41270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f41271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C4312f8 f41272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, String> f41273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Ec f41274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f41275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f41276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f41277j;

    L9(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, String str3, Map<String, String> map, Ec ec2, C4312f8 c4312f8) {
        this.f41269b = str;
        this.f41270c = str2;
        this.f41268a = z10;
        this.f41271d = z11;
        this.f41273f = map;
        this.f41274g = ec2;
        this.f41272e = c4312f8;
        this.f41276i = z12;
        this.f41277j = z13;
        this.f41275h = str3;
    }

    public Map<String, String> a() {
        HashMap map = new HashMap();
        map.put("instanceId", this.f41269b);
        map.put("instanceName", this.f41270c);
        map.put("rewarded", Boolean.toString(this.f41268a));
        map.put("inAppBidding", Boolean.toString(this.f41271d));
        map.put("isOneFlow", Boolean.toString(this.f41276i));
        map.put(C4240b4.f42489r, String.valueOf(2));
        C4312f8 c4312f8 = this.f41272e;
        map.put("width", c4312f8 != null ? Integer.toString(c4312f8.c()) : "0");
        C4312f8 c4312f82 = this.f41272e;
        map.put("height", c4312f82 != null ? Integer.toString(c4312f82.a()) : "0");
        C4312f8 c4312f83 = this.f41272e;
        map.put("label", c4312f83 != null ? c4312f83.b() : "");
        map.put(C4240b4.f42493v, Boolean.toString(i()));
        if (this.f41277j) {
            map.put("isMultipleAdObjects", "true");
        }
        String str = this.f41275h;
        if (str != null) {
            map.put("adUnitId", str);
        }
        Map<String, String> map2 = this.f41273f;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public final Ec b() {
        return this.f41274g;
    }

    public String c() {
        return this.f41275h;
    }

    public Map<String, String> d() {
        return this.f41273f;
    }

    public String e() {
        return this.f41269b;
    }

    public String f() {
        return this.f41270c.replaceAll("IronSource_", "");
    }

    public String g() {
        return this.f41270c;
    }

    public C4312f8 h() {
        return this.f41272e;
    }

    public boolean i() {
        return h() != null && h().d();
    }

    public boolean j() {
        return this.f41271d;
    }

    public boolean k() {
        return j() || m();
    }

    public boolean l() {
        return this.f41277j;
    }

    public boolean m() {
        return this.f41276i;
    }

    public boolean n() {
        return this.f41268a;
    }

    public void a(Ec ec2) {
        this.f41274g = ec2;
    }

    public void a(String str) {
        this.f41275h = str;
    }
}
