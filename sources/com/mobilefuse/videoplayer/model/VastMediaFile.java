package com.mobilefuse.videoplayer.model;

import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b1\b\u0086\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0017J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0015HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJØ\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u000f2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\bHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001f\u0010\u001bR\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b \u0010\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b%\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b'\u0010\u001bR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b(\u0010\u001bR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b)\u0010#R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0019R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b.\u0010\u001b¨\u0006F"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastMediaFile;", "", "id", "", "url", "delivery", "type", "width", "", "height", "codec", a.f65992s, a.f65988a, a.f65990n, "scalable", "", "maintainAspectRatio", "apiFramework", "fileSize", "mediaType", "sizeRatio", "", "pixelsCount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;FLjava/lang/Integer;)V", "getApiFramework", "()Ljava/lang/String;", "getBitrate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCodec", "getDelivery", "getFileSize", "getHeight", "getId", "getMaintainAspectRatio", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxBitrate", "getMediaType", "getMinBitrate", "getPixelsCount", "getScalable", "getSizeRatio", "()F", "getType", "getUrl", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;FLjava/lang/Integer;)Lcom/mobilefuse/videoplayer/model/VastMediaFile;", "equals", "other", "hashCode", "toString", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class VastMediaFile {

    @Nullable
    private final String apiFramework;

    @Nullable
    private final Integer bitrate;

    @Nullable
    private final String codec;

    @Nullable
    private final String delivery;

    @Nullable
    private final Integer fileSize;

    @Nullable
    private final Integer height;

    @Nullable
    private final String id;

    @Nullable
    private final Boolean maintainAspectRatio;

    @Nullable
    private final Integer maxBitrate;

    @Nullable
    private final String mediaType;

    @Nullable
    private final Integer minBitrate;

    @Nullable
    private final Integer pixelsCount;

    @Nullable
    private final Boolean scalable;
    private final float sizeRatio;

    @Nullable
    private final String type;

    @Nullable
    private final String url;

    @Nullable
    private final Integer width;

    public VastMediaFile(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable Integer num2, @Nullable String str5, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str6, @Nullable Integer num6, @Nullable String str7, float f10, @Nullable Integer num7) {
        this.id = str;
        this.url = str2;
        this.delivery = str3;
        this.type = str4;
        this.width = num;
        this.height = num2;
        this.codec = str5;
        this.bitrate = num3;
        this.minBitrate = num4;
        this.maxBitrate = num5;
        this.scalable = bool;
        this.maintainAspectRatio = bool2;
        this.apiFramework = str6;
        this.fileSize = num6;
        this.mediaType = str7;
        this.sizeRatio = f10;
        this.pixelsCount = num7;
    }

    public static /* synthetic */ VastMediaFile copy$default(VastMediaFile vastMediaFile, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, Integer num3, Integer num4, Integer num5, Boolean bool, Boolean bool2, String str6, Integer num6, String str7, float f10, Integer num7, int i10, Object obj) {
        Integer num8;
        float f11;
        String str8;
        VastMediaFile vastMediaFile2;
        String str9;
        String str10;
        String str11;
        String str12;
        Integer num9;
        Integer num10;
        String str13;
        Integer num11;
        Integer num12;
        Integer num13;
        Boolean bool3;
        Boolean bool4;
        String str14;
        Integer num14;
        String str15 = (i10 & 1) != 0 ? vastMediaFile.id : str;
        String str16 = (i10 & 2) != 0 ? vastMediaFile.url : str2;
        String str17 = (i10 & 4) != 0 ? vastMediaFile.delivery : str3;
        String str18 = (i10 & 8) != 0 ? vastMediaFile.type : str4;
        Integer num15 = (i10 & 16) != 0 ? vastMediaFile.width : num;
        Integer num16 = (i10 & 32) != 0 ? vastMediaFile.height : num2;
        String str19 = (i10 & 64) != 0 ? vastMediaFile.codec : str5;
        Integer num17 = (i10 & 128) != 0 ? vastMediaFile.bitrate : num3;
        Integer num18 = (i10 & 256) != 0 ? vastMediaFile.minBitrate : num4;
        Integer num19 = (i10 & 512) != 0 ? vastMediaFile.maxBitrate : num5;
        Boolean bool5 = (i10 & 1024) != 0 ? vastMediaFile.scalable : bool;
        Boolean bool6 = (i10 & 2048) != 0 ? vastMediaFile.maintainAspectRatio : bool2;
        String str20 = (i10 & 4096) != 0 ? vastMediaFile.apiFramework : str6;
        Integer num20 = (i10 & 8192) != 0 ? vastMediaFile.fileSize : num6;
        String str21 = str15;
        String str22 = (i10 & 16384) != 0 ? vastMediaFile.mediaType : str7;
        float f12 = (i10 & 32768) != 0 ? vastMediaFile.sizeRatio : f10;
        if ((i10 & 65536) != 0) {
            f11 = f12;
            num8 = vastMediaFile.pixelsCount;
            str9 = str22;
            str10 = str16;
            str11 = str17;
            str12 = str18;
            num9 = num15;
            num10 = num16;
            str13 = str19;
            num11 = num17;
            num12 = num18;
            num13 = num19;
            bool3 = bool5;
            bool4 = bool6;
            str14 = str20;
            num14 = num20;
            str8 = str21;
            vastMediaFile2 = vastMediaFile;
        } else {
            num8 = num7;
            f11 = f12;
            str8 = str21;
            vastMediaFile2 = vastMediaFile;
            str9 = str22;
            str10 = str16;
            str11 = str17;
            str12 = str18;
            num9 = num15;
            num10 = num16;
            str13 = str19;
            num11 = num17;
            num12 = num18;
            num13 = num19;
            bool3 = bool5;
            bool4 = bool6;
            str14 = str20;
            num14 = num20;
        }
        return vastMediaFile2.copy(str8, str10, str11, str12, num9, num10, str13, num11, num12, num13, bool3, bool4, str14, num14, str9, f11, num8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getMaxBitrate() {
        return this.maxBitrate;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getScalable() {
        return this.scalable;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getMaintainAspectRatio() {
        return this.maintainAspectRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getApiFramework() {
        return this.apiFramework;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getFileSize() {
        return this.fileSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final float getSizeRatio() {
        return this.sizeRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getPixelsCount() {
        return this.pixelsCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDelivery() {
        return this.delivery;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCodec() {
        return this.codec;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getBitrate() {
        return this.bitrate;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getMinBitrate() {
        return this.minBitrate;
    }

    @NotNull
    public final VastMediaFile copy(@Nullable String id2, @Nullable String url, @Nullable String delivery, @Nullable String type, @Nullable Integer width, @Nullable Integer height, @Nullable String codec, @Nullable Integer bitrate, @Nullable Integer minBitrate, @Nullable Integer maxBitrate, @Nullable Boolean scalable, @Nullable Boolean maintainAspectRatio, @Nullable String apiFramework, @Nullable Integer fileSize, @Nullable String mediaType, float sizeRatio, @Nullable Integer pixelsCount) {
        return new VastMediaFile(id2, url, delivery, type, width, height, codec, bitrate, minBitrate, maxBitrate, scalable, maintainAspectRatio, apiFramework, fileSize, mediaType, sizeRatio, pixelsCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VastMediaFile)) {
            return false;
        }
        VastMediaFile vastMediaFile = (VastMediaFile) other;
        return Intrinsics.areEqual(this.id, vastMediaFile.id) && Intrinsics.areEqual(this.url, vastMediaFile.url) && Intrinsics.areEqual(this.delivery, vastMediaFile.delivery) && Intrinsics.areEqual(this.type, vastMediaFile.type) && Intrinsics.areEqual(this.width, vastMediaFile.width) && Intrinsics.areEqual(this.height, vastMediaFile.height) && Intrinsics.areEqual(this.codec, vastMediaFile.codec) && Intrinsics.areEqual(this.bitrate, vastMediaFile.bitrate) && Intrinsics.areEqual(this.minBitrate, vastMediaFile.minBitrate) && Intrinsics.areEqual(this.maxBitrate, vastMediaFile.maxBitrate) && Intrinsics.areEqual(this.scalable, vastMediaFile.scalable) && Intrinsics.areEqual(this.maintainAspectRatio, vastMediaFile.maintainAspectRatio) && Intrinsics.areEqual(this.apiFramework, vastMediaFile.apiFramework) && Intrinsics.areEqual(this.fileSize, vastMediaFile.fileSize) && Intrinsics.areEqual(this.mediaType, vastMediaFile.mediaType) && Float.compare(this.sizeRatio, vastMediaFile.sizeRatio) == 0 && Intrinsics.areEqual(this.pixelsCount, vastMediaFile.pixelsCount);
    }

    @Nullable
    public final String getApiFramework() {
        return this.apiFramework;
    }

    @Nullable
    public final Integer getBitrate() {
        return this.bitrate;
    }

    @Nullable
    public final String getCodec() {
        return this.codec;
    }

    @Nullable
    public final String getDelivery() {
        return this.delivery;
    }

    @Nullable
    public final Integer getFileSize() {
        return this.fileSize;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Boolean getMaintainAspectRatio() {
        return this.maintainAspectRatio;
    }

    @Nullable
    public final Integer getMaxBitrate() {
        return this.maxBitrate;
    }

    @Nullable
    public final String getMediaType() {
        return this.mediaType;
    }

    @Nullable
    public final Integer getMinBitrate() {
        return this.minBitrate;
    }

    @Nullable
    public final Integer getPixelsCount() {
        return this.pixelsCount;
    }

    @Nullable
    public final Boolean getScalable() {
        return this.scalable;
    }

    public final float getSizeRatio() {
        return this.sizeRatio;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.delivery;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.type;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.width;
        int iHashCode5 = (iHashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.height;
        int iHashCode6 = (iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str5 = this.codec;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num3 = this.bitrate;
        int iHashCode8 = (iHashCode7 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.minBitrate;
        int iHashCode9 = (iHashCode8 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.maxBitrate;
        int iHashCode10 = (iHashCode9 + (num5 != null ? num5.hashCode() : 0)) * 31;
        Boolean bool = this.scalable;
        int iHashCode11 = (iHashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.maintainAspectRatio;
        int iHashCode12 = (iHashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str6 = this.apiFramework;
        int iHashCode13 = (iHashCode12 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num6 = this.fileSize;
        int iHashCode14 = (iHashCode13 + (num6 != null ? num6.hashCode() : 0)) * 31;
        String str7 = this.mediaType;
        int iHashCode15 = (((iHashCode14 + (str7 != null ? str7.hashCode() : 0)) * 31) + Float.floatToIntBits(this.sizeRatio)) * 31;
        Integer num7 = this.pixelsCount;
        return iHashCode15 + (num7 != null ? num7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VastMediaFile(id=" + this.id + ", url=" + this.url + ", delivery=" + this.delivery + ", type=" + this.type + ", width=" + this.width + ", height=" + this.height + ", codec=" + this.codec + ", bitrate=" + this.bitrate + ", minBitrate=" + this.minBitrate + ", maxBitrate=" + this.maxBitrate + ", scalable=" + this.scalable + ", maintainAspectRatio=" + this.maintainAspectRatio + ", apiFramework=" + this.apiFramework + ", fileSize=" + this.fileSize + ", mediaType=" + this.mediaType + ", sizeRatio=" + this.sizeRatio + ", pixelsCount=" + this.pixelsCount + ")";
    }
}
