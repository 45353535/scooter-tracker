package com.yandex.div.core.dagger;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.internal.viewpool.ViewCreator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/dagger/DivKitModule;", "", "<init>", "()V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lx6/a;", "configuration", "Lx6/b;", "provideSendBeaconManager", "(Landroid/content/Context;Lx6/a;)Lx6/b;", "Lcom/yandex/div/histogram/CpuUsageHistogramReporter;", "cpuUsageHistogramReporter", "Lcom/yandex/div/internal/viewpool/ViewCreator;", "provideViewCreator", "(Lcom/yandex/div/histogram/CpuUsageHistogramReporter;)Lcom/yandex/div/internal/viewpool/ViewCreator;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivKitModule {

    @NotNull
    public static final DivKitModule INSTANCE = new DivKitModule();

    private DivKitModule() {
    }

    @Nullable
    public static final x6.b provideSendBeaconManager(@NotNull Context context, @Nullable x6.a configuration) {
        return null;
    }

    @NotNull
    public static final ViewCreator provideViewCreator(@NotNull CpuUsageHistogramReporter cpuUsageHistogramReporter) {
        return new ViewCreator(cpuUsageHistogramReporter);
    }
}
