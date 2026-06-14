package z9;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
abstract class a {
    public static byte[] a(byte[] bArr) {
        return q9.o0.f98837a >= 27 ? bArr : q9.o0.u0(c(q9.o0.H(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (q9.o0.f98837a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(q9.o0.H(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray(UserMetadata.KEYDATA_FILENAME);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(StringUtils.COMMA);
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(d(jSONObject2.getString(CampaignEx.JSON_KEY_AD_K)));
                sb2.append("\",\"kid\":\"");
                sb2.append(d(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return q9.o0.u0(sb2.toString());
        } catch (JSONException e10) {
            q9.u.d("ClearKeyUtil", "Failed to adjust response data: " + q9.o0.H(bArr), e10);
            return bArr;
        }
    }

    private static String c(String str) {
        return str.replace('+', '-').replace(IOUtils.DIR_SEPARATOR_UNIX, '_');
    }

    private static String d(String str) {
        return str.replace('-', '+').replace('_', IOUtils.DIR_SEPARATOR_UNIX);
    }
}
