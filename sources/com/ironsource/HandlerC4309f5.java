package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;

/* JADX INFO: renamed from: com.ironsource.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class HandlerC4309f5 extends Handler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f43086b = "DownloadHandler";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Lc f43087a;

    public HandlerC4309f5(Looper looper) {
        super(looper);
    }

    public void a(Lc lc2) {
        if (lc2 == null) {
            throw new IllegalArgumentException();
        }
        this.f43087a = lc2;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Lc lc2 = this.f43087a;
        if (lc2 == null) {
            Logger.i(f43086b, "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i10 = message.what;
            if (i10 == 1016) {
                lc2.a((C4652z8) message.obj);
            } else {
                this.f43087a.a((C4652z8) message.obj, new C4516r8(i10, Zf.a(i10)));
            }
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            Logger.i(f43086b, "handleMessage | Got exception: " + th2.getMessage());
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    public void a() {
        this.f43087a = null;
    }
}
