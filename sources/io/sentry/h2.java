package io.sentry;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface h2 {

    public enum a implements h2 {
        NANOSECOND,
        MICROSECOND,
        MILLISECOND,
        SECOND,
        MINUTE,
        HOUR,
        DAY,
        WEEK;

        @Override // io.sentry.h2
        @NotNull
        public String apiName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    String apiName();
}
