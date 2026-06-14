package com.yandex.div.core.view2.errors;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.R$dimen;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00062\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010)\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/yandex/div/core/view2/errors/DetailsViewGroup;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lkotlin/Function1;", "", "", "errorHandler", "Lkotlin/Function0;", "onCloseAction", "onCopyAction", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "createTopPanel", "()Landroid/widget/LinearLayout;", "createControls", "Landroidx/appcompat/widget/AppCompatTextView;", "createErrorsOutput", "()Landroidx/appcompat/widget/AppCompatTextView;", "configureView", "()V", "", "", "Lcom/yandex/div/core/expression/variables/VariableController;", "controllers", "updateVariables", "(Ljava/util/Map;)V", "Lkotlin/jvm/functions/Function0;", "Lcom/yandex/div/core/view2/errors/VariableMonitor;", "variableMonitor", "Lcom/yandex/div/core/view2/errors/VariableMonitor;", "errorsOutput", "Landroidx/appcompat/widget/AppCompatTextView;", "Lcom/yandex/div/core/view2/errors/VariableMonitorView;", "monitorView", "Lcom/yandex/div/core/view2/errors/VariableMonitorView;", "value", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
final class DetailsViewGroup extends LinearLayout {

    @NotNull
    private final AppCompatTextView errorsOutput;

    @NotNull
    private final VariableMonitorView monitorView;

    @NotNull
    private final Function0<Unit> onCloseAction;

    @NotNull
    private final Function0<Unit> onCopyAction;

    @NotNull
    private final VariableMonitor variableMonitor;

    public DetailsViewGroup(@NotNull Context context, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        super(context);
        this.onCloseAction = function0;
        this.onCopyAction = function02;
        VariableMonitor variableMonitor = new VariableMonitor(function1);
        this.variableMonitor = variableMonitor;
        this.errorsOutput = createErrorsOutput();
        this.monitorView = new VariableMonitorView(context, variableMonitor);
        configureView();
    }

    private final void configureView() {
        int iDpToPx = BaseDivViewExtensionsKt.dpToPx(8, getResources().getDisplayMetrics());
        setPadding(iDpToPx, iDpToPx, iDpToPx, iDpToPx);
        setOrientation(1);
        setBackgroundColor(Color.argb(186, 0, 0, 0));
        setElevation(getResources().getDimension(R$dimen.div_shadow_elevation));
        addView(createTopPanel(), new LinearLayout.LayoutParams(-2, -2));
        addView(this.monitorView, new LinearLayout.LayoutParams(-1, -2));
    }

    private final LinearLayout createControls() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding(0, 0, BaseDivViewExtensionsKt.dpToPx(8, linearLayout.getResources().getDisplayMetrics()), 0);
        linearLayout.setOrientation(1);
        ImageView imageView = new ImageView(linearLayout.getContext());
        imageView.setImageResource(R.drawable.ic_menu_close_clear_cancel);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.div.core.view2.errors.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailsViewGroup.createControls$lambda$5$lambda$2$lambda$1(this.f68137b, view);
            }
        });
        ImageView imageView2 = new ImageView(linearLayout.getContext());
        imageView2.setImageResource(R.drawable.ic_menu_save);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.div.core.view2.errors.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailsViewGroup.createControls$lambda$5$lambda$4$lambda$3(this.f68138b, view);
            }
        });
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(imageView2, new LinearLayout.LayoutParams(-2, -2));
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createControls$lambda$5$lambda$2$lambda$1(DetailsViewGroup detailsViewGroup, View view) {
        detailsViewGroup.onCloseAction.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createControls$lambda$5$lambda$4$lambda$3(DetailsViewGroup detailsViewGroup, View view) {
        detailsViewGroup.onCopyAction.invoke();
    }

    private final AppCompatTextView createErrorsOutput() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setGravity(3);
        return appCompatTextView;
    }

    private final LinearLayout createTopPanel() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(createControls(), new LinearLayout.LayoutParams(BaseDivViewExtensionsKt.dpToPx(32, linearLayout.getResources().getDisplayMetrics()), -2));
        linearLayout.addView(this.errorsOutput, new LinearLayout.LayoutParams(-2, -2));
        return linearLayout;
    }

    public final void setText(@NotNull String str) {
        this.errorsOutput.setText(str);
    }

    public final void updateVariables(@NotNull Map<String, ? extends VariableController> controllers) {
        this.variableMonitor.setControllerMap(controllers);
    }
}
