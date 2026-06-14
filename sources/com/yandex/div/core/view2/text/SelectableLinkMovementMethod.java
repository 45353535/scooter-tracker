package com.yandex.div.core.view2.text;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.ArrowKeyMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/yandex/div/core/view2/text/SelectableLinkMovementMethod;", "Landroid/text/method/MovementMethod;", "Landroid/text/method/ArrowKeyMovementMethod;", "()V", "onTouchEvent", "", "widget", "Landroid/widget/TextView;", "buffer", "Landroid/text/Spannable;", "event", "Landroid/view/MotionEvent;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SelectableLinkMovementMethod extends ArrowKeyMovementMethod implements MovementMethod {

    @NotNull
    public static final SelectableLinkMovementMethod INSTANCE = new SelectableLinkMovementMethod();

    private SelectableLinkMovementMethod() {
    }

    @Override // android.text.method.ArrowKeyMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(@NotNull TextView widget, @NotNull Spannable buffer, @NotNull MotionEvent event) {
        int action = event.getAction();
        if (action == 0 || action == 1) {
            int x10 = (((int) event.getX()) - widget.getTotalPaddingLeft()) + widget.getScrollX();
            int y10 = (((int) event.getY()) - widget.getTotalPaddingTop()) + widget.getScrollY();
            Layout layout = widget.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y10), x10);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) buffer.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (!(clickableSpanArr.length == 0)) {
                super.onTouchEvent(widget, buffer, event);
                if (action == 1) {
                    for (ClickableSpan clickableSpan : clickableSpanArr) {
                        clickableSpan.onClick(widget);
                    }
                }
                return true;
            }
        }
        return super.onTouchEvent(widget, buffer, event);
    }
}
