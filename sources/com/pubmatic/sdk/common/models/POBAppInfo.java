package com.pubmatic.sdk.common.models;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;

/* JADX INFO: loaded from: classes11.dex */
public class POBAppInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f62353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f62354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f62355c;

    public POBAppInfo(@NonNull Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            this.f62353a = packageInfo.applicationInfo.loadLabel(packageManager).toString();
            this.f62354b = context.getPackageName();
            this.f62355c = packageInfo.versionName;
        } catch (Exception e10) {
            POBLog.error("POBAppInfo", "Failed to retrieve app info: %s", e10.getLocalizedMessage());
        }
    }

    @Nullable
    public String getAppName() {
        return this.f62353a;
    }

    @Nullable
    public String getAppVersion() {
        return this.f62355c;
    }

    @Nullable
    public String getPackageName() {
        return this.f62354b;
    }
}
