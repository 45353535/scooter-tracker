package io.sentry;

import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum g7 implements d2 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g7 a(m3 m3Var, ILogger iLogger) {
            return g7.valueOf(m3Var.nextString().toUpperCase(Locale.ROOT));
        }
    }

    @Override // io.sentry.d2
    public void serialize(@NotNull n3 n3Var, @NotNull ILogger iLogger) throws IOException {
        n3Var.a(name().toLowerCase(Locale.ROOT));
    }
}
