package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.r;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f23196e;

    public a(ArrayList arrayList, int i10, int i11, int i12, float f10) {
        this.f23192a = arrayList;
        this.f23193b = i10;
        this.f23194c = i11;
        this.f23195d = i12;
        this.f23196e = f10;
    }

    public static a a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) throws r {
        float f10;
        int i10;
        int i11;
        try {
            nVar.e(nVar.f23135b + 4);
            int iJ = (nVar.j() & 3) + 1;
            if (iJ == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iJ2 = nVar.j() & 31;
            for (int i12 = 0; i12 < iJ2; i12++) {
                int iO = nVar.o();
                int i13 = nVar.f23135b;
                nVar.e(i13 + iO);
                byte[] bArr = nVar.f23134a;
                byte[] bArr2 = new byte[iO + 4];
                System.arraycopy(com.fyber.inneractive.sdk.player.exoplayer2.util.d.f23104a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i13, bArr2, 4, iO);
                arrayList.add(bArr2);
            }
            int iJ3 = nVar.j();
            for (int i14 = 0; i14 < iJ3; i14++) {
                int iO2 = nVar.o();
                int i15 = nVar.f23135b;
                nVar.e(i15 + iO2);
                byte[] bArr3 = nVar.f23134a;
                byte[] bArr4 = new byte[iO2 + 4];
                System.arraycopy(com.fyber.inneractive.sdk.player.exoplayer2.util.d.f23104a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i15, bArr4, 4, iO2);
                arrayList.add(bArr4);
            }
            if (iJ2 > 0) {
                com.fyber.inneractive.sdk.player.exoplayer2.util.k kVarA = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a((byte[]) arrayList.get(0), iJ, ((byte[]) arrayList.get(0)).length);
                int i16 = kVarA.f23117b;
                int i17 = kVarA.f23118c;
                f10 = kVarA.f23119d;
                i10 = i16;
                i11 = i17;
            } else {
                f10 = 1.0f;
                i10 = -1;
                i11 = -1;
            }
            return new a(arrayList, iJ, i10, i11, f10);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new r("Error parsing AVC config", e10);
        }
    }
}
