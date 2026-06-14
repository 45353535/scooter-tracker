package yd;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {
    public a() {
        HandlerThread handlerThread = new HandlerThread("BackgroundHandlerTaskManager");
        handlerThread.start();
        super(new Handler(handlerThread.getLooper()));
    }
}
