package yads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ua2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f116591a = CollectionsKt.listOf((Object[]) new String[]{"android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"});

    public static void a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            List mutableList = CollectionsKt.toMutableList((Collection) f116591a);
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                mutableList.removeAll(ArraysKt.toList(strArr));
                if (mutableList.size() <= 0) {
                    return;
                }
                kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
                String str = String.format("Please, check %s permission in AndroidManifest file.", Arrays.copyOf(new Object[]{mutableList}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                throw new fa1(str, str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
