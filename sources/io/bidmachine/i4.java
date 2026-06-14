package io.bidmachine;

/* JADX INFO: loaded from: classes12.dex */
class i4 implements InitializationParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zb.h f80130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zb.d f80131b;

    i4(TargetingParams targetingParams, zb.d dVar) {
        this.f80130a = new y5(dVar, targetingParams);
        this.f80131b = dVar;
    }

    @Override // io.bidmachine.GeneralParams
    public zb.d getDataRestrictions() {
        return this.f80131b;
    }

    @Override // io.bidmachine.GeneralParams
    public zb.h getTargetingInfo() {
        return this.f80130a;
    }

    @Override // io.bidmachine.GeneralParams
    public boolean isTestMode() {
        return j2.e().E();
    }
}
