package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {72, 74, 100}, m = "invokeSuspend")
final class DataStoreImpl$data$1 extends k implements Function2<FlowCollector, Continuation, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/datastore/core/State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {102}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<FlowCollector, Continuation, Object> {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DataStoreImpl<T> dataStoreImpl, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                if (dataStoreImpl.incrementCollector(this) == objG) {
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

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "it", "Landroidx/datastore/core/State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass2<T> extends k implements Function2<State<T>, Continuation, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull State<T> state, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(state, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(!(((State) this.L$0) instanceof Final));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "it", "Landroidx/datastore/core/State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass3<T> extends k implements Function2<State<T>, Continuation, Object> {
        final /* synthetic */ State<T> $startState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(State<T> state, Continuation continuation) {
            super(2, continuation);
            this.$startState = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$startState, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull State<T> state, @Nullable Continuation continuation) {
            return ((AnonymousClass3) create(state, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            State state = (State) this.L$0;
            return kotlin.coroutines.jvm.internal.b.a((state instanceof Data) && state.getVersion() <= this.$startState.getVersion());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", l = {116}, m = "invokeSuspend")
    static final class AnonymousClass5 extends k implements Function3<FlowCollector, Throwable, Continuation, Object> {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(DataStoreImpl<T> dataStoreImpl, Continuation continuation) {
            super(3, continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                if (dataStoreImpl.decrementCollector(this) == objG) {
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

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Throwable th2, @Nullable Continuation continuation) {
            return new AnonymousClass5(this.this$0, continuation).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$data$1(DataStoreImpl<T> dataStoreImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        DataStoreImpl$data$1 dataStoreImpl$data$1 = new DataStoreImpl$data$1(this.this$0, continuation);
        dataStoreImpl$data$1.L$0 = obj;
        return dataStoreImpl$data$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        if (hg.i.t(r1, r9, r8) == r0) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$data$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation continuation) {
        return ((DataStoreImpl$data$1) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
    }
}
