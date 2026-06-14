package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.webkit.WebViewCompat;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55701a;

    public k(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f55701a = context;
    }

    public final Object a() {
        PackageInfo currentWebViewPackage = WebViewCompat.getCurrentWebViewPackage(this.f55701a);
        if (currentWebViewPackage == null) {
            Result.Companion companion = Result.f93230c;
            return Result.b(kotlin.d.a(new Exception("No current WebView package exists")));
        }
        int applicationEnabledSetting = this.f55701a.getPackageManager().getApplicationEnabledSetting(currentWebViewPackage.packageName);
        if (applicationEnabledSetting == 2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(new Exception("WebView component is disabled by system")));
        }
        if (applicationEnabledSetting == 3) {
            Result.Companion companion3 = Result.f93230c;
            return Result.b(kotlin.d.a(new Exception("WebView component is disabled by user")));
        }
        if (applicationEnabledSetting != 4) {
            Result.Companion companion4 = Result.f93230c;
            return Result.b(Unit.f93236a);
        }
        Result.Companion companion5 = Result.f93230c;
        return Result.b(kotlin.d.a(new Exception("WebView component is disabled until used")));
    }
}
