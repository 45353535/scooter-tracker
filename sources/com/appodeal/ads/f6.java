package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.adtype.AdType;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f6 {
    public static final l0 a(l0 l0Var, int i10) {
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        if ((i10 & l0Var.f13566f.getCode()) > 0) {
            return l0Var;
        }
        return null;
    }

    public static final ArrayList b(int i10) {
        AdType[] adTypeArrValues = AdType.values();
        ArrayList arrayList = new ArrayList();
        for (AdType adType : adTypeArrValues) {
            if ((adType.getCode() & i10) > 0) {
                arrayList.add(adType);
            }
        }
        return arrayList;
    }

    public static final AdType c(int i10) {
        for (AdType adType : AdType.values()) {
            if ((adType.getCode() & i10) > 0) {
                return adType;
            }
        }
        return null;
    }
}
