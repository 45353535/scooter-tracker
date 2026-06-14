package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.o[] f22914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22915c;

    public y(com.fyber.inneractive.sdk.player.exoplayer2.o... oVarArr) {
        if (oVarArr.length <= 0) {
            throw new IllegalStateException();
        }
        this.f22914b = oVarArr;
        this.f22913a = oVarArr.length;
    }

    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        int i10 = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = this.f22914b;
            if (i10 >= oVarArr.length) {
                return -1;
            }
            if (oVar == oVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f22913a == yVar.f22913a && Arrays.equals(this.f22914b, yVar.f22914b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f22915c == 0) {
            this.f22915c = Arrays.hashCode(this.f22914b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f22915c;
    }
}
