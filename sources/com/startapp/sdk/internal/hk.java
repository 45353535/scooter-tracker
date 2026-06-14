package com.startapp.sdk.internal;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.LruCache;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class hk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LruCache f64653a = new LruCache(100);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f64654b = new HashSet(Arrays.asList(NotDisplayedReason.AD_CLIPPED, NotDisplayedReason.AD_WAS_COVERED));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r21v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r3v16, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v17, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.startapp.sdk.internal.lk a(android.view.View r20, android.graphics.Point r21, com.startapp.sdk.ads.banner.BannerOptions r22, java.util.concurrent.atomic.AtomicReference r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.hk.a(android.view.View, android.graphics.Point, com.startapp.sdk.ads.banner.BannerOptions, java.util.concurrent.atomic.AtomicReference, boolean):com.startapp.sdk.internal.lk");
    }

    public static String b(View view) {
        String name = view.getClass().getName();
        if (name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("com.android.")) {
            return view.getClass().getSimpleName();
        }
        String packageName = view.getContext().getPackageName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(packageName);
        sb2.append(".");
        return name.startsWith(sb2.toString()) ? name.substring(packageName.length()) : name;
    }

    public static JSONObject a(View view, Rect rect, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("class", b(view));
            String strA = a(view);
            if (strA != null) {
                jSONObject.put("id", strA);
            }
            if (z10) {
                jSONObject.put(TypedValues.AttributesType.S_TARGET, true);
            }
            if (view.getAlpha() < 1.0f) {
                jSONObject.put("alpha", view.getAlpha());
            }
            if (rect != null) {
                jSONObject.put("left", rect.left);
                jSONObject.put("top", rect.top);
                jSONObject.put("right", rect.right);
                jSONObject.put("bottom", rect.bottom);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String a(View view) {
        int id2 = view.getId();
        if (id2 == -1 || id2 == 0) {
            return null;
        }
        LruCache lruCache = f64653a;
        synchronized (lruCache) {
            try {
                String str = (String) lruCache.get(Integer.valueOf(id2));
                if (str != null) {
                    return str;
                }
                try {
                    return view.getContext().getResources().getResourceName(id2);
                } catch (Resources.NotFoundException unused) {
                    String str2 = "0x" + Integer.toHexString(id2);
                    LruCache lruCache2 = f64653a;
                    synchronized (lruCache2) {
                        lruCache2.put(Integer.valueOf(id2), str2);
                        return str2;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
