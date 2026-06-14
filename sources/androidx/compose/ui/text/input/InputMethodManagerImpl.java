package androidx.compose.ui.text.input;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import com.ironsource.N6;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf.i;
import lf.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J(\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/input/InputMethodManagerImpl;", "Landroidx/compose/ui/text/input/InputMethodManager;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "(Landroid/view/View;)V", "helper", "Landroidx/compose/ui/text/input/ImmHelper;", N6.f41404n, "Landroid/view/inputmethod/InputMethodManager;", "getImm", "()Landroid/view/inputmethod/InputMethodManager;", "imm$delegate", "Lkotlin/Lazy;", "hideSoftInput", "", "restartInput", "showSoftInput", "updateExtractedText", "token", "", "extractedText", "Landroid/view/inputmethod/ExtractedText;", "updateSelection", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InputMethodManagerImpl implements InputMethodManager {

    @NotNull
    private final ImmHelper helper;

    /* JADX INFO: renamed from: imm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy imm;

    @NotNull
    private final View view;

    public InputMethodManagerImpl(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.imm = i.b(l.f94211d, new Function0<android.view.inputmethod.InputMethodManager>() { // from class: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final android.view.inputmethod.InputMethodManager invoke() {
                Object systemService = this.this$0.view.getContext().getSystemService("input_method");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (android.view.inputmethod.InputMethodManager) systemService;
            }
        });
        this.helper = Build.VERSION.SDK_INT < 30 ? new ImmHelper21(view) : new ImmHelper30(view);
    }

    private final android.view.inputmethod.InputMethodManager getImm() {
        return (android.view.inputmethod.InputMethodManager) this.imm.getValue();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void hideSoftInput() {
        this.helper.hideSoftInput(getImm());
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void restartInput() {
        getImm().restartInput(this.view);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void showSoftInput() {
        this.helper.showSoftInput(getImm());
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void updateExtractedText(int token, @NotNull ExtractedText extractedText) {
        Intrinsics.checkNotNullParameter(extractedText, "extractedText");
        getImm().updateExtractedText(this.view, token, extractedText);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void updateSelection(int selectionStart, int selectionEnd, int compositionStart, int compositionEnd) {
        getImm().updateSelection(this.view, selectionStart, selectionEnd, compositionStart, compositionEnd);
    }
}
