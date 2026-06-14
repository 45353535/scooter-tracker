package z2;

import android.util.Patterns;
import androidx.autofill.HintConstants;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import net.pubnative.lite.sdk.models.Protocol;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f119144a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map f119145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map f119146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Map f119147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static JSONObject f119148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f119149f;

    private a() {
    }

    public static final float[] a(JSONObject viewHierarchy, String appName) {
        if (e3.a.d(a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(viewHierarchy, "viewHierarchy");
            Intrinsics.checkNotNullParameter(appName, "appName");
            if (!f119149f) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            try {
                String lowerCase = appName.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                JSONObject jSONObject = new JSONObject(viewHierarchy.optJSONObject(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW).toString());
                String screenName = viewHierarchy.optString("screenname");
                JSONArray jSONArray = new JSONArray();
                a aVar = f119144a;
                aVar.j(jSONObject, jSONArray);
                aVar.m(fArr, aVar.i(jSONObject));
                JSONObject jSONObjectB = aVar.b(jSONObject);
                if (jSONObjectB == null) {
                    return null;
                }
                Intrinsics.checkNotNullExpressionValue(screenName, "screenName");
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "viewTree.toString()");
                aVar.m(fArr, aVar.h(jSONObjectB, jSONArray, screenName, string, lowerCase));
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            e3.a.b(th2, a.class);
            return null;
        }
    }

    private final JSONObject b(JSONObject jSONObject) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return null;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "children.getJSONObject(i)");
                JSONObject jSONObjectB = b(jSONObject2);
                if (jSONObjectB != null) {
                    return jSONObjectB;
                }
            }
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
        return null;
    }

    public static final String c(String buttonText, String activityName, String appName) {
        if (e3.a.d(a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(appName, "appName");
            String lowerCase = (appName + " | " + activityName + ", " + buttonText).toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (Throwable th2) {
            e3.a.b(th2, a.class);
            return null;
        }
    }

    public static final void d(File file) {
        if (e3.a.d(a.class)) {
            return;
        }
        try {
            try {
                f119148e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f119148e = new JSONObject(new String(bArr, Charsets.UTF_8));
                f119145b = MapsKt.mapOf(TuplesKt.to("ENGLISH", "1"), TuplesKt.to("GERMAN", "2"), TuplesKt.to("SPANISH", "3"), TuplesKt.to("JAPANESE", Protocol.VAST_1_0_WRAPPER));
                f119146c = MapsKt.mapOf(TuplesKt.to("VIEW_CONTENT", "0"), TuplesKt.to("SEARCH", "1"), TuplesKt.to("ADD_TO_CART", "2"), TuplesKt.to("ADD_TO_WISHLIST", "3"), TuplesKt.to("INITIATE_CHECKOUT", Protocol.VAST_1_0_WRAPPER), TuplesKt.to("ADD_PAYMENT_INFO", "5"), TuplesKt.to("PURCHASE", "6"), TuplesKt.to("LEAD", "7"), TuplesKt.to("COMPLETE_REGISTRATION", "8"));
                f119147d = MapsKt.mapOf(TuplesKt.to("BUTTON_TEXT", "1"), TuplesKt.to("PAGE_TITLE", "2"), TuplesKt.to("RESOLVED_DOCUMENT_LINK", "3"), TuplesKt.to("BUTTON_ID", Protocol.VAST_1_0_WRAPPER));
                f119149f = true;
            } catch (Throwable th2) {
                e3.a.b(th2, a.class);
            }
        } catch (Exception unused) {
        }
    }

    private final boolean e(JSONObject jSONObject) {
        if (e3.a.d(this)) {
            return false;
        }
        try {
            return ((jSONObject.optInt("classtypebitmask") & 1) << 5) > 0;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }

    public static final boolean f() {
        if (e3.a.d(a.class)) {
            return false;
        }
        try {
            return f119149f;
        } catch (Throwable th2) {
            e3.a.b(th2, a.class);
            return false;
        }
    }

    private final boolean g(String[] strArr, String[] strArr2) {
        if (e3.a.d(this)) {
            return false;
        }
        try {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (StringsKt.g0(str2, str, false, 2, null)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }

    private final float[] h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float f10;
        if (e3.a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            int length = jSONArray.length();
            float f11 = 1.0f;
            fArr[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                int i11 = 0;
                while (i11 < length2) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    f10 = f11;
                    try {
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "siblings.getJSONObject(i)");
                        if (e(jSONObject2)) {
                            fArr[9] = fArr[9] + f10;
                        }
                        i11++;
                        f11 = f10;
                    } catch (JSONException unused) {
                    }
                }
            } catch (JSONException unused2) {
            }
            f10 = f11;
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            n(jSONObject, sb3, sb2);
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "hintSB.toString()");
            String string2 = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "textSB.toString()");
            fArr[15] = l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", string2) ? f10 : 0.0f;
            fArr[16] = l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? f10 : 0.0f;
            fArr[17] = l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", string) ? f10 : 0.0f;
            fArr[18] = StringsKt.g0(str2, HintConstants.AUTOFILL_HINT_PASSWORD, false, 2, null) ? f10 : 0.0f;
            fArr[19] = k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? f10 : 0.0f;
            fArr[20] = k("(?i)(sign in)|login|signIn", str2) ? f10 : 0.0f;
            fArr[21] = k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? f10 : 0.0f;
            fArr[22] = l("ENGLISH", "PURCHASE", "BUTTON_TEXT", string2) ? f10 : 0.0f;
            fArr[24] = l("ENGLISH", "PURCHASE", "PAGE_TITLE", str4) ? f10 : 0.0f;
            fArr[25] = k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2) ? f10 : 0.0f;
            fArr[27] = k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? f10 : 0.0f;
            fArr[28] = l("ENGLISH", "LEAD", "BUTTON_TEXT", string2) ? f10 : 0.0f;
            fArr[29] = l("ENGLISH", "LEAD", "PAGE_TITLE", str4) ? f10 : 0.0f;
            return fArr;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final float[] i(JSONObject jSONObject) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            String strOptString = jSONObject.optString("text");
            Intrinsics.checkNotNullExpressionValue(strOptString, "node.optString(TEXT_KEY)");
            String lowerCase = strOptString.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            String strOptString2 = jSONObject.optString("hint");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "node.optString(HINT_KEY)");
            String lowerCase2 = strOptString2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase()");
            String strOptString3 = jSONObject.optString("classname");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = strOptString3.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase()");
            int iOptInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (g(new String[]{"$", "amount", "price", C4240b4.i.f42636l}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (g(new String[]{HintConstants.AUTOFILL_HINT_PASSWORD, "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (g(new String[]{MRAIDNativeFeature.TEL, "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (g(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (iOptInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (iOptInt == 2 || iOptInt == 3) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (StringsKt.g0(lowerCase3, "checkbox", false, 2, null)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (StringsKt.g0(lowerCase3, "radio", false, 2, null) && StringsKt.g0(lowerCase3, "button", false, 2, null)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "childViews.getJSONObject(i)");
                    m(fArr, i(jSONObject2));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final boolean j(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z10;
        if (e3.a.d(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            int length = jSONArrayOptJSONArray.length();
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                }
                if (jSONArrayOptJSONArray.getJSONObject(i10).optBoolean("is_interacted")) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            boolean z11 = z10;
            JSONArray jSONArray2 = new JSONArray();
            if (z10) {
                int length2 = jSONArrayOptJSONArray.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i11));
                }
                return z11;
            }
            int length3 = jSONArrayOptJSONArray.length();
            for (int i12 = 0; i12 < length3; i12++) {
                JSONObject child = jSONArrayOptJSONArray.getJSONObject(i12);
                Intrinsics.checkNotNullExpressionValue(child, "child");
                if (j(child, jSONArray)) {
                    jSONArray2.put(child);
                    z11 = true;
                }
            }
            jSONObject.put("childviews", jSONArray2);
            return z11;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }

    private final boolean k(String str, String str2) {
        if (e3.a.d(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }

    private final boolean l(String str, String str2, String str3, String str4) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (e3.a.d(this)) {
            return false;
        }
        try {
            JSONObject jSONObject = f119148e;
            String strOptString = null;
            Map map = null;
            strOptString = null;
            strOptString = null;
            strOptString = null;
            strOptString = null;
            if (jSONObject == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rules");
                jSONObject = null;
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("rulesForLanguage");
            if (jSONObjectOptJSONObject3 != null) {
                Map map2 = f119145b;
                if (map2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("languageInfo");
                    map2 = null;
                }
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject((String) map2.get(str));
                if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("rulesForEvent")) != null) {
                    Map map3 = f119146c;
                    if (map3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("eventInfo");
                        map3 = null;
                    }
                    JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject((String) map3.get(str2));
                    if (jSONObjectOptJSONObject5 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject5.optJSONObject("positiveRules")) != null) {
                        Map map4 = f119147d;
                        if (map4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("textTypeInfo");
                        } else {
                            map = map4;
                        }
                        strOptString = jSONObjectOptJSONObject2.optString((String) map.get(str3));
                    }
                }
            }
            if (strOptString == null) {
                return false;
            }
            return k(strOptString, str4);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }

    private final void m(float[] fArr, float[] fArr2) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            int length = fArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                fArr[i10] = fArr[i10] + fArr2[i10];
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private final void n(JSONObject jSONObject, StringBuilder sb2, StringBuilder sb3) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            String strOptString = jSONObject.optString("text", "");
            Intrinsics.checkNotNullExpressionValue(strOptString, "view.optString(TEXT_KEY, \"\")");
            String lowerCase = strOptString.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            String strOptString2 = jSONObject.optString("hint", "");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = strOptString2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase()");
            if (lowerCase.length() > 0) {
                sb2.append(lowerCase);
                sb2.append(" ");
            }
            if (lowerCase2.length() > 0) {
                sb3.append(lowerCase2);
                sb3.append(" ");
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    JSONObject currentChildView = jSONArrayOptJSONArray.getJSONObject(i10);
                    Intrinsics.checkNotNullExpressionValue(currentChildView, "currentChildView");
                    n(currentChildView, sb2, sb3);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }
}
