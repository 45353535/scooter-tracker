package com.unity3d.ironsourceads.banner;

import com.ironsource.C4290e3;
import com.ironsource.C4333gc;
import com.ironsource.Cb;
import com.ironsource.InterfaceC4655zb;
import com.ironsource.S7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.banner.BannerAdLoader;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BannerAdLoader {

    @NotNull
    public static final BannerAdLoader INSTANCE = new BannerAdLoader();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Executor f67799a = S7.f41731a.c();

    private BannerAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4655zb loadTask) {
        Intrinsics.checkNotNullParameter(loadTask, "$loadTask");
        loadTask.start();
    }

    public static final void loadAd(@NotNull BannerAdRequest adRequest, @NotNull BannerAdLoaderListener listener) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("instanceId: " + adRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(f67799a, new C4290e3(adRequest, listener, C4333gc.f43184e.a(IronSource.a.BANNER), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(@NotNull Executor executor, @NotNull Cb loadTaskProvider) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(loadTaskProvider, "loadTaskProvider");
        final InterfaceC4655zb interfaceC4655zbA = loadTaskProvider.a();
        executor.execute(new Runnable() { // from class: f6.a
            @Override // java.lang.Runnable
            public final void run() {
                BannerAdLoader.a(interfaceC4655zbA);
            }
        });
    }
}
