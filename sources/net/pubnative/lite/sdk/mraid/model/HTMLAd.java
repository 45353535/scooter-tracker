package net.pubnative.lite.sdk.mraid.model;

import android.content.Context;
import android.text.TextUtils;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdExperience;
import net.pubnative.lite.sdk.models.CustomCTAData;
import net.pubnative.lite.sdk.models.EndCardData;
import net.pubnative.lite.sdk.utils.AdCustomCTAManager;
import net.pubnative.lite.sdk.utils.AdEndCardManager;
import net.pubnative.lite.sdk.utils.ClickThroughTimerManager;
import net.pubnative.lite.sdk.utils.SkipOffsetManager;

/* JADX INFO: loaded from: classes3.dex */
public class HTMLAd {

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private final Ad f95934ad;
    private int clickThroughTimer;
    ClickThroughTimerManager.ClickThroughTimerListener clickThroughTimerListener;
    private CustomCTAData customCTAData;
    private Integer customCTADelay;
    private Integer endCardCloseDelay;
    private EndCardData endCardData;
    private LandingPageHandler landingPageHandler;
    private String link;
    private Integer nativeButtonCloseDelay;
    private boolean shouldShowCustomEndCard;
    private Integer skipDelay;

    public enum AdType {
        INTERSTITIAL,
        REWARDED
    }

    public HTMLAd(Context context, Ad ad2, AdType adType) {
        this.f95934ad = ad2;
        if (ad2 != null) {
            this.link = ad2.getLink();
            this.customCTAData = ad2.getCustomCta(context, false);
            this.customCTADelay = AdCustomCTAManager.getCustomCtaDelay(ad2);
            this.clickThroughTimer = ad2.getClickThroughTimer();
            this.landingPageHandler = new LandingPageHandler(ad2);
            if (ad2.getCustomEndCard() != null && AdEndCardManager.shouldShowCustomEndcard(ad2)) {
                this.shouldShowCustomEndCard = AdEndCardManager.shouldShowCustomEndcard(ad2);
                this.endCardData = ad2.getCustomEndCard();
                this.endCardCloseDelay = ad2.getEndCardCloseDelay();
            }
            if (adType == AdType.INTERSTITIAL) {
                this.skipDelay = Integer.valueOf(SkipOffsetManager.getHTMLSkipOffset(ad2.getHtmlSkipOffset(), Boolean.TRUE).intValue() * 1000);
            } else {
                this.skipDelay = Integer.valueOf(SkipOffsetManager.getHTMLSkipOffset(ad2.getMraidRewardedSkipOffset(), Boolean.FALSE).intValue() * 1000);
            }
            this.nativeButtonCloseDelay = Integer.valueOf(SkipOffsetManager.getNativeCloseButtonDelay(ad2.getNativeCloseButtonDelay()).intValue() * 1000);
        }
    }

    public int getClickThroughTimer() {
        return this.clickThroughTimer;
    }

    public ClickThroughTimerManager.ClickThroughTimerListener getClickThroughTimerListener() {
        return this.clickThroughTimerListener;
    }

    public Integer getCloseDelay() {
        return this.skipDelay;
    }

    public CustomCTAData getCustomCTAData() {
        return this.customCTAData;
    }

    public Integer getCustomCTADelay() {
        return this.customCTADelay;
    }

    public Integer getEndCardCloseDelay() {
        return this.endCardCloseDelay;
    }

    public EndCardData getEndCardData() {
        return this.endCardData;
    }

    public LandingPageHandler getLandingPage() {
        return this.landingPageHandler;
    }

    public String getLink() {
        return this.link;
    }

    public Integer getNativeButtonCloseDelay() {
        return this.nativeButtonCloseDelay;
    }

    public Integer getSkipDelay() {
        return this.skipDelay;
    }

    public boolean hasLandingPage() {
        LandingPageHandler landingPageHandler = this.landingPageHandler;
        return (landingPageHandler == null || !landingPageHandler.isLandingPageEnabled().booleanValue() || TextUtils.isEmpty(this.landingPageHandler.getCustomisationString())) ? false : true;
    }

    public boolean hasReducedCloseSize() {
        Ad ad2 = this.f95934ad;
        if (ad2 != null) {
            Boolean boolIsIconSizeReduced = ad2.isIconSizeReduced();
            if (this.f95934ad.getAdExperience().equalsIgnoreCase(AdExperience.PERFORMANCE) && boolIsIconSizeReduced != null && boolIsIconSizeReduced.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public Boolean isCustomCTAEnabled() {
        Ad ad2 = this.f95934ad;
        return Boolean.valueOf((ad2 == null || this.customCTAData == null || !AdCustomCTAManager.isEnabled(ad2).booleanValue()) ? false : true);
    }

    public void setClickThroughTimerListener(ClickThroughTimerManager.ClickThroughTimerListener clickThroughTimerListener) {
        this.clickThroughTimerListener = clickThroughTimerListener;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public boolean shouldInitEndCardView() {
        Ad ad2;
        EndCardData endCardData = this.endCardData;
        return (endCardData == null || TextUtils.isEmpty(endCardData.getContent()) || !this.shouldShowCustomEndCard || (ad2 = this.f95934ad) == null || !ad2.isPerformanceAd()) ? false : true;
    }
}
