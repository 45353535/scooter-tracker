package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4399kb extends FrameLayout implements NativeAdViewBinderInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final NativeAdViewHolder f43467a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4399kb(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43467a = new NativeAdViewHolder();
    }

    public final void a(@NotNull C4349hb nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        List<View> listA = a(this);
        removeAllViews();
        FrameLayout frameLayout = new FrameLayout(getContext());
        a(frameLayout, listA);
        AdapterNativeAdViewBinder adapterNativeAdViewBinderF = nativeAd.f();
        if (adapterNativeAdViewBinderF != null) {
            adapterNativeAdViewBinderF.setBodyView(this.f43467a.getBodyView());
            adapterNativeAdViewBinderF.setMediaView(this.f43467a.getMediaView());
            adapterNativeAdViewBinderF.setCallToActionView(this.f43467a.getCallToActionView());
            adapterNativeAdViewBinderF.setTitleView(this.f43467a.getTitleView());
            adapterNativeAdViewBinderF.setIconView(this.f43467a.getIconView());
            adapterNativeAdViewBinderF.setAdvertiserView(this.f43467a.getAdvertiserView());
            adapterNativeAdViewBinderF.setNativeAdView(frameLayout);
            addView(adapterNativeAdViewBinderF.getNetworkNativeAdView());
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setAdvertiserView(@Nullable View view) {
        this.f43467a.setAdvertiserView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setBodyView(@Nullable View view) {
        this.f43467a.setBodyView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setCallToActionView(@Nullable View view) {
        this.f43467a.setCallToActionView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setIconView(@Nullable View view) {
        this.f43467a.setIconView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setMediaView(@Nullable LevelPlayMediaView levelPlayMediaView) {
        this.f43467a.setMediaView(levelPlayMediaView);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setTitleView(@Nullable View view) {
        this.f43467a.setTitleView(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4399kb(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43467a = new NativeAdViewHolder();
    }

    private final void a(ViewGroup viewGroup, List<? extends View> list) {
        Iterator<? extends View> it = list.iterator();
        while (it.hasNext()) {
            viewGroup.addView(it.next());
        }
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
