package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zziar implements zzidp {
    private final zziaq zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zziar(zziaq zziaqVar) {
        zzice.zza(zziaqVar, "input");
        this.zza = zziaqVar;
        zziaqVar.zzd = this;
    }

    private final void zzQ(int i10) throws IOException {
        if ((this.zzb & 7) != i10) {
            throw new zzicf("Protocol message tag had invalid wire type.");
        }
    }

    private final void zzR(Object obj, zzidu zziduVar, zzibb zzibbVar) throws IOException {
        zziaq zziaqVar = this.zza;
        int iZzo = zziaqVar.zzo();
        zziaqVar.zzH();
        int iZzz = zziaqVar.zzz(iZzo);
        zziaqVar.zza++;
        zziduVar.zzg(obj, this, zzibbVar);
        zziaqVar.zzb(0);
        zziaqVar.zza--;
        zziaqVar.zzA(iZzz);
    }

    private final Object zzS(zzidu zziduVar, zzibb zzibbVar) throws IOException {
        Object objZza = zziduVar.zza();
        zzR(objZza, zziduVar, zzibbVar);
        zziduVar.zzk(objZza);
        return objZza;
    }

    private final void zzT(Object obj, zzidu zziduVar, zzibb zzibbVar) throws IOException {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zziduVar.zzg(obj, this, zzibbVar);
            if (this.zzb == this.zzc) {
            } else {
                throw new zzicg("Failed to parse the message.");
            }
        } finally {
            this.zzc = i10;
        }
    }

    private final Object zzU(zzies zziesVar, Class cls, zzibb zzibbVar) throws IOException {
        zzies zziesVar2 = zzies.zza;
        switch (zziesVar.ordinal()) {
            case 0:
                return Double.valueOf(zze());
            case 1:
                return Float.valueOf(zzf());
            case 2:
                return Long.valueOf(zzh());
            case 3:
                return Long.valueOf(zzg());
            case 4:
                return Integer.valueOf(zzi());
            case 5:
                return Long.valueOf(zzj());
            case 6:
                return Integer.valueOf(zzk());
            case 7:
                return Boolean.valueOf(zzl());
            case 8:
                return zzn();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                zzQ(2);
                return zzS(zzidm.zza().zzb(cls), zzibbVar);
            case 11:
                return zzq();
            case 12:
                return Integer.valueOf(zzr());
            case 13:
                return Integer.valueOf(zzs());
            case 14:
                return Integer.valueOf(zzt());
            case 15:
                return Long.valueOf(zzu());
            case 16:
                return Integer.valueOf(zzv());
            case 17:
                return Long.valueOf(zzw());
        }
    }

    private final void zzV(int i10) throws IOException {
        if (this.zza.zzC() != i10) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void zzW(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw new zzicg("Failed to parse the message.");
        }
    }

    private static final void zzX(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw new zzicg("Failed to parse the message.");
        }
    }

    public static zziar zza(zziaq zziaqVar) {
        Object obj = zziaqVar.zzd;
        return obj != null ? (zziar) obj : new zziar(zziaqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzA(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzicq) {
            zzicq zzicqVar = (zzicq) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int iZzC = zziaqVar.zzC() + zziaqVar.zzo();
                do {
                    zzicqVar.zzd(zziaqVar.zzg());
                } while (zziaqVar.zzC() < iZzC);
                zzV(iZzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzicqVar.zzd(zziaqVar2.zzg());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zziaqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int iZzC2 = zziaqVar3.zzC() + zziaqVar3.zzo();
                do {
                    list.add(Long.valueOf(zziaqVar3.zzg()));
                } while (zziaqVar3.zzC() < iZzC2);
                zzV(iZzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Long.valueOf(zziaqVar4.zzg()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    iZza = zziaqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzB(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int iZzC = zziaqVar.zzC() + zziaqVar.zzo();
                do {
                    zzibsVar.zzi(zziaqVar.zzh());
                } while (zziaqVar.zzC() < iZzC);
                zzV(iZzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzibsVar.zzi(zziaqVar2.zzh());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zziaqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int iZzC2 = zziaqVar3.zzC() + zziaqVar3.zzo();
                do {
                    list.add(Integer.valueOf(zziaqVar3.zzh()));
                } while (zziaqVar3.zzC() < iZzC2);
                zzV(iZzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Integer.valueOf(zziaqVar4.zzh()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    iZza = zziaqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzC(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzicq) {
            zzicq zzicqVar = (zzicq) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int iZzo = zziaqVar.zzo();
                zzX(iZzo);
                int iZzC = zziaqVar.zzC() + iZzo;
                do {
                    zzicqVar.zzd(zziaqVar.zzi());
                } while (zziaqVar.zzC() < iZzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzicqVar.zzd(zziaqVar2.zzi());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zziaqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int iZzo2 = zziaqVar3.zzo();
                zzX(iZzo2);
                int iZzC2 = zziaqVar3.zzC() + iZzo2;
                do {
                    list.add(Long.valueOf(zziaqVar3.zzi()));
                } while (zziaqVar3.zzC() < iZzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Long.valueOf(zziaqVar4.zzi()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    iZza = zziaqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzD(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                zziaq zziaqVar = this.zza;
                int iZzo = zziaqVar.zzo();
                zzW(iZzo);
                int iZzC = zziaqVar.zzC() + iZzo;
                do {
                    zzibsVar.zzi(zziaqVar.zzj());
                } while (zziaqVar.zzC() < iZzC);
                return;
            }
            if (i10 != 5) {
                throw new zzicf("Protocol message tag had invalid wire type.");
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzibsVar.zzi(zziaqVar2.zzj());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zziaqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                zziaq zziaqVar3 = this.zza;
                int iZzo2 = zziaqVar3.zzo();
                zzW(iZzo2);
                int iZzC2 = zziaqVar3.zzC() + iZzo2;
                do {
                    list.add(Integer.valueOf(zziaqVar3.zzj()));
                } while (zziaqVar3.zzC() < iZzC2);
                return;
            }
            if (i11 != 5) {
                throw new zzicf("Protocol message tag had invalid wire type.");
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Integer.valueOf(zziaqVar4.zzj()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    iZza = zziaqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzE(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zziad) {
            zziad zziadVar = (zziad) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int iZzC = zziaqVar.zzC() + zziaqVar.zzo();
                do {
                    zziadVar.zzg(zziaqVar.zzk());
                } while (zziaqVar.zzC() < iZzC);
                zzV(iZzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zziadVar.zzg(zziaqVar2.zzk());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zziaqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int iZzC2 = zziaqVar3.zzC() + zziaqVar3.zzo();
                do {
                    list.add(Boolean.valueOf(zziaqVar3.zzk()));
                } while (zziaqVar3.zzC() < iZzC2);
                zzV(iZzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Boolean.valueOf(zziaqVar4.zzk()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    iZza = zziaqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    public final void zzF(List list, boolean z10) throws IOException {
        int iZza;
        int iZza2;
        if ((this.zzb & 7) != 2) {
            throw new zzicf("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof zzicn) && !z10) {
            zzicn zzicnVar = (zzicn) list;
            do {
                zzq();
                zzicnVar.zzb();
                zziaq zziaqVar = this.zza;
                if (zziaqVar.zzB()) {
                    return;
                } else {
                    iZza2 = zziaqVar.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            do {
                list.add(z10 ? zzn() : zzm());
                zziaq zziaqVar2 = this.zza;
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    iZza = zziaqVar2.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzG(List list, zzidu zziduVar, zzibb zzibbVar) throws IOException {
        int iZza;
        int i10 = this.zzb;
        if ((i10 & 7) != 2) {
            throw new zzicf("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzS(zziduVar, zzibbVar));
            zziaq zziaqVar = this.zza;
            if (zziaqVar.zzB() || this.zzd != 0) {
                return;
            } else {
                iZza = zziaqVar.zza();
            }
        } while (iZza == i10);
        this.zzd = iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    @Deprecated
    public final void zzH(List list, zzidu zziduVar, zzibb zzibbVar) throws IOException {
        int iZza;
        int i10 = this.zzb;
        if ((i10 & 7) != 3) {
            throw new zzicf("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZza = zziduVar.zza();
            zzT(objZza, zziduVar, zzibbVar);
            zziduVar.zzk(objZza);
            list.add(objZza);
            zziaq zziaqVar = this.zza;
            if (zziaqVar.zzB() || this.zzd != 0) {
                return;
            } else {
                iZza = zziaqVar.zza();
            }
        } while (iZza == i10);
        this.zzd = iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzI(List list) throws IOException {
        int iZza;
        if ((this.zzb & 7) != 2) {
            throw new zzicf("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzq());
            zziaq zziaqVar = this.zza;
            if (zziaqVar.zzB()) {
                return;
            } else {
                iZza = zziaqVar.zza();
            }
        } while (iZza == this.zzb);
        this.zzd = iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzJ(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int iZzC = zziaqVar.zzC() + zziaqVar.zzo();
                do {
                    zzibsVar.zzi(zziaqVar.zzo());
                } while (zziaqVar.zzC() < iZzC);
                zzV(iZzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzibsVar.zzi(zziaqVar2.zzo());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zziaqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int iZzC2 = zziaqVar3.zzC() + zziaqVar3.zzo();
                do {
                    list.add(Integer.valueOf(zziaqVar3.zzo()));
                } while (zziaqVar3.zzC() < iZzC2);
                zzV(iZzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Integer.valueOf(zziaqVar4.zzo()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    iZza = zziaqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzK(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int iZzC = zziaqVar.zzC() + zziaqVar.zzo();
                do {
                    zzibsVar.zzi(zziaqVar.zzp());
                } while (zziaqVar.zzC() < iZzC);
                zzV(iZzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzibsVar.zzi(zziaqVar2.zzp());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zziaqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int iZzC2 = zziaqVar3.zzC() + zziaqVar3.zzo();
                do {
                    list.add(Integer.valueOf(zziaqVar3.zzp()));
                } while (zziaqVar3.zzC() < iZzC2);
                zzV(iZzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Integer.valueOf(zziaqVar4.zzp()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    iZza = zziaqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzL(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                zziaq zziaqVar = this.zza;
                int iZzo = zziaqVar.zzo();
                zzW(iZzo);
                int iZzC = zziaqVar.zzC() + iZzo;
                do {
                    zzibsVar.zzi(zziaqVar.zzq());
                } while (zziaqVar.zzC() < iZzC);
                return;
            }
            if (i10 != 5) {
                throw new zzicf("Protocol message tag had invalid wire type.");
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzibsVar.zzi(zziaqVar2.zzq());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zziaqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                zziaq zziaqVar3 = this.zza;
                int iZzo2 = zziaqVar3.zzo();
                zzW(iZzo2);
                int iZzC2 = zziaqVar3.zzC() + iZzo2;
                do {
                    list.add(Integer.valueOf(zziaqVar3.zzq()));
                } while (zziaqVar3.zzC() < iZzC2);
                return;
            }
            if (i11 != 5) {
                throw new zzicf("Protocol message tag had invalid wire type.");
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Integer.valueOf(zziaqVar4.zzq()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    iZza = zziaqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzM(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzicq) {
            zzicq zzicqVar = (zzicq) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int iZzo = zziaqVar.zzo();
                zzX(iZzo);
                int iZzC = zziaqVar.zzC() + iZzo;
                do {
                    zzicqVar.zzd(zziaqVar.zzr());
                } while (zziaqVar.zzC() < iZzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzicqVar.zzd(zziaqVar2.zzr());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zziaqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int iZzo2 = zziaqVar3.zzo();
                zzX(iZzo2);
                int iZzC2 = zziaqVar3.zzC() + iZzo2;
                do {
                    list.add(Long.valueOf(zziaqVar3.zzr()));
                } while (zziaqVar3.zzC() < iZzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Long.valueOf(zziaqVar4.zzr()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    iZza = zziaqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzN(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int iZzC = zziaqVar.zzC() + zziaqVar.zzo();
                do {
                    zzibsVar.zzi(zziaqVar.zzs());
                } while (zziaqVar.zzC() < iZzC);
                zzV(iZzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzibsVar.zzi(zziaqVar2.zzs());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zziaqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int iZzC2 = zziaqVar3.zzC() + zziaqVar3.zzo();
                do {
                    list.add(Integer.valueOf(zziaqVar3.zzs()));
                } while (zziaqVar3.zzC() < iZzC2);
                zzV(iZzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Integer.valueOf(zziaqVar4.zzs()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    iZza = zziaqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzO(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzicq) {
            zzicq zzicqVar = (zzicq) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int iZzC = zziaqVar.zzC() + zziaqVar.zzo();
                do {
                    zzicqVar.zzd(zziaqVar.zzt());
                } while (zziaqVar.zzC() < iZzC);
                zzV(iZzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzicqVar.zzd(zziaqVar2.zzt());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zziaqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int iZzC2 = zziaqVar3.zzC() + zziaqVar3.zzo();
                do {
                    list.add(Long.valueOf(zziaqVar3.zzt()));
                } while (zziaqVar3.zzC() < iZzC2);
                zzV(iZzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Long.valueOf(zziaqVar4.zzt()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    iZza = zziaqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        r10.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        r9.zza.zzA(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        return;
     */
    @Override // com.google.android.gms.internal.ads.zzidp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzP(java.util.Map r10, com.google.android.gms.internal.ads.zzicu r11, com.google.android.gms.internal.ads.zzibb r12) throws java.io.IOException {
        /*
            r9 = this;
            r0 = 2
            r9.zzQ(r0)
            com.google.android.gms.internal.ads.zziaq r1 = r9.zza
            int r2 = r1.zzo()
            int r2 = r1.zzz(r2)
            java.lang.Object r3 = r11.zzd
            java.lang.Object r4 = r11.zzb
            r5 = r3
        L13:
            int r6 = r9.zzb()     // Catch: java.lang.Throwable -> L37
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L5b
            boolean r7 = r1.zzB()     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L23
            goto L5b
        L23:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L46
            if (r6 == r0) goto L3b
            boolean r6 = r9.zzd()     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzicf -> L39
            if (r6 == 0) goto L31
            goto L13
        L31:
            com.google.android.gms.internal.ads.zzicg r6 = new com.google.android.gms.internal.ads.zzicg     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzicf -> L39
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzicf -> L39
            throw r6     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzicf -> L39
        L37:
            r10 = move-exception
            goto L64
        L39:
            r6 = move-exception
            goto L4e
        L3b:
            com.google.android.gms.internal.ads.zzies r6 = r11.zzc     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzicf -> L39
            java.lang.Class r7 = r3.getClass()     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzicf -> L39
            java.lang.Object r5 = r9.zzU(r6, r7, r12)     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzicf -> L39
            goto L13
        L46:
            com.google.android.gms.internal.ads.zzies r6 = r11.zza     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzicf -> L39
            r7 = 0
            java.lang.Object r4 = r9.zzU(r6, r7, r7)     // Catch: java.lang.Throwable -> L37 com.google.android.gms.internal.ads.zzicf -> L39
            goto L13
        L4e:
            boolean r7 = r9.zzd()     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L55
            goto L13
        L55:
            com.google.android.gms.internal.ads.zzicg r10 = new com.google.android.gms.internal.ads.zzicg     // Catch: java.lang.Throwable -> L37
            r10.<init>(r8, r6)     // Catch: java.lang.Throwable -> L37
            throw r10     // Catch: java.lang.Throwable -> L37
        L5b:
            r10.put(r4, r5)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zziaq r10 = r9.zza
            r10.zzA(r2)
            return
        L64:
            com.google.android.gms.internal.ads.zziaq r11 = r9.zza
            r11.zzA(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zziar.zzP(java.util.Map, com.google.android.gms.internal.ads.zzicu, com.google.android.gms.internal.ads.zzibb):void");
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzb() throws IOException {
        int iZza = this.zzd;
        if (iZza != 0) {
            this.zzb = iZza;
            this.zzd = 0;
        } else {
            iZza = this.zza.zza();
            this.zzb = iZza;
        }
        if (iZza == 0 || iZza == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return iZza >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzc() {
        return this.zzb;
    }

    public final boolean zzd() throws IOException {
        int i10;
        zziaq zziaqVar = this.zza;
        if (zziaqVar.zzB() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return zziaqVar.zzc(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final double zze() throws IOException {
        zzQ(1);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final float zzf() throws IOException {
        zzQ(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final long zzg() throws IOException {
        zzQ(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final long zzh() throws IOException {
        zzQ(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzi() throws IOException {
        zzQ(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final long zzj() throws IOException {
        zzQ(1);
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzk() throws IOException {
        zzQ(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final boolean zzl() throws IOException {
        zzQ(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final String zzm() throws IOException {
        zzQ(2);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final String zzn() throws IOException {
        zzQ(2);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzo(Object obj, zzidu zziduVar, zzibb zzibbVar) throws IOException {
        zzQ(2);
        zzR(obj, zziduVar, zzibbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzp(Object obj, zzidu zziduVar, zzibb zzibbVar) throws IOException {
        zzQ(3);
        zzT(obj, zziduVar, zzibbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final zzian zzq() throws IOException {
        zzQ(2);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzr() throws IOException {
        zzQ(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzs() throws IOException {
        zzQ(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzt() throws IOException {
        zzQ(5);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final long zzu() throws IOException {
        zzQ(1);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final int zzv() throws IOException {
        zzQ(0);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final long zzw() throws IOException {
        zzQ(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzx(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zziay) {
            zziay zziayVar = (zziay) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int iZzo = zziaqVar.zzo();
                zzX(iZzo);
                int iZzC = zziaqVar.zzC() + iZzo;
                do {
                    zziayVar.zzg(zziaqVar.zzd());
                } while (zziaqVar.zzC() < iZzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zziayVar.zzg(zziaqVar2.zzd());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zziaqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int iZzo2 = zziaqVar3.zzo();
                zzX(iZzo2);
                int iZzC2 = zziaqVar3.zzC() + iZzo2;
                do {
                    list.add(Double.valueOf(zziaqVar3.zzd()));
                } while (zziaqVar3.zzC() < iZzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Double.valueOf(zziaqVar4.zzd()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    iZza = zziaqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzy(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzibi) {
            zzibi zzibiVar = (zzibi) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                zziaq zziaqVar = this.zza;
                int iZzo = zziaqVar.zzo();
                zzW(iZzo);
                int iZzC = zziaqVar.zzC() + iZzo;
                do {
                    zzibiVar.zzg(zziaqVar.zze());
                } while (zziaqVar.zzC() < iZzC);
                return;
            }
            if (i10 != 5) {
                throw new zzicf("Protocol message tag had invalid wire type.");
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzibiVar.zzg(zziaqVar2.zze());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zziaqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                zziaq zziaqVar3 = this.zza;
                int iZzo2 = zziaqVar3.zzo();
                zzW(iZzo2);
                int iZzC2 = zziaqVar3.zzC() + iZzo2;
                do {
                    list.add(Float.valueOf(zziaqVar3.zze()));
                } while (zziaqVar3.zzC() < iZzC2);
                return;
            }
            if (i11 != 5) {
                throw new zzicf("Protocol message tag had invalid wire type.");
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Float.valueOf(zziaqVar4.zze()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    iZza = zziaqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzidp
    public final void zzz(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzicq) {
            zzicq zzicqVar = (zzicq) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar = this.zza;
                int iZzC = zziaqVar.zzC() + zziaqVar.zzo();
                do {
                    zzicqVar.zzd(zziaqVar.zzf());
                } while (zziaqVar.zzC() < iZzC);
                zzV(iZzC);
                return;
            }
            do {
                zziaq zziaqVar2 = this.zza;
                zzicqVar.zzd(zziaqVar2.zzf());
                if (zziaqVar2.zzB()) {
                    return;
                } else {
                    iZza2 = zziaqVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzicf("Protocol message tag had invalid wire type.");
                }
                zziaq zziaqVar3 = this.zza;
                int iZzC2 = zziaqVar3.zzC() + zziaqVar3.zzo();
                do {
                    list.add(Long.valueOf(zziaqVar3.zzf()));
                } while (zziaqVar3.zzC() < iZzC2);
                zzV(iZzC2);
                return;
            }
            do {
                zziaq zziaqVar4 = this.zza;
                list.add(Long.valueOf(zziaqVar4.zzf()));
                if (zziaqVar4.zzB()) {
                    return;
                } else {
                    iZza = zziaqVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }
}
