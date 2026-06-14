package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public class Y extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiAdRequestStatus f38017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f38018b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(InMobiAdRequestStatus status, V adFetchError) {
        super(status.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String());
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(adFetchError, "adFetchError");
        this.f38017a = status;
        this.f38018b = adFetchError;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "AdFetchFailureException(statusCode=" + this.f38017a.getStatusCode() + ", statusMessage=" + this.f38017a.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String() + ", adFetchError=" + this.f38018b + ")";
    }
}
