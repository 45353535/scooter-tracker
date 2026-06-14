package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzary implements Comparable {
    private final zzasj zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;

    @Nullable
    @GuardedBy("mLock")
    private final zzasc zzf;
    private Integer zzg;
    private zzasb zzh;

    @GuardedBy("mLock")
    private boolean zzi;

    @Nullable
    private zzarh zzj;

    @GuardedBy("mLock")
    private zzarx zzk;
    private final zzarm zzl;

    public zzary(int i10, String str, @Nullable zzasc zzascVar) {
        Uri uri;
        String host;
        this.zza = zzasj.zza ? new zzasj() : null;
        this.zze = new Object();
        int iHashCode = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i10;
        this.zzc = str;
        this.zzf = zzascVar;
        this.zzl = new zzarm();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.zzd = iHashCode;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzary) obj).zzg.intValue();
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzl();
        Integer num = this.zzg;
        String str = this.zzc;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String strConcat = "0x".concat(strValueOf);
        StringBuilder sb2 = new StringBuilder(length + 5 + strConcat.length() + 8 + length2);
        sb2.append("[ ] ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(strConcat);
        sb2.append(" NORMAL ");
        sb2.append(num);
        return sb2.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final void zzc(String str) {
        if (zzasj.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    final void zzd(String str) {
        zzasb zzasbVar = this.zzh;
        if (zzasbVar != null) {
            zzasbVar.zzc(this);
        }
        if (zzasj.zza) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzarw(this, str, id2));
                return;
            }
            zzasj zzasjVar = this.zza;
            zzasjVar.zza(str, id2);
            zzasjVar.zzb(toString());
        }
    }

    final void zze(int i10) {
        zzasb zzasbVar = this.zzh;
        if (zzasbVar != null) {
            zzasbVar.zzd(this, i10);
        }
    }

    public final zzary zzf(zzasb zzasbVar) {
        this.zzh = zzasbVar;
        return this;
    }

    public final zzary zzg(int i10) {
        this.zzg = Integer.valueOf(i10);
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final String zzi() {
        int i10 = this.zzb;
        String str = this.zzc;
        if (i10 == 0) {
            return str;
        }
        String string = Integer.toString(1);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length());
        sb2.append(string);
        sb2.append(TokenBuilder.TOKEN_DELIMITER);
        sb2.append(str);
        return sb2.toString();
    }

    public final zzary zzj(zzarh zzarhVar) {
        this.zzj = zzarhVar;
        return this;
    }

    @Nullable
    public final zzarh zzk() {
        return this.zzj;
    }

    public final boolean zzl() {
        synchronized (this.zze) {
        }
        return false;
    }

    public Map zzm() throws zzarg {
        return Collections.EMPTY_MAP;
    }

    public byte[] zzn() throws zzarg {
        return null;
    }

    public final int zzo() {
        return this.zzl.zza();
    }

    public final void zzp() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final boolean zzq() {
        boolean z10;
        synchronized (this.zze) {
            z10 = this.zzi;
        }
        return z10;
    }

    protected abstract zzase zzr(zzaru zzaruVar);

    protected abstract void zzs(Object obj);

    public final void zzt(zzash zzashVar) {
        zzasc zzascVar;
        synchronized (this.zze) {
            zzascVar = this.zzf;
        }
        zzascVar.zza(zzashVar);
    }

    final void zzu(zzarx zzarxVar) {
        synchronized (this.zze) {
            this.zzk = zzarxVar;
        }
    }

    final void zzv(zzase zzaseVar) {
        zzarx zzarxVar;
        synchronized (this.zze) {
            zzarxVar = this.zzk;
        }
        if (zzarxVar != null) {
            zzarxVar.zza(this, zzaseVar);
        }
    }

    final void zzw() {
        zzarx zzarxVar;
        synchronized (this.zze) {
            zzarxVar = this.zzk;
        }
        if (zzarxVar != null) {
            zzarxVar.zzb(this);
        }
    }

    final /* synthetic */ zzasj zzx() {
        return this.zza;
    }

    public final zzarm zzy() {
        return this.zzl;
    }
}
