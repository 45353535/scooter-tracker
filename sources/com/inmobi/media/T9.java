package com.inmobi.media;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class T9 {
    private final boolean GPID;

    public T9() {
        this(false, 1, null);
    }

    public final boolean a() {
        return this.GPID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof T9) && this.GPID == ((T9) obj).GPID;
    }

    public final int hashCode() {
        return androidx.compose.foundation.c.a(this.GPID);
    }

    public final String toString() {
        return "IncludeIdParams(GPID=" + this.GPID + ")";
    }

    public T9(boolean z10) {
        this.GPID = z10;
    }

    public /* synthetic */ T9(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
