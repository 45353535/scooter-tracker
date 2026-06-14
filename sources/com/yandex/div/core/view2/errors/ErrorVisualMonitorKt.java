package com.yandex.div.core.view2.errors;

import android.os.TransactionTooLargeException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0007\u001a\u00020\u0004*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"", "", "causedByTransactionTooLargeException", "(Ljava/lang/Throwable;)Z", "", "getFullStackMessage", "(Ljava/lang/Throwable;)Ljava/lang/String;", "fullStackMessage", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ErrorVisualMonitorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean causedByTransactionTooLargeException(Throwable th2) {
        Throwable cause;
        return (th2 instanceof TransactionTooLargeException) || ((cause = th2.getCause()) != null && causedByTransactionTooLargeException(cause));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getFullStackMessage(Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(th2.getMessage());
        for (Throwable cause = th2.getCause(); cause != null; cause = cause.getCause()) {
            sb2.append('\n');
            sb2.append(cause.getMessage());
        }
        return sb2.toString();
    }
}
