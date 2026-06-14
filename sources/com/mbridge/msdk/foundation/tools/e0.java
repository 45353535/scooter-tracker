package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public class e0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Runnable f48985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f48986b;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f48987a;

        a(Runnable runnable) {
            this.f48987a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f48987a.run();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("LimitExecutor", e10.getMessage());
                }
            } finally {
                e0.this.a();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        try {
            if (this.f48985a == null) {
                this.f48985a = a(runnable);
                c0.a().execute(this.f48985a);
            } else if (this.f48986b == null) {
                this.f48986b = a(runnable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private Runnable a(Runnable runnable) {
        return new a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        Runnable runnable = this.f48986b;
        this.f48985a = runnable;
        this.f48986b = null;
        if (runnable != null) {
            c0.a().execute(this.f48985a);
        }
    }
}
