package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;

/* JADX INFO: loaded from: classes11.dex */
public class POBResource implements POBXMLNodeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f63225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f63227c;

    enum a {
        STATIC,
        HTML,
        IFRAME
    }

    @Override // com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.f63226b = pOBNodeBuilder.getAttributeValue("creativeType");
        if (pOBNodeBuilder.getNodeName() != null) {
            String nodeName = pOBNodeBuilder.getNodeName();
            nodeName.getClass();
            switch (nodeName) {
                case "IFrameResource":
                    this.f63225a = a.IFRAME;
                    break;
                case "StaticResource":
                    this.f63225a = a.STATIC;
                    break;
                case "HTMLResource":
                    this.f63225a = a.HTML;
                    break;
            }
        }
        this.f63227c = pOBNodeBuilder.getNodeValue();
    }

    @Nullable
    public String getCreativeType() {
        return this.f63226b;
    }

    @Nullable
    public String getResource() {
        return this.f63227c;
    }

    @Nullable
    public a getResourceType() {
        return this.f63225a;
    }
}
