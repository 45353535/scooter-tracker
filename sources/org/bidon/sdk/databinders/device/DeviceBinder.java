package org.bidon.sdk.databinders.device;

import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.config.models.Device;
import org.bidon.sdk.config.models.Geo;
import org.bidon.sdk.databinders.DataBinder;
import org.bidon.sdk.databinders.location.LocationDataSource;
import org.bidon.sdk.utils.serializer.SerializerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\r\u001a\u00020\u0002H\u0096@¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lorg/bidon/sdk/databinders/device/DeviceBinder;", "Lorg/bidon/sdk/databinders/DataBinder;", "Lorg/json/JSONObject;", "deviceDataSource", "Lorg/bidon/sdk/databinders/device/DeviceDataSource;", "locationDataSource", "Lorg/bidon/sdk/databinders/location/LocationDataSource;", "<init>", "(Lorg/bidon/sdk/databinders/device/DeviceDataSource;Lorg/bidon/sdk/databinders/location/LocationDataSource;)V", "fieldName", "", "getFieldName", "()Ljava/lang/String;", "getJsonObject", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createDevice", "Lorg/bidon/sdk/config/models/Device;", "DeviceType", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceBinder implements DataBinder<JSONObject> {

    @NotNull
    private final DeviceDataSource deviceDataSource;

    @NotNull
    private final String fieldName;

    @NotNull
    private final LocationDataSource locationDataSource;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lorg/bidon/sdk/databinders/device/DeviceBinder$DeviceType;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Phone", "Tablet", y.f66058y, "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeviceType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DeviceType[] $VALUES;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final DeviceType Phone = new DeviceType("Phone", 0, "PHONE");
        public static final DeviceType Tablet = new DeviceType("Tablet", 1, "TABLET");

        @NotNull
        private final String code;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/databinders/device/DeviceBinder$DeviceType$Companion;", "", "<init>", "()V", "getType", "Lorg/bidon/sdk/databinders/device/DeviceBinder$DeviceType;", "isTablet", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final DeviceType getType(boolean isTablet) {
                return isTablet ? DeviceType.Tablet : DeviceType.Phone;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ DeviceType[] $values() {
            return new DeviceType[]{Phone, Tablet};
        }

        static {
            DeviceType[] deviceTypeArr$values = $values();
            $VALUES = deviceTypeArr$values;
            $ENTRIES = qf.a.a(deviceTypeArr$values);
            INSTANCE = new Companion(null);
        }

        private DeviceType(String str, int i10, String str2) {
            this.code = str2;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static DeviceType valueOf(String str) {
            return (DeviceType) Enum.valueOf(DeviceType.class, str);
        }

        public static DeviceType[] values() {
            return (DeviceType[]) $VALUES.clone();
        }

        @NotNull
        public final String getCode() {
            return this.code;
        }
    }

    public DeviceBinder(@NotNull DeviceDataSource deviceDataSource, @NotNull LocationDataSource locationDataSource) {
        Intrinsics.checkNotNullParameter(deviceDataSource, "deviceDataSource");
        Intrinsics.checkNotNullParameter(locationDataSource, "locationDataSource");
        this.deviceDataSource = deviceDataSource;
        this.locationDataSource = locationDataSource;
        this.fieldName = C4240b4.i.G;
    }

    private final Device createDevice() {
        Geo geo = this.locationDataSource.isLocationAvailable() ? new Geo(this.locationDataSource.getLatitude(), this.locationDataSource.getLongitude(), this.locationDataSource.getAccuracy(), this.locationDataSource.getLastFix(), this.locationDataSource.getCountry(), this.locationDataSource.getCity(), this.locationDataSource.getZip(), this.locationDataSource.getUtcOffset()) : null;
        String userAgent = this.deviceDataSource.getUserAgent();
        String manufacturer = this.deviceDataSource.getManufacturer();
        String deviceModel = this.deviceDataSource.getDeviceModel();
        String os = this.deviceDataSource.getOs();
        String osVersion = this.deviceDataSource.getOsVersion();
        String hardwareVersion = this.deviceDataSource.getHardwareVersion();
        int screenWidth = this.deviceDataSource.getScreenWidth();
        return new Device(geo, userAgent, manufacturer, deviceModel, os, osVersion, this.deviceDataSource.getApiLevel(), hardwareVersion, Integer.valueOf(this.deviceDataSource.getScreenHeight()), Integer.valueOf(screenWidth), Integer.valueOf(this.deviceDataSource.getPpi()), Float.valueOf(this.deviceDataSource.getPxRatio()), Integer.valueOf(this.deviceDataSource.getJavaScriptSupport()), this.deviceDataSource.getLanguage(), this.deviceDataSource.getCarrier(), this.deviceDataSource.getPhoneMCCMNC(), this.deviceDataSource.getConnectionTypeCode(), DeviceType.INSTANCE.getType(this.deviceDataSource.isTablet()).getCode());
    }

    @Override // org.bidon.sdk.databinders.DataBinder
    @NotNull
    public String getFieldName() {
        return this.fieldName;
    }

    @Override // org.bidon.sdk.databinders.DataBinder
    @Nullable
    public Object getJsonObject(@NotNull Continuation continuation) {
        return SerializerKt.serialize(createDevice());
    }
}
