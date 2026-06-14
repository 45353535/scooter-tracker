package com.appodeal.ads.utils.exception_handler;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/appodeal/ads/utils/exception_handler/AppodealException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", PglCryptUtils.KEY_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppodealException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppodealException(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
