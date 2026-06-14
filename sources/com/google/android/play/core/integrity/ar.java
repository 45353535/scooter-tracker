package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes9.dex */
final class ar extends ResultReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ as f28659b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(as asVar, Handler handler) {
        super(handler);
        this.f28659b = asVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        if (i10 == 1) {
            this.f28659b.f28663e.trySetResult(3);
        } else if (i10 == 2) {
            this.f28659b.f28663e.trySetResult(2);
        } else {
            if (i10 != 3) {
                return;
            }
            this.f28659b.f28663e.trySetResult(1);
        }
    }
}
