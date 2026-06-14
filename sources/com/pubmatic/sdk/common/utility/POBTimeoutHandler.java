package com.pubmatic.sdk.common.utility;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.log.POBLog;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public class POBTimeoutHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final POBTimeoutHandlerListener f62583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f62584b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f62585c = new ArrayList(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f62586d;

    public interface POBTimeoutHandlerListener {
        @MainThread
        void onTimeout();
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBTimeoutHandler.this.f62583a.onTimeout();
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f62588a;

        b(long j10) {
            this.f62588a = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            POBTimeoutHandler.this.f62583a.onTimeout();
            if (POBTimeoutHandler.this.f62585c.contains(this)) {
                POBTimeoutHandler.this.a(this.f62588a, this);
            }
        }
    }

    @MainThread
    public POBTimeoutHandler(@NonNull POBTimeoutHandlerListener pOBTimeoutHandlerListener) {
        a();
        this.f62583a = pOBTimeoutHandlerListener;
    }

    @MainThread
    public void cancel() {
        a();
        Runnable runnable = this.f62586d;
        if (runnable != null) {
            this.f62585c.remove(runnable);
            this.f62584b.removeCallbacks(this.f62586d);
        }
        this.f62586d = null;
    }

    @MainThread
    public boolean start(long j10) {
        a();
        cancel();
        a aVar = new a();
        this.f62586d = aVar;
        return a(j10, aVar);
    }

    @MainThread
    public boolean startAtFixedRate(long j10, long j11) {
        a();
        cancel();
        b bVar = new b(j11);
        this.f62586d = bVar;
        return a(j10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(long j10, Runnable runnable) {
        if (j10 < 0) {
            POBLog.error("POBTimeoutHandler", "Can not start timeout task as provided delay is invalid.", new Object[0]);
            return false;
        }
        this.f62585c.add(runnable);
        return this.f62584b.postDelayed(runnable, j10);
    }

    private void a() {
        if (POBUtils.isMainThread()) {
            return;
        }
        POBLog.warn("POBTimeoutHandler", "The API should be called on main thread.", new Object[0]);
    }
}
