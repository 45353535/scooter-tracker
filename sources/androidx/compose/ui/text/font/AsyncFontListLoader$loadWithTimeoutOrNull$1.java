package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {300}, m = "loadWithTimeoutOrNull$ui_text_release")
final class AsyncFontListLoader$loadWithTimeoutOrNull$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$loadWithTimeoutOrNull$1(AsyncFontListLoader asyncFontListLoader, Continuation continuation) {
        super(continuation);
        this.this$0 = asyncFontListLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadWithTimeoutOrNull$ui_text_release(null, this);
    }
}
