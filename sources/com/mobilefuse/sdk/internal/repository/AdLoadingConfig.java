package com.mobilefuse.sdk.internal.repository;

import com.mobilefuse.sdk.config.ObservableConfig;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import com.taurusx.tax.g.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006("}, d2 = {"Lcom/mobilefuse/sdk/internal/repository/AdLoadingConfig;", "", e0.f66120c, "", "observable", "Lcom/mobilefuse/sdk/config/ObservableConfig;", "adWidth", "adHeight", "isTestMode", "", "adType", "", "placementId", "adInstanceId", "(ILcom/mobilefuse/sdk/config/ObservableConfig;IIZLjava/lang/String;Ljava/lang/String;I)V", "getAdHeight", "()I", "getAdInstanceId", "getAdType", "()Ljava/lang/String;", "getAdWidth", "()Z", "getObservable", "()Lcom/mobilefuse/sdk/config/ObservableConfig;", "getPlacementId", "getUid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", MenuActionType.COPY, "equals", "other", "hashCode", "toString", y.f66058y, "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class AdLoadingConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int configUid = 1;
    private final int adHeight;
    private final int adInstanceId;

    @NotNull
    private final String adType;
    private final int adWidth;
    private final boolean isTestMode;

    @NotNull
    private final ObservableConfig observable;

    @NotNull
    private final String placementId;
    private final int uid;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/mobilefuse/sdk/internal/repository/AdLoadingConfig$Companion;", "", "()V", "configUid", "", "nextConfigUid", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public final int nextConfigUid() {
            int i10 = AdLoadingConfig.configUid;
            AdLoadingConfig.configUid = i10 + 1;
            return i10;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AdLoadingConfig(int i10, @NotNull ObservableConfig observable, int i11, int i12, boolean z10, @NotNull String adType, @NotNull String placementId, int i13) {
        Intrinsics.checkNotNullParameter(observable, "observable");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.uid = i10;
        this.observable = observable;
        this.adWidth = i11;
        this.adHeight = i12;
        this.isTestMode = z10;
        this.adType = adType;
        this.placementId = placementId;
        this.adInstanceId = i13;
    }

    public static /* synthetic */ AdLoadingConfig copy$default(AdLoadingConfig adLoadingConfig, int i10, ObservableConfig observableConfig, int i11, int i12, boolean z10, String str, String str2, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = adLoadingConfig.uid;
        }
        if ((i14 & 2) != 0) {
            observableConfig = adLoadingConfig.observable;
        }
        if ((i14 & 4) != 0) {
            i11 = adLoadingConfig.adWidth;
        }
        if ((i14 & 8) != 0) {
            i12 = adLoadingConfig.adHeight;
        }
        if ((i14 & 16) != 0) {
            z10 = adLoadingConfig.isTestMode;
        }
        if ((i14 & 32) != 0) {
            str = adLoadingConfig.adType;
        }
        if ((i14 & 64) != 0) {
            str2 = adLoadingConfig.placementId;
        }
        if ((i14 & 128) != 0) {
            i13 = adLoadingConfig.adInstanceId;
        }
        String str3 = str2;
        int i15 = i13;
        boolean z11 = z10;
        String str4 = str;
        return adLoadingConfig.copy(i10, observableConfig, i11, i12, z11, str4, str3, i15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getUid() {
        return this.uid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ObservableConfig getObservable() {
        return this.observable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAdWidth() {
        return this.adWidth;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAdHeight() {
        return this.adHeight;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsTestMode() {
        return this.isTestMode;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAdType() {
        return this.adType;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getAdInstanceId() {
        return this.adInstanceId;
    }

    @NotNull
    public final AdLoadingConfig copy(int uid, @NotNull ObservableConfig observable, int adWidth, int adHeight, boolean isTestMode, @NotNull String adType, @NotNull String placementId, int adInstanceId) {
        Intrinsics.checkNotNullParameter(observable, "observable");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        return new AdLoadingConfig(uid, observable, adWidth, adHeight, isTestMode, adType, placementId, adInstanceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdLoadingConfig)) {
            return false;
        }
        AdLoadingConfig adLoadingConfig = (AdLoadingConfig) other;
        return this.uid == adLoadingConfig.uid && Intrinsics.areEqual(this.observable, adLoadingConfig.observable) && this.adWidth == adLoadingConfig.adWidth && this.adHeight == adLoadingConfig.adHeight && this.isTestMode == adLoadingConfig.isTestMode && Intrinsics.areEqual(this.adType, adLoadingConfig.adType) && Intrinsics.areEqual(this.placementId, adLoadingConfig.placementId) && this.adInstanceId == adLoadingConfig.adInstanceId;
    }

    public final int getAdHeight() {
        return this.adHeight;
    }

    public final int getAdInstanceId() {
        return this.adInstanceId;
    }

    @NotNull
    public final String getAdType() {
        return this.adType;
    }

    public final int getAdWidth() {
        return this.adWidth;
    }

    @NotNull
    public final ObservableConfig getObservable() {
        return this.observable;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    public final int getUid() {
        return this.uid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    public int hashCode() {
        int i10 = this.uid * 31;
        ObservableConfig observableConfig = this.observable;
        int iHashCode = (((((i10 + (observableConfig != null ? observableConfig.hashCode() : 0)) * 31) + this.adWidth) * 31) + this.adHeight) * 31;
        boolean z10 = this.isTestMode;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        int i11 = (iHashCode + r12) * 31;
        String str = this.adType;
        int iHashCode2 = (i11 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.placementId;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.adInstanceId;
    }

    public final boolean isTestMode() {
        return this.isTestMode;
    }

    @NotNull
    public String toString() {
        return "AdLoadingConfig(uid=" + this.uid + ", observable=" + this.observable + ", adWidth=" + this.adWidth + ", adHeight=" + this.adHeight + ", isTestMode=" + this.isTestMode + ", adType=" + this.adType + ", placementId=" + this.placementId + ", adInstanceId=" + this.adInstanceId + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AdLoadingConfig(int r2, com.mobilefuse.sdk.config.ObservableConfig r3, int r4, int r5, boolean r6, java.lang.String r7, java.lang.String r8, int r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto La
            com.mobilefuse.sdk.internal.repository.AdLoadingConfig$Companion r2 = com.mobilefuse.sdk.internal.repository.AdLoadingConfig.INSTANCE
            int r2 = r2.nextConfigUid()
        La:
            r11 = r10 & 4
            r0 = 1
            if (r11 == 0) goto L10
            r4 = r0
        L10:
            r10 = r10 & 8
            r11 = r9
            r9 = r7
            if (r10 == 0) goto L1e
            r7 = r0
            r5 = r3
            r10 = r8
            r3 = r1
            r8 = r6
            r6 = r4
            r4 = r2
            goto L25
        L1e:
            r7 = r5
            r10 = r8
            r8 = r6
            r6 = r4
            r4 = r2
            r5 = r3
            r3 = r1
        L25:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobilefuse.sdk.internal.repository.AdLoadingConfig.<init>(int, com.mobilefuse.sdk.config.ObservableConfig, int, int, boolean, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
