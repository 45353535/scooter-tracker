package com.mobilefuse.sdk.network.model;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.ironsource.N6;
import com.mobilefuse.sdk.device.DeviceType;
import com.mobilefuse.sdk.device.UserAgentInfo;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.mobilefuse.sdk.user.Gender;
import com.my.target.common.menu.MenuActionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\\\b\u0086\b\u0018\u00002\u00020\u0001BÓ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\"\u001a\u00020\u000f\u0012\u0006\u0010#\u001a\u00020\u000f\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010)J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u000fHÆ\u0003J\t\u0010W\u001a\u00020\u000fHÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010Z\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010[\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010]\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010@J\u0015\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001aHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010+J\t\u0010b\u001a\u00020\u001eHÆ\u0003J\t\u0010c\u001a\u00020\u0006HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u000fHÆ\u0003J\t\u0010g\u001a\u00020\u000fHÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0006HÆ\u0003J\u0010\u0010l\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010@J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u0006HÆ\u0003J\t\u0010p\u001a\u00020\u0006HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\rHÆ\u0003Jò\u0002\u0010t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010uJ\u0013\u0010v\u001a\u00020\u00062\b\u0010w\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010x\u001a\u00020\u000fHÖ\u0001J\t\u0010y\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010#\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\"\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0011\u0010\u001f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b7\u00103R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b:\u00103R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b;\u00106R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u00101R\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0015\u0010'\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010A\u001a\u0004\b?\u0010@R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u00101R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u00101R\u0013\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u00101R\u0013\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u00101R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u00101R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010,\u001a\u0004\bI\u0010+R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010/\u001a\u0004\bJ\u0010.R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bK\u00106R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010/\u001a\u0004\bL\u0010.R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010A\u001a\u0004\bM\u0010@R\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u00101R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u00101R\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u00101R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bQ\u00106R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u00101R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u00101R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010,\u001a\u0004\bT\u0010+¨\u0006z"}, d2 = {"Lcom/mobilefuse/sdk/network/model/MfxBidRequest;", "", "tagid", "", "appVersion", "test", "", EidRequestBuilder.REQUEST_FIELD_IFA, EidRequestBuilder.REQUEST_FIELD_LMT, "dnt", UserAgentInfo.CACHE_USER_AGENT_VALUE_KEY, N6.f41413q, "deviceType", "Lcom/mobilefuse/sdk/device/DeviceType;", "deviceWidth", "", "deviceHeight", N6.f41419s, "", "lon", "lastfix", "accuracy", "altitude", "pressure", "", "eidValues", "", "eidSource", "yearOfBirth", "gender", "Lcom/mobilefuse/sdk/user/Gender;", "coppa", EidRequestBuilder.REQUEST_FIELD_GPP, "usPrivacy", "bannerWidth", "bannerHeight", "sdkVersion", "telemetrySessionId", "ifv", "floor", "ipAddress", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lcom/mobilefuse/sdk/device/DeviceType;IILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Float;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Lcom/mobilefuse/sdk/user/Gender;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)V", "getAccuracy", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAltitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAppVersion", "()Ljava/lang/String;", "getBannerHeight", "()I", "getBannerWidth", "getCoppa", "()Z", "getDeviceHeight", "getDeviceType", "()Lcom/mobilefuse/sdk/device/DeviceType;", "getDeviceWidth", "getDnt", "getEidSource", "getEidValues", "()Ljava/util/Map;", "getFloor", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getGender", "()Lcom/mobilefuse/sdk/user/Gender;", "getGpp", "getIfa", "getIfv", "getIpAddress", "getLang", "getLastfix", "getLat", "getLmt", "getLon", "getPressure", "getSdkVersion", "getTagid", "getTelemetrySessionId", "getTest", "getUsPrivacy", "getUserAgent", "getYearOfBirth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component4", "component5", "component6", "component7", "component8", "component9", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lcom/mobilefuse/sdk/device/DeviceType;IILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Float;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Lcom/mobilefuse/sdk/user/Gender;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)Lcom/mobilefuse/sdk/network/model/MfxBidRequest;", "equals", "other", "hashCode", "toString", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class MfxBidRequest {

    @Nullable
    private final Integer accuracy;

    @Nullable
    private final Double altitude;

    @NotNull
    private final String appVersion;
    private final int bannerHeight;
    private final int bannerWidth;
    private final boolean coppa;
    private final int deviceHeight;

    @Nullable
    private final DeviceType deviceType;
    private final int deviceWidth;
    private final boolean dnt;

    @Nullable
    private final String eidSource;

    @NotNull
    private final Map<String, String> eidValues;

    @Nullable
    private final Float floor;

    @NotNull
    private final Gender gender;

    @Nullable
    private final String gpp;

    @Nullable
    private final String ifa;

    @Nullable
    private final String ifv;

    @Nullable
    private final String ipAddress;

    @Nullable
    private final String lang;

    @Nullable
    private final Integer lastfix;

    @Nullable
    private final Double lat;
    private final boolean lmt;

    @Nullable
    private final Double lon;

    @Nullable
    private final Float pressure;

    @NotNull
    private final String sdkVersion;

    @NotNull
    private final String tagid;

    @NotNull
    private final String telemetrySessionId;
    private final boolean test;

    @Nullable
    private final String usPrivacy;

    @Nullable
    private final String userAgent;

    @Nullable
    private final Integer yearOfBirth;

    public MfxBidRequest(@NotNull String tagid, @NotNull String appVersion, boolean z10, @Nullable String str, boolean z11, boolean z12, @Nullable String str2, @Nullable String str3, @Nullable DeviceType deviceType, int i10, int i11, @Nullable Double d10, @Nullable Double d11, @Nullable Integer num, @Nullable Integer num2, @Nullable Double d12, @Nullable Float f10, @NotNull Map<String, String> eidValues, @Nullable String str4, @Nullable Integer num3, @NotNull Gender gender, boolean z13, @Nullable String str5, @Nullable String str6, int i12, int i13, @NotNull String sdkVersion, @NotNull String telemetrySessionId, @Nullable String str7, @Nullable Float f11, @Nullable String str8) {
        Intrinsics.checkNotNullParameter(tagid, "tagid");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(eidValues, "eidValues");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(telemetrySessionId, "telemetrySessionId");
        this.tagid = tagid;
        this.appVersion = appVersion;
        this.test = z10;
        this.ifa = str;
        this.lmt = z11;
        this.dnt = z12;
        this.userAgent = str2;
        this.lang = str3;
        this.deviceType = deviceType;
        this.deviceWidth = i10;
        this.deviceHeight = i11;
        this.lat = d10;
        this.lon = d11;
        this.lastfix = num;
        this.accuracy = num2;
        this.altitude = d12;
        this.pressure = f10;
        this.eidValues = eidValues;
        this.eidSource = str4;
        this.yearOfBirth = num3;
        this.gender = gender;
        this.coppa = z13;
        this.gpp = str5;
        this.usPrivacy = str6;
        this.bannerWidth = i12;
        this.bannerHeight = i13;
        this.sdkVersion = sdkVersion;
        this.telemetrySessionId = telemetrySessionId;
        this.ifv = str7;
        this.floor = f11;
        this.ipAddress = str8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MfxBidRequest copy$default(MfxBidRequest mfxBidRequest, String str, String str2, boolean z10, String str3, boolean z11, boolean z12, String str4, String str5, DeviceType deviceType, int i10, int i11, Double d10, Double d11, Integer num, Integer num2, Double d12, Float f10, Map map, String str6, Integer num3, Gender gender, boolean z13, String str7, String str8, int i12, int i13, String str9, String str10, String str11, Float f11, String str12, int i14, Object obj) {
        String str13;
        Float f12;
        String str14 = (i14 & 1) != 0 ? mfxBidRequest.tagid : str;
        String str15 = (i14 & 2) != 0 ? mfxBidRequest.appVersion : str2;
        boolean z14 = (i14 & 4) != 0 ? mfxBidRequest.test : z10;
        String str16 = (i14 & 8) != 0 ? mfxBidRequest.ifa : str3;
        boolean z15 = (i14 & 16) != 0 ? mfxBidRequest.lmt : z11;
        boolean z16 = (i14 & 32) != 0 ? mfxBidRequest.dnt : z12;
        String str17 = (i14 & 64) != 0 ? mfxBidRequest.userAgent : str4;
        String str18 = (i14 & 128) != 0 ? mfxBidRequest.lang : str5;
        DeviceType deviceType2 = (i14 & 256) != 0 ? mfxBidRequest.deviceType : deviceType;
        int i15 = (i14 & 512) != 0 ? mfxBidRequest.deviceWidth : i10;
        int i16 = (i14 & 1024) != 0 ? mfxBidRequest.deviceHeight : i11;
        Double d13 = (i14 & 2048) != 0 ? mfxBidRequest.lat : d10;
        Double d14 = (i14 & 4096) != 0 ? mfxBidRequest.lon : d11;
        Integer num4 = (i14 & 8192) != 0 ? mfxBidRequest.lastfix : num;
        String str19 = str14;
        Integer num5 = (i14 & 16384) != 0 ? mfxBidRequest.accuracy : num2;
        Double d15 = (i14 & 32768) != 0 ? mfxBidRequest.altitude : d12;
        Float f13 = (i14 & 65536) != 0 ? mfxBidRequest.pressure : f10;
        Map map2 = (i14 & 131072) != 0 ? mfxBidRequest.eidValues : map;
        String str20 = (i14 & 262144) != 0 ? mfxBidRequest.eidSource : str6;
        Integer num6 = (i14 & 524288) != 0 ? mfxBidRequest.yearOfBirth : num3;
        Gender gender2 = (i14 & 1048576) != 0 ? mfxBidRequest.gender : gender;
        boolean z17 = (i14 & 2097152) != 0 ? mfxBidRequest.coppa : z13;
        String str21 = (i14 & 4194304) != 0 ? mfxBidRequest.gpp : str7;
        String str22 = (i14 & 8388608) != 0 ? mfxBidRequest.usPrivacy : str8;
        int i17 = (i14 & 16777216) != 0 ? mfxBidRequest.bannerWidth : i12;
        int i18 = (i14 & 33554432) != 0 ? mfxBidRequest.bannerHeight : i13;
        String str23 = (i14 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? mfxBidRequest.sdkVersion : str9;
        String str24 = (i14 & 134217728) != 0 ? mfxBidRequest.telemetrySessionId : str10;
        String str25 = (i14 & 268435456) != 0 ? mfxBidRequest.ifv : str11;
        Float f14 = (i14 & 536870912) != 0 ? mfxBidRequest.floor : f11;
        if ((i14 & 1073741824) != 0) {
            f12 = f14;
            str13 = mfxBidRequest.ipAddress;
        } else {
            str13 = str12;
            f12 = f14;
        }
        return mfxBidRequest.copy(str19, str15, z14, str16, z15, z16, str17, str18, deviceType2, i15, i16, d13, d14, num4, num5, d15, f13, map2, str20, num6, gender2, z17, str21, str22, i17, i18, str23, str24, str25, f12, str13);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTagid() {
        return this.tagid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getDeviceWidth() {
        return this.deviceWidth;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getDeviceHeight() {
        return this.deviceHeight;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Double getLat() {
        return this.lat;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Double getLon() {
        return this.lon;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getLastfix() {
        return this.lastfix;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getAccuracy() {
        return this.accuracy;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Double getAltitude() {
        return this.altitude;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Float getPressure() {
        return this.pressure;
    }

    @NotNull
    public final Map<String, String> component18() {
        return this.eidValues;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getEidSource() {
        return this.eidSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Integer getYearOfBirth() {
        return this.yearOfBirth;
    }

    @NotNull
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Gender getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getCoppa() {
        return this.coppa;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getGpp() {
        return this.gpp;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getUsPrivacy() {
        return this.usPrivacy;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final int getBannerWidth() {
        return this.bannerWidth;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final int getBannerHeight() {
        return this.bannerHeight;
    }

    @NotNull
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getTelemetrySessionId() {
        return this.telemetrySessionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getIfv() {
        return this.ifv;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getTest() {
        return this.test;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Float getFloor() {
        return this.floor;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getIpAddress() {
        return this.ipAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIfa() {
        return this.ifa;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getLmt() {
        return this.lmt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getDnt() {
        return this.dnt;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUserAgent() {
        return this.userAgent;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final MfxBidRequest copy(@NotNull String tagid, @NotNull String appVersion, boolean test, @Nullable String ifa, boolean lmt, boolean dnt, @Nullable String userAgent, @Nullable String lang, @Nullable DeviceType deviceType, int deviceWidth, int deviceHeight, @Nullable Double lat, @Nullable Double lon, @Nullable Integer lastfix, @Nullable Integer accuracy, @Nullable Double altitude, @Nullable Float pressure, @NotNull Map<String, String> eidValues, @Nullable String eidSource, @Nullable Integer yearOfBirth, @NotNull Gender gender, boolean coppa, @Nullable String gpp, @Nullable String usPrivacy, int bannerWidth, int bannerHeight, @NotNull String sdkVersion, @NotNull String telemetrySessionId, @Nullable String ifv, @Nullable Float floor, @Nullable String ipAddress) {
        Intrinsics.checkNotNullParameter(tagid, "tagid");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(eidValues, "eidValues");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(telemetrySessionId, "telemetrySessionId");
        return new MfxBidRequest(tagid, appVersion, test, ifa, lmt, dnt, userAgent, lang, deviceType, deviceWidth, deviceHeight, lat, lon, lastfix, accuracy, altitude, pressure, eidValues, eidSource, yearOfBirth, gender, coppa, gpp, usPrivacy, bannerWidth, bannerHeight, sdkVersion, telemetrySessionId, ifv, floor, ipAddress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MfxBidRequest)) {
            return false;
        }
        MfxBidRequest mfxBidRequest = (MfxBidRequest) other;
        return Intrinsics.areEqual(this.tagid, mfxBidRequest.tagid) && Intrinsics.areEqual(this.appVersion, mfxBidRequest.appVersion) && this.test == mfxBidRequest.test && Intrinsics.areEqual(this.ifa, mfxBidRequest.ifa) && this.lmt == mfxBidRequest.lmt && this.dnt == mfxBidRequest.dnt && Intrinsics.areEqual(this.userAgent, mfxBidRequest.userAgent) && Intrinsics.areEqual(this.lang, mfxBidRequest.lang) && Intrinsics.areEqual(this.deviceType, mfxBidRequest.deviceType) && this.deviceWidth == mfxBidRequest.deviceWidth && this.deviceHeight == mfxBidRequest.deviceHeight && Intrinsics.areEqual((Object) this.lat, (Object) mfxBidRequest.lat) && Intrinsics.areEqual((Object) this.lon, (Object) mfxBidRequest.lon) && Intrinsics.areEqual(this.lastfix, mfxBidRequest.lastfix) && Intrinsics.areEqual(this.accuracy, mfxBidRequest.accuracy) && Intrinsics.areEqual((Object) this.altitude, (Object) mfxBidRequest.altitude) && Intrinsics.areEqual((Object) this.pressure, (Object) mfxBidRequest.pressure) && Intrinsics.areEqual(this.eidValues, mfxBidRequest.eidValues) && Intrinsics.areEqual(this.eidSource, mfxBidRequest.eidSource) && Intrinsics.areEqual(this.yearOfBirth, mfxBidRequest.yearOfBirth) && Intrinsics.areEqual(this.gender, mfxBidRequest.gender) && this.coppa == mfxBidRequest.coppa && Intrinsics.areEqual(this.gpp, mfxBidRequest.gpp) && Intrinsics.areEqual(this.usPrivacy, mfxBidRequest.usPrivacy) && this.bannerWidth == mfxBidRequest.bannerWidth && this.bannerHeight == mfxBidRequest.bannerHeight && Intrinsics.areEqual(this.sdkVersion, mfxBidRequest.sdkVersion) && Intrinsics.areEqual(this.telemetrySessionId, mfxBidRequest.telemetrySessionId) && Intrinsics.areEqual(this.ifv, mfxBidRequest.ifv) && Intrinsics.areEqual((Object) this.floor, (Object) mfxBidRequest.floor) && Intrinsics.areEqual(this.ipAddress, mfxBidRequest.ipAddress);
    }

    @Nullable
    public final Integer getAccuracy() {
        return this.accuracy;
    }

    @Nullable
    public final Double getAltitude() {
        return this.altitude;
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    public final int getBannerHeight() {
        return this.bannerHeight;
    }

    public final int getBannerWidth() {
        return this.bannerWidth;
    }

    public final boolean getCoppa() {
        return this.coppa;
    }

    public final int getDeviceHeight() {
        return this.deviceHeight;
    }

    @Nullable
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    public final int getDeviceWidth() {
        return this.deviceWidth;
    }

    public final boolean getDnt() {
        return this.dnt;
    }

    @Nullable
    public final String getEidSource() {
        return this.eidSource;
    }

    @NotNull
    public final Map<String, String> getEidValues() {
        return this.eidValues;
    }

    @Nullable
    public final Float getFloor() {
        return this.floor;
    }

    @NotNull
    public final Gender getGender() {
        return this.gender;
    }

    @Nullable
    public final String getGpp() {
        return this.gpp;
    }

    @Nullable
    public final String getIfa() {
        return this.ifa;
    }

    @Nullable
    public final String getIfv() {
        return this.ifv;
    }

    @Nullable
    public final String getIpAddress() {
        return this.ipAddress;
    }

    @Nullable
    public final String getLang() {
        return this.lang;
    }

    @Nullable
    public final Integer getLastfix() {
        return this.lastfix;
    }

    @Nullable
    public final Double getLat() {
        return this.lat;
    }

    public final boolean getLmt() {
        return this.lmt;
    }

    @Nullable
    public final Double getLon() {
        return this.lon;
    }

    @Nullable
    public final Float getPressure() {
        return this.pressure;
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @NotNull
    public final String getTagid() {
        return this.tagid;
    }

    @NotNull
    public final String getTelemetrySessionId() {
        return this.telemetrySessionId;
    }

    public final boolean getTest() {
        return this.test;
    }

    @Nullable
    public final String getUsPrivacy() {
        return this.usPrivacy;
    }

    @Nullable
    public final String getUserAgent() {
        return this.userAgent;
    }

    @Nullable
    public final Integer getYearOfBirth() {
        return this.yearOfBirth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Type inference failed for: r2v97 */
    /* JADX WARN: Type inference failed for: r2v99 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        String str = this.tagid;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.appVersion;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z10 = this.test;
        ?? r22 = z10;
        if (z10) {
            r22 = 1;
        }
        int i10 = (iHashCode2 + r22) * 31;
        String str3 = this.ifa;
        int iHashCode3 = (i10 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z11 = this.lmt;
        ?? r23 = z11;
        if (z11) {
            r23 = 1;
        }
        int i11 = (iHashCode3 + r23) * 31;
        boolean z12 = this.dnt;
        ?? r24 = z12;
        if (z12) {
            r24 = 1;
        }
        int i12 = (i11 + r24) * 31;
        String str4 = this.userAgent;
        int iHashCode4 = (i12 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.lang;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        DeviceType deviceType = this.deviceType;
        int iHashCode6 = (((((iHashCode5 + (deviceType != null ? deviceType.hashCode() : 0)) * 31) + this.deviceWidth) * 31) + this.deviceHeight) * 31;
        Double d10 = this.lat;
        int iHashCode7 = (iHashCode6 + (d10 != null ? d10.hashCode() : 0)) * 31;
        Double d11 = this.lon;
        int iHashCode8 = (iHashCode7 + (d11 != null ? d11.hashCode() : 0)) * 31;
        Integer num = this.lastfix;
        int iHashCode9 = (iHashCode8 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.accuracy;
        int iHashCode10 = (iHashCode9 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Double d12 = this.altitude;
        int iHashCode11 = (iHashCode10 + (d12 != null ? d12.hashCode() : 0)) * 31;
        Float f10 = this.pressure;
        int iHashCode12 = (iHashCode11 + (f10 != null ? f10.hashCode() : 0)) * 31;
        Map<String, String> map = this.eidValues;
        int iHashCode13 = (iHashCode12 + (map != null ? map.hashCode() : 0)) * 31;
        String str6 = this.eidSource;
        int iHashCode14 = (iHashCode13 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num3 = this.yearOfBirth;
        int iHashCode15 = (iHashCode14 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Gender gender = this.gender;
        int iHashCode16 = (iHashCode15 + (gender != null ? gender.hashCode() : 0)) * 31;
        boolean z13 = this.coppa;
        int i13 = (iHashCode16 + (z13 ? 1 : z13)) * 31;
        String str7 = this.gpp;
        int iHashCode17 = (i13 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.usPrivacy;
        int iHashCode18 = (((((iHashCode17 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.bannerWidth) * 31) + this.bannerHeight) * 31;
        String str9 = this.sdkVersion;
        int iHashCode19 = (iHashCode18 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.telemetrySessionId;
        int iHashCode20 = (iHashCode19 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.ifv;
        int iHashCode21 = (iHashCode20 + (str11 != null ? str11.hashCode() : 0)) * 31;
        Float f11 = this.floor;
        int iHashCode22 = (iHashCode21 + (f11 != null ? f11.hashCode() : 0)) * 31;
        String str12 = this.ipAddress;
        return iHashCode22 + (str12 != null ? str12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MfxBidRequest(tagid=" + this.tagid + ", appVersion=" + this.appVersion + ", test=" + this.test + ", ifa=" + this.ifa + ", lmt=" + this.lmt + ", dnt=" + this.dnt + ", userAgent=" + this.userAgent + ", lang=" + this.lang + ", deviceType=" + this.deviceType + ", deviceWidth=" + this.deviceWidth + ", deviceHeight=" + this.deviceHeight + ", lat=" + this.lat + ", lon=" + this.lon + ", lastfix=" + this.lastfix + ", accuracy=" + this.accuracy + ", altitude=" + this.altitude + ", pressure=" + this.pressure + ", eidValues=" + this.eidValues + ", eidSource=" + this.eidSource + ", yearOfBirth=" + this.yearOfBirth + ", gender=" + this.gender + ", coppa=" + this.coppa + ", gpp=" + this.gpp + ", usPrivacy=" + this.usPrivacy + ", bannerWidth=" + this.bannerWidth + ", bannerHeight=" + this.bannerHeight + ", sdkVersion=" + this.sdkVersion + ", telemetrySessionId=" + this.telemetrySessionId + ", ifv=" + this.ifv + ", floor=" + this.floor + ", ipAddress=" + this.ipAddress + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MfxBidRequest(java.lang.String r35, java.lang.String r36, boolean r37, java.lang.String r38, boolean r39, boolean r40, java.lang.String r41, java.lang.String r42, com.mobilefuse.sdk.device.DeviceType r43, int r44, int r45, java.lang.Double r46, java.lang.Double r47, java.lang.Integer r48, java.lang.Integer r49, java.lang.Double r50, java.lang.Float r51, java.util.Map r52, java.lang.String r53, java.lang.Integer r54, com.mobilefuse.sdk.user.Gender r55, boolean r56, java.lang.String r57, java.lang.String r58, int r59, int r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.Float r64, java.lang.String r65, int r66, kotlin.jvm.internal.DefaultConstructorMarker r67) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobilefuse.sdk.network.model.MfxBidRequest.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, com.mobilefuse.sdk.device.DeviceType, int, int, java.lang.Double, java.lang.Double, java.lang.Integer, java.lang.Integer, java.lang.Double, java.lang.Float, java.util.Map, java.lang.String, java.lang.Integer, com.mobilefuse.sdk.user.Gender, boolean, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Float, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
