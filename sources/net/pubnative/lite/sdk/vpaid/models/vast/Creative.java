package net.pubnative.lite.sdk.vpaid.models.vast;

import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* JADX INFO: loaded from: classes3.dex */
public class Creative {

    @Attribute
    private String adId;

    @Attribute
    private String apiFramework;

    @Tag
    private CompanionAds companionAds;

    @Tag
    private CreativeExtensions creativeExtensions;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Attribute
    private String f96079id;

    @Tag
    private Linear linear;

    @Tag
    private NonLinearAds nonLinearAds;

    @Attribute
    private String sequence;

    @Tag("UniversalAdId")
    private List<UniversalAdId> universalAdIds;

    public String getAdId() {
        return this.adId;
    }

    public String getApiFramework() {
        return this.apiFramework;
    }

    public CompanionAds getCompanionAds() {
        return this.companionAds;
    }

    public CreativeExtensions getCreativeExtensions() {
        return this.creativeExtensions;
    }

    public String getId() {
        return this.f96079id;
    }

    public Linear getLinear() {
        return this.linear;
    }

    public NonLinearAds getNonLinearAds() {
        return this.nonLinearAds;
    }

    public String getSequence() {
        return this.sequence;
    }

    public List<UniversalAdId> getUniversalAdIds() {
        return this.universalAdIds;
    }
}
