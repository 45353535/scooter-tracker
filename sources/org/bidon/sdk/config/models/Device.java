package org.bidon.sdk.config.models;

import com.amazon.device.ads.DtbDeviceData;
import com.ironsource.N6;
import com.mobilefuse.sdk.device.UserAgentInfo;
import com.my.target.common.menu.MenuActionType;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.serializer.JsonName;
import org.bidon.sdk.utils.serializer.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b5\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010;\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010<\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010=\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010>\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003Jä\u0001\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010EJ\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010IHÖ\u0003J\t\u0010J\u001a\u00020\rHÖ\u0001J\t\u0010K\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b'\u0010%R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b(\u0010%R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b,\u0010%R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u0016\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001d¨\u0006L"}, d2 = {"Lorg/bidon/sdk/config/models/Device;", "Lorg/bidon/sdk/utils/serializer/Serializable;", "geo", "Lorg/bidon/sdk/config/models/Geo;", UserAgentInfo.CACHE_USER_AGENT_VALUE_KEY, "", CommonUrlParts.MANUFACTURER, "deviceModel", "os", DtbDeviceData.DEVICE_DATA_OS_VERSION_KEY, "osApiLevel", "hardwareVersion", "height", "", "width", "ppi", "pxRatio", "", "javaScriptSupport", "language", N6.Q0, "mccmnc", "connectionType", "type", "<init>", "(Lorg/bidon/sdk/config/models/Geo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGeo", "()Lorg/bidon/sdk/config/models/Geo;", "getUserAgent", "()Ljava/lang/String;", "getManufacturer", "getDeviceModel", "getOs", "getOsVersion", "getOsApiLevel", "getHardwareVersion", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWidth", "getPpi", "getPxRatio", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getJavaScriptSupport", "getLanguage", "getCarrier", "getMccmnc", "getConnectionType", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", MenuActionType.COPY, "(Lorg/bidon/sdk/config/models/Geo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/bidon/sdk/config/models/Device;", "equals", "", "other", "", "hashCode", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Device implements Serializable {

    @JsonName(key = N6.Q0)
    @Nullable
    private final String carrier;

    @JsonName(key = "connection_type")
    @Nullable
    private final String connectionType;

    @JsonName(key = "model")
    @Nullable
    private final String deviceModel;

    @JsonName(key = "geo")
    @Nullable
    private final Geo geo;

    @JsonName(key = "hwv")
    @Nullable
    private final String hardwareVersion;

    @JsonName(key = "h")
    @Nullable
    private final Integer height;

    @JsonName(key = "js")
    @Nullable
    private final Integer javaScriptSupport;

    @JsonName(key = "language")
    @Nullable
    private final String language;

    @JsonName(key = N6.f41422t)
    @Nullable
    private final String manufacturer;

    @JsonName(key = "mccmnc")
    @Nullable
    private final String mccmnc;

    @JsonName(key = "os")
    @Nullable
    private final String os;

    @JsonName(key = CommonUrlParts.OS_API_LEVEL)
    @Nullable
    private final String osApiLevel;

    @JsonName(key = N6.G)
    @Nullable
    private final String osVersion;

    @JsonName(key = "ppi")
    @Nullable
    private final Integer ppi;

    @JsonName(key = "pxratio")
    @Nullable
    private final Float pxRatio;

    @JsonName(key = "type")
    @NotNull
    private final String type;

    @JsonName(key = N6.f41375d0)
    @Nullable
    private final String userAgent;

    @JsonName(key = POBCoreNativeConstants.NATIVE_IMAGE_WIDTH)
    @Nullable
    private final Integer width;

    public Device(@Nullable Geo geo, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Float f10, @Nullable Integer num4, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.geo = geo;
        this.userAgent = str;
        this.manufacturer = str2;
        this.deviceModel = str3;
        this.os = str4;
        this.osVersion = str5;
        this.osApiLevel = str6;
        this.hardwareVersion = str7;
        this.height = num;
        this.width = num2;
        this.ppi = num3;
        this.pxRatio = f10;
        this.javaScriptSupport = num4;
        this.language = str8;
        this.carrier = str9;
        this.mccmnc = str10;
        this.connectionType = str11;
        this.type = type;
    }

    public static /* synthetic */ Device copy$default(Device device, Geo geo, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, Integer num3, Float f10, Integer num4, String str8, String str9, String str10, String str11, String str12, int i10, Object obj) {
        String str13;
        String str14;
        Geo geo2 = (i10 & 1) != 0 ? device.geo : geo;
        String str15 = (i10 & 2) != 0 ? device.userAgent : str;
        String str16 = (i10 & 4) != 0 ? device.manufacturer : str2;
        String str17 = (i10 & 8) != 0 ? device.deviceModel : str3;
        String str18 = (i10 & 16) != 0 ? device.os : str4;
        String str19 = (i10 & 32) != 0 ? device.osVersion : str5;
        String str20 = (i10 & 64) != 0 ? device.osApiLevel : str6;
        String str21 = (i10 & 128) != 0 ? device.hardwareVersion : str7;
        Integer num5 = (i10 & 256) != 0 ? device.height : num;
        Integer num6 = (i10 & 512) != 0 ? device.width : num2;
        Integer num7 = (i10 & 1024) != 0 ? device.ppi : num3;
        Float f11 = (i10 & 2048) != 0 ? device.pxRatio : f10;
        Integer num8 = (i10 & 4096) != 0 ? device.javaScriptSupport : num4;
        String str22 = (i10 & 8192) != 0 ? device.language : str8;
        Geo geo3 = geo2;
        String str23 = (i10 & 16384) != 0 ? device.carrier : str9;
        String str24 = (i10 & 32768) != 0 ? device.mccmnc : str10;
        String str25 = (i10 & 65536) != 0 ? device.connectionType : str11;
        if ((i10 & 131072) != 0) {
            str14 = str25;
            str13 = device.type;
        } else {
            str13 = str12;
            str14 = str25;
        }
        return device.copy(geo3, str15, str16, str17, str18, str19, str20, str21, num5, num6, num7, f11, num8, str22, str23, str24, str14, str13);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Geo getGeo() {
        return this.geo;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getPpi() {
        return this.ppi;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Float getPxRatio() {
        return this.pxRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getJavaScriptSupport() {
        return this.javaScriptSupport;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCarrier() {
        return this.carrier;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getMccmnc() {
        return this.mccmnc;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getConnectionType() {
        return this.connectionType;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserAgent() {
        return this.userAgent;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOsApiLevel() {
        return this.osApiLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getHardwareVersion() {
        return this.hardwareVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @NotNull
    public final Device copy(@Nullable Geo geo, @Nullable String userAgent, @Nullable String manufacturer, @Nullable String deviceModel, @Nullable String os, @Nullable String osVersion, @Nullable String osApiLevel, @Nullable String hardwareVersion, @Nullable Integer height, @Nullable Integer width, @Nullable Integer ppi, @Nullable Float pxRatio, @Nullable Integer javaScriptSupport, @Nullable String language, @Nullable String carrier, @Nullable String mccmnc, @Nullable String connectionType, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new Device(geo, userAgent, manufacturer, deviceModel, os, osVersion, osApiLevel, hardwareVersion, height, width, ppi, pxRatio, javaScriptSupport, language, carrier, mccmnc, connectionType, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Device)) {
            return false;
        }
        Device device = (Device) other;
        return Intrinsics.areEqual(this.geo, device.geo) && Intrinsics.areEqual(this.userAgent, device.userAgent) && Intrinsics.areEqual(this.manufacturer, device.manufacturer) && Intrinsics.areEqual(this.deviceModel, device.deviceModel) && Intrinsics.areEqual(this.os, device.os) && Intrinsics.areEqual(this.osVersion, device.osVersion) && Intrinsics.areEqual(this.osApiLevel, device.osApiLevel) && Intrinsics.areEqual(this.hardwareVersion, device.hardwareVersion) && Intrinsics.areEqual(this.height, device.height) && Intrinsics.areEqual(this.width, device.width) && Intrinsics.areEqual(this.ppi, device.ppi) && Intrinsics.areEqual((Object) this.pxRatio, (Object) device.pxRatio) && Intrinsics.areEqual(this.javaScriptSupport, device.javaScriptSupport) && Intrinsics.areEqual(this.language, device.language) && Intrinsics.areEqual(this.carrier, device.carrier) && Intrinsics.areEqual(this.mccmnc, device.mccmnc) && Intrinsics.areEqual(this.connectionType, device.connectionType) && Intrinsics.areEqual(this.type, device.type);
    }

    @Nullable
    public final String getCarrier() {
        return this.carrier;
    }

    @Nullable
    public final String getConnectionType() {
        return this.connectionType;
    }

    @Nullable
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @Nullable
    public final Geo getGeo() {
        return this.geo;
    }

    @Nullable
    public final String getHardwareVersion() {
        return this.hardwareVersion;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final Integer getJavaScriptSupport() {
        return this.javaScriptSupport;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @Nullable
    public final String getMccmnc() {
        return this.mccmnc;
    }

    @Nullable
    public final String getOs() {
        return this.os;
    }

    @Nullable
    public final String getOsApiLevel() {
        return this.osApiLevel;
    }

    @Nullable
    public final String getOsVersion() {
        return this.osVersion;
    }

    @Nullable
    public final Integer getPpi() {
        return this.ppi;
    }

    @Nullable
    public final Float getPxRatio() {
        return this.pxRatio;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUserAgent() {
        return this.userAgent;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        Geo geo = this.geo;
        int iHashCode = (geo == null ? 0 : geo.hashCode()) * 31;
        String str = this.userAgent;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.manufacturer;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceModel;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.os;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.osVersion;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.osApiLevel;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.hardwareVersion;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.height;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.width;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.ppi;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f10 = this.pxRatio;
        int iHashCode12 = (iHashCode11 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Integer num4 = this.javaScriptSupport;
        int iHashCode13 = (iHashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str8 = this.language;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.carrier;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.mccmnc;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.connectionType;
        return ((iHashCode16 + (str11 != null ? str11.hashCode() : 0)) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "Device(geo=" + this.geo + ", userAgent=" + this.userAgent + ", manufacturer=" + this.manufacturer + ", deviceModel=" + this.deviceModel + ", os=" + this.os + ", osVersion=" + this.osVersion + ", osApiLevel=" + this.osApiLevel + ", hardwareVersion=" + this.hardwareVersion + ", height=" + this.height + ", width=" + this.width + ", ppi=" + this.ppi + ", pxRatio=" + this.pxRatio + ", javaScriptSupport=" + this.javaScriptSupport + ", language=" + this.language + ", carrier=" + this.carrier + ", mccmnc=" + this.mccmnc + ", connectionType=" + this.connectionType + ", type=" + this.type + ")";
    }
}
