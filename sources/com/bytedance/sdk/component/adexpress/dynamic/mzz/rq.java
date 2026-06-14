package com.bytedance.sdk.component.adexpress.dynamic.mzz;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.mzz.ud;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class rq {
    private static final Set<String> qdl = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static String f16394ud;

    /* JADX WARN: Removed duplicated region for block: B:226:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x046d A[Catch: Exception -> 0x0480, TryCatch #0 {Exception -> 0x0480, blocks: (B:227:0x0461, B:229:0x046d, B:234:0x0479), top: B:282:0x0461 }] */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.bytedance.sdk.component.adexpress.dynamic.mzz.ud$lnr, float] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bytedance.sdk.component.adexpress.dynamic.mzz.ud.lnr qdl(java.lang.String r26, java.lang.String r27, java.lang.String r28, boolean r29, boolean r30, int r31, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc r32, double r33, int r35, double r36, java.lang.String r38, com.bytedance.sdk.component.adexpress.ud.exu r39) {
        /*
            Method dump skipped, instruction units count: 1332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.mzz.rq.qdl(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc, double, int, double, java.lang.String, com.bytedance.sdk.component.adexpress.ud.exu):com.bytedance.sdk.component.adexpress.dynamic.mzz.ud$lnr");
    }

    public static double ud(String str) {
        try {
            return Double.parseDouble(new JSONObject(str).optString("fontSize"));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static int[] ud(String str, float f10, boolean z10) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.mml.qdl());
            textView.setTextSize(f10);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z10) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    public static boolean ud() {
        return !TextUtils.isEmpty(f16394ud);
    }

    public static String qdl(String str) {
        String[] strArrSplit;
        return (TextUtils.isEmpty(str) || (strArrSplit = str.split("adx:")) == null || strArrSplit.length < 2) ? "" : strArrSplit[1];
    }

    private static ud.lnr qdl(ud.lnr lnrVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            lnrVar.qdl = 0.0f;
            lnrVar.f16397ud = 0.0f;
            return lnrVar;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = qdl(str);
        }
        if (TextUtils.isEmpty(str3)) {
            lnrVar.qdl = 0.0f;
            lnrVar.f16397ud = 0.0f;
            return lnrVar;
        }
        return qdl(str3, str2);
    }

    public static ud.lnr qdl(String str, String str2) {
        return qdl(str, str2, false);
    }

    public static ud.lnr qdl(String str, String str2, boolean z10) {
        ud.lnr lnrVar = new ud.lnr();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] iArrQdl = qdl(str, (float) ud(str2), z10);
            lnrVar.qdl = iArrQdl[0];
            lnrVar.f16397ud = iArrQdl[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) == 0.0d) {
                lnrVar.f16397ud = 0.0f;
            }
        } catch (Exception unused) {
        }
        return lnrVar;
    }

    public static int[] qdl(String str, float f10, boolean z10) {
        int[] iArrUd = ud(str, f10, z10);
        return new int[]{com.bytedance.sdk.component.adexpress.mml.wd.ud(com.bytedance.sdk.component.adexpress.mml.qdl(), iArrUd[0]), com.bytedance.sdk.component.adexpress.mml.wd.ud(com.bytedance.sdk.component.adexpress.mml.qdl(), iArrUd[1])};
    }

    public static String qdl() {
        return f16394ud;
    }
}
