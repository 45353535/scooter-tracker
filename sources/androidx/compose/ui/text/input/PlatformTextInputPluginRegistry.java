package androidx.compose.ui.text.input;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.ExperimentalTextApi;
import com.ironsource.N6;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalTextApi
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H'¢\u0006\u0002\u0010\u0007\u0082\u0001\u0001\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistry;", "", "rememberAdapter", "T", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", N6.L, "Landroidx/compose/ui/text/input/PlatformTextInputPlugin;", "(Landroidx/compose/ui/text/input/PlatformTextInputPlugin;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PlatformTextInputPluginRegistry {
    @Composable
    @NotNull
    <T extends PlatformTextInputAdapter> T rememberAdapter(@NotNull PlatformTextInputPlugin<T> platformTextInputPlugin, @Nullable Composer composer, int i10);
}
