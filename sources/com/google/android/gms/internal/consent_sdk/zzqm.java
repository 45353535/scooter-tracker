package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzqj;
import com.google.android.gms.internal.consent_sdk.zzqm;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzqm<MessageType extends zzqm<MessageType, BuilderType>, BuilderType extends zzqj<MessageType, BuilderType>> extends zzpa<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzsq zzc = zzsq.zzc();

    private final int zza(zzsa zzsaVar) {
        return zzrx.zza().zzb(getClass()).zza(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzc(zzqm zzqmVar, boolean z10) {
        byte bByteValue = ((Byte) zzqmVar.zzb(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzh = zzrx.zza().zzb(zzqmVar.getClass()).zzh(zzqmVar);
        if (z10) {
            zzqmVar.zzb(2, true != zZzh ? null : zzqmVar, null);
        }
        return zZzh;
    }

    static zzqm zzq(Class cls) {
        Map map = zzb;
        zzqm zzqmVar = (zzqm) map.get(cls);
        if (zzqmVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzqmVar = (zzqm) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzqmVar != null) {
            return zzqmVar;
        }
        zzqm zzqmVar2 = (zzqm) ((zzqm) zzsw.zze(cls)).zzb(6, null, null);
        if (zzqmVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzqmVar2);
        return zzqmVar2;
    }

    protected static zzqq zzs() {
        return zzqn.zzf();
    }

    protected static zzqr zzt() {
        return zzry.zze();
    }

    static Object zzv(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object zzw(zzrq zzrqVar, String str, Object[] objArr) {
        return new zzrz(zzrqVar, str, objArr);
    }

    protected static void zzz(Class cls, zzqm zzqmVar) {
        zzqmVar.zzy();
        zzb.put(cls, zzqmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzrx.zza().zzb(getClass()).zzg(this, (zzqm) obj);
    }

    public final int hashCode() {
        if (zzD()) {
            return zzm();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iZzm = zzm();
        this.zza = iZzm;
        return iZzm;
    }

    public final String toString() {
        return zzrs.zza(this, super.toString());
    }

    final void zzA(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    public final void zzB(zzpv zzpvVar) throws IOException {
        zzrx.zza().zzb(getClass()).zzf(this, zzpw.zza(zzpvVar));
    }

    final boolean zzD() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract Object zzb(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.consent_sdk.zzpa
    final int zzj(zzsa zzsaVar) {
        if (zzD()) {
            int iZza = zzsaVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iZza2 = zzsaVar.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrr
    public final /* synthetic */ zzrq zzl() {
        return (zzqm) zzb(6, null, null);
    }

    final int zzm() {
        return zzrx.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    public final int zzn() {
        if (zzD()) {
            int iZza = zza(null);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iZza2 = zza(null);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrr
    public final boolean zzo() {
        return zzc(this, true);
    }

    protected final zzqj zzp() {
        return (zzqj) zzb(5, null, null);
    }

    final zzqm zzr() {
        return (zzqm) zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    public final /* synthetic */ zzrp zzu() {
        return (zzqj) zzb(5, null, null);
    }

    protected final void zzx() {
        zzrx.zza().zzb(getClass()).zzd(this);
        zzy();
    }

    final void zzy() {
        this.zzd &= Integer.MAX_VALUE;
    }
}
