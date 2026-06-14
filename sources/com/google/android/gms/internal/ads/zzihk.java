package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzihk extends zzibr implements zzidd {
    private static final zzihk zzl;
    private static volatile zzidk zzm;
    private int zza;
    private int zzb;
    private zzigl zzd;
    private zzigp zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private zzibz zzg = zzibr.zzbC();
    private String zzh = "";
    private zzicd zzj = zzibr.zzbM();

    static {
        zzihk zzihkVar = new zzihk();
        zzl = zzihkVar;
        zzibr.zzbu(zzihk.class, zzihkVar);
    }

    private zzihk() {
    }

    public static zzihj zze() {
        return (zzihj) zzl.zzbn();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzj.size();
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzibmVar;
        byte[] bArr = null;
        switch (zzibqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzk);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzk = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzibr.zzbv(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzihh.zza, "zzj"});
            case NEW_MUTABLE_INSTANCE:
                return new zzihk();
            case NEW_BUILDER:
                return new zzihj(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzl;
            case GET_PARSER:
                zzidk zzidkVar = zzm;
                if (zzidkVar != null) {
                    return zzidkVar;
                }
                synchronized (zzihk.class) {
                    try {
                        zzibmVar = zzm;
                        if (zzibmVar == null) {
                            zzibmVar = new zzibm(zzl);
                            zzm = zzibmVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return zzibmVar;
            default:
                throw null;
        }
    }

    final /* synthetic */ void zzg(int i10) {
        this.zza |= 1;
        this.zzb = i10;
    }

    final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void zzi(zzigl zziglVar) {
        zziglVar.getClass();
        this.zzd = zziglVar;
        this.zza |= 4;
    }

    final /* synthetic */ void zzj(String str) {
        str.getClass();
        zzicd zzicdVar = this.zzj;
        if (!zzicdVar.zza()) {
            this.zzj = zzibr.zzbN(zzicdVar);
        }
        this.zzj.add(str);
    }

    final /* synthetic */ void zzl(int i10) {
        this.zzi = i10 - 1;
        this.zza |= 64;
    }
}
