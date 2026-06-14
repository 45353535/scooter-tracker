package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfkg {

    @GuardedBy("LiteSdkInfoRetriever.class")
    private static zzfkg zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcy zzc;
    private final AtomicReference zzd = new AtomicReference();

    @VisibleForTesting
    zzfkg(Context context, com.google.android.gms.ads.internal.client.zzcy zzcyVar) {
        this.zzb = context;
        this.zzc = zzcyVar;
    }

    public static zzfkg zza(Context context) {
        synchronized (zzfkg.class) {
            try {
                zzfkg zzfkgVar = zza;
                if (zzfkgVar != null) {
                    return zzfkgVar;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) zzbjf.zzb.zze()).longValue();
                com.google.android.gms.ads.internal.client.zzcy zzcyVarZzf = null;
                if (jLongValue > 0 && jLongValue <= 254715000) {
                    zzcyVarZzf = zzf(applicationContext);
                }
                zzfkg zzfkgVar2 = new zzfkg(applicationContext, zzcyVarZzf);
                zza = zzfkgVar2;
                return zzfkgVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    static com.google.android.gms.ads.internal.client.zzcy zzf(Context context) {
        try {
            try {
                return com.google.android.gms.ads.internal.client.zzcx.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
            } catch (ClassNotFoundException e10) {
                e = e10;
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to retrieve lite SDK info.", e);
                return null;
            } catch (IllegalAccessException e11) {
                e = e11;
                int i102 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to retrieve lite SDK info.", e);
                return null;
            } catch (InstantiationException e12) {
                e = e12;
                int i1022 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to retrieve lite SDK info.", e);
                return null;
            } catch (NoSuchMethodException e13) {
                e = e13;
                int i10222 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to retrieve lite SDK info.", e);
                return null;
            } catch (InvocationTargetException e14) {
                e = e14;
                int i102222 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to retrieve lite SDK info.", e);
                return null;
            }
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e15) {
            e = e15;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzfc zzg() {
        com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzc;
        if (zzcyVar != null) {
            try {
                return zzcyVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final VersionInfoParcel zzb(int i10, boolean z10, int i11) {
        com.google.android.gms.ads.internal.client.zzfc zzfcVarZzg;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zZzJ = com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzb);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, i11, true, zZzJ);
        return (((Boolean) zzbjf.zzc.zze()).booleanValue() && (zzfcVarZzg = zzg()) != null) ? new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, zzfcVarZzg.zza(), true, zZzJ) : versionInfoParcel;
    }

    public final void zzc(zzbtt zzbttVar) {
        zzbtt adapterCreator;
        if (!((Boolean) zzbjf.zza.zze()).booleanValue()) {
            androidx.compose.animation.core.c.a(this.zzd, null, zzbttVar);
            return;
        }
        com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzc;
        if (zzcyVar == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = zzcyVar.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        AtomicReference atomicReference = this.zzd;
        if (adapterCreator != null) {
            zzbttVar = adapterCreator;
        }
        androidx.compose.animation.core.c.a(atomicReference, null, zzbttVar);
    }

    public final zzbtt zzd() {
        return (zzbtt) this.zzd.get();
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzfc zzfcVarZzg = zzg();
        if (zzfcVarZzg != null) {
            return zzfcVarZzg.zzb();
        }
        return null;
    }
}
