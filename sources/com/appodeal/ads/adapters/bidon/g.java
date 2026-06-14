package com.appodeal.ads.adapters.bidon;

import android.os.Handler;
import android.os.Looper;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import hg.l0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.bidon.sdk.BidonSdk;
import org.bidon.sdk.config.InitializationCallback;
import org.bidon.sdk.regulation.Coppa;
import org.bidon.sdk.regulation.Gdpr;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MutableStateFlow f12129a = l0.a(CollectionsKt.emptyList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f12130b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f12131c = new AtomicBoolean(false);

    public static final void a() {
        d();
    }

    public static void b(RestrictedData restrictedData) {
        Intrinsics.checkNotNullParameter(restrictedData, "restrictedData");
        if (restrictedData.isUserInGdprScope()) {
            BidonSdk.getRegulation().setGdpr(restrictedData.isUserHasConsent() ? Gdpr.Applies : Gdpr.DoesNotApply);
            BidonSdk.getRegulation().setGdprConsentString(restrictedData.getIabConsentString());
        }
        if (restrictedData.isUserInCcpaScope()) {
            BidonSdk.getRegulation().setUsPrivacyString(restrictedData.getUSPrivacyString());
        }
        BidonSdk.getRegulation().setCoppa(restrictedData.isUserAgeRestricted() ? Coppa.Yes : Coppa.No);
    }

    public static void c(ContextProvider contextProvider, d dVar, AdNetworkMediationParams adNetworkMediationParams) {
        LogExtKt.logInternal$default("BidonInitializer", "Init started. segmentId=" + adNetworkMediationParams.getSegmentId() + ", sessionId=" + adNetworkMediationParams.getSessionId() + ", framework=" + adNetworkMediationParams.getFramework() + ", frameworkVersion=" + adNetworkMediationParams.getFrameworkVersion(), null, 4, null);
        BidonSdk.addExtra("appodeal_segment_id", Long.valueOf(adNetworkMediationParams.getSegmentId()));
        BidonSdk.addExtra("appodeal_session_id", adNetworkMediationParams.getSessionId());
        BidonSdk.addExtra("appodeal_token", adNetworkMediationParams.getToken());
        JSONObject jSONObjectC = dVar.c();
        String ifa = adNetworkMediationParams.getRestrictedData().getIfa();
        Intrinsics.checkNotNullExpressionValue(ifa, "getIfa(...)");
        BidonSdk.addExtra("ext", com.appodeal.ads.adapters.bidon.ext.f.i(jSONObjectC, ifa));
        String framework = adNetworkMediationParams.getFramework();
        if (framework != null) {
            BidonSdk.setFramework(framework);
        }
        String frameworkVersion = adNetworkMediationParams.getFrameworkVersion();
        if (frameworkVersion != null) {
            BidonSdk.setFrameworkVersion(frameworkVersion);
        }
        String strB = dVar.b();
        if (strB == null) {
            strB = "https://b.appbaqend.com";
        }
        BidonSdk.setBaseUrl(strB);
        BidonSdk.registerAdapter("com.appodeal.ads.adapters.bidonmediation.AdmobCustomAdapter");
        BidonSdk.registerDefaultAdapters();
        BidonSdk.setInitializationCallback(new InitializationCallback() { // from class: com.appodeal.ads.adapters.bidon.e
            @Override // org.bidon.sdk.config.InitializationCallback
            public final void onFinished() {
                g.a();
            }
        });
        BidonSdk.initialize(contextProvider.getApplicationContext(), dVar.a());
    }

    public static void d() {
        f12131c.set(true);
        f12130b.set(false);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appodeal.ads.adapters.bidon.f
            @Override // java.lang.Runnable
            public final void run() {
                g.e();
            }
        });
    }

    public static final void e() {
        Object value;
        MutableStateFlow mutableStateFlow = f12129a;
        do {
            value = mutableStateFlow.getValue();
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((Function0) it.next()).invoke();
            }
        } while (!mutableStateFlow.b(value, CollectionsKt.emptyList()));
    }
}
