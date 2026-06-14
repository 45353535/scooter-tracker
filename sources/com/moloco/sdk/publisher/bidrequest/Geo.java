package com.moloco.sdk.publisher.bidrequest;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ug.l;
import xg.f;
import yg.e2;
import yg.m0;
import yg.t2;
import yg.y2;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
@l
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010 JX\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÇ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fH×\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b2\u0010 ¨\u00065"}, d2 = {"Lcom/moloco/sdk/publisher/bidrequest/Geo;", "", "", "city", "country", "region", InneractiveMediationDefs.KEY_ZIPCODE, "", "latitude", "longitude", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)V", "", "seen0", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$moloco_sdk_release", "(Lcom/moloco/sdk/publisher/bidrequest/Geo;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Float;", "component6", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)Lcom/moloco/sdk/publisher/bidrequest/Geo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCity", "getCountry", "getRegion", "getZipCode", "Ljava/lang/Float;", "getLatitude", "getLongitude", y.f66058y, "$serializer", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Geo {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String city;

    @Nullable
    private final String country;

    @Nullable
    private final Float latitude;

    @Nullable
    private final Float longitude;

    @Nullable
    private final String region;

    @Nullable
    private final String zipCode;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lcom/moloco/sdk/publisher/bidrequest/Geo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/moloco/sdk/publisher/bidrequest/Geo;", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return Geo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Geo(int i10, String str, String str2, String str3, String str4, Float f10, Float f11, t2 t2Var) {
        if (63 != (i10 & 63)) {
            e2.a(i10, 63, Geo$$serializer.INSTANCE.getDescriptor());
        }
        this.city = str;
        this.country = str2;
        this.region = str3;
        this.zipCode = str4;
        this.latitude = f10;
        this.longitude = f11;
    }

    public static /* synthetic */ Geo copy$default(Geo geo, String str, String str2, String str3, String str4, Float f10, Float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = geo.city;
        }
        if ((i10 & 2) != 0) {
            str2 = geo.country;
        }
        if ((i10 & 4) != 0) {
            str3 = geo.region;
        }
        if ((i10 & 8) != 0) {
            str4 = geo.zipCode;
        }
        if ((i10 & 16) != 0) {
            f10 = geo.latitude;
        }
        if ((i10 & 32) != 0) {
            f11 = geo.longitude;
        }
        Float f12 = f10;
        Float f13 = f11;
        return geo.copy(str, str2, str3, str4, f12, f13);
    }

    public static final /* synthetic */ void write$Self$moloco_sdk_release(Geo self, f output, SerialDescriptor serialDesc) {
        y2 y2Var = y2.f119104a;
        output.h(serialDesc, 0, y2Var, self.city);
        output.h(serialDesc, 1, y2Var, self.country);
        output.h(serialDesc, 2, y2Var, self.region);
        output.h(serialDesc, 3, y2Var, self.zipCode);
        m0 m0Var = m0.f119029a;
        output.h(serialDesc, 4, m0Var, self.latitude);
        output.h(serialDesc, 5, m0Var, self.longitude);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getZipCode() {
        return this.zipCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Float getLatitude() {
        return this.latitude;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Float getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final Geo copy(@Nullable String city, @Nullable String country, @Nullable String region, @Nullable String zipCode, @Nullable Float latitude, @Nullable Float longitude) {
        return new Geo(city, country, region, zipCode, latitude, longitude);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Geo)) {
            return false;
        }
        Geo geo = (Geo) other;
        return Intrinsics.areEqual(this.city, geo.city) && Intrinsics.areEqual(this.country, geo.country) && Intrinsics.areEqual(this.region, geo.region) && Intrinsics.areEqual(this.zipCode, geo.zipCode) && Intrinsics.areEqual((Object) this.latitude, (Object) geo.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) geo.longitude);
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
    public final Float getLatitude() {
        return this.latitude;
    }

    @Nullable
    public final Float getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final String getRegion() {
        return this.region;
    }

    @Nullable
    public final String getZipCode() {
        return this.zipCode;
    }

    public int hashCode() {
        String str = this.city;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.country;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.region;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.zipCode;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f10 = this.latitude;
        int iHashCode5 = (iHashCode4 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.longitude;
        return iHashCode5 + (f11 != null ? f11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Geo(city=" + this.city + ", country=" + this.country + ", region=" + this.region + ", zipCode=" + this.zipCode + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ')';
    }

    public Geo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Float f10, @Nullable Float f11) {
        this.city = str;
        this.country = str2;
        this.region = str3;
        this.zipCode = str4;
        this.latitude = f10;
        this.longitude = f11;
    }
}
