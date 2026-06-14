package com.startapp.sdk.internal;

import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes11.dex */
public final class xh extends vh {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wh f65555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yh f65556e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(yh yhVar, TelephonyManager telephonyManager, Class cls) {
        super(yhVar, telephonyManager, cls);
        this.f65556e = yhVar;
        this.f65555d = new wh(this);
    }

    @Override // com.startapp.sdk.internal.vh
    public final void a() {
        this.f65405a.listen(this.f65555d, 257);
    }

    @Override // com.startapp.sdk.internal.vh
    public final void b() {
        this.f65405a.listen(this.f65555d, 0);
    }
}
