package com.mbridge.msdk.util;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.GoogleApiAvailability;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f52063a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f52064b = "";

    public static void a() {
        if (c()) {
            try {
                GoogleApiAvailability.getInstance().getApkVersion(com.mbridge.msdk.foundation.controller.c.n().d());
                GoogleApiAvailability.getInstance().verifyGooglePlayServicesIsAvailable(com.mbridge.msdk.foundation.controller.c.n().d(), 11925000);
                try {
                    String strB = b();
                    boolean zIsEmpty = TextUtils.isEmpty(strB);
                    f52063a = !zIsEmpty;
                    if (zIsEmpty) {
                        return;
                    }
                    f52064b = strB;
                } catch (Throwable th2) {
                    q0.b("CronetEnvCheckUtil", th2.getMessage());
                }
            } catch (Throwable th3) {
                q0.b("CronetEnvCheckUtil", th3.getMessage());
                f52063a = false;
            }
        }
    }

    private static String b() {
        ArrayList<Pair> arrayList = new ArrayList();
        arrayList.add(Pair.create(1, "org.chromium.net.impl.JavaCronetProvider"));
        arrayList.add(Pair.create(2, "org.chromium.net.impl.NativeCronetProvider"));
        arrayList.add(Pair.create(3, "com.google.android.gms.net.PlayServicesCronetProvider"));
        arrayList.add(Pair.create(4, "com.google.android.gms.net.GmsCoreCronetProvider"));
        try {
            StringBuilder sb2 = new StringBuilder();
            ClassLoader classLoader = com.mbridge.msdk.foundation.controller.c.n().d().getClassLoader();
            for (Pair pair : arrayList) {
                try {
                    if (!TextUtils.isEmpty(classLoader.loadClass((String) pair.second).getConstructor(Context.class).newInstance(com.mbridge.msdk.foundation.controller.c.n().d()).getClass().getName())) {
                        if (sb2.length() > 0) {
                            sb2.append(StringUtils.COMMA);
                        }
                        sb2.append(pair.first);
                    }
                } catch (Throwable th2) {
                    q0.b("CronetEnvCheckUtil", th2.getMessage());
                }
            }
            return sb2.toString();
        } catch (Throwable th3) {
            q0.b("CronetEnvCheckUtil", th3.getMessage());
            return "";
        }
    }

    public static boolean c() {
        return s0.a().a("cronet_env_check", false);
    }
}
