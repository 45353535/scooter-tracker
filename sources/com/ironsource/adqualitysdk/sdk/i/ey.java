package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: loaded from: classes10.dex */
public final class ey extends ed {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ek f2037;

    public ey(ek ekVar, dm dmVar) {
        super(dmVar);
        this.f2037 = ekVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6401(du duVar, cq cqVar) {
        dr drVarM6434 = this.f2037.m6434(duVar, cqVar);
        duVar.m6397(this.f2037.m6451(), Integer.valueOf(drVarM6434.m6378().intValue() + 1));
        return drVarM6434;
    }
}
