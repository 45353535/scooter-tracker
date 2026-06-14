package com.yandex.div.core.view2.divs;

import android.view.KeyEvent;
import android.widget.TextView;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import k8.yf;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class DivInputBinder$observeEnterTypeAndActions$callback$1 extends Lambda implements Function1<Object, Unit> {
    final /* synthetic */ BindingContext $bindingContext;
    final /* synthetic */ yf $div;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivInputView $this_observeEnterTypeAndActions;
    final /* synthetic */ DivInputBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivInputBinder$observeEnterTypeAndActions$callback$1(yf yfVar, ExpressionResolver expressionResolver, DivInputView divInputView, DivInputBinder divInputBinder, BindingContext bindingContext) {
        super(1);
        this.$div = yfVar;
        this.$resolver = expressionResolver;
        this.$this_observeEnterTypeAndActions = divInputView;
        this.this$0 = divInputBinder;
        this.$bindingContext = bindingContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$0(DivInputBinder divInputBinder, BindingContext bindingContext, DivInputView divInputView, List list, TextView textView, int i10, KeyEvent keyEvent) {
        if ((i10 & 255) == 0) {
            return false;
        }
        divInputBinder.actionBinder.handleBulkActions$div_release(bindingContext, divInputView, list, "enter");
        return false;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2(obj);
        return Unit.f93236a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Object obj) {
        yf.d dVar = (yf.d) this.$div.f92679l.evaluate(this.$resolver);
        DivInputView divInputView = this.$this_observeEnterTypeAndActions;
        divInputView.setImeOptions(divInputView.getImeOptions() + this.this$0.getImeAction(dVar));
        final List list = this.$div.f92678k;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            this.$this_observeEnterTypeAndActions.setOnEditorActionListener(null);
            return;
        }
        final DivInputView divInputView2 = this.$this_observeEnterTypeAndActions;
        final DivInputBinder divInputBinder = this.this$0;
        final BindingContext bindingContext = this.$bindingContext;
        divInputView2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.yandex.div.core.view2.divs.b
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return DivInputBinder$observeEnterTypeAndActions$callback$1.invoke$lambda$0(divInputBinder, bindingContext, divInputView2, list, textView, i10, keyEvent);
            }
        });
    }
}
