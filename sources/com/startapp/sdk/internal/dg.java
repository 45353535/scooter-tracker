package com.startapp.sdk.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import com.adjust.sdk.Constants;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class dg extends z1 {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final te f64428j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final String f64429k0;

    public dg(Context context) {
        ServiceInfo serviceInfo;
        String string;
        Signature[] signatureArr;
        super(1);
        if (me.f64936a == null) {
            try {
                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty() && (serviceInfo = listQueryIntentServices.get(0).serviceInfo) != null) {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    if ("com.android.vending".equals(str) && str2 != null && context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                        Intent intent2 = new Intent(intent);
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        le leVar = new le(context.getPackageName(), countDownLatch);
                        if (context.bindService(intent2, leVar, 1)) {
                            try {
                                countDownLatch.await(1L, TimeUnit.SECONDS);
                            } catch (InterruptedException unused) {
                            }
                            int i10 = q0.f65128a;
                            context.unbindService(leVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                g9.a(th2);
            }
        }
        this.f64428j0 = me.f64936a;
        int i11 = q0.f65128a;
        try {
            signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
        } catch (Throwable unused2) {
        }
        if (signatureArr == null || signatureArr.length <= 0) {
            string = null;
        } else if (signatureArr.length == 1) {
            string = signatureArr[0].toCharsString();
        } else {
            Arrays.sort(signatureArr, new p0());
            StringBuilder sb2 = new StringBuilder();
            for (int i12 = 0; i12 < signatureArr.length; i12++) {
                sb2.append(signatureArr[i12].toCharsString());
                if (i12 < signatureArr.length - 1) {
                    sb2.append(';');
                }
            }
            string = sb2.toString();
        }
        this.f64429k0 = string;
    }

    @Override // com.startapp.sdk.internal.z1
    public final void a(ve veVar) {
        super.a(veVar);
        veVar.a("placement", "INAPP_DOWNLOAD", true, true);
        te teVar = this.f64428j0;
        if (teVar != null) {
            veVar.a(Constants.INSTALL_REFERRER, teVar.f65322a.getString(Constants.INSTALL_REFERRER), true, true);
            veVar.a("referrer_click_timestamp_seconds", Long.valueOf(this.f64428j0.f65322a.getLong("referrer_click_timestamp_seconds")), true, true);
            veVar.a("install_begin_timestamp_seconds", Long.valueOf(this.f64428j0.f65322a.getLong("install_begin_timestamp_seconds")), true, true);
        }
        veVar.a("apkSig", this.f64429k0, true, true);
        long j10 = com.startapp.sdk.adsbase.g.f64053c;
        if (j10 != 0) {
            veVar.a("firstInstalledAppTS", Long.valueOf(j10), false, true);
        }
    }
}
