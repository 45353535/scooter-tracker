package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f19849a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f19850b = a0.class.getName();

    private a0() {
    }

    public static final void a(Collection container, String name) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator it = container.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("Container '" + name + "' cannot contain null values");
            }
        }
    }

    public static final void b(Context context, boolean z10) {
        ActivityInfo activityInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (PackageManager.NameNotFoundException unused) {
                activityInfo = null;
            }
        } else {
            activityInfo = null;
        }
        if (activityInfo == null) {
            if (z10) {
                throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
            }
            Log.w(f19850b, "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
        }
    }

    public static final void c(Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (z10) {
                throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
            }
            Log.w(f19850b, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    public static final void d(String arg, String name) {
        Intrinsics.checkNotNullParameter(arg, "arg");
        Intrinsics.checkNotNullParameter(name, "name");
        if (arg.length() > 0) {
            return;
        }
        throw new IllegalArgumentException(("Argument '" + name + "' cannot be empty").toString());
    }

    public static final void e(Collection container, String name) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        if (container.isEmpty()) {
            throw new IllegalArgumentException(("Container '" + name + "' cannot be empty").toString());
        }
    }

    public static final void f(Collection container, String name) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        a(container, name);
        e(container, name);
    }

    public static final void g(Object obj, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Argument '" + name + "' cannot be null");
    }

    public static final String h(String str, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (str != null && str.length() > 0) {
            return str;
        }
        throw new IllegalArgumentException(("Argument '" + name + "' cannot be null or empty").toString());
    }

    public static final void i() {
        if (!com.facebook.s.D()) {
            throw new com.facebook.t("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
