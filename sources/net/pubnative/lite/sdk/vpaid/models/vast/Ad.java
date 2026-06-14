package net.pubnative.lite.sdk.vpaid.models.vast;

import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* JADX INFO: loaded from: classes3.dex */
public class Ad {

    @Attribute
    private String adType;

    @Attribute
    private String conditionalAd;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Attribute
    private String f96073id;

    @Tag
    private InLine inLine;

    @Attribute
    private String sequence;

    @Tag
    private Wrapper wrapper;

    public String getAdType() {
        return this.adType;
    }

    public String getConditionalAd() {
        return this.conditionalAd;
    }

    public String getId() {
        return this.f96073id;
    }

    public InLine getInLine() {
        return this.inLine;
    }

    public String getSequence() {
        return this.sequence;
    }

    public Wrapper getWrapper() {
        return this.wrapper;
    }
}
