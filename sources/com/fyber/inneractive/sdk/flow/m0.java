package com.fyber.inneractive.sdk.flow;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f20770a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p0 p0Var, long j10) {
        super(j10, 1000L);
        this.f20770a = p0Var;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        m0 m0Var = this.f20770a.f20866v;
        if (m0Var != null) {
            m0Var.cancel();
        }
        this.f20770a.d(false);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
        int i10 = ((int) j10) / 1000;
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f20770a.f20855k;
        if (eVar != null) {
            eVar.updateCloseCountdown(i10);
        }
    }
}
