package f1;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes6.dex */
public class y9 {
    public i9 a(Context context) {
        String strSubstring;
        String strSubstring2;
        if (d(context)) {
            eg.d("Permission READ_PHONE_STATE not granted", null);
            return null;
        }
        TelephonyManager telephonyManagerC = c(context);
        if (!b(telephonyManagerC)) {
            return null;
        }
        String simOperator = telephonyManagerC.getSimOperator();
        if (TextUtils.isEmpty(simOperator)) {
            strSubstring = null;
            strSubstring2 = null;
        } else {
            strSubstring = simOperator.substring(0, 3);
            strSubstring2 = simOperator.substring(3);
        }
        return new i9(simOperator, strSubstring, strSubstring2, telephonyManagerC.getNetworkOperatorName(), telephonyManagerC.getNetworkCountryIso(), telephonyManagerC.getPhoneType());
    }

    public final boolean b(TelephonyManager telephonyManager) {
        return (telephonyManager == null || telephonyManager.getPhoneType() == 0 || telephonyManager.getSimState() != 5) ? false : true;
    }

    public final TelephonyManager c(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return (TelephonyManager) context.getSystemService("phone");
        } catch (Exception e10) {
            eg.i("Unable to retrieve TELEPHONY_SERVICE", e10);
            return null;
        }
    }

    public final boolean d(Context context) {
        return context != null && ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == -1;
    }
}
