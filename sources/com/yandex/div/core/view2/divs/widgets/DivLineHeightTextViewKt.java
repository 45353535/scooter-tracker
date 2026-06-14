package com.yandex.div.core.view2.divs.widgets;

import com.yandex.div.core.util.text.DivBackgroundSpan;
import com.yandex.div.core.util.text.DivTextRangesBackgroundHelper;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0000¨\u0006\f"}, d2 = {"hasBackgroundSpan", "", "Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;", "text", "", "backgroundSpan", "Lcom/yandex/div/core/util/text/DivBackgroundSpan;", "start", "", "end", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivLineHeightTextViewKt {
    public static final boolean hasBackgroundSpan(@NotNull DivLineHeightTextView divLineHeightTextView, @NotNull CharSequence charSequence, @NotNull DivBackgroundSpan divBackgroundSpan, int i10, int i11, @NotNull ExpressionResolver expressionResolver) {
        if (divLineHeightTextView.getTextRoundedBgHelper() == null) {
            divLineHeightTextView.setTextRoundedBgHelper$div_release(new DivTextRangesBackgroundHelper(divLineHeightTextView, expressionResolver));
            return false;
        }
        DivTextRangesBackgroundHelper textRoundedBgHelper = divLineHeightTextView.getTextRoundedBgHelper();
        Intrinsics.checkNotNull(textRoundedBgHelper);
        return textRoundedBgHelper.hasSameSpan$div_release(charSequence, divBackgroundSpan, i10, i11);
    }
}
