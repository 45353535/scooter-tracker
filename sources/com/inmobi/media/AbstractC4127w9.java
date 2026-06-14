package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.location.Location;
import com.ironsource.C4240b4;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.w9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4127w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39834a;

    public AbstractC4127w9(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f39834a = url;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.util.LinkedHashMap r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.content.Context r0 = com.inmobi.media.Ji.f37157a
            java.lang.String r0 = com.inmobi.media.AbstractC3725g5.a(r0)
            if (r0 == 0) goto L26
            com.inmobi.media.i4 r0 = com.inmobi.media.Y3.f38021a
            java.lang.String r0 = "clazz"
            java.lang.Class<com.inmobi.media.core.config.models.AdConfig> r1 = com.inmobi.media.core.config.models.AdConfig.class
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            com.inmobi.media.i4 r0 = com.inmobi.media.Y3.f38021a
            com.inmobi.media.core.config.models.Config r0 = r0.a(r1)
            com.inmobi.media.core.config.models.AdConfig r0 = (com.inmobi.media.core.config.models.AdConfig) r0
            boolean r0 = r0.getCctEnabled()
            if (r0 == 0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "cct-enabled"
            r2.put(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC4127w9.a(java.util.LinkedHashMap):void");
    }

    public static void b(LinkedHashMap linkedHashMap) {
        Pair pair;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        C4148x5.f39893a.getClass();
        Pair pairH = C4148x5.h();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pairH != null) {
            linkedHashMap.put(pairH.getFirst(), pairH.getSecond());
        }
        Pair pairJ = C4148x5.j();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pairJ != null) {
            linkedHashMap.put(pairJ.getFirst(), pairJ.getSecond());
        }
        Pair pair2 = C4148x5.f39901i;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pair2 != null) {
            linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
        }
        Context context = Ji.f37157a;
        Pair pair3 = null;
        if (context == null) {
            pair = null;
        } else {
            Intent intentA = F3.a(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            pair = new Pair("d-bat-chrg", (intentA != null ? intentA.getIntExtra("status", -1) : -1) == 2 ? "1" : "0");
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pair != null) {
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        Pair pairO = C4148x5.o();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pairO != null) {
            linkedHashMap.put(pairO.getFirst(), pairO.getSecond());
        }
        Pair pairE = C4148x5.e();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pairE != null) {
            linkedHashMap.put(pairE.getFirst(), pairE.getSecond());
        }
        Context context2 = Ji.f37157a;
        if (context2 != null) {
            Intent intentA2 = F3.a(context2, (BroadcastReceiver) null, new IntentFilter("android.intent.action.HEADSET_PLUG"));
            pair3 = (intentA2 == null || intentA2.getIntExtra("state", 0) != 1) ? new Pair("d-w-h", "0") : new Pair("d-w-h", "1");
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pair3 != null) {
            linkedHashMap.put(pair3.getFirst(), pair3.getSecond());
        }
        Pair pairF = C4148x5.f();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pairF != null) {
            linkedHashMap.put(pairF.getFirst(), pairF.getSecond());
        }
        Pair pairG = C4148x5.g();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pairG != null) {
            linkedHashMap.put(pairG.getFirst(), pairG.getSecond());
        }
        Pair pairD = C4148x5.d();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pairD != null) {
            linkedHashMap.put(pairD.getFirst(), pairD.getSecond());
        }
        Pair pairI = C4148x5.i();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pairI != null) {
            linkedHashMap.put(pairI.getFirst(), pairI.getSecond());
        }
    }

    public static void c(LinkedHashMap linkedHashMap) {
        SharedPreferences sharedPreferencesA;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        String strValueOf = "";
        if (Ji.f37157a != null && (sharedPreferencesA = Ri.a()) != null && sharedPreferencesA.contains("IABGPP_HDR_GppString")) {
            strValueOf = String.valueOf(sharedPreferencesA.getString("IABGPP_HDR_GppString", ""));
        }
        if (F3.a(strValueOf)) {
            linkedHashMap.put(EidRequestBuilder.REQUEST_FIELD_GPP, strValueOf);
        }
    }

    public static void d(LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        C3880mb c3880mb = C3880mb.f39026a;
        HashMap map = new HashMap();
        C3986qh c3986qh = Yi.f38062a;
        Location locationA = (Ji.b() == null || Yi.a().getLocationEnabled()) ? C3880mb.a() : null;
        HashMap mapA = locationA != null ? C3880mb.a(locationA, true, Kf.a(Ji.f37157a, "android.permission.ACCESS_FINE_LOCATION") ? C3880mb.a(1, 3) : null) : C3880mb.a(Tg.b(), false, null);
        for (Map.Entry entry : mapA.entrySet()) {
            map.put((String) entry.getKey(), entry.getValue().toString());
        }
        linkedHashMap.putAll(map);
        C3880mb c3880mb2 = C3880mb.f39026a;
        HashMap map2 = new HashMap();
        String str = "DENIED";
        if (C3880mb.d() && C3880mb.e()) {
            str = "AUTHORISED";
        }
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = str.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        map2.put("loc-consent-status", lowerCase);
        linkedHashMap.putAll(map2);
    }

    public static void e(LinkedHashMap linkedHashMap) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Qi qi = Qi.f37598a;
        qi.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (Qi.a(0)) {
            linkedHashMap2.put("st", Long.valueOf(Qi.f37603f));
        }
        if (Qi.a(5)) {
            I1 i12 = Qi.f37607j;
            KProperty[] kPropertyArr = Qi.f37599b;
            if (((Number) i12.getValue(qi, kPropertyArr[0])).intValue() != -1) {
                linkedHashMap2.put("cnt", Integer.valueOf(((Number) i12.getValue(qi, kPropertyArr[0])).intValue()));
            }
        }
        if (Qi.a(6)) {
            I1 i13 = Qi.f37608k;
            KProperty[] kPropertyArr2 = Qi.f37599b;
            if (((Number) i13.getValue(qi, kPropertyArr2[1])).intValue() != -1) {
                linkedHashMap2.put("u-ret", Integer.valueOf(((Number) i13.getValue(qi, kPropertyArr2[1])).intValue()));
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) Qi.f37604g);
        if (!Qi.a(1)) {
            mutableList.set(0, -1);
        }
        if (!Qi.a(2)) {
            mutableList.set(1, -1);
        }
        if (!Qi.a(3)) {
            mutableList.set(2, -1);
        }
        if (!Qi.a(4)) {
            mutableList.set(3, -1);
        }
        if (!(mutableList instanceof Collection) || !mutableList.isEmpty()) {
            Iterator it = mutableList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Number) it.next()).intValue() != -1) {
                        linkedHashMap2.put("dep", mutableList);
                        break;
                    }
                }
            }
        }
        try {
            jSONObject = new JSONObject(linkedHashMap2);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        if (jSONObject.length() > 0) {
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            linkedHashMap.put("sData", string);
        }
    }

    public static JSONObject a(String str) throws JSONException {
        if (Intrinsics.areEqual(str, "banner")) {
            return W8.f37936c.a();
        }
        if (Intrinsics.areEqual("audio", str)) {
            T8 t82 = T8.f37759c;
            JSONObject jSONObject = new JSONObject();
            long j10 = t82.f38537a / 1000;
            if (j10 != 0) {
                jSONObject.put("a-lastAudioPlayedTs", String.valueOf(j10));
            }
            int i10 = t82.f38538b;
            if (i10 > 0) {
                jSONObject.put("a-audioFreq", String.valueOf(i10));
            }
            Context context = Ji.f37157a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Ea eaA = Da.a(context, "audio_pref_file");
                Intrinsics.checkNotNullParameter("user_mute_count", C4240b4.i.W);
                int i11 = eaA.f36783a.getInt("user_mute_count", -1);
                if (i11 > 0) {
                    jSONObject.put("a-umc", String.valueOf(i11));
                }
            }
            return jSONObject;
        }
        return new JSONObject();
    }
}
