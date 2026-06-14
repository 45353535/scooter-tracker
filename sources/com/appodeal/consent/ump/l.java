package com.appodeal.consent.ump;

import com.appodeal.consent.ConsentManagerError;
import com.google.android.ump.FormError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l {
    public static final ConsentManagerError a(FormError formError) {
        Intrinsics.checkNotNullParameter(formError, "<this>");
        int errorCode = formError.getErrorCode();
        if (errorCode == 2) {
            return new ConsentManagerError.RequestError("[UMP] FormError: " + formError.getMessage() + ". Code: " + formError.getErrorCode(), null, 2, null);
        }
        if (errorCode != 4) {
            return new ConsentManagerError.InternalError("[UMP] FormError: " + formError.getMessage() + ". Code: " + formError.getErrorCode(), null, 2, null);
        }
        return new ConsentManagerError.TimeoutError("[UMP] FormError: " + formError.getMessage() + ". Code: " + formError.getErrorCode());
    }
}
