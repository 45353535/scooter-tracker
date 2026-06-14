package com.startapp.sdk.internal;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;

/* JADX INFO: loaded from: classes11.dex */
public final class wh extends PhoneStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xh f65479a;

    public wh(xh xhVar) {
        this.f65479a = xhVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        this.f65479a.a(ServiceState.class, serviceState);
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        this.f65479a.f65556e.a(signalStrength);
        this.f65479a.a(SignalStrength.class, signalStrength);
    }
}
