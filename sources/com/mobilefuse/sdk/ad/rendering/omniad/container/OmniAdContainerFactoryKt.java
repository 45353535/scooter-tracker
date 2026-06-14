package com.mobilefuse.sdk.ad.rendering.omniad.container;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\f"}, d2 = {"createInAppContainer", "Lcom/mobilefuse/sdk/ad/rendering/omniad/container/InAppContainer;", "activity", "Landroid/app/Activity;", "contentView", "Landroid/view/View;", "scaleAnimationEnabled", "", "createOmniAdContainer", "Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "createWindowContainer", "Lcom/mobilefuse/sdk/ad/rendering/omniad/container/WindowContainer;", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class OmniAdContainerFactoryKt {
    private static final InAppContainer createInAppContainer(Activity activity, View view, boolean z10) {
        return new InAppContainer(activity, view, z10);
    }

    @NotNull
    public static final OmniAdContainer createOmniAdContainer(@NotNull Activity activity, @NotNull View contentView) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        boolean z10 = Build.VERSION.SDK_INT >= 26;
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
        boolean zIsHardwareAccelerated = decorView.isHardwareAccelerated();
        return !z10 ? createInAppContainer(activity, contentView, zIsHardwareAccelerated) : zIsHardwareAccelerated ? createInAppContainer(activity, contentView, true) : createWindowContainer(activity, contentView);
    }

    private static final WindowContainer createWindowContainer(Activity activity, View view) {
        return new WindowContainer(activity, view, null, 4, null);
    }
}
