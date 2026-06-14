package com.mobilefuse.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a<\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¨\u0006\n"}, d2 = {"startActivityFromUrl", "", "Landroid/content/Context;", "url", "", "successCallback", "Lkotlin/Function0;", "errorCallback", "Lkotlin/Function1;", "", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class StartActivityFromUrlKt {
    public static final void startActivityFromUrl(@NotNull Context startActivityFromUrl, @NotNull String url, @Nullable Function0<Unit> function0, @Nullable Function1<? super Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(startActivityFromUrl, "$this$startActivityFromUrl");
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            intent.addFlags(268435456);
            startActivityFromUrl.startActivity(intent);
            if (function0 != null) {
                function0.invoke();
            }
        } catch (Throwable th2) {
            if (function1 != null) {
                function1.invoke(th2);
            }
        }
    }

    public static /* synthetic */ void startActivityFromUrl$default(Context context, String str, Function0 function0, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        startActivityFromUrl(context, str, function0, function1);
    }
}
