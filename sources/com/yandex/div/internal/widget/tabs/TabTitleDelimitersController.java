package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000eJ\u001e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/yandex/div/internal/widget/tabs/TabTitleDelimitersController;", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "indicators", "Lcom/yandex/div/internal/widget/tabs/BaseIndicatorTabLayout$OvalIndicators;", "(Landroid/content/Context;Lcom/yandex/div/internal/widget/tabs/BaseIndicatorTabLayout$OvalIndicators;)V", "hasTabDelimiters", "", "getHasTabDelimiters", "()Z", "tabDelimiterBitmap", "Landroid/graphics/Bitmap;", "tabDelimiterHeight", "", "tabDelimiterWidth", "addDelimiters", "", "createDelimiterView", "Landroid/view/View;", "removeDelimiters", "tabAdded", FirebaseAnalytics.Param.INDEX, "tabRemoved", "updateTitleDelimiters", "bitmap", "width", "height", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TabTitleDelimitersController {

    @NotNull
    private final Context context;

    @NotNull
    private final BaseIndicatorTabLayout.OvalIndicators indicators;

    @Nullable
    private Bitmap tabDelimiterBitmap;
    private int tabDelimiterHeight;
    private int tabDelimiterWidth;

    public TabTitleDelimitersController(@NotNull Context context, @NotNull BaseIndicatorTabLayout.OvalIndicators ovalIndicators) {
        this.context = context;
        this.indicators = ovalIndicators;
    }

    private final void addDelimiters() {
        removeDelimiters();
        if (getHasTabDelimiters()) {
            int childCount = this.indicators.getChildCount();
            for (int i10 = 1; i10 < childCount; i10++) {
                this.indicators.addView(createDelimiterView(), (i10 * 2) - 1);
            }
            this.indicators.setContainsDelimiters(true);
        }
    }

    private final View createDelimiterView() {
        ImageView imageView = new ImageView(this.context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.tabDelimiterWidth, this.tabDelimiterHeight);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageBitmap(this.tabDelimiterBitmap);
        return imageView;
    }

    private final boolean getHasTabDelimiters() {
        return this.tabDelimiterBitmap != null;
    }

    private final void removeDelimiters() {
        if (this.indicators.hasDelimiters()) {
            for (int childCount = this.indicators.getChildCount() - 1; childCount > 0; childCount -= 2) {
                this.indicators.removeViewAt(childCount);
            }
        }
        this.indicators.setContainsDelimiters(false);
    }

    public final void tabAdded(int index) {
        if (getHasTabDelimiters() && this.indicators.getChildCount() != 1) {
            if (index == 0) {
                this.indicators.addView(createDelimiterView(), 1);
            } else {
                this.indicators.addView(createDelimiterView(), index);
            }
        }
    }

    public final void tabRemoved(int index) {
        if (getHasTabDelimiters() && this.indicators.getChildCount() != 0) {
            if (index == 0) {
                this.indicators.removeViewAt(0);
            } else {
                this.indicators.removeViewAt(index - 1);
            }
        }
    }

    public final void updateTitleDelimiters(@NotNull Bitmap bitmap, int width, int height) {
        this.tabDelimiterBitmap = bitmap;
        this.tabDelimiterHeight = height;
        this.tabDelimiterWidth = width;
        addDelimiters();
    }
}
