package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f37761b;

    public Ta(int i10) {
        this.f37760a = i10;
        this.f37761b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ta)) {
            return false;
        }
        Ta ta2 = (Ta) obj;
        return this.f37760a == ta2.f37760a && Intrinsics.areEqual(this.f37761b, ta2.f37761b);
    }

    public final int hashCode() {
        int i10 = this.f37760a * 31;
        Integer num = this.f37761b;
        return i10 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OpenRequestResultData(result=" + this.f37760a + ", errorCode=" + this.f37761b + ")";
    }

    public Ta(int i10, Integer num) {
        this.f37760a = i10;
        this.f37761b = num;
    }
}
