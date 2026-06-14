package pd;

import android.content.Context;
import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static final Configuration a(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "resources.configuration");
        return configuration;
    }

    public static final DisplayMetrics b(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
        return displayMetrics;
    }

    public static final String c(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            TelephonyManager telephonyManagerW = g0.w(context);
            String networkOperator = telephonyManagerW != null ? telephonyManagerW.getNetworkOperator() : null;
            if (networkOperator != null && networkOperator.length() >= 3) {
                StringBuilder sb2 = new StringBuilder();
                String strSubstring = networkOperator.substring(0, 3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(strSubstring);
                sb2.append('-');
                String strSubstring2 = networkOperator.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring2);
                return sb2.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final String d(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TelephonyManager telephonyManagerW = g0.w(context);
        if (telephonyManagerW != null) {
            return telephonyManagerW.getNetworkOperatorName();
        }
        return null;
    }

    public static final float e(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return b(context).density;
    }
}
