package com.my.tracker.obfuscated;

import android.os.Handler;
import android.text.TextUtils;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.MyTrackerParams;
import com.my.tracker.config.AntiFraudConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MyTrackerParams f61914a = new MyTrackerParams();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final List f61915b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f61916c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AntiFraudConfig f61917d = AntiFraudConfig.newBuilder().build();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f61918e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile int f61919f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f61920g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f61921h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f61922i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f61923j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f61924k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile int f61925l = 30;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile int f61926m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile int f61927n = 900;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile String f61928o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile String f61929p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile MyTrackerConfig.InstalledPackagesProvider f61930q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile MyTrackerConfig.OkHttpClientProvider f61931r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile String f61932s = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile String f61933t = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private volatile String f61934u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile String f61935v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private volatile String f61936w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private volatile MyTracker.AttributionListener f61937x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile Handler f61938y = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f61940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f61941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f61942d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f61943e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f61944f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f61945g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f61946h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f61947i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f61948j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final MyTrackerParams.a f61949k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final AntiFraudConfig f61950l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final MyTrackerConfig.InstalledPackagesProvider f61951m;

        public a(String str, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, MyTrackerParams.a aVar, AntiFraudConfig antiFraudConfig, MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {
            this.f61939a = str;
            this.f61940b = i10;
            this.f61941c = i11;
            this.f61942d = i12;
            this.f61943e = i13;
            this.f61944f = z10;
            this.f61945g = z11;
            this.f61946h = z12;
            this.f61947i = z13;
            this.f61948j = z14;
            this.f61949k = aVar;
            this.f61950l = antiFraudConfig;
            this.f61951m = installedPackagesProvider;
        }
    }

    private y2() {
        z();
    }

    public static y2 y() {
        return new y2();
    }

    private void z() {
        d("tracker-api.vk-analytics.ru");
    }

    public void A() {
        this.f61929p = "com.my.games.vendorapp";
    }

    public void a(int i10) {
        int i11 = 86400;
        if (i10 <= 86400) {
            i11 = 1;
            if (i10 < 1) {
                x2.a("Invalid bufferingPeriod value " + i10 + ", bufferingPeriod set to min 1");
            }
            this.f61927n = i10;
        }
        x2.a("Invalid bufferingPeriod value " + i10 + ", bufferingPeriod set to max 86400");
        i10 = i11;
        this.f61927n = i10;
    }

    void b(String str) {
        this.f61916c = str;
    }

    public void c(int i10) {
        int i11 = 7200;
        if (i10 <= 7200) {
            i11 = 30;
            if (i10 < 30) {
                x2.a("Invalid launchTimeout value " + i10 + ", timeout set to min 30");
            }
            this.f61925l = i10;
        }
        x2.a("Invalid launchTimeout value " + i10 + ", timeout set to max 7200");
        i10 = i11;
        this.f61925l = i10;
    }

    public void d(boolean z10) {
        this.f61920g = z10;
    }

    public int e() {
        return this.f61927n;
    }

    public int f() {
        return this.f61926m;
    }

    public String g() {
        return this.f61916c;
    }

    public String h() {
        return this.f61933t;
    }

    public int i() {
        return this.f61925l;
    }

    public int j() {
        return this.f61919f;
    }

    public String k() {
        return this.f61935v;
    }

    public String l() {
        return this.f61934u;
    }

    public MyTrackerParams m() {
        return this.f61914a;
    }

    public MyTrackerConfig.OkHttpClientProvider n() {
        return this.f61931r;
    }

    public a o() {
        return new a(this.f61916c, this.f61925l, this.f61927n, this.f61926m, this.f61919f, this.f61918e, this.f61920g, this.f61921h, this.f61922i, this.f61923j, this.f61914a.a(), this.f61917d, this.f61930q);
    }

    public String p() {
        return this.f61936w;
    }

    public String q() {
        return this.f61932s;
    }

    public String r() {
        return this.f61929p;
    }

    public boolean s() {
        return this.f61921h;
    }

    public boolean t() {
        return this.f61924k;
    }

    public boolean u() {
        return this.f61920g;
    }

    public boolean v() {
        return this.f61918e;
    }

    public boolean w() {
        return this.f61922i;
    }

    public boolean x() {
        return this.f61923j;
    }

    public void b(int i10) {
        if (i10 > 432000) {
            x2.a("Invalid forcingPeriod value " + i10 + ", forcingPeriod set to max 432000");
            this.f61926m = 432000;
            return;
        }
        if (i10 >= 0) {
            this.f61926m = i10;
            return;
        }
        x2.a("Invalid forcingPeriod value " + i10 + ", forcingPeriod set to min 0");
        this.f61926m = 0;
    }

    public void d(int i10) {
        this.f61919f = i10;
    }

    public void e(String str) {
        this.f61929p = str;
    }

    public void f(boolean z10) {
        this.f61922i = z10;
    }

    public void g(boolean z10) {
        this.f61923j = z10;
    }

    public MyTracker.AttributionListener d() {
        return this.f61937x;
    }

    public void e(boolean z10) {
        this.f61918e = z10;
    }

    private void d(String str) {
        this.f61932s = a3.a(str, "v3/");
        x2.a("trackerUrl set = " + this.f61932s);
        this.f61933t = a3.a("ip4", str, null);
        x2.a("ipv4TrackerUrl set = " + this.f61933t);
        this.f61936w = a3.a("ts", str, "mobile/v1");
        x2.a("timeSpentUrl set = " + this.f61936w);
        this.f61934u = a3.a("mlapi", str, null);
        this.f61935v = a3.a("beta-ml", str, null);
    }

    public void a(String str) {
        this.f61928o = str;
    }

    public void c(String str) {
        String strSubstring;
        String host;
        try {
            if (TextUtils.isEmpty(str)) {
                x2.c("setProxyHost: reset proxy host to default = tracker-api.vk-analytics.ru");
                z();
                return;
            }
            x2.c("setProxyHost: try to set proxy host = " + str);
            int iIndexOf = str.indexOf("://");
            if (iIndexOf > 0) {
                x2.c("setProxyHost: detected custom schema, will be suppressed");
                strSubstring = str.substring(iIndexOf + 3);
            } else {
                strSubstring = str;
            }
            URI uri = new URI(a3.a(strSubstring, null));
            if (uri.getUserInfo() != null) {
                x2.c("setProxyHost: detected custom userinfo, will be suppressed");
            }
            if (!TextUtils.isEmpty(uri.getPath())) {
                x2.c("setProxyHost: detected custom path, will be suppressed");
            }
            int port = uri.getPort();
            if (port != -1) {
                host = uri.getHost() + StringUtils.PROCESS_POSTFIX_DELIMITER + port;
            } else {
                host = uri.getHost();
            }
            if (host.startsWith("www.")) {
                x2.c("setProxyHost: proxyHost starts from 'www.' which is not recommended (check docs), continue anyway");
            }
            d(host);
            x2.c("setProxyHost: proxy host = " + host + " successfully set");
        } catch (Throwable th2) {
            x2.c("setProxyHost: unable to set proxy host = " + str + " (reason: invalid url), using default = tracker-api.vk-analytics.ru,\norig error = " + th2.getMessage());
            z();
        }
    }

    public void a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {
        this.f61930q = installedPackagesProvider;
    }

    public void a(MyTracker.AttributionListener attributionListener, Handler handler) {
        this.f61937x = attributionListener;
        this.f61938y = handler;
    }

    public String b() {
        return this.f61928o;
    }

    public void a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.f61931r = okHttpClientProvider;
    }

    public void b(boolean z10) {
        this.f61921h = z10;
    }

    public AntiFraudConfig a() {
        return this.f61917d;
    }

    public void a(AntiFraudConfig antiFraudConfig) {
        this.f61917d = antiFraudConfig;
    }

    public void a(s sVar, s sVar2) {
        synchronized (this.f61915b) {
            sVar.a(Boolean.valueOf(this.f61924k));
            this.f61915b.add(sVar2);
        }
    }

    private void a(boolean z10) {
        synchronized (this.f61915b) {
            try {
                Iterator it = this.f61915b.iterator();
                while (it.hasNext()) {
                    ((s) it.next()).a(Boolean.valueOf(z10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(boolean z10) {
        a(z10);
        this.f61924k = z10;
    }

    public Handler c() {
        return this.f61938y;
    }
}
