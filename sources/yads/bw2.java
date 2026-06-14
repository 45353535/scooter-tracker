package yads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.UserManager;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bw2 {
    public static SharedPreferences a(bw2 bw2Var, Context context, String str) {
        Object objB;
        bw2Var.getClass();
        try {
            Result.Companion companion = Result.f93230c;
            Object systemService = context.getSystemService("user");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.UserManager");
            objB = Result.b(Boolean.valueOf(((UserManager) systemService).isUserUnlocked()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Boolean bool = Boolean.TRUE;
        if (Result.i(objB)) {
            objB = bool;
        }
        return (((Boolean) objB).booleanValue() || Build.VERSION.SDK_INT < 24) ? context.getSharedPreferences(str, 0) : context.createDeviceProtectedStorageContext().getSharedPreferences(str, 0);
    }
}
