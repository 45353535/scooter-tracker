package com.applovin.impl;

import com.applovin.impl.d2;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class z2 extends e2 {
    public z2(com.applovin.impl.sdk.k kVar) {
        super(kVar, d2.b.MEDIATED_AD);
    }

    public void a(d2 d2Var, y2 y2Var) {
        a(d2Var, y2Var, new HashMap());
    }

    public void a(d2 d2Var, y2 y2Var, Map map) {
        a(d2Var, y2Var.getFormat(), y2Var.getAdUnitId(), y2Var, null, map);
    }

    public void a(d2 d2Var, y2 y2Var, MaxError maxError) {
        a(d2Var, y2Var, maxError, new HashMap());
    }

    public void a(d2 d2Var, y2 y2Var, MaxError maxError, Map map) {
        a(d2Var, y2Var.getFormat(), y2Var.getAdUnitId(), y2Var, maxError, map);
    }

    public void a(d2 d2Var, MaxAdFormat maxAdFormat, String str, MaxError maxError) {
        a(d2Var, maxAdFormat, str, null, maxError, new HashMap());
    }

    private void a(d2 d2Var, MaxAdFormat maxAdFormat, String str, y2 y2Var, MaxError maxError, Map map) {
        if (y2Var != null) {
            map.putAll(f2.a(y2Var));
        } else {
            CollectionUtils.putStringIfValid("ad_unit_id", str, map);
            CollectionUtils.putStringIfValid("ad_format", maxAdFormat.getLabel(), map);
        }
        if (maxError != null) {
            map.putAll(f2.a(maxError));
        }
        d(d2Var, map);
    }
}
