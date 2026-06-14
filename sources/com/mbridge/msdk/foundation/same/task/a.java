package com.mbridge.msdk.foundation.same.task;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a implements Runnable {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public static long f48889id;
    public InterfaceC0520a mListener;
    public b mState = b.READY;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.task.a$a, reason: collision with other inner class name */
    public interface InterfaceC0520a {
        void a(b bVar);
    }

    public enum b {
        READY,
        RUNNING,
        PAUSE,
        CANCEL,
        FINISH
    }

    public a() {
        f48889id++;
    }

    private void setState(b bVar) {
        this.mState = bVar;
        InterfaceC0520a interfaceC0520a = this.mListener;
        if (interfaceC0520a != null) {
            interfaceC0520a.a(bVar);
        }
    }

    public final void cancel() {
        b bVar = this.mState;
        b bVar2 = b.CANCEL;
        if (bVar != bVar2) {
            setState(bVar2);
            cancelTask();
        }
    }

    public abstract void cancelTask();

    public final long getId() {
        return f48889id;
    }

    public b getState() {
        return this.mState;
    }

    public abstract void pauseTask(boolean z10);

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.mState == b.READY) {
                setState(b.RUNNING);
                runTask();
                setState(b.FINISH);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public abstract void runTask();

    public void setOnStateChangeListener(InterfaceC0520a interfaceC0520a) {
        this.mListener = interfaceC0520a;
    }

    public final void setPause(boolean z10) {
        b bVar = this.mState;
        b bVar2 = b.PAUSE;
        if (bVar == bVar2 || bVar == b.CANCEL || bVar == b.FINISH) {
            return;
        }
        if (z10) {
            setState(bVar2);
        } else {
            setState(b.RUNNING);
        }
        pauseTask(z10);
    }
}
