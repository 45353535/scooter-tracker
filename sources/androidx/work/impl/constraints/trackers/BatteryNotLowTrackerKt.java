package androidx.work.impl.constraints.trackers;

import androidx.work.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "TAG", "Ljava/lang/String;", "", "BATTERY_LOW_THRESHOLD", "F", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BatteryNotLowTrackerKt {
    public static final float BATTERY_LOW_THRESHOLD = 0.15f;

    @NotNull
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("BatteryNotLowTracker");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        TAG = strTagWithPrefix;
    }
}
