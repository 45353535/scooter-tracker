package com.mobilefuse.sdk.telemetry.loggers;

import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/loggers/TelemetryDebouncer;", "", POBCTAOverlayData.KEY_CTA_DELAY, "", "(J)V", "timer", "Ljava/util/Timer;", "debounce", "", "callback", "Lkotlin/Function0;", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final class TelemetryDebouncer {
    private final long delay;
    private Timer timer;

    public TelemetryDebouncer(long j10) {
        this.delay = j10;
    }

    public final void debounce(@NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        timer2.schedule(new TimerTask() { // from class: com.mobilefuse.sdk.telemetry.loggers.TelemetryDebouncer$debounce$$inlined$apply$lambda$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                callback.invoke();
            }
        }, this.delay);
        Unit unit = Unit.f93236a;
        this.timer = timer2;
    }
}
