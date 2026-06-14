package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", f = "DataStoreImpl.kt", l = {544, 447, 449}, m = "updateData")
final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataStoreImpl$InitDataStore$doRun$initData$1$api$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1, Continuation continuation) {
        super(continuation);
        this.this$0 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateData(null, this);
    }
}
