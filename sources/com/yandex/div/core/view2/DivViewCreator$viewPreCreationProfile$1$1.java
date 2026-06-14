package com.yandex.div.core.view2;

import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.yandex.div.core.view2.DivViewCreator$viewPreCreationProfile$1$1", f = "DivViewCreator.kt", l = {54}, m = "invokeSuspend")
final class DivViewCreator$viewPreCreationProfile$1$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ String $it;
    final /* synthetic */ ViewPreCreationProfileRepository $repository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivViewCreator$viewPreCreationProfile$1$1(ViewPreCreationProfileRepository viewPreCreationProfileRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.$repository = viewPreCreationProfileRepository;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new DivViewCreator$viewPreCreationProfile$1$1(this.$repository, this.$it, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = b.g();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            return obj;
        }
        d.b(obj);
        ViewPreCreationProfileRepository viewPreCreationProfileRepository = this.$repository;
        String str = this.$it;
        this.label = 1;
        Object obj2 = viewPreCreationProfileRepository.get(str, this);
        return obj2 == objG ? objG : obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((DivViewCreator$viewPreCreationProfile$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
