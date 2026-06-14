package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
class InstallerPackageNameProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32097a;

    InstallerPackageNameProvider() {
    }

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    synchronized String a(Context context) {
        try {
            if (this.f32097a == null) {
                this.f32097a = b(context);
            }
        } finally {
        }
        return "".equals(this.f32097a) ? null : this.f32097a;
    }
}
