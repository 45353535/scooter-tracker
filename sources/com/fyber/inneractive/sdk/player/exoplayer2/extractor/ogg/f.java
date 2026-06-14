package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f22332a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22333b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(0, new byte[65025]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22334c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22336e;

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        int i10;
        int i11;
        int i12;
        if (this.f22336e) {
            this.f22336e = false;
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f22333b;
            nVar.f23135b = 0;
            nVar.f23136c = 0;
        }
        while (true) {
            if (this.f22336e) {
                return true;
            }
            if (this.f22334c < 0) {
                if (!this.f22332a.a(bVar, true)) {
                    return false;
                }
                g gVar = this.f22332a;
                int i13 = gVar.f22341d;
                if ((gVar.f22338a & 1) == 1 && this.f22333b.f23136c == 0) {
                    this.f22335d = 0;
                    int i14 = 0;
                    do {
                        int i15 = this.f22335d;
                        g gVar2 = this.f22332a;
                        if (i15 >= gVar2.f22340c) {
                            break;
                        }
                        int[] iArr = gVar2.f22343f;
                        this.f22335d = i15 + 1;
                        i12 = iArr[i15];
                        i14 += i12;
                    } while (i12 == 255);
                    i13 += i14;
                    i11 = this.f22335d;
                } else {
                    i11 = 0;
                }
                bVar.a(i13);
                this.f22334c = i11;
            }
            int i16 = this.f22334c;
            this.f22335d = 0;
            int i17 = 0;
            do {
                int i18 = this.f22335d;
                int i19 = i16 + i18;
                g gVar3 = this.f22332a;
                if (i19 >= gVar3.f22340c) {
                    break;
                }
                int[] iArr2 = gVar3.f22343f;
                this.f22335d = i18 + 1;
                i10 = iArr2[i19];
                i17 += i10;
            } while (i10 == 255);
            int i20 = this.f22334c + this.f22335d;
            if (i17 > 0) {
                int iA = this.f22333b.a();
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f22333b;
                int i21 = nVar2.f23136c + i17;
                if (iA < i21) {
                    nVar2.f23134a = Arrays.copyOf(nVar2.f23134a, i21);
                }
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f22333b;
                bVar.b(nVar3.f23134a, nVar3.f23136c, i17, false);
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = this.f22333b;
                nVar4.d(nVar4.f23136c + i17);
                this.f22336e = this.f22332a.f22343f[i20 + (-1)] != 255;
            }
            if (i20 == this.f22332a.f22340c) {
                i20 = -1;
            }
            this.f22334c = i20;
        }
    }

    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f22333b;
        byte[] bArr = nVar.f23134a;
        if (bArr.length == 65025) {
            return;
        }
        nVar.f23134a = Arrays.copyOf(bArr, Math.max(65025, nVar.f23136c));
    }
}
