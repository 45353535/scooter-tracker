package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes12.dex */
public final class Ym extends U2 {
    public Ym(int i10, @NonNull String str) {
        this(i10, str, PublicLogger.getAnonymousInstance());
    }

    @VisibleForTesting(otherwise = 3)
    public final int b() {
        return this.f76544a;
    }

    public Ym(int i10, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i10, str, publicLogger);
    }

    @NonNull
    @VisibleForTesting(otherwise = 3)
    public final String a() {
        return this.f76545b;
    }

    @Override // io.appmetrica.analytics.impl.Nn
    @Nullable
    public final String a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            int i10 = this.f76544a;
            if (length <= i10) {
                return str;
            }
            String str2 = new String(bytes, 0, i10, "UTF-8");
            try {
                this.f76546c.warning("\"%s\" %s exceeded limit of %d bytes", this.f76545b, str, Integer.valueOf(this.f76544a));
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
