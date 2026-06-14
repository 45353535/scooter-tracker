package com.ironsource;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ig {
    public static final boolean a(@NotNull View view, @NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(rect, "rect");
        return view.isShown() && view.hasWindowFocus() && view.getGlobalVisibleRect(rect);
    }
}
