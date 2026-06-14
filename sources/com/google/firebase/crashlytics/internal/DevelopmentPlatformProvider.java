package com.google.firebase.crashlytics.internal;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.mobilefuse.sdk.config.ExternalUsageInfo;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class DevelopmentPlatformProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f31950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DevelopmentPlatform f31951b = null;

    private class DevelopmentPlatform {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f31952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f31953b;

        private DevelopmentPlatform() {
            int resourcesIdentifier = CommonUtils.getResourcesIdentifier(DevelopmentPlatformProvider.this.f31950a, "com.google.firebase.crashlytics.unity_version", TypedValues.Custom.S_STRING);
            if (resourcesIdentifier == 0) {
                if (!DevelopmentPlatformProvider.this.c("flutter_assets/NOTICES.Z")) {
                    this.f31952a = null;
                    this.f31953b = null;
                    return;
                } else {
                    this.f31952a = "Flutter";
                    this.f31953b = null;
                    Logger.getLogger().v("Development platform is: Flutter");
                    return;
                }
            }
            this.f31952a = ExternalUsageInfo.SDK_MODULE_UNITY;
            String string = DevelopmentPlatformProvider.this.f31950a.getResources().getString(resourcesIdentifier);
            this.f31953b = string;
            Logger.getLogger().v("Unity Editor version is: " + string);
        }
    }

    public DevelopmentPlatformProvider(Context context) {
        this.f31950a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.f31950a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f31950a.getAssets().open(str);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private DevelopmentPlatform d() {
        if (this.f31951b == null) {
            this.f31951b = new DevelopmentPlatform();
        }
        return this.f31951b;
    }

    public static boolean isUnity(Context context) {
        return CommonUtils.getResourcesIdentifier(context, "com.google.firebase.crashlytics.unity_version", TypedValues.Custom.S_STRING) != 0;
    }

    @Nullable
    public String getDevelopmentPlatform() {
        return d().f31952a;
    }

    @Nullable
    public String getDevelopmentPlatformVersion() {
        return d().f31953b;
    }
}
