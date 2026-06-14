package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class fb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f64496c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f64499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TrackingParams f64500g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f64494a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f64495b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public oa f64497d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public pa f64498e = null;

    public fb(Context context, Runnable runnable, TrackingParams trackingParams) {
        this.f64496c = runnable;
        this.f64499f = context;
        this.f64500g = trackingParams;
    }

    @JavascriptInterface
    public void closeAd() {
        if (this.f64494a) {
            return;
        }
        this.f64494a = true;
        this.f64496c.run();
    }

    @JavascriptInterface
    public void enableScroll(String str) {
        pa paVar = this.f64498e;
        if (paVar != null) {
            paVar.run();
        }
    }

    @JavascriptInterface
    public void externalLinks(String str) {
        if (!this.f64495b) {
            h0.b(this.f64499f, str);
        } else {
            WeakHashMap weakHashMap = vi.f65408a;
            h0.a(this.f64499f, str);
        }
    }

    @JavascriptInterface
    public void openApp(String str, String str2, String str3) {
        if (str != null && !TextUtils.isEmpty(str)) {
            h0.a(this.f64499f, str, this.f64500g);
        }
        Intent intentB = vi.b(this.f64499f, str2);
        if (intentB != null && str3 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String strValueOf = String.valueOf(itKeys.next());
                    intentB.putExtra(strValueOf, String.valueOf(jSONObject.get(strValueOf)));
                }
            } catch (JSONException unused) {
            }
        }
        if (intentB != null) {
            try {
                this.f64499f.startActivity(intentB);
            } catch (Throwable th2) {
                g9.a(th2);
            }
        }
        oa oaVar = this.f64497d;
        if (oaVar != null) {
            oaVar.f65013a.i();
            oaVar.f65013a.b();
        }
    }
}
