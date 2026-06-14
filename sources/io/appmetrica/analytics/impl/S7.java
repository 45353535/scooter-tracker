package io.appmetrica.analytics.impl;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class S7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f76406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5184j2 f76407b;

    public S7(U u10, C5184j2 c5184j2) {
        this.f76406a = u10;
        this.f76407b = c5184j2;
    }

    public final String a() {
        AdvertisingIdsHolder advertisingIdsHolder;
        byte[] bArrDigest;
        U u10 = this.f76406a;
        Ln ln = new Ln(5, 500);
        synchronized (u10) {
            try {
                u10.a((Li) ln, true).get();
            } catch (InterruptedException | ExecutionException unused) {
            }
            advertisingIdsHolder = u10.f76540k;
        }
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        if (!yandex.isValid()) {
            String id2 = this.f76407b.getAppSetId().getId();
            if (id2 != null && id2.length() != 0) {
                try {
                    UUID.fromString(id2);
                    if (!Intrinsics.areEqual(id2, "00000000-0000-0000-0000-000000000000")) {
                        return StringsKt.W(id2, TokenBuilder.TOKEN_DELIMITER, "", false, 4, null);
                    }
                } catch (Throwable unused2) {
                }
            }
            return StringsKt.W(UUID.randomUUID().toString(), TokenBuilder.TOKEN_DELIMITER, "", false, 4, null).toLowerCase(Locale.US);
        }
        AdTrackingInfo adTrackingInfo = yandex.mAdTrackingInfo;
        Intrinsics.checkNotNull(adTrackingInfo);
        String str = adTrackingInfo.advId;
        Intrinsics.checkNotNull(str);
        try {
            bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(Charsets.UTF_8));
        } catch (NoSuchAlgorithmException unused3) {
            bArrDigest = new byte[0];
        }
        return StringUtils.toHexString(bArrDigest);
    }

    public S7() {
        this(C5468ua.k().c(), C5468ua.k().d());
    }
}
