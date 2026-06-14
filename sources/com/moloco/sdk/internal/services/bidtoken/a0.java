package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.internal.MolocoLogger;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a0 {
    public static final boolean a(com.moloco.sdk.internal.bidtoken.a aVar, long j10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        long millis = TimeUnit.SECONDS.toMillis(aVar.a());
        long millis2 = TimeUnit.MINUTES.toMillis(2L);
        boolean z10 = j10 >= millis - millis2;
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ServerBidTokenCache", "[sbt] currentTimeInMillis: " + j10 + ", expirationTimeMillis: " + millis + ", expiredThresholdMillis: " + millis2 + ", expired: " + z10, false, 4, null);
        return z10;
    }

    public static final boolean b(com.moloco.sdk.internal.bidtoken.a aVar, long j10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        long millis = TimeUnit.SECONDS.toMillis(aVar.a());
        long millis2 = TimeUnit.MINUTES.toMillis(15L);
        boolean z10 = !a(aVar, j10) && millis - j10 <= millis2;
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ServerBidTokenCache", "[sbt] currentTimeInMillis: " + j10 + ", expiryTimeMillis: " + millis + ", nearExpiryThresholdMillis: " + millis2 + ", expiring: " + z10, false, 4, null);
        return z10;
    }
}
