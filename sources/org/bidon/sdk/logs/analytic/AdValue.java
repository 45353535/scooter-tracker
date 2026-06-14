package org.bidon.sdk.logs.analytic;

import androidx.collection.a;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lorg/bidon/sdk/logs/analytic/AdValue;", "", "adRevenue", "", "currency", "", "precision", "Lorg/bidon/sdk/logs/analytic/Precision;", "<init>", "(DLjava/lang/String;Lorg/bidon/sdk/logs/analytic/Precision;)V", "getAdRevenue", "()D", "getCurrency", "()Ljava/lang/String;", "getPrecision", "()Lorg/bidon/sdk/logs/analytic/Precision;", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", y.f66058y, "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AdValue {

    @NotNull
    public static final String USD = "USD";
    private final double adRevenue;

    @NotNull
    private final String currency;

    @NotNull
    private final Precision precision;

    public AdValue(double d10, @NotNull String currency, @NotNull Precision precision) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(precision, "precision");
        this.adRevenue = d10;
        this.currency = currency;
        this.precision = precision;
    }

    public static /* synthetic */ AdValue copy$default(AdValue adValue, double d10, String str, Precision precision, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = adValue.adRevenue;
        }
        if ((i10 & 2) != 0) {
            str = adValue.currency;
        }
        if ((i10 & 4) != 0) {
            precision = adValue.precision;
        }
        return adValue.copy(d10, str, precision);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAdRevenue() {
        return this.adRevenue;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Precision getPrecision() {
        return this.precision;
    }

    @NotNull
    public final AdValue copy(double adRevenue, @NotNull String currency, @NotNull Precision precision) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(precision, "precision");
        return new AdValue(adRevenue, currency, precision);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdValue)) {
            return false;
        }
        AdValue adValue = (AdValue) other;
        return Double.compare(this.adRevenue, adValue.adRevenue) == 0 && Intrinsics.areEqual(this.currency, adValue.currency) && this.precision == adValue.precision;
    }

    public final double getAdRevenue() {
        return this.adRevenue;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final Precision getPrecision() {
        return this.precision;
    }

    public int hashCode() {
        return (((a.a(this.adRevenue) * 31) + this.currency.hashCode()) * 31) + this.precision.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdValue(adRevenue=" + this.adRevenue + ", currency=" + this.currency + ", precision=" + this.precision + ")";
    }

    public /* synthetic */ AdValue(double d10, String str, Precision precision, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, (i10 & 2) != 0 ? "USD" : str, precision);
    }
}
