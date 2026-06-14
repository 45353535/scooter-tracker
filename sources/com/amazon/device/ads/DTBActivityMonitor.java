package com.amazon.device.ads;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/device/ads/DTBActivityMonitor;", "", "<init>", "()V", "setActivity", "", "activity", "Landroid/app/Activity;", "amazon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DTBActivityMonitor {

    @NotNull
    public static final DTBActivityMonitor INSTANCE = new DTBActivityMonitor();

    private DTBActivityMonitor() {
    }

    public final void setActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ActivityMonitor activityMonitor = ActivityMonitor.getInstance();
        if (activityMonitor == null || activityMonitor.getCurrentActivity() != null) {
            return;
        }
        LogExtKt.logInfo("DTBActivityMonitor", "Setting activity to DTBActivityMonitor");
        activityMonitor.onActivityResumed(activity);
    }
}
