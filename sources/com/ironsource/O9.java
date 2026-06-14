package com.ironsource;

import android.content.Context;
import com.ironsource.Ee;
import com.ironsource.V;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import java.util.ArrayList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class O9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final O9 f41513a = new O9();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C4330g9 f41514b = new C4330g9();

    public static final class a implements InitListener {
        a() {
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(@NotNull IronSourceError error) {
            Intrinsics.checkNotNullParameter(error, "error");
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
        }
    }

    private O9() {
    }

    public static final class b implements InterfaceC4385je {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f41515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4360i5 f41516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InitListener f41517c;

        b(Context context, C4360i5 c4360i5, InitListener initListener) {
            this.f41515a = context;
            this.f41516b = c4360i5;
            this.f41517c = initListener;
        }

        @Override // com.ironsource.InterfaceC4385je
        public void a(@NotNull C4284de sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            O9.f41513a.a(this.f41515a, sdkConfig.d(), this.f41516b, this.f41517c);
        }

        @Override // com.ironsource.InterfaceC4385je
        public void a(@NotNull C4318fe error) {
            Intrinsics.checkNotNullParameter(error, "error");
            O9.f41513a.a(this.f41517c, this.f41516b, error);
        }
    }

    public final void a(@NotNull final Context context, @NotNull final InitRequest initRequest, @NotNull final InitListener initializationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        IronLog.API.info("IronSourceAds.init() appkey: " + initRequest.getAppKey() + ", legacyAdFormats: " + initRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        f41514b.a(new Runnable() { // from class: com.ironsource.ti
            @Override // java.lang.Runnable
            public final void run() {
                O9.a(initRequest, context, initializationListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitRequest initRequest, Context context, InitListener initializationListener) {
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initializationListener, "$initializationListener");
        C4360i5 c4360i5 = new C4360i5();
        C4539se.f45413a.c(context, new C4419le(initRequest.getAppKey(), null, ArraysKt.toMutableList(f41514b.a(initRequest.getLegacyAdFormats())), 2, null), new b(context, c4360i5, initializationListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, Ee ee2, C4360i5 c4360i5, InitListener initListener) {
        String strT = com.ironsource.mediationsdk.r.m().t();
        Y8 y8G = ee2.g();
        Intrinsics.checkNotNullExpressionValue(y8G, "serverResponse.initialConfiguration");
        NetworkSettings networkSettingsB = ee2.l().b("IronSource");
        Intrinsics.checkNotNullExpressionValue(networkSettingsB, "serverResponse.providerS…s.IRONSOURCE_CONFIG_NAME)");
        JSONObject interstitialSettings = networkSettingsB.getInterstitialSettings();
        Intrinsics.checkNotNullExpressionValue(interstitialSettings, "networkSettings.interstitialSettings");
        y8G.a(new V.a(interstitialSettings));
        y8G.a(ConfigFile.getConfigFile().getPluginType());
        y8G.b(strT);
        new X(new C4453nc()).a(context, y8G, new a());
        a(ee2, c4360i5, initListener);
    }

    private final void a(Ee ee2, C4360i5 c4360i5, final InitListener initListener) {
        I1 i1E;
        C4645z1 c4645z1B = ee2.c().b();
        new Jb().a((c4645z1B == null || (i1E = c4645z1B.e()) == null) ? null : i1E.b(), true);
        String sessionId = com.ironsource.mediationsdk.r.m().t();
        C4333gc c4333gcA = C4333gc.f43184e.a();
        c4333gcA.a(ee2.l());
        c4333gcA.a(ee2.c());
        Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
        c4333gcA.a(sessionId);
        c4333gcA.g();
        long jA = C4360i5.a(c4360i5);
        C4330g9 c4330g9 = f41514b;
        Ee.a aVarI = ee2.i();
        Intrinsics.checkNotNullExpressionValue(aVarI, "serverResponse.origin");
        c4330g9.a(jA, aVarI);
        c4330g9.b(new Runnable() { // from class: com.ironsource.si
            @Override // java.lang.Runnable
            public final void run() {
                O9.a(initListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitListener initListener) {
        IronLog.CALLBACK.info("InitListener.onInitSuccess()");
        if (initListener != null) {
            initListener.onInitSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final InitListener initListener, C4360i5 c4360i5, final C4318fe c4318fe) {
        long jA = C4360i5.a(c4360i5);
        C4330g9 c4330g9 = f41514b;
        final C4318fe c4318feB = c4330g9.b(c4318fe);
        c4330g9.a(c4318feB, jA);
        c4330g9.b(new Runnable() { // from class: com.ironsource.ri
            @Override // java.lang.Runnable
            public final void run() {
                O9.a(c4318fe, initListener, c4318feB);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4318fe error, InitListener initListener, C4318fe eventError) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(eventError, "$eventError");
        IronLog.CALLBACK.info("InitListener.onInitFailed() error " + error);
        if (initListener != null) {
            initListener.onInitFailed(f41514b.a(eventError));
        }
    }

    public final void a(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(value);
        com.ironsource.mediationsdk.r.m().a(key, arrayList);
    }
}
