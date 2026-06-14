package com.mobilefuse.sdk.network.model;

import com.adjust.sdk.purchase.ADJPConstants;
import com.amazon.device.ads.DtbConstants;
import com.ironsource.N6;
import com.mobilefuse.sdk.device.DeviceType;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.mobilefuse.sdk.user.Gender;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u0016\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0004¨\u0006\b"}, d2 = {"toMap", "", "", "", "Lcom/mobilefuse/sdk/network/model/MfxBidRequest;", "includeEids", "", "toStringMap", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class MfxBidRequestToMapKt {
    @NotNull
    public static final Map<String, Object> toMap(@NotNull MfxBidRequest toMap, boolean z10) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(toMap, "$this$toMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tagid", toMap.getTagid());
        linkedHashMap.put(ADJPConstants.KEY_SDK_VERSION, toMap.getSdkVersion());
        linkedHashMap.put("app_version", toMap.getAppVersion());
        if (toMap.getTest()) {
            linkedHashMap.put("test", 1);
        }
        String ifa = toMap.getIfa();
        if (ifa != null && !StringsKt.y0(ifa)) {
            linkedHashMap.put(EidRequestBuilder.REQUEST_FIELD_IFA, toMap.getIfa());
        }
        if (toMap.getLmt()) {
            linkedHashMap.put(EidRequestBuilder.REQUEST_FIELD_LMT, 1);
        }
        if (toMap.getDnt()) {
            linkedHashMap.put("dnt", 1);
        }
        String userAgent = toMap.getUserAgent();
        if (userAgent != null && userAgent.length() != 0) {
            linkedHashMap.put(N6.f41375d0, toMap.getUserAgent());
        }
        String lang = toMap.getLang();
        if (lang != null && lang.length() != 0) {
            linkedHashMap.put(N6.f41413q, toMap.getLang());
        }
        DeviceType deviceType = toMap.getDeviceType();
        if (deviceType != null) {
            linkedHashMap.put(CommonUrlParts.DEVICE_TYPE, Integer.valueOf(deviceType.getValue()));
        }
        if (toMap.getDeviceWidth() > 0) {
            linkedHashMap.put("device_w", Integer.valueOf(toMap.getDeviceWidth()));
        }
        if (toMap.getDeviceHeight() > 0) {
            linkedHashMap.put("device_h", Integer.valueOf(toMap.getDeviceHeight()));
        }
        Double lat = toMap.getLat();
        if (lat != null) {
            linkedHashMap.put(N6.f41419s, Double.valueOf(lat.doubleValue()));
        }
        Double lon = toMap.getLon();
        if (lon != null) {
            linkedHashMap.put("lon", Double.valueOf(lon.doubleValue()));
        }
        Integer lastfix = toMap.getLastfix();
        if (lastfix != null) {
            linkedHashMap.put("lastfix", Integer.valueOf(lastfix.intValue()));
        }
        Integer accuracy = toMap.getAccuracy();
        if (accuracy != null) {
            linkedHashMap.put("accuracy", Integer.valueOf(accuracy.intValue()));
        }
        Double altitude = toMap.getAltitude();
        if (altitude != null) {
            linkedHashMap.put("altitude", Double.valueOf(altitude.doubleValue()));
        }
        Float pressure = toMap.getPressure();
        if (pressure != null) {
            linkedHashMap.put("pressure", Float.valueOf(pressure.floatValue()));
        }
        if (z10) {
            for (Map.Entry<String, String> entry : toMap.getEidValues().entrySet()) {
                linkedHashMap.put("eid[" + entry.getKey() + ']', entry.getValue());
            }
        }
        String eidSource = toMap.getEidSource();
        if (eidSource != null && eidSource.length() != 0) {
            linkedHashMap.put("eid_source", toMap.getEidSource());
        }
        Integer yearOfBirth = toMap.getYearOfBirth();
        if (yearOfBirth != null && (iIntValue = yearOfBirth.intValue()) > 0) {
            linkedHashMap.put("yob", Integer.valueOf(iIntValue));
        }
        if (toMap.getGender() != Gender.UNKNOWN) {
            linkedHashMap.put("gender", toMap.getGender().getValue());
        }
        if (toMap.getCoppa()) {
            linkedHashMap.put("coppa", 1);
        }
        String gpp = toMap.getGpp();
        if (gpp != null && gpp.length() != 0) {
            linkedHashMap.put(EidRequestBuilder.REQUEST_FIELD_GPP, toMap.getGpp());
        }
        String usPrivacy = toMap.getUsPrivacy();
        if (usPrivacy != null && usPrivacy.length() != 0) {
            linkedHashMap.put(DtbConstants.APS_ADMOB_CONST_CCPA_US_PRIVACY, toMap.getUsPrivacy());
        }
        if (toMap.getBannerWidth() > 0) {
            linkedHashMap.put("banner_width", Integer.valueOf(toMap.getBannerWidth()));
        }
        if (toMap.getBannerHeight() > 0) {
            linkedHashMap.put("banner_height", Integer.valueOf(toMap.getBannerHeight()));
        }
        if (!StringsKt.y0(toMap.getTelemetrySessionId())) {
            linkedHashMap.put("log_uuid", toMap.getTelemetrySessionId());
        }
        if (toMap.getIfv() != null) {
            linkedHashMap.put("ifv", toMap.getIfv());
        }
        if (toMap.getFloor() != null && toMap.getFloor().floatValue() >= 0) {
            linkedHashMap.put("floor", toMap.getFloor());
        }
        String ipAddress = toMap.getIpAddress();
        if (ipAddress != null && ipAddress.length() != 0 && !StringsKt.y0(toMap.getIpAddress())) {
            linkedHashMap.put("ip", toMap.getIpAddress());
        }
        return linkedHashMap;
    }

    public static /* synthetic */ Map toMap$default(MfxBidRequest mfxBidRequest, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return toMap(mfxBidRequest, z10);
    }

    @NotNull
    public static final Map<String, String> toStringMap(@NotNull MfxBidRequest toStringMap) {
        Intrinsics.checkNotNullParameter(toStringMap, "$this$toStringMap");
        Map map$default = toMap$default(toStringMap, false, 1, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map$default.size()));
        for (Map.Entry entry : map$default.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return linkedHashMap;
    }
}
