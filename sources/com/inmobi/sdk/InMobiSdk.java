package com.inmobi.sdk;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Size;
import androidx.annotation.UiThread;
import androidx.autofill.HintConstants;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.inmobi.media.A9;
import com.inmobi.media.AbstractC4063tk;
import com.inmobi.media.AbstractC4151x8;
import com.inmobi.media.AbstractC4213zk;
import com.inmobi.media.C4148x5;
import com.inmobi.media.C4177y9;
import com.inmobi.media.Da;
import com.inmobi.media.E1;
import com.inmobi.media.Ea;
import com.inmobi.media.Ii;
import com.inmobi.media.Ji;
import com.inmobi.media.Kb;
import com.inmobi.media.Kf;
import com.inmobi.media.L2;
import com.inmobi.media.Lg;
import com.inmobi.media.Og;
import com.inmobi.media.Oj;
import com.inmobi.media.P9;
import com.inmobi.media.Pg;
import com.inmobi.media.RunnableC4202z9;
import com.inmobi.media.Tg;
import com.inmobi.media.W6;
import com.inmobi.media.Yk;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.ironsource.adapters.inmobi.InMobiAdapter;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import eg.i;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005MNOPQJ9\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001f\u0010\u0013J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b(\u0010&J-\u0010,\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u00042\b\u0010*\u001a\u0004\u0018\u00010\u00042\b\u0010+\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u001aH\u0007¢\u0006\u0004\b/\u0010\u001dJ\u0017\u00102\u001a\u00020\n2\u0006\u00101\u001a\u000200H\u0007¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\n2\u0006\u00105\u001a\u000204H\u0007¢\u0006\u0004\b6\u00107J\u0019\u00109\u001a\u00020\n2\b\u00108\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b9\u0010&J\u0019\u0010;\u001a\u00020\n2\b\u0010:\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b;\u0010&J\u0019\u0010>\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010<H\u0007¢\u0006\u0004\b>\u0010?J\u0011\u0010@\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b@\u0010\u0015J1\u0010@\u001a\u0004\u0018\u00010\u00042\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010A2\b\u0010C\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b@\u0010DJ\u0019\u0010F\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bF\u0010\u000eJ\u000f\u0010G\u001a\u00020\u0010H\u0007¢\u0006\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\bK\u0010JR\u0014\u0010L\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\bL\u0010J¨\u0006R"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", InMobiAdapter.ACCOUNT_ID, "Lorg/json/JSONObject;", "consentObject", "Lcom/inmobi/sdk/SdkInitializationListener;", "sdkInitializationListener", "", "init", "(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;Lcom/inmobi/sdk/SdkInitializationListener;)V", "updateGDPRConsent", "(Lorg/json/JSONObject;)V", "setPartnerGDPRConsent", "", "muted", "setApplicationMuted", "(Z)V", "getVersion", "()Ljava/lang/String;", "Lcom/inmobi/sdk/InMobiSdk$LogLevel;", "logLevel", "setLogLevel", "(Lcom/inmobi/sdk/InMobiSdk$LogLevel;)V", "", "age", "setAge", "(I)V", "isAgeRestricted", "setIsAgeRestricted", "Lcom/inmobi/sdk/InMobiSdk$AgeGroup;", "group", "setAgeGroup", "(Lcom/inmobi/sdk/InMobiSdk$AgeGroup;)V", "areaCode", "setAreaCode", "(Ljava/lang/String;)V", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "setPostalCode", "city", "state", "country", "setLocationWithCityStateCountry", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "yearOfBirth", "setYearOfBirth", "Lcom/inmobi/sdk/InMobiSdk$Gender;", "gender", "setGender", "(Lcom/inmobi/sdk/InMobiSdk$Gender;)V", "Lcom/inmobi/sdk/InMobiSdk$Education;", "education", "setEducation", "(Lcom/inmobi/sdk/InMobiSdk$Education;)V", "language", "setLanguage", "interests", "setInterests", "Landroid/location/Location;", "location", "setLocation", "(Landroid/location/Location;)V", "getToken", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "keywords", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "jsonObject", "setPublisherProvidedUnifiedId", "isSDKInitialized", "()Z", "IM_GDPR_CONSENT_AVAILABLE", "Ljava/lang/String;", "IM_GDPR_CONSENT_IAB", "IM_GDPR_CONSENT_GDPR_APPLIES", "LogLevel", "Education", "PublisherSignals", "Gender", "AgeGroup", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiSdk {

    @NotNull
    public static final String IM_GDPR_CONSENT_AVAILABLE = "gdpr_consent_available";

    @NotNull
    public static final String IM_GDPR_CONSENT_GDPR_APPLIES = "gdpr";

    @NotNull
    public static final String IM_GDPR_CONSENT_IAB = "gdpr_consent";

    @NotNull
    public static final InMobiSdk INSTANCE = new InMobiSdk();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$AgeGroup;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "BELOW_18", "BETWEEN_18_AND_24", "BETWEEN_25_AND_29", "BETWEEN_30_AND_34", "BETWEEN_35_AND_44", "BETWEEN_45_AND_54", "BETWEEN_55_AND_65", "ABOVE_65", "toString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AgeGroup {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AgeGroup[] $VALUES;

        @NotNull
        private final String value;
        public static final AgeGroup BELOW_18 = new AgeGroup("BELOW_18", 0, "below18");
        public static final AgeGroup BETWEEN_18_AND_24 = new AgeGroup("BETWEEN_18_AND_24", 1, "between18and24");
        public static final AgeGroup BETWEEN_25_AND_29 = new AgeGroup("BETWEEN_25_AND_29", 2, "between25and29");
        public static final AgeGroup BETWEEN_30_AND_34 = new AgeGroup("BETWEEN_30_AND_34", 3, "between30and34");
        public static final AgeGroup BETWEEN_35_AND_44 = new AgeGroup("BETWEEN_35_AND_44", 4, "between35and44");
        public static final AgeGroup BETWEEN_45_AND_54 = new AgeGroup("BETWEEN_45_AND_54", 5, "between45and54");
        public static final AgeGroup BETWEEN_55_AND_65 = new AgeGroup("BETWEEN_55_AND_65", 6, "between55and65");
        public static final AgeGroup ABOVE_65 = new AgeGroup("ABOVE_65", 7, "above65");

        private static final /* synthetic */ AgeGroup[] $values() {
            return new AgeGroup[]{BELOW_18, BETWEEN_18_AND_24, BETWEEN_25_AND_29, BETWEEN_30_AND_34, BETWEEN_35_AND_44, BETWEEN_45_AND_54, BETWEEN_55_AND_65, ABOVE_65};
        }

        static {
            AgeGroup[] ageGroupArr$values = $values();
            $VALUES = ageGroupArr$values;
            $ENTRIES = qf.a.a(ageGroupArr$values);
        }

        private AgeGroup(String str, int i10, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static AgeGroup valueOf(String str) {
            return (AgeGroup) Enum.valueOf(AgeGroup.class, str);
        }

        public static AgeGroup[] values() {
            return (AgeGroup[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$Education;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "HIGH_SCHOOL_OR_LESS", "COLLEGE_OR_GRADUATE", "POST_GRADUATE_OR_ABOVE", "toString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Education {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Education[] $VALUES;

        @NotNull
        private final String value;
        public static final Education HIGH_SCHOOL_OR_LESS = new Education("HIGH_SCHOOL_OR_LESS", 0, "highschoolorless");
        public static final Education COLLEGE_OR_GRADUATE = new Education("COLLEGE_OR_GRADUATE", 1, "collegeorgraduate");
        public static final Education POST_GRADUATE_OR_ABOVE = new Education("POST_GRADUATE_OR_ABOVE", 2, "postgraduateorabove");

        private static final /* synthetic */ Education[] $values() {
            return new Education[]{HIGH_SCHOOL_OR_LESS, COLLEGE_OR_GRADUATE, POST_GRADUATE_OR_ABOVE};
        }

        static {
            Education[] educationArr$values = $values();
            $VALUES = educationArr$values;
            $ENTRIES = qf.a.a(educationArr$values);
        }

        private Education(String str, int i10, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Education valueOf(String str) {
            return (Education) Enum.valueOf(Education.class, str);
        }

        public static Education[] values() {
            return (Education[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$Gender;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "FEMALE", "MALE", "toString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Gender {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Gender[] $VALUES;
        public static final Gender FEMALE = new Gender("FEMALE", 0, InneractiveMediationDefs.GENDER_FEMALE);
        public static final Gender MALE = new Gender("MALE", 1, "m");

        @NotNull
        private final String value;

        private static final /* synthetic */ Gender[] $values() {
            return new Gender[]{FEMALE, MALE};
        }

        static {
            Gender[] genderArr$values = $values();
            $VALUES = genderArr$values;
            $ENTRIES = qf.a.a(genderArr$values);
        }

        private Gender(String str, int i10, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Gender valueOf(String str) {
            return (Gender) Enum.valueOf(Gender.class, str);
        }

        public static Gender[] values() {
            return (Gender[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$LogLevel;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "ERROR", "DEBUG", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LogLevel {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LogLevel[] $VALUES;
        public static final LogLevel NONE = new LogLevel("NONE", 0);
        public static final LogLevel ERROR = new LogLevel("ERROR", 1);
        public static final LogLevel DEBUG = new LogLevel("DEBUG", 2);

        private static final /* synthetic */ LogLevel[] $values() {
            return new LogLevel[]{NONE, ERROR, DEBUG};
        }

        static {
            LogLevel[] logLevelArr$values = $values();
            $VALUES = logLevelArr$values;
            $ENTRIES = qf.a.a(logLevelArr$values);
        }

        private LogLevel(String str, int i10) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static LogLevel valueOf(String str) {
            return (LogLevel) Enum.valueOf(LogLevel.class, str);
        }

        public static LogLevel[] values() {
            return (LogLevel[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$PublisherSignals;", "", "", "", "signals", "", "putPublisherSignals", "(Ljava/util/Map;)V", "getPublisherSignals", "()Ljava/util/Map;", "resetPublisherSignals", "()V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PublisherSignals {

        @NotNull
        public static final PublisherSignals INSTANCE = new PublisherSignals();

        @Nullable
        public final Map<String, Object> getPublisherSignals() {
            Map mapEmptyMap;
            ArrayList arrayList;
            if (!InMobiSdk.isSDKInitialized()) {
                String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
                Intrinsics.checkNotNullExpressionValue(strAccess$getTAG$p, "access$getTAG$p(...)");
                Kb.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot get publisher signals.");
                return null;
            }
            Og og2 = Og.f37496a;
            og2.getClass();
            try {
                SignalsConfig.PublisherConfig publisherConfigC = Og.c();
                Map map = Pg.f37545a;
                Intrinsics.checkNotNullParameter(publisherConfigC, "<this>");
                if (!publisherConfigC.getEnableMCO() && !publisherConfigC.getEnableAB()) {
                    return MapsKt.emptyMap();
                }
                try {
                    SignalsConfig.PublisherConfig publisherConfigC2 = Og.c();
                    Intrinsics.checkNotNullParameter(publisherConfigC2, "<this>");
                    mapEmptyMap = (publisherConfigC2.getEnableMCO() || publisherConfigC2.getEnableAB()) ? MapsKt.plus(Pg.a(og2.b(), Og.c()), og2.d()) : MapsKt.emptyMap();
                } catch (Exception e10) {
                    Lazy lazy = P9.f37527a;
                    P9.a(new L2(e10));
                    mapEmptyMap = MapsKt.emptyMap();
                }
                Map mutableMap = MapsKt.toMutableMap(mapEmptyMap);
                for (Pair pair : CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Og.c().getObj(), "o_i_dep"), TuplesKt.to(Og.c().getDirect(), "d_i_dep")})) {
                    SignalsConfig.PublisherConfig.BaseInputData baseInputData = (SignalsConfig.PublisherConfig.BaseInputData) pair.component1();
                    String str = (String) pair.component2();
                    if (baseInputData.getDepth().getEnabled()) {
                        Og og3 = Og.f37496a;
                        og3.getClass();
                        JSONArray jSONArrayOptJSONArray = ((JSONObject) Og.f37501f.getValue(og3, Og.f37497b[1])).optJSONArray(str);
                        if (jSONArrayOptJSONArray != null) {
                            Intrinsics.checkNotNullParameter(jSONArrayOptJSONArray, "<this>");
                            arrayList = new ArrayList();
                            int length = jSONArrayOptJSONArray.length();
                            for (int i10 = 0; i10 < length; i10++) {
                                Object obj = jSONArrayOptJSONArray.get(i10);
                                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                                arrayList.add(obj);
                            }
                        } else {
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(0);
                            jSONArray.put(0);
                            jSONArray.put(0);
                            jSONArray.put(0);
                            Intrinsics.checkNotNullParameter(jSONArray, "<this>");
                            arrayList = new ArrayList();
                            int length2 = jSONArray.length();
                            for (int i11 = 0; i11 < length2; i11++) {
                                Object obj2 = jSONArray.get(i11);
                                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                                arrayList.add(obj2);
                            }
                        }
                        mutableMap.put(str, arrayList);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mutableMap.entrySet()) {
                    if (!StringsKt.a0((String) entry.getKey(), "auto_", false, 2, null)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return linkedHashMap;
            } catch (Exception e11) {
                Lazy lazy2 = P9.f37527a;
                P9.a(new L2(e11));
                Kb.a((byte) 1, "PubSignals", "Publisher signals could not be retrieved.");
                return MapsKt.emptyMap();
            }
        }

        public final void putPublisherSignals(@Nullable Map<String, ? extends Object> signals) {
            if (!InMobiSdk.isSDKInitialized()) {
                String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
                Intrinsics.checkNotNullExpressionValue(strAccess$getTAG$p, "access$getTAG$p(...)");
                Kb.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot set publisher signals.");
            } else if (signals != null) {
                Og.f37496a.getClass();
                Og.a(signals);
            }
        }

        public final void resetPublisherSignals() {
            if (!InMobiSdk.isSDKInitialized()) {
                String strAccess$getTAG$p = InMobiSdk.access$getTAG$p();
                Intrinsics.checkNotNullExpressionValue(strAccess$getTAG$p, "access$getTAG$p(...)");
                Kb.a((byte) 1, strAccess$getTAG$p, "SDK not initialized. Cannot reset publisher signals.");
            } else {
                Og.f37496a.getClass();
                Context context = Ji.f37157a;
                if (context == null || i.d(A9.f36559e, null, null, new Lg(context, null), 3, null) == null) {
                    Unit unit = Unit.f93236a;
                }
            }
        }
    }

    public static void a(final Context context, final String str, final JSONObject jSONObject, final SdkInitializationListener sdkInitializationListener) {
        Oj.a(new Runnable() { // from class: x3.b
            @Override // java.lang.Runnable
            public final void run() {
                InMobiSdk.a(context, sdkInitializationListener, str, jSONObject);
            }
        });
    }

    public static final /* synthetic */ String access$getTAG$p() {
        return "InMobiSdk";
    }

    public static final /* synthetic */ Map access$prepareTelemetryPayload(InMobiSdk inMobiSdk, long j10) {
        inMobiSdk.getClass();
        return a(j10);
    }

    public static final /* synthetic */ void access$provideCallback(InMobiSdk inMobiSdk, SdkInitializationListener sdkInitializationListener, String str) {
        inMobiSdk.getClass();
        a(sdkInitializationListener, str);
    }

    public static final void b(SdkInitializationListener sdkInitializationListener, String str) {
        INSTANCE.getClass();
        sdkInitializationListener.onInitializationComplete(str == null ? null : new Error(str));
    }

    @Nullable
    public static final String getToken() {
        return getToken(null, null);
    }

    @NotNull
    public static final String getVersion() {
        return "11.1.0";
    }

    @UiThread
    public static final void init(@Nullable Context context, @Size(max = 36, min = PlaybackStateCompat.ACTION_SKIP_TO_NEXT) @Nullable String accountId, @Nullable JSONObject consentObject, @Nullable SdkInitializationListener sdkInitializationListener) {
        InMobiSdk inMobiSdk = INSTANCE;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        inMobiSdk.getClass();
        a(applicationContext, accountId, consentObject, sdkInitializationListener);
    }

    public static final boolean isSDKInitialized() {
        return Ji.d();
    }

    public static final void setAge(int age) {
        Context context = Ji.f37157a;
        if (age != Integer.MIN_VALUE) {
            Tg.f37770a = age;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Da.a(context, "user_info_store").a("user_age", age, false);
            }
        }
    }

    public static final void setAgeGroup(@NotNull AgeGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        String string = group.toString();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = string.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Context context = Ji.f37157a;
        if (lowerCase != null) {
            Tg.f37772c = lowerCase;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Da.a(context, "user_info_store").a("user_age_group", lowerCase, false);
            }
        }
    }

    public static final void setApplicationMuted(boolean muted) {
        Ji.f37162f = muted;
    }

    public static final void setAreaCode(@Nullable String areaCode) {
        Context context = Ji.f37157a;
        Tg.f37773d = areaCode;
        if (context == null || areaCode == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f36782b;
        Da.a(context, "user_info_store").a("user_area_code", areaCode, false);
    }

    public static final void setEducation(@NotNull Education education) {
        Intrinsics.checkNotNullParameter(education, "education");
        String string = education.toString();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = string.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Context context = Ji.f37157a;
        if (lowerCase != null) {
            Tg.f37780k = lowerCase;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Da.a(context, "user_info_store").a("user_education", lowerCase, false);
            }
        }
    }

    public static final void setGender(@NotNull Gender gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        String string = gender.toString();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = string.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Context context = Ji.f37157a;
        if (lowerCase != null) {
            Tg.f37779j = lowerCase;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Da.a(context, "user_info_store").a("user_gender", lowerCase, false);
            }
        }
    }

    public static final void setInterests(@Nullable String interests) {
        Context context = Ji.f37157a;
        if (interests != null) {
            Tg.f37782m = interests;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Da.a(context, "user_info_store").a("user_interest", interests, false);
            }
        }
    }

    public static final void setIsAgeRestricted(boolean isAgeRestricted) {
        Tg.a(isAgeRestricted);
        AbstractC4213zk.a(isAgeRestricted);
        if (isAgeRestricted) {
            InMobiUnifiedIdService.reset();
            AbstractC4151x8.a(null);
        }
    }

    public static final void setLanguage(@Nullable String language) {
        Context context = Ji.f37157a;
        if (language != null) {
            Tg.f37781l = language;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Da.a(context, "user_info_store").a("user_language", language, false);
            }
        }
    }

    public static final void setLocation(@Nullable Location location) {
        Context context = Ji.f37157a;
        if (location != null) {
            Tg.f37783n = location;
            if (context != null) {
                String strA = Tg.a(location);
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Da.a(context, "user_info_store").a("user_location", strA, false);
            }
        }
    }

    public static final void setLocationWithCityStateCountry(@Nullable String city, @Nullable String state, @Nullable String country) {
        Context context = Ji.f37157a;
        if (city != null) {
            Tg.f37775f = city;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Da.a(context, "user_info_store").a("user_city_code", city, false);
            }
        }
        Context context2 = Ji.f37157a;
        if (state != null) {
            Tg.f37776g = state;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = Ea.f36782b;
                Da.a(context2, "user_info_store").a("user_state_code", state, false);
            }
        }
        Context context3 = Ji.f37157a;
        if (country != null) {
            Tg.f37777h = country;
            if (context3 != null) {
                ConcurrentHashMap concurrentHashMap3 = Ea.f36782b;
                Da.a(context3, "user_info_store").a("user_country_code", country, false);
            }
        }
    }

    public static final void setLogLevel(@Nullable LogLevel logLevel) {
        int i10 = logLevel == null ? -1 : a.f40084a[logLevel.ordinal()];
        if (i10 == 1) {
            Kb.f37217a = (byte) 0;
            return;
        }
        if (i10 == 2) {
            Kb.f37217a = (byte) 1;
        } else if (i10 != 3) {
            Kb.f37217a = (byte) 2;
        } else {
            Kb.f37217a = (byte) 2;
        }
    }

    public static final void setPartnerGDPRConsent(@Nullable JSONObject consentObject) {
        if (consentObject != null) {
            W6.f37934b = consentObject;
        }
    }

    public static final void setPostalCode(@Nullable String postalCode) {
        Context context = Ji.f37157a;
        if (postalCode != null) {
            Tg.f37774e = postalCode;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Da.a(context, "user_info_store").a("user_post_code", postalCode, false);
            }
        }
    }

    public static final void setPublisherProvidedUnifiedId(@Nullable JSONObject jsonObject) {
        Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
        Objects.toString(jsonObject);
        RunnableC4202z9 runnable = new RunnableC4202z9(jsonObject);
        Context context = Ji.f37157a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
    }

    public static final void setYearOfBirth(int yearOfBirth) {
        Context context = Ji.f37157a;
        if (yearOfBirth != Integer.MIN_VALUE) {
            Tg.f37778i = yearOfBirth;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Da.a(context, "user_info_store").a("user_yob", yearOfBirth, false);
            }
        }
    }

    public static final void updateGDPRConsent(@Nullable JSONObject consentObject) {
        W6.a(consentObject);
    }

    public static final void a(Context context, SdkInitializationListener sdkInitializationListener, String str, JSONObject jSONObject) {
        if (context == null) {
            INSTANCE.getClass();
            a(sdkInitializationListener, SdkInitializationListener.MISSING_CONTEXT);
            return;
        }
        if (str == null) {
            INSTANCE.getClass();
            a(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (Yk.a()) {
            INSTANCE.getClass();
            a(sdkInitializationListener, "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.");
            return;
        }
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = Intrinsics.compare((int) str.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String accountId = str.subSequence(i10, length + 1).toString();
        try {
            W6.a(jSONObject);
            if (accountId.length() == 0) {
                INSTANCE.getClass();
                a(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
                return;
            }
            if (!Kf.a(context, "android.permission.ACCESS_COARSE_LOCATION") && !Kf.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
                Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
                Kb.a((byte) 1, "InMobiSdk", "Please grant the location permissions (ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION, or both) for better ad targeting.");
            }
            if (Ji.d()) {
                Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
                INSTANCE.getClass();
                a(sdkInitializationListener, null);
                return;
            }
            if (Ji.f37165i == 1) {
                Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
                return;
            }
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Ji.f37165i = 1;
            Ji.f37157a = context.getApplicationContext();
            Ji.f37160d.set(true);
            Ji.f37159c = accountId;
            if (!Ji.c(context)) {
                Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
                Ji.f37159c = null;
                Ji.f37157a = null;
                Ji.f37165i = 3;
                INSTANCE.getClass();
                a(sdkInitializationListener, SdkInitializationListener.MISSING_WEBVIEW_DEPENDENCY);
                return;
            }
            Intrinsics.checkNotNullParameter(context, "context");
            E1.b(context);
            INSTANCE.getClass();
            a();
            C4177y9 runnable = new C4177y9(context, accountId, sdkInitializationListener, jElapsedRealtime, null);
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            i.d(Ji.f37164h, null, null, new Ii(runnable, null), 3, null);
        } catch (Exception e10) {
            Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
            e10.getMessage();
            Ji.f37159c = null;
            Ji.f37157a = null;
            Ji.f37165i = 3;
            INSTANCE.getClass();
            a(sdkInitializationListener, "SDK could not be initialized; an unexpected error was encountered.");
        }
    }

    @UiThread
    @Nullable
    public static final String getToken(@Nullable Map<String, String> extras, @Nullable String keywords) {
        return AbstractC4063tk.a(extras, keywords);
    }

    public static final void b() {
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE"};
        StringBuilder sb2 = new StringBuilder("Permissions granted to SDK are :\nandroid.permission.INTERNET\nandroid.permission.ACCESS_NETWORK_STATE");
        for (int i10 = 0; i10 < 4; i10++) {
            String str = strArr[i10];
            if (Kf.a(Ji.f37157a, str)) {
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append(str);
            }
        }
        Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
        Kb.a((byte) 2, "InMobiSdk", sb2.toString());
    }

    public static void a(final SdkInitializationListener sdkInitializationListener, final String str) {
        if (sdkInitializationListener != null) {
            Oj.a(new Runnable() { // from class: x3.a
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiSdk.b(sdkInitializationListener, str);
                }
            });
        }
        if (str == null) {
            Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
            Kb.a((byte) 2, "InMobiSdk", "InMobi SDK initialized with account id: " + Ji.f37159c);
            return;
        }
        Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
        Kb.a((byte) 1, "InMobiSdk", str);
    }

    public static LinkedHashMap a(long j10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
        Objects.toString(linkedHashMap.get("latency"));
        linkedHashMap.put("networkType", C4148x5.m());
        linkedHashMap.put("integrationType", "InMobi");
        return linkedHashMap;
    }

    public static void a() {
        Runnable runnable = new Runnable() { // from class: x3.c
            @Override // java.lang.Runnable
            public final void run() {
                InMobiSdk.b();
            }
        };
        Context context = Ji.f37157a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
    }
}
