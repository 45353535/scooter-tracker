package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import java.net.URL;

/* JADX INFO: loaded from: classes11.dex */
public final class fk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URL f64520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gj f64522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hj f64523e;

    public fk(Context context, URL url, String str, gj gjVar, hj hjVar) {
        this.f64519a = context;
        this.f64520b = url;
        this.f64521c = str;
        this.f64522d = gjVar;
        this.f64523e = hjVar;
    }

    public final void a() {
        String strA;
        try {
            strA = AdsCommonMetaData.k().F().q() ? qe.f65159a.a(this.f64519a, this.f64520b, this.f64521c, this.f64523e) : gk.a(this.f64519a, this.f64520b, this.f64521c);
        } catch (Exception unused) {
            strA = null;
        }
        new Handler(Looper.getMainLooper()).post(new dk(this, strA));
    }
}
