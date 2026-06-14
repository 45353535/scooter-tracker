package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class rg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdPreferences.Placement f65222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f65223b;

    public rg(AdPreferences.Placement placement) {
        this.f65222a = placement;
        this.f65223b = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rg.class == obj.getClass()) {
            rg rgVar = (rg) obj;
            if (this.f65223b == rgVar.f65223b && this.f65222a == rgVar.f65222a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f65222a, Integer.valueOf(this.f65223b)};
        WeakHashMap weakHashMap = vi.f65408a;
        return Arrays.deepHashCode(objArr);
    }

    public rg(AdPreferences.Placement placement, int i10) {
        this.f65222a = placement;
        this.f65223b = i10;
    }
}
