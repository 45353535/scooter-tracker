package com.unity3d.ironsourceads.rewarded;

import com.ironsource.C4333gc;
import com.ironsource.Cb;
import com.ironsource.InterfaceC4655zb;
import com.ironsource.Kd;
import com.ironsource.S7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoader;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class RewardedAdLoader {

    @NotNull
    public static final RewardedAdLoader INSTANCE = new RewardedAdLoader();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Executor f67846a = S7.f41731a.c();

    private RewardedAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4655zb loadTask) {
        Intrinsics.checkNotNullParameter(loadTask, "$loadTask");
        loadTask.start();
    }

    public static final void loadAd(@NotNull RewardedAdRequest adRequest, @NotNull RewardedAdLoaderListener listener) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("instanceId: " + adRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(f67846a, new Kd(adRequest, listener, C4333gc.f43184e.a(IronSource.a.REWARDED_VIDEO), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(@NotNull Executor executor, @NotNull Cb loadTaskProvider) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(loadTaskProvider, "loadTaskProvider");
        final InterfaceC4655zb interfaceC4655zbA = loadTaskProvider.a();
        executor.execute(new Runnable() { // from class: h6.a
            @Override // java.lang.Runnable
            public final void run() {
                RewardedAdLoader.a(interfaceC4655zbA);
            }
        });
    }
}
