package com.appodeal.ads.adapters.admobmediation;

import android.os.Bundle;
import com.appodeal.ads.adapters.admobmediation.customevent.c;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.utils.Log;
import com.google.android.gms.ads.AdapterResponseInfo;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final ImpressionLevelData a(ResponseInfo responseInfo) {
        Intrinsics.checkNotNullParameter(responseInfo, "<this>");
        try {
            if (!Intrinsics.areEqual("com.appodeal.ads.adapters.admobmediation.AppodealCustomEvent", responseInfo.getMediationAdapterClassName())) {
                List<AdapterResponseInfo> adapterResponses = responseInfo.getAdapterResponses();
                Intrinsics.checkNotNullExpressionValue(adapterResponses, "getAdapterResponses(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj : adapterResponses) {
                    if (((AdapterResponseInfo) obj).getAdError() != null) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Bundle credentials = ((AdapterResponseInfo) it.next()).getCredentials();
                    Intrinsics.checkNotNullExpressionValue(credentials, "getCredentials(...)");
                    Intrinsics.checkNotNullParameter(credentials, "<this>");
                    String string = credentials.getString(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                    Double dA = string == null ? null : c.a(new JSONObject(string).opt("appodeal_pf"));
                    if (dA != null) {
                        arrayList2.add(dA);
                    }
                }
                Double d10 = (Double) CollectionsKt.lastOrNull((List) arrayList2);
                if (d10 != null) {
                    double dDoubleValue = d10.doubleValue();
                    Double dValueOf = Double.valueOf(dDoubleValue);
                    Double dValueOf2 = Double.valueOf(dDoubleValue / ((double) 1000.0f));
                    AdapterResponseInfo loadedAdapterResponseInfo = responseInfo.getLoadedAdapterResponseInfo();
                    return new ImpressionLevelData(null, dValueOf, dValueOf2, null, null, loadedAdapterResponseInfo != null ? loadedAdapterResponseInfo.getAdSourceName() : null, null, false, 89, null);
                }
            }
            return null;
        } catch (Exception e10) {
            Log.log(e10);
            return null;
        }
    }
}
