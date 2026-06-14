package androidx.datastore.core;

import eg.p;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Landroidx/datastore/core/Message;", "T", "", "()V", "lastState", "Landroidx/datastore/core/State;", "getLastState", "()Landroidx/datastore/core/State;", "Read", "Update", "Landroidx/datastore/core/Message$Read;", "Landroidx/datastore/core/Message$Update;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Message<T> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/datastore/core/Message$Read;", "T", "Landroidx/datastore/core/Message;", "lastState", "Landroidx/datastore/core/State;", "(Landroidx/datastore/core/State;)V", "getLastState", "()Landroidx/datastore/core/State;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Read<T> extends Message<T> {

        @Nullable
        private final State<T> lastState;

        public Read(@Nullable State<T> state) {
            super(null);
            this.lastState = state;
        }

        @Override // androidx.datastore.core.Message
        @Nullable
        public State<T> getLastState() {
            return this.lastState;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002BQ\u0012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR3\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/datastore/core/Message$Update;", "T", "Landroidx/datastore/core/Message;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "transform", "Leg/p;", "ack", "Landroidx/datastore/core/State;", "lastState", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "<init>", "(Lkotlin/jvm/functions/Function2;Leg/p;Landroidx/datastore/core/State;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/jvm/functions/Function2;", "getTransform", "()Lkotlin/jvm/functions/Function2;", "Leg/p;", "getAck", "()Leg/p;", "Landroidx/datastore/core/State;", "getLastState", "()Landroidx/datastore/core/State;", "Lkotlin/coroutines/CoroutineContext;", "getCallerContext", "()Lkotlin/coroutines/CoroutineContext;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Update<T> extends Message<T> {

        @NotNull
        private final p ack;

        @NotNull
        private final CoroutineContext callerContext;

        @Nullable
        private final State<T> lastState;

        @NotNull
        private final Function2<T, Continuation, Object> transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Update(@NotNull Function2<? super T, ? super Continuation, ? extends Object> transform, @NotNull p ack, @Nullable State<T> state, @NotNull CoroutineContext callerContext) {
            super(null);
            Intrinsics.checkNotNullParameter(transform, "transform");
            Intrinsics.checkNotNullParameter(ack, "ack");
            Intrinsics.checkNotNullParameter(callerContext, "callerContext");
            this.transform = transform;
            this.ack = ack;
            this.lastState = state;
            this.callerContext = callerContext;
        }

        @NotNull
        public final p getAck() {
            return this.ack;
        }

        @NotNull
        public final CoroutineContext getCallerContext() {
            return this.callerContext;
        }

        @Override // androidx.datastore.core.Message
        @Nullable
        public State<T> getLastState() {
            return this.lastState;
        }

        @NotNull
        public final Function2<T, Continuation, Object> getTransform() {
            return this.transform;
        }
    }

    public /* synthetic */ Message(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public abstract State<T> getLastState();

    private Message() {
    }
}
