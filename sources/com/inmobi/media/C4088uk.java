package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.uk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4088uk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f39695b;

    public C4088uk(String str, Map map) {
        this.f39694a = str;
        this.f39695b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4088uk)) {
            return false;
        }
        C4088uk c4088uk = (C4088uk) obj;
        return Intrinsics.areEqual(this.f39694a, c4088uk.f39694a) && Intrinsics.areEqual(this.f39695b, c4088uk.f39695b);
    }

    public final int hashCode() {
        String str = this.f39694a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map map = this.f39695b;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "TokenMetaData(keywords=" + this.f39694a + ", extras=" + this.f39695b + ")";
    }
}
