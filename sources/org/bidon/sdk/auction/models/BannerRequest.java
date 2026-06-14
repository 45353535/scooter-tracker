package org.bidon.sdk.auction.models;

import com.ironsource.mediationsdk.l;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.serializer.JsonName;
import org.bidon.sdk.utils.serializer.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qf.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lorg/bidon/sdk/auction/models/BannerRequest;", "Lorg/bidon/sdk/utils/serializer/Serializable;", "formatCode", "", "<init>", "(Ljava/lang/String;)V", "getFormatCode", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "StatFormat", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BannerRequest implements Serializable {

    @JsonName(key = "format")
    @NotNull
    private final String formatCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lorg/bidon/sdk/auction/models/BannerRequest$StatFormat;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$bidon_productionRelease", "()Ljava/lang/String;", "BANNER_320x50", "LEADERBOARD_728x90", "MREC_300x250", "ADAPTIVE_BANNER", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StatFormat {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StatFormat[] $VALUES;

        @NotNull
        private final String code;
        public static final StatFormat BANNER_320x50 = new StatFormat("BANNER_320x50", 0, "BANNER");
        public static final StatFormat LEADERBOARD_728x90 = new StatFormat("LEADERBOARD_728x90", 1, l.f44064d);
        public static final StatFormat MREC_300x250 = new StatFormat("MREC_300x250", 2, "MREC");
        public static final StatFormat ADAPTIVE_BANNER = new StatFormat("ADAPTIVE_BANNER", 3, "ADAPTIVE");

        private static final /* synthetic */ StatFormat[] $values() {
            return new StatFormat[]{BANNER_320x50, LEADERBOARD_728x90, MREC_300x250, ADAPTIVE_BANNER};
        }

        static {
            StatFormat[] statFormatArr$values = $values();
            $VALUES = statFormatArr$values;
            $ENTRIES = a.a(statFormatArr$values);
        }

        private StatFormat(String str, int i10, String str2) {
            this.code = str2;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static StatFormat valueOf(String str) {
            return (StatFormat) Enum.valueOf(StatFormat.class, str);
        }

        public static StatFormat[] values() {
            return (StatFormat[]) $VALUES.clone();
        }

        @NotNull
        /* JADX INFO: renamed from: getCode$bidon_productionRelease, reason: from getter */
        public final String getCode() {
            return this.code;
        }
    }

    public BannerRequest(@NotNull String formatCode) {
        Intrinsics.checkNotNullParameter(formatCode, "formatCode");
        this.formatCode = formatCode;
    }

    public static /* synthetic */ BannerRequest copy$default(BannerRequest bannerRequest, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bannerRequest.formatCode;
        }
        return bannerRequest.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFormatCode() {
        return this.formatCode;
    }

    @NotNull
    public final BannerRequest copy(@NotNull String formatCode) {
        Intrinsics.checkNotNullParameter(formatCode, "formatCode");
        return new BannerRequest(formatCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BannerRequest) && Intrinsics.areEqual(this.formatCode, ((BannerRequest) other).formatCode);
    }

    @NotNull
    public final String getFormatCode() {
        return this.formatCode;
    }

    public int hashCode() {
        return this.formatCode.hashCode();
    }

    @NotNull
    public String toString() {
        return "BannerRequest(formatCode=" + this.formatCode + ")";
    }
}
