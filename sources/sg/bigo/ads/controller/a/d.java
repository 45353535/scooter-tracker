package sg.bigo.ads.controller.a;

import android.text.TextUtils;
import android.util.Patterns;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public static String a(String str, String str2) {
        try {
            URL url = new URL(str);
            StringBuilder sb2 = new StringBuilder(str);
            String authority = url.getAuthority();
            int iLastIndexOf = str.lastIndexOf(authority);
            if (iLastIndexOf >= 0) {
                sb2.replace(iLastIndexOf, authority.length() + iLastIndexOf, str2);
            }
            return sb2.toString();
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "AntiBanUtils", "replaceHost error： " + e10.getMessage());
            return str;
        }
    }

    @Nullable
    public static Map<String, String> b(String str) {
        JSONArray jSONArray;
        HashMap map = new HashMap();
        if (!q.a((CharSequence) str)) {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException unused) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("country", "all");
                        String strOptString2 = jSONObjectOptJSONObject.optString("host", "");
                        if (a(strOptString2)) {
                            map.put(strOptString, strOptString2);
                        }
                    }
                }
            }
        }
        return map;
    }

    public static boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            int iIndexOf = str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER);
            if (iIndexOf != -1) {
                str = str.substring(0, iIndexOf);
            }
            return Patterns.DOMAIN_NAME.matcher(str).matches();
        }
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBanUtils", "\"" + str + "\" is invalid host");
        return false;
    }
}
