package lg;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.util.concurrent.TimeUnit;
import jg.f0;
import jg.h0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f94283a = f0.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f94284b = h0.f("kotlinx.coroutines.scheduler.resolution.ns", SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f94285c = h0.e("kotlinx.coroutines.scheduler.core.pool.size", kotlin.ranges.g.e(f0.a(), 2), 1, 0, 8, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f94286d = h0.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f94287e = TimeUnit.SECONDS.toNanos(h0.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static g f94288f = e.f94274a;

    public static final h b(Runnable runnable, long j10, boolean z10) {
        return new i(runnable, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(boolean z10) {
        return z10 ? "Blocking" : "Non-blocking";
    }
}
