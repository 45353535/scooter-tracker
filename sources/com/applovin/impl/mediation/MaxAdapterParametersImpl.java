package com.applovin.impl.mediation;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.impl.d5;
import com.applovin.impl.k3;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f9376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f9377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f9378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f9379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f9380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f9381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f9383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f9384j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f9385k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private MaxAdFormat f9386l;

    private MaxAdapterParametersImpl() {
    }

    static MaxAdapterParametersImpl a(y2 y2Var) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a((k3) y2Var);
        maxAdapterParametersImplA.f9383i = y2Var.R();
        maxAdapterParametersImplA.f9384j = y2Var.D();
        maxAdapterParametersImplA.f9385k = y2Var.C();
        return maxAdapterParametersImplA;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.f9386l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f9375a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.f9385k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f9384j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public String getConsentString() {
        return this.f9381g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.f9378d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.f9376b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f9377c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f9383i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean hasUserConsent() {
        return this.f9379e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean isAgeRestrictedUser() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean isDoNotSell() {
        return this.f9380f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f9382h;
    }

    static MaxAdapterParametersImpl a(d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a(d5Var);
        maxAdapterParametersImplA.f9375a = str;
        maxAdapterParametersImplA.f9386l = maxAdFormat;
        return maxAdapterParametersImplA;
    }

    static MaxAdapterParametersImpl a(k3 k3Var) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f9375a = k3Var.getAdUnitId();
        maxAdapterParametersImpl.f9379e = k3Var.n();
        maxAdapterParametersImpl.f9380f = k3Var.o();
        maxAdapterParametersImpl.f9381g = k3Var.d();
        maxAdapterParametersImpl.f9376b = k3Var.i();
        maxAdapterParametersImpl.f9377c = k3Var.l();
        maxAdapterParametersImpl.f9378d = k3Var.f();
        maxAdapterParametersImpl.f9382h = k3Var.p();
        return maxAdapterParametersImpl;
    }
}
