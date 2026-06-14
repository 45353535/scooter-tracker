package com.mbridge.msdk.thrid.okhttp;

import androidx.collection.SieveCacheKt;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f51079n = new a().b().a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f51080o = new a().c().a(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f51081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f51082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f51083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f51084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f51085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f51086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f51087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f51088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f51089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f51090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f51091k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f51092l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    String f51093m;

    private c(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f51081a = z10;
        this.f51082b = z11;
        this.f51083c = i10;
        this.f51084d = i11;
        this.f51085e = z12;
        this.f51086f = z13;
        this.f51087g = z14;
        this.f51088h = i12;
        this.f51089i = i13;
        this.f51090j = z15;
        this.f51091k = z16;
        this.f51092l = z17;
        this.f51093m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mbridge.msdk.thrid.okhttp.c a(com.mbridge.msdk.thrid.okhttp.r r23) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.c.a(com.mbridge.msdk.thrid.okhttp.r):com.mbridge.msdk.thrid.okhttp.c");
    }

    public boolean b() {
        return this.f51085e;
    }

    public boolean c() {
        return this.f51086f;
    }

    public int d() {
        return this.f51083c;
    }

    public int e() {
        return this.f51088h;
    }

    public int f() {
        return this.f51089i;
    }

    public boolean g() {
        return this.f51087g;
    }

    public boolean h() {
        return this.f51081a;
    }

    public boolean i() {
        return this.f51082b;
    }

    public boolean j() {
        return this.f51090j;
    }

    public String toString() {
        String str = this.f51093m;
        if (str != null) {
            return str;
        }
        String strA = a();
        this.f51093m = strA;
        return strA;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f51094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f51095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f51096c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f51097d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f51098e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f51099f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f51100g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f51101h;

        public a a(int i10, TimeUnit timeUnit) {
            if (i10 >= 0) {
                long seconds = timeUnit.toSeconds(i10);
                this.f51097d = seconds > SieveCacheKt.NodeLinkMask ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i10);
        }

        public a b() {
            this.f51094a = true;
            return this;
        }

        public a c() {
            this.f51099f = true;
            return this;
        }

        public c a() {
            return new c(this);
        }
    }

    c(a aVar) {
        this.f51081a = aVar.f51094a;
        this.f51082b = aVar.f51095b;
        this.f51083c = aVar.f51096c;
        this.f51084d = -1;
        this.f51085e = false;
        this.f51086f = false;
        this.f51087g = false;
        this.f51088h = aVar.f51097d;
        this.f51089i = aVar.f51098e;
        this.f51090j = aVar.f51099f;
        this.f51091k = aVar.f51100g;
        this.f51092l = aVar.f51101h;
    }

    private String a() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f51081a) {
            sb2.append("no-cache, ");
        }
        if (this.f51082b) {
            sb2.append("no-store, ");
        }
        if (this.f51083c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f51083c);
            sb2.append(", ");
        }
        if (this.f51084d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f51084d);
            sb2.append(", ");
        }
        if (this.f51085e) {
            sb2.append("private, ");
        }
        if (this.f51086f) {
            sb2.append("public, ");
        }
        if (this.f51087g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f51088h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f51088h);
            sb2.append(", ");
        }
        if (this.f51089i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f51089i);
            sb2.append(", ");
        }
        if (this.f51090j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f51091k) {
            sb2.append("no-transform, ");
        }
        if (this.f51092l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        return sb2.toString();
    }
}
