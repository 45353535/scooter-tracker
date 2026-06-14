package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes11.dex */
public final class ec implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gc f64457a;

    public ec(gc gcVar) {
        this.f64457a = gcVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        gc gcVar = this.f64457a;
        synchronized (gcVar) {
            gcVar.f64566d = true;
            gcVar.notifyAll();
        }
        return true;
    }
}
