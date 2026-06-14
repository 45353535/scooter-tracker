package com.mobilefuse.sdk.rx;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/mobilefuse/sdk/rx/Flow;", "T", "", "collect", "", "collector", "Lcom/mobilefuse/sdk/rx/FlowCollector;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public interface Flow<T> {
    void collect(@NotNull FlowCollector<? super T> collector);
}
