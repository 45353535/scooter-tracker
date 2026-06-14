package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
class SnackbarManager {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static SnackbarManager f27828e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f27829a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f27830b = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.material.snackbar.SnackbarManager.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            SnackbarManager.this.c((SnackbarRecord) message.obj);
            return true;
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SnackbarRecord f27831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SnackbarRecord f27832d;

    interface Callback {
        void dismiss(int i10);

        void show();
    }

    private static class SnackbarRecord {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WeakReference f27834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f27835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f27836c;

        SnackbarRecord(int i10, Callback callback) {
            this.f27834a = new WeakReference(callback);
            this.f27835b = i10;
        }

        boolean a(Callback callback) {
            return callback != null && this.f27834a.get() == callback;
        }
    }

    private SnackbarManager() {
    }

    private boolean a(SnackbarRecord snackbarRecord, int i10) {
        Callback callback = (Callback) snackbarRecord.f27834a.get();
        if (callback == null) {
            return false;
        }
        this.f27830b.removeCallbacksAndMessages(snackbarRecord);
        callback.dismiss(i10);
        return true;
    }

    static SnackbarManager b() {
        if (f27828e == null) {
            f27828e = new SnackbarManager();
        }
        return f27828e;
    }

    private boolean d(Callback callback) {
        SnackbarRecord snackbarRecord = this.f27831c;
        return snackbarRecord != null && snackbarRecord.a(callback);
    }

    private boolean e(Callback callback) {
        SnackbarRecord snackbarRecord = this.f27832d;
        return snackbarRecord != null && snackbarRecord.a(callback);
    }

    private void f(SnackbarRecord snackbarRecord) {
        int i10 = snackbarRecord.f27835b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        this.f27830b.removeCallbacksAndMessages(snackbarRecord);
        Handler handler = this.f27830b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, snackbarRecord), i10);
    }

    private void g() {
        SnackbarRecord snackbarRecord = this.f27832d;
        if (snackbarRecord != null) {
            this.f27831c = snackbarRecord;
            this.f27832d = null;
            Callback callback = (Callback) snackbarRecord.f27834a.get();
            if (callback != null) {
                callback.show();
            } else {
                this.f27831c = null;
            }
        }
    }

    void c(SnackbarRecord snackbarRecord) {
        synchronized (this.f27829a) {
            try {
                if (this.f27831c == snackbarRecord || this.f27832d == snackbarRecord) {
                    a(snackbarRecord, 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void dismiss(Callback callback, int i10) {
        synchronized (this.f27829a) {
            try {
                if (d(callback)) {
                    a(this.f27831c, i10);
                } else if (e(callback)) {
                    a(this.f27832d, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean isCurrent(Callback callback) {
        boolean zD;
        synchronized (this.f27829a) {
            zD = d(callback);
        }
        return zD;
    }

    public boolean isCurrentOrNext(Callback callback) {
        boolean z10;
        synchronized (this.f27829a) {
            try {
                z10 = d(callback) || e(callback);
            } finally {
            }
        }
        return z10;
    }

    public void onDismissed(Callback callback) {
        synchronized (this.f27829a) {
            try {
                if (d(callback)) {
                    this.f27831c = null;
                    if (this.f27832d != null) {
                        g();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onShown(Callback callback) {
        synchronized (this.f27829a) {
            try {
                if (d(callback)) {
                    f(this.f27831c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void pauseTimeout(Callback callback) {
        synchronized (this.f27829a) {
            try {
                if (d(callback)) {
                    SnackbarRecord snackbarRecord = this.f27831c;
                    if (!snackbarRecord.f27836c) {
                        snackbarRecord.f27836c = true;
                        this.f27830b.removeCallbacksAndMessages(snackbarRecord);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void restoreTimeoutIfPaused(Callback callback) {
        synchronized (this.f27829a) {
            try {
                if (d(callback)) {
                    SnackbarRecord snackbarRecord = this.f27831c;
                    if (snackbarRecord.f27836c) {
                        snackbarRecord.f27836c = false;
                        f(snackbarRecord);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void show(int i10, Callback callback) {
        synchronized (this.f27829a) {
            try {
                if (d(callback)) {
                    SnackbarRecord snackbarRecord = this.f27831c;
                    snackbarRecord.f27835b = i10;
                    this.f27830b.removeCallbacksAndMessages(snackbarRecord);
                    f(this.f27831c);
                    return;
                }
                if (e(callback)) {
                    this.f27832d.f27835b = i10;
                } else {
                    this.f27832d = new SnackbarRecord(i10, callback);
                }
                SnackbarRecord snackbarRecord2 = this.f27831c;
                if (snackbarRecord2 == null || !a(snackbarRecord2, 4)) {
                    this.f27831c = null;
                    g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
