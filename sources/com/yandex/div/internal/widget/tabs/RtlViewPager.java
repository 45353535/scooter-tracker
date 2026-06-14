package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.util.ViewsKt;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R2\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u00060\nR\u00020\u00000\bj\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u00060\nR\u00020\u0000`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/internal/widget/tabs/RtlViewPager;", "Landroidx/viewpager/widget/ViewPager;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "pageChangeListeners", "Ljava/util/HashMap;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "Lcom/yandex/div/internal/widget/tabs/RtlViewPager$ReversingOnPageChangeListener;", "Lkotlin/collections/HashMap;", "addOnPageChangeListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "clearOnPageChangeListeners", "getCurrentItem", "", "removeOnPageChangeListener", "setCurrentItem", C4240b4.i.L, "smoothScroll", "", "ReversingOnPageChangeListener", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class RtlViewPager extends ViewPager {

    @NotNull
    private final HashMap<ViewPager.OnPageChangeListener, ReversingOnPageChangeListener> pageChangeListeners;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/internal/widget/tabs/RtlViewPager$ReversingOnPageChangeListener;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Lcom/yandex/div/internal/widget/tabs/RtlViewPager;Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", POBCTAOverlayData.KEY_CTA_POS, "posOffset", "", "posOffsetPixels", "onPageSelected", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ReversingOnPageChangeListener implements ViewPager.OnPageChangeListener {

        @NotNull
        private final ViewPager.OnPageChangeListener listener;

        public ReversingOnPageChangeListener(@NotNull ViewPager.OnPageChangeListener onPageChangeListener) {
            this.listener = onPageChangeListener;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int state) {
            this.listener.onPageScrollStateChanged(state);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int pos, float posOffset, int posOffsetPixels) {
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (ViewsKt.isLayoutRtl(RtlViewPager.this) && adapter != null) {
                int count = adapter.getCount();
                int width = ((int) (RtlViewPager.this.getWidth() * (1 - adapter.getPageWidth(pos)))) + posOffsetPixels;
                while (pos < count && width > 0) {
                    pos++;
                    width -= (int) (RtlViewPager.this.getWidth() * adapter.getPageWidth(pos));
                }
                pos = (count - pos) - 1;
                posOffsetPixels = -width;
                posOffset = posOffsetPixels / (RtlViewPager.this.getWidth() * adapter.getPageWidth(pos));
            }
            this.listener.onPageScrolled(pos, posOffset, posOffsetPixels);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int pos) {
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (ViewsKt.isLayoutRtl(RtlViewPager.this) && adapter != null) {
                pos = (adapter.getCount() - pos) - 1;
            }
            this.listener.onPageSelected(pos);
        }
    }

    public RtlViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.pageChangeListeners = new HashMap<>();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(@NotNull ViewPager.OnPageChangeListener listener) {
        ReversingOnPageChangeListener reversingOnPageChangeListener = new ReversingOnPageChangeListener(listener);
        this.pageChangeListeners.put(listener, reversingOnPageChangeListener);
        super.addOnPageChangeListener(reversingOnPageChangeListener);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.pageChangeListeners.clear();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        return (super.getAdapter() == null || !ViewsKt.isLayoutRtl(this)) ? currentItem : (r1.getCount() - currentItem) - 1;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(@NotNull ViewPager.OnPageChangeListener listener) {
        ReversingOnPageChangeListener reversingOnPageChangeListenerRemove = this.pageChangeListeners.remove(listener);
        if (reversingOnPageChangeListenerRemove != null) {
            super.removeOnPageChangeListener(reversingOnPageChangeListenerRemove);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int position, boolean smoothScroll) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && ViewsKt.isLayoutRtl(this)) {
            position = (adapter.getCount() - position) - 1;
        }
        super.setCurrentItem(position, smoothScroll);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int position) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && ViewsKt.isLayoutRtl(this)) {
            position = (adapter.getCount() - position) - 1;
        }
        super.setCurrentItem(position);
    }
}
