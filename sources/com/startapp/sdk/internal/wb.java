package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes11.dex */
public final class wb extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zb f65470a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(zb zbVar, Looper looper) {
        super(looper);
        this.f65470a = zbVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        xb[] xbVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        zb zbVar = this.f65470a;
        while (true) {
            synchronized (zbVar.f65689b) {
                try {
                    size = zbVar.f65691d.size();
                    if (size <= 0) {
                        return;
                    }
                    xbVarArr = new xb[size];
                    zbVar.f65691d.toArray(xbVarArr);
                    zbVar.f65691d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                xb xbVar = xbVarArr[i10];
                for (int i11 = 0; i11 < xbVar.f65541b.size(); i11++) {
                    BroadcastReceiver broadcastReceiver = ((yb) xbVar.f65541b.get(i11)).f65601b;
                    if (broadcastReceiver != null) {
                        broadcastReceiver.onReceive(zbVar.f65688a, xbVar.f65540a);
                    }
                }
            }
        }
    }
}
