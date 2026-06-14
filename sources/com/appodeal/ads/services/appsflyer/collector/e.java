package com.appodeal.ads.services.appsflyer.collector;

import android.content.Context;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import com.appodeal.ads.service.ServiceError;
import com.appodeal.ads.services.appsflyer.h;
import com.appsflyer.AppsFlyerLib;
import eg.g;
import eg.o0;
import hg.c0;
import hg.l0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f14586a = l0.a(new ServiceData.AppsFlyer(new String(), MapsKt.emptyMap()));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableSharedFlow f14587b = c0.b(3, 0, null, 6, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14588c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function0 f14589d;

    public static final void b(e eVar, String str) {
        Object value;
        MutableStateFlow mutableStateFlow = eVar.f14586a;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value, new ServiceData.AppsFlyer(str, ((ServiceData.AppsFlyer) value).getConversionData())));
    }

    public static final void c(e eVar, Map map) {
        Object value;
        MutableStateFlow mutableStateFlow = eVar.f14586a;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value, new ServiceData.AppsFlyer(((ServiceData.AppsFlyer) value).getAttributionId(), map)));
    }

    public final Object a(Context context, h hVar) {
        LogExtKt.logInternal$default("AppsflyerService", "Launch readExternalAttributionData", null, 4, null);
        Object objG = g.g(o0.b(), new d(context, this, null), hVar);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    public final void d(AppsFlyerLib appsFlyer, Context context, String phase) {
        Object value;
        Intrinsics.checkNotNullParameter(appsFlyer, "appsFlyer");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(phase, "phase");
        String appsFlyerUID = appsFlyer.getAppsFlyerUID(context);
        if (appsFlyerUID != null && appsFlyerUID.length() != 0) {
            MutableStateFlow mutableStateFlow = this.f14586a;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.b(value, new ServiceData.AppsFlyer(appsFlyerUID, ((ServiceData.AppsFlyer) value).getConversionData())));
        } else {
            this.f14587b.g(new ServiceError.Appsflyer.AttributionError("AppsFlyerUID is null or empty: " + phase));
        }
    }

    public final void e(List conversionKeys, Function0 onInitialized) {
        Intrinsics.checkNotNullParameter(conversionKeys, "conversionKeys");
        Intrinsics.checkNotNullParameter(onInitialized, "onInitialized");
        this.f14588c.addAll(conversionKeys);
        this.f14589d = onInitialized;
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onAppOpenAttribution(Map map) {
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onAttributionFailure(String str) {
        this.f14587b.g(new ServiceError.Appsflyer.AttributionError("onAttributionFailure: " + str));
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onConversionDataFail(String str) {
        LogExtKt.logInternal$default("AppsflyerService", "Error while obtaining ConversionData " + str, null, 4, null);
        this.f14587b.g(new ServiceError.Appsflyer.ConversionDataError("onConversionDataFail: " + str));
        Function0 function0 = this.f14589d;
        if (function0 != null) {
            function0.invoke();
        }
        this.f14589d = null;
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onConversionDataSuccess(Map map) {
        Object value;
        LogExtKt.logInternal$default("AppsflyerService", "onConversionDataSuccess " + map, null, 4, null);
        if (map != null && !map.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (this.f14588c.isEmpty() || this.f14588c.contains(str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            MutableStateFlow mutableStateFlow = this.f14586a;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.b(value, new ServiceData.AppsFlyer(((ServiceData.AppsFlyer) value).getAttributionId(), linkedHashMap)));
        }
        Function0 function0 = this.f14589d;
        if (function0 != null) {
            function0.invoke();
        }
        this.f14589d = null;
    }

    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
    public final void onError(int i10, String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f14587b.g(new ServiceError.Appsflyer.InitializeError("Init error: " + i10 + ": " + description));
        LogExtKt.logInternal$default("AppsflyerService", "Launch failed to be sent, " + i10 + ": " + description, null, 4, null);
    }

    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
    public final void onSuccess() {
        LogExtKt.logInternal$default("AppsflyerService", "Launch sent successfully, got 200 response code from server", null, 4, null);
    }
}
