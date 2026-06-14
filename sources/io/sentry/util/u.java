package io.sentry.util;

import androidx.compose.material.TextFieldImplKt;
import io.sentry.ILogger;
import io.sentry.g7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {
    public static void a(Class cls, Object obj, ILogger iLogger) {
        iLogger.c(g7.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : TextFieldImplKt.PlaceholderId, cls.getCanonicalName());
    }
}
