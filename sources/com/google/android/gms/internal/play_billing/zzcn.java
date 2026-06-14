package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzcm;
import com.google.android.gms.internal.play_billing.zzcn;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzcn<V> extends zzdi implements zzdc<V> {
    static final Object zza = new Object();
    static final zzdb zzb = new zzdb(zzcm.class);
    static final boolean zzc;
    private static final zza zzd;
    volatile zzcm.zzd listenersField;
    volatile Object valueField;
    volatile zze waitersField;

    abstract class zza {
        /* synthetic */ zza(zzcr zzcrVar) {
        }

        abstract zzcm.zzd zza(zzcn zzcnVar, zzcm.zzd zzdVar);

        abstract zze zzb(zzcn zzcnVar, zze zzeVar);

        abstract void zzc(zze zzeVar, zze zzeVar2);

        abstract void zzd(zze zzeVar, Thread thread);

        abstract boolean zze(zzcn zzcnVar, zzcm.zzd zzdVar, zzcm.zzd zzdVar2);

        abstract boolean zzf(zzcn zzcnVar, Object obj, Object obj2);

        abstract boolean zzg(zzcn zzcnVar, zze zzeVar, zze zzeVar2);
    }

    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater<zze, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<zze, zze> zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "next");
        private static final AtomicReferenceFieldUpdater<? super zzcn<?>, zze> zzc = AtomicReferenceFieldUpdater.newUpdater(zzcn.class, zze.class, "waitersField");
        private static final AtomicReferenceFieldUpdater<? super zzcn<?>, zzcm.zzd> zzd = AtomicReferenceFieldUpdater.newUpdater(zzcn.class, zzcm.zzd.class, "listenersField");
        private static final AtomicReferenceFieldUpdater<? super zzcn<?>, Object> zze = AtomicReferenceFieldUpdater.newUpdater(zzcn.class, Object.class, "valueField");

        private zzb() {
            throw null;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        final zzcm.zzd zza(zzcn zzcnVar, zzcm.zzd zzdVar) {
            return zzd.getAndSet(zzcnVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        final zze zzb(zzcn zzcnVar, zze zzeVar) {
            return zzc.getAndSet(zzcnVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        final void zzc(zze zzeVar, zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        final void zzd(zze zzeVar, Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        final boolean zze(zzcn zzcnVar, zzcm.zzd zzdVar, zzcm.zzd zzdVar2) {
            return zzco.zza(zzd, zzcnVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        final boolean zzf(zzcn zzcnVar, Object obj, Object obj2) {
            return zzco.zza(zze, zzcnVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        final boolean zzg(zzcn zzcnVar, zze zzeVar, zze zzeVar2) {
            return zzco.zza(zzc, zzcnVar, zzeVar, zzeVar2);
        }

        /* synthetic */ zzb(zzcr zzcrVar) {
            super(null);
        }
    }

    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        final zzcm.zzd zza(zzcn zzcnVar, zzcm.zzd zzdVar) {
            zzcm.zzd zzdVar2;
            synchronized (zzcnVar) {
                try {
                    zzdVar2 = zzcnVar.listenersField;
                    if (zzdVar2 != zzdVar) {
                        zzcnVar.listenersField = zzdVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        final zze zzb(zzcn zzcnVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzcnVar) {
                try {
                    zzeVar2 = zzcnVar.waitersField;
                    if (zzeVar2 != zzeVar) {
                        zzcnVar.waitersField = zzeVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        final void zzc(zze zzeVar, zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        final void zzd(zze zzeVar, Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        final boolean zze(zzcn zzcnVar, zzcm.zzd zzdVar, zzcm.zzd zzdVar2) {
            synchronized (zzcnVar) {
                try {
                    if (zzcnVar.listenersField != zzdVar) {
                        return false;
                    }
                    zzcnVar.listenersField = zzdVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        final boolean zzf(zzcn zzcnVar, Object obj, Object obj2) {
            synchronized (zzcnVar) {
                try {
                    if (zzcnVar.valueField != obj) {
                        return false;
                    }
                    zzcnVar.valueField = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        final boolean zzg(zzcn zzcnVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzcnVar) {
                try {
                    if (zzcnVar.waitersField != zzeVar) {
                        return false;
                    }
                    zzcnVar.waitersField = zzeVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* synthetic */ zzc(zzcr zzcrVar) {
            super(null);
        }
    }

    final class zzd extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;
        public static final /* synthetic */ int zzg = 0;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: com.google.android.gms.internal.play_billing.zzcq
                        @Override // java.security.PrivilegedExceptionAction
                        public final Object run() throws IllegalAccessException {
                            int i10 = zzcn.zzd.zzg;
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzcn.class.getDeclaredField("waitersField"));
                    zzb = unsafe.objectFieldOffset(zzcn.class.getDeclaredField("listenersField"));
                    zzd = unsafe.objectFieldOffset(zzcn.class.getDeclaredField("valueField"));
                    zze = unsafe.objectFieldOffset(zze.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zze.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (NoSuchFieldException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (PrivilegedActionException e11) {
                throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
            }
        }

        private zzd() {
            throw null;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        final zzcm.zzd zza(zzcn zzcnVar, zzcm.zzd zzdVar) {
            zzcm.zzd zzdVar2;
            do {
                zzdVar2 = zzcnVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzcnVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        final zze zzb(zzcn zzcnVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzcnVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzg(zzcnVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        final void zzc(zze zzeVar, zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        final void zzd(zze zzeVar, Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        final boolean zze(zzcn zzcnVar, zzcm.zzd zzdVar, zzcm.zzd zzdVar2) {
            return zzcp.zza(zza, zzcnVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        final boolean zzf(zzcn zzcnVar, Object obj, Object obj2) {
            return zzcp.zza(zza, zzcnVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcn.zza
        final boolean zzg(zzcn zzcnVar, zze zzeVar, zze zzeVar2) {
            return zzcp.zza(zza, zzcnVar, zzc, zzeVar, zzeVar2);
        }

        /* synthetic */ zzd(zzcr zzcrVar) {
            super(null);
        }
    }

    final class zze {
        static final zze zza = new zze(false);
        volatile zze next;
        volatile Thread thread;

        zze(boolean z10) {
        }

        zze() {
            zzcn.zzn(this, Thread.currentThread());
        }
    }

    static {
        boolean z10;
        Throwable th2;
        Throwable th3;
        zza zzcVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        zzc = z10;
        String property = System.getProperty("java.runtime.name", "");
        zzcr zzcrVar = null;
        if (property == null || property.contains("Android")) {
            try {
                zzcVar = new zzd(zzcrVar);
            } catch (Error | Exception e10) {
                try {
                    zzcVar = new zzb(zzcrVar);
                    th2 = null;
                    th3 = e10;
                } catch (Error | Exception e11) {
                    th2 = e11;
                    th3 = e10;
                    zzcVar = new zzc(zzcrVar);
                }
            }
        } else {
            try {
                zzcVar = new zzb(zzcrVar);
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc(zzcrVar);
            }
        }
        th2 = null;
        th3 = null;
        zzd = zzcVar;
        if (th2 != null) {
            zzdb zzdbVar = zzb;
            Logger loggerZza = zzdbVar.zza();
            Level level = Level.SEVERE;
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            zzdbVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    zzcn() {
    }

    private final void zza(zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zze.zza) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                            break;
                        }
                    } else if (!zzd.zzg(this, zzeVar2, zzeVar4)) {
                        break;
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    static /* synthetic */ void zzn(zze zzeVar, Thread thread) {
        zzd.zzd(zzeVar, thread);
    }

    static boolean zzq(zzcn zzcnVar, Object obj, Object obj2) {
        return zzd.zzf(zzcnVar, obj, obj2);
    }

    final zzcm.zzd zzk(zzcm.zzd zzdVar) {
        return zzd.zza(this, zzdVar);
    }

    final Object zzl() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && zzcm.zzh(obj2)) {
            return zzcm.zzc(obj2);
        }
        zze zzeVar = this.waitersField;
        if (zzeVar != zze.zza) {
            zze zzeVar2 = new zze();
            do {
                zza zzaVar = zzd;
                zzaVar.zzc(zzeVar2, zzeVar);
                if (zzaVar.zzg(this, zzeVar, zzeVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zza(zzeVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & zzcm.zzh(obj)));
                    return zzcm.zzc(obj);
                }
                zzeVar = this.waitersField;
            } while (zzeVar != zze.zza);
        }
        Object obj3 = this.valueField;
        Objects.requireNonNull(obj3);
        return zzcm.zzc(obj3);
    }

    final Object zzm(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        boolean z10 = true;
        if ((obj != null) && zzcm.zzh(obj)) {
            return zzcm.zzc(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zze zzeVar = this.waitersField;
            if (zzeVar != zze.zza) {
                zze zzeVar2 = new zze();
                do {
                    zza zzaVar = zzd;
                    zzaVar.zzc(zzeVar2, zzeVar);
                    if (zzaVar.zzg(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zza(zzeVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && zzcm.zzh(obj2)) {
                                return zzcm.zzc(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzeVar2);
                    } else {
                        zzeVar = this.waitersField;
                    }
                } while (zzeVar != zze.zza);
            }
            Object obj3 = this.valueField;
            Objects.requireNonNull(obj3);
            return zzcm.zzc(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && zzcm.zzh(obj4)) {
                return zzcm.zzc(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z10 = false;
            }
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z10) {
                    strConcat3 = strConcat3.concat(StringUtils.COMMA);
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z10) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(strConcat + " for " + string);
    }

    final void zzo() {
        for (zze zzeVarZzb = zzd.zzb(this, zze.zza); zzeVarZzb != null; zzeVarZzb = zzeVarZzb.next) {
            Thread thread = zzeVarZzb.thread;
            if (thread != null) {
                zzeVarZzb.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    final boolean zzp(zzcm.zzd zzdVar, zzcm.zzd zzdVar2) {
        return zzd.zze(this, zzdVar, zzdVar2);
    }
}
