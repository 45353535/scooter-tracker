package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class W5 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, Lc> f41943a;

    public W5(Looper looper) {
        super(looper);
        this.f41943a = new ConcurrentHashMap<>();
    }

    private boolean a(int i10) {
        return i10 == 1016 || i10 == 1015;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            C4652z8 c4652z8 = (C4652z8) message.obj;
            String path = c4652z8.getPath();
            Lc lc2 = this.f41943a.get(path);
            if (lc2 == null) {
                return;
            }
            if (a(message.what)) {
                lc2.a(c4652z8);
            } else {
                int i10 = message.what;
                lc2.a(c4652z8, new C4516r8(i10, Zf.a(i10)));
            }
            this.f41943a.remove(path);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    void a(String str, Lc lc2) {
        if (str == null || lc2 == null) {
            return;
        }
        this.f41943a.put(str, lc2);
    }
}
