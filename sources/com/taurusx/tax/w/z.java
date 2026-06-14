package com.taurusx.tax.w;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.taurusx.tax.g.a;
import com.taurusx.tax.g.b;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.w.s.s;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public class z {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static AtomicBoolean f67593i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f67594m = "TaurusXAdsCore";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static z f67595p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f67598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f67599g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.taurusx.tax.y.o.z f67600n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f67603t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Context f67604w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f67605y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f67606z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f67597c = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f67601o = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f67602s = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67596a = -1;

    /* JADX INFO: renamed from: com.taurusx.tax.w.z$z, reason: collision with other inner class name */
    public class C0829z implements com.taurusx.tax.w.o.y {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ long f67608z;

        public C0829z(long j10) {
            this.f67608z = j10;
        }

        @Override // com.taurusx.tax.w.o.y
        public void z(boolean z10, w wVar) {
            s.z().z(this.f67608z, System.currentTimeMillis() - this.f67608z, z10, z10 ? com.taurusx.tax.w.o.w.Y() + 1 : 0, wVar.getCode(), wVar.getMessageCompatibility());
        }
    }

    public static z t() {
        if (f67595p == null) {
            synchronized (z.class) {
                try {
                    if (f67595p == null) {
                        f67595p = new z();
                    }
                } finally {
                }
            }
        }
        return f67595p;
    }

    public com.taurusx.tax.y.o.z a() {
        return this.f67600n;
    }

    public void c(int i10) {
        this.f67602s = i10;
    }

    public boolean f() {
        return this.f67605y;
    }

    public int g() {
        return this.f67596a;
    }

    public boolean m() {
        return this.f67603t;
    }

    public int n() {
        return this.f67602s;
    }

    public Context o() {
        Context context = this.f67604w;
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public int s() {
        return this.f67601o;
    }

    public String w() {
        return !TextUtils.isEmpty(this.f67606z) ? this.f67606z : "";
    }

    public int y() {
        return this.f67597c;
    }

    public void z(Context context, String str) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.f67604w = context.getApplicationContext();
        this.f67606z = str;
        this.f67605y = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (TextUtils.equals(this.f67604w.getPackageName(), com.taurusx.tax.g.w.y(this.f67604w))) {
                b.z().z(this.f67604w, b.f66093o, b.f66095s, UUID.randomUUID().toString());
            }
        } catch (Exception unused) {
        }
        try {
            a.z(this.f67604w);
            b.z().z(this.f67604w, b.f66098y, "appid", str);
            if (Build.VERSION.SDK_INT >= 28 && !f67593i.getAndSet(true)) {
                if (TextUtils.equals(this.f67604w.getPackageName(), com.taurusx.tax.g.w.y(this.f67604w))) {
                    WebView.setDataDirectorySuffix(this.f67604w.getPackageName() + "_nath");
                } else {
                    WebView.setDataDirectorySuffix(com.taurusx.tax.g.w.y(this.f67604w));
                }
            }
        } catch (Throwable th2) {
            LogUtil.v("taurusx", "error : " + th2);
        }
        com.taurusx.tax.y.o.z zVar = new com.taurusx.tax.y.o.z(this.f67604w);
        this.f67600n = zVar;
        com.taurusx.tax.w.o.w.z(this.f67604w, zVar);
        s.z().z(jCurrentTimeMillis, System.currentTimeMillis() - jCurrentTimeMillis);
        com.taurusx.tax.w.o.w.z(this.f67604w, str, this.f67600n, new C0829z(System.currentTimeMillis()));
    }

    public String c() {
        return this.f67599g;
    }

    public void y(int i10) {
        this.f67601o = i10;
    }

    public void o(int i10) {
        this.f67596a = i10;
    }

    public void w(int i10) {
        this.f67597c = i10;
    }

    public void z(boolean z10) {
        this.f67603t = z10;
    }

    public boolean z(long j10, long j11) {
        if (j10 <= 0) {
            j10 = com.taurusx.tax.w.o.w.w();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j11;
        LogUtil.v("taurusx", "filled time : " + jCurrentTimeMillis + " , expire time : " + j10);
        return jCurrentTimeMillis > j10;
    }

    public void z(String str) {
        this.f67599g = str;
    }

    public int z() {
        return this.f67598f;
    }

    public void z(int i10) {
        this.f67598f = i10;
    }
}
