package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ag {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final boolean f64270o = MetaData.E().o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f64272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdPreferences.Placement f64273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f64274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TrackingParams f64275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f64276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f64277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f64278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f64279i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final WeakReference f64281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public yf f64282l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f64283m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f64271a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f64280j = new AtomicInteger();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f64284n = new Object();

    public ag(Context context, AdPreferences.Placement placement, String[] strArr, TrackingParams trackingParams, long j10, boolean z10, zf zfVar) {
        Context contextA = x0.a(context);
        this.f64272b = contextA != null ? contextA : context;
        this.f64273c = placement;
        this.f64274d = strArr;
        this.f64275e = trackingParams;
        this.f64276f = j10;
        this.f64283m = z10;
        this.f64281k = new WeakReference(zfVar);
    }

    public final void a() {
        if (this.f64278h && this.f64279i) {
            this.f64271a.removeCallbacksAndMessages(null);
            this.f64276f -= System.currentTimeMillis() - this.f64277g;
            this.f64279i = false;
        }
    }

    public final void b(String str, JSONObject jSONObject) {
        boolean z10;
        synchronized (this.f64284n) {
            try {
                z10 = this.f64283m;
                if (z10) {
                    this.f64282l = new yf(this, str, jSONObject);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10) {
            c(str, jSONObject);
            return;
        }
        if (a(4)) {
            g9 g9Var = new g9(h9.f64609d);
            g9Var.f64553d = "SI.defImp";
            g9Var.f64558i = "reason=" + str;
            g9Var.a();
        }
    }

    public final void c() {
        if (this.f64280j.get() != 0) {
            return;
        }
        if (!f64270o) {
            b(null, null);
            return;
        }
        long j10 = this.f64276f;
        if (this.f64279i) {
            return;
        }
        this.f64279i = true;
        if (!this.f64278h) {
            this.f64278h = true;
        }
        this.f64277g = System.currentTimeMillis();
        this.f64271a.postDelayed(new xf(this), j10);
    }

    public final void a(String str, JSONObject jSONObject) {
        b(str, jSONObject);
        this.f64278h = false;
        this.f64271a.removeCallbacksAndMessages(null);
        this.f64279i = false;
        this.f64277g = 0L;
    }

    public static boolean a(int i10) {
        AnalyticsConfig analyticsConfigH = MetaData.E().h();
        ComponentInfoEventConfig componentInfoEventConfigI = analyticsConfigH != null ? analyticsConfigH.i() : null;
        return componentInfoEventConfigI != null && componentInfoEventConfigI.a((long) i10);
    }

    public final void c(String str, JSONObject jSONObject) {
        if (!this.f64280j.compareAndSet(0, 1)) {
            int iIncrementAndGet = this.f64280j.incrementAndGet();
            if (a(str != null ? 2 : 1)) {
                g9 g9Var = new g9(h9.f64609d);
                g9Var.f64553d = "SI.repImp";
                g9Var.f64558i = "reason=" + str;
                g9Var.f64554e = String.valueOf(iIncrementAndGet);
                g9Var.a();
                return;
            }
            return;
        }
        if (str == null) {
            Context context = this.f64272b;
            String[] strArr = this.f64274d;
            TrackingParams trackingParams = this.f64275e;
            if (context != null && strArr != null) {
                e9.a(context, Arrays.asList(strArr), trackingParams);
            }
            zf zfVar = (zf) this.f64281k.get();
            if (zfVar != null) {
                String[] strArr2 = this.f64274d;
                if (strArr2 != null && strArr2.length > 0) {
                    strA = h0.a(strArr2[0], (String) null);
                }
                zfVar.a(strA);
            }
            try {
                v0 v0Var = (v0) com.startapp.sdk.components.a.a(this.f64272b).Q.a();
                AdPreferences.Placement placement = this.f64273c;
                ConcurrentHashMap concurrentHashMap = v0Var.f65365c;
                Integer num = (Integer) concurrentHashMap.get(placement);
                concurrentHashMap.put(placement, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                return;
            } catch (Throwable th2) {
                g9.a(th2);
                return;
            }
        }
        String[] strArr3 = this.f64274d;
        TrackingParams trackingParams2 = this.f64275e;
        h0.a(strArr3, trackingParams2 != null ? trackingParams2.a() : null, 0, str, jSONObject);
    }

    public final void b() {
        yf yfVar;
        synchronized (this.f64284n) {
            yfVar = this.f64282l;
            this.f64283m = false;
            this.f64282l = null;
        }
        if (yfVar != null) {
            yfVar.run();
        }
        if (a(4)) {
            g9 g9Var = new g9(h9.f64609d);
            g9Var.f64553d = "SI.prcImp";
            StringBuilder sb2 = new StringBuilder("impr=");
            sb2.append(yfVar != null);
            g9Var.f64558i = sb2.toString();
            g9Var.a();
        }
    }
}
