package com.unity3d.ads.core.data.datasource;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH&J\b\u0010\u000f\u001a\u00020\nH&J\b\u0010\u0010\u001a\u00020\fH&J\b\u0010\u0011\u001a\u00020\u0012H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/DynamicDeviceInfoDataSource;", "", "volumeSettingsChange", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "getVolumeSettingsChange", "()Lkotlinx/coroutines/flow/Flow;", RemoteConfigComponent.FETCH_FILE_NAME, "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getConnectionTypeStr", "", "getCurrentUiTheme", "", "getLocaleList", "", "getOrientation", "getRingerMode", "hasInternet", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DynamicDeviceInfoDataSource {
    @NotNull
    DynamicDeviceInfoOuterClass.DynamicDeviceInfo fetch();

    @NotNull
    String getConnectionTypeStr();

    int getCurrentUiTheme();

    @NotNull
    List<String> getLocaleList();

    @NotNull
    String getOrientation();

    int getRingerMode();

    @NotNull
    Flow getVolumeSettingsChange();

    boolean hasInternet();
}
