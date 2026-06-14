package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.my.target.common.menu.MenuActionType;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.taurusx.tax.y.z.w.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\tJ\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/vungle/ads/internal/util/HandlerScheduler;", "", "()V", "handler", "Landroid/os/Handler;", "calculateTime", "", POBCTAOverlayData.KEY_CTA_DELAY, MenuActionType.CANCEL, "", s.z.f67720z, "", "cancelAll", "schedule", "runnable", "Ljava/lang/Runnable;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class HandlerScheduler {

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    private final long calculateTime(long delay) {
        return SystemClock.uptimeMillis() + delay;
    }

    public final void cancel(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.handler.removeCallbacksAndMessages(tag);
    }

    public final void cancelAll() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public final void schedule(@NotNull Runnable runnable, @NotNull String tag, long delay) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.handler.postAtTime(runnable, tag, calculateTime(delay));
    }

    public final void schedule(@NotNull Runnable runnable, long delay) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.handler.postAtTime(runnable, calculateTime(delay));
    }
}
