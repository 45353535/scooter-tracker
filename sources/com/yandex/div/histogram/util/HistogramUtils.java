package com.yandex.div.histogram.util;

import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/histogram/util/HistogramUtils;", "", "<init>", "()V", "", "callType", "Lcom/yandex/div/histogram/HistogramRecordConfiguration;", "configuration", "", "shouldRecordHistogram", "(Ljava/lang/String;Lcom/yandex/div/histogram/HistogramRecordConfiguration;)Z", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HistogramUtils {

    @NotNull
    public static final HistogramUtils INSTANCE = new HistogramUtils();

    private HistogramUtils() {
    }

    public final boolean shouldRecordHistogram(@NotNull String callType, @NotNull HistogramRecordConfiguration configuration) {
        int iHashCode = callType.hashCode();
        if (iHashCode != 2106116) {
            if (iHashCode != 2106217) {
                if (iHashCode == 2688677 && callType.equals("Warm")) {
                    return configuration.isWarmRecordingEnabled();
                }
            } else if (callType.equals("Cool")) {
                return configuration.isCoolRecordingEnabled();
            }
        } else if (callType.equals("Cold")) {
            return configuration.isColdRecordingEnabled();
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (!Assert.isEnabled()) {
            return false;
        }
        Assert.fail("Unknown histogram call type: " + callType);
        return false;
    }
}
