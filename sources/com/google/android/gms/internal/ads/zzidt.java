package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzidt extends zzian {
    static final int[] zzb = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzian zzd;
    private final zzian zze;
    private final int zzf;
    private final int zzg;

    /* synthetic */ zzidt(zzian zzianVar, zzian zzianVar2, byte[] bArr) {
        this(zzianVar, zzianVar2);
    }

    private static zzian zzF(zzian zzianVar, zzian zzianVar2) {
        int iZzc = zzianVar.zzc();
        int iZzc2 = zzianVar2.zzc();
        byte[] bArr = new byte[iZzc + iZzc2];
        zzianVar.zzx(bArr, 0, 0, iZzc);
        zzianVar2.zzx(bArr, 0, iZzc, iZzc2);
        return zzian.zzu(bArr);
    }

    static zzian zzk(zzian zzianVar, zzian zzianVar2) {
        if (zzianVar2.zzc() == 0) {
            return zzianVar;
        }
        if (zzianVar.zzc() == 0) {
            return zzianVar2;
        }
        int iZzc = zzianVar.zzc() + zzianVar2.zzc();
        if (iZzc < 128) {
            return zzF(zzianVar, zzianVar2);
        }
        if (zzianVar instanceof zzidt) {
            zzidt zzidtVar = (zzidt) zzianVar;
            zzian zzianVar3 = zzidtVar.zze;
            if (zzianVar3.zzc() + zzianVar2.zzc() < 128) {
                return new zzidt(zzidtVar.zzd, zzF(zzianVar3, zzianVar2));
            }
            zzian zzianVar4 = zzidtVar.zzd;
            if (zzianVar4.zzp() > zzianVar3.zzp() && zzidtVar.zzg > zzianVar2.zzp()) {
                return new zzidt(zzianVar4, new zzidt(zzianVar3, zzianVar2));
            }
        }
        return iZzc >= zzn(Math.max(zzianVar.zzp(), zzianVar2.zzp()) + 1) ? new zzidt(zzianVar, zzianVar2) : zzidr.zza(zzianVar, zzianVar2, new ArrayDeque());
    }

    static int zzn(int i10) {
        int[] iArr = zzb;
        int length = iArr.length;
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzian, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzidq(this);
    }

    final /* synthetic */ zzian zzE() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final byte zza(int i10) {
        zzian.zzB(i10, this.zzc);
        return zzb(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    final byte zzb(int i10) {
        int i11 = this.zzf;
        return i10 < i11 ? this.zzd.zzb(i10) : this.zze.zzb(i10 - i11);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zzian zzd(int i10, int i11) {
        int i12 = this.zzc;
        int iZzC = zzian.zzC(i10, i11, i12);
        if (iZzC == 0) {
            return zzian.zza;
        }
        if (iZzC == i12) {
            return this;
        }
        int i13 = this.zzf;
        if (i11 <= i13) {
            return this.zzd.zzd(i10, i11);
        }
        int i14 = i11 - i13;
        if (i10 >= i13) {
            return this.zze.zzd(i10 - i13, i14);
        }
        zzian zzianVar = this.zzd;
        return new zzidt(zzianVar.zzd(i10, zzianVar.zzc()), this.zze.zzd(0, i14));
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final void zze(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            this.zzd.zze(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.zze.zze(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.zzd.zze(bArr, i10, i11, i15);
            this.zze.zze(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final ByteBuffer zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    final void zzg(zziae zziaeVar) throws IOException {
        this.zzd.zzg(zziaeVar);
        this.zze.zzg(zziaeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final String zzh(Charset charset) {
        return new String(zzy(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzi() {
        zzids zzidsVar = new zzids(this, null);
        while (zzidsVar.hasNext()) {
            if (!zzidsVar.next().zzi()) {
                return zzier.zza(zzy());
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzj(zzian zzianVar) {
        byte[] bArr = null;
        zzids zzidsVar = new zzids(this, bArr);
        zziak zziakVarZza = zzidsVar.next();
        zzids zzidsVar2 = new zzids(zzianVar, bArr);
        zziak zziakVarZza2 = zzidsVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int iZzc = zziakVarZza.zzc() - i10;
            int iZzc2 = zziakVarZza2.zzc() - i11;
            int iMin = Math.min(iZzc, iZzc2);
            if (!(i10 == 0 ? zziakVarZza.zzk(zziakVarZza2, i11, iMin) : zziakVarZza2.zzk(zziakVarZza, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.zzc;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzc) {
                i10 = 0;
                zziakVarZza = zzidsVar.next();
            } else {
                i10 += iMin;
                zziakVarZza = zziakVarZza;
            }
            if (iMin == iZzc2) {
                zziakVarZza2 = zzidsVar2.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final int zzl(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzl(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzl(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzl(this.zzd.zzl(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zziaq zzm() {
        ArrayList arrayList = new ArrayList();
        zzids zzidsVar = new zzids(this, null);
        while (zzidsVar.hasNext()) {
            arrayList.add(zzidsVar.next().zzf());
        }
        int i10 = zziaq.zze;
        return zziaq.zzF(new zzich(arrayList), 4096);
    }

    final /* synthetic */ zzian zzo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final int zzp() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final boolean zzq() {
        return this.zzc >= zzn(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    /* JADX INFO: renamed from: zzr */
    public final zziai iterator() {
        return new zzidq(this);
    }

    private zzidt(zzian zzianVar, zzian zzianVar2) {
        this.zzd = zzianVar;
        this.zze = zzianVar2;
        int iZzc = zzianVar.zzc();
        this.zzf = iZzc;
        this.zzc = iZzc + zzianVar2.zzc();
        this.zzg = Math.max(zzianVar.zzp(), zzianVar2.zzp()) + 1;
    }
}
