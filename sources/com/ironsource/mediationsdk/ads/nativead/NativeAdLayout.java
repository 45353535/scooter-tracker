package com.ironsource.mediationsdk.ads.nativead;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class NativeAdLayout extends FrameLayout implements NativeAdViewBinderInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final NativeAdViewHolder f43779a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43779a = new NativeAdViewHolder();
    }

    private final void a(ViewGroup viewGroup, List<? extends View> list) {
        Iterator<? extends View> it = list.iterator();
        while (it.hasNext()) {
            viewGroup.addView(it.next());
        }
    }

    public final void registerNativeAdViews(@NotNull LevelPlayNativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        List<View> listA = a(this);
        removeAllViews();
        FrameLayout frameLayout = new FrameLayout(getContext());
        a(frameLayout, listA);
        AdapterNativeAdViewBinder nativeAdViewBinder = nativeAd.getNativeAdViewBinder();
        if (nativeAdViewBinder != null) {
            nativeAdViewBinder.setBodyView(this.f43779a.getBodyView());
            nativeAdViewBinder.setMediaView(this.f43779a.getMediaView());
            nativeAdViewBinder.setCallToActionView(this.f43779a.getCallToActionView());
            nativeAdViewBinder.setTitleView(this.f43779a.getTitleView());
            nativeAdViewBinder.setIconView(this.f43779a.getIconView());
            nativeAdViewBinder.setAdvertiserView(this.f43779a.getAdvertiserView());
            nativeAdViewBinder.setNativeAdView(frameLayout);
            addView(nativeAdViewBinder.getNetworkNativeAdView());
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setAdvertiserView(@Nullable View view) {
        this.f43779a.setAdvertiserView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setBodyView(@Nullable View view) {
        this.f43779a.setBodyView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setCallToActionView(@Nullable View view) {
        this.f43779a.setCallToActionView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setIconView(@Nullable View view) {
        this.f43779a.setIconView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setMediaView(@Nullable LevelPlayMediaView levelPlayMediaView) {
        this.f43779a.setMediaView(levelPlayMediaView);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setTitleView(@Nullable View view) {
        this.f43779a.setTitleView(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43779a = new NativeAdViewHolder();
    }

    private final List<View> a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View child = viewGroup.getChildAt(i10);
            Intrinsics.checkNotNullExpressionValue(child, "child");
            arrayList.add(child);
        }
        return arrayList;
    }
}
