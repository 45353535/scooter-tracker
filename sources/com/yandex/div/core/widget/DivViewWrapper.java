package com.yandex.div.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material.OutlinedTextFieldKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div.internal.widget.TransientView;
import com.yandex.div.internal.widget.TransientViewMixin;
import k8.l7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p7.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0010J+\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b$\u0010%R$\u0010*\u001a\u00020!2\u0006\u0010&\u001a\u00020!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010#\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/yandex/div/core/widget/DivViewWrapper;", "Lcom/yandex/div/internal/widget/FrameContainerLayout;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderSupports;", "Lcom/yandex/div/internal/widget/TransientView;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "transitionFinished", "(Landroid/view/View;)V", "transitionStarted", "child", FirebaseAnalytics.Param.INDEX, "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Lk8/l7;", OutlinedTextFieldKt.BorderId, "setBorder", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/l7;Landroid/view/View;)V", "", "isTransient", "()Z", "getChild", "()Landroid/view/View;", "value", "getNeedClipping", "setNeedClipping", "(Z)V", "needClipping", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class DivViewWrapper extends FrameContainerLayout implements DivBorderSupports, TransientView {
    private final /* synthetic */ TransientViewMixin $$delegate_0;

    public /* synthetic */ DivViewWrapper(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View child, int index, @Nullable ViewGroup.LayoutParams params) {
        if (getChildCount() != 0) {
            throw new IllegalArgumentException("ViewWrapper can host only one child view");
        }
        super.addView(child, 0, params);
    }

    @Nullable
    public final View getChild() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(0);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorderDrawer getDivBorderDrawer() {
        KeyEvent.Callback child = getChild();
        DivBorderSupports divBorderSupports = child instanceof DivBorderSupports ? (DivBorderSupports) child : null;
        if (divBorderSupports != null) {
            return divBorderSupports.getDivBorderDrawer();
        }
        return null;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        KeyEvent.Callback child = getChild();
        DivBorderSupports divBorderSupports = child instanceof DivBorderSupports ? (DivBorderSupports) child : null;
        if (divBorderSupports != null) {
            return divBorderSupports.getNeedClipping();
        }
        return true;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public /* synthetic */ void invalidateBorder() {
        a.a(this);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public /* synthetic */ void releaseBorderDrawer() {
        a.c(this);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(@NotNull BindingContext bindingContext, @Nullable l7 border, @NotNull View view) {
        KeyEvent.Callback child = getChild();
        DivBorderSupports divBorderSupports = child instanceof DivBorderSupports ? (DivBorderSupports) child : null;
        if (divBorderSupports != null) {
            divBorderSupports.setBorder(bindingContext, border, view);
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z10) {
        KeyEvent.Callback child = getChild();
        DivBorderSupports divBorderSupports = child instanceof DivBorderSupports ? (DivBorderSupports) child : null;
        if (divBorderSupports == null) {
            return;
        }
        divBorderSupports.setNeedClipping(z10);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    public DivViewWrapper(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.$$delegate_0 = new TransientViewMixin();
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setImportantForAccessibility(2);
    }
}
