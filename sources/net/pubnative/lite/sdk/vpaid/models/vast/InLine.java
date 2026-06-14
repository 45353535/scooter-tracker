package net.pubnative.lite.sdk.vpaid.models.vast;

import com.taurusx.tax.f.y;
import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* JADX INFO: loaded from: classes3.dex */
public class InLine implements VastAdSource {

    @Tag
    private AdServingId adServingId;

    @Tag
    private AdSystem adSystem;

    @Tag
    private AdTitle adTitle;

    @Tag
    private AdVerifications adVerifications;

    @Tag
    private Advertiser advertiser;

    @Tag("Category")
    private List<Category> categories;

    @Tag
    private Creatives creatives;

    @Tag
    private Description description;

    @Tag("Error")
    private List<Error> errors;

    @Tag
    private Expires expires;

    @Tag
    private Extensions extensions;

    @Tag(y.f66057w)
    private List<Impression> impressions;

    @Tag
    private Pricing pricing;

    @Tag("Survey")
    private List<Survey> surveys;

    @Tag
    private ViewableImpression viewableImpression;

    @Override // net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource
    public AdServingId getAdServingId() {
        return this.adServingId;
    }

    @Override // net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource
    public AdSystem getAdSystem() {
        return this.adSystem;
    }

    public AdTitle getAdTitle() {
        return this.adTitle;
    }

    @Override // net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource
    public AdVerifications getAdVerifications() {
        return this.adVerifications;
    }

    public Advertiser getAdvertiser() {
        return this.advertiser;
    }

    @Override // net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource
    public List<Category> getCategories() {
        return this.categories;
    }

    @Override // net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource
    public Creatives getCreatives() {
        return this.creatives;
    }

    public Description getDescription() {
        return this.description;
    }

    @Override // net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource
    public List<Error> getErrors() {
        return this.errors;
    }

    public Expires getExpires() {
        return this.expires;
    }

    @Override // net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource
    public Extensions getExtensions() {
        return this.extensions;
    }

    @Override // net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource
    public List<Impression> getImpressions() {
        return this.impressions;
    }

    @Override // net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource
    public Pricing getPricing() {
        return this.pricing;
    }

    public List<Survey> getSurveys() {
        return this.surveys;
    }

    @Override // net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource
    public ViewableImpression getViewableImpression() {
        return this.viewableImpression;
    }
}
