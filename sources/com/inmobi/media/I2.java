package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class I2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f37047c;

    public I2(int i10, int i11, String str) {
        str = (i11 & 2) != 0 ? null : str;
        this.f37045a = i10;
        this.f37046b = str;
        this.f37047c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I2)) {
            return false;
        }
        I2 i22 = (I2) obj;
        return this.f37045a == i22.f37045a && Intrinsics.areEqual(this.f37046b, i22.f37046b) && Intrinsics.areEqual(this.f37047c, i22.f37047c);
    }

    public final int hashCode() {
        int i10 = this.f37045a * 31;
        String str = this.f37046b;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f37047c;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "BusEvent(eventId=" + this.f37045a + ", eventMessage=" + this.f37046b + ", eventData=" + this.f37047c + ")";
    }

    public I2(int i10, String str, Map map) {
        this.f37045a = i10;
        this.f37046b = str;
        this.f37047c = map;
    }
}
