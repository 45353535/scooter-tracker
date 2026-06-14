package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u000eR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/node/CanFocusChecker;", "Landroidx/compose/ui/focus/FocusProperties;", "()V", "value", "", "canFocus", "getCanFocus", "()Z", "setCanFocus", "(Z)V", "canFocusValue", "Ljava/lang/Boolean;", "isCanFocusSet", "reset", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class CanFocusChecker implements FocusProperties {

    @NotNull
    public static final CanFocusChecker INSTANCE = new CanFocusChecker();

    @Nullable
    private static Boolean canFocusValue;

    private CanFocusChecker() {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public boolean getCanFocus() {
        Boolean bool = canFocusValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getDown() {
        return FocusProperties.CC.a(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getEnd() {
        return FocusProperties.CC.b(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ Function1 getEnter() {
        return FocusProperties.CC.c(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ Function1 getExit() {
        return FocusProperties.CC.d(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getLeft() {
        return FocusProperties.CC.e(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getNext() {
        return FocusProperties.CC.f(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getPrevious() {
        return FocusProperties.CC.g(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getRight() {
        return FocusProperties.CC.h(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getStart() {
        return FocusProperties.CC.i(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getUp() {
        return FocusProperties.CC.j(this);
    }

    public final boolean isCanFocusSet() {
        return canFocusValue != null;
    }

    public final void reset() {
        canFocusValue = null;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setCanFocus(boolean z10) {
        canFocusValue = Boolean.valueOf(z10);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setDown(FocusRequester focusRequester) {
        FocusProperties.CC.k(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setEnd(FocusRequester focusRequester) {
        FocusProperties.CC.l(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setEnter(Function1 function1) {
        FocusProperties.CC.m(this, function1);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setExit(Function1 function1) {
        FocusProperties.CC.n(this, function1);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setLeft(FocusRequester focusRequester) {
        FocusProperties.CC.o(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setNext(FocusRequester focusRequester) {
        FocusProperties.CC.p(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setPrevious(FocusRequester focusRequester) {
        FocusProperties.CC.q(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setRight(FocusRequester focusRequester) {
        FocusProperties.CC.r(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setStart(FocusRequester focusRequester) {
        FocusProperties.CC.s(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setUp(FocusRequester focusRequester) {
        FocusProperties.CC.t(this, focusRequester);
    }
}
