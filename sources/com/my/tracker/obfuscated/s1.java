package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f61821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final n0 f61822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final e f61823c;

    private s1(e0 e0Var, Context context) {
        this.f61822b = n0.a(e0Var, context);
        this.f61823c = e.a(e0Var, p1.a(context), context);
        this.f61821a = context.getApplicationContext();
    }

    public static s1 a(e0 e0Var, Context context) {
        return new s1(e0Var, context);
    }

    public void b(int i10, Intent intent) {
        String installingPackageName;
        PackageManager packageManager = this.f61821a.getPackageManager();
        try {
            String packageName = this.f61821a.getPackageName();
            installingPackageName = Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(packageName).getInstallingPackageName() : packageManager.getInstallerPackageName(packageName);
        } catch (Throwable th2) {
            x2.a("PurchaseHandler: can't detect installer package –" + th2.getMessage());
            installingPackageName = "";
        }
        x2.a("PurchaseHandler: installer package is " + installingPackageName);
        installingPackageName.getClass();
        if (installingPackageName.equals("com.huawei.appmarket")) {
            x2.a("PurchaseHandler: appGalleryMarket detected");
            a(i10, intent);
        } else if (installingPackageName.equals("com.android.vending")) {
            x2.a("PurchaseHandler: googleStore detected");
            this.f61822b.a(i10, intent);
        } else {
            x2.a("PurchaseHandler: store not detected");
            this.f61822b.a(i10, intent);
            a(i10, intent);
        }
    }

    public void a() {
        this.f61822b.a();
        e eVar = this.f61823c;
        if (eVar == null) {
            x2.a("PurchaseHandler: can't init appGalleryPurchaseHandler, appGallery purchases dependency not implemented");
        } else {
            eVar.a();
        }
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {
        this.f61822b.a(jSONObject, jSONObject2, str, map);
    }

    void a(int i10, Intent intent) {
        e eVar = this.f61823c;
        if (eVar == null) {
            x2.a("PurchaseHandler: can't do appGalleryPurchaseHandler.onActivityResult(), appGallery purchases dependency not implemented");
        } else {
            eVar.a(i10, intent);
        }
    }

    public void a(int i10, List list) {
        this.f61822b.a(i10, list);
    }

    public void a(Object obj, String str, String str2, String str3, Map map) {
        e eVar = this.f61823c;
        if (eVar == null) {
            x2.a("PurchaseHandler: can't trackAppGalleryPurchase, appGallery purchases dependency not implemented");
        } else {
            eVar.b(obj, str, str2, str3, map);
        }
    }
}
