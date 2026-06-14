package u2;

import android.os.Build;
import android.os.Bundle;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.facebook.internal.i;
import com.facebook.internal.m;
import com.facebook.internal.z;
import com.facebook.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f105189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static JSONArray f105190c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f105188a = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String[] f105191d = {"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    private d() {
    }

    public static final void a() {
        if (e3.a.d(d.class)) {
            return;
        }
        try {
            f105188a.g();
            if (f105190c != null) {
                f105189b = true;
            }
        } catch (Throwable th2) {
            e3.a.b(th2, d.class);
        }
    }

    public static final void b(Bundle params, String event) {
        if (e3.a.d(d.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(event, "event");
            params.putString("event", event);
            StringBuilder sb2 = new StringBuilder();
            z zVar = z.f19991a;
            Locale localeG = zVar.G();
            String language = localeG != null ? localeG.getLanguage() : null;
            String str = "";
            if (language == null) {
                language = "";
            }
            sb2.append(language);
            sb2.append('_');
            Locale localeG2 = zVar.G();
            String country = localeG2 != null ? localeG2.getCountry() : null;
            if (country == null) {
                country = "";
            }
            sb2.append(country);
            params.putString("_locale", sb2.toString());
            String strN = zVar.N();
            if (strN == null) {
                strN = "";
            }
            params.putString("_appVersion", strN);
            params.putString("_deviceOS", "ANDROID");
            params.putString("_platform", DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY);
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            params.putString("_deviceModel", str2);
            params.putString("_nativeAppID", s.n());
            String strN2 = zVar.N();
            if (strN2 != null) {
                str = strN2;
            }
            params.putString("_nativeAppShortVersion", str);
            params.putString("_timezone", zVar.B());
            params.putString("_carrier", zVar.w());
            params.putString("_deviceOSTypeName", "ANDROID");
            params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
            params.putLong("_remainingDiskGB", zVar.v());
        } catch (Throwable th2) {
            e3.a.b(th2, d.class);
        }
    }

    public static final String c(JSONObject logic) {
        if (e3.a.d(d.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(logic, "logic");
            Iterator<String> itKeys = logic.keys();
            if (itKeys.hasNext()) {
                return itKeys.next();
            }
            return null;
        } catch (Throwable th2) {
            e3.a.b(th2, d.class);
            return null;
        }
    }

    public static final String d(Bundle bundle) {
        String strOptString;
        if (e3.a.d(d.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = f105190c;
            if (jSONArray == null) {
                return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            if (jSONArray != null && jSONArray.length() == 0) {
                return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            JSONArray jSONArray2 = f105190c;
            Intrinsics.checkNotNull(jSONArray2, "null cannot be cast to non-null type org.json.JSONArray");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray2.length();
            for (int i10 = 0; i10 < length; i10++) {
                String strOptString2 = jSONArray2.optString(i10);
                if (strOptString2 != null) {
                    JSONObject jSONObject = new JSONObject(strOptString2);
                    long jOptLong = jSONObject.optLong("id");
                    if (jOptLong != 0 && (strOptString = jSONObject.optString("rule")) != null && f(strOptString, bundle)) {
                        arrayList.add(Long.valueOf(jOptLong));
                    }
                }
            }
            String string = new JSONArray((Collection) arrayList).toString();
            Intrinsics.checkNotNullExpressionValue(string, "JSONArray(res).toString()");
            return string;
        } catch (Throwable th2) {
            e3.a.b(th2, d.class);
            return null;
        }
    }

    public static final ArrayList e(JSONArray jSONArray) {
        if (e3.a.d(d.class) || jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(jSONArray.get(i10).toString());
            }
            return arrayList;
        } catch (Throwable th2) {
            e3.a.b(th2, d.class);
            return null;
        }
    }

    public static final boolean f(String str, Bundle bundle) {
        if (!e3.a.d(d.class) && str != null && bundle != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strC = c(jSONObject);
                if (strC == null) {
                    return false;
                }
                Object obj = jSONObject.get(strC);
                int iHashCode = strC.hashCode();
                if (iHashCode != 3555) {
                    if (iHashCode != 96727) {
                        if (iHashCode == 109267 && strC.equals("not")) {
                            return !f(obj.toString(), bundle);
                        }
                    } else if (strC.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length = jSONArray.length();
                        for (int i10 = 0; i10 < length; i10++) {
                            if (!f(jSONArray.get(i10).toString(), bundle)) {
                                return false;
                            }
                        }
                        return true;
                    }
                } else if (strC.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 == null) {
                        return false;
                    }
                    int length2 = jSONArray2.length();
                    for (int i11 = 0; i11 < length2; i11++) {
                        if (f(jSONArray2.get(i11).toString(), bundle)) {
                            return true;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return j(strC, jSONObject2, bundle);
            } catch (Throwable th2) {
                e3.a.b(th2, d.class);
            }
        }
        return false;
    }

    private final void g() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            i iVarU = m.u(s.n(), false);
            if (iVarU == null) {
                return;
            }
            f105190c = iVarU.j();
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public static final void h(Bundle bundle, String event) {
        if (e3.a.d(d.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (!f105189b || bundle == null) {
                return;
            }
            try {
                b(bundle, event);
                bundle.putString("_audiencePropertyIds", d(bundle));
                bundle.putString("cs_maca", "1");
                i(bundle);
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            e3.a.b(th2, d.class);
        }
    }

    public static final void i(Bundle params) {
        if (e3.a.d(d.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            for (String str : f105191d) {
                params.remove(str);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, d.class);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0217 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:20:0x004b, B:27:0x0066, B:28:0x006b, B:30:0x0070, B:33:0x007a, B:35:0x0093, B:38:0x009d, B:42:0x00a9, B:136:0x0217, B:139:0x021e, B:140:0x0222, B:142:0x0228, B:45:0x00b3, B:48:0x00bd, B:50:0x00d6, B:151:0x0257, B:154:0x025e, B:155:0x0262, B:157:0x0268, B:53:0x00e0, B:56:0x00ea, B:58:0x0103, B:108:0x01b3, B:61:0x010d, B:101:0x0197, B:64:0x0117, B:91:0x0171, B:67:0x0121, B:70:0x012b, B:127:0x01f8, B:73:0x0135, B:76:0x013f, B:198:0x0316, B:79:0x0149, B:115:0x01c9, B:82:0x0153, B:85:0x015d, B:122:0x01e5, B:88:0x0167, B:95:0x0183, B:98:0x018d, B:105:0x01a9, B:112:0x01bf, B:119:0x01db, B:124:0x01ee, B:131:0x020a, B:146:0x024a, B:161:0x028a, B:164:0x0294, B:168:0x02b0, B:171:0x02ba, B:173:0x02c3, B:191:0x0301, B:176:0x02cc, B:179:0x02d5, B:181:0x02e3, B:184:0x02ec, B:186:0x02f5, B:193:0x030a, B:200:0x031f, B:203:0x0328, B:23:0x005c), top: B:209:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0268 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:20:0x004b, B:27:0x0066, B:28:0x006b, B:30:0x0070, B:33:0x007a, B:35:0x0093, B:38:0x009d, B:42:0x00a9, B:136:0x0217, B:139:0x021e, B:140:0x0222, B:142:0x0228, B:45:0x00b3, B:48:0x00bd, B:50:0x00d6, B:151:0x0257, B:154:0x025e, B:155:0x0262, B:157:0x0268, B:53:0x00e0, B:56:0x00ea, B:58:0x0103, B:108:0x01b3, B:61:0x010d, B:101:0x0197, B:64:0x0117, B:91:0x0171, B:67:0x0121, B:70:0x012b, B:127:0x01f8, B:73:0x0135, B:76:0x013f, B:198:0x0316, B:79:0x0149, B:115:0x01c9, B:82:0x0153, B:85:0x015d, B:122:0x01e5, B:88:0x0167, B:95:0x0183, B:98:0x018d, B:105:0x01a9, B:112:0x01bf, B:119:0x01db, B:124:0x01ee, B:131:0x020a, B:146:0x024a, B:161:0x028a, B:164:0x0294, B:168:0x02b0, B:171:0x02ba, B:173:0x02c3, B:191:0x0301, B:176:0x02cc, B:179:0x02d5, B:181:0x02e3, B:184:0x02ec, B:186:0x02f5, B:193:0x030a, B:200:0x031f, B:203:0x0328, B:23:0x005c), top: B:209:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0301 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:20:0x004b, B:27:0x0066, B:28:0x006b, B:30:0x0070, B:33:0x007a, B:35:0x0093, B:38:0x009d, B:42:0x00a9, B:136:0x0217, B:139:0x021e, B:140:0x0222, B:142:0x0228, B:45:0x00b3, B:48:0x00bd, B:50:0x00d6, B:151:0x0257, B:154:0x025e, B:155:0x0262, B:157:0x0268, B:53:0x00e0, B:56:0x00ea, B:58:0x0103, B:108:0x01b3, B:61:0x010d, B:101:0x0197, B:64:0x0117, B:91:0x0171, B:67:0x0121, B:70:0x012b, B:127:0x01f8, B:73:0x0135, B:76:0x013f, B:198:0x0316, B:79:0x0149, B:115:0x01c9, B:82:0x0153, B:85:0x015d, B:122:0x01e5, B:88:0x0167, B:95:0x0183, B:98:0x018d, B:105:0x01a9, B:112:0x01bf, B:119:0x01db, B:124:0x01ee, B:131:0x020a, B:146:0x024a, B:161:0x028a, B:164:0x0294, B:168:0x02b0, B:171:0x02ba, B:173:0x02c3, B:191:0x0301, B:176:0x02cc, B:179:0x02d5, B:181:0x02e3, B:184:0x02ec, B:186:0x02f5, B:193:0x030a, B:200:0x031f, B:203:0x0328, B:23:0x005c), top: B:209:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0316 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:20:0x004b, B:27:0x0066, B:28:0x006b, B:30:0x0070, B:33:0x007a, B:35:0x0093, B:38:0x009d, B:42:0x00a9, B:136:0x0217, B:139:0x021e, B:140:0x0222, B:142:0x0228, B:45:0x00b3, B:48:0x00bd, B:50:0x00d6, B:151:0x0257, B:154:0x025e, B:155:0x0262, B:157:0x0268, B:53:0x00e0, B:56:0x00ea, B:58:0x0103, B:108:0x01b3, B:61:0x010d, B:101:0x0197, B:64:0x0117, B:91:0x0171, B:67:0x0121, B:70:0x012b, B:127:0x01f8, B:73:0x0135, B:76:0x013f, B:198:0x0316, B:79:0x0149, B:115:0x01c9, B:82:0x0153, B:85:0x015d, B:122:0x01e5, B:88:0x0167, B:95:0x0183, B:98:0x018d, B:105:0x01a9, B:112:0x01bf, B:119:0x01db, B:124:0x01ee, B:131:0x020a, B:146:0x024a, B:161:0x028a, B:164:0x0294, B:168:0x02b0, B:171:0x02ba, B:173:0x02c3, B:191:0x0301, B:176:0x02cc, B:179:0x02d5, B:181:0x02e3, B:184:0x02ec, B:186:0x02f5, B:193:0x030a, B:200:0x031f, B:203:0x0328, B:23:0x005c), top: B:209:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean j(java.lang.String r8, org.json.JSONObject r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.d.j(java.lang.String, org.json.JSONObject, android.os.Bundle):boolean");
    }
}
