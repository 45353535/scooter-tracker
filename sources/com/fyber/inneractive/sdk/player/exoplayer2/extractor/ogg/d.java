package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends l {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.f f22329n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f22330o;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f22329n = null;
            this.f22330o = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i10;
        int i11;
        int i12;
        byte[] bArr = nVar.f23134a;
        int i13 = -1;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i14 = (bArr[2] & 255) >> 4;
        switch (i14) {
            case 1:
                i13 = 192;
                return i13;
            case 2:
            case 3:
            case 4:
            case 5:
                i10 = i14 - 2;
                i11 = 576;
                i13 = i11 << i10;
                return i13;
            case 6:
            case 7:
                nVar.e(nVar.f23135b + 4);
                long j10 = nVar.f23134a[nVar.f23135b];
                int i15 = 7;
                while (true) {
                    if (i15 >= 0) {
                        int i16 = 1 << i15;
                        if ((((long) i16) & j10) != 0) {
                            i15--;
                        } else if (i15 < 6) {
                            j10 &= (long) (i16 - 1);
                            i12 = 7 - i15;
                        } else if (i15 == 7) {
                            i12 = 1;
                        }
                    }
                }
                i12 = 0;
                if (i12 != 0) {
                    for (int i17 = 1; i17 < i12; i17++) {
                        byte b10 = nVar.f23134a[nVar.f23135b + i17];
                        if ((b10 & 192) != 128) {
                            throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
                        }
                        j10 = (j10 << 6) | ((long) (b10 & Utf8.REPLACEMENT_BYTE));
                    }
                    nVar.f23135b += i12;
                    int iJ = i14 == 6 ? nVar.j() : nVar.o();
                    nVar.e(0);
                    i13 = iJ + 1;
                    return i13;
                }
                throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i10 = i14 - 8;
                i11 = 256;
                i13 = i11 << i10;
                return i13;
            default:
                return i13;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j10, j jVar) {
        byte[] bArr = nVar.f23134a;
        if (this.f22329n == null) {
            this.f22329n = new com.fyber.inneractive.sdk.player.exoplayer2.util.f(bArr);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 9, nVar.f23136c);
            bArrCopyOfRange[4] = UnsignedBytes.MAX_POWER_OF_TWO;
            List listSingletonList = Collections.singletonList(bArrCopyOfRange);
            com.fyber.inneractive.sdk.player.exoplayer2.util.f fVar = this.f22329n;
            int i10 = fVar.f23110c;
            int i11 = fVar.f23108a;
            jVar.f22348a = com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "audio/flac", -1, i10 * i11, fVar.f23109b, i11, listSingletonList, null, null);
        } else {
            byte b10 = bArr[0];
            if ((b10 & Ascii.DEL) == 3) {
                c cVar = new c(this);
                this.f22330o = cVar;
                nVar.e(nVar.f23135b + 1);
                int iL = nVar.l() / 18;
                cVar.f22324a = new long[iL];
                cVar.f22325b = new long[iL];
                for (int i12 = 0; i12 < iL; i12++) {
                    cVar.f22324a[i12] = nVar.g();
                    cVar.f22325b[i12] = nVar.g();
                    nVar.e(nVar.f23135b + 2);
                }
            } else if (b10 == -1) {
                c cVar2 = this.f22330o;
                if (cVar2 != null) {
                    cVar2.f22326c = j10;
                    jVar.f22349b = cVar2;
                }
                return false;
            }
        }
        return true;
    }
}
