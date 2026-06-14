package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.runtime.DerivedSnapshotState, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001+B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!J:\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010 \u001a\u00020!2\u0006\u0010$\u001a\u00020%2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002J\b\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020)2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010*\u001a\u00020'H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00018\u00008G¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000b¨\u0006,"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState;", "T", "Landroidx/compose/runtime/snapshots/StateObject;", "Landroidx/compose/runtime/DerivedState;", "calculation", "Lkotlin/Function0;", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/SnapshotMutationPolicy;)V", "currentValue", "getCurrentValue", "()Ljava/lang/Object;", "debuggerDisplayValue", "getDebuggerDisplayValue$annotations", "()V", "getDebuggerDisplayValue", "dependencies", "", "", "getDependencies", "()[Ljava/lang/Object;", "first", "Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "value", "getValue", "current", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "currentRecord", "readable", "forceDependencyReads", "", "displayValue", "", "prependStateRecord", "", "toString", "ResultRecord", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DerivedState<T> implements StateObject, androidx.compose.runtime.DerivedState<T> {

    @NotNull
    private final Function0<T> calculation;

    @NotNull
    private ResultRecord<T> first;

    @Nullable
    private final SnapshotMutationPolicy<T> policy;

    /* JADX INFO: renamed from: androidx.compose.runtime.DerivedSnapshotState$ResultRecord */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \"*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0001\"B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010\u001f\u001a\u00020 J\u001a\u0010!\u001a\u00020\u00072\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010\u001f\u001a\u00020 R(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "()V", "dependencies", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/snapshots/StateObject;", "", "getDependencies", "()Landroidx/compose/runtime/collection/IdentityArrayMap;", "setDependencies", "(Landroidx/compose/runtime/collection/IdentityArrayMap;)V", "result", "", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "resultHash", "getResultHash", "()I", "setResultHash", "(I)V", "assign", "", "value", "create", "isValid", "", "derivedState", "Landroidx/compose/runtime/DerivedState;", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "readableHash", y.f66058y, "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ResultRecord<T> extends StateRecord {

        @Nullable
        private IdentityArrayMap<StateObject, Integer> dependencies;

        @Nullable
        private Object result = Unset;
        private int resultHash;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @NotNull
        private static final Object Unset = new Object();

        /* JADX INFO: renamed from: androidx.compose.runtime.DerivedSnapshotState$ResultRecord$Companion, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord$Companion;", "", "()V", "Unset", "getUnset", "()Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Object getUnset() {
                return ResultRecord.Unset;
            }

            private Companion() {
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord value) {
            Intrinsics.checkNotNullParameter(value, "value");
            ResultRecord resultRecord = (ResultRecord) value;
            this.dependencies = resultRecord.dependencies;
            this.result = resultRecord.result;
            this.resultHash = resultRecord.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new ResultRecord();
        }

        @Nullable
        public final IdentityArrayMap<StateObject, Integer> getDependencies() {
            return this.dependencies;
        }

        @Nullable
        public final Object getResult() {
            return this.result;
        }

        public final int getResultHash() {
            return this.resultHash;
        }

        public final boolean isValid(@NotNull androidx.compose.runtime.DerivedState<?> derivedState, @NotNull Snapshot snapshot) {
            Intrinsics.checkNotNullParameter(derivedState, "derivedState");
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            return this.result != Unset && this.resultHash == readableHash(derivedState, snapshot);
        }

        public final int readableHash(@NotNull androidx.compose.runtime.DerivedState<?> derivedState, @NotNull Snapshot snapshot) {
            IdentityArrayMap<StateObject, Integer> identityArrayMap;
            Intrinsics.checkNotNullParameter(derivedState, "derivedState");
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            synchronized (SnapshotKt.getLock()) {
                identityArrayMap = this.dependencies;
            }
            int iIdentityHashCode = 7;
            if (identityArrayMap == null) {
                return 7;
            }
            MutableVector mutableVector = (MutableVector) SnapshotStateKt__DerivedStateKt.derivedStateObservers.get();
            int i10 = 0;
            if (mutableVector == null) {
                mutableVector = new MutableVector(new Pair[0], 0);
            }
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                int i11 = 0;
                do {
                    ((Function1) ((Pair) content[i11]).component1()).invoke(derivedState);
                    i11++;
                } while (i11 < size);
            }
            try {
                int size2 = identityArrayMap.getSize();
                for (int i12 = 0; i12 < size2; i12++) {
                    Object obj = identityArrayMap.getKeys()[i12];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    StateObject stateObject = (StateObject) obj;
                    if (((Number) identityArrayMap.getValues()[i12]).intValue() == 1) {
                        StateRecord stateRecordCurrent = stateObject instanceof DerivedState ? ((DerivedState) stateObject).current(snapshot) : SnapshotKt.current(stateObject.getFirstStateRecord(), snapshot);
                        iIdentityHashCode = (((iIdentityHashCode * 31) + ActualJvm_jvmKt.identityHashCode(stateRecordCurrent)) * 31) + stateRecordCurrent.getSnapshotId();
                    }
                }
                Unit unit = Unit.f93236a;
                int size3 = mutableVector.getSize();
                if (size3 > 0) {
                    Object[] content2 = mutableVector.getContent();
                    do {
                        ((Function1) ((Pair) content2[i10]).component2()).invoke(derivedState);
                        i10++;
                    } while (i10 < size3);
                }
                return iIdentityHashCode;
            } catch (Throwable th2) {
                int size4 = mutableVector.getSize();
                if (size4 > 0) {
                    Object[] content3 = mutableVector.getContent();
                    do {
                        ((Function1) ((Pair) content3[i10]).component2()).invoke(derivedState);
                        i10++;
                    } while (i10 < size4);
                }
                throw th2;
            }
        }

        public final void setDependencies(@Nullable IdentityArrayMap<StateObject, Integer> identityArrayMap) {
            this.dependencies = identityArrayMap;
        }

        public final void setResult(@Nullable Object obj) {
            this.result = obj;
        }

        public final void setResultHash(int i10) {
            this.resultHash = i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedState(@NotNull Function0<? extends T> calculation, @Nullable SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        this.calculation = calculation;
        this.policy = snapshotMutationPolicy;
        this.first = new ResultRecord<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ResultRecord<T> currentRecord(ResultRecord<T> readable, Snapshot snapshot, boolean forceDependencyReads, Function0<? extends T> calculation) {
        Snapshot.Companion companion;
        SnapshotMutationPolicy<T> policy;
        int i10 = 0;
        if (readable.isValid(this, snapshot)) {
            if (forceDependencyReads) {
                MutableVector mutableVector = (MutableVector) SnapshotStateKt__DerivedStateKt.derivedStateObservers.get();
                if (mutableVector == null) {
                    mutableVector = new MutableVector(new Pair[0], 0);
                }
                int size = mutableVector.getSize();
                if (size > 0) {
                    Object[] content = mutableVector.getContent();
                    int i11 = 0;
                    do {
                        ((Function1) ((Pair) content[i11]).component1()).invoke(this);
                        i11++;
                    } while (i11 < size);
                }
                try {
                    IdentityArrayMap<StateObject, Integer> dependencies = readable.getDependencies();
                    Integer num = (Integer) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
                    int iIntValue = num != null ? num.intValue() : 0;
                    if (dependencies != null) {
                        int size2 = dependencies.getSize();
                        for (int i12 = 0; i12 < size2; i12++) {
                            Object obj = dependencies.getKeys()[i12];
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                            StateObject stateObject = (StateObject) obj;
                            SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(Integer.valueOf(((Number) dependencies.getValues()[i12]).intValue() + iIntValue));
                            Function1<Object, Unit> readObserver$runtime_release = snapshot.getReadObserver$runtime_release();
                            if (readObserver$runtime_release != null) {
                                readObserver$runtime_release.invoke(stateObject);
                            }
                        }
                    }
                    SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(Integer.valueOf(iIntValue));
                    Unit unit = Unit.f93236a;
                    int size3 = mutableVector.getSize();
                    if (size3 > 0) {
                        Object[] content2 = mutableVector.getContent();
                        do {
                            ((Function1) ((Pair) content2[i10]).component2()).invoke(this);
                            i10++;
                        } while (i10 < size3);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return readable;
        }
        Integer num2 = (Integer) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
        final int iIntValue2 = num2 != null ? num2.intValue() : 0;
        final IdentityArrayMap<StateObject, Integer> identityArrayMap = new IdentityArrayMap<>(0, 1, null);
        MutableVector mutableVector2 = (MutableVector) SnapshotStateKt__DerivedStateKt.derivedStateObservers.get();
        if (mutableVector2 == null) {
            mutableVector2 = new MutableVector(new Pair[0], 0);
        }
        int size4 = mutableVector2.getSize();
        if (size4 > 0) {
            Object[] content3 = mutableVector2.getContent();
            int i13 = 0;
            do {
                ((Function1) ((Pair) content3[i13]).component1()).invoke(this);
                i13++;
            } while (i13 < size4);
        }
        try {
            SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(Integer.valueOf(iIntValue2 + 1));
            Object objObserve = Snapshot.INSTANCE.observe(new Function1<Object, Unit>(this) { // from class: androidx.compose.runtime.DerivedSnapshotState$currentRecord$result$1$result$1
                final /* synthetic */ DerivedState<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                    invoke2(obj2);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (it == this.this$0) {
                        throw new IllegalStateException("A derived state calculation cannot read itself");
                    }
                    if (it instanceof StateObject) {
                        Object obj2 = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
                        Intrinsics.checkNotNull(obj2);
                        int iIntValue3 = ((Number) obj2).intValue();
                        IdentityArrayMap<StateObject, Integer> identityArrayMap2 = identityArrayMap;
                        int i14 = iIntValue3 - iIntValue2;
                        Integer num3 = identityArrayMap2.get(it);
                        identityArrayMap2.set(it, Integer.valueOf(Math.min(i14, num3 != null ? num3.intValue() : Integer.MAX_VALUE)));
                    }
                }
            }, null, calculation);
            SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(Integer.valueOf(iIntValue2));
            int size5 = mutableVector2.getSize();
            if (size5 > 0) {
                Object[] content4 = mutableVector2.getContent();
                do {
                    ((Function1) ((Pair) content4[i10]).component2()).invoke(this);
                    i10++;
                } while (i10 < size5);
            }
            synchronized (SnapshotKt.getLock()) {
                try {
                    companion = Snapshot.INSTANCE;
                    Snapshot current = companion.getCurrent();
                    if (readable.getResult() == ResultRecord.INSTANCE.getUnset() || (policy = getPolicy()) == 0 || !policy.equivalent(objObserve, readable.getResult())) {
                        readable = (ResultRecord) SnapshotKt.newWritableRecord(this.first, this, current);
                        readable.setDependencies(identityArrayMap);
                        readable.setResultHash(readable.readableHash(this, current));
                        readable.setResult(objObserve);
                    } else {
                        readable.setDependencies(identityArrayMap);
                        readable.setResultHash(readable.readableHash(this, current));
                    }
                } finally {
                }
            }
            if (iIntValue2 == 0) {
                companion.notifyObjectsInitialized();
            }
            return readable;
        } finally {
            int size6 = mutableVector2.getSize();
            if (size6 > 0) {
                Object[] content5 = mutableVector2.getContent();
                do {
                    ((Function1) ((Pair) content5[i10]).component2()).invoke(this);
                    i10++;
                } while (i10 < size6);
            }
        }
    }

    private final String displayValue() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        return resultRecord.isValid(this, Snapshot.INSTANCE.getCurrent()) ? String.valueOf(resultRecord.getResult()) : "<Not calculated>";
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    @NotNull
    public final StateRecord current(@NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        return currentRecord((ResultRecord) SnapshotKt.current(this.first, snapshot), snapshot, false, this.calculation);
    }

    @Override // androidx.compose.runtime.DerivedState
    public T getCurrentValue() {
        return (T) currentRecord((ResultRecord) SnapshotKt.current(this.first), Snapshot.INSTANCE.getCurrent(), false, this.calculation).getResult();
    }

    @Nullable
    public final T getDebuggerDisplayValue() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        if (resultRecord.isValid(this, Snapshot.INSTANCE.getCurrent())) {
            return (T) resultRecord.getResult();
        }
        return null;
    }

    @Override // androidx.compose.runtime.DerivedState
    @NotNull
    public Object[] getDependencies() {
        Object[] keys;
        IdentityArrayMap<StateObject, Integer> dependencies = currentRecord((ResultRecord) SnapshotKt.current(this.first), Snapshot.INSTANCE.getCurrent(), false, this.calculation).getDependencies();
        return (dependencies == null || (keys = dependencies.getKeys()) == null) ? new Object[0] : keys;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.first;
    }

    @Override // androidx.compose.runtime.DerivedState
    @Nullable
    public SnapshotMutationPolicy<T> getPolicy() {
        return this.policy;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Function1<Object, Unit> readObserver$runtime_release = companion.getCurrent().getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(this);
        }
        return (T) currentRecord((ResultRecord) SnapshotKt.current(this.first), companion.getCurrent(), true, this.calculation).getResult();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public /* synthetic */ StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        return androidx.compose.runtime.snapshots.a.a(this, stateRecord, stateRecord2, stateRecord3);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.first = (ResultRecord) value;
    }

    @NotNull
    public String toString() {
        return "DerivedState(value=" + displayValue() + ")@" + hashCode();
    }
}
