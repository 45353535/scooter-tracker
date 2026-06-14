package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.material.OutlinedTextFieldKt;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.view2.BindingContext;
import k8.l7;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p7.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R*\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivBorderSupportsMixin;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderSupports;", "<init>", "()V", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Lk8/l7;", OutlinedTextFieldKt.BorderId, "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "setBorder", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/l7;Landroid/view/View;)V", "borderDrawer", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "", "value", "needClipping", "Z", "getNeedClipping", "()Z", "setNeedClipping", "(Z)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivBorderSupportsMixin implements DivBorderSupports {

    @Nullable
    private DivBorderDrawer borderDrawer;
    private boolean needClipping = true;

    public /* synthetic */ void a(int i10, int i11) {
        a.b(this, i10, i11);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    /* JADX INFO: renamed from: getDivBorderDrawer, reason: from getter */
    public DivBorderDrawer getBorderDrawer() {
        return this.borderDrawer;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.needClipping;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public /* synthetic */ void invalidateBorder() {
        a.a(this);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public /* synthetic */ void releaseBorderDrawer() {
        a.c(this);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(@NotNull BindingContext bindingContext, @Nullable l7 border, @NotNull View view) {
        if (this.borderDrawer == null && border != null) {
            this.borderDrawer = new DivBorderDrawer(bindingContext.getDivView(), view);
        }
        DivBorderDrawer divBorderDrawer = this.borderDrawer;
        if (divBorderDrawer != null) {
            divBorderDrawer.setBorder(border, bindingContext.getExpressionResolver());
        }
        DivBorderDrawer divBorderDrawer2 = this.borderDrawer;
        if (divBorderDrawer2 != null) {
            divBorderDrawer2.setNeedClipping(getNeedClipping());
        }
        if (border == null) {
            view.setElevation(0.0f);
            view.setClipToOutline(false);
            view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            releaseBorderDrawer();
            this.borderDrawer = null;
        }
        view.invalidate();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z10) {
        DivBorderDrawer divBorderDrawer = this.borderDrawer;
        if (divBorderDrawer != null) {
            divBorderDrawer.setNeedClipping(z10);
        }
        this.needClipping = z10;
    }
}
