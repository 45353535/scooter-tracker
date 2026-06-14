package yads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class gg1 {
    public static Object a(Context context, String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (Throwable unused) {
                boolean z10 = lb1.f113032a;
                applicationInfo = null;
            }
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(str)) {
                Object obj = bundle.get(str);
                if (obj == null) {
                    return null;
                }
                return obj;
            }
        } catch (Throwable unused2) {
            boolean z11 = lb1.f113032a;
        }
        return null;
    }

    public static Boolean b(Context context) {
        return (Boolean) a(context, hg1.f111577e.f111583b);
    }

    public static boolean c(Context context) {
        Boolean bool = (Boolean) a(context, hg1.f111581i.f111583b);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static Boolean a(Context context) {
        return (Boolean) a(context, hg1.f111576d.f111583b);
    }
}
