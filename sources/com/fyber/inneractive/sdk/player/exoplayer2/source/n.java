package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.io.EOFException;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] f22867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f22868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.i f22869c;

    public n(com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f22867a = iVarArr;
        this.f22868b = jVar;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws a0 {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVar = this.f22869c;
        if (iVar != null) {
            return iVar;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr = this.f22867a;
        int length = iVarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVar2 = iVarArr[i10];
            try {
                if (iVar2.a(bVar)) {
                    this.f22869c = iVar2;
                    bVar.f21743e = 0;
                    break;
                }
                continue;
            } catch (EOFException unused) {
            } catch (Throwable th2) {
                bVar.f21743e = 0;
                throw th2;
            }
            bVar.f21743e = 0;
            i10++;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVar3 = this.f22869c;
        if (iVar3 != null) {
            iVar3.a(this.f22868b);
            return this.f22869c;
        }
        StringBuilder sb2 = new StringBuilder("None of the available extractors (");
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr2 = this.f22867a;
        int i11 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f23162a;
        StringBuilder sb3 = new StringBuilder();
        for (int i12 = 0; i12 < iVarArr2.length; i12++) {
            sb3.append(iVarArr2[i12].getClass().getSimpleName());
            if (i12 < iVarArr2.length - 1) {
                sb3.append(", ");
            }
        }
        sb2.append(sb3.toString());
        sb2.append(") could read the stream.");
        throw new a0(sb2.toString());
    }
}
