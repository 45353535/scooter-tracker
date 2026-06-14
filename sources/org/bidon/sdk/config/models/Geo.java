package org.bidon.sdk.config.models;

import com.ironsource.N6;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.serializer.JsonName;
import org.bidon.sdk.utils.serializer.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003Jl\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u0006HÖ\u0001J\t\u0010/\u001a\u00020\nHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lorg/bidon/sdk/config/models/Geo;", "Lorg/bidon/sdk/utils/serializer/Serializable;", N6.f41419s, "", "lon", "accuracy", "", "lastFix", "", "country", "", "city", "zip", "utcOffset", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getLat", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLon", "getAccuracy", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLastFix", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCountry", "()Ljava/lang/String;", "getCity", "getZip", "getUtcOffset", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", MenuActionType.COPY, "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lorg/bidon/sdk/config/models/Geo;", "equals", "", "other", "", "hashCode", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Geo implements Serializable {

    @JsonName(key = "accuracy")
    @Nullable
    private final Integer accuracy;

    @JsonName(key = "city")
    @Nullable
    private final String city;

    @JsonName(key = "country")
    @Nullable
    private final String country;

    @JsonName(key = "lastfix")
    @Nullable
    private final Long lastFix;

    @JsonName(key = N6.f41419s)
    @Nullable
    private final Double lat;

    @JsonName(key = "lon")
    @Nullable
    private final Double lon;

    @JsonName(key = "utcoffset")
    private final int utcOffset;

    @JsonName(key = "zip")
    @Nullable
    private final String zip;

    public Geo(@Nullable Double d10, @Nullable Double d11, @Nullable Integer num, @Nullable Long l10, @Nullable String str, @Nullable String str2, @Nullable String str3, int i10) {
        this.lat = d10;
        this.lon = d11;
        this.accuracy = num;
        this.lastFix = l10;
        this.country = str;
        this.city = str2;
        this.zip = str3;
        this.utcOffset = i10;
    }

    public static /* synthetic */ Geo copy$default(Geo geo, Double d10, Double d11, Integer num, Long l10, String str, String str2, String str3, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d10 = geo.lat;
        }
        if ((i11 & 2) != 0) {
            d11 = geo.lon;
        }
        if ((i11 & 4) != 0) {
            num = geo.accuracy;
        }
        if ((i11 & 8) != 0) {
            l10 = geo.lastFix;
        }
        if ((i11 & 16) != 0) {
            str = geo.country;
        }
        if ((i11 & 32) != 0) {
            str2 = geo.city;
        }
        if ((i11 & 64) != 0) {
            str3 = geo.zip;
        }
        if ((i11 & 128) != 0) {
            i10 = geo.utcOffset;
        }
        String str4 = str3;
        int i12 = i10;
        String str5 = str;
        String str6 = str2;
        return geo.copy(d10, d11, num, l10, str5, str6, str4, i12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getLat() {
        return this.lat;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getLon() {
        return this.lon;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getAccuracy() {
        return this.accuracy;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getLastFix() {
        return this.lastFix;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getUtcOffset() {
        return this.utcOffset;
    }

    @NotNull
    public final Geo copy(@Nullable Double lat, @Nullable Double lon, @Nullable Integer accuracy, @Nullable Long lastFix, @Nullable String country, @Nullable String city, @Nullable String zip, int utcOffset) {
        return new Geo(lat, lon, accuracy, lastFix, country, city, zip, utcOffset);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Geo)) {
            return false;
        }
        Geo geo = (Geo) other;
        return Intrinsics.areEqual((Object) this.lat, (Object) geo.lat) && Intrinsics.areEqual((Object) this.lon, (Object) geo.lon) && Intrinsics.areEqual(this.accuracy, geo.accuracy) && Intrinsics.areEqual(this.lastFix, geo.lastFix) && Intrinsics.areEqual(this.country, geo.country) && Intrinsics.areEqual(this.city, geo.city) && Intrinsics.areEqual(this.zip, geo.zip) && this.utcOffset == geo.utcOffset;
    }

    @Nullable
    public final Integer getAccuracy() {
        return this.accuracy;
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final Long getLastFix() {
        return this.lastFix;
    }

    @Nullable
    public final Double getLat() {
        return this.lat;
    }

    @Nullable
    public final Double getLon() {
        return this.lon;
    }

    public final int getUtcOffset() {
        return this.utcOffset;
    }

    @Nullable
    public final String getZip() {
        return this.zip;
    }

    public int hashCode() {
        Double d10 = this.lat;
        int iHashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.lon;
        int iHashCode2 = (iHashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Integer num = this.accuracy;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l10 = this.lastFix;
        int iHashCode4 = (iHashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.country;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.city;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.zip;
        return ((iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.utcOffset;
    }

    @NotNull
    public String toString() {
        return "Geo(lat=" + this.lat + ", lon=" + this.lon + ", accuracy=" + this.accuracy + ", lastFix=" + this.lastFix + ", country=" + this.country + ", city=" + this.city + ", zip=" + this.zip + ", utcOffset=" + this.utcOffset + ")";
    }
}
