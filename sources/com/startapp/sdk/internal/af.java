package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class af extends kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64269a;

    public af(int i10) {
        this.f64269a = i10;
    }

    @Override // com.startapp.sdk.internal.kf
    public final boolean a(Object obj) {
        if (obj instanceof z1) {
            int i10 = ((z1) obj).Z;
            if ((this.f64269a & i10) == i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && af.class == obj.getClass() && this.f64269a == ((af) obj).f64269a;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.f64269a)};
        WeakHashMap weakHashMap = vi.f65408a;
        return Arrays.deepHashCode(objArr);
    }
}
