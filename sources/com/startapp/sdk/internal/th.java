package com.startapp.sdk.internal;

import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyCallback;

/* JADX INFO: loaded from: classes11.dex */
public final class th extends TelephonyCallback implements TelephonyCallback.ServiceStateListener, TelephonyCallback.SignalStrengthsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uh f65323a;

    public th(uh uhVar) {
        this.f65323a = uhVar;
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        this.f65323a.a(ServiceState.class, serviceState);
    }

    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        this.f65323a.f65353e.a(signalStrength);
        this.f65323a.a(SignalStrength.class, signalStrength);
    }
}
