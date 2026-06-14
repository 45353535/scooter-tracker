package net.pubnative.lite.sdk.utils;

import android.text.TextUtils;
import com.ironsource.D5;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import net.pubnative.lite.sdk.HyBid;

/* JADX INFO: loaded from: classes3.dex */
public class EncodingUtils {
    private static final String TAG = "EncodingUtils";

    public static String urlEncode(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return URLEncoder.encode(str, D5.N);
        } catch (UnsupportedEncodingException e10) {
            HyBid.reportException((Exception) e10);
            Logger.e(TAG, "Error url encoding string: ", e10);
            return "";
        }
    }
}
