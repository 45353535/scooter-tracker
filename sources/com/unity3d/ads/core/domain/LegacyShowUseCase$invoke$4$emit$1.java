package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4", f = "LegacyShowUseCase.kt", l = {207, 212, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE}, m = "emit")
final class LegacyShowUseCase$invoke$4$emit$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegacyShowUseCase.AnonymousClass4<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LegacyShowUseCase$invoke$4$emit$1(LegacyShowUseCase.AnonymousClass4<? super T> anonymousClass4, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((ShowEvent) null, (Continuation) this);
    }
}
