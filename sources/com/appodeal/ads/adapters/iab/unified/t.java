package com.appodeal.ads.adapters.iab.unified;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.appodeal.ads.networking.LoadingError;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f12295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12296b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Looper looper, u uVar, Context context) {
        super(looper);
        this.f12295a = uVar;
        this.f12296b = context;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        u uVar = this.f12295a;
        int i10 = message.what;
        if (i10 == 0) {
            uVar.b((LoadingError) message.obj);
        } else {
            if (i10 != 1) {
                return;
            }
            uVar.a(this.f12296b, message.obj);
        }
    }
}
