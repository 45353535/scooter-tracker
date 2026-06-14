package com.startapp.sdk.internal;

import android.content.Intent;
import android.os.RemoteException;
import com.startapp.sdk.ads.list3d.List3DActivity;

/* JADX INFO: loaded from: classes11.dex */
public final class ob implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DActivity f65014a;

    public ob(List3DActivity list3DActivity) {
        this.f65014a = list3DActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f65014a.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } catch (Throwable th2) {
            if (vi.a(th2, RemoteException.class)) {
                return;
            }
            g9.a(th2);
        }
    }
}
