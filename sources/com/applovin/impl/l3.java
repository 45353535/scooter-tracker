package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l3 extends r0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f9235e = {com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "settings", "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters", "ad_unit_signal_providers"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f9236f = {com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "settings", "signal_providers", "ad_unit_signal_providers"};

    public static String a(com.applovin.impl.sdk.k kVar) {
        return r0.a((String) kVar.a(r3.f10328q7), "1.0/mediate", kVar);
    }

    public static String b(com.applovin.impl.sdk.k kVar) {
        return r0.a((String) kVar.a(r3.f10326p7), "1.0/mediate", kVar);
    }

    public static void d(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers")) {
            p5.a(jSONObject, kVar);
        }
    }

    public static void e(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject.length() == 0) {
            return;
        }
        if (!JsonUtils.valueExists(jSONObject, "auto_init_adapters") && !JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
            kVar.c(z4.G);
            return;
        }
        JSONObject jSONObjectShallowCopy = JsonUtils.shallowCopy(jSONObject);
        JsonUtils.removeObjectsForKeys(jSONObjectShallowCopy, f9236f);
        kVar.b(z4.G, jSONObjectShallowCopy.toString());
    }

    public static void f(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject jSONObjectShallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(jSONObjectShallowCopy, f9235e);
            kVar.b(z4.F, jSONObjectShallowCopy.toString());
            p5.a(jSONObjectShallowCopy);
        }
    }

    public static void g(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers") && JsonUtils.valueExists(jSONObject, "signal_providers")) {
            try {
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    hashSet.add(JsonUtils.getString(jSONArray.getJSONObject(i10), "name", null));
                }
                HashSet hashSet2 = new HashSet();
                JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
                Iterator it = JsonUtils.toList(jSONObject2.names()).iterator();
                while (it.hasNext()) {
                    hashSet2.addAll(JsonUtils.getList(jSONObject2, (String) it.next(), null));
                }
                if (hashSet.equals(hashSet2)) {
                    return;
                }
                Set differenceSet = CollectionUtils.getDifferenceSet(hashSet, hashSet2);
                com.applovin.impl.sdk.o.h("MediationConnectionUtils", "\"signal_providers\" contains extra network(s): " + differenceSet);
                Set differenceSet2 = CollectionUtils.getDifferenceSet(hashSet2, hashSet);
                com.applovin.impl.sdk.o.h("MediationConnectionUtils", "\"ad_unit_signal_providers\" contains extra network(s): " + differenceSet2);
                kVar.D().a(d2.f8560a1, "signalProvidersMismatch", CollectionUtils.hashMap("details", "extraSignalProviderNetworks=" + differenceSet + ",extraAdUnitSignalProviderNetworks=" + differenceSet2));
                l1.a("Networks within \"signal_providers\" and \"ad_unit_signal_providers\" do not match.", new Object[0]);
            } catch (JSONException e10) {
                com.applovin.impl.sdk.o.c("MediationConnectionUtils", "Failed to parse JSON", e10);
                kVar.D().a("MediationConnectionUtils", "verifyBidderNetworksMatchFromJson", e10);
                l1.a((Throwable) e10, "Failed to parse JSON in verifyBidderNetworksMatchFromJson", new Object[0]);
            }
        }
    }

    public static String h(com.applovin.impl.sdk.k kVar) {
        x4 x4Var = r3.C8;
        return r0.a((String) kVar.a(((Boolean) kVar.a(x4Var)).booleanValue() ? r3.B8 : r3.f10328q7), ((Boolean) kVar.a(x4Var)).booleanValue() ? "2.0/mediate_debug" : "1.0/mediate_debug", kVar);
    }

    public static String i(com.applovin.impl.sdk.k kVar) {
        x4 x4Var = r3.C8;
        return r0.a((String) kVar.a(((Boolean) kVar.a(x4Var)).booleanValue() ? r3.A8 : r3.f10326p7), ((Boolean) kVar.a(x4Var)).booleanValue() ? "2.0/mediate_debug" : "1.0/mediate_debug", kVar);
    }
}
