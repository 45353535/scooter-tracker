package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: loaded from: classes12.dex */
public abstract class T5 extends BaseRequestConfig.ComponentLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SafePackageManager f76485a;

    public T5(@NonNull Context context, @NonNull String str) {
        this(context, str, new SafePackageManager());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* JADX INFO: renamed from: a */
    public U5 load(@NonNull S5 s52) {
        U5 u52 = (U5) super.load(s52);
        String packageName = getContext().getPackageName();
        ApplicationInfo applicationInfo = this.f76485a.getApplicationInfo(getContext(), getPackageName(), 0);
        if (applicationInfo != null) {
            int i10 = applicationInfo.flags;
            u52.f76556a = (i10 & 2) != 0 ? "1" : "0";
            u52.f76557b = (i10 & 1) == 0 ? "0" : "1";
        } else if (TextUtils.equals(packageName, getPackageName())) {
            u52.f76556a = (getContext().getApplicationInfo().flags & 2) != 0 ? "1" : "0";
            u52.f76557b = (getContext().getApplicationInfo().flags & 1) == 0 ? "0" : "1";
        } else {
            u52.f76556a = "0";
            u52.f76557b = "0";
        }
        C5204jm c5204jm = s52.f76392a;
        u52.f76558c = c5204jm;
        u52.setRetryPolicyConfig(c5204jm.f77559t);
        return u52;
    }

    public T5(@NonNull Context context, @NonNull String str, @NonNull SafePackageManager safePackageManager) {
        super(context, str);
        this.f76485a = safePackageManager;
    }
}
