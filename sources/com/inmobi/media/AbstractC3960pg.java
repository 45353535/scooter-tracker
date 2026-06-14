package com.inmobi.media;

import android.content.ContentValues;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.pg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3960pg {
    public static final ContentValues a(Rf rf2) throws JSONException {
        Intrinsics.checkNotNullParameter(rf2, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", rf2.f37659b);
        contentValues.put("url", rf2.f37658a);
        Map map = rf2.f37660c;
        Intrinsics.checkNotNullParameter(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
        }
        contentValues.put("headers", jSONObject.toString());
        contentValues.put("allow_redirects", String.valueOf(rf2.f37661d));
        contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, rf2.f37662e);
        contentValues.put("ack_required", String.valueOf(rf2.f37663f));
        contentValues.put("time_created", Long.valueOf(rf2.f37666i));
        contentValues.put("retry_count", Integer.valueOf(rf2.f37664g));
        contentValues.put("owner", rf2.f37665h);
        Long l10 = rf2.f37667j;
        contentValues.put("retryAfter", Long.valueOf(l10 != null ? l10.longValue() : 0L));
        C3738gi c3738gi = rf2.f37668k;
        if (c3738gi != null) {
            String string = new JSONObject().put("plType", c3738gi.f38640a.f39716f).put("plId", c3738gi.f38640a.f39711a).put("adType", c3738gi.f38640a.f39715e).put("markupType", c3738gi.f38641b).put("networkType", C4148x5.m()).put("creativeType", c3738gi.f38645f).put("creativeId", c3738gi.f38646g).put("isRewarded", c3738gi.f38647h).put("adPosition", c3738gi.f38648i).put("metadataBlob", c3738gi.f38643d).put("impressionId", c3738gi.f38642c).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            contentValues.put("telemetry_metadata", string);
        }
        return contentValues;
    }

    public static final Rf a(ContentValues contentValues) throws JSONException {
        boolean z10;
        String str;
        C3738gi c3738gi;
        Intrinsics.checkNotNullParameter(contentValues, "<this>");
        String asString = contentValues.getAsString("id");
        String asString2 = contentValues.getAsString("url");
        JSONObject jSONObject = new JSONObject(contentValues.getAsString("headers"));
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (true) {
            String str2 = "";
            if (!itKeys.hasNext()) {
                break;
            }
            String next = itKeys.next();
            String string = jSONObject.getString(next);
            if (string != null) {
                str2 = string;
            }
            linkedHashMap.put(next, str2);
        }
        boolean z11 = Boolean.parseBoolean(contentValues.getAsString("allow_redirects"));
        String asString3 = contentValues.getAsString(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        boolean z12 = Boolean.parseBoolean(contentValues.getAsString("ack_required"));
        Integer asInteger = contentValues.getAsInteger("retry_count");
        int iIntValue = asInteger != null ? asInteger.intValue() : 0;
        String asString4 = contentValues.getAsString("owner");
        if (asString4 == null) {
            asString4 = "unknown";
        }
        String str3 = asString4;
        Long asLong = contentValues.getAsLong("retryAfter");
        Long asLong2 = contentValues.getAsLong("time_created");
        Intrinsics.checkNotNull(asString2);
        Intrinsics.checkNotNull(asString);
        Intrinsics.checkNotNull(asString3);
        Intrinsics.checkNotNull(asLong2);
        long jLongValue = asLong2.longValue();
        String json = contentValues.getAsString("telemetry_metadata");
        if (json != null) {
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                JSONObject jSONObject2 = new JSONObject(json);
                String mAdType = jSONObject2.getString("adType");
                Intrinsics.checkNotNullExpressionValue(mAdType, "getString(...)");
                Intrinsics.checkNotNullParameter(mAdType, "mAdType");
                String string2 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                z10 = z11;
                try {
                    long j10 = jSONObject2.getLong("plId");
                    try {
                        if (j10 != Long.MIN_VALUE) {
                            C4093v0 c4093v0 = new C4093v0(j10, "", mAdType, null);
                            str = asString2;
                            c4093v0.f39714d = null;
                            c4093v0.f39713c = null;
                            Intrinsics.checkNotNullParameter("", "<set-?>");
                            c4093v0.f39718h = "";
                            Intrinsics.checkNotNullParameter("activity", "<set-?>");
                            c4093v0.f39719i = "activity";
                            c4093v0.f39717g = string2;
                            c4093v0.f39720j = false;
                            c4093v0.f39721k = null;
                            String string3 = jSONObject2.getString("markupType");
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            String string4 = jSONObject2.getString("impressionId");
                            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                            String strOptString = jSONObject2.optString("metadataBlob", "");
                            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                            String string5 = jSONObject2.getString("creativeType");
                            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                            String string6 = jSONObject2.getString("creativeId");
                            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                            c3738gi = new C3738gi(c4093v0, string3, string4, strOptString, 0, string5, string6, jSONObject2.getBoolean("isRewarded"), jSONObject2.getInt("adPosition"), null, null, null, null);
                        } else {
                            throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
                        }
                    } catch (JSONException unused) {
                        c3738gi = null;
                    }
                } catch (JSONException unused2) {
                    str = asString2;
                }
            } catch (JSONException unused3) {
                z10 = z11;
            }
            c3738gi = null;
        } else {
            z10 = z11;
            str = asString2;
            c3738gi = null;
        }
        return new Rf(str, asString, linkedHashMap, z10, asString3, z12, iIntValue, str3, jLongValue, asLong, c3738gi);
    }
}
