package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaok implements zzaqa {
    private final List zza;

    public zzaok(int i10, List list) {
        this.zza = list;
    }

    private final zzapq zzc(zzapz zzapzVar) {
        return new zzapq(zze(zzapzVar), "video/mp2t");
    }

    private final zzaqf zzd(zzapz zzapzVar) {
        return new zzaqf(zze(zzapzVar), "video/mp2t");
    }

    private final List zze(zzapz zzapzVar) {
        String str;
        int i10;
        List listSingletonList;
        zzer zzerVar = new zzer(zzapzVar.zze);
        List arrayList = this.zza;
        while (zzerVar.zzd() > 0) {
            int iZzs = zzerVar.zzs();
            int iZzg = zzerVar.zzg() + zzerVar.zzs();
            if (iZzs == 134) {
                arrayList = new ArrayList();
                int iZzs2 = zzerVar.zzs() & 31;
                for (int i11 = 0; i11 < iZzs2; i11++) {
                    String strZzK = zzerVar.zzK(3, StandardCharsets.UTF_8);
                    int iZzs3 = zzerVar.zzs();
                    boolean z10 = (iZzs3 & 128) != 0;
                    if (z10) {
                        i10 = iZzs3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bZzs = (byte) zzerVar.zzs();
                    zzerVar.zzk(1);
                    if (z10) {
                        int i12 = bZzs & SignedBytes.MAX_POWER_OF_TWO;
                        int i13 = zzdo.zza;
                        listSingletonList = Collections.singletonList(i12 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    zzt zztVar = new zzt();
                    zztVar.zzm(str);
                    zztVar.zze(strZzK);
                    zztVar.zzJ(i10);
                    zztVar.zzp(listSingletonList);
                    arrayList.add(zztVar.zzM());
                }
            }
            zzerVar.zzh(iZzg);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final SparseArray zza() {
        return new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    @Nullable
    public final zzaqc zzb(int i10, zzapz zzapzVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new zzapg(new zzaoz(zzapzVar.zzb, zzapzVar.zza(), "video/mp2t"));
            }
            if (i10 == 21) {
                return new zzapg(new zzaox("video/mp2t"));
            }
            if (i10 == 27) {
                return new zzapg(new zzaou(zzc(zzapzVar), false, false, "video/mp2t"));
            }
            if (i10 == 36) {
                return new zzapg(new zzaow(zzc(zzapzVar), "video/mp2t"));
            }
            if (i10 == 45) {
                return new zzapg(new zzapa("video/mp2t"));
            }
            if (i10 == 89) {
                return new zzapg(new zzaom(zzapzVar.zzd, "video/mp2t"));
            }
            if (i10 == 172) {
                return new zzapg(new zzaog(zzapzVar.zzb, zzapzVar.zza(), "video/mp2t"));
            }
            if (i10 == 257) {
                return new zzapo(new zzapf("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i10 != 128) {
                if (i10 != 129) {
                    if (i10 != 138) {
                        if (i10 == 139) {
                            return new zzapg(new zzaol(zzapzVar.zzb, zzapzVar.zza(), 5408, "video/mp2t"));
                        }
                        switch (i10) {
                            case 15:
                                return new zzapg(new zzaoj(false, zzapzVar.zzb, zzapzVar.zza(), "video/mp2t"));
                            case 16:
                                return new zzapg(new zzaos(zzd(zzapzVar), "video/mp2t"));
                            case 17:
                                return new zzapg(new zzaoy(zzapzVar.zzb, zzapzVar.zza(), "video/mp2t"));
                            default:
                                switch (i10) {
                                    case 134:
                                        return new zzapo(new zzapf("application/x-scte35", "video/mp2t"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                    }
                    return new zzapg(new zzaol(zzapzVar.zzb, zzapzVar.zza(), 4096, "video/mp2t"));
                }
                return new zzapg(new zzaod(zzapzVar.zzb, zzapzVar.zza(), "video/mp2t"));
            }
        }
        return new zzapg(new zzaop(zzd(zzapzVar), "video/mp2t"));
    }

    public zzaok() {
        this(0);
    }

    public zzaok(int i10) {
        this.zza = zzguf.zzi();
    }
}
