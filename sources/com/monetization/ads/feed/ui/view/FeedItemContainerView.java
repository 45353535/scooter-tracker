package com.monetization.ads.feed.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/monetization/ads/feed/ui/view/FeedItemContainerView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "alpha", "", "setAlpha", "(F)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FeedItemContainerView extends RelativeLayout {
    public FeedItemContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void setAlpha(float alpha) {
        super.setAlpha(1.0f);
    }
}
