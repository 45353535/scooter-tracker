package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/core/Data;", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {437, 458, 546, 468}, m = "invokeSuspend")
final class DataStoreImpl$InitDataStore$doRun$initData$1 extends k implements Function1<Continuation, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;
    final /* synthetic */ DataStoreImpl<T>.InitDataStore this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$InitDataStore$doRun$initData$1(DataStoreImpl<T> dataStoreImpl, DataStoreImpl<T>.InitDataStore initDataStore, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dataStoreImpl;
        this.this$1 = initDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@NotNull Continuation continuation) {
        return new DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this.this$1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    @Override // kotlin.coroutines.jvm.internal.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) throws androidx.datastore.core.CorruptionException {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation continuation) {
        return ((DataStoreImpl$InitDataStore$doRun$initData$1) create(continuation)).invokeSuspend(Unit.f93236a);
    }
}
