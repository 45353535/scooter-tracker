package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum c implements d2 {
    DomContentLoaded,
    Load,
    FullSnapshot,
    IncrementalSnapshot,
    Meta,
    Custom,
    Plugin;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(m3 m3Var, ILogger iLogger) {
            return c.values()[m3Var.nextInt()];
        }
    }

    @Override // io.sentry.d2
    public void serialize(@NotNull n3 n3Var, @NotNull ILogger iLogger) throws IOException {
        n3Var.b(ordinal());
    }
}
