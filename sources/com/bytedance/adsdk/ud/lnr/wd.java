package com.bytedance.adsdk.ud.lnr;

import android.util.Pair;

/* JADX INFO: loaded from: classes6.dex */
public class wd<T> {
    T qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    T f16050ud;

    private static boolean ud(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return ud(pair.first, this.qdl) && ud(pair.second, this.f16050ud);
    }

    public int hashCode() {
        T t10 = this.qdl;
        int iHashCode = t10 == null ? 0 : t10.hashCode();
        T t11 = this.f16050ud;
        return iHashCode ^ (t11 != null ? t11.hashCode() : 0);
    }

    public void qdl(T t10, T t11) {
        this.qdl = t10;
        this.f16050ud = t11;
    }

    public String toString() {
        return "Pair{" + this.qdl + " " + this.f16050ud + "}";
    }
}
