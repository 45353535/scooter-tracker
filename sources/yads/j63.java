package yads;

import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
public final class j63 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = k63.f112608i;
        if (handler != null) {
            handler.post(k63.f112609j);
            k63.f112608i.postDelayed(k63.f112610k, 200L);
        }
    }
}
