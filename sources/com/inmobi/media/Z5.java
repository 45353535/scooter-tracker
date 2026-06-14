package com.inmobi.media;

import androidx.media3.common.PlaybackException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class Z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Z5[] f38096a;

    static {
        Z5[] z5Arr = {new Z5(0, -100, "PING_V2_DISABLED", "Ping V2 is disabled from SDK config"), new Z5(1, -101, "PING_ID_MISSING", "Ping ID is missing"), new Z5(2, PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED, "PING_URL_INVALID", "Ping url is invalid"), new Z5(3, PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED, "PING_URL_MISSING", "Ping URL is missing"), new Z5(4, PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT, "PING_JSON_INVALID", "Ping JSON is invalid"), new Z5(5, PlaybackException.ERROR_CODE_PARENTAL_CONTROL_RESTRICTED, "PING_ARRAY_EMPTY", "Ping array is empty"), new Z5(6, PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION, "PING_UNKNOWN_RESPONSE", "Ping response is unknown"), new Z5(7, PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED, "PING_EXCEPTION", "Ping exception occurred")};
        f38096a = z5Arr;
        qf.a.a(z5Arr);
    }

    public Z5(int i10, int i11, String str, String str2) {
    }

    public static Z5 valueOf(String str) {
        return (Z5) Enum.valueOf(Z5.class, str);
    }

    public static Z5[] values() {
        return (Z5[]) f38096a.clone();
    }
}
