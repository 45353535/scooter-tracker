package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\t\u001a/\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusOrder;", "", "focusOrderReceiver", "focusOrder", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FocusOrderModifierKt {
    @NotNull
    public static final Modifier focusOrder(@NotNull Modifier modifier, @NotNull Function1<? super FocusOrder, Unit> focusOrderReceiver) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(focusOrderReceiver, "focusOrderReceiver");
        return FocusPropertiesKt.focusProperties(modifier, new FocusOrderToProperties(focusOrderReceiver));
    }

    @NotNull
    public static final Modifier focusOrder(@NotNull Modifier modifier, @NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        return FocusRequesterModifierKt.focusRequester(modifier, focusRequester);
    }

    @NotNull
    public static final Modifier focusOrder(@NotNull Modifier modifier, @NotNull FocusRequester focusRequester, @NotNull Function1<? super FocusOrder, Unit> focusOrderReceiver) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        Intrinsics.checkNotNullParameter(focusOrderReceiver, "focusOrderReceiver");
        return FocusPropertiesKt.focusProperties(FocusRequesterModifierKt.focusRequester(modifier, focusRequester), new FocusOrderToProperties(focusOrderReceiver));
    }
}
