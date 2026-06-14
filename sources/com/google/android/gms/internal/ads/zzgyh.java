package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4240b4;
import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzgyh<V> extends zzgyi<V> {

    final class zza {
        static final zza zza;
        static final zza zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzgyi.zzg) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zza(false, null);
                zza = new zza(true, null);
            }
        }

        zza(boolean z10, Throwable th2) {
            this.zzc = z10;
            this.zzd = th2;
        }
    }

    final class zzb<V> implements Runnable {
        final zzgyh<V> zza;
        final ListenableFuture<? extends V> zzb;

        zzb(zzgyh zzgyhVar, ListenableFuture listenableFuture) {
            this.zza = zzgyhVar;
            this.zzb = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.zza.valueField != this) {
                return;
            }
            if (zzgyi.zzr(this.zza, this, zzgyh.zze(this.zzb))) {
                zzgyh.zzw(this.zza, false);
            }
        }
    }

    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzgyh.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        zzc(Throwable th2) {
            th2.getClass();
            this.zzb = th2;
        }
    }

    final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    interface zze<V> extends ListenableFuture<V> {
    }

    abstract class zzf<V> extends zzgyh<V> implements zze<V> {
        zzf() {
        }
    }

    protected zzgyh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zze(ListenableFuture listenableFuture) {
        Throwable thZzl;
        if (listenableFuture instanceof zze) {
            Object zzaVar = ((zzgyh) listenableFuture).valueField;
            if (zzaVar instanceof zza) {
                zza zzaVar2 = (zza) zzaVar;
                if (zzaVar2.zzc) {
                    Throwable th2 = zzaVar2.zzd;
                    zzaVar = th2 != null ? new zza(false, th2) : zza.zzb;
                }
            }
            Objects.requireNonNull(zzaVar);
            return zzaVar;
        }
        if ((listenableFuture instanceof zzhaq) && (thZzl = ((zzhaq) listenableFuture).zzl()) != null) {
            return new zzc(thZzl);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!zzgyi.zzg) && zIsCancelled) {
            zza zzaVar3 = zza.zzb;
            Objects.requireNonNull(zzaVar3);
            return zzaVar3;
        }
        try {
            Object objZzf = zzf(listenableFuture);
            if (!zIsCancelled) {
                return objZzf == null ? zzgyi.zze : objZzf;
            }
            String strValueOf = String.valueOf(listenableFuture);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 84);
            sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb2.append(strValueOf);
            return new zza(false, new IllegalArgumentException(sb2.toString()));
        } catch (Error | Exception e10) {
            return new zzc(e10);
        } catch (CancellationException e11) {
            return !zIsCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(listenableFuture)), e11)) : new zza(false, e11);
        } catch (ExecutionException e12) {
            return zIsCancelled ? new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(listenableFuture)), e12)) : new zzc(e12.getCause());
        }
    }

    private static Object zzf(Future future) throws ExecutionException {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    static Object zzg(Object obj) throws ExecutionException {
        if (obj instanceof zza) {
            Throwable th2 = ((zza) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzgyi.zze) {
            return null;
        }
        return obj;
    }

    static boolean zzh(Object obj) {
        return !(obj instanceof zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzw(zzgyh zzgyhVar, boolean z10) {
        zzd zzdVar = null;
        while (true) {
            zzgyhVar.zzs();
            if (z10) {
                zzgyhVar.zzi();
            }
            zzgyhVar.zzc();
            zzd zzdVar2 = zzdVar;
            zzd zzdVarZzq = zzgyhVar.zzq(zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zzdVarZzq != null) {
                zzd zzdVar4 = zzdVarZzq.next;
                zzdVarZzq.next = zzdVar3;
                zzdVar3 = zzdVarZzq;
                zzdVarZzq = zzdVar4;
            }
            while (zzdVar3 != null) {
                Runnable runnable = zzdVar3.zzb;
                zzdVar = zzdVar3.next;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzb) {
                    zzb zzbVar = (zzb) runnable2;
                    zzgyhVar = zzbVar.zza;
                    if (zzgyhVar.valueField != zzbVar || !zzgyi.zzr(zzgyhVar, zzbVar, zze(zzbVar.zzb))) {
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    Objects.requireNonNull(executor);
                    zzy(runnable2, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
            z10 = false;
        }
    }

    private final void zzx(StringBuilder sb2) {
        try {
            Object objZzf = zzf(this);
            sb2.append("SUCCESS, result=[");
            if (objZzf == null) {
                sb2.append("null");
            } else if (objZzf == this) {
                sb2.append("this future");
            } else {
                sb2.append(objZzf.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(objZzf)));
            }
            sb2.append(C4240b4.j.f42674e);
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append(C4240b4.j.f42674e);
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    private static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            Logger loggerZza = zzgyi.zzf.zza();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb2.append("RuntimeException while executing runnable ");
            sb2.append(strValueOf);
            sb2.append(" with executor ");
            sb2.append(strValueOf2);
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb2.toString(), (Throwable) e10);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzgrc.zzk(runnable, "Runnable was null.");
        zzgrc.zzk(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listenersField) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzp(zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listenersField;
                }
            } while (zzdVar != zzd.zza);
        }
        zzy(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.valueField
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgyh.zzb
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = com.google.android.gms.internal.ads.zzgyi.zzg
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.ads.zzgyh$zza r1 = new com.google.android.gms.internal.ads.zzgyh$zza
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.ads.zzgyh$zza r1 = com.google.android.gms.internal.ads.zzgyh.zza.zza
            goto L26
        L24:
            com.google.android.gms.internal.ads.zzgyh$zza r1 = com.google.android.gms.internal.ads.zzgyh.zza.zzb
        L26:
            j$.util.Objects.requireNonNull(r1)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            boolean r6 = com.google.android.gms.internal.ads.zzgyi.zzr(r4, r0, r1)
            if (r6 == 0) goto L56
            zzw(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgyh.zzb
            if (r4 == 0) goto L55
            com.google.android.gms.internal.ads.zzgyh$zzb r0 = (com.google.android.gms.internal.ads.zzgyh.zzb) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgyh.zze
            if (r4 == 0) goto L52
            r4 = r0
            com.google.android.gms.internal.ads.zzgyh r4 = (com.google.android.gms.internal.ads.zzgyh) r4
            java.lang.Object r0 = r4.valueField
            if (r0 != 0) goto L49
            r5 = r3
            goto L4a
        L49:
            r5 = r2
        L4a:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzgyh.zzb
            r5 = r5 | r6
            if (r5 == 0) goto L51
            r5 = r3
            goto L2b
        L51:
            return r3
        L52:
            r0.cancel(r8)
        L55:
            return r3
        L56:
            java.lang.Object r0 = r4.valueField
            boolean r6 = zzh(r0)
            if (r6 == 0) goto L2b
            return r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgyh.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        return zzu();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.valueField instanceof zza;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & zzh(obj);
    }

    public String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            zzx(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof zzb) {
                sb2.append(", setFuture=[");
                ListenableFuture<? extends V> listenableFuture = ((zzb) obj).zzb;
                try {
                    if (listenableFuture == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(listenableFuture);
                    }
                } catch (Throwable th2) {
                    zzhag.zzb(th2);
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(th2.getClass());
                }
                sb2.append(C4240b4.j.f42674e);
            } else {
                try {
                    strConcat = zzgrt.zzb(zzd());
                } catch (Throwable th3) {
                    zzhag.zzb(th3);
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th3.getClass()));
                }
                if (strConcat != null) {
                    sb2.append(", info=[");
                    sb2.append(strConcat);
                    sb2.append(C4240b4.j.f42674e);
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                zzx(sb2);
            }
        }
        sb2.append(C4240b4.j.f42674e);
        return sb2.toString();
    }

    protected boolean zza(Object obj) {
        if (obj == null) {
            obj = zzgyi.zze;
        }
        if (!zzgyi.zzr(this, null, obj)) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    protected boolean zzb(Throwable th2) {
        th2.getClass();
        if (!zzgyi.zzr(this, null, new zzc(th2))) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    protected void zzc() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String zzd() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb2 = new StringBuilder(String.valueOf(delay).length() + 21);
        sb2.append("remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }

    protected void zzi() {
    }

    protected final boolean zzj() {
        Object obj = this.valueField;
        return (obj instanceof zza) && ((zza) obj).zzc;
    }

    protected final boolean zzk(ListenableFuture listenableFuture) {
        zzc zzcVar;
        listenableFuture.getClass();
        Object obj = this.valueField;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!zzgyi.zzr(this, null, zze(listenableFuture))) {
                    return false;
                }
                zzw(this, false);
                return true;
            }
            zzb zzbVar = new zzb(this, listenableFuture);
            if (zzgyi.zzr(this, null, zzbVar)) {
                try {
                    listenableFuture.addListener(zzbVar, zzgzd.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        zzcVar = new zzc(th2);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.zza;
                    }
                    zzgyi.zzr(this, zzbVar, zzcVar);
                }
                return true;
            }
            obj = this.valueField;
        }
        if (obj instanceof zza) {
            listenableFuture.cancel(((zza) obj).zzc);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    protected final Throwable zzl() {
        if (!(this instanceof zze)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    final void zzm(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzj());
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return zzt(j10, timeUnit);
    }
}
