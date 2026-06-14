package org.bidon.sdk.config.models;

import androidx.compose.foundation.c;
import com.amazon.device.ads.DtbConstants;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.serializer.JsonName;
import org.bidon.sdk.utils.serializer.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lorg/bidon/sdk/config/models/RegulationsRequestBody;", "Lorg/bidon/sdk/utils/serializer/Serializable;", "coppa", "", "gdpr", "usPrivacy", "", "euPrivacy", "iab", "Lorg/bidon/sdk/config/models/IabRequestBody;", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Lorg/bidon/sdk/config/models/IabRequestBody;)V", "getCoppa", "()Z", "getGdpr", "getUsPrivacy", "()Ljava/lang/String;", "getEuPrivacy", "getIab", "()Lorg/bidon/sdk/config/models/IabRequestBody;", "component1", "component2", "component3", "component4", "component5", MenuActionType.COPY, "equals", "other", "", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RegulationsRequestBody implements Serializable {

    @JsonName(key = "coppa")
    private final boolean coppa;

    @JsonName(key = "eu_privacy")
    @Nullable
    private final String euPrivacy;

    @JsonName(key = "gdpr")
    private final boolean gdpr;

    @JsonName(key = "iab")
    @Nullable
    private final IabRequestBody iab;

    @JsonName(key = DtbConstants.APS_ADMOB_CONST_CCPA_US_PRIVACY)
    @Nullable
    private final String usPrivacy;

    public RegulationsRequestBody(boolean z10, boolean z11, @Nullable String str, @Nullable String str2, @Nullable IabRequestBody iabRequestBody) {
        this.coppa = z10;
        this.gdpr = z11;
        this.usPrivacy = str;
        this.euPrivacy = str2;
        this.iab = iabRequestBody;
    }

    public static /* synthetic */ RegulationsRequestBody copy$default(RegulationsRequestBody regulationsRequestBody, boolean z10, boolean z11, String str, String str2, IabRequestBody iabRequestBody, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = regulationsRequestBody.coppa;
        }
        if ((i10 & 2) != 0) {
            z11 = regulationsRequestBody.gdpr;
        }
        if ((i10 & 4) != 0) {
            str = regulationsRequestBody.usPrivacy;
        }
        if ((i10 & 8) != 0) {
            str2 = regulationsRequestBody.euPrivacy;
        }
        if ((i10 & 16) != 0) {
            iabRequestBody = regulationsRequestBody.iab;
        }
        IabRequestBody iabRequestBody2 = iabRequestBody;
        String str3 = str;
        return regulationsRequestBody.copy(z10, z11, str3, str2, iabRequestBody2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCoppa() {
        return this.coppa;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getGdpr() {
        return this.gdpr;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUsPrivacy() {
        return this.usPrivacy;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEuPrivacy() {
        return this.euPrivacy;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final IabRequestBody getIab() {
        return this.iab;
    }

    @NotNull
    public final RegulationsRequestBody copy(boolean coppa, boolean gdpr, @Nullable String usPrivacy, @Nullable String euPrivacy, @Nullable IabRequestBody iab) {
        return new RegulationsRequestBody(coppa, gdpr, usPrivacy, euPrivacy, iab);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegulationsRequestBody)) {
            return false;
        }
        RegulationsRequestBody regulationsRequestBody = (RegulationsRequestBody) other;
        return this.coppa == regulationsRequestBody.coppa && this.gdpr == regulationsRequestBody.gdpr && Intrinsics.areEqual(this.usPrivacy, regulationsRequestBody.usPrivacy) && Intrinsics.areEqual(this.euPrivacy, regulationsRequestBody.euPrivacy) && Intrinsics.areEqual(this.iab, regulationsRequestBody.iab);
    }

    public final boolean getCoppa() {
        return this.coppa;
    }

    @Nullable
    public final String getEuPrivacy() {
        return this.euPrivacy;
    }

    public final boolean getGdpr() {
        return this.gdpr;
    }

    @Nullable
    public final IabRequestBody getIab() {
        return this.iab;
    }

    @Nullable
    public final String getUsPrivacy() {
        return this.usPrivacy;
    }

    public int hashCode() {
        int iA = ((c.a(this.coppa) * 31) + c.a(this.gdpr)) * 31;
        String str = this.usPrivacy;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.euPrivacy;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        IabRequestBody iabRequestBody = this.iab;
        return iHashCode2 + (iabRequestBody != null ? iabRequestBody.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RegulationsRequestBody(coppa=" + this.coppa + ", gdpr=" + this.gdpr + ", usPrivacy=" + this.usPrivacy + ", euPrivacy=" + this.euPrivacy + ", iab=" + this.iab + ")";
    }
}
