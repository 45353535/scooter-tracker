package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends c {
    public final long P0;
    public final ArrayList Q0;
    public final ArrayList R0;

    public a(int i10, long j10) {
        super(i10);
        this.P0 = j10;
        this.Q0 = new ArrayList();
        this.R0 = new ArrayList();
    }

    public final a b(int i10) {
        int size = this.R0.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) this.R0.get(i11);
            if (aVar.f22143a == i10) {
                return aVar;
            }
        }
        return null;
    }

    public final b c(int i10) {
        int size = this.Q0.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.Q0.get(i11);
            if (bVar.f22143a == i10) {
                return bVar;
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c
    public final String toString() {
        return c.a(this.f22143a) + " leaves: " + Arrays.toString(this.Q0.toArray()) + " containers: " + Arrays.toString(this.R0.toArray());
    }
}
