package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import androidx.collection.LruCache;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.AndroidPreloadedFont;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.core.content.res.ResourcesCompat;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTypefaceCache;", "", "()V", Reporting.EventType.CACHE, "Landroidx/collection/LruCache;", "", "Landroid/graphics/Typeface;", "getKey", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "font", "Landroidx/compose/ui/text/font/Font;", "getOrCreate", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidTypefaceCache {

    @NotNull
    public static final AndroidTypefaceCache INSTANCE = new AndroidTypefaceCache();

    @NotNull
    private static final LruCache<String, Typeface> cache = new LruCache<>(16);

    private AndroidTypefaceCache() {
    }

    @Nullable
    public final String getKey(@NotNull Context context, @NotNull Font font) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(font, "font");
        if (!(font instanceof ResourceFont)) {
            if (font instanceof AndroidPreloadedFont) {
                return ((AndroidPreloadedFont) font).getCacheKey();
            }
            throw new IllegalArgumentException("Unknown font type: " + font);
        }
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(((ResourceFont) font).getResId(), typedValue, true);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("res:");
        CharSequence charSequence = typedValue.string;
        String string = charSequence != null ? charSequence.toString() : null;
        Intrinsics.checkNotNull(string);
        sb2.append(string);
        return sb2.toString();
    }

    @NotNull
    public final Typeface getOrCreate(@NotNull Context context, @NotNull Font font) {
        Typeface typefaceLoadBlocking;
        Typeface it;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(font, "font");
        String key = getKey(context, font);
        if (key != null && (it = cache.get(key)) != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            return it;
        }
        if (font instanceof ResourceFont) {
            if (Build.VERSION.SDK_INT >= 26) {
                typefaceLoadBlocking = AndroidResourceFontLoaderHelper.INSTANCE.create(context, ((ResourceFont) font).getResId());
            } else {
                typefaceLoadBlocking = ResourcesCompat.getFont(context, ((ResourceFont) font).getResId());
                Intrinsics.checkNotNull(typefaceLoadBlocking);
                Intrinsics.checkNotNullExpressionValue(typefaceLoadBlocking, "{\n                    Re…esId)!!\n                }");
            }
        } else {
            if (!(font instanceof AndroidFont)) {
                throw new IllegalArgumentException("Unknown font type: " + font);
            }
            AndroidFont androidFont = (AndroidFont) font;
            typefaceLoadBlocking = androidFont.getTypefaceLoader().loadBlocking(context, androidFont);
        }
        if (typefaceLoadBlocking != null) {
            if (key != null) {
                cache.put(key, typefaceLoadBlocking);
            }
            return typefaceLoadBlocking;
        }
        throw new IllegalArgumentException("Unable to load font " + font);
    }
}
