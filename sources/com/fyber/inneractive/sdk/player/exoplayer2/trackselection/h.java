package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b[] f22935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22936c;

    public h(b... bVarArr) {
        this.f22935b = bVarArr;
        this.f22934a = bVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f22935b, ((h) obj).f22935b);
    }

    public final int hashCode() {
        if (this.f22936c == 0) {
            this.f22936c = Arrays.hashCode(this.f22935b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f22936c;
    }
}
