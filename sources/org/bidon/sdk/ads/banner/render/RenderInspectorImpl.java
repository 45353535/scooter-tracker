package org.bidon.sdk.ads.banner.render;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.ads.banner.render.AdRenderer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lorg/bidon/sdk/ads/banner/render/RenderInspectorImpl;", "Lorg/bidon/sdk/ads/banner/render/AdRenderer$RenderInspector;", "<init>", "()V", "isRenderPermitted", "", "isActivityValid", "activity", "Landroid/app/Activity;", "isViewVisibleOnScreen", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RenderInspectorImpl implements AdRenderer.RenderInspector {
    @Override // org.bidon.sdk.ads.banner.render.AdRenderer.RenderInspector
    public boolean isActivityValid(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    @Override // org.bidon.sdk.ads.banner.render.AdRenderer.RenderInspector
    public boolean isRenderPermitted() {
        return true;
    }

    @Override // org.bidon.sdk.ads.banner.render.AdRenderer.RenderInspector
    public boolean isViewVisibleOnScreen(@Nullable View view) {
        if (view == null || !view.isShown()) {
            return false;
        }
        Rect rect = new Rect();
        return view.getGlobalVisibleRect(rect) && Rect.intersects(rect, new Rect(0, 0, Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels));
    }
}
