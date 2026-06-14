package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
final class ClearKeyUtil {
    private static final String TAG = "ClearKeyUtil";

    private ClearKeyUtil() {
    }

    public static byte[] adjustRequestData(byte[] bArr) {
        return Util.SDK_INT >= 27 ? bArr : Util.getUtf8Bytes(base64ToBase64Url(Util.fromUtf8Bytes(bArr)));
    }

    public static byte[] adjustResponseData(byte[] bArr) {
        if (Util.SDK_INT >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(Util.fromUtf8Bytes(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray(UserMetadata.KEYDATA_FILENAME);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(StringUtils.COMMA);
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(base64UrlToBase64(jSONObject2.getString(CampaignEx.JSON_KEY_AD_K)));
                sb2.append("\",\"kid\":\"");
                sb2.append(base64UrlToBase64(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return Util.getUtf8Bytes(sb2.toString());
        } catch (JSONException e10) {
            Log.e(TAG, "Failed to adjust response data: " + Util.fromUtf8Bytes(bArr), e10);
            return bArr;
        }
    }

    private static String base64ToBase64Url(String str) {
        return str.replace('+', '-').replace(IOUtils.DIR_SEPARATOR_UNIX, '_');
    }

    private static String base64UrlToBase64(String str) {
        return str.replace('-', '+').replace('_', IOUtils.DIR_SEPARATOR_UNIX);
    }
}
