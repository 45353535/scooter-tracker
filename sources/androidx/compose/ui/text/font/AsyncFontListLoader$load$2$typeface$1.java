package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {269}, m = "invokeSuspend")
final class AsyncFontListLoader$load$2$typeface$1 extends kotlin.coroutines.jvm.internal.k implements Function1<Continuation, Object> {
    final /* synthetic */ Font $font;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$load$2$typeface$1(AsyncFontListLoader asyncFontListLoader, Font font, Continuation continuation) {
        super(1, continuation);
        this.this$0 = asyncFontListLoader;
        this.$font = font;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@NotNull Continuation continuation) {
        return new AsyncFontListLoader$load$2$typeface$1(this.this$0, this.$font, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        AsyncFontListLoader asyncFontListLoader = this.this$0;
        Font font = this.$font;
        this.label = 1;
        Object objLoadWithTimeoutOrNull$ui_text_release = asyncFontListLoader.loadWithTimeoutOrNull$ui_text_release(font, this);
        return objLoadWithTimeoutOrNull$ui_text_release == objG ? objG : objLoadWithTimeoutOrNull$ui_text_release;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation continuation) {
        return ((AsyncFontListLoader$load$2$typeface$1) create(continuation)).invokeSuspend(Unit.f93236a);
    }
}
