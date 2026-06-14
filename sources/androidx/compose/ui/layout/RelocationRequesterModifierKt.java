package androidx.compose.ui.layout;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"relocationRequester", "Landroidx/compose/ui/Modifier;", "", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RelocationRequesterModifierKt {
    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier relocationRequester(@NotNull Modifier modifier, @NotNull Object relocationRequester) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(relocationRequester, "relocationRequester");
        return modifier;
    }
}
