package com.ironsource;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Gf f41012a = new Gf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f41013b = ",";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f41014c = "[";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f41015d = "]";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f41016e = 118;

    private Gf() {
    }

    @NotNull
    public final List<Object> a(@NotNull Object... items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return CollectionsKt.listOf(Arrays.copyOf(items, items.length));
    }

    @NotNull
    public final String b(@NotNull List<? extends Object> methodArgs) {
        Intrinsics.checkNotNullParameter(methodArgs, "methodArgs");
        String str = new String();
        for (Object obj : methodArgs) {
            str = ((Object) (((Object) str) + (obj instanceof List ? f41012a.a((List<?>) obj) : f41012a.a(obj)))) + ",";
        }
        return StringsKt.Q0(str, ",");
    }

    private final String a(List<?> list) {
        Iterator<?> it = list.iterator();
        String str = "[";
        while (it.hasNext()) {
            str = ((Object) str) + f41012a.a(it.next()) + ",";
        }
        return ((Object) StringsKt.Q0(str, ",")) + "]";
    }

    private final String a(Object obj) {
        if (obj instanceof String) {
            return "'" + obj + "'";
        }
        return String.valueOf(obj);
    }

    @NotNull
    public final AdInfo a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(levelPlayAdInfo, "<this>");
        return new AdInfo(new W8(levelPlayAdInfo), null);
    }

    @NotNull
    public final IronSourceError a(@NotNull LevelPlayAdError levelPlayAdError) {
        Intrinsics.checkNotNullParameter(levelPlayAdError, "<this>");
        return new IronSourceError(levelPlayAdError.getErrorCode(), levelPlayAdError.getErrorMessage());
    }

    @NotNull
    public final ViewGroup.LayoutParams a(@Nullable Context context) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        layoutParams.bottomMargin = a(context, 118);
        return layoutParams;
    }

    private final int a(Context context, int i10) {
        Resources resources;
        DisplayMetrics displayMetrics;
        return (int) (i10 * ((context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0.0f : displayMetrics.density));
    }
}
