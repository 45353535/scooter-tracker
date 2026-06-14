package com.yandex.div.core.view2;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import k8.f7;
import k8.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u00020\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u00022\u0006\u0010\u000f\u001a\u00028\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u00022\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J-\u0010\u0019\u001a\u00020\u0012*\u00028\u00022\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u00012\b\u0010\u0018\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010\u0019\u001a\u00020\u0012*\u00028\u00022\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u00012\b\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0019\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/core/view2/DivViewBinder;", "Lk8/y0;", "TData", "Lk8/f7;", "TDataValue", "Landroid/view/View;", "TView", "", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "baseBinder", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;)V", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "div", "Lcom/yandex/div/core/state/DivStatePath;", "path", "", "bindViewInternal", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0;Lcom/yandex/div/core/state/DivStatePath;)V", "bindView", "(Lcom/yandex/div/core/view2/BindingContext;Landroid/view/View;Lk8/y0;)V", "bindingContext", "oldDiv", "bind", "(Landroid/view/View;Lcom/yandex/div/core/view2/BindingContext;Lk8/f7;Lk8/f7;)V", "(Landroid/view/View;Lcom/yandex/div/core/view2/BindingContext;Lk8/f7;Lk8/f7;Lcom/yandex/div/core/state/DivStatePath;)V", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class DivViewBinder<TData extends y0, TDataValue extends f7, TView extends View> {

    @NotNull
    private final DivBaseBinder baseBinder;

    public DivViewBinder(@NotNull DivBaseBinder divBaseBinder) {
        this.baseBinder = divBaseBinder;
    }

    private final void bindViewInternal(BindingContext context, TView view, TData div, DivStatePath path) {
        BindingContext bindingContext;
        TView tview;
        Unit unit;
        f7 f7VarC;
        DivViewBinder<TData, TDataValue, TView> divViewBinder;
        DivStatePath divStatePath;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivHolderView<TData of com.yandex.div.core.view2.DivViewBinder>");
        y0 div2 = ((DivHolderView) view).getDiv();
        if (div == div2) {
            return;
        }
        this.baseBinder.bindView(context, view, div, div2);
        if (path != null) {
            f7 f7VarC2 = div.c();
            Intrinsics.checkNotNull(f7VarC2, "null cannot be cast to non-null type TDataValue of com.yandex.div.core.view2.DivViewBinder.bindViewInternal$lambda$0");
            if (div2 != null) {
                f7VarC = div2.c();
                bindingContext = context;
                tview = view;
                divStatePath = path;
                divViewBinder = this;
            } else {
                f7VarC = null;
                divViewBinder = this;
                bindingContext = context;
                tview = view;
                divStatePath = path;
            }
            divViewBinder.bind(tview, bindingContext, f7VarC2, f7VarC, divStatePath);
            unit = Unit.f93236a;
        } else {
            bindingContext = context;
            tview = view;
            unit = null;
        }
        if (unit == null) {
            f7 f7VarC3 = div.c();
            Intrinsics.checkNotNull(f7VarC3, "null cannot be cast to non-null type TDataValue of com.yandex.div.core.view2.DivViewBinder");
            bind(tview, bindingContext, f7VarC3, div2 != null ? div2.c() : null);
        }
    }

    protected void bind(@NotNull TView tview, @NotNull BindingContext bindingContext, @NotNull TDataValue tdatavalue, @Nullable TDataValue tdatavalue2) {
    }

    public void bindView(@NotNull BindingContext context, @NotNull TView view, @NotNull TData div) {
        bindViewInternal(context, view, div, null);
    }

    protected void bind(@NotNull TView tview, @NotNull BindingContext bindingContext, @NotNull TDataValue tdatavalue, @Nullable TDataValue tdatavalue2, @NotNull DivStatePath divStatePath) {
        bind(tview, bindingContext, tdatavalue, tdatavalue2);
    }

    public void bindView(@NotNull BindingContext context, @NotNull TView view, @NotNull TData div, @NotNull DivStatePath path) {
        bindViewInternal(context, view, div, path);
    }
}
