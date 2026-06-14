package com.google.android.material.color;

import android.os.Build;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class i {
    public static ColorResourcesOverride a() {
        int i10 = Build.VERSION.SDK_INT;
        if (30 <= i10 && i10 <= 33) {
            return ResourcesLoaderColorResourcesOverride.a();
        }
        if (i10 >= 34) {
            return ResourcesLoaderColorResourcesOverride.a();
        }
        return null;
    }
}
