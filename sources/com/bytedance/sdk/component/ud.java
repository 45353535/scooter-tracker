package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import com.bytedance.sdk.component.qdl;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
public class ud {

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    @GuardedBy("sLock")
    private static volatile Handler f16688ud;
    private static final Object qdl = new Object();

    @GuardedBy("sLock")
    private static final LinkedList<Runnable> lnr = new LinkedList<>();
    private static Object mml = new Object();

    private static class qdl extends Handler {
        qdl(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    ud.lnr();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lnr() {
        LinkedList linkedList;
        synchronized (mml) {
            try {
                synchronized (qdl) {
                    LinkedList<Runnable> linkedList2 = lnr;
                    linkedList = (LinkedList) linkedList2.clone();
                    linkedList2.clear();
                    ud().removeMessages(1);
                }
                if (linkedList.size() > 0) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static Handler ud() {
        Handler handler;
        if (f16688ud != null) {
            return f16688ud;
        }
        synchronized (qdl) {
            try {
                if (f16688ud == null) {
                    qdl.InterfaceC0235qdl interfaceC0235qdl = com.bytedance.sdk.component.qdl.qdl;
                    HandlerThread safeHandlerThread = interfaceC0235qdl != null ? interfaceC0235qdl.getSafeHandlerThread("queued-work-looper", -2) : null;
                    if (safeHandlerThread == null) {
                        safeHandlerThread = new HandlerThread("queued-work-looper", -2);
                        safeHandlerThread.start();
                    }
                    f16688ud = new qdl(safeHandlerThread.getLooper());
                }
                handler = f16688ud;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public static void qdl(Runnable runnable, boolean z10) {
        try {
            Handler handlerUd = ud();
            synchronized (qdl) {
                try {
                    lnr.add(runnable);
                    if (z10) {
                        handlerUd.sendEmptyMessageDelayed(1, 100L);
                    } else {
                        handlerUd.sendEmptyMessage(1);
                    }
                } finally {
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }
}
