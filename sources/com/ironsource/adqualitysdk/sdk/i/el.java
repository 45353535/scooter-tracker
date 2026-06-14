package com.ironsource.adqualitysdk.sdk.i;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes10.dex */
public abstract class el extends eg {
    public el(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6401(du duVar, cq cqVar) {
        Object objM6377 = m6444().m6434(duVar, cqVar).m6377();
        Object objM63772 = m6445().m6434(duVar, cqVar).m6377();
        try {
            return new dr(Boolean.valueOf(mo6452(new BigDecimal(objM6377.toString()).compareTo(new BigDecimal(objM63772.toString())))));
        } catch (Exception unused) {
            return ((objM6377 instanceof String) && (objM63772 instanceof String)) ? new dr(Boolean.valueOf(mo6454((String) objM6377, (String) objM63772))) : new dr(Boolean.valueOf(mo6453(objM6377, objM63772)));
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    abstract boolean mo6452(int i10);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    abstract boolean mo6453(Object obj, Object obj2);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    abstract boolean mo6454(String str, String str2);
}
