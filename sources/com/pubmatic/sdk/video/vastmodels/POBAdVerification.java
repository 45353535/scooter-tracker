package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.viewability.POBVerificationScriptResource;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;
import com.taurusx.tax.f.z;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class POBAdVerification implements POBXMLNodeListener, POBVerificationScriptResource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f63172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f63173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f63174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f63175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f63176e;

    @Override // com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.f63175d = pOBNodeBuilder.getAttributeValue(z.f66061c);
        this.f63172a = pOBNodeBuilder.getStringList(z.f66066o);
        this.f63174c = pOBNodeBuilder.getObjectList("TrackingEvents/Tracking", POBTracking.class);
        this.f63173b = pOBNodeBuilder.getStringList("ExecutableResource");
        this.f63176e = pOBNodeBuilder.getNodeValue(z.f66065n);
    }

    @Nullable
    public List<String> getExecutableResource() {
        return this.f63173b;
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVerificationScriptResource
    @Nullable
    public List<String> getJavaScriptResource() {
        return this.f63172a;
    }

    @Nullable
    public List<POBTracking> getTrackingEvents() {
        return this.f63174c;
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVerificationScriptResource
    @Nullable
    public String getVendorKey() {
        return this.f63175d;
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVerificationScriptResource
    @Nullable
    public String getVerificationParameter() {
        return this.f63176e;
    }
}
