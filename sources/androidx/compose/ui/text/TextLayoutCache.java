package androidx.compose.ui.text;

import androidx.compose.ui.text.caches.LruCache;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/TextLayoutCache;", "", "capacity", "", "(I)V", "lruCache", "Landroidx/compose/ui/text/caches/LruCache;", "Landroidx/compose/ui/text/CacheTextLayoutInput;", "Landroidx/compose/ui/text/TextLayoutResult;", "get", C4240b4.i.W, "Landroidx/compose/ui/text/TextLayoutInput;", "put", "value", "remove", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextLayoutCache {

    @NotNull
    private final LruCache<CacheTextLayoutInput, TextLayoutResult> lruCache;

    public TextLayoutCache() {
        this(0, 1, null);
    }

    @Nullable
    public final TextLayoutResult get(@NotNull TextLayoutInput key) {
        Intrinsics.checkNotNullParameter(key, "key");
        TextLayoutResult textLayoutResult = this.lruCache.get(new CacheTextLayoutInput(key));
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
            return null;
        }
        return textLayoutResult;
    }

    @Nullable
    public final TextLayoutResult put(@NotNull TextLayoutInput key, @NotNull TextLayoutResult value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.lruCache.put(new CacheTextLayoutInput(key), value);
    }

    @Nullable
    public final TextLayoutResult remove(@NotNull TextLayoutInput key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.lruCache.remove(new CacheTextLayoutInput(key));
    }

    public TextLayoutCache(int i10) {
        this.lruCache = new LruCache<>(i10);
    }

    public /* synthetic */ TextLayoutCache(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? TextMeasurerKt.DefaultCacheSize : i10);
    }
}
