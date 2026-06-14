package com.appodeal.ads.analytics.models;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qf.a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/appodeal/ads/analytics/models/AdUnitsEvent;", "Lcom/appodeal/ads/analytics/models/Event;", "adUnitParams", "Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;", "getAdUnitParams", "()Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;", "AdUnitStart", "AdUnitFinish", "AdUnitExpired", "AdUnitRevenue", "Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitExpired;", "Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitFinish;", "Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitRevenue;", "Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitStart;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AdUnitsEvent extends Event {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitExpired;", "Lcom/appodeal/ads/analytics/models/AdUnitsEvent;", "adUnitParams", "Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;", "<init>", "(Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;)V", "getAdUnitParams", "()Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;", "name", "", "getName", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AdUnitExpired implements AdUnitsEvent {
        private final GeneralAdUnitParams adUnitParams;
        private final String name;

        public AdUnitExpired(GeneralAdUnitParams adUnitParams) {
            Intrinsics.checkNotNullParameter(adUnitParams, "adUnitParams");
            this.adUnitParams = adUnitParams;
            this.name = "adunit_expired";
        }

        public static /* synthetic */ AdUnitExpired copy$default(AdUnitExpired adUnitExpired, GeneralAdUnitParams generalAdUnitParams, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                generalAdUnitParams = adUnitExpired.adUnitParams;
            }
            return adUnitExpired.copy(generalAdUnitParams);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GeneralAdUnitParams getAdUnitParams() {
            return this.adUnitParams;
        }

        public final AdUnitExpired copy(GeneralAdUnitParams adUnitParams) {
            Intrinsics.checkNotNullParameter(adUnitParams, "adUnitParams");
            return new AdUnitExpired(adUnitParams);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AdUnitExpired) && Intrinsics.areEqual(this.adUnitParams, ((AdUnitExpired) other).adUnitParams);
        }

        @Override // com.appodeal.ads.analytics.models.AdUnitsEvent
        public GeneralAdUnitParams getAdUnitParams() {
            return this.adUnitParams;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.adUnitParams.hashCode();
        }

        public String toString() {
            return "AdUnitExpired(adUnitParams=" + this.adUnitParams + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\rHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitFinish;", "Lcom/appodeal/ads/analytics/models/AdUnitsEvent;", "adUnitParams", "Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;", "result", "Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitFinish$Result;", "<init>", "(Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitFinish$Result;)V", "getAdUnitParams", "()Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;", "getResult", "()Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitFinish$Result;", "name", "", "getName", "()Ljava/lang/String;", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "Result", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AdUnitFinish implements AdUnitsEvent {
        private final GeneralAdUnitParams adUnitParams;
        private final String name;
        private final Result result;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitFinish$Result;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "SUCCESSFUL", "NOFILL", "TIMEOUTREACHED", "EXCEPTION", "UNDEFINEDADAPTER", "INCORRECTADUNIT", "INVALIDASSETS", "CANCELED", "UNRECOGNIZED", "INCORRECTCREATIVE", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Result {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Result[] $VALUES;
            private final String code;
            public static final Result SUCCESSFUL = new Result("SUCCESSFUL", 0, "SUCCESSFUL");
            public static final Result NOFILL = new Result("NOFILL", 1, "NOFILL");
            public static final Result TIMEOUTREACHED = new Result("TIMEOUTREACHED", 2, "TIMEOUTREACHED");
            public static final Result EXCEPTION = new Result("EXCEPTION", 3, "EXCEPTION");
            public static final Result UNDEFINEDADAPTER = new Result("UNDEFINEDADAPTER", 4, "UNDEFINEDADAPTER");
            public static final Result INCORRECTADUNIT = new Result("INCORRECTADUNIT", 5, "INCORRECTADUNIT");
            public static final Result INVALIDASSETS = new Result("INVALIDASSETS", 6, "INVALIDASSETS");
            public static final Result CANCELED = new Result("CANCELED", 7, "CANCELED");
            public static final Result UNRECOGNIZED = new Result("UNRECOGNIZED", 8, "UNRECOGNIZED");
            public static final Result INCORRECTCREATIVE = new Result("INCORRECTCREATIVE", 9, "INCORRECTCREATIVE");

            private static final /* synthetic */ Result[] $values() {
                return new Result[]{SUCCESSFUL, NOFILL, TIMEOUTREACHED, EXCEPTION, UNDEFINEDADAPTER, INCORRECTADUNIT, INVALIDASSETS, CANCELED, UNRECOGNIZED, INCORRECTCREATIVE};
            }

            static {
                Result[] resultArr$values = $values();
                $VALUES = resultArr$values;
                $ENTRIES = a.a(resultArr$values);
            }

            private Result(String str, int i10, String str2) {
                this.code = str2;
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static Result valueOf(String str) {
                return (Result) Enum.valueOf(Result.class, str);
            }

            public static Result[] values() {
                return (Result[]) $VALUES.clone();
            }

            public final String getCode() {
                return this.code;
            }
        }

        public AdUnitFinish(GeneralAdUnitParams adUnitParams, Result result) {
            Intrinsics.checkNotNullParameter(adUnitParams, "adUnitParams");
            Intrinsics.checkNotNullParameter(result, "result");
            this.adUnitParams = adUnitParams;
            this.result = result;
            this.name = "adunit_finish";
        }

        public static /* synthetic */ AdUnitFinish copy$default(AdUnitFinish adUnitFinish, GeneralAdUnitParams generalAdUnitParams, Result result, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                generalAdUnitParams = adUnitFinish.adUnitParams;
            }
            if ((i10 & 2) != 0) {
                result = adUnitFinish.result;
            }
            return adUnitFinish.copy(generalAdUnitParams, result);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GeneralAdUnitParams getAdUnitParams() {
            return this.adUnitParams;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Result getResult() {
            return this.result;
        }

        public final AdUnitFinish copy(GeneralAdUnitParams adUnitParams, Result result) {
            Intrinsics.checkNotNullParameter(adUnitParams, "adUnitParams");
            Intrinsics.checkNotNullParameter(result, "result");
            return new AdUnitFinish(adUnitParams, result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdUnitFinish)) {
                return false;
            }
            AdUnitFinish adUnitFinish = (AdUnitFinish) other;
            return Intrinsics.areEqual(this.adUnitParams, adUnitFinish.adUnitParams) && this.result == adUnitFinish.result;
        }

        @Override // com.appodeal.ads.analytics.models.AdUnitsEvent
        public GeneralAdUnitParams getAdUnitParams() {
            return this.adUnitParams;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        public final Result getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode() + (this.adUnitParams.hashCode() * 31);
        }

        public String toString() {
            return "AdUnitFinish(adUnitParams=" + this.adUnitParams + ", result=" + this.result + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitStart;", "Lcom/appodeal/ads/analytics/models/AdUnitsEvent;", "adUnitParams", "Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;", "<init>", "(Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;)V", "getAdUnitParams", "()Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;", "name", "", "getName", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AdUnitStart implements AdUnitsEvent {
        private final GeneralAdUnitParams adUnitParams;
        private final String name;

        public AdUnitStart(GeneralAdUnitParams adUnitParams) {
            Intrinsics.checkNotNullParameter(adUnitParams, "adUnitParams");
            this.adUnitParams = adUnitParams;
            this.name = "adunit_start";
        }

        public static /* synthetic */ AdUnitStart copy$default(AdUnitStart adUnitStart, GeneralAdUnitParams generalAdUnitParams, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                generalAdUnitParams = adUnitStart.adUnitParams;
            }
            return adUnitStart.copy(generalAdUnitParams);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GeneralAdUnitParams getAdUnitParams() {
            return this.adUnitParams;
        }

        public final AdUnitStart copy(GeneralAdUnitParams adUnitParams) {
            Intrinsics.checkNotNullParameter(adUnitParams, "adUnitParams");
            return new AdUnitStart(adUnitParams);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AdUnitStart) && Intrinsics.areEqual(this.adUnitParams, ((AdUnitStart) other).adUnitParams);
        }

        @Override // com.appodeal.ads.analytics.models.AdUnitsEvent
        public GeneralAdUnitParams getAdUnitParams() {
            return this.adUnitParams;
        }

        @Override // com.appodeal.ads.analytics.models.Event
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.adUnitParams.hashCode();
        }

        public String toString() {
            return "AdUnitStart(adUnitParams=" + this.adUnitParams + ")";
        }
    }

    GeneralAdUnitParams getAdUnitParams();

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0012\u0010\u0014\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\t\u0082\u0001\u0002\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitRevenue;", "Lcom/appodeal/ads/analytics/models/AdUnitsEvent;", "adUnitParams", "Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;", "getAdUnitParams", "()Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;", "name", "", "getName", "()Ljava/lang/String;", "revenue", "", "getRevenue", "()Ljava/lang/Double;", "precision", "Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitRevenue$Precision;", "getPrecision", "()Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitRevenue$Precision;", "demandSource", "getDemandSource", "currency", "getCurrency", "AdUnitImpressionRevenue", "AdUnitShowValued", "Precision", "Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitRevenue$AdUnitImpressionRevenue;", "Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitRevenue$AdUnitShowValued;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface AdUnitRevenue extends AdUnitsEvent {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitRevenue$Precision;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "EXACT", "PUBLISHER_DEFINED", "ESTIMATED", "UNDEFINED", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Precision {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Precision[] $VALUES;
            private final String code;
            public static final Precision EXACT = new Precision("EXACT", 0, "EXACT");
            public static final Precision PUBLISHER_DEFINED = new Precision("PUBLISHER_DEFINED", 1, "PUBLISHER_DEFINED");
            public static final Precision ESTIMATED = new Precision("ESTIMATED", 2, "ESTIMATED");
            public static final Precision UNDEFINED = new Precision("UNDEFINED", 3, "UNDEFINED");

            private static final /* synthetic */ Precision[] $values() {
                return new Precision[]{EXACT, PUBLISHER_DEFINED, ESTIMATED, UNDEFINED};
            }

            static {
                Precision[] precisionArr$values = $values();
                $VALUES = precisionArr$values;
                $ENTRIES = a.a(precisionArr$values);
            }

            private Precision(String str, int i10, String str2) {
                this.code = str2;
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static Precision valueOf(String str) {
                return (Precision) Enum.valueOf(Precision.class, str);
            }

            public static Precision[] values() {
                return (Precision[]) $VALUES.clone();
            }

            public final String getCode() {
                return this.code;
            }
        }

        @Override // com.appodeal.ads.analytics.models.AdUnitsEvent
        GeneralAdUnitParams getAdUnitParams();

        String getCurrency();

        String getDemandSource();

        @Override // com.appodeal.ads.analytics.models.Event
        String getName();

        Precision getPrecision();

        Double getRevenue();

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003JF\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006'"}, d2 = {"Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitRevenue$AdUnitImpressionRevenue;", "Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitRevenue;", "adUnitParams", "Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;", "revenue", "", "precision", "Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitRevenue$Precision;", "demandSource", "", "currency", "<init>", "(Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;Ljava/lang/Double;Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitRevenue$Precision;Ljava/lang/String;Ljava/lang/String;)V", "getAdUnitParams", "()Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;", "getRevenue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPrecision", "()Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitRevenue$Precision;", "getDemandSource", "()Ljava/lang/String;", "getCurrency", "name", "getName", "component1", "component2", "component3", "component4", "component5", MenuActionType.COPY, "(Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;Ljava/lang/Double;Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitRevenue$Precision;Ljava/lang/String;Ljava/lang/String;)Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitRevenue$AdUnitImpressionRevenue;", "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class AdUnitImpressionRevenue implements AdUnitRevenue {
            private final GeneralAdUnitParams adUnitParams;
            private final String currency;
            private final String demandSource;
            private final String name;
            private final Precision precision;
            private final Double revenue;

            public AdUnitImpressionRevenue(GeneralAdUnitParams adUnitParams, Double d10, Precision precision, String str, String currency) {
                Intrinsics.checkNotNullParameter(adUnitParams, "adUnitParams");
                Intrinsics.checkNotNullParameter(currency, "currency");
                this.adUnitParams = adUnitParams;
                this.revenue = d10;
                this.precision = precision;
                this.demandSource = str;
                this.currency = currency;
                this.name = "adunit_revenue";
            }

            public static /* synthetic */ AdUnitImpressionRevenue copy$default(AdUnitImpressionRevenue adUnitImpressionRevenue, GeneralAdUnitParams generalAdUnitParams, Double d10, Precision precision, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    generalAdUnitParams = adUnitImpressionRevenue.adUnitParams;
                }
                if ((i10 & 2) != 0) {
                    d10 = adUnitImpressionRevenue.revenue;
                }
                if ((i10 & 4) != 0) {
                    precision = adUnitImpressionRevenue.precision;
                }
                if ((i10 & 8) != 0) {
                    str = adUnitImpressionRevenue.demandSource;
                }
                if ((i10 & 16) != 0) {
                    str2 = adUnitImpressionRevenue.currency;
                }
                String str3 = str2;
                Precision precision2 = precision;
                return adUnitImpressionRevenue.copy(generalAdUnitParams, d10, precision2, str, str3);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final GeneralAdUnitParams getAdUnitParams() {
                return this.adUnitParams;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Double getRevenue() {
                return this.revenue;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Precision getPrecision() {
                return this.precision;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getDemandSource() {
                return this.demandSource;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getCurrency() {
                return this.currency;
            }

            public final AdUnitImpressionRevenue copy(GeneralAdUnitParams adUnitParams, Double revenue, Precision precision, String demandSource, String currency) {
                Intrinsics.checkNotNullParameter(adUnitParams, "adUnitParams");
                Intrinsics.checkNotNullParameter(currency, "currency");
                return new AdUnitImpressionRevenue(adUnitParams, revenue, precision, demandSource, currency);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AdUnitImpressionRevenue)) {
                    return false;
                }
                AdUnitImpressionRevenue adUnitImpressionRevenue = (AdUnitImpressionRevenue) other;
                return Intrinsics.areEqual(this.adUnitParams, adUnitImpressionRevenue.adUnitParams) && Intrinsics.areEqual((Object) this.revenue, (Object) adUnitImpressionRevenue.revenue) && this.precision == adUnitImpressionRevenue.precision && Intrinsics.areEqual(this.demandSource, adUnitImpressionRevenue.demandSource) && Intrinsics.areEqual(this.currency, adUnitImpressionRevenue.currency);
            }

            @Override // com.appodeal.ads.analytics.models.AdUnitsEvent.AdUnitRevenue, com.appodeal.ads.analytics.models.AdUnitsEvent
            public GeneralAdUnitParams getAdUnitParams() {
                return this.adUnitParams;
            }

            @Override // com.appodeal.ads.analytics.models.AdUnitsEvent.AdUnitRevenue
            public String getCurrency() {
                return this.currency;
            }

            @Override // com.appodeal.ads.analytics.models.AdUnitsEvent.AdUnitRevenue
            public String getDemandSource() {
                return this.demandSource;
            }

            @Override // com.appodeal.ads.analytics.models.AdUnitsEvent.AdUnitRevenue, com.appodeal.ads.analytics.models.Event
            public String getName() {
                return this.name;
            }

            @Override // com.appodeal.ads.analytics.models.AdUnitsEvent.AdUnitRevenue
            public Precision getPrecision() {
                return this.precision;
            }

            @Override // com.appodeal.ads.analytics.models.AdUnitsEvent.AdUnitRevenue
            public Double getRevenue() {
                return this.revenue;
            }

            public int hashCode() {
                int iHashCode = this.adUnitParams.hashCode() * 31;
                Double d10 = this.revenue;
                int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
                Precision precision = this.precision;
                int iHashCode3 = (iHashCode2 + (precision == null ? 0 : precision.hashCode())) * 31;
                String str = this.demandSource;
                return this.currency.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
            }

            public String toString() {
                return "AdUnitImpressionRevenue(adUnitParams=" + this.adUnitParams + ", revenue=" + this.revenue + ", precision=" + this.precision + ", demandSource=" + this.demandSource + ", currency=" + this.currency + ")";
            }

            public /* synthetic */ AdUnitImpressionRevenue(GeneralAdUnitParams generalAdUnitParams, Double d10, Precision precision, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(generalAdUnitParams, d10, precision, str, (i10 & 16) != 0 ? "USD" : str2);
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003JF\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006'"}, d2 = {"Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitRevenue$AdUnitShowValued;", "Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitRevenue;", "adUnitParams", "Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;", "revenue", "", "precision", "Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitRevenue$Precision;", "demandSource", "", "currency", "<init>", "(Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;Ljava/lang/Double;Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitRevenue$Precision;Ljava/lang/String;Ljava/lang/String;)V", "getAdUnitParams", "()Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;", "getRevenue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPrecision", "()Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitRevenue$Precision;", "getDemandSource", "()Ljava/lang/String;", "getCurrency", "name", "getName", "component1", "component2", "component3", "component4", "component5", MenuActionType.COPY, "(Lcom/appodeal/ads/analytics/models/GeneralAdUnitParams;Ljava/lang/Double;Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitRevenue$Precision;Ljava/lang/String;Ljava/lang/String;)Lcom/appodeal/ads/analytics/models/AdUnitsEvent$AdUnitRevenue$AdUnitShowValued;", "equals", "", "other", "", "hashCode", "", "toString", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class AdUnitShowValued implements AdUnitRevenue {
            private final GeneralAdUnitParams adUnitParams;
            private final String currency;
            private final String demandSource;
            private final String name;
            private final Precision precision;
            private final Double revenue;

            public AdUnitShowValued(GeneralAdUnitParams adUnitParams, Double d10, Precision precision, String str, String currency) {
                Intrinsics.checkNotNullParameter(adUnitParams, "adUnitParams");
                Intrinsics.checkNotNullParameter(currency, "currency");
                this.adUnitParams = adUnitParams;
                this.revenue = d10;
                this.precision = precision;
                this.demandSource = str;
                this.currency = currency;
                this.name = "adunit_show_valued";
            }

            public static /* synthetic */ AdUnitShowValued copy$default(AdUnitShowValued adUnitShowValued, GeneralAdUnitParams generalAdUnitParams, Double d10, Precision precision, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    generalAdUnitParams = adUnitShowValued.adUnitParams;
                }
                if ((i10 & 2) != 0) {
                    d10 = adUnitShowValued.revenue;
                }
                if ((i10 & 4) != 0) {
                    precision = adUnitShowValued.precision;
                }
                if ((i10 & 8) != 0) {
                    str = adUnitShowValued.demandSource;
                }
                if ((i10 & 16) != 0) {
                    str2 = adUnitShowValued.currency;
                }
                String str3 = str2;
                Precision precision2 = precision;
                return adUnitShowValued.copy(generalAdUnitParams, d10, precision2, str, str3);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final GeneralAdUnitParams getAdUnitParams() {
                return this.adUnitParams;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Double getRevenue() {
                return this.revenue;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Precision getPrecision() {
                return this.precision;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getDemandSource() {
                return this.demandSource;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getCurrency() {
                return this.currency;
            }

            public final AdUnitShowValued copy(GeneralAdUnitParams adUnitParams, Double revenue, Precision precision, String demandSource, String currency) {
                Intrinsics.checkNotNullParameter(adUnitParams, "adUnitParams");
                Intrinsics.checkNotNullParameter(currency, "currency");
                return new AdUnitShowValued(adUnitParams, revenue, precision, demandSource, currency);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AdUnitShowValued)) {
                    return false;
                }
                AdUnitShowValued adUnitShowValued = (AdUnitShowValued) other;
                return Intrinsics.areEqual(this.adUnitParams, adUnitShowValued.adUnitParams) && Intrinsics.areEqual((Object) this.revenue, (Object) adUnitShowValued.revenue) && this.precision == adUnitShowValued.precision && Intrinsics.areEqual(this.demandSource, adUnitShowValued.demandSource) && Intrinsics.areEqual(this.currency, adUnitShowValued.currency);
            }

            @Override // com.appodeal.ads.analytics.models.AdUnitsEvent.AdUnitRevenue, com.appodeal.ads.analytics.models.AdUnitsEvent
            public GeneralAdUnitParams getAdUnitParams() {
                return this.adUnitParams;
            }

            @Override // com.appodeal.ads.analytics.models.AdUnitsEvent.AdUnitRevenue
            public String getCurrency() {
                return this.currency;
            }

            @Override // com.appodeal.ads.analytics.models.AdUnitsEvent.AdUnitRevenue
            public String getDemandSource() {
                return this.demandSource;
            }

            @Override // com.appodeal.ads.analytics.models.AdUnitsEvent.AdUnitRevenue, com.appodeal.ads.analytics.models.Event
            public String getName() {
                return this.name;
            }

            @Override // com.appodeal.ads.analytics.models.AdUnitsEvent.AdUnitRevenue
            public Precision getPrecision() {
                return this.precision;
            }

            @Override // com.appodeal.ads.analytics.models.AdUnitsEvent.AdUnitRevenue
            public Double getRevenue() {
                return this.revenue;
            }

            public int hashCode() {
                int iHashCode = this.adUnitParams.hashCode() * 31;
                Double d10 = this.revenue;
                int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
                Precision precision = this.precision;
                int iHashCode3 = (iHashCode2 + (precision == null ? 0 : precision.hashCode())) * 31;
                String str = this.demandSource;
                return this.currency.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
            }

            public String toString() {
                return "AdUnitShowValued(adUnitParams=" + this.adUnitParams + ", revenue=" + this.revenue + ", precision=" + this.precision + ", demandSource=" + this.demandSource + ", currency=" + this.currency + ")";
            }

            public /* synthetic */ AdUnitShowValued(GeneralAdUnitParams generalAdUnitParams, Double d10, Precision precision, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(generalAdUnitParams, d10, precision, str, (i10 & 16) != 0 ? "USD" : str2);
            }
        }
    }
}
