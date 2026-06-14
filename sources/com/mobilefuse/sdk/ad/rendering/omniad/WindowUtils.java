package com.mobilefuse.sdk.ad.rendering.omniad;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"getWindowRect", "Landroid/graphics/Rect;", "activity", "Landroid/app/Activity;", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class WindowUtils {
    @NotNull
    public static final Rect getWindowRect(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
        View contentView = decorView.findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(contentView, "contentView");
        Object parent = contentView.getParent();
        if (parent == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        Rect rect = new Rect();
        ((View) parent).getGlobalVisibleRect(rect);
        return rect;
    }
}
