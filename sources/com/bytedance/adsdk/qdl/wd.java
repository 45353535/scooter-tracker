package com.bytedance.adsdk.qdl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class wd implements tvp {
    @Override // com.bytedance.adsdk.qdl.tvp
    /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
    public Number qdl(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 3) {
            return null;
        }
        Number numberQdl = qdl(objArr[0]);
        int iQdl = qdl(objArr[1], 0);
        boolean zQdl = qdl(objArr[2], false);
        if (numberQdl == null) {
            return null;
        }
        return qdl(numberQdl, iQdl, zQdl);
    }

    public Number qdl(Number number, int i10, boolean z10) {
        if (number == null) {
            return null;
        }
        int iMax = Math.max(i10, 0);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(number.doubleValue());
        BigDecimal scale = z10 ? bigDecimalValueOf.setScale(iMax, RoundingMode.HALF_UP) : bigDecimalValueOf.setScale(iMax, RoundingMode.DOWN);
        return (iMax == 0 || a.a(scale).scale() <= 0) ? Long.valueOf(scale.longValue()) : Double.valueOf(scale.doubleValue());
    }

    private Number qdl(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private int qdl(Object obj, int i10) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    private boolean qdl(Object obj, boolean z10) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return obj instanceof String ? Boolean.parseBoolean((String) obj) : z10;
    }
}
