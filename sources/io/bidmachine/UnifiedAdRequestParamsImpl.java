package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.AdRequestParameters;

/* JADX INFO: loaded from: classes12.dex */
public class UnifiedAdRequestParamsImpl<AdRequestParametersType extends AdRequestParameters> implements od.d {

    @NonNull
    private final AdRequestParametersType adRequestParameters;

    @NonNull
    private final zb.d dataRestrictions;

    @NonNull
    private final zb.e deviceInfo;

    @NonNull
    private final zb.h targetingInfo;

    protected UnifiedAdRequestParamsImpl(@NonNull AdRequestParametersType adrequestparameterstype, @NonNull TargetingParams targetingParams, @NonNull zb.d dVar) {
        this.adRequestParameters = adrequestparameterstype;
        this.targetingInfo = new y5(dVar, targetingParams);
        this.deviceInfo = new z2(dVar);
        this.dataRestrictions = dVar;
    }

    @Override // od.d, od.n
    @NonNull
    public AdRequestParametersType getAdRequestParameters() {
        return this.adRequestParameters;
    }

    @Override // io.bidmachine.GeneralParams
    @NonNull
    public zb.d getDataRestrictions() {
        return this.dataRestrictions;
    }

    @NonNull
    public zb.e getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // io.bidmachine.GeneralParams
    @NonNull
    public zb.h getTargetingInfo() {
        return this.targetingInfo;
    }

    @Override // io.bidmachine.GeneralParams
    public boolean isTestMode() {
        return j2.e().E();
    }
}
