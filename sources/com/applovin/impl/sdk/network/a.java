package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.k;
import com.applovin.impl.u4;
import com.applovin.impl.x4;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f10834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f10835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JSONObject f10836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f10837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f10838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f10839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f10840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f10841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f10842k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f10843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f10844m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f10845n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f10846o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final u4.a f10847p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f10848q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f10849r;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.network.a$a, reason: collision with other inner class name */
    public static class C0183a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f10850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f10851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f10852c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Map f10854e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        JSONObject f10855f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f10856g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f10858i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f10859j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f10860k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f10862m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f10863n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f10864o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f10865p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        u4.a f10866q;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f10857h = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f10861l = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Map f10853d = new HashMap();

        public C0183a(k kVar) {
            this.f10858i = ((Integer) kVar.a(x4.T2)).intValue();
            this.f10859j = ((Integer) kVar.a(x4.S2)).intValue();
            this.f10862m = ((Boolean) kVar.a(x4.f11395p3)).booleanValue();
            this.f10863n = ((Boolean) kVar.a(x4.f11355k5)).booleanValue();
            this.f10866q = u4.a.a(((Integer) kVar.a(x4.f11364l5)).intValue());
            this.f10865p = ((Boolean) kVar.a(x4.K5)).booleanValue();
        }

        public C0183a a(Map map) {
            this.f10854e = map;
            return this;
        }

        public C0183a b(String str) {
            this.f10851b = str;
            return this;
        }

        public C0183a c(String str) {
            this.f10850a = str;
            return this;
        }

        public C0183a d(boolean z10) {
            this.f10861l = z10;
            return this;
        }

        public C0183a e(boolean z10) {
            this.f10862m = z10;
            return this;
        }

        public C0183a f(boolean z10) {
            this.f10864o = z10;
            return this;
        }

        public C0183a a(JSONObject jSONObject) {
            this.f10855f = jSONObject;
            return this;
        }

        public C0183a b(Map map) {
            this.f10853d = map;
            return this;
        }

        public C0183a c(int i10) {
            this.f10858i = i10;
            return this;
        }

        public C0183a a(String str) {
            this.f10852c = str;
            return this;
        }

        public C0183a b(int i10) {
            this.f10859j = i10;
            return this;
        }

        public C0183a c(boolean z10) {
            this.f10860k = z10;
            return this;
        }

        public C0183a a(Object obj) {
            this.f10856g = obj;
            return this;
        }

        public C0183a b(boolean z10) {
            this.f10865p = z10;
            return this;
        }

        public C0183a a(int i10) {
            this.f10857h = i10;
            return this;
        }

        public C0183a a(boolean z10) {
            this.f10863n = z10;
            return this;
        }

        public C0183a a(u4.a aVar) {
            this.f10866q = aVar;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    protected a(C0183a c0183a) {
        this.f10832a = c0183a.f10851b;
        this.f10833b = c0183a.f10850a;
        this.f10834c = c0183a.f10853d;
        this.f10835d = c0183a.f10854e;
        this.f10836e = c0183a.f10855f;
        this.f10837f = c0183a.f10852c;
        this.f10838g = c0183a.f10856g;
        int i10 = c0183a.f10857h;
        this.f10839h = i10;
        this.f10840i = i10;
        this.f10841j = c0183a.f10858i;
        this.f10842k = c0183a.f10859j;
        this.f10843l = c0183a.f10860k;
        this.f10844m = c0183a.f10861l;
        this.f10845n = c0183a.f10862m;
        this.f10846o = c0183a.f10863n;
        this.f10847p = c0183a.f10866q;
        this.f10848q = c0183a.f10864o;
        this.f10849r = c0183a.f10865p;
    }

    public void a(String str) {
        this.f10832a = str;
    }

    public void b(String str) {
        this.f10833b = str;
    }

    public int c() {
        return this.f10839h - this.f10840i;
    }

    public Object d() {
        return this.f10838g;
    }

    public u4.a e() {
        return this.f10847p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f10832a;
        if (str == null ? aVar.f10832a != null : !str.equals(aVar.f10832a)) {
            return false;
        }
        Map map = this.f10834c;
        if (map == null ? aVar.f10834c != null : !map.equals(aVar.f10834c)) {
            return false;
        }
        Map map2 = this.f10835d;
        if (map2 == null ? aVar.f10835d != null : !map2.equals(aVar.f10835d)) {
            return false;
        }
        String str2 = this.f10837f;
        if (str2 == null ? aVar.f10837f != null : !str2.equals(aVar.f10837f)) {
            return false;
        }
        String str3 = this.f10833b;
        if (str3 == null ? aVar.f10833b != null : !str3.equals(aVar.f10833b)) {
            return false;
        }
        JSONObject jSONObject = this.f10836e;
        if (jSONObject == null ? aVar.f10836e != null : !jSONObject.equals(aVar.f10836e)) {
            return false;
        }
        Object obj2 = this.f10838g;
        if (obj2 == null ? aVar.f10838g == null : obj2.equals(aVar.f10838g)) {
            return this.f10839h == aVar.f10839h && this.f10840i == aVar.f10840i && this.f10841j == aVar.f10841j && this.f10842k == aVar.f10842k && this.f10843l == aVar.f10843l && this.f10844m == aVar.f10844m && this.f10845n == aVar.f10845n && this.f10846o == aVar.f10846o && this.f10847p == aVar.f10847p && this.f10848q == aVar.f10848q && this.f10849r == aVar.f10849r;
        }
        return false;
    }

    public String f() {
        return this.f10832a;
    }

    public Map g() {
        return this.f10835d;
    }

    public String h() {
        return this.f10833b;
    }

    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f10832a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10837f;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10833b;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Object obj = this.f10838g;
        int iHashCode5 = ((((((((((((((((((((((iHashCode4 + (obj != null ? obj.hashCode() : 0)) * 31) + this.f10839h) * 31) + this.f10840i) * 31) + this.f10841j) * 31) + this.f10842k) * 31) + (this.f10843l ? 1 : 0)) * 31) + (this.f10844m ? 1 : 0)) * 31) + (this.f10845n ? 1 : 0)) * 31) + (this.f10846o ? 1 : 0)) * 31) + this.f10847p.b()) * 31) + (this.f10848q ? 1 : 0)) * 31) + (this.f10849r ? 1 : 0);
        Map map = this.f10834c;
        if (map != null) {
            iHashCode5 = (iHashCode5 * 31) + map.hashCode();
        }
        Map map2 = this.f10835d;
        if (map2 != null) {
            iHashCode5 = (iHashCode5 * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f10836e;
        if (jSONObject == null) {
            return iHashCode5;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        return (iHashCode5 * 31) + new String(charArray).hashCode();
    }

    public Map i() {
        return this.f10834c;
    }

    public int j() {
        return this.f10840i;
    }

    public int k() {
        return this.f10842k;
    }

    public int l() {
        return this.f10841j;
    }

    public boolean m() {
        return this.f10846o;
    }

    public boolean n() {
        return this.f10843l;
    }

    public boolean o() {
        return this.f10849r;
    }

    public boolean p() {
        return this.f10844m;
    }

    public boolean q() {
        return this.f10845n;
    }

    public boolean r() {
        return this.f10848q;
    }

    public String toString() {
        return "HttpRequest {endpoint=" + this.f10832a + ", backupEndpoint=" + this.f10837f + ", httpMethod=" + this.f10833b + ", httpHeaders=" + this.f10835d + ", body=" + this.f10836e + ", emptyResponse=" + this.f10838g + ", initialRetryAttempts=" + this.f10839h + ", retryAttemptsLeft=" + this.f10840i + ", timeoutMillis=" + this.f10841j + ", retryDelayMillis=" + this.f10842k + ", exponentialRetries=" + this.f10843l + ", retryOnAllErrors=" + this.f10844m + ", retryOnNoConnection=" + this.f10845n + ", encodingEnabled=" + this.f10846o + ", encodingType=" + this.f10847p + ", trackConnectionSpeed=" + this.f10848q + ", gzipBodyEncoding=" + this.f10849r + '}';
    }

    public String a() {
        return this.f10837f;
    }

    public JSONObject b() {
        return this.f10836e;
    }

    public void a(int i10) {
        this.f10840i = i10;
    }

    public static C0183a a(k kVar) {
        return new C0183a(kVar);
    }
}
