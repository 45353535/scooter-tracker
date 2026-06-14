package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.an, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4973an extends U2 {
    public C4973an(int i10, @NonNull String str) {
        this(i10, str, PublicLogger.getAnonymousInstance());
    }

    @VisibleForTesting(otherwise = 3)
    public final int b() {
        return this.f76544a;
    }

    public C4973an(int i10, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i10, str, publicLogger);
    }

    @Override // io.appmetrica.analytics.impl.Nn
    @Nullable
    public final String a(@Nullable String str) {
        if (str != null) {
            int length = str.length();
            int i10 = this.f76544a;
            if (length > i10) {
                String strSubstring = str.substring(0, i10);
                this.f76546c.warning("\"%s\" %s size exceeded limit of %d characters", this.f76545b, str, Integer.valueOf(this.f76544a));
                return strSubstring;
            }
        }
        return str;
    }

    @NonNull
    @VisibleForTesting(otherwise = 3)
    public final String a() {
        return this.f76545b;
    }
}
