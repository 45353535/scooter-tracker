package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.h1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.v;
import com.fyber.inneractive.sdk.web.v0;
import com.ironsource.D5;
import com.taurusx.tax.mraid.MraidBrowser;
import java.net.URLDecoder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f20282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f20285d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h1 f20289h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v0 f20291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f20292k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.fyber.inneractive.sdk.ignite.m f20293l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f20286e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f20288g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f20290i = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f20287f = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f20294m = IAConfigManager.O.f20315u.f20484b.a(false, "should_decode_url");

    public r(boolean z10) {
        this.f20284c = true;
        this.f20284c = z10;
    }

    public final void a(Context context, String str, o oVar, v0 v0Var, boolean z10, com.fyber.inneractive.sdk.ignite.m mVar, String str2) {
        Uri uri;
        this.f20282a = context;
        this.f20283b = str;
        this.f20285d = oVar;
        this.f20292k = z10;
        this.f20288g = System.currentTimeMillis();
        this.f20291j = v0Var;
        this.f20293l = mVar;
        if (a(this.f20283b) == null) {
            String str3 = this.f20283b;
            try {
                try {
                    uri = this.f20294m ? !h0.c(str3) ? Uri.parse(URLDecoder.decode(str3, D5.N)) : Uri.parse(str3) : h0.c(str3) ? Uri.parse(URLDecoder.decode(str3, D5.N)) : Uri.parse(str3);
                } catch (Exception unused) {
                    IAlog.a("%sgetDecodedUri: Failed parsing Uri!", "SuperClickHandler");
                    uri = null;
                }
                if (a(uri)) {
                    IAlog.a("%sfollowRedirects: Fetching uri: %s", IAlog.a(this), uri.toString());
                    String string = uri.toString();
                    h1 h1Var = new h1(new m(this, string, str2), string);
                    this.f20289h = h1Var;
                    IAConfigManager.O.f20313s.a(h1Var);
                }
            } catch (Exception e10) {
                if (e10 instanceof InterruptedException) {
                    return;
                }
                IAlog.b("%sfailed followRedirects %s", IAlog.a(this), e10);
                this.f20287f.add(new j(str3, false, q.INTERNAL_REDIRECT, null));
                a(new b(str3, q.FAILED, "followRedirects", e10));
            }
        }
    }

    public final boolean a(Uri uri) {
        if (uri == null) {
            IAlog.a("%s followRedirects: Got a url which is not valid: null", IAlog.a(this));
            this.f20287f.add(new j(null, false, null, "Invalid url"));
            a(a(uri.toString(), "followRedirects", "Invalid url"));
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme != null && (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https"))) {
            return true;
        }
        IAlog.a("%scould not follow redirects for scheme: %s", IAlog.a(this), uri.getScheme());
        IAlog.a("%sfull url: %s", IAlog.a(this), uri.toString());
        this.f20287f.add(new j(uri.toString(), false, null, "Invalid scheme: " + uri.getScheme()));
        a(a(uri.toString(), "followRedirects", "Invalid scheme: " + uri.getScheme()));
        return false;
    }

    public final b a(String str) {
        Uri uri;
        try {
            uri = Uri.parse(str);
        } catch (Exception unused) {
            IAlog.a("IAJavaUtil: getValidUri: Invalid url %s", str);
            uri = null;
        }
        if (uri == null) {
            this.f20287f.add(new j(str, false, null, "illegal uri"));
            return a(a(str, null, "illegal uri"));
        }
        if (this.f20290i.isEmpty()) {
            this.f20287f.add(new j(str, false, null, "no click handlers found"));
            return a(a(str, null, "no click handlers found"));
        }
        for (a aVar : this.f20290i) {
            if (aVar.a(uri, this)) {
                Context context = this.f20282a;
                b bVarA = context != null ? aVar.a(context, uri, this.f20287f) : null;
                if (bVarA != null) {
                    return a(bVarA);
                }
            }
        }
        return null;
    }

    public static void a(r rVar, String str, String str2, String str3, Exception exc) {
        if (rVar.f20284c) {
            Intent intent = new Intent(rVar.f20282a, (Class<?>) InneractiveInternalBrowserActivity.class);
            if (!TextUtils.isEmpty(str)) {
                InneractiveInternalBrowserActivity.setHtmlExtra(str);
            }
            intent.putExtra(MraidBrowser.f66374a, str2);
            intent.putExtra("spotId", str3);
            if (!(rVar.f20282a instanceof Activity)) {
                intent.setFlags(268435456);
            }
            try {
                Context context = rVar.f20282a;
                if (context != null) {
                    context.startActivity(intent);
                }
                ArrayList arrayList = rVar.f20287f;
                boolean z10 = exc == null;
                q qVar = q.OPENED_IN_INTERNAL_BROWSER;
                arrayList.add(new j(str2, z10, qVar, v.a(exc)));
                rVar.a(new b(str2, qVar, "followRedirects", null));
                return;
            } catch (ActivityNotFoundException unused) {
                rVar.f20287f.add(new j(str2, false, q.OPENED_IN_INTERNAL_BROWSER, "internal browser not registered"));
                rVar.a(a(str2, "followRedirects", "internal browser not registered"));
                return;
            }
        }
        rVar.f20287f.add(new j(str2, false, q.OPENED_IN_INTERNAL_BROWSER, "internal browser not usable"));
        rVar.a(a(str2, "followRedirects", "internal browser not usable"));
    }

    public static b a(String str, String str2, String str3) {
        return new b(str, q.FAILED, str2, new p(str3));
    }

    public final b a(b bVar) {
        ArrayList arrayList = this.f20287f;
        bVar.f20254f.clear();
        bVar.f20254f.addAll(arrayList);
        bVar.f20253e = System.currentTimeMillis() - this.f20288g;
        IAlog.a("%s reporting result: %s", IAlog.a(this), bVar);
        com.fyber.inneractive.sdk.util.r.f23896b.post(new n(this, bVar));
        return bVar;
    }
}
