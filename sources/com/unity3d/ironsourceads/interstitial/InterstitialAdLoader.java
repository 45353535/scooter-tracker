package com.unity3d.ironsourceads.interstitial;

import com.ironsource.C4333gc;
import com.ironsource.C4636y9;
import com.ironsource.Cb;
import com.ironsource.InterfaceC4655zb;
import com.ironsource.S7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoader;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class InterstitialAdLoader {

    @NotNull
    public static final InterstitialAdLoader INSTANCE = new InterstitialAdLoader();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Executor f67833a = S7.f41731a.c();

    private InterstitialAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4655zb loadTask) {
        Intrinsics.checkNotNullParameter(loadTask, "$loadTask");
        loadTask.start();
    }

    public static final void loadAd(@NotNull InterstitialAdRequest adRequest, @NotNull InterstitialAdLoaderListener listener) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("instanceId: " + adRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(f67833a, new C4636y9(adRequest, listener, C4333gc.f43184e.a(IronSource.a.INTERSTITIAL), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(@NotNull Executor executor, @NotNull Cb loadTaskProvider) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(loadTaskProvider, "loadTaskProvider");
        final InterfaceC4655zb interfaceC4655zbA = loadTaskProvider.a();
        executor.execute(new Runnable() { // from class: g6.a
            @Override // java.lang.Runnable
            public final void run() {
                InterstitialAdLoader.a(interfaceC4655zbA);
            }
        });
    }
}
