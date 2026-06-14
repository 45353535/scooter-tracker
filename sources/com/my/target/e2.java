package com.my.target;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e2 {
    public static int a(float f10, float f11) {
        float f12 = f10 - f11;
        if (f12 > 1.0E-6f) {
            return 1;
        }
        return f12 < -1.0E-6f ? -1 : 0;
    }
}
