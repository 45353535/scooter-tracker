package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {348}, m = "writeData$datastore_core_release")
final class DataStoreImpl$writeData$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$writeData$1(DataStoreImpl<T> dataStoreImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.writeData$datastore_core_release(null, false, this);
    }
}
