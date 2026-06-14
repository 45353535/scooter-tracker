package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b6 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f8442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f8443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k3 f8444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f8445j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f8446k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f8447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final MaxError f8448m;

    public b6(String str, List list, Map map, Map map2, MaxError maxError, k3 k3Var, com.applovin.impl.sdk.k kVar, boolean z10) {
        super("TaskFireMediationPostbacks", kVar);
        this.f8442g = str + "_urls";
        this.f8443h = list;
        this.f8445j = n7.a(map, kVar);
        this.f8446k = map2 == null ? new HashMap() : map2;
        this.f8448m = maxError != null ? maxError : new MaxErrorImpl(-1);
        this.f8444i = k3Var;
        HashMap map3 = new HashMap(7);
        map3.put("AppLovin-Event-Type", str);
        if (z10 && k3Var != null) {
            map3.put("AppLovin-Ad-Network-Name", k3Var.c());
        }
        if (k3Var instanceof y2) {
            y2 y2Var = (y2) k3Var;
            map3.put("AppLovin-Ad-Unit-Id", y2Var.getAdUnitId());
            map3.put("AppLovin-Ad-Format", y2Var.getFormat().getLabel());
            if (z10) {
                map3.put("AppLovin-Third-Party-Ad-Placement-Id", y2Var.R());
            }
        }
        if (maxError != null) {
            map3.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            map3.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.f8447l = map3;
    }

    private void a(String str, Map map) {
        b().f0().e(com.applovin.impl.sdk.network.d.b().d(str).c("POST").a(this.f8447l).a(false).c(map).c(((Boolean) this.f9071a.a(r3.f10347z8)).booleanValue()).a());
    }

    private String b(String str, Map map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, StringUtils.emptyIfNull((String) map.get(str2)));
        }
        return str;
    }

    private Map e() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f9071a.a(r3.f10338v7)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private List f() {
        List list = this.f8443h;
        if (list != null) {
            return list;
        }
        k3 k3Var = this.f8444i;
        if (k3Var != null) {
            return k3Var.b(this.f8442g);
        }
        return null;
    }

    private h g() {
        k3 k3Var = this.f8444i;
        if (k3Var instanceof y2) {
            return ((y2) k3Var).N().f();
        }
        if (k3Var instanceof d5) {
            return ((d5) k3Var).u().f();
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        h hVarG;
        List listF = f();
        if (CollectionUtils.isEmpty(listF)) {
            return;
        }
        Map mapE = e();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            Uri uri = Uri.parse(a(b((String) it.next(), this.f8445j), this.f8448m));
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            HashMap map = new HashMap(this.f8446k);
            for (String str : uri.getQueryParameterNames()) {
                String queryParameter = uri.getQueryParameter(str);
                if (mapE.containsKey(queryParameter)) {
                    k3 k3Var = this.f8444i;
                    if (k3Var != null) {
                        map.put(str, k3Var.a((String) mapE.get(queryParameter)));
                    }
                } else {
                    builderClearQuery.appendQueryParameter(str, queryParameter);
                }
            }
            map.putAll(this.f9071a.A().e());
            if (((Boolean) this.f9071a.a(r3.f10333s8)).booleanValue() && (hVarG = g()) != null) {
                map.put("arn_info", hVarG.e());
            }
            a(builderClearQuery.build().toString(), map);
        }
    }

    private String a(String str, MaxError maxError) {
        int mediatedNetworkErrorCode;
        String mediatedNetworkErrorMessage;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            mediatedNetworkErrorCode = maxAdapterError.getMediatedNetworkErrorCode();
            mediatedNetworkErrorMessage = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            mediatedNetworkErrorCode = 0;
            mediatedNetworkErrorMessage = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(mediatedNetworkErrorCode)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(mediatedNetworkErrorMessage));
    }
}
