package androidx.datastore.core;

import androidx.core.app.NotificationCompat;
import androidx.datastore.core.Message;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", NotificationCompat.CATEGORY_MESSAGE, "Landroidx/datastore/core/Message$Update;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.datastore.core.DataStoreImpl$writeActor$3", f = "DataStoreImpl.kt", l = {207}, m = "invokeSuspend")
final class DataStoreImpl$writeActor$3<T> extends k implements Function2<Message.Update<T>, Continuation, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$writeActor$3(DataStoreImpl<T> dataStoreImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        DataStoreImpl$writeActor$3 dataStoreImpl$writeActor$3 = new DataStoreImpl$writeActor$3(this.this$0, continuation);
        dataStoreImpl$writeActor$3.L$0 = obj;
        return dataStoreImpl$writeActor$3;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull Message.Update<T> update, @Nullable Continuation continuation) {
        return ((DataStoreImpl$writeActor$3) create(update, continuation)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            Message.Update update = (Message.Update) this.L$0;
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            this.label = 1;
            if (dataStoreImpl.handleUpdate(update, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
        }
        return Unit.f93236a;
    }
}
