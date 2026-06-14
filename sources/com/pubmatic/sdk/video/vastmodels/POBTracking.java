package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;

/* JADX INFO: loaded from: classes11.dex */
public class POBTracking implements POBXMLNodeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f63234c;

    @Override // com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.f63232a = pOBNodeBuilder.getAttributeValue("event");
        this.f63233b = pOBNodeBuilder.getNodeValue();
        this.f63234c = pOBNodeBuilder.getAttributeValue("offset");
    }

    @Nullable
    public String getEvent() {
        return this.f63232a;
    }

    @Nullable
    public String getOffset() {
        return this.f63234c;
    }

    @Nullable
    public String getUrl() {
        return this.f63233b;
    }
}
