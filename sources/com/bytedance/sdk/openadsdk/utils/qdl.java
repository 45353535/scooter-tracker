package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class qdl implements Application.ActivityLifecycleCallbacks {
    public static long lnr;
    public static boolean qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static long f17882ud;
    private final mml jpc;
    private volatile WeakReference<Activity> rdp;
    private final mml tvp;
    private final AtomicBoolean mml = new AtomicBoolean(false);
    private final RunnableC0302qdl mzz = new RunnableC0302qdl();
    private final mo mo = new mo();

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final mzz f17883wd = new mzz();
    private int to = 0;
    private volatile CopyOnWriteArrayList<WeakReference<com.bytedance.sdk.component.adexpress.qdl>> rq = new CopyOnWriteArrayList<>();
    private HandlerThread fs = null;
    private Handler exu = null;
    private final LinkedList<Activity> bjy = new LinkedList<>();

    private static class lnr extends mml {
        private lnr() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.qdl.mml, java.lang.Runnable
        public void run() {
            super.run();
            com.bytedance.sdk.openadsdk.utils.mzz.qdl();
        }
    }

    private static class mml implements Runnable {
        private mml() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.mml.qdl.rq rqVarXdk = com.bytedance.sdk.openadsdk.core.settings.rq.lnr().xdk();
            if (rqVarXdk == null || rqVarXdk.qdl() || !com.bytedance.sdk.component.utils.jl.jpc(com.bytedance.sdk.openadsdk.core.yt.qdl())) {
                return;
            }
            com.bytedance.sdk.openadsdk.mml.qdl.ud.qdl(com.bytedance.sdk.openadsdk.core.fs.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl()));
        }
    }

    class mo implements Runnable {
        mo() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.rdp.ud().removeMessages(1001);
            com.bytedance.sdk.openadsdk.core.yt.qdl();
        }
    }

    class mzz implements Runnable {
        mzz() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApmHelper.isIsInit()) {
                Handler handlerUd = com.bytedance.sdk.openadsdk.core.rdp.ud();
                Message messageObtain = Message.obtain(handlerUd, qdl.this.mzz);
                messageObtain.what = 1001;
                handlerUd.sendMessageDelayed(messageObtain, 30000L);
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.qdl$qdl, reason: collision with other inner class name */
    static class RunnableC0302qdl implements Runnable {
        RunnableC0302qdl() {
        }

        @Override // java.lang.Runnable
        public void run() {
            fco.lnr(new com.bytedance.sdk.component.jpc.jpc("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.qdl.qdl.1
                @Override // java.lang.Runnable
                public void run() {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    private static class ud extends mml {
        private ud() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.qdl.mml, java.lang.Runnable
        public void run() {
            super.run();
            com.bytedance.sdk.openadsdk.mo.ud.qdl().ud();
            com.bytedance.sdk.openadsdk.utils.mzz.ud();
        }
    }

    public class wd implements Runnable {
        private long lnr;
        private boolean mml;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private long f17885ud;

        public wd(long j10, long j11, boolean z10) {
            this.f17885ud = j10;
            this.lnr = j11;
            this.mml = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mml) {
                com.bytedance.sdk.openadsdk.bjy.lnr.qdl().qdl(this.f17885ud / 1000, this.lnr / 1000);
            }
        }
    }

    public qdl() {
        this.jpc = new ud();
        this.tvp = new lnr();
        lnr();
    }

    private void lnr() {
        this.fs = com.bytedance.sdk.component.utils.jpc.qdl("lifecycle", 10);
        this.exu = new Handler(this.fs.getLooper());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.bjy.addFirst(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.rq != null && this.rq.size() > 0) {
            for (WeakReference<com.bytedance.sdk.component.adexpress.qdl> weakReference : this.rq) {
                if (weakReference != null && weakReference.get() != null) {
                    try {
                        weakReference.get().qdl(activity);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (this.rdp != null && this.rdp.get() == activity) {
            this.rdp = null;
        }
        this.bjy.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i10 = this.to - 1;
        this.to = i10;
        if (i10 < 0) {
            this.to = 0;
        }
        if (ApmHelper.isIsInit()) {
            qdl(this.f17883wd);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        qdl(this.mo);
        if (!qdl) {
            f17882ud = System.currentTimeMillis();
            qdl = true;
        }
        this.rdp = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(final Activity activity) {
        Window window;
        try {
            if (ax.ud() && (window = activity.getWindow()) != null) {
                final View decorView = window.getDecorView();
                decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.qdl.1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(@NonNull View view) {
                        decorView.removeOnAttachStateChangeListener(this);
                        if (ax.mml(activity)) {
                            ax.qdl(true);
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(@NonNull View view) {
                        decorView.removeOnAttachStateChangeListener(this);
                    }
                });
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.qdl("TTAD.ActivityLifecycle", th2);
        }
        this.to++;
        if (this.mml.get()) {
            this.exu.removeCallbacks(this.tvp);
            this.exu.removeCallbacks(this.jpc);
            qdl(this.tvp);
        }
        this.mml.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.to <= 0) {
            this.mml.set(true);
        }
        if (qdl()) {
            qdl = false;
            com.bytedance.sdk.openadsdk.core.rdp.f17417ud.set(false);
            lnr = System.currentTimeMillis();
            this.exu.removeCallbacks(this.tvp);
            this.exu.removeCallbacks(this.jpc);
            qdl(this.jpc);
        }
        qdl(new wd(f17882ud, lnr, qdl()));
    }

    public boolean ud(com.bytedance.sdk.component.adexpress.qdl qdlVar) {
        return this.rq.remove(new WeakReference(qdlVar));
    }

    private void qdl(Runnable runnable) {
        if (!this.fs.isAlive()) {
            lnr();
        }
        this.exu.postDelayed(runnable, 1000L);
    }

    public Activity ud() {
        if (this.bjy.isEmpty()) {
            return null;
        }
        return this.bjy.getFirst();
    }

    public void qdl(com.bytedance.sdk.component.adexpress.qdl qdlVar) {
        this.rq.add(new WeakReference<>(qdlVar));
    }

    public boolean qdl() {
        return this.mml.get();
    }

    public boolean qdl(boolean z10) {
        Activity activity;
        Window window;
        return (this.rdp == null || (activity = this.rdp.get()) == null || (window = activity.getWindow()) == null) ? z10 : window.getDecorView().hasWindowFocus();
    }
}
