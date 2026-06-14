package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhbf {
    private final List zza = new ArrayList();
    private final zzhjr zzb = zzhjr.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzhbd) it.next()).zzd(false);
        }
    }

    public final zzhbf zza(zzhbd zzhbdVar) {
        if (zzhbdVar.zzh() != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzhbdVar.zzc()) {
            zzc();
        }
        zzhbdVar.zzi(this);
        this.zza.add(zzhbdVar);
        return this;
    }

    public final zzhbk zzb() throws GeneralSecurityException {
        int i10;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        List<zzhbd> list = this.zza;
        ArrayList arrayList = new ArrayList(list.size());
        int i11 = 0;
        while (i11 < list.size() - 1) {
            int i12 = i11 + 1;
            if (((zzhbd) list.get(i11)).zzg() == zzhbe.zza && ((zzhbd) list.get(i12)).zzg() != zzhbe.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i11 = i12;
        }
        HashSet hashSet = new HashSet();
        byte[] bArr = null;
        Integer num = null;
        for (zzhbd zzhbdVar : list) {
            zzhbdVar.zze();
            if (zzhbdVar.zzg() == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i13 = 3;
            if (zzhbdVar.zzg() == zzhbe.zza) {
                int i14 = 0;
                while (true) {
                    if (i14 != 0 && !hashSet.contains(Integer.valueOf(i14))) {
                        break;
                    }
                    int i15 = zzhln.zza;
                    i14 = 0;
                    while (i14 == 0) {
                        byte[] bArrZza = zzhle.zza(4);
                        i14 = (bArrZza[3] & 255) | ((bArrZza[0] & 255) << 24) | ((bArrZza[1] & 255) << 16) | ((bArrZza[2] & 255) << 8);
                    }
                }
                i10 = i14;
            } else {
                zzhbdVar.zzg();
                i10 = 0;
            }
            Integer numValueOf = Integer.valueOf(i10);
            if (hashSet.contains(numValueOf)) {
                int i16 = i10;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i16).length() + 31);
                sb2.append("Id ");
                sb2.append(i16);
                sb2.append(" is used twice in the keyset");
                throw new GeneralSecurityException(sb2.toString());
            }
            hashSet.add(numValueOf);
            zzhaz zzhazVarZzc = zzhjx.zza().zzc(zzhbdVar.zzf(), true != zzhbdVar.zzf().zza() ? null : numValueOf);
            zzhbb zzhbbVarZze = zzhbdVar.zze();
            zzhbb zzhbbVar = zzhbb.zza;
            if (!zzhbbVar.equals(zzhbbVarZze)) {
                if (zzhbb.zzb.equals(zzhbbVarZze)) {
                    i13 = 4;
                } else {
                    if (!zzhbb.zzc.equals(zzhbbVarZze)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i13 = 5;
                }
            }
            zzhbi zzhbiVar = new zzhbi(zzhazVarZzc, i13, i10, zzhbdVar.zzc(), false, zzhbi.zza, null);
            if (zzhbdVar.zzc()) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzhbdVar.zze() != zzhbbVar) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(zzhbiVar);
        }
        if (num != null) {
            return zzhbk.zzh(new zzhbk(arrayList, this.zzb, bArr));
        }
        throw new GeneralSecurityException("No primary was set");
    }
}
