package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5355pl implements FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        return ((TelephonyManager) obj).getSimOperatorName();
    }
}
