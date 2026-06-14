package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.time.Clock;
import com.google.firebase.installations.time.SystemClock;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public final class Utils {
    public static final long AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f32866b = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Utils f32867c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Clock f32868a;

    private Utils(Clock clock) {
        this.f32868a = clock;
    }

    static boolean a(String str) {
        return f32866b.matcher(str).matches();
    }

    static boolean b(String str) {
        return str.contains(StringUtils.PROCESS_POSTFIX_DELIMITER);
    }

    public static Utils getInstance() {
        return getInstance(SystemClock.getInstance());
    }

    public long currentTimeInMillis() {
        return this.f32868a.currentTimeMillis();
    }

    public long currentTimeInSecs() {
        return TimeUnit.MILLISECONDS.toSeconds(currentTimeInMillis());
    }

    public long getRandomDelayForSyncPrevention() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean isAuthTokenExpired(@NonNull PersistedInstallationEntry persistedInstallationEntry) {
        return TextUtils.isEmpty(persistedInstallationEntry.getAuthToken()) || persistedInstallationEntry.getTokenCreationEpochInSecs() + persistedInstallationEntry.getExpiresInSecs() < currentTimeInSecs() + AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS;
    }

    public static Utils getInstance(Clock clock) {
        if (f32867c == null) {
            f32867c = new Utils(clock);
        }
        return f32867c;
    }
}
