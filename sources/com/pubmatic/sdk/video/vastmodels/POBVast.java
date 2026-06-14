package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class POBVast implements POBXMLNodeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f63235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63236b;

    @Override // com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.f63236b = pOBNodeBuilder.getAttributeValue("version");
        this.f63235a = new ArrayList();
        if (pOBNodeBuilder.getNode("/VAST/Ad") == null) {
            POBVastAd pOBVastAd = new POBVastAd();
            pOBVastAd.build(pOBNodeBuilder);
            this.f63235a.add(pOBVastAd);
            return;
        }
        POBVastAd pOBVastAd2 = (POBVastAd) pOBNodeBuilder.getNodeObject("/VAST/Ad[1]/InLine", POBVastAd.class);
        if (pOBVastAd2 != null) {
            this.f63235a.add(pOBVastAd2);
            return;
        }
        POBVastAd pOBVastAd3 = (POBVastAd) pOBNodeBuilder.getNodeObject("/VAST/Ad[1]/Wrapper", POBVastAd.class);
        if (pOBVastAd3 != null) {
            this.f63235a.add(pOBVastAd3);
        }
    }

    @Nullable
    public List<POBVastAd> getAds() {
        return this.f63235a;
    }

    @Nullable
    public String getVersion() {
        return this.f63236b;
    }
}
