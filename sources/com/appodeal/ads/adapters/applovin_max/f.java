package com.appodeal.ads.adapters.applovin_max;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.appodeal.ads.ext.LogExtKt;
import hg.l0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f12005a = l0.a(CollectionsKt.emptyList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f12006b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f12007c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12008d;

    public static final void c(f fVar) {
        Object value;
        MutableStateFlow mutableStateFlow = fVar.f12005a;
        do {
            value = mutableStateFlow.getValue();
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((g) it.next()).f12009b.onInitializationFinished();
            }
        } while (!mutableStateFlow.b(value, CollectionsKt.emptyList()));
    }

    public static final void d(f fVar, AppLovinSdkConfiguration appLovinSdkConfiguration) {
        fVar.a();
    }

    public final void a() {
        this.f12007c.set(true);
        this.f12006b.set(false);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appodeal.ads.adapters.applovin_max.e
            @Override // java.lang.Runnable
            public final void run() {
                f.c(this.f11995b);
            }
        });
    }

    public final void b(Context context, c cVar) {
        String strD = cVar.d();
        AppLovinSdk appLovinSdk = AppLovinSdk.getInstance(context);
        AppLovinSdkInitializationConfiguration.Builder builder = AppLovinSdkInitializationConfiguration.builder(strD);
        builder.setMediationProvider(cVar.c());
        builder.setExceptionHandlerEnabled(false);
        builder.setAdUnitIds(cVar.a());
        AppLovinSdkSettings settings = appLovinSdk.getSettings();
        settings.setMuted(cVar.e());
        settings.setVerboseLogging(this.f12008d);
        settings.setCreativeDebuggerEnabled(false);
        for (Map.Entry entry : cVar.b().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            LogExtKt.logInternal$default("ApplovinMaxInitializer", "setExtraParameter: " + str + " : " + str2, null, 4, null);
            settings.setExtraParameter(str, str2);
        }
        appLovinSdk.initialize(builder.build(), new AppLovinSdk.SdkInitializationListener() { // from class: com.appodeal.ads.adapters.applovin_max.d
            @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
            public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
                f.d(this.f11994a, appLovinSdkConfiguration);
            }
        });
    }
}
