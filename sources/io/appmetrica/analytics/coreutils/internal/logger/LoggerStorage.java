package io.appmetrica.analytics.coreutils.internal.logger;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public abstract class LoggerStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap f75260a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f75261b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile PublicLogger f75262c = PublicLogger.getAnonymousInstance();

    @NonNull
    public static PublicLogger getMainPublicOrAnonymousLogger() {
        return f75262c;
    }

    @NonNull
    public static PublicLogger getOrCreateMainPublicLogger(@NonNull String str) {
        f75262c = getOrCreatePublicLogger(str);
        return f75262c;
    }

    @NonNull
    public static PublicLogger getOrCreatePublicLogger(@Nullable String str) {
        PublicLogger publicLogger;
        if (TextUtils.isEmpty(str)) {
            return PublicLogger.getAnonymousInstance();
        }
        PublicLogger publicLogger2 = (PublicLogger) f75260a.get(str);
        if (publicLogger2 != null) {
            return publicLogger2;
        }
        synchronized (f75261b) {
            try {
                publicLogger = (PublicLogger) f75260a.get(str);
                if (publicLogger == null) {
                    publicLogger = new PublicLogger(ApiKeyUtils.createPartialApiKey(str));
                    f75260a.put(str, publicLogger);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return publicLogger;
    }

    @VisibleForTesting(otherwise = 5)
    public static void unsetPublicLoggers() {
        f75260a = new HashMap();
        f75262c = PublicLogger.getAnonymousInstance();
    }
}
