package com.fyber.inneractive.sdk.network;

import android.os.Build;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.ironsource.N6;
import java.security.InvalidParameterException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f21428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f21429c;

    public y(String str, String str2, String str3, Long l10, String str4, String str5, String str6, String str7) {
        String strA;
        int i10 = com.fyber.inneractive.sdk.config.k.f20410a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        if (TextUtils.isEmpty(property)) {
            strA = DtbConstants.HTTPS + IAConfigManager.O.f20303i.f20416f;
        } else {
            strA = com.fyber.inneractive.sdk.config.a.a(property, "Event");
        }
        this.f21429c = null;
        if (TextUtils.isEmpty(strA)) {
            throw new InvalidParameterException();
        }
        this.f21428b = new HashMap();
        this.f21427a = strA;
        a(str7 == null ? "8.4.1" : str7, N6.V);
        a(com.fyber.inneractive.sdk.util.o.f23888a.getPackageName(), "pkgn");
        if (IAConfigManager.d()) {
            return;
        }
        a("Android", "osn");
        a(Build.VERSION.RELEASE, N6.G);
        a(com.fyber.inneractive.sdk.util.k.j(), "model");
        a(com.fyber.inneractive.sdk.util.k.l(), "pkgv");
        a(str, "appid");
        a(str2, com.taurusx.tax.g.b.f66095s);
        a(str3, "adnt");
        a(l10, "adnt_id");
        a(str4, "creative_id");
        a(str5, "adomain");
        a(str6, "campaign_id");
    }

    public final void a(Object obj, String str) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        this.f21428b.put(str, obj);
    }
}
