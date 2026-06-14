package com.pubmatic.sdk.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBApplicationInfo;
import com.pubmatic.sdk.common.models.POBDSAComplianceStatus;
import com.pubmatic.sdk.common.models.POBExternalUserId;
import com.pubmatic.sdk.common.models.POBLocation;
import com.pubmatic.sdk.common.models.POBUserInfo;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.omsdk.POBOMSDKUtil;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class POBSDKConfig {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f62230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private POBLocation f62231e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private POBUserInfo f62234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private POBApplicationInfo f62235i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f62227a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f62228b = 600000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f62229c = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f62232f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f62233g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private POBDSAComplianceStatus f62237k = POBDSAComplianceStatus.NOT_REQUIRED;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f62236j = DesugarCollections.synchronizedMap(new HashMap());

    POBSDKConfig() {
    }

    public void addExternalUserId(@NonNull POBExternalUserId pOBExternalUserId) {
        if (pOBExternalUserId == null || POBUtils.isNullOrEmpty(pOBExternalUserId.getId()) || POBUtils.isNullOrEmpty(pOBExternalUserId.getSource())) {
            POBLog.warn("POBSDKConfig", "%s is null or required fields are not available", "External User Id");
            return;
        }
        String source = pOBExternalUserId.getSource();
        if (!this.f62236j.containsKey(source)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(pOBExternalUserId);
            this.f62236j.put(source, arrayList);
            return;
        }
        List<POBExternalUserId> list = (List) this.f62236j.get(source);
        if (list != null) {
            for (POBExternalUserId pOBExternalUserId2 : list) {
                if (pOBExternalUserId2 != null && pOBExternalUserId2.getId().equals(pOBExternalUserId.getId())) {
                    POBLog.warn("POBSDKConfig", "%s with duplicate %s not allowed", "External User Id", "partner Id");
                    return;
                }
            }
            list.add(pOBExternalUserId);
            this.f62236j.put(source, list);
        }
    }

    public void allowAdvertisingId(boolean z10) {
        this.f62233g = z10;
    }

    public void allowLocationAccess(boolean z10) {
        this.f62227a = z10;
    }

    @Nullable
    public POBApplicationInfo getApplicationInfo() {
        return this.f62235i;
    }

    @NonNull
    public POBDSAComplianceStatus getDsaComplianceStatus() {
        return this.f62237k;
    }

    @NonNull
    public Map<String, List<POBExternalUserId>> getExternalUserIds() {
        return this.f62236j;
    }

    @Nullable
    public POBLocation getLocation() {
        return this.f62231e;
    }

    public long getLocationDetectionDurationInMillis() {
        return this.f62228b;
    }

    @Nullable
    public <T> T getMeasurementProvider(@NonNull String str) {
        try {
            return (T) Class.forName(str).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e10) {
            POBLog.error(POBOMSDKUtil.TAG, "%s", e10.getMessage());
            return null;
        }
    }

    @Nullable
    public POBUserInfo getUserInfo() {
        return this.f62234h;
    }

    public boolean isAllowAdvertisingId() {
        return this.f62233g;
    }

    @Nullable
    public Boolean isCoppa() {
        return this.f62230d;
    }

    public boolean isLocationAccessAllowed() {
        return this.f62227a;
    }

    @Deprecated
    public boolean isRequestSecureCreative() {
        return this.f62232f;
    }

    public boolean isUseInternalBrowser() {
        return this.f62229c;
    }

    public void removeAllExternalUserIds() {
        this.f62236j.clear();
    }

    public void removeExternalUserIds(@NonNull String str) {
        if (str != null) {
            this.f62236j.remove(str);
        }
    }

    public void setApplicationInfo(@Nullable POBApplicationInfo pOBApplicationInfo) {
        this.f62235i = pOBApplicationInfo;
    }

    public void setCoppa(boolean z10) {
        this.f62230d = Boolean.valueOf(z10);
    }

    public void setDSAComplianceStatus(@NonNull POBDSAComplianceStatus pOBDSAComplianceStatus) {
        if (pOBDSAComplianceStatus != null) {
            this.f62237k = pOBDSAComplianceStatus;
        } else {
            POBLog.warn("POBSDKConfig", "%s is null or required fields are not available", "DSA Transparency Info");
        }
    }

    public void setLocation(@Nullable POBLocation pOBLocation) {
        this.f62231e = pOBLocation;
    }

    public void setLocationDetectionDurationInMillis(long j10) {
        this.f62228b = j10;
    }

    @Deprecated
    public void setRequestSecureCreative(boolean z10) {
        this.f62232f = z10;
    }

    public void setUseInternalBrowser(boolean z10) {
        this.f62229c = z10;
    }

    public void setUserInfo(@Nullable POBUserInfo pOBUserInfo) {
        this.f62234h = pOBUserInfo;
    }
}
