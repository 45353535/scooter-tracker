package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$rememberAdapter$1$1$1", f = "PlatformTextInputAdapter.kt", l = {}, m = "invokeSuspend")
final class PlatformTextInputPluginRegistryImpl$rememberAdapter$1$1$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    int label;
    final /* synthetic */ PlatformTextInputPluginRegistryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlatformTextInputPluginRegistryImpl$rememberAdapter$1$1$1(PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistryImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = platformTextInputPluginRegistryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new PlatformTextInputPluginRegistryImpl$rememberAdapter$1$1$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        pf.b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.d.b(obj);
        this.this$0.disposeTombstonedAdapters();
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((PlatformTextInputPluginRegistryImpl$rememberAdapter$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
