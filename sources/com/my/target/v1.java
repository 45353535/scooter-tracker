package com.my.target;

import android.content.Context;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes11.dex */
public abstract class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static he.a f60924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f60925b;

    public static void a(Context context) {
        if (f60925b) {
            return;
        }
        he.a aVarA = new he.c().a(context);
        f60924a = aVarA;
        if (aVarA == null) {
            gb.b("DigitalGovCertsUtils: can't init digital gov certs – certData is null");
        }
        f60925b = true;
    }

    public static he.a a() {
        return f60924a;
    }

    public static void a(HttpURLConnection httpURLConnection) {
        he.a aVar = f60924a;
        if (aVar != null && (httpURLConnection instanceof HttpsURLConnection)) {
            try {
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(aVar.f73161b.getSocketFactory());
            } catch (Throwable th2) {
                gb.a("DigitalGovCertsUtils: can't setSSLSocketFactory to httpsURLConnection" + th2.getMessage());
            }
        }
    }
}
