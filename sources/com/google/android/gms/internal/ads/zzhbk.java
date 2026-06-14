package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhbk implements zzhjj {
    private final List zza;
    private final zzhjr zzb;
    private final zzhbk zzc;

    private zzhbk(List list, zzhjr zzhjrVar, zzhbk zzhbkVar) {
        this.zza = list;
        this.zzb = zzhjrVar;
        this.zzc = zzhbkVar;
    }

    static final zzhbk zza(zzhql zzhqlVar) throws GeneralSecurityException {
        if (zzhqlVar == null || zzhqlVar.zzc() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzhbk(zzi(zzhqlVar), zzhjr.zza);
    }

    public static final zzhbk zzf(zzhbp zzhbpVar) throws GeneralSecurityException {
        zzhbf zzhbfVar = new zzhbf();
        zzhbd zzhbdVar = new zzhbd(zzhbpVar, null);
        zzhbdVar.zzb();
        zzhbdVar.zza();
        zzhbfVar.zza(zzhbdVar);
        return zzhbfVar.zzb();
    }

    static /* synthetic */ zzhbk zzh(final zzhbk zzhbkVar) {
        final zzhjr zzhjrVar = zzhbkVar.zzb;
        if (zzhjrVar.zza()) {
            return zzhbkVar;
        }
        zzhbg zzhbgVar = new zzhbg() { // from class: com.google.android.gms.internal.ads.zzhbj
            @Override // com.google.android.gms.internal.ads.zzhbg
            public final /* synthetic */ void zza(zzhbi zzhbiVar) {
                zzhkb.zza().zzb().zza(this.zza, zzhjrVar, "keyset_handle", "get_key");
            }
        };
        List<zzhbi> list = zzhbkVar.zza;
        ArrayList arrayList = new ArrayList(list.size());
        for (zzhbi zzhbiVar : list) {
            arrayList.add(new zzhbi(zzhbiVar.zzf(), zzhbiVar.zzj(), zzhbiVar.zzg(), zzhbiVar.zzh(), zzhbiVar.zzi(), zzhbgVar, null));
        }
        return new zzhbk(arrayList, zzhjrVar, zzhbkVar);
    }

    private static List zzi(zzhql zzhqlVar) throws GeneralSecurityException {
        zzhaz zzhjoVar;
        boolean z10;
        ArrayList arrayList = new ArrayList(zzhqlVar.zzc());
        for (zzhqk zzhqkVar : zzhqlVar.zzb()) {
            int iZzc = zzhqkVar.zzc();
            try {
                zzhlb zzhlbVarZzk = zzk(zzhqkVar);
                zzhkg zzhkgVarZza = zzhkg.zza();
                zzhbt zzhbtVarZza = zzhbt.zza();
                zzhjoVar = !zzhkgVarZza.zzf(zzhlbVarZzk) ? new zzhjo(zzhlbVarZzk, zzhbtVarZza) : zzhkgVarZza.zzg(zzhlbVarZzk, zzhbtVarZza);
                z10 = false;
            } catch (GeneralSecurityException e10) {
                if (zzhib.zza.zza()) {
                    throw e10;
                }
                zzhjoVar = new zzhjo(zzk(zzhqkVar), zzhbt.zza());
                z10 = true;
            }
            if (zzhib.zza.zza() && !zzl(zzhqkVar.zzk())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            boolean z11 = true;
            int iZzk = zzhqkVar.zzk();
            if (iZzc != zzhqlVar.zza()) {
                z11 = false;
            }
            arrayList.add(new zzhbi(zzhjoVar, iZzk, iZzc, z11, z10, zzhbi.zza, null));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private final zzhbk zzj() {
        zzhbk zzhbkVar = this.zzc;
        return zzhbkVar == null ? this : zzhbkVar;
    }

    private static zzhlb zzk(zzhqk zzhqkVar) throws GeneralSecurityException {
        return zzhlb.zza(zzhqkVar.zzb().zza(), zzhqkVar.zzb().zzb(), zzhqkVar.zzb().zzc(), zzhqkVar.zzd(), zzhqkVar.zzd() == zzhqy.RAW ? null : Integer.valueOf(zzhqkVar.zzc()));
    }

    private static boolean zzl(int i10) {
        int i11 = i10 - 2;
        return i11 == 1 || i11 == 2 || i11 == 3;
    }

    public final String toString() {
        zzhql zzhqlVarZzb = zzb();
        int i10 = zzhbw.zza;
        zzhqm zzhqmVarZza = zzhqp.zza();
        zzhqmVarZza.zza(zzhqlVarZzb.zza());
        for (zzhqk zzhqkVar : zzhqlVarZzb.zzb()) {
            zzhqn zzhqnVarZza = zzhqo.zza();
            zzhqnVarZza.zza(zzhqkVar.zzb().zza());
            zzhqnVarZza.zzd(zzhqkVar.zzk());
            zzhqnVarZza.zzc(zzhqkVar.zzd());
            zzhqnVarZza.zzb(zzhqkVar.zzc());
            zzhqmVarZza.zzb((zzhqo) zzhqnVarZza.zzbu());
        }
        return ((zzhqp) zzhqmVarZza.zzbu()).toString();
    }

    final zzhql zzb() {
        try {
            zzhqi zzhqiVarZzh = zzhql.zzh();
            for (zzhbi zzhbiVar : this.zza) {
                zzhaz zzhazVarZza = zzhbiVar.zza();
                int iZzj = zzhbiVar.zzj();
                int iZzc = zzhbiVar.zzc();
                zzhlb zzhlbVar = (zzhlb) zzhkg.zza().zzh(zzhazVarZza, zzhlb.class, zzhbt.zza());
                Integer numZzb = zzhazVarZza.zzb();
                if (numZzb != null && numZzb.intValue() != iZzc) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                zzhqj zzhqjVarZze = zzhqk.zze();
                zzhqa zzhqaVarZzd = zzhqc.zzd();
                zzhqaVarZzd.zza(zzhlbVar.zzg());
                zzhqaVarZzd.zzb(zzhlbVar.zzb());
                zzhqaVarZzd.zzc(zzhlbVar.zzc());
                zzhqjVarZze.zzb(zzhqaVarZzd);
                zzhqjVarZze.zze(iZzj);
                zzhqjVarZze.zzc(iZzc);
                zzhqjVarZze.zzd(zzhlbVar.zzd());
                zzhqiVarZzh.zzb((zzhqk) zzhqjVarZze.zzbu());
                if (zzhbiVar.zzd()) {
                    zzhqiVarZzh.zza(zzhbiVar.zzc());
                }
            }
            return (zzhql) zzhqiVarZzh.zzbu();
        } catch (GeneralSecurityException e10) {
            throw new zzhlm(e10);
        }
    }

    public final zzhbi zzc() {
        for (zzhbi zzhbiVar : this.zza) {
            if (zzhbiVar != null && zzhbiVar.zzd()) {
                if (zzhbiVar.zzb() == zzhbb.zza) {
                    return zzhbiVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    @Override // com.google.android.gms.internal.ads.zzhjj
    public final int zzd() {
        return this.zza.size();
    }

    public final zzhbi zze(int i10) {
        if (i10 < 0 || i10 >= zzd()) {
            int iZzd = zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 34 + String.valueOf(iZzd).length());
            sb2.append("Invalid index ");
            sb2.append(i10);
            sb2.append(" for keyset of size ");
            sb2.append(iZzd);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        List list = this.zza;
        zzhbi zzhbiVar = (zzhbi) list.get(i10);
        if (!zzl(zzhbiVar.zzj())) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 42);
            sb3.append("Keyset-Entry at position ");
            sb3.append(i10);
            sb3.append(" has wrong status");
            throw new IllegalStateException(sb3.toString());
        }
        if (!zzhbiVar.zzi()) {
            return (zzhbi) list.get(i10);
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i10).length() + 48);
        sb4.append("Keyset-Entry at position ");
        sb4.append(i10);
        sb4.append(" didn't parse correctly");
        throw new IllegalStateException(sb4.toString());
    }

    public final Object zzg(zzhaw zzhawVar, Class cls) throws GeneralSecurityException {
        if (!(zzhawVar instanceof zzhix)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        zzhix zzhixVar = (zzhix) zzhawVar;
        zzhql zzhqlVarZzb = zzj().zzb();
        int i10 = zzhbw.zza;
        int iZza = zzhqlVarZzb.zza();
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (zzhqk zzhqkVar : zzhqlVarZzb.zzb()) {
            if (zzhqkVar.zzk() == 3) {
                if (!zzhqkVar.zza()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzhqkVar.zzc())));
                }
                if (zzhqkVar.zzd() == zzhqy.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzhqkVar.zzc())));
                }
                if (zzhqkVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzhqkVar.zzc())));
                }
                if (zzhqkVar.zzc() == iZza) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                z11 &= zzhqkVar.zzb().zzc() == zzhqb.ASYMMETRIC_PUBLIC;
                i11++;
            }
        }
        if (i11 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i12 = 0; i12 < zzd(); i12++) {
            List list = this.zza;
            if (((zzhbi) list.get(i12)).zzi() || !zzl(((zzhbi) list.get(i12)).zzj())) {
                String strZza = zzhqlVarZzb.zzd(i12).zzb().zza();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 44 + String.valueOf(strZza).length() + 32);
                sb2.append("Key parsing of key with index ");
                sb2.append(i12);
                sb2.append(" and type_url ");
                sb2.append(strZza);
                sb2.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb2.toString());
            }
        }
        return zzhixVar.zza(zzj(), this.zzb, cls);
    }

    /* synthetic */ zzhbk(List list, zzhjr zzhjrVar, byte[] bArr) {
        this(list, zzhjrVar);
    }

    private zzhbk(List list, zzhjr zzhjrVar) throws GeneralSecurityException {
        this.zza = list;
        this.zzb = zzhjrVar;
        if (zzhib.zza.zza()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean zZzd = false;
            while (it.hasNext()) {
                zzhbi zzhbiVar = (zzhbi) it.next();
                if (!hashSet.contains(Integer.valueOf(zzhbiVar.zzc()))) {
                    hashSet.add(Integer.valueOf(zzhbiVar.zzc()));
                    zZzd |= zzhbiVar.zzd();
                } else {
                    int iZzc = zzhbiVar.zzc();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzc).length() + 121);
                    sb2.append("KeyID ");
                    sb2.append(iZzc);
                    sb2.append(" is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                    throw new GeneralSecurityException(sb2.toString());
                }
            }
            if (!zZzd) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = null;
    }
}
