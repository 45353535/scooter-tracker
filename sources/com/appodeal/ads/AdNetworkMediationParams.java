package com.appodeal.ads;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/appodeal/ads/AdNetworkMediationParams;", "", "restrictedData", "Lcom/appodeal/ads/RestrictedData;", "getRestrictedData", "()Lcom/appodeal/ads/RestrictedData;", "isTestMode", "", "()Z", "framework", "", "getFramework", "()Ljava/lang/String;", "frameworkVersion", "getFrameworkVersion", "segmentId", "", "getSegmentId", "()J", JsonStorageKeyNames.SESSION_ID_KEY, "getSessionId", "token", "Lorg/json/JSONObject;", "getToken", "()Lorg/json/JSONObject;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AdNetworkMediationParams {
    @Nullable
    String getFramework();

    @Nullable
    String getFrameworkVersion();

    @NotNull
    RestrictedData getRestrictedData();

    long getSegmentId();

    @Nullable
    String getSessionId();

    @Nullable
    JSONObject getToken();

    boolean isTestMode();
}
