package androidx.compose.ui.res;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.font.Typeface;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\b\u001a\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"cacheLock", "Ljava/lang/Object;", "syncLoadedTypefaces", "", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/Typeface;", "fontResource", "fontFamily", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/font/Typeface;", "fontResourceFromContext", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "a", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FontResources_androidKt {

    @NotNull
    private static final Object cacheLock = new Object();

    @GuardedBy("cacheLock")
    @NotNull
    private static final Map<FontFamily, Typeface> syncLoadedTypefaces = new LinkedHashMap();

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final Typeface fontResource(@NotNull FontFamily fontFamily, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-190831095, i10, -1, "androidx.compose.ui.res.fontResource (FontResources.android.kt:53)");
        }
        Typeface typefaceFontResourceFromContext = fontResourceFromContext((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), fontFamily);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return typefaceFontResourceFromContext;
    }

    private static final Typeface fontResourceFromContext(Context context, FontFamily fontFamily) {
        Typeface typeface;
        if (!(fontFamily instanceof SystemFontFamily) && !(fontFamily instanceof LoadedFontFamily)) {
            return AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
        }
        synchronized (cacheLock) {
            try {
                Map<FontFamily, Typeface> map = syncLoadedTypefaces;
                Typeface typefaceTypeface$default = map.get(fontFamily);
                if (typefaceTypeface$default == null) {
                    typefaceTypeface$default = AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
                    map.put(fontFamily, typefaceTypeface$default);
                }
                typeface = typefaceTypeface$default;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return typeface;
    }
}
