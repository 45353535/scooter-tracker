package com.monetization.ads.nativeads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.R$styleable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.at2;
import yads.dt2;
import yads.j20;
import yads.kx2;
import yads.pg3;
import yads.qg3;
import yads.zj;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0016B#\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$B\u0011\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b#\u0010%B\u001b\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b#\u0010&R*\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@DX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\u0004\u0010\bR$\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R$\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007R(\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006'"}, d2 = {"Lcom/monetization/ads/nativeads/CustomizableMediaView;", "Landroid/widget/FrameLayout;", "", "<set-?>", "a", "I", "getVideoControlsLayoutId", "()I", "(I)V", "videoControlsLayoutId", "b", "getWidthMeasureSpec", "widthMeasureSpec", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getHeightMeasureSpec", "heightMeasureSpec", "Lyads/pg3;", "d", "Lyads/pg3;", "getVideoScaleType", "()Lyads/pg3;", "videoScaleType", "Lyads/j20;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lyads/j20;", "getOnSizeChangedListener$mobileads_externalRelease", "()Lyads/j20;", "setOnSizeChangedListener$mobileads_externalRelease", "(Lyads/j20;)V", "onSizeChangedListener", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attributeSet", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public class CustomizableMediaView extends FrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f59051f = R$layout.monetization_ads_internal_outstream_controls_default;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int videoControlsLayoutId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int widthMeasureSpec;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int heightMeasureSpec;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final pg3 videoScaleType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private j20 onSizeChangedListener;

    @SuppressLint({"CustomViewStyleable"})
    public CustomizableMediaView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalMediaView);
            this.videoControlsLayoutId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MonetizationAdsInternalMediaView_monetization_internal_video_controls_layout, f59051f);
            this.videoScaleType = qg3.a(typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.videoControlsLayoutId = f59051f;
            this.videoScaleType = null;
        }
        addOnAttachStateChangeListener(new zj(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: i5.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                CustomizableMediaView.a(this.f73968b);
            }
        }));
    }

    protected final void a(int i10) {
        this.videoControlsLayoutId = i10;
    }

    public final int getHeightMeasureSpec() {
        return this.heightMeasureSpec;
    }

    @Nullable
    /* JADX INFO: renamed from: getOnSizeChangedListener$mobileads_externalRelease, reason: from getter */
    public final j20 getOnSizeChangedListener() {
        return this.onSizeChangedListener;
    }

    public final int getVideoControlsLayoutId() {
        return this.videoControlsLayoutId;
    }

    @Nullable
    public final pg3 getVideoScaleType() {
        return this.videoScaleType;
    }

    public final int getWidthMeasureSpec() {
        return this.widthMeasureSpec;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.widthMeasureSpec = i10;
        this.heightMeasureSpec = i11;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i10, int i11, int i12, int i13) {
        dt2 dt2Var;
        super.onSizeChanged(i10, i11, i12, i13);
        j20 j20Var = this.onSizeChangedListener;
        if (j20Var == null || (dt2Var = (dt2) ((at2) j20Var).f108804a.get()) == null) {
            return;
        }
        kx2 kx2Var = dt2Var.f110057f;
        if (i10 < kx2Var.f112887b || i11 < kx2Var.f112888c) {
            dt2Var.f110060i.setValue(dt2Var, dt2.f110054j[2], dt2Var.f110056e);
        }
    }

    public final void setOnSizeChangedListener$mobileads_externalRelease(@Nullable j20 j20Var) {
        this.onSizeChangedListener = j20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CustomizableMediaView customizableMediaView) {
        j20 j20Var = customizableMediaView.onSizeChangedListener;
        if (j20Var != null) {
            int width = customizableMediaView.getWidth();
            int height = customizableMediaView.getHeight();
            dt2 dt2Var = (dt2) ((at2) j20Var).f108804a.get();
            if (dt2Var != null) {
                kx2 kx2Var = dt2Var.f110057f;
                if (width < kx2Var.f112887b || height < kx2Var.f112888c) {
                    dt2Var.f110060i.setValue(dt2Var, dt2.f110054j[2], dt2Var.f110056e);
                }
            }
        }
    }

    public CustomizableMediaView(@NotNull Context context) {
        this(context, null);
    }

    public CustomizableMediaView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
