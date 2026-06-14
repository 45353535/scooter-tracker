package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.facebook.ads.AdError;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes11.dex */
public class lb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f60095c = {"http://play.google.com", "https://play.google.com", "http://market.android.com", "https://market.android.com", "https://appgallery.huawei.com/", "https://appgallery.cloud.huawei.com/", com.taurusx.tax.g.f0.f66125c, "samsungapps://", "appmarket://", "hiapplink://", "mimarket://", "https://apps.rustore.ru", "https://backapi.rustore.ru"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f60097b;

    public interface a {
        void a(String str);
    }

    public lb(String str) {
        this.f60096a = str;
    }

    public static String a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (Throwable th2) {
            gb.a("UrlResolver: Unable to decode url - " + th2.getMessage());
            return str;
        }
    }

    public static String b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable th2) {
            gb.a("UrlResolver: Unable to encode url - " + th2.getMessage());
            return "";
        }
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("https");
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : f60095c) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (URLUtil.isHttpsUrl(str)) {
                return !TextUtils.isEmpty(new URL(str).getHost());
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static lb g(String str) {
        return new lb(str);
    }

    public final /* synthetic */ void f(String str) {
        a aVar = this.f60097b;
        if (aVar != null) {
            aVar.a(str);
            this.f60097b = null;
        }
    }

    public lb a(a aVar) {
        this.f60097b = aVar;
        return this;
    }

    public void a(final h0 h0Var, Context context) {
        final Context applicationContext = context.getApplicationContext();
        f0.e(new Runnable() { // from class: k5.i1
            @Override // java.lang.Runnable
            public final void run() {
                this.f86050b.a(applicationContext, h0Var);
            }
        });
    }

    public final /* synthetic */ void a(Context context, h0 h0Var) {
        o2 o2VarA = p2.a().a(this.f60096a, null, context);
        final String str = (String) o2VarA.c();
        if (TextUtils.isEmpty(str)) {
            h0Var.c(2, AdError.INCORRECT_STATE_ERROR, "resolvedUrl is empty, url=" + this.f60096a + ", responseCode=" + o2VarA.b());
        }
        if (this.f60097b == null) {
            return;
        }
        f0.f(new Runnable() { // from class: k5.j1
            @Override // java.lang.Runnable
            public final void run() {
                this.f86058b.f(str);
            }
        });
    }
}
