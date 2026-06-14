package com.moloco.sdk.internal.mediators;

import cg.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.c;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public static final long a(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 76100) {
                if (iHashCode != 63085501) {
                    if (iHashCode == 347625656 && str.equals("LevelPlay")) {
                        return c.s(8, b.f6839f);
                    }
                } else if (str.equals("AdMob")) {
                    return c.s(8, b.f6839f);
                }
            } else if (str.equals("MAX")) {
                return c.s(8, b.f6839f);
            }
        }
        return c.s(60, b.f6839f);
    }

    public static final long b(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 76100) {
                if (iHashCode != 63085501) {
                    if (iHashCode == 347625656 && str.equals("LevelPlay")) {
                        return c.s(26, b.f6839f);
                    }
                } else if (str.equals("AdMob")) {
                    return c.s(26, b.f6839f);
                }
            } else if (str.equals("MAX")) {
                return c.s(26, b.f6839f);
            }
        }
        return c.s(60, b.f6839f);
    }

    public static final long c(String str) {
        return Intrinsics.areEqual(str, "MAX") ? c.s(8, b.f6839f) : Intrinsics.areEqual(str, "AdMob") ? c.s(58, b.f6839f) : c.s(60, b.f6839f);
    }
}
