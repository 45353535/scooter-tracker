package com.iabtcf.decoder;

import com.iabtcf.utils.IntIterable;
import com.iabtcf.v2.PublisherRestriction;
import j$.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface TCString {
    IntIterable getAllowedVendors();

    int getCmpId();

    int getCmpVersion();

    String getConsentLanguage();

    int getConsentScreen();

    Instant getCreated();

    IntIterable getCustomPurposesConsent();

    IntIterable getCustomPurposesLITransparency();

    boolean getDefaultVendorConsent();

    IntIterable getDisclosedVendors();

    Instant getLastUpdated();

    IntIterable getPubPurposesConsent();

    IntIterable getPubPurposesLITransparency();

    String getPublisherCC();

    List<PublisherRestriction> getPublisherRestrictions();

    boolean getPurposeOneTreatment();

    IntIterable getPurposesConsent();

    IntIterable getPurposesLITransparency();

    IntIterable getSpecialFeatureOptIns();

    int getTcfPolicyVersion();

    boolean getUseNonStandardStacks();

    IntIterable getVendorConsent();

    IntIterable getVendorLegitimateInterest();

    int getVendorListVersion();

    int getVersion();

    boolean isServiceSpecific();
}
