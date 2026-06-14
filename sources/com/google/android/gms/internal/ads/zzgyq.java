package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.taurusx.tax.y.z.w.s;
import j$.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzgyq extends zzgyu {
    private static final zzgzw zza = new zzgzw(zzgyq.class);
    private zzgub zzb;
    private final boolean zzc;
    private final boolean zzd;

    zzgyq(zzgub zzgubVar, boolean z10, boolean z11) {
        super(zzgubVar.size());
        this.zzb = zzgubVar;
        this.zzc = z10;
        this.zzd = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final void zzy(int i10, ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i10, listenableFuture);
            }
            zzz(null);
        } catch (Throwable th2) {
            zzz(null);
            throw th2;
        }
    }

    private final void zzE(Throwable th2) {
        th2.getClass();
        if (this.zzc && !zzb(th2) && zzI(zzB(), th2)) {
            zzF(th2);
        } else if (th2 instanceof Error) {
            zzF(th2);
        }
    }

    private static void zzF(Throwable th2) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", s.z.f67719y, true != (th2 instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th2);
    }

    private final void zzG(int i10, Future future) {
        try {
            zzw(i10, zzhap.zza(future));
        } catch (ExecutionException e10) {
            zzE(e10.getCause());
        } catch (Throwable th2) {
            zzE(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzz(zzgub zzgubVar) {
        int iZzC = zzC();
        int i10 = 0;
        zzgrc.zzj(iZzC >= 0, "Less than 0 remaining futures");
        if (iZzC == 0) {
            if (zzgubVar != null) {
                zzgwt it = zzgubVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i10, future);
                    }
                    i10++;
                }
            }
            this.seenExceptionsField = null;
            zzx();
            zzA(2);
        }
    }

    private static boolean zzI(Set set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    void zzA(int i10) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final void zzc() {
        zzgub zzgubVar = this.zzb;
        zzA(1);
        if ((zzgubVar != null) && isCancelled()) {
            boolean zZzj = zzj();
            zzgwt it = zzgubVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final String zzd() {
        zzgub zzgubVar = this.zzb;
        return zzgubVar != null ? "futures=".concat(zzgubVar.toString()) : super.zzd();
    }

    final void zze() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzx();
            return;
        }
        if (this.zzc) {
            zzgwt it = this.zzb.iterator();
            final int i10 = 0;
            while (it.hasNext()) {
                final ListenableFuture listenableFuture = (ListenableFuture) it.next();
                int i11 = i10 + 1;
                if (listenableFuture.isDone()) {
                    zzy(i10, listenableFuture);
                } else {
                    listenableFuture.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgyp
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzy(i10, listenableFuture);
                        }
                    }, zzgzd.INSTANCE);
                }
                i10 = i11;
            }
            return;
        }
        zzgub zzgubVar = this.zzb;
        final zzgub zzgubVar2 = true != this.zzd ? null : zzgubVar;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgyo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgubVar2);
            }
        };
        zzgwt it2 = zzgubVar.iterator();
        while (it2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            if (listenableFuture2.isDone()) {
                zzz(zzgubVar2);
            } else {
                listenableFuture2.addListener(runnable, zzgzd.INSTANCE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    final void zzf(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thZzl = zzl();
        Objects.requireNonNull(thZzl);
        zzI(set, thZzl);
    }

    abstract void zzw(int i10, Object obj);

    abstract void zzx();
}
