package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfxa {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfxb zzc;
    private final zzfvh zzd;
    private final zzfvc zze;
    private final boolean zzf;

    @Nullable
    private zzfwp zzg;
    private final Object zzh = new Object();

    public zzfxa(@NonNull Context context, @NonNull zzfxb zzfxbVar, @NonNull zzfvh zzfvhVar, @NonNull zzfvc zzfvcVar, boolean z10) {
        this.zzb = context;
        this.zzc = zzfxbVar;
        this.zzd = zzfvhVar;
        this.zze = zzfvcVar;
        this.zzf = z10;
    }

    private final synchronized Class zzd(@NonNull zzfwq zzfwqVar) throws zzfwz {
        try {
            if (zzfwqVar.zza() == null) {
                throw new zzfwz(4010, "mc");
            }
            String strZza = zzfwqVar.zza().zza();
            HashMap map = zza;
            Class cls = (Class) map.get(strZza);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.zze.zza(zzfwqVar.zzb())) {
                    throw new zzfwz(2026, "VM did not pass signature verification");
                }
                try {
                    File fileZzc = zzfwqVar.zzc();
                    if (!fileZzc.exists()) {
                        fileZzc.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(zzfwqVar.zzb().getAbsolutePath(), fileZzc.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strZza, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e10) {
                    e = e10;
                    throw new zzfwz(2008, e);
                } catch (IllegalArgumentException e11) {
                    e = e11;
                    throw new zzfwz(2008, e);
                } catch (SecurityException e12) {
                    e = e12;
                    throw new zzfwz(2008, e);
                }
            } catch (GeneralSecurityException e13) {
                throw new zzfwz(2026, e13);
            }
        } finally {
        }
    }

    public final boolean zza(@NonNull zzfwq zzfwqVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfwp zzfwpVar = new zzfwp(zzd(zzfwqVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfwqVar.zzd(), null, new Bundle(), 2), zzfwqVar, this.zzc, this.zzd, this.zzf);
                if (!zzfwpVar.zzf()) {
                    throw new zzfwz(4000, "init failed");
                }
                int iZzh = zzfwpVar.zzh();
                if (iZzh != 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzh).length() + 4);
                    sb2.append("ci: ");
                    sb2.append(iZzh);
                    throw new zzfwz(4001, sb2.toString());
                }
                synchronized (this.zzh) {
                    zzfwp zzfwpVar2 = this.zzg;
                    if (zzfwpVar2 != null) {
                        try {
                            zzfwpVar2.zzg();
                        } catch (zzfwz e10) {
                            this.zzd.zzc(e10.zza(), -1L, e10);
                        }
                        this.zzg = zzfwpVar;
                    } else {
                        this.zzg = zzfwpVar;
                    }
                }
                this.zzd.zzb(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e11) {
                throw new zzfwz(2004, e11);
            }
        } catch (zzfwz e12) {
            this.zzd.zzc(e12.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e12);
            return false;
        } catch (Exception e13) {
            this.zzd.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e13);
            return false;
        }
    }

    @Nullable
    public final zzfvk zzb() {
        zzfwp zzfwpVar;
        synchronized (this.zzh) {
            zzfwpVar = this.zzg;
        }
        return zzfwpVar;
    }

    @Nullable
    public final zzfwq zzc() {
        synchronized (this.zzh) {
            try {
                zzfwp zzfwpVar = this.zzg;
                if (zzfwpVar == null) {
                    return null;
                }
                return zzfwpVar.zze();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
