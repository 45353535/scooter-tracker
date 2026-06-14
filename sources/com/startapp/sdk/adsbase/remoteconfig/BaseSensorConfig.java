package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class BaseSensorConfig implements Serializable {
    private static final long serialVersionUID = 1916033515322302335L;
    private int delay;
    private boolean enabled;
    private int minApiLevel;

    public BaseSensorConfig() {
        this.delay = 3;
        this.minApiLevel = 18;
        this.enabled = true;
    }

    public final int a() {
        return this.delay;
    }

    public final int b() {
        return this.minApiLevel;
    }

    public final boolean c() {
        return this.enabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BaseSensorConfig baseSensorConfig = (BaseSensorConfig) obj;
            if (this.delay == baseSensorConfig.delay && this.minApiLevel == baseSensorConfig.minApiLevel && this.enabled == baseSensorConfig.enabled) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.delay), Integer.valueOf(this.minApiLevel), Boolean.valueOf(this.enabled)};
        WeakHashMap weakHashMap = vi.f65408a;
        return Arrays.deepHashCode(objArr);
    }

    public BaseSensorConfig(int i10) {
        this.delay = 3;
        this.enabled = true;
        this.minApiLevel = i10;
    }
}
