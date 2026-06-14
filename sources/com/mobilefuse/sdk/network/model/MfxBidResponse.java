package com.mobilefuse.sdk.network.model;

import androidx.collection.a;
import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b@\b\u0086\b\u0018\u0000 T2\u00020\u0001:\u0001TB«\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u001cJ\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010?\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010@\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010A\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010#J\t\u0010B\u001a\u00020\u0010HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010D\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010E\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010 J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\bHÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u000bHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010 JØ\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00102\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010OJ\u0013\u0010P\u001a\u00020\u00102\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010R\u001a\u00020\u000bHÖ\u0001J\t\u0010S\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010$\u001a\u0004\b,\u0010#R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010!\u001a\u0004\b/\u0010 R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010$\u001a\u0004\b0\u0010#R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010!\u001a\u0004\b1\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010!\u001a\u0004\b7\u0010 R\u0011\u0010\u0018\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;¨\u0006U"}, d2 = {"Lcom/mobilefuse/sdk/network/model/MfxBidResponse;", "", "id", "", "cpm", "", "crid", "type", "Lcom/mobilefuse/sdk/network/model/AdmMediaType;", "adm", "expires", "", "creativeFormat", "Lcom/mobilefuse/sdk/network/model/AdmCreativeFormat;", "lossUrl", "muted", "", "clickBehavior", "Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;", "maxEndCards", "endCardCloseSeconds", "", "forceSkipSeconds", "blockSkipSeconds", "shouldStreamVideo", "forceTestMode", "forceLogging", "allowClickthroughWithoutTap", "(Ljava/lang/String;DLjava/lang/String;Lcom/mobilefuse/sdk/network/model/AdmMediaType;Ljava/lang/String;ILcom/mobilefuse/sdk/network/model/AdmCreativeFormat;Ljava/lang/String;Ljava/lang/Boolean;Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAdm", "()Ljava/lang/String;", "getAllowClickthroughWithoutTap", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBlockSkipSeconds", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getClickBehavior", "()Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;", "getCpm", "()D", "getCreativeFormat", "()Lcom/mobilefuse/sdk/network/model/AdmCreativeFormat;", "getCrid", "getEndCardCloseSeconds", "getExpires", "()I", "getForceLogging", "getForceSkipSeconds", "getForceTestMode", "getId", "getLossUrl", "getMaxEndCards", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMuted", "getShouldStreamVideo", "()Z", "getType", "()Lcom/mobilefuse/sdk/network/model/AdmMediaType;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", MenuActionType.COPY, "(Ljava/lang/String;DLjava/lang/String;Lcom/mobilefuse/sdk/network/model/AdmMediaType;Ljava/lang/String;ILcom/mobilefuse/sdk/network/model/AdmCreativeFormat;Ljava/lang/String;Ljava/lang/Boolean;Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/mobilefuse/sdk/network/model/MfxBidResponse;", "equals", "other", "hashCode", "toString", y.f66058y, "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class MfxBidResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String adm;

    @Nullable
    private final Boolean allowClickthroughWithoutTap;

    @Nullable
    private final Float blockSkipSeconds;

    @Nullable
    private final ClickthroughBehaviour clickBehavior;
    private final double cpm;

    @Nullable
    private final AdmCreativeFormat creativeFormat;

    @NotNull
    private final String crid;

    @Nullable
    private final Float endCardCloseSeconds;
    private final int expires;

    @Nullable
    private final Boolean forceLogging;

    @Nullable
    private final Float forceSkipSeconds;

    @Nullable
    private final Boolean forceTestMode;

    @NotNull
    private final String id;

    @Nullable
    private final String lossUrl;

    @Nullable
    private final Integer maxEndCards;

    @Nullable
    private final Boolean muted;
    private final boolean shouldStreamVideo;

    @NotNull
    private final AdmMediaType type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/mobilefuse/sdk/network/model/MfxBidResponse$Companion;", "", "()V", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MfxBidResponse(@NotNull String id2, double d10, @NotNull String crid, @NotNull AdmMediaType type, @NotNull String adm, int i10, @Nullable AdmCreativeFormat admCreativeFormat, @Nullable String str, @Nullable Boolean bool, @Nullable ClickthroughBehaviour clickthroughBehaviour, @Nullable Integer num, @Nullable Float f10, @Nullable Float f11, @Nullable Float f12, boolean z10, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(crid, "crid");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(adm, "adm");
        this.id = id2;
        this.cpm = d10;
        this.crid = crid;
        this.type = type;
        this.adm = adm;
        this.expires = i10;
        this.creativeFormat = admCreativeFormat;
        this.lossUrl = str;
        this.muted = bool;
        this.clickBehavior = clickthroughBehaviour;
        this.maxEndCards = num;
        this.endCardCloseSeconds = f10;
        this.forceSkipSeconds = f11;
        this.blockSkipSeconds = f12;
        this.shouldStreamVideo = z10;
        this.forceTestMode = bool2;
        this.forceLogging = bool3;
        this.allowClickthroughWithoutTap = bool4;
    }

    public static /* synthetic */ MfxBidResponse copy$default(MfxBidResponse mfxBidResponse, String str, double d10, String str2, AdmMediaType admMediaType, String str3, int i10, AdmCreativeFormat admCreativeFormat, String str4, Boolean bool, ClickthroughBehaviour clickthroughBehaviour, Integer num, Float f10, Float f11, Float f12, boolean z10, Boolean bool2, Boolean bool3, Boolean bool4, int i11, Object obj) {
        Boolean bool5;
        Boolean bool6;
        String str5 = (i11 & 1) != 0 ? mfxBidResponse.id : str;
        double d11 = (i11 & 2) != 0 ? mfxBidResponse.cpm : d10;
        String str6 = (i11 & 4) != 0 ? mfxBidResponse.crid : str2;
        AdmMediaType admMediaType2 = (i11 & 8) != 0 ? mfxBidResponse.type : admMediaType;
        String str7 = (i11 & 16) != 0 ? mfxBidResponse.adm : str3;
        int i12 = (i11 & 32) != 0 ? mfxBidResponse.expires : i10;
        AdmCreativeFormat admCreativeFormat2 = (i11 & 64) != 0 ? mfxBidResponse.creativeFormat : admCreativeFormat;
        String str8 = (i11 & 128) != 0 ? mfxBidResponse.lossUrl : str4;
        Boolean bool7 = (i11 & 256) != 0 ? mfxBidResponse.muted : bool;
        ClickthroughBehaviour clickthroughBehaviour2 = (i11 & 512) != 0 ? mfxBidResponse.clickBehavior : clickthroughBehaviour;
        Integer num2 = (i11 & 1024) != 0 ? mfxBidResponse.maxEndCards : num;
        Float f13 = (i11 & 2048) != 0 ? mfxBidResponse.endCardCloseSeconds : f10;
        Float f14 = (i11 & 4096) != 0 ? mfxBidResponse.forceSkipSeconds : f11;
        String str9 = str5;
        Float f15 = (i11 & 8192) != 0 ? mfxBidResponse.blockSkipSeconds : f12;
        boolean z11 = (i11 & 16384) != 0 ? mfxBidResponse.shouldStreamVideo : z10;
        Boolean bool8 = (i11 & 32768) != 0 ? mfxBidResponse.forceTestMode : bool2;
        Boolean bool9 = (i11 & 65536) != 0 ? mfxBidResponse.forceLogging : bool3;
        if ((i11 & 131072) != 0) {
            bool6 = bool9;
            bool5 = mfxBidResponse.allowClickthroughWithoutTap;
        } else {
            bool5 = bool4;
            bool6 = bool9;
        }
        return mfxBidResponse.copy(str9, d11, str6, admMediaType2, str7, i12, admCreativeFormat2, str8, bool7, clickthroughBehaviour2, num2, f13, f14, f15, z11, bool8, bool6, bool5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final ClickthroughBehaviour getClickBehavior() {
        return this.clickBehavior;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getMaxEndCards() {
        return this.maxEndCards;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Float getEndCardCloseSeconds() {
        return this.endCardCloseSeconds;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Float getForceSkipSeconds() {
        return this.forceSkipSeconds;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Float getBlockSkipSeconds() {
        return this.blockSkipSeconds;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getShouldStreamVideo() {
        return this.shouldStreamVideo;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getForceTestMode() {
        return this.forceTestMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getForceLogging() {
        return this.forceLogging;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getAllowClickthroughWithoutTap() {
        return this.allowClickthroughWithoutTap;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getCpm() {
        return this.cpm;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCrid() {
        return this.crid;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AdmMediaType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAdm() {
        return this.adm;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getExpires() {
        return this.expires;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final AdmCreativeFormat getCreativeFormat() {
        return this.creativeFormat;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLossUrl() {
        return this.lossUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getMuted() {
        return this.muted;
    }

    @NotNull
    public final MfxBidResponse copy(@NotNull String id2, double cpm, @NotNull String crid, @NotNull AdmMediaType type, @NotNull String adm, int expires, @Nullable AdmCreativeFormat creativeFormat, @Nullable String lossUrl, @Nullable Boolean muted, @Nullable ClickthroughBehaviour clickBehavior, @Nullable Integer maxEndCards, @Nullable Float endCardCloseSeconds, @Nullable Float forceSkipSeconds, @Nullable Float blockSkipSeconds, boolean shouldStreamVideo, @Nullable Boolean forceTestMode, @Nullable Boolean forceLogging, @Nullable Boolean allowClickthroughWithoutTap) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(crid, "crid");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(adm, "adm");
        return new MfxBidResponse(id2, cpm, crid, type, adm, expires, creativeFormat, lossUrl, muted, clickBehavior, maxEndCards, endCardCloseSeconds, forceSkipSeconds, blockSkipSeconds, shouldStreamVideo, forceTestMode, forceLogging, allowClickthroughWithoutTap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MfxBidResponse)) {
            return false;
        }
        MfxBidResponse mfxBidResponse = (MfxBidResponse) other;
        return Intrinsics.areEqual(this.id, mfxBidResponse.id) && Double.compare(this.cpm, mfxBidResponse.cpm) == 0 && Intrinsics.areEqual(this.crid, mfxBidResponse.crid) && Intrinsics.areEqual(this.type, mfxBidResponse.type) && Intrinsics.areEqual(this.adm, mfxBidResponse.adm) && this.expires == mfxBidResponse.expires && Intrinsics.areEqual(this.creativeFormat, mfxBidResponse.creativeFormat) && Intrinsics.areEqual(this.lossUrl, mfxBidResponse.lossUrl) && Intrinsics.areEqual(this.muted, mfxBidResponse.muted) && Intrinsics.areEqual(this.clickBehavior, mfxBidResponse.clickBehavior) && Intrinsics.areEqual(this.maxEndCards, mfxBidResponse.maxEndCards) && Intrinsics.areEqual((Object) this.endCardCloseSeconds, (Object) mfxBidResponse.endCardCloseSeconds) && Intrinsics.areEqual((Object) this.forceSkipSeconds, (Object) mfxBidResponse.forceSkipSeconds) && Intrinsics.areEqual((Object) this.blockSkipSeconds, (Object) mfxBidResponse.blockSkipSeconds) && this.shouldStreamVideo == mfxBidResponse.shouldStreamVideo && Intrinsics.areEqual(this.forceTestMode, mfxBidResponse.forceTestMode) && Intrinsics.areEqual(this.forceLogging, mfxBidResponse.forceLogging) && Intrinsics.areEqual(this.allowClickthroughWithoutTap, mfxBidResponse.allowClickthroughWithoutTap);
    }

    @NotNull
    public final String getAdm() {
        return this.adm;
    }

    @Nullable
    public final Boolean getAllowClickthroughWithoutTap() {
        return this.allowClickthroughWithoutTap;
    }

    @Nullable
    public final Float getBlockSkipSeconds() {
        return this.blockSkipSeconds;
    }

    @Nullable
    public final ClickthroughBehaviour getClickBehavior() {
        return this.clickBehavior;
    }

    public final double getCpm() {
        return this.cpm;
    }

    @Nullable
    public final AdmCreativeFormat getCreativeFormat() {
        return this.creativeFormat;
    }

    @NotNull
    public final String getCrid() {
        return this.crid;
    }

    @Nullable
    public final Float getEndCardCloseSeconds() {
        return this.endCardCloseSeconds;
    }

    public final int getExpires() {
        return this.expires;
    }

    @Nullable
    public final Boolean getForceLogging() {
        return this.forceLogging;
    }

    @Nullable
    public final Float getForceSkipSeconds() {
        return this.forceSkipSeconds;
    }

    @Nullable
    public final Boolean getForceTestMode() {
        return this.forceTestMode;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLossUrl() {
        return this.lossUrl;
    }

    @Nullable
    public final Integer getMaxEndCards() {
        return this.maxEndCards;
    }

    @Nullable
    public final Boolean getMuted() {
        return this.muted;
    }

    public final boolean getShouldStreamVideo() {
        return this.shouldStreamVideo;
    }

    @NotNull
    public final AdmMediaType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v37, types: [int] */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v59 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + a.a(this.cpm)) * 31;
        String str2 = this.crid;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        AdmMediaType admMediaType = this.type;
        int iHashCode3 = (iHashCode2 + (admMediaType != null ? admMediaType.hashCode() : 0)) * 31;
        String str3 = this.adm;
        int iHashCode4 = (((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.expires) * 31;
        AdmCreativeFormat admCreativeFormat = this.creativeFormat;
        int iHashCode5 = (iHashCode4 + (admCreativeFormat != null ? admCreativeFormat.hashCode() : 0)) * 31;
        String str4 = this.lossUrl;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Boolean bool = this.muted;
        int iHashCode7 = (iHashCode6 + (bool != null ? bool.hashCode() : 0)) * 31;
        ClickthroughBehaviour clickthroughBehaviour = this.clickBehavior;
        int iHashCode8 = (iHashCode7 + (clickthroughBehaviour != null ? clickthroughBehaviour.hashCode() : 0)) * 31;
        Integer num = this.maxEndCards;
        int iHashCode9 = (iHashCode8 + (num != null ? num.hashCode() : 0)) * 31;
        Float f10 = this.endCardCloseSeconds;
        int iHashCode10 = (iHashCode9 + (f10 != null ? f10.hashCode() : 0)) * 31;
        Float f11 = this.forceSkipSeconds;
        int iHashCode11 = (iHashCode10 + (f11 != null ? f11.hashCode() : 0)) * 31;
        Float f12 = this.blockSkipSeconds;
        int iHashCode12 = (iHashCode11 + (f12 != null ? f12.hashCode() : 0)) * 31;
        boolean z10 = this.shouldStreamVideo;
        ?? r22 = z10;
        if (z10) {
            r22 = 1;
        }
        int i10 = (iHashCode12 + r22) * 31;
        Boolean bool2 = this.forceTestMode;
        int iHashCode13 = (i10 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.forceLogging;
        int iHashCode14 = (iHashCode13 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.allowClickthroughWithoutTap;
        return iHashCode14 + (bool4 != null ? bool4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MfxBidResponse(id=" + this.id + ", cpm=" + this.cpm + ", crid=" + this.crid + ", type=" + this.type + ", adm=" + this.adm + ", expires=" + this.expires + ", creativeFormat=" + this.creativeFormat + ", lossUrl=" + this.lossUrl + ", muted=" + this.muted + ", clickBehavior=" + this.clickBehavior + ", maxEndCards=" + this.maxEndCards + ", endCardCloseSeconds=" + this.endCardCloseSeconds + ", forceSkipSeconds=" + this.forceSkipSeconds + ", blockSkipSeconds=" + this.blockSkipSeconds + ", shouldStreamVideo=" + this.shouldStreamVideo + ", forceTestMode=" + this.forceTestMode + ", forceLogging=" + this.forceLogging + ", allowClickthroughWithoutTap=" + this.allowClickthroughWithoutTap + ")";
    }
}
