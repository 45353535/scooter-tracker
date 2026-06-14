package com.pubmatic.sdk.common;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.OpenWrapSDKInitializer;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBApplicationInfo;
import com.pubmatic.sdk.common.models.POBDSAComplianceStatus;
import com.pubmatic.sdk.common.models.POBExternalUserId;
import com.pubmatic.sdk.common.models.POBLocation;
import com.pubmatic.sdk.common.models.POBUserInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class OpenWrapSDK {
    public static final String KEY_SELECTED_REWARD = "selected_reward";

    public enum LogLevel {
        All(0),
        Verbose(1),
        Debug(2),
        Info(3),
        Warn(4),
        Error(5),
        Off(6);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f62201a;

        LogLevel(int i10) {
            this.f62201a = i10;
        }

        public int getLevel() {
            return this.f62201a;
        }
    }

    public static void addExternalUserId(@NonNull POBExternalUserId pOBExternalUserId) {
        POBInstanceProvider.getSdkConfig().addExternalUserId(pOBExternalUserId);
    }

    public static void allowAdvertisingId(boolean z10) {
        POBInstanceProvider.getSdkConfig().allowAdvertisingId(z10);
    }

    public static void allowLocationAccess(boolean z10) {
        POBInstanceProvider.getSdkConfig().allowLocationAccess(z10);
    }

    @Nullable
    public static POBApplicationInfo getApplicationInfo() {
        return POBInstanceProvider.getSdkConfig().getApplicationInfo();
    }

    public static POBDSAComplianceStatus getDSAComplianceStatus() {
        return POBInstanceProvider.getSdkConfig().getDsaComplianceStatus();
    }

    @NonNull
    public static List<POBExternalUserId> getExternalUserIds() {
        Map<String, List<POBExternalUserId>> externalUserIds = POBInstanceProvider.getSdkConfig().getExternalUserIds();
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, List<POBExternalUserId>>> it = externalUserIds.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getValue());
        }
        return arrayList;
    }

    @Nullable
    public static POBUserInfo getUserInfo() {
        return POBInstanceProvider.getSdkConfig().getUserInfo();
    }

    public static String getVersion() {
        return "4.10.0";
    }

    @AnyThread
    public static void initialize(@NonNull Context context, @NonNull OpenWrapSDKConfig openWrapSDKConfig, @NonNull OpenWrapSDKInitializer.Listener listener) {
        OpenWrapSDKInitializerImpl.INSTANCE.initialize(context, openWrapSDKConfig, listener);
    }

    public static void removeAllExternalUserIds() {
        POBInstanceProvider.getSdkConfig().removeAllExternalUserIds();
    }

    public static void removeExternalUserIds(@NonNull String str) {
        POBInstanceProvider.getSdkConfig().removeExternalUserIds(str);
    }

    public static void setApplicationInfo(POBApplicationInfo pOBApplicationInfo) {
        POBInstanceProvider.getSdkConfig().setApplicationInfo(pOBApplicationInfo);
    }

    public static void setCoppa(boolean z10) {
        POBInstanceProvider.getSdkConfig().setCoppa(z10);
    }

    public static void setDSAComplianceStatus(@NonNull POBDSAComplianceStatus pOBDSAComplianceStatus) {
        POBInstanceProvider.getSdkConfig().setDSAComplianceStatus(pOBDSAComplianceStatus);
    }

    public static void setLocation(POBLocation pOBLocation) {
        POBInstanceProvider.getSdkConfig().setLocation(pOBLocation);
    }

    public static void setLogLevel(LogLevel logLevel) {
        POBLog.setLogLevel(logLevel);
    }

    @Deprecated
    public static void setSSLEnabled(boolean z10) {
        POBInstanceProvider.getSdkConfig().setRequestSecureCreative(z10);
    }

    public static void setUseInternalBrowser(boolean z10) {
        POBInstanceProvider.getSdkConfig().setUseInternalBrowser(z10);
    }

    public static void setUserInfo(POBUserInfo pOBUserInfo) {
        POBInstanceProvider.getSdkConfig().setUserInfo(pOBUserInfo);
    }
}
