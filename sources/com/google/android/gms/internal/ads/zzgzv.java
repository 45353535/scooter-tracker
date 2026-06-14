package com.google.android.gms.internal.ads;

import com.ironsource.C4240b4;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzgzv extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzgzu(null);
    private static final Runnable zzb = new zzgzu(null);

    zzgzv() {
    }

    private final void zzb(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzgzt zzgztVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (!(runnable instanceof zzgzt)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzgztVar = (zzgzt) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z10 = Thread.interrupted() || z10;
                    LockSupport.park(zzgztVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objZza = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zZzd = zzd();
            if (!zZzd) {
                try {
                    objZza = zza();
                } catch (Throwable th2) {
                    try {
                        zzhag.zza(th2);
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzb(threadCurrentThread);
                        }
                        zzg(th2);
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzb(threadCurrentThread);
                        }
                        zzf(null);
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, zza)) {
                zzb(threadCurrentThread);
            }
            if (zZzd) {
                return;
            }
            zzf(objZza);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String string;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            string = "running=[DONE]";
        } else if (runnable instanceof zzgzt) {
            string = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 21);
            sb2.append("running=[RUNNING ON ");
            sb2.append(name);
            sb2.append(C4240b4.j.f42674e);
            string = sb2.toString();
        } else {
            string = "running=[NOT STARTED YET]";
        }
        String strZzc = zzc();
        StringBuilder sb3 = new StringBuilder(string.length() + 2 + String.valueOf(strZzc).length());
        sb3.append(string);
        sb3.append(", ");
        sb3.append(strZzc);
        return sb3.toString();
    }

    abstract Object zza() throws Exception;

    abstract String zzc();

    abstract boolean zzd();

    abstract void zzf(Object obj);

    abstract void zzg(Throwable th2);

    final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzgzt zzgztVar = new zzgzt(this, null);
            zzgztVar.zza(Thread.currentThread());
            if (compareAndSet(runnable, zzgztVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th2) {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th2;
                }
            }
        }
    }
}
