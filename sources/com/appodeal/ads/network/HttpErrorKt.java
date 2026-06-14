package com.appodeal.ads.network;

import com.appodeal.ads.network.HttpError;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"toHttpError", "Lcom/appodeal/ads/network/HttpError;", "", PglCryptUtils.KEY_MESSAGE, "", "network_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class HttpErrorKt {
    public static final HttpError toHttpError(Throwable th2, String message) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        return th2 instanceof HttpError ? (HttpError) th2 : new HttpError.UncaughtException(message, th2);
    }
}
