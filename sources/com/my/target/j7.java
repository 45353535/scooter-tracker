package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.my.target.common.models.Disclaimer;
import com.my.target.j7;
import com.my.target.nativeads.banners.NativeBanner;
import com.my.target.nativeads.banners.NativePromoBanner;
import net.pubnative.lite.sdk.models.APIAsset;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class j7 {
    public static void b(final String str, final NativePromoBanner nativePromoBanner, final Context context) {
        f0.e(new Runnable() { // from class: k5.z0
            @Override // java.lang.Runnable
            public final void run() {
                String str2 = str;
                NativePromoBanner nativePromoBanner2 = nativePromoBanner;
                Context context2 = context;
                j7.a(j7.a(str2, nativePromoBanner2.getNavigationType(), nativePromoBanner2.getStoreType(), nativePromoBanner2.getTitle(), nativePromoBanner2.getCtaText(), nativePromoBanner2.getDomain(), nativePromoBanner2.getAgeRestrictions(), nativePromoBanner2.getDisclaimer(), nativePromoBanner2.getDisclaimerInfo(), nativePromoBanner2.getDescription(), nativePromoBanner2.getRating(), nativePromoBanner2.getVotes(), nativePromoBanner2.hasVideo(), context2), context2);
            }
        });
    }

    public static void b(final String str, final NativeBanner nativeBanner, final Context context) {
        f0.e(new Runnable() { // from class: k5.y0
            @Override // java.lang.Runnable
            public final void run() {
                String str2 = str;
                NativeBanner nativeBanner2 = nativeBanner;
                Context context2 = context;
                j7.a(j7.a(str2, nativeBanner2.getNavigationType(), nativeBanner2.getStoreType(), nativeBanner2.getTitle(), nativeBanner2.getCtaText(), nativeBanner2.getDomain(), nativeBanner2.getAgeRestrictions(), nativeBanner2.getDisclaimer(), nativeBanner2.getDisclaimerInfo(), nativeBanner2.getDescription(), nativeBanner2.getRating(), nativeBanner2.getVotes(), false, context2), context2);
            }
        });
    }

    public static String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Disclaimer disclaimer, String str9, float f10, int i10, boolean z10, Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("instance_id", d2.b().a(context));
            jSONObject.put("network", str);
            jSONObject.put("navigationType", str2);
            a(jSONObject, "storeType", str3);
            a(jSONObject, "title", str4);
            a(jSONObject, "ctaText", str5);
            a(jSONObject, C4240b4.j.D, str6);
            a(jSONObject, "ageRestrictions", str7);
            a(jSONObject, "disclaimer", str8);
            if (disclaimer != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("disclaimerType", disclaimer.disclaimerType);
                jSONObject2.put("disclaimerText", disclaimer.text);
                jSONObject.put("disclaimerInfo", jSONObject2);
            }
            if (f10 > 0.0f) {
                jSONObject.put("rating", String.valueOf(f10));
            }
            if (i10 > 0) {
                jSONObject.put(APIAsset.VOTES, String.valueOf(i10));
            }
            a(jSONObject, "description", str9);
            if (z10) {
                jSONObject.put("hasVideo", "true");
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void a(String str, Context context) {
        if (str == null) {
            return;
        }
        m2.a().a("https://ad.mail.ru/mobile/adcontext", y1.b(str), context);
    }

    public static void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }
}
