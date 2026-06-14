package com.amazon.aps.ads.privacy;

import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.ads.util.ApsAdExtensionsKt;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.DtbSharedPreferences;
import com.iabtcf.decoder.DecoderOption;
import com.iabtcf.decoder.TCString;
import com.iabtcf.decoder.a;
import com.iabtcf.v2.PublisherRestriction;
import com.iabtcf.v2.RestrictionType;
import com.taurusx.tax.f.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0006\u0010\u001f\u001a\u00020\u0007J\u0006\u0010 \u001a\u00020\u0007J\u0006\u0010!\u001a\u00020\u0007J\u0006\u0010\"\u001a\u00020\u0007J\u0006\u0010#\u001a\u00020\u0007J\u0006\u0010$\u001a\u00020\u0007J\u0006\u0010%\u001a\u00020\u0007J\u0006\u0010&\u001a\u00020\u0018R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f¨\u0006("}, d2 = {"Lcom/amazon/aps/ads/privacy/ApsGdprHandler;", "", "<init>", "()V", "tcString", "Lcom/iabtcf/decoder/TCString;", "value", "", "isGdprApplies", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isPurpose1Consented", "()Z", "tcfVersion", "", "Ljava/lang/Integer;", "purpose1ConsentFlag", "vendorListVersion", "isApsVendorConsented", "publisherRestrictions", "", "Lcom/iabtcf/v2/PublisherRestriction;", "isTcfStringFound", "setGdprApplies", "", "isApplies", "(Ljava/lang/Boolean;)V", "(Ljava/lang/Integer;)V", "setGdprConsent", "consentString", "", "isGdprAppliesTrue", "isGdprAppliesFalse", "isValidTcfV2String", "isPurpose1ConsentFlagOn", "isValidVendorVersion", "isVendorConsentOnForAps", "isRestrictedVendorListNotHavingAps", "calculatePurpose1Consent", y.f66058y, "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApsGdprHandler {
    private static int p1CalcCount;

    @Nullable
    private Boolean isApsVendorConsented;

    @Nullable
    private Boolean isGdprApplies;
    private boolean isPurpose1Consented;
    private boolean isTcfStringFound;

    @Nullable
    private List<? extends PublisherRestriction> publisherRestrictions;

    @Nullable
    private Boolean purpose1ConsentFlag;

    @Nullable
    private TCString tcString;

    @Nullable
    private Integer tcfVersion;

    @Nullable
    private Integer vendorListVersion;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int APS_IAB_VENDOR_CONST = 793;
    private static final int APS_SUPPORTED_GVL_VERSION = 25;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/aps/ads/privacy/ApsGdprHandler$Companion;", "", "<init>", "()V", "APS_IAB_VENDOR_CONST", "", "getAPS_IAB_VENDOR_CONST", "()I", "APS_SUPPORTED_GVL_VERSION", "getAPS_SUPPORTED_GVL_VERSION", "p1CalcCount", "getP1CalcCount", "setP1CalcCount", "(I)V", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getAPS_IAB_VENDOR_CONST() {
            return ApsGdprHandler.APS_IAB_VENDOR_CONST;
        }

        public final int getAPS_SUPPORTED_GVL_VERSION() {
            return ApsGdprHandler.APS_SUPPORTED_GVL_VERSION;
        }

        public final int getP1CalcCount() {
            return ApsGdprHandler.p1CalcCount;
        }

        public final void setP1CalcCount(int i10) {
            ApsGdprHandler.p1CalcCount = i10;
        }

        private Companion() {
        }
    }

    public final void calculatePurpose1Consent() {
        this.isPurpose1Consented = (isGdprAppliesTrue() || ((isGdprAppliesFalse() && this.isTcfStringFound) || (this.isGdprApplies == null && this.isTcfStringFound))) && isValidTcfV2String() && isPurpose1ConsentFlagOn() && isValidVendorVersion() && isRestrictedVendorListNotHavingAps();
    }

    @Nullable
    /* JADX INFO: renamed from: isGdprApplies, reason: from getter */
    public final Boolean getIsGdprApplies() {
        return this.isGdprApplies;
    }

    public final boolean isGdprAppliesFalse() {
        Boolean bool = this.isGdprApplies;
        return bool != null && Intrinsics.areEqual(bool, Boolean.FALSE);
    }

    public final boolean isGdprAppliesTrue() {
        Boolean bool = this.isGdprApplies;
        return bool != null && Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    public final boolean isPurpose1ConsentFlagOn() {
        Boolean bool = this.purpose1ConsentFlag;
        return bool != null && Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: isPurpose1Consented, reason: from getter */
    public final boolean getIsPurpose1Consented() {
        return this.isPurpose1Consented;
    }

    public final boolean isRestrictedVendorListNotHavingAps() {
        List<? extends PublisherRestriction> list = this.publisherRestrictions;
        if (list != null) {
            if (list.isEmpty()) {
                return isVendorConsentOnForAps();
            }
            for (PublisherRestriction publisherRestriction : list) {
                if (publisherRestriction.getPurposeId() == 1 && publisherRestriction.getVendorIds() != null && publisherRestriction.getVendorIds().contains(APS_IAB_VENDOR_CONST) && publisherRestriction.getRestrictionType() != RestrictionType.NOT_ALLOWED && publisherRestriction.getRestrictionType() != RestrictionType.REQUIRE_LEGITIMATE_INTEREST) {
                    return true;
                }
            }
        }
        return isVendorConsentOnForAps();
    }

    /* JADX INFO: renamed from: isTcfStringFound, reason: from getter */
    public final boolean getIsTcfStringFound() {
        return this.isTcfStringFound;
    }

    public final boolean isValidTcfV2String() {
        Integer num;
        return (this.tcString == null || (num = this.tcfVersion) == null || num == null || num.intValue() != 2) ? false : true;
    }

    public final boolean isValidVendorVersion() {
        Integer num = this.vendorListVersion;
        return num != null ? num.intValue() >= APS_SUPPORTED_GVL_VERSION : num == null;
    }

    public final boolean isVendorConsentOnForAps() {
        Boolean bool = this.isApsVendorConsented;
        return bool != null && Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    public final void setGdprApplies(@Nullable Boolean isApplies) {
        this.isGdprApplies = isApplies;
    }

    public final void setGdprConsent(@Nullable String consentString) {
        boolean z10;
        this.tcString = null;
        this.purpose1ConsentFlag = null;
        this.vendorListVersion = null;
        this.isApsVendorConsented = null;
        this.publisherRestrictions = null;
        this.isTcfStringFound = consentString != null && consentString.length() > 0;
        if (consentString != null) {
            try {
                TCString tCStringA = a.a(consentString, new DecoderOption[0]);
                this.tcString = tCStringA;
                if (tCStringA != null) {
                    this.tcfVersion = Integer.valueOf(tCStringA.getVersion());
                    this.purpose1ConsentFlag = tCStringA.getPurposesConsent() == null ? null : Boolean.valueOf(tCStringA.getPurposesConsent().contains(1));
                    this.vendorListVersion = Integer.valueOf(tCStringA.getVendorListVersion());
                    this.isApsVendorConsented = tCStringA.getVendorConsent() == null ? null : Boolean.valueOf(tCStringA.getVendorConsent().contains(APS_IAB_VENDOR_CONST));
                    this.publisherRestrictions = tCStringA.getPublisherRestrictions();
                    Unit unit = Unit.f93236a;
                }
                z10 = false;
            } catch (Exception e10) {
                ApsAdExtensionsKt.remoteLog(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error parsing the GDPR String", e10);
                Unit unit2 = Unit.f93236a;
                z10 = true;
            } catch (Throwable unused) {
                ApsAdExtensionsKt.remoteLog(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error parsing the GDPR String", null);
                Unit unit3 = Unit.f93236a;
                z10 = true;
            }
        } else {
            z10 = false;
        }
        calculatePurpose1Consent();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tcfParseError", z10);
            jSONObject.put("nullTcf", consentString == null);
            jSONObject.put("isEmptyTcf", consentString != null && Intrinsics.areEqual(consentString, ""));
            jSONObject.put("isValidTcf", isValidTcfV2String());
            jSONObject.put("p1ConsentFlag", this.purpose1ConsentFlag);
            jSONObject.put("p1Consent", this.isPurpose1Consented);
            jSONObject.put("isEmptyGdprApplies", this.isGdprApplies == null);
            jSONObject.put("gdprApplies", isGdprAppliesTrue());
            int i10 = p1CalcCount + 1;
            p1CalcCount = i10;
            jSONObject.put("seqCount", i10);
            jSONObject.put("gvlVersion", this.vendorListVersion);
            jSONObject.put("isApsVendorConsented", this.isApsVendorConsented);
            jSONObject.put("tcfVersion", this.tcfVersion);
            ApsMetrics.INSTANCE.customEvent("gdprParsing", String.valueOf(DtbSharedPreferences.getInstance().isValidIdfaAvailable()), jSONObject);
        } catch (Exception unused2) {
            ApsLog.e("Error sending the gdpr metrics");
        }
    }

    public final void setGdprApplies(@Nullable Integer isApplies) {
        Boolean boolValueOf;
        if (isApplies != null) {
            boolValueOf = Boolean.valueOf(isApplies.intValue() == 1);
        } else {
            boolValueOf = null;
        }
        this.isGdprApplies = boolValueOf;
    }
}
