package yads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public final class dg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f109911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rf0 f109912b;

    public dg(Context context, rf0 rf0Var) {
        this.f109911a = context;
        this.f109912b = rf0Var;
    }

    public final z40 a() {
        PackageManager packageManager = this.f109911a.getPackageManager();
        int i10 = Build.VERSION.SDK_INT;
        PackageInfo packageInfo = i10 >= 33 ? packageManager.getPackageInfo(this.f109911a.getPackageName(), PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(this.f109911a.getPackageName(), 0);
        this.f109912b.getClass();
        String strB = rf0.b();
        if (strB == null) {
            strB = "Undefined";
        }
        return new z40(packageInfo.packageName, packageInfo.versionName, "Android " + strB, "API " + i10);
    }
}
