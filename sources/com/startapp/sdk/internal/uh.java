package com.startapp.sdk.internal;

import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public final class uh extends vh {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final th f65352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yh f65353e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh(yh yhVar, TelephonyManager telephonyManager, Class cls) {
        super(yhVar, telephonyManager, cls);
        this.f65353e = yhVar;
        this.f65352d = new th(this);
    }

    @Override // com.startapp.sdk.internal.vh
    public final void a() {
        this.f65405a.registerTelephonyCallback((Executor) this.f65353e.f65611b.a(), this.f65352d);
    }

    @Override // com.startapp.sdk.internal.vh
    public final void b() {
        this.f65405a.unregisterTelephonyCallback(this.f65352d);
    }
}
