package com.mobilefuse.sdk.privacy;

import com.my.target.common.menu.MenuActionType;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J5\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u001c\u001a\u00020\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0004\u0018\u00010\u00038GX\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u001c\u0010\u0011\u001a\u00020\u00068GX\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f¨\u0006!"}, d2 = {"Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;", "", "gppConsentString", "", "usPrivacyConsentString", "isSubjectToCoppa", "", "doNotTrack", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "isDoNotTrack", "()Z", "getGppConsentString", "()Ljava/lang/String;", "iabConsentString", "getIabConsentString$annotations", "()V", "getIabConsentString", "subjectToGdpr", "isSubjectToGdpr$annotations", "isSubjectToGdpr", "getUsPrivacyConsentString", "component1", "component2", "component3", "component4", MenuActionType.COPY, "equals", "other", "getHumanReadableNonEmptyValues", "hashCode", "", "toString", "Builder", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class MobileFusePrivacyPreferences {
    private final boolean doNotTrack;

    @Nullable
    private final String gppConsentString;

    @Nullable
    private final String iabConsentString;
    private final boolean isSubjectToCoppa;
    private final boolean subjectToGdpr;

    @Nullable
    private final String usPrivacyConsentString;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\r\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0007J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences$Builder;", "", "()V", "doNotTrack", "", "gppConsentString", "", "isSubjectToCoppa", "usPrivacyConsentString", "build", "Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;", "setDoNotTrack", "setGppConsentString", "setIabConsentString", "iabConsentString", "setSubjectToCoppa", "subjectToCoppa", "setSubjectToGdpr", "subjectToGdpr", "setUsPrivacyConsentString", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Builder {
        private boolean doNotTrack;
        private String gppConsentString;
        private boolean isSubjectToCoppa;
        private String usPrivacyConsentString;

        @NotNull
        public final MobileFusePrivacyPreferences build() {
            return new MobileFusePrivacyPreferences(this.gppConsentString, this.usPrivacyConsentString, this.isSubjectToCoppa, this.doNotTrack);
        }

        @NotNull
        public final Builder setDoNotTrack(boolean doNotTrack) {
            this.doNotTrack = doNotTrack;
            return this;
        }

        @NotNull
        public final Builder setGppConsentString(@Nullable String gppConsentString) {
            this.gppConsentString = gppConsentString;
            return this;
        }

        @NotNull
        public final Builder setIabConsentString(@Nullable String iabConsentString) {
            return this;
        }

        @NotNull
        public final Builder setSubjectToCoppa(boolean subjectToCoppa) {
            this.isSubjectToCoppa = subjectToCoppa;
            return this;
        }

        @NotNull
        public final Builder setSubjectToGdpr(boolean subjectToGdpr) {
            return this;
        }

        @NotNull
        public final Builder setUsPrivacyConsentString(@Nullable String usPrivacyConsentString) {
            this.usPrivacyConsentString = usPrivacyConsentString;
            return this;
        }
    }

    public MobileFusePrivacyPreferences() {
        this(null, null, false, false, 15, null);
    }

    public static /* synthetic */ MobileFusePrivacyPreferences copy$default(MobileFusePrivacyPreferences mobileFusePrivacyPreferences, String str, String str2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = mobileFusePrivacyPreferences.gppConsentString;
        }
        if ((i10 & 2) != 0) {
            str2 = mobileFusePrivacyPreferences.usPrivacyConsentString;
        }
        if ((i10 & 4) != 0) {
            z10 = mobileFusePrivacyPreferences.isSubjectToCoppa;
        }
        if ((i10 & 8) != 0) {
            z11 = mobileFusePrivacyPreferences.doNotTrack;
        }
        return mobileFusePrivacyPreferences.copy(str, str2, z10, z11);
    }

    public static /* synthetic */ void getIabConsentString$annotations() {
    }

    public static /* synthetic */ void isSubjectToGdpr$annotations() {
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGppConsentString() {
        return this.gppConsentString;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUsPrivacyConsentString() {
        return this.usPrivacyConsentString;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSubjectToCoppa() {
        return this.isSubjectToCoppa;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDoNotTrack() {
        return this.doNotTrack;
    }

    @NotNull
    public final MobileFusePrivacyPreferences copy(@Nullable String gppConsentString, @Nullable String usPrivacyConsentString, boolean isSubjectToCoppa, boolean doNotTrack) {
        return new MobileFusePrivacyPreferences(gppConsentString, usPrivacyConsentString, isSubjectToCoppa, doNotTrack);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileFusePrivacyPreferences)) {
            return false;
        }
        MobileFusePrivacyPreferences mobileFusePrivacyPreferences = (MobileFusePrivacyPreferences) other;
        return Intrinsics.areEqual(this.gppConsentString, mobileFusePrivacyPreferences.gppConsentString) && Intrinsics.areEqual(this.usPrivacyConsentString, mobileFusePrivacyPreferences.usPrivacyConsentString) && this.isSubjectToCoppa == mobileFusePrivacyPreferences.isSubjectToCoppa && this.doNotTrack == mobileFusePrivacyPreferences.doNotTrack;
    }

    @Nullable
    public final String getGppConsentString() {
        return this.gppConsentString;
    }

    @NotNull
    public final String getHumanReadableNonEmptyValues() {
        ArrayList arrayList = new ArrayList();
        if (this.gppConsentString != null) {
            arrayList.add("privacy.gppstring");
        }
        if (this.usPrivacyConsentString != null) {
            arrayList.add("privacy.usstring");
        }
        if (this.isSubjectToCoppa) {
            arrayList.add("privacy.coppa");
        }
        if (this.doNotTrack) {
            arrayList.add("privacy.donottrack");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
    }

    @Nullable
    public final String getIabConsentString() {
        return this.iabConsentString;
    }

    @Nullable
    public final String getUsPrivacyConsentString() {
        return this.usPrivacyConsentString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public int hashCode() {
        String str = this.gppConsentString;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.usPrivacyConsentString;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z10 = this.isSubjectToCoppa;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        int i10 = (iHashCode2 + r12) * 31;
        boolean z11 = this.doNotTrack;
        return i10 + (z11 ? 1 : z11);
    }

    public final boolean isDoNotTrack() {
        return this.doNotTrack;
    }

    public final boolean isSubjectToCoppa() {
        return this.isSubjectToCoppa;
    }

    /* JADX INFO: renamed from: isSubjectToGdpr, reason: from getter */
    public final boolean getSubjectToGdpr() {
        return this.subjectToGdpr;
    }

    @NotNull
    public String toString() {
        return "MobileFusePrivacyPreferences(gppConsentString=" + this.gppConsentString + ", usPrivacyConsentString=" + this.usPrivacyConsentString + ", isSubjectToCoppa=" + this.isSubjectToCoppa + ", doNotTrack=" + this.doNotTrack + ")";
    }

    public MobileFusePrivacyPreferences(@Nullable String str, @Nullable String str2, boolean z10, boolean z11) {
        this.gppConsentString = str;
        this.usPrivacyConsentString = str2;
        this.isSubjectToCoppa = z10;
        this.doNotTrack = z11;
        this.subjectToGdpr = true;
        this.iabConsentString = "";
    }

    public /* synthetic */ MobileFusePrivacyPreferences(String str, String str2, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11);
    }
}
