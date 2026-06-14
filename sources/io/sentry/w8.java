package io.sentry;

import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public enum w8 implements d2 {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public w8 a(m3 m3Var, ILogger iLogger) {
            return w8.valueOf(m3Var.nextString().toUpperCase(Locale.ROOT));
        }
    }

    w8(int i10) {
        this.minHttpStatusCode = i10;
        this.maxHttpStatusCode = i10;
    }

    @Nullable
    public static w8 fromApiNameSafely(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    public static w8 fromHttpStatusCode(int i10) {
        for (w8 w8Var : values()) {
            if (w8Var.matches(i10)) {
                return w8Var;
            }
        }
        return null;
    }

    private boolean matches(int i10) {
        return i10 >= this.minHttpStatusCode && i10 <= this.maxHttpStatusCode;
    }

    @NotNull
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override // io.sentry.d2
    public void serialize(@NotNull n3 n3Var, @NotNull ILogger iLogger) throws IOException {
        n3Var.a(apiName());
    }

    @NotNull
    public static w8 fromHttpStatusCode(@Nullable Integer num, @NotNull w8 w8Var) {
        w8 w8VarFromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : w8Var;
        return w8VarFromHttpStatusCode != null ? w8VarFromHttpStatusCode : w8Var;
    }

    w8(int i10, int i11) {
        this.minHttpStatusCode = i10;
        this.maxHttpStatusCode = i11;
    }
}
