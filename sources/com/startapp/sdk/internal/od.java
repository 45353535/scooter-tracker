package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class od extends sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f65017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f65018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f65019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f65020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f65021f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f65024i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f65025j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f65026k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f65027l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f65028m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Runnable f65029n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f65033r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f65022g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f65023h = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f65030o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f65031p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinkedHashMap f65032q = new LinkedHashMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fd f65034s = new fd(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gd f65035t = new gd(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final hd f65036u = new hd(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final id f65037v = new id(this);

    public od(Context context, lb lbVar, lb lbVar2, Handler handler, long j10, long j11, boolean z10, Boolean bool, String str, String str2, String str3, Runnable runnable) {
        this.f65016a = context;
        this.f65017b = lbVar;
        this.f65018c = new lb(new jd(lbVar2));
        this.f65019d = handler;
        this.f65024i = j10;
        this.f65025j = j11;
        this.f65026k = z10;
        this.f65027l = bool;
        this.f65020e = str;
        this.f65028m = str2;
        this.f65021f = str3;
        this.f65029n = runnable;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x0016, B:10:0x001d, B:12:0x0023, B:14:0x0037, B:35:0x00df, B:37:0x00e3, B:17:0x0068, B:20:0x0079, B:24:0x0089, B:26:0x008d, B:32:0x00a6, B:34:0x00b2, B:27:0x009a), top: B:41:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.od.a(java.lang.String, java.lang.String, boolean):void");
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : this.f65032q.entrySet()) {
            String str = (String) entry.getKey();
            Float f10 = (Float) entry.getValue();
            JSONObject jSONObject = new JSONObject();
            try {
                Float f11 = (Float) this.f65032q.get(str);
                if (f11 == null || f11.floatValue() < 0.0f) {
                    this.f65032q.put(str, Float.valueOf((System.currentTimeMillis() - this.f65033r) / 1000.0f));
                }
                jSONObject.put("time", String.valueOf(f10));
                jSONObject.put("url", str);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ((Executor) this.f65018c.a()).execute(new nd(this, str));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        ((Executor) this.f65018c.a()).execute(new kd(this, str));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        a();
        if (str2 != null && !h0.a(str2) && h0.b(str2)) {
            g9 g9Var = new g9(h9.f64610e);
            g9Var.f64553d = "Failed smart redirect: " + i10;
            g9Var.f64554e = str2;
            g9Var.f64556g = this.f65021f;
            g9Var.a();
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView != null && str != null) {
            ((Executor) this.f65018c.a()).execute(new ld(this, str));
            if (vi.c(webView.getContext(), str)) {
                return true;
            }
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            boolean zA = h0.a(lowerCase);
            boolean zStartsWith = lowerCase.startsWith("intent://");
            if (!zA && !zStartsWith) {
                return false;
            }
            ((Executor) this.f65018c.a()).execute(new md(this, str, zStartsWith, webView.getUrl()));
        }
        return true;
    }

    public final void a() {
        synchronized (this.f65019d) {
            this.f65019d.removeCallbacks(this.f65036u);
        }
    }
}
