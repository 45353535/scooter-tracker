package com.pubmatic.sdk.common.base;

import android.os.Trace;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBAdBuilding;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBResponseParsing;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.common.network.POBHttpRequest;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.network.POBNetworkResult;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBCommunicator<AdDescriptorType extends POBAdDescriptor> implements POBNetworkHandler.POBNetworkListener<JSONObject>, POBResponseParsing.POBResponseParserListener<AdDescriptorType>, POBAdBuilding.POBAdBuilderListener<AdDescriptorType>, POBNetworkHandler.POBNetworkResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final POBRequestBuilding f62245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final POBResponseParsing f62246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final POBAdBuilding f62247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final POBNetworkHandler f62248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private POBCommunicatorListener f62249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private POBNetworkResult f62250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private POBErrorCustomisationListener f62251g;

    @MainThread
    public interface POBCommunicatorListener<AdDescriptorType extends POBAdDescriptor> {
        void onError(@NonNull POBError pOBError);

        void onSuccess(@NonNull POBAdResponse<AdDescriptorType> pOBAdResponse);
    }

    public interface POBErrorCustomisationListener {
    }

    public POBCommunicator(@NonNull POBRequestBuilding pOBRequestBuilding, @NonNull POBResponseParsing pOBResponseParsing, @NonNull POBAdBuilding<AdDescriptorType> pOBAdBuilding, @NonNull POBNetworkHandler pOBNetworkHandler) {
        this.f62245a = pOBRequestBuilding;
        this.f62248d = pOBNetworkHandler;
        this.f62247c = pOBAdBuilding;
        pOBAdBuilding.setListener(this);
        this.f62246b = pOBResponseParsing;
        pOBResponseParsing.setListener(this);
    }

    private void a(POBError pOBError) {
        POBCommunicatorListener pOBCommunicatorListener = this.f62249e;
        if (pOBCommunicatorListener != null) {
            pOBCommunicatorListener.onError(pOBError);
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdBuilding.POBAdBuilderListener
    public void adBuilderOnSuccess(@NonNull POBAdResponse<AdDescriptorType> pOBAdResponse) {
        POBCommunicatorListener pOBCommunicatorListener = this.f62249e;
        if (pOBCommunicatorListener != null) {
            pOBCommunicatorListener.onSuccess(pOBAdResponse);
        }
    }

    public void cancel() {
        this.f62248d.cancelRequest(String.valueOf(this.f62245a.hashCode()));
    }

    @Nullable
    public POBNetworkResult getNetworkResult() {
        return this.f62250f;
    }

    @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
    public void onFailure(@NonNull POBError pOBError) {
        POBLog.debug("POBCommunicator", "Failed to receive an Ad response from server - %s", pOBError.getErrorMessage());
        a(pOBError);
    }

    @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkResultListener
    public void onResult(@Nullable POBNetworkResult pOBNetworkResult) {
        this.f62250f = pOBNetworkResult;
    }

    @Override // com.pubmatic.sdk.common.base.POBResponseParsing.POBResponseParserListener
    public void parserOnError(@NonNull POBError pOBError) {
        a(pOBError);
    }

    @Override // com.pubmatic.sdk.common.base.POBResponseParsing.POBResponseParserListener
    public void parserOnSuccess(@NonNull POBAdResponse<AdDescriptorType> pOBAdResponse) {
        this.f62247c.build(new POBAdResponse.Builder(pOBAdResponse).build());
    }

    public void requestAd() {
        POBHttpRequest pOBHttpRequestBuild = this.f62245a.build();
        if (pOBHttpRequestBuild == null) {
            a(new POBError(1001, "Exception occurred while preparing this ad request"));
            return;
        }
        Trace.endSection();
        Trace.beginSection("POB Network Call");
        POBLog.debug("POBCommunicator", "Sending an Ad request - : %s", pOBHttpRequestBuild.toString());
        this.f62248d.sendJSONRequest(pOBHttpRequestBuild, this, this);
    }

    public void setListener(POBCommunicatorListener<AdDescriptorType> pOBCommunicatorListener) {
        this.f62249e = pOBCommunicatorListener;
    }

    public void setPOBErrorCustomisationListener(@Nullable POBErrorCustomisationListener pOBErrorCustomisationListener) {
    }

    @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
    public void onSuccess(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            POBLog.debug("POBCommunicator", "Successfully received Ad response from server - %s", jSONObject.toString());
        }
        Trace.endSection();
        Trace.beginSection("POB Response Parsing");
        this.f62246b.parse(jSONObject);
    }
}
