package com.google.android.gms.internal.consent_sdk;

import com.mobilefuse.sdk.privacy.IabString;
import com.taurusx.tax.g.q;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzdw extends zzds implements Set, j$.util.Set {
    private transient zzdv zza;

    zzdw() {
    }

    static int zzf(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzdw zzi() {
        return zzdz.zza;
    }

    public static zzdw zzj(Object obj, Object obj2, Object obj3, Object obj4) {
        return zzm(4, "IABTCF_TCString", "IABGPP_HDR_GppString", q.f66282l, IabString.IAB_US_PRIVACY_STRING);
    }

    public static zzdw zzk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzm(5, "UMP_CoMoAdStoragePurposeConsentStatus", "UMP_CoMoAdUserDataPurposeConsentStatus", "UMP_CoMoAdPersonalizationPurposeConsentStatus", "UMP_CoMoAnalyticsStoragePurposeConsentStatus", "IABTCF_gdprApplies");
    }

    private static zzdw zzm(int i10, Object... objArr) {
        if (i10 == 0) {
            return zzdz.zza;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzea(obj);
        }
        int iZzf = zzf(i10);
        Object[] objArr2 = new Object[iZzf];
        int i11 = iZzf - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException("at index " + i14);
            }
            int iHashCode = obj2.hashCode();
            int iZza = zzdr.zza(iHashCode);
            while (true) {
                int i15 = iZza & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iZza++;
                }
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzea(obj4);
        }
        if (zzf(i13) < iZzf / 2) {
            return zzm(i13, objArr);
        }
        if (i13 < 3) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new zzdz(objArr, i12, objArr2, i11, i13);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzdw) && zzl() && ((zzdw) obj).zzl() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzeb iterator();

    public final zzdv zzg() {
        zzdv zzdvVar = this.zza;
        if (zzdvVar != null) {
            return zzdvVar;
        }
        zzdv zzdvVarZzh = zzh();
        this.zza = zzdvVarZzh;
        return zzdvVarZzh;
    }

    zzdv zzh() {
        Object[] array = toArray();
        int i10 = zzdv.zzd;
        return zzdv.zzg(array, array.length);
    }

    boolean zzl() {
        return false;
    }
}
