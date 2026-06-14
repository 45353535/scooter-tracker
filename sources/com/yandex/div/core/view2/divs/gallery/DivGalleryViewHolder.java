package com.yandex.div.core.view2.divs.gallery;

import android.view.View;
import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import com.yandex.div.R$id;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivCollectionViewHolder;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.KLog;
import com.yandex.div.logging.Severity;
import k8.y0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGalleryViewHolder;", "Lcom/yandex/div/core/view2/divs/DivCollectionViewHolder;", "Lcom/yandex/div/core/view2/BindingContext;", "parentContext", "Lcom/yandex/div/core/widget/DivViewWrapper;", "rootView", "Lcom/yandex/div/core/view2/DivBinder;", "divBinder", "Lcom/yandex/div/core/view2/DivViewCreator;", "viewCreator", "<init>", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/widget/DivViewWrapper;Lcom/yandex/div/core/view2/DivBinder;Lcom/yandex/div/core/view2/DivViewCreator;)V", "bindingContext", "Lk8/y0;", "div", "", C4240b4.i.L, "Lcom/yandex/div/core/state/DivStatePath;", "path", "", "bind", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/y0;ILcom/yandex/div/core/state/DivStatePath;)V", "Landroid/view/View;", "childView", "updateWrapperLayoutParams", "(Landroid/view/View;)V", "logReuseError", "()V", "Lcom/yandex/div/core/widget/DivViewWrapper;", "Lcom/yandex/div/core/view2/DivBinder;", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivGalleryViewHolder extends DivCollectionViewHolder {

    @NotNull
    private final DivBinder divBinder;

    @NotNull
    private final DivViewWrapper rootView;

    public DivGalleryViewHolder(@NotNull BindingContext bindingContext, @NotNull DivViewWrapper divViewWrapper, @NotNull DivBinder divBinder, @NotNull DivViewCreator divViewCreator) {
        super(divViewWrapper, bindingContext, divBinder, divViewCreator);
        this.rootView = divViewWrapper;
        this.divBinder = divBinder;
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    public void bind(@NotNull BindingContext bindingContext, @NotNull y0 div, int position, @NotNull DivStatePath path) {
        super.bind(bindingContext, div, position, path);
        this.rootView.setTag(R$id.div_gallery_item_index, Integer.valueOf(position));
        this.divBinder.attachIndicators$div_release();
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    protected void logReuseError() {
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.DEBUG)) {
            kLog.print(3, "DivGalleryViewHolder", "Gallery holder reuse failed");
        }
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    protected void updateWrapperLayoutParams(@NotNull View childView) {
        this.rootView.setLayoutParams(childView.getLayoutParams());
    }
}
