package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public abstract class n1 {
    public static String a(String str) {
        com.fyber.inneractive.sdk.config.l0 l0Var;
        UnitDisplayType unitDisplayType;
        UnitDisplayType unitDisplayType2;
        UnitDisplayType unitDisplayType3;
        IAConfigManager iAConfigManager = IAConfigManager.O;
        HashMap map = iAConfigManager.f20295a;
        com.fyber.inneractive.sdk.config.q0 q0Var = (map == null || !map.containsKey(str)) ? null : (com.fyber.inneractive.sdk.config.q0) iAConfigManager.f20295a.get(str);
        UnitDisplayType unitDisplayType4 = UnitDisplayType.BANNER;
        if (q0Var == null) {
            return unitDisplayType4.name().toLowerCase(Locale.US);
        }
        for (int i10 = 0; i10 < q0Var.f20431a.size(); i10++) {
            com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) q0Var.f20431a.get(i10);
            if (r0Var != null && ((l0Var = r0Var.f20435c) != null || r0Var.f20438f != null || r0Var.f20437e != null)) {
                if (l0Var == null || (unitDisplayType3 = l0Var.f20420b) == null || unitDisplayType3.isDeprecated() || UnitDisplayType.DEFAULT == unitDisplayType3) {
                    com.fyber.inneractive.sdk.config.t0 t0Var = r0Var.f20438f;
                    if (t0Var != null && (unitDisplayType2 = t0Var.f20498j) != null && !unitDisplayType2.isDeprecated() && UnitDisplayType.DEFAULT != unitDisplayType2) {
                        unitDisplayType4 = r0Var.f20438f.f20498j;
                    } else if (r0Var.f20437e != null && (unitDisplayType = UnitDisplayType.NATIVE) != null && !unitDisplayType.isDeprecated() && UnitDisplayType.DEFAULT != unitDisplayType) {
                        r0Var.f20437e.getClass();
                        unitDisplayType4 = unitDisplayType;
                    }
                } else {
                    unitDisplayType4 = r0Var.f20435c.f20420b;
                }
                if (UnitDisplayType.MRECT == unitDisplayType4) {
                    unitDisplayType4 = UnitDisplayType.BANNER;
                }
                if (UnitDisplayType.REWARDED == unitDisplayType4 || UnitDisplayType.INTERSTITIAL == unitDisplayType4 || UnitDisplayType.BANNER == unitDisplayType4 || UnitDisplayType.NATIVE == unitDisplayType4) {
                    return unitDisplayType4.name().toLowerCase(Locale.US);
                }
            }
        }
        return UnitDisplayType.BANNER.name().toLowerCase(Locale.US);
    }
}
