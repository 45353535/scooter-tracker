package yads;

import android.content.Context;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y62 {
    public static void a(Context context, b72 b72Var) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            x62 x62Var = new x62(b72Var);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), x62Var);
            telephonyManager.unregisterTelephonyCallback(x62Var);
        } catch (RuntimeException unused) {
            b72Var.a(5);
        }
    }
}
