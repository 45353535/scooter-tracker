package com.inmobi.media;

import com.inmobi.media.Ok;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import j$.util.Objects;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Ok {
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.inmobi.media.Pk a() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Ok.a():com.inmobi.media.Pk");
    }

    public static boolean b(JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject == null) {
            return true;
        }
        try {
            jSONArray = jSONObject.has("ufids") ? jSONObject.getJSONArray("ufids") : null;
        } catch (JSONException unused) {
        }
        return jSONArray == null || jSONArray.length() == 0;
    }

    public static boolean c(JSONObject ufids) {
        boolean z10;
        Intrinsics.checkNotNullParameter(ufids, "ufids");
        try {
            if (ufids.has("ufids")) {
                JSONArray jSONArray = ufids.getJSONArray("ufids");
                int length = jSONArray.length();
                z10 = true;
                for (int i10 = 0; i10 < length; i10++) {
                    try {
                        z10 &= System.currentTimeMillis() <= jSONArray.getJSONObject(i10).getLong("expiry");
                    } catch (JSONException unused) {
                        Objects.toString(ufids);
                        return !z10;
                    }
                }
            } else {
                z10 = true;
            }
        } catch (JSONException unused2) {
            z10 = true;
        }
        return !z10;
    }

    public static final void b(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, JSONObject jSONObject, Error error) {
        if (inMobiUnifiedIdInterface != null) {
            inMobiUnifiedIdInterface.onFetchCompleted(jSONObject, error);
        }
    }

    public static JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObjectB = F9.b();
        if (jSONObjectB != null) {
            try {
                if (jSONObjectB.has("ufids")) {
                    JSONArray jSONArray2 = jSONObjectB.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        String string = jSONArray2.getJSONObject(i10).has("src") ? jSONArray2.getJSONObject(i10).getString("src") : null;
                        String string2 = jSONArray2.getJSONObject(i10).has(InAppPurchaseMetaData.KEY_SIGNATURE) ? jSONArray2.getJSONObject(i10).getString(InAppPurchaseMetaData.KEY_SIGNATURE) : null;
                        boolean z10 = System.currentTimeMillis() > jSONArray2.getJSONObject(i10).getLong("expiry");
                        if (string != null && string2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("src", string);
                            jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, string2);
                            jSONObject.put("expired", z10);
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (JSONException e10) {
                e10.getMessage();
                jSONObjectB.toString();
            }
        }
        return jSONArray;
    }

    public static boolean c() {
        C4044t1 c4044t1 = AbstractC4213zk.f40073a;
        Boolean bool = c4044t1 != null ? c4044t1.f39573c : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        if (zBooleanValue) {
            InMobiUnifiedIdService.reset();
        }
        return zBooleanValue;
    }

    public static void a(final InMobiUnifiedIdInterface inMobiUnifiedIdInterface, final JSONObject jSONObject, final Error error) {
        short s10;
        String message = error != null ? error.getMessage() : null;
        if (Intrinsics.areEqual(message, InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT)) {
            s10 = 93;
        } else {
            s10 = Intrinsics.areEqual(message, InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT) ? (short) 94 : (short) -1;
        }
        if (s10 >= 0) {
            Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("errorCode", Short.valueOf(s10)));
            Wj wj = Wj.f37959a;
            Wj.b("FetchCallbackFailure", mapMutableMapOf, EnumC3585ak.f38215a);
        }
        Oj.a(new Runnable() { // from class: w3.y3
            @Override // java.lang.Runnable
            public final void run() {
                Ok.b(inMobiUnifiedIdInterface, jSONObject, error);
            }
        });
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            try {
                if (jSONObject.has("ufids")) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i10);
                        if (System.currentTimeMillis() < jSONObject3.getLong("expiry")) {
                            jSONArray.put(jSONObject3);
                        }
                    }
                }
            } catch (JSONException e10) {
                e10.getMessage();
                return null;
            }
        }
        if (jSONArray.length() <= 0) {
            return null;
        }
        jSONObject2.put("ufids", jSONArray);
        return jSONObject2;
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        HashMap map = new HashMap();
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject2 != null) {
            try {
                if (jSONObject2.has("ufids")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        map.put(jSONArray2.getJSONObject(i10).getString("src"), jSONArray2.getJSONObject(i10));
                    }
                }
            } catch (JSONException e10) {
                e10.getMessage();
                Objects.toString(jSONObject2);
                Objects.toString(jSONObject);
                return jSONObject3;
            }
        }
        if (jSONObject != null && jSONObject.has("ufids")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("ufids");
            int length2 = jSONArray3.length();
            for (int i11 = 0; i11 < length2; i11++) {
                map.put(jSONArray3.getJSONObject(i11).getString("src"), jSONArray3.getJSONObject(i11));
            }
        }
        Collection collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            jSONArray.put((JSONObject) it.next());
        }
        jSONObject3.put("ufids", jSONArray);
        return jSONObject3;
    }
}
