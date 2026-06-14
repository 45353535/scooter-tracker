package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.Context;
import io.appmetrica.analytics.internal.PreloadInfoContentProvider;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5511w3 implements G6 {
    @Override // io.appmetrica.analytics.impl.G6
    public final void a(@NotNull Context context) throws InterruptedException {
        CountDownLatch countDownLatch = H5.f75842a;
        if (countDownLatch != null) {
            countDownLatch.await(1L, TimeUnit.SECONDS);
            try {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) PreloadInfoContentProvider.class), 2, 1);
                PreloadInfoContentProvider preloadInfoContentProvider = H5.f75843b;
                if (preloadInfoContentProvider != null) {
                    preloadInfoContentProvider.disable();
                }
            } catch (Throwable unused) {
            }
            H5.f75842a = null;
        }
    }
}
