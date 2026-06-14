package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;
import com.taurusx.tax.f.a;

/* JADX INFO: loaded from: classes11.dex */
public class POBMediaFile implements POBXMLNodeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f63206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f63207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f63208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f63209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f63210g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f63211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f63212i;

    @Override // com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.f63204a = pOBNodeBuilder.getAttributeValue("delivery");
        this.f63205b = pOBNodeBuilder.getAttributeValue("type");
        this.f63206c = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue(a.f65992s));
        this.f63207d = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("width"));
        this.f63208e = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("height"));
        this.f63209f = POBUtils.getBooleanValue(pOBNodeBuilder.getAttributeValue("scalable"));
        String attributeValue = pOBNodeBuilder.getAttributeValue("maintainAspectRatio");
        if (attributeValue != null && !attributeValue.isEmpty()) {
            this.f63210g = POBUtils.getBooleanValue(attributeValue);
        }
        this.f63211h = pOBNodeBuilder.getNodeValue();
        this.f63212i = pOBNodeBuilder.getAttributeValue("fileSize");
    }

    public int getBitrate() {
        return this.f63206c;
    }

    @Nullable
    public String getDelivery() {
        return this.f63204a;
    }

    @Nullable
    public String getFileSize() {
        return this.f63212i;
    }

    public int getHeight() {
        return this.f63208e;
    }

    public boolean getMaintainAspectRatio() {
        return this.f63210g;
    }

    @Nullable
    public String getMediaFileURL() {
        return this.f63211h;
    }

    public boolean getScalable() {
        return this.f63209f;
    }

    @Nullable
    public String getType() {
        return this.f63205b;
    }

    public int getWidth() {
        return this.f63207d;
    }

    @NonNull
    public String toString() {
        return "Type: " + this.f63205b + ", bitrate: " + this.f63206c + ", w: " + this.f63207d + ", h: " + this.f63208e + ", URL: " + this.f63211h;
    }
}
