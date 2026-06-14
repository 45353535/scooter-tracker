package com.mobilefuse.sdk.rx;

import com.mobilefuse.sdk.exception.ErrorResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lcom/mobilefuse/sdk/rx/BaseFlow;", "T", "Lcom/mobilefuse/sdk/rx/Flow;", "Lkotlin/Function1;", "Lcom/mobilefuse/sdk/rx/FlowCollector;", "", "block", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "collector", "collect", "(Lcom/mobilefuse/sdk/rx/FlowCollector;)V", "Lkotlin/jvm/functions/Function1;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
final class BaseFlow<T> implements Flow<T> {
    private final Function1<FlowCollector<? super T>, Unit> block;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseFlow(@NotNull Function1<? super FlowCollector<? super T>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.block = block;
    }

    @Override // com.mobilefuse.sdk.rx.Flow
    public void collect(@NotNull FlowCollector<? super T> collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        try {
            this.block.invoke(collector);
        } catch (Throwable th2) {
            collector.emit(new ErrorResult(th2));
        }
    }
}
