package com.startapp.sdk.internal;

import android.telephony.TelephonyManager$CellInfoCallback;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class nh extends TelephonyManager$CellInfoCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ph f64967a;

    public nh(ph phVar) {
        this.f64967a = phVar;
    }

    public final void onCellInfo(List list) {
        this.f64967a.b(false);
    }
}
