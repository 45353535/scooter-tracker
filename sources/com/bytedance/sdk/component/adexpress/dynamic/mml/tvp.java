package com.bytedance.sdk.component.adexpress.dynamic.mml;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class tvp {
    public float qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public float f16385ud;

    public tvp(float f10, float f11) {
        this.qdl = f10;
        this.f16385ud = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            tvp tvpVar = (tvp) obj;
            if (Float.compare(tvpVar.qdl, this.qdl) == 0 && Float.compare(tvpVar.f16385ud, this.f16385ud) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.qdl), Float.valueOf(this.f16385ud)});
    }
}
