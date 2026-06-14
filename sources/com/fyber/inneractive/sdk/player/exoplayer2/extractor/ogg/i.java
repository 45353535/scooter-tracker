package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.applovin.shadow.okio.Utf8;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f22345o = z.a("Opus");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f22346p = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f22347n;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f22347n = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int i10;
        byte[] bArr = nVar.f23134a;
        byte b10 = bArr[0];
        int i11 = b10 & 255;
        int i12 = b10 & 3;
        if (i12 != 0) {
            i10 = 2;
            if (i12 != 1 && i12 != 2) {
                i10 = bArr[1] & Utf8.REPLACEMENT_BYTE;
            }
        } else {
            i10 = 1;
        }
        int i13 = i11 >> 3;
        int i14 = i13 & 3;
        return (((long) this.f22358i) * ((long) (i10 * (i13 >= 16 ? 2500 << i14 : i13 >= 12 ? 10000 << (i13 & 1) : i14 == 3 ? 60000 : 10000 << i14)))) / 1000000;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.l
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j10, j jVar) {
        if (!this.f22347n) {
            byte[] bArrCopyOf = Arrays.copyOf(nVar.f23134a, nVar.f23136c);
            int i10 = bArrCopyOf[9] & 255;
            int i11 = ((bArrCopyOf[11] & 255) << 8) | (bArrCopyOf[10] & 255);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(bArrCopyOf);
            arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i11) * 1000000000) / 48000).array());
            arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) 3840) * 1000000000) / 48000).array());
            jVar.f22348a = com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "audio/opus", -1, -1, i10, 48000, arrayList, null, null);
            this.f22347n = true;
            return true;
        }
        boolean z10 = nVar.b() == f22345o;
        nVar.e(0);
        return z10;
    }
}
