package androidx.test.internal.platform.util;

import androidx.test.internal.util.Checks;
import androidx.test.platform.app.InstrumentationRegistry;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class InstrumentationParameterUtil {
    public static long getTimeoutMillis(String str, long j10) {
        Checks.checkArgument(j10 != 0, "default timeout value cannot be zero");
        long j11 = Long.parseLong(InstrumentationRegistry.getArguments().getString(str, "0"));
        if (j11 != 0) {
            j10 = j11;
        }
        return j10 < 0 ? TimeUnit.DAYS.toMillis(1L) : j10;
    }
}
