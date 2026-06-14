package com.bytedance.sdk.component.jpc;

import com.bytedance.sdk.component.jpc.qdl;
import com.taurusx.tax.y.z.w.s;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class mo extends mzz {
    private static volatile ThreadPoolExecutor jpc;
    private static volatile ThreadPoolExecutor mo;
    private static volatile ThreadPoolExecutor mzz;
    private static volatile ScheduledExecutorService rq;
    private static volatile ThreadPoolExecutor to;
    private static volatile ThreadPoolExecutor tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static lnr f16497ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private static volatile ThreadPoolExecutor f16498wd;
    public static final int qdl = Runtime.getRuntime().availableProcessors();
    public static int lnr = 120;
    public static boolean mml = true;

    public static RejectedExecutionHandler jpc() {
        return new RejectedExecutionHandler() { // from class: com.bytedance.sdk.component.jpc.mo.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }

    public static ExecutorService lnr() {
        return qdl(10);
    }

    public static ExecutorService mml() {
        if (jpc == null) {
            synchronized (mo.class) {
                try {
                    if (jpc == null) {
                        qdl qdlVarQdl = new qdl.C0227qdl().qdl(s.z.f67719y).ud(10).qdl(4).qdl(20L).qdl(TimeUnit.SECONDS).qdl(new PriorityBlockingQueue()).qdl(jpc()).qdl(mzz.qdl().createThreadFactory(10, s.z.f67719y)).qdl();
                        jpc = qdlVarQdl;
                        qdlVarQdl.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpc;
    }

    public static ScheduledExecutorService mo() {
        if (rq == null) {
            synchronized (mo.class) {
                try {
                    if (rq == null) {
                        rq = Executors.newSingleThreadScheduledExecutor(mzz.qdl().createThreadFactory(5, "scheduled"));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return rq;
    }

    public static ExecutorService mzz() {
        if (to == null) {
            synchronized (mo.class) {
                try {
                    if (to == null) {
                        qdl qdlVarQdl = new qdl.C0227qdl().qdl("aidl").ud(10).qdl(2).qdl(30L).qdl(TimeUnit.SECONDS).qdl(new PriorityBlockingQueue()).qdl(jpc()).qdl(mzz.qdl().createThreadFactory(10, "aidl")).qdl();
                        to = qdlVarQdl;
                        qdlVarQdl.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return to;
    }

    public static void qdl(jpc jpcVar) {
        if (mzz == null) {
            ud();
        }
        if (jpcVar == null || mzz == null) {
            return;
        }
        mzz.execute(jpcVar);
    }

    public static ExecutorService to() {
        if (tvp == null) {
            synchronized (mo.class) {
                try {
                    if (tvp == null) {
                        qdl qdlVarQdl = new qdl.C0227qdl().qdl("computation").qdl(3).ud(10).qdl(20L).qdl(TimeUnit.SECONDS).qdl(new PriorityBlockingQueue()).qdl(jpc()).qdl(mzz.qdl().createThreadFactory(10, "computation")).qdl();
                        tvp = qdlVarQdl;
                        qdlVarQdl.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return tvp;
    }

    public static lnr tvp() {
        return f16497ud;
    }

    public static ExecutorService ud() {
        if (mzz == null) {
            synchronized (mo.class) {
                try {
                    if (mzz == null) {
                        mzz = new qdl.C0227qdl().qdl("init").qdl(0).ud(10).qdl(5L).qdl(TimeUnit.SECONDS).qdl(new SynchronousQueue()).qdl(jpc()).qdl(mzz.qdl().createThreadFactory(10, "init")).qdl();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return mzz;
    }

    public static boolean wd() {
        return mml;
    }

    public static void lnr(jpc jpcVar) {
        if (jpc == null) {
            mml();
        }
        if (jpcVar == null || jpc == null) {
            return;
        }
        jpc.execute(jpcVar);
    }

    public static ExecutorService qdl(int i10) {
        if (mo == null) {
            synchronized (mo.class) {
                try {
                    if (mo == null) {
                        qdl qdlVarQdl = new qdl.C0227qdl().qdl("io").qdl(2).ud(i10).qdl(20L).qdl(TimeUnit.SECONDS).qdl(new LinkedBlockingQueue()).qdl(jpc()).qdl(mzz.qdl().createThreadFactory(i10, "io")).qdl();
                        mo = qdlVarQdl;
                        qdlVarQdl.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return mo;
    }

    public static void lnr(jpc jpcVar, int i10) {
        if (jpcVar != null) {
            jpcVar.setPriority(i10);
        }
        mml(jpcVar);
    }

    public static void lnr(int i10) {
        lnr = i10;
    }

    public static void ud(jpc jpcVar) {
        if (mo == null) {
            lnr();
        }
        if (mo != null) {
            mo.execute(jpcVar);
        }
    }

    public static void mml(jpc jpcVar) {
        if (to == null) {
            mzz();
        }
        if (jpcVar == null || to == null) {
            return;
        }
        to.execute(jpcVar);
    }

    public static void mzz(jpc jpcVar) {
        if (f16498wd == null) {
            ud(5);
        }
        if (jpcVar == null || f16498wd == null) {
            return;
        }
        f16498wd.execute(jpcVar);
    }

    public static void ud(jpc jpcVar, int i10) {
        if (jpcVar != null) {
            jpcVar.setPriority(i10);
        }
        lnr(jpcVar);
    }

    public static void qdl(jpc jpcVar, int i10) {
        ud(jpcVar);
    }

    public static void qdl(jpc jpcVar, int i10, int i11) {
        if (mo == null) {
            qdl(i11);
        }
        if (jpcVar == null || mo == null) {
            return;
        }
        jpcVar.setPriority(i10);
        mo.execute(jpcVar);
    }

    public static ExecutorService ud(int i10) {
        if (f16498wd == null) {
            synchronized (mo.class) {
                try {
                    if (f16498wd == null) {
                        qdl qdlVarQdl = new qdl.C0227qdl().qdl("ad").qdl(2).ud(i10).qdl(20L).qdl(TimeUnit.SECONDS).qdl(new LinkedBlockingQueue()).qdl(jpc()).qdl(mzz.qdl().createThreadFactory(i10, "ad")).qdl();
                        f16498wd = qdlVarQdl;
                        qdlVarQdl.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f16498wd;
    }

    public static void qdl(boolean z10) {
        mml = z10;
    }

    public static void qdl(lnr lnrVar) {
        f16497ud = lnrVar;
    }
}
