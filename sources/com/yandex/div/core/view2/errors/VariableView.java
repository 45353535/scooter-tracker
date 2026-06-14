package com.yandex.div.core.view2.errors;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.yandex.div.R$drawable;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR.\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\f0\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/yandex/div/core/view2/errors/VariableView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/widget/TextView;", "createCell", "()Landroid/widget/TextView;", "Landroid/widget/EditText;", "createEditableCell", "()Landroid/widget/EditText;", "", "configureCommon", "(Landroid/widget/TextView;)V", "cell", "", "width", "addCell", "(Landroid/widget/TextView;I)V", "nameText", "Landroid/widget/TextView;", "getNameText", "typeText", "getTypeText", "valueText", "Landroid/widget/EditText;", "getValueText", "Lkotlin/Function1;", "", "onEnterAction", "Lkotlin/jvm/functions/Function1;", "getOnEnterAction", "()Lkotlin/jvm/functions/Function1;", "setOnEnterAction", "(Lkotlin/jvm/functions/Function1;)V", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
final class VariableView extends LinearLayout {

    @NotNull
    private final TextView nameText;

    @NotNull
    private Function1<? super String, Unit> onEnterAction;

    @NotNull
    private final TextView typeText;

    @NotNull
    private final EditText valueText;

    public VariableView(@NotNull Context context) {
        super(context);
        TextView textViewCreateCell = createCell();
        this.nameText = textViewCreateCell;
        TextView textViewCreateCell2 = createCell();
        this.typeText = textViewCreateCell2;
        EditText editTextCreateEditableCell = createEditableCell();
        this.valueText = editTextCreateEditableCell;
        this.onEnterAction = new Function1<String, Unit>() { // from class: com.yandex.div.core.view2.errors.VariableView$onEnterAction$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String str) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.f93236a;
            }
        };
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(0);
        addCell(textViewCreateCell, 200);
        addCell(textViewCreateCell2, 60);
        addView(editTextCreateEditableCell, new LinearLayout.LayoutParams(-2, -2, 1.0f));
    }

    private final void addCell(TextView cell, int width) {
        addView(cell, new LinearLayout.LayoutParams(BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(width), getResources().getDisplayMetrics()), -1));
    }

    private final void configureCommon(TextView textView) {
        int iDpToPx = BaseDivViewExtensionsKt.dpToPx(8, textView.getResources().getDisplayMetrics());
        textView.setPadding(iDpToPx, iDpToPx, iDpToPx, iDpToPx);
        textView.setTextColor(-1);
        textView.setBackgroundResource(R$drawable.table_cell_background);
        textView.setHorizontallyScrolling(true);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setMaxLines(1);
    }

    private final TextView createCell() {
        TextView textView = new TextView(getContext());
        configureCommon(textView);
        return textView;
    }

    private final EditText createEditableCell() {
        final EditText editText = new EditText(getContext());
        configureCommon(editText);
        editText.setImeOptions(6);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.yandex.div.core.view2.errors.c
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return VariableView.createEditableCell$lambda$2$lambda$1(this.f68139b, editText, textView, i10, keyEvent);
            }
        });
        return editText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createEditableCell$lambda$2$lambda$1(VariableView variableView, EditText editText, TextView textView, int i10, KeyEvent keyEvent) {
        if ((keyEvent != null && keyEvent.getAction() != 0) || i10 != 6) {
            return false;
        }
        variableView.onEnterAction.invoke(editText.getText().toString());
        return true;
    }

    @NotNull
    public final TextView getNameText() {
        return this.nameText;
    }

    @NotNull
    public final TextView getTypeText() {
        return this.typeText;
    }

    @NotNull
    public final EditText getValueText() {
        return this.valueText;
    }

    public final void setOnEnterAction(@NotNull Function1<? super String, Unit> function1) {
        this.onEnterAction = function1;
    }
}
