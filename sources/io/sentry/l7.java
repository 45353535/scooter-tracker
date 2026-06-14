package io.sentry;

import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum l7 implements d2 {
    TRACE(1),
    DEBUG(5),
    INFO(9),
    WARN(13),
    ERROR(17),
    FATAL(21);

    private final int severityNumber;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l7 a(m3 m3Var, ILogger iLogger) {
            return l7.valueOf(m3Var.nextString().toUpperCase(Locale.ROOT));
        }
    }

    l7(int i10) {
        this.severityNumber = i10;
    }

    public int getSeverityNumber() {
        return this.severityNumber;
    }

    @Override // io.sentry.d2
    public void serialize(@NotNull n3 n3Var, @NotNull ILogger iLogger) throws IOException {
        n3Var.a(name().toLowerCase(Locale.ROOT));
    }
}
