package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f22916d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y[] f22918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22919c;

    static {
        new z(new y[0]);
    }

    public z(y... yVarArr) {
        this.f22918b = yVarArr;
        this.f22917a = yVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (this.f22917a == zVar.f22917a && Arrays.equals(this.f22918b, zVar.f22918b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f22919c == 0) {
            this.f22919c = Arrays.hashCode(this.f22918b);
        }
        return this.f22919c;
    }
}
