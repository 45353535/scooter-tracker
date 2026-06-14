package com.monetization.ads.nativeads.view.pager;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.mobile.ads.R$id;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.el0;
import yads.lv1;
import yads.ni0;
import yads.wf0;
import zf.a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/monetization/ads/nativeads/view/pager/MultiBannerControlsContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnClickLeftButtonListener", "(Landroid/view/View$OnClickListener;)V", "setOnClickRightButtonListener", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public final class MultiBannerControlsContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ni0 f59057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el0 f59058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f59059c;

    public MultiBannerControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59057a = new ni0();
        this.f59058b = new el0();
        this.f59059c = true;
    }

    public final void setOnClickLeftButtonListener(@NotNull View.OnClickListener listener) {
        View viewFindViewById = findViewById(R$id.left_scroll_control_button);
        ImageView imageView = viewFindViewById instanceof ImageView ? (ImageView) viewFindViewById : null;
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    public final void setOnClickRightButtonListener(@NotNull View.OnClickListener listener) {
        View viewFindViewById = findViewById(R$id.right_scroll_control_button);
        ImageView imageView = viewFindViewById instanceof ImageView ? (ImageView) viewFindViewById : null;
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    public final void a(ViewPager2 viewPager2) {
        viewPager2.registerOnPageChangeCallback(new lv1(viewPager2, this));
        viewPager2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: j5.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                MultiBannerControlsContainer.a(this.f85511b, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MultiBannerControlsContainer multiBannerControlsContainer, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (view instanceof ViewPager2) {
            boolean z10 = multiBannerControlsContainer.f59059c;
            el0 el0Var = multiBannerControlsContainer.f59058b;
            int i18 = i12 - i10;
            int i19 = i13 - i11;
            wf0 wf0Var = el0Var.f110408a;
            Context context = view.getContext();
            wf0Var.getClass();
            int iA = wf0.a(context, 144.0f);
            wf0 wf0Var2 = el0Var.f110408a;
            Context context2 = view.getContext();
            wf0Var2.getClass();
            boolean z11 = i18 >= iA && i19 >= wf0.a(context2, 96.0f);
            multiBannerControlsContainer.f59059c = z11;
            if (z11 != z10) {
                ViewPager2 viewPager2 = (ViewPager2) view;
                int currentItem = viewPager2.getCurrentItem();
                RecyclerView.Adapter adapter = viewPager2.getAdapter();
                multiBannerControlsContainer.a(currentItem, adapter != null ? adapter.getItemCount() : 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i10, int i11) {
        boolean z10 = true;
        View viewFindViewById = findViewById(R$id.left_scroll_control_button);
        ImageView imageView = viewFindViewById instanceof ImageView ? (ImageView) viewFindViewById : null;
        View viewFindViewById2 = findViewById(R$id.right_scroll_control_button);
        ImageView imageView2 = viewFindViewById2 instanceof ImageView ? (ImageView) viewFindViewById2 : null;
        int i12 = R$id.dot_indicator;
        View viewFindViewById3 = findViewById(i12);
        ImageView imageView3 = viewFindViewById3 instanceof ImageView ? (ImageView) viewFindViewById3 : null;
        if (!this.f59059c) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            if (imageView3 == null) {
                return;
            }
            imageView3.setVisibility(8);
            return;
        }
        View viewFindViewById4 = findViewById(i12);
        ImageView imageView4 = viewFindViewById4 instanceof ImageView ? (ImageView) viewFindViewById4 : null;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
            ni0 ni0Var = this.f59057a;
            Context context = getContext();
            ni0Var.f113918a.getClass();
            int iA = wf0.a(context, 6.0f);
            ni0Var.f113918a.getClass();
            int iD = a.d(TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics()));
            ni0Var.f113918a.getClass();
            int iD2 = a.d(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
            ni0Var.f113918a.getClass();
            int iD3 = a.d(TypedValue.applyDimension(1, 12.0f, context.getResources().getDisplayMetrics()));
            int i13 = ((i11 + 1) * iD) + (iA * i11);
            float f10 = iD3;
            RectF rectF = new RectF(0.0f, 0.0f, i13, f10);
            float[] fArr = new float[8];
            for (int i14 = 0; i14 < 8; i14++) {
                fArr[i14] = f10;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, rectF, null));
            shapeDrawable.setIntrinsicWidth(i13);
            shapeDrawable.setIntrinsicHeight(iD3);
            shapeDrawable.getPaint().setColor(ViewCompat.MEASURED_STATE_MASK);
            shapeDrawable.setAlpha(102);
            ShapeDrawable[] shapeDrawableArr = new ShapeDrawable[i11];
            int i15 = 0;
            while (i15 < i11) {
                boolean z11 = z10;
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.setIntrinsicHeight(iA);
                shapeDrawable2.setIntrinsicWidth(iA);
                shapeDrawable2.getPaint().setColor(-1);
                if (i15 != i10) {
                    shapeDrawable2.setAlpha(102);
                }
                Unit unit = Unit.f93236a;
                shapeDrawableArr[i15] = shapeDrawable2;
                i15++;
                z10 = z11;
            }
            z0 z0Var = new z0(2);
            z0Var.a(shapeDrawable);
            z0Var.b(shapeDrawableArr);
            LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) z0Var.d(new ShapeDrawable[z0Var.c()]));
            int i16 = 0;
            while (i16 < i11) {
                int i17 = iD + iA;
                int i18 = i16 + 1;
                layerDrawable.setLayerInset(i18, (i17 * i16) + iD, iD2, i13 - (i17 * i18), iD2);
                i16 = i18;
            }
            imageView4.setImageDrawable(layerDrawable);
        }
        View viewFindViewById5 = findViewById(R$id.left_scroll_control_button);
        ImageView imageView5 = viewFindViewById5 instanceof ImageView ? (ImageView) viewFindViewById5 : null;
        View viewFindViewById6 = findViewById(R$id.right_scroll_control_button);
        ImageView imageView6 = viewFindViewById6 instanceof ImageView ? (ImageView) viewFindViewById6 : null;
        if (imageView5 == null || imageView6 == null) {
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            if (imageView6 == null) {
                return;
            }
            imageView6.setVisibility(8);
            return;
        }
        if (i10 == 0) {
            imageView5.setVisibility(8);
            imageView6.setVisibility(0);
        } else if (i10 == i11 - 1) {
            imageView5.setVisibility(0);
            imageView6.setVisibility(8);
        } else {
            imageView5.setVisibility(0);
            imageView6.setVisibility(0);
        }
    }
}
