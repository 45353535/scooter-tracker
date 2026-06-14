package com.mbridge.msdk.tracker.network;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.D5;
import com.mbridge.msdk.tracker.network.b;
import com.mbridge.msdk.tracker.network.v;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class t<T> implements Comparable<t<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f51922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f51923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile p f51924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f51925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f51926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f51927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f51928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f51929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f51930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f51931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f51932k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private v.a f51933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f51934m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private u f51935n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f51936o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f51937p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f51938q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f51939r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f51940s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private x f51941t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b.a f51942u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f51943v;

    public enum a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public t(int i10, String str) {
        this(i10, str, 0);
    }

    private static int b(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public final boolean A() {
        return this.f51940s;
    }

    public final boolean B() {
        return this.f51939r;
    }

    protected abstract v<T> a(q qVar);

    protected abstract void a(T t10);

    public void a(String str) {
    }

    protected b0 c(b0 b0Var) {
        return b0Var;
    }

    public b.a d() {
        return this.f51942u;
    }

    public String e() {
        if (!TextUtils.isEmpty(this.f51923b)) {
            return this.f51923b;
        }
        if (this.f51922a == null) {
            this.f51922a = new com.mbridge.msdk.tracker.network.toolbox.e();
        }
        String strA = this.f51922a.a(this);
        this.f51923b = strA;
        return strA;
    }

    public Map<String, String> f() {
        return Collections.EMPTY_MAP;
    }

    public int g() {
        return this.f51927f;
    }

    public p h() {
        return this.f51924c;
    }

    protected Map<String, String> i() {
        return null;
    }

    protected String j() {
        return "UTF-8";
    }

    public int k() {
        return this.f51929h;
    }

    public a l() {
        return a.NORMAL;
    }

    public long m() {
        return this.f51943v;
    }

    public long n() {
        return SystemClock.elapsedRealtime() - this.f51925d;
    }

    public x o() {
        return this.f51941t;
    }

    public String p() {
        return this.f51930i;
    }

    public final int q() {
        x xVarO = o();
        if (xVarO == null) {
            return 30000;
        }
        return xVarO.b();
    }

    public final long r() {
        x xVarO = o();
        if (xVarO == null) {
            return 30000L;
        }
        long jA = xVarO.a();
        if (jA < 0) {
            return 30000L;
        }
        return jA;
    }

    public int s() {
        return this.f51931j;
    }

    public String t() {
        return this.f51928g;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(s());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(v() ? "[X] " : "[ ] ");
        sb2.append(t());
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(l());
        sb2.append(" ");
        sb2.append(this.f51934m);
        return sb2.toString();
    }

    public boolean u() {
        boolean z10;
        synchronized (this.f51932k) {
            z10 = this.f51938q;
        }
        return z10;
    }

    public boolean v() {
        boolean z10;
        synchronized (this.f51932k) {
            z10 = this.f51937p;
        }
        return z10;
    }

    public void w() {
        synchronized (this.f51932k) {
            this.f51938q = true;
        }
    }

    void x() {
        synchronized (this.f51932k) {
        }
    }

    public boolean y() {
        return true;
    }

    public final boolean z() {
        return this.f51936o;
    }

    public t(int i10, String str, int i11) {
        this(i10, str, i11, "un_known");
    }

    public boolean a() {
        return false;
    }

    void c(String str) {
        u uVar = this.f51935n;
        if (uVar != null) {
            uVar.c(this);
        }
    }

    public String d(String str) {
        if (this.f51926e != null && !TextUtils.isEmpty(str)) {
            try {
                return this.f51926e.get(str);
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public t(int i10, String str, int i11, String str2) {
        this.f51932k = new Object();
        this.f51936o = false;
        this.f51937p = false;
        this.f51938q = false;
        this.f51939r = false;
        this.f51940s = false;
        this.f51942u = null;
        this.f51943v = 0L;
        this.f51927f = i10;
        this.f51928g = str;
        this.f51929h = i11;
        this.f51930i = str2;
        a((x) new e());
        this.f51931j = b(str);
        this.f51925d = SystemClock.elapsedRealtime();
    }

    public void a(v.a aVar) {
        this.f51933l = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(x xVar) {
        this.f51941t = xVar;
        return this;
    }

    public String c() {
        return "application/x-www-form-urlencoded; charset=" + j();
    }

    void a(int i10) {
        u uVar = this.f51935n;
        if (uVar != null) {
            uVar.a(this, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(int i10) {
        this.f51934m = Integer.valueOf(i10);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> c(boolean z10) {
        this.f51939r = z10;
        return this;
    }

    public byte[] b() {
        Map<String, String> mapI = i();
        if (mapI != null && mapI.size() > 0) {
            byte[] bArrA = a(mapI, j());
            this.f51943v = bArrA.length;
            return bArrA;
        }
        this.f51943v = 0L;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(u uVar) {
        this.f51935n = uVar;
        return this;
    }

    private byte[] a(Map<String, String> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                i10++;
                if (entry.getKey() != null) {
                    sb2.append(URLEncoder.encode(entry.getKey(), str));
                    sb2.append(D5.T);
                    sb2.append(URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), str));
                    if (i10 <= map.size() - 1) {
                        sb2.append('&');
                    }
                }
            }
            return sb2.toString().getBytes(str);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Encoding not supported: " + str, e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(boolean z10) {
        this.f51940s = z10;
        return this;
    }

    public void b(b0 b0Var) {
        v.a aVar;
        synchronized (this.f51932k) {
            aVar = this.f51933l;
        }
        if (aVar != null) {
            aVar.a(b0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> a(boolean z10) {
        this.f51936o = z10;
        return this;
    }

    void a(v<?> vVar) {
        synchronized (this.f51932k) {
        }
    }

    public void a(p pVar) {
        this.f51924c = pVar;
    }

    public void a(String str, String str2) {
        if (this.f51926e == null) {
            this.f51926e = new HashMap();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            this.f51926e.put(str, str2);
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(t<T> tVar) {
        a aVarL = l();
        a aVarL2 = tVar.l();
        return aVarL == aVarL2 ? this.f51934m.intValue() - tVar.f51934m.intValue() : aVarL2.ordinal() - aVarL.ordinal();
    }
}
