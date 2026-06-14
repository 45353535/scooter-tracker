package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5380ql implements FunctionWithThrowable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5404rl f78092a;

    public C5380ql(C5404rl c5404rl) {
        this.f78092a = c5404rl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        C5404rl c5404rl = this.f78092a;
        if (c5404rl.f78169b.hasPermission(c5404rl.f78168a, "android.permission.READ_PHONE_STATE")) {
            return Boolean.valueOf(telephonyManager.isNetworkRoaming());
        }
        return null;
    }
}
