package yads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes4.dex */
public final class e2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f110160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f110161c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f110162a = new v1();

    static {
        String str = "com.yandex.mobile.ads.common.AdActivity";
        f110160b = str;
        f110161c = "There is no presence of " + str + " activity in AndroidManifest file.";
    }

    public final void a(Context context) {
        try {
            ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), f110160b), 0);
            this.f110162a.getClass();
            v1.a(activityInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            String str = f110161c;
            throw new fa1(str, str);
        }
    }
}
