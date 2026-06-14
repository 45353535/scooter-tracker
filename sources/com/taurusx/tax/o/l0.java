package com.taurusx.tax.o;

import android.os.Build;

/* JADX INFO: loaded from: classes11.dex */
public enum l0 {
    BASE(1),
    BASE_1_1(2),
    CUPCAKE(3),
    DONUT(4),
    ECLAIR(5),
    ECLAIR_0_1(6),
    ECLAIR_MR1(7),
    FROYO(8),
    GINGERBREAD(9),
    GINGERBREAD_MR1(10),
    HONEYCOMB(11),
    HONEYCOMB_MR1(12),
    HONEYCOMB_MR2(13),
    ICE_CREAM_SANDWICH(14),
    ICE_CREAM_SANDWICH_MR1(15),
    JELLY_BEAN(16),
    JELLY_BEAN_MR1(17),
    JELLY_BEAN_MR2(18),
    CUR_DEVELOPMENT(10000);


    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f66469z;

    l0(int i10) {
        this.f66469z = i10;
    }

    public static l0 currentApiLevel() {
        return z(Build.VERSION.SDK_INT);
    }

    public static l0 z(int i10) {
        for (l0 l0Var : values()) {
            if (l0Var.getApiLevel() == i10) {
                return l0Var;
            }
        }
        return CUR_DEVELOPMENT;
    }

    public int getApiLevel() {
        return this.f66469z;
    }

    public boolean isAtLeast(l0 l0Var) {
        return getApiLevel() >= l0Var.getApiLevel();
    }

    public boolean isAtMost(l0 l0Var) {
        return getApiLevel() <= l0Var.getApiLevel();
    }

    public boolean isBelow(l0 l0Var) {
        return getApiLevel() < l0Var.getApiLevel();
    }
}
