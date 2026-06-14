package com.appodeal.ads;

import com.appodeal.ads.inapp.AppodealPurchaseListener;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.service.ConnectorCallback;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import com.appodeal.ads.modules.common.internal.service.model.PartnerParams;
import com.appodeal.ads.service.ServiceError;
import com.appodeal.ads.utils.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class p4 implements ConnectorCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.appodeal.ads.services.r f14269a;

    public p4() {
        com.appodeal.ads.services.r servicesSolution = (com.appodeal.ads.services.r) com.appodeal.ads.services.v.f14778a.getValue();
        Intrinsics.checkNotNullParameter(servicesSolution, "servicesSolution");
        this.f14269a = servicesSolution;
    }

    @Override // com.appodeal.ads.modules.common.internal.service.ConnectorCallback
    public final PartnerParams getPartnerParams() {
        String str;
        Object next;
        com.appodeal.ads.utils.session.e eVar;
        Iterator it = this.f14269a.d().iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ServiceData) next) instanceof ServiceData.Firebase) {
                break;
            }
        }
        ServiceData.Firebase firebase = next instanceof ServiceData.Firebase ? (ServiceData.Firebase) next : null;
        String keywordsAsString = firebase != null ? firebase.getKeywordsAsString() : null;
        String frameworkName = Appodeal.getFrameworkName();
        String engineVersion = Appodeal.getEngineVersion();
        String pluginVersion = Appodeal.getPluginVersion();
        String version = Appodeal.getVersion();
        String strValueOf = String.valueOf(Appodeal.getSegmentId());
        com.appodeal.ads.utils.session.f fVarF = com.appodeal.ads.utils.session.r.f15109b.f15110a.f();
        if (fVarF != null && (eVar = fVarF.f15074b) != null) {
            str = eVar.f15065b;
        }
        return new PartnerParams(frameworkName, engineVersion, pluginVersion, version, strValueOf, str, String.valueOf(v4.c()), keywordsAsString);
    }

    @Override // com.appodeal.ads.modules.common.internal.service.ConnectorCallback
    public final void onInAppFailed(Throwable error, List list) {
        Intrinsics.checkNotNullParameter(error, "error");
        Log.log(LogConstants.KEY_SDK, "onInAppFailed", String.valueOf(error.getMessage()));
        AppodealPurchaseListener appodealPurchaseListener = this.f14269a.f14727e;
        if (appodealPurchaseListener != null) {
            appodealPurchaseListener.onPurchaseFailed(error, list);
        }
    }

    @Override // com.appodeal.ads.modules.common.internal.service.ConnectorCallback
    public final void onInAppReceived(List successPurchases) {
        Intrinsics.checkNotNullParameter(successPurchases, "successPurchases");
        Log.log(LogConstants.KEY_SDK, "onInAppReceived", "success purchases: " + successPurchases);
        AppodealPurchaseListener appodealPurchaseListenerF = this.f14269a.f();
        if (appodealPurchaseListenerF != null) {
            appodealPurchaseListenerF.onPurchaseReceived(successPurchases);
        }
    }

    @Override // com.appodeal.ads.modules.common.internal.service.ConnectorCallback
    public final void onServiceDataError(ServiceError serviceError) {
        Intrinsics.checkNotNullParameter(serviceError, "serviceError");
        Log.log(serviceError);
    }

    @Override // com.appodeal.ads.modules.common.internal.service.ConnectorCallback
    public final void onServiceDataUpdated(ServiceData serviceData) {
        Intrinsics.checkNotNullParameter(serviceData, "serviceData");
        if (serviceData instanceof ServiceData.Adjust) {
            for (Map.Entry<String, Object> entry : ((ServiceData.Adjust) serviceData).getConversionData().entrySet()) {
                h2.s(entry.getKey(), entry.getValue());
            }
            return;
        }
        if (serviceData instanceof ServiceData.AppsFlyer) {
            for (Map.Entry<String, Object> entry2 : ((ServiceData.AppsFlyer) serviceData).getConversionData().entrySet()) {
                h2.s(entry2.getKey(), entry2.getValue());
            }
            return;
        }
        if (!(serviceData instanceof ServiceData.Firebase)) {
            if (!(serviceData instanceof ServiceData.FacebookAnalytics)) {
                throw new lf.m();
            }
            return;
        }
        ServiceData.Firebase firebase = (ServiceData.Firebase) serviceData;
        if (StringsKt.y0(firebase.getAppInstanceId())) {
            Log.log("FirebaseService", "appInstanceId is null or empty");
        }
        boolean z10 = h2.f13367a;
        h2.C("keywords", firebase.getKeywordsAsString());
    }
}
