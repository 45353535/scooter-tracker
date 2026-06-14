package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\b\u001a0\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0082\b¢\u0006\u0004\b\r\u0010\u000e\u001aS\u0010\u0014\u001a\u00020\u0011\"\u0004\b\u0000\u0010\t2\u0016\u0010\u0012\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00110\u00102\u0016\u0010\u0013\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"P\u0010\u001d\u001a>\u0012:\u00128\u00124\u00122\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u00110\u00100\u001bj\u0002`\u001c0\u001a0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019*d\b\u0002\u0010\u001e\".\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u00110\u00100\u001b2.\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u00110\u00100\u001b¨\u0006\u001f"}, d2 = {"T", "Lkotlin/Function0;", "calculation", "Landroidx/compose/runtime/State;", "derivedStateOf", "(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "policy", "(Landroidx/compose/runtime/SnapshotMutationPolicy;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;", "R", "Landroidx/compose/runtime/DerivedState;", "derivedState", "block", "notifyObservers$SnapshotStateKt__DerivedStateKt", "(Landroidx/compose/runtime/DerivedState;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "notifyObservers", "Lkotlin/Function1;", "", "start", "done", "observeDerivedStateRecalculations", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/SnapshotThreadLocal;", "", "calculationBlockNestedLevel", "Landroidx/compose/runtime/SnapshotThreadLocal;", "Landroidx/compose/runtime/collection/MutableVector;", "Lkotlin/Pair;", "Landroidx/compose/runtime/DerivedStateObservers;", "derivedStateObservers", "DerivedStateObservers", "runtime_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class SnapshotStateKt__DerivedStateKt {

    @NotNull
    private static final SnapshotThreadLocal<Integer> calculationBlockNestedLevel = new SnapshotThreadLocal<>();

    @NotNull
    private static final SnapshotThreadLocal<MutableVector<Pair<Function1<DerivedState<?>, Unit>, Function1<DerivedState<?>, Unit>>>> derivedStateObservers = new SnapshotThreadLocal<>();

    @NotNull
    public static final <T> State<T> derivedStateOf(@NotNull Function0<? extends T> calculation) {
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        return new DerivedSnapshotState(calculation, null);
    }

    private static final <R> R notifyObservers$SnapshotStateKt__DerivedStateKt(DerivedState<?> derivedState, Function0<? extends R> function0) {
        MutableVector mutableVector = (MutableVector) derivedStateObservers.get();
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
            R rInvoke = function0.invoke();
            z.b(1);
            int size2 = mutableVector.getSize();
            if (size2 > 0) {
                Object[] content2 = mutableVector.getContent();
                do {
                    ((Function1) ((Pair) content2[i10]).component2()).invoke(derivedState);
                    i10++;
                } while (i10 < size2);
            }
            z.a(1);
            return rInvoke;
        } catch (Throwable th2) {
            z.b(1);
            int size3 = mutableVector.getSize();
            if (size3 > 0) {
                Object[] content3 = mutableVector.getContent();
                do {
                    ((Function1) ((Pair) content3[i10]).component2()).invoke(derivedState);
                    i10++;
                } while (i10 < size3);
            }
            z.a(1);
            throw th2;
        }
    }

    public static final <R> void observeDerivedStateRecalculations(@NotNull Function1<? super State<?>, Unit> start, @NotNull Function1<? super State<?>, Unit> done, @NotNull Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(done, "done");
        Intrinsics.checkNotNullParameter(block, "block");
        SnapshotThreadLocal<MutableVector<Pair<Function1<DerivedState<?>, Unit>, Function1<DerivedState<?>, Unit>>>> snapshotThreadLocal = derivedStateObservers;
        MutableVector<Pair<Function1<DerivedState<?>, Unit>, Function1<DerivedState<?>, Unit>>> mutableVector = snapshotThreadLocal.get();
        if (mutableVector == null) {
            mutableVector = new MutableVector<>(new Pair[16], 0);
            snapshotThreadLocal.set(mutableVector);
        }
        try {
            mutableVector.add(TuplesKt.to(start, done));
            block.invoke();
        } finally {
            mutableVector.removeAt(mutableVector.getSize() - 1);
        }
    }

    @NotNull
    public static final <T> State<T> derivedStateOf(@NotNull SnapshotMutationPolicy<T> policy, @NotNull Function0<? extends T> calculation) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        return new DerivedSnapshotState(calculation, policy);
    }
}
