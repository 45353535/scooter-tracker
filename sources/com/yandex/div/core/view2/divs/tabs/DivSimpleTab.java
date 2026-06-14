package com.yandex.div.core.view2.divs.tabs;

import android.util.DisplayMetrics;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.as;
import k8.ep;
import k8.j1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/view2/divs/tabs/DivSimpleTab;", "", "Lk8/as$c;", "Lk8/j1;", "item", "Landroid/util/DisplayMetrics;", "displayMetrics", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "<init>", "(Lk8/as$c;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "", "getTitle", "()Ljava/lang/String;", "getActionable", "()Lk8/j1;", "", "getTabHeight", "()Ljava/lang/Integer;", "getTabHeightLayoutParam", "getItem", "()Lk8/as$c;", "Lk8/as$c;", "Landroid/util/DisplayMetrics;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivSimpleTab implements BaseDivTabbedCardUi.Input.TabBase {

    @NotNull
    private final DisplayMetrics displayMetrics;

    @NotNull
    private final as.c item;

    @NotNull
    private final ExpressionResolver resolver;

    public DivSimpleTab(@NotNull as.c cVar, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        this.item = cVar;
        this.displayMetrics = displayMetrics;
        this.resolver = expressionResolver;
    }

    @NotNull
    public as.c getItem() {
        return this.item;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    @Nullable
    public Integer getTabHeight() {
        ep height = this.item.f86355a.c().getHeight();
        if (height instanceof ep.c) {
            return Integer.valueOf(DivUtilKt.toLayoutParamsSize$default(height, this.displayMetrics, this.resolver, null, 4, null));
        }
        return null;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    @NotNull
    public Integer getTabHeightLayoutParam() {
        return Integer.valueOf(DivUtilKt.toLayoutParamsSize$default(this.item.f86355a.c().getHeight(), this.displayMetrics, this.resolver, null, 4, null));
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    @NotNull
    public String getTitle() {
        return (String) this.item.f86356b.evaluate(this.resolver);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    @Nullable
    public j1 getActionable() {
        return this.item.f86357c;
    }
}
