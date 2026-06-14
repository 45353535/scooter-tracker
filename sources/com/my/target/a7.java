package com.my.target;

import android.app.Application;
import android.content.Context;
import com.my.tracker.MyTracker;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f59140a;

    public static void a(Context context) {
        if (f59140a) {
            return;
        }
        try {
            String str = (String) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("com.my.target.myTrackerSdkKey");
            if (str != null) {
                MyTracker.initTracker(str, (Application) context.getApplicationContext());
            } else {
                gb.a("MyTrackerUtils: myTracker SDK key is not provided");
            }
        } catch (Throwable th2) {
            gb.a("MyTrackerUtils: Unable to initialize myTracker - " + th2.getMessage());
        }
        f59140a = true;
    }
}
