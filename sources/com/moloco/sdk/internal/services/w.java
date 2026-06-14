package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.pm.PackageInfo;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f55734b;

    public w(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f55733a = context;
    }

    @Override // com.moloco.sdk.internal.services.v
    public u invoke() {
        Object objB;
        u uVar = this.f55734b;
        if (uVar != null) {
            return uVar;
        }
        try {
            Result.Companion companion = Result.f93230c;
            Context context = this.f55733a;
            String string = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
            PackageInfo packageInfoA = x.a(this.f55733a);
            String packageName = packageInfoA.packageName;
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            String versionName = packageInfoA.versionName;
            Intrinsics.checkNotNullExpressionValue(versionName, "versionName");
            u uVar2 = new u(string, packageName, versionName);
            this.f55734b = uVar2;
            objB = Result.b(uVar2);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        u uVar3 = (u) objB;
        return uVar3 == null ? new u("", "", "") : uVar3;
    }
}
