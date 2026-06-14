package com.startapp.sdk.internal;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject$Size;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes11.dex */
public abstract class w7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OverlayActivity f65429a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f65432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean[] f65433e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f65435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f65436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String[] f65437i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String[] f65438j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ad f65439k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f65440l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AdPreferences.Placement f65441m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AdInformationOverrides f65442n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f65443o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Long f65444p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Long f65448t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.startapp.sdk.adsbase.adinformation.a f65430b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t7 f65431c = new t7(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean[] f65434f = {true};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Boolean[] f65445q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f65446r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f65447s = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f65449u = false;

    public abstract void a(Bundle bundle);

    public boolean a(int i10, KeyEvent keyEvent) {
        return false;
    }

    public void b() {
        this.f65429a.runOnUiThread(new u7(this));
    }

    public abstract void b(Bundle bundle);

    public boolean c() {
        return false;
    }

    public void d() {
    }

    public void e() {
        if (this.f65431c != null) {
            zb.a(this.f65429a).a(this.f65431c);
        }
        this.f65431c = null;
    }

    public abstract void f();

    public abstract void g();

    public void h() {
        zb.a(this.f65429a).a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
    }

    public final String a() {
        try {
            String[] strArr = this.f65436h;
            return (strArr == null || strArr.length <= 0) ? "" : h0.a(strArr[0], (String) null);
        } catch (Throwable th2) {
            g9.a(th2);
            return "";
        }
    }

    public final void a(String str) {
        String str2;
        if (str != null && (str2 = this.f65443o) != null && str2.length() > 0) {
            this.f65440l = str.replaceAll("startapp_adtag_placeholder", this.f65443o);
        } else {
            this.f65440l = str;
        }
    }

    public final void a(RelativeLayout relativeLayout) {
        com.startapp.sdk.adsbase.adinformation.a aVar = new com.startapp.sdk.adsbase.adinformation.a(this.f65429a, AdInformationObject$Size.LARGE, this.f65441m, this.f65442n, this.f65439k.getConsentData(), this.f65439k.getRequestUrl(), this.f65439k.getDParam(), this.f65439k.getErid(), this.f65439k.getEridUrl());
        this.f65430b = aVar;
        aVar.a(relativeLayout);
    }
}
