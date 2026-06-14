package com.appsflyer.exceptions;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/appsflyer/exceptions/WrongProductTypeException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", NotificationCompat.CATEGORY_MESSAGE, "", "(Ljava/lang/String;)V", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WrongProductTypeException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongProductTypeException(@NotNull String msg) {
        super(msg);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }
}
