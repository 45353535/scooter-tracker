package androidx.compose.runtime.snapshots;

import androidx.compose.animation.core.c;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.IdentityArrayIntMap;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import com.appodeal.ads.modules.common.internal.Constants;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.z;
import lf.g;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001BB!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u0002H\u0082\b¢\u0006\u0004\b\u0018\u0010\u0007J-\u0010\u001b\u001a\u00020\u0016\"\b\b\u0000\u0010\u0019*\u00020\u00012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJA\u0010\u001f\u001a\u00020\u0004\"\b\b\u0000\u0010\u0019*\u00020\u00012\u0006\u0010\u001d\u001a\u00028\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0001¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00042\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b&\u0010\u0007J\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\fJ\r\u0010(\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\fJ#\u0010,\u001a\u00020\u00042\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\r\u0010#\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\fR&\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R(\u00101\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010/j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`08\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R,\u00106\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0004058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010.R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0016098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00104R\u0018\u0010@\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006C"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "drainChanges", "()Z", "sendNotifications", "()V", "", "set", "addChanges", "(Ljava/util/Set;)V", "removeChanges", "()Ljava/util/Set;", "", Constants.REPORT, "()Ljava/lang/Void;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "block", "forEachScopeMap", "T", "onChanged", "ensureMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "scope", "onValueChangedForScope", "observeReads", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "withNoObservations", "(Lkotlin/jvm/functions/Function0;)V", "clear", "(Ljava/lang/Object;)V", "predicate", "clearIf", "start", AtomManager.ATOM_STOP_METHOD_NAME, "changes", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "notifyChanges", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/Snapshot;)V", "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "pendingChanges", "Ljava/util/concurrent/atomic/AtomicReference;", "sendingNotifications", "Z", "Lkotlin/Function2;", "applyObserver", "Lkotlin/jvm/functions/Function2;", "readObserver", "Landroidx/compose/runtime/collection/MutableVector;", "observedScopeMaps", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "applyUnsubscribe", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "isPaused", "currentMap", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "ObservedScopeMap", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SnapshotStateObserver {
    public static final int $stable = 8;

    @NotNull
    private final Function2<Set<? extends Object>, Snapshot, Unit> applyObserver;

    @Nullable
    private ObserverHandle applyUnsubscribe;

    @Nullable
    private ObservedScopeMap currentMap;
    private boolean isPaused;

    @NotNull
    private final MutableVector<ObservedScopeMap> observedScopeMaps;

    @NotNull
    private final Function1<Function0<Unit>, Unit> onChangedExecutor;

    @NotNull
    private final AtomicReference<Object> pendingChanges;

    @NotNull
    private final Function1<Object, Unit> readObserver;
    private boolean sendingNotifications;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\tJ)\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\tJ!\u0010\u0015\u001a\u00020\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00130\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\r\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u0017R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\"0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R'\u00102\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u000301\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u001d\u001a\u0004\b3\u0010\u001fR'\u00104\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u000301\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\u001d\u001a\u0004\b5\u0010\u001fR\u0016\u00106\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010'R\u001e\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003070(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010*R<\u0010;\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u000307\u0012\u0006\u0012\u0004\u0018\u00010\u000109j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u000307\u0012\u0006\u0012\u0004\u0018\u00010\u0001`:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006="}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "Lkotlin/Function1;", "", "onChanged", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "scope", "clearObsoleteStateReads", "(Ljava/lang/Object;)V", "value", "removeObservation", "(Ljava/lang/Object;Ljava/lang/Object;)V", "recordRead", "Lkotlin/Function0;", "block", "observe", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "clearScopeObservations", "", "predicate", "removeScopeIf", "clear", "()V", "", "changes", "recordInvalidation", "(Ljava/util/Set;)Z", "notifyInvalidatedScopes", "Lkotlin/jvm/functions/Function1;", "getOnChanged", "()Lkotlin/jvm/functions/Function1;", "currentScope", "Ljava/lang/Object;", "Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "currentScopeReads", "Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "", "currentToken", "I", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "valueToScopes", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "scopeToValues", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "invalidated", "Landroidx/compose/runtime/collection/IdentityArraySet;", "Landroidx/compose/runtime/State;", "derivedStateEnterObserver", "getDerivedStateEnterObserver", "derivedStateExitObserver", "getDerivedStateExitObserver", "deriveStateScopeCount", "Landroidx/compose/runtime/DerivedState;", "dependencyToDerivedStates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "recordedDerivedStateValues", "Ljava/util/HashMap;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class ObservedScopeMap {

        @Nullable
        private Object currentScope;

        @Nullable
        private IdentityArrayIntMap currentScopeReads;
        private int currentToken;

        @NotNull
        private final IdentityScopeMap<DerivedState<?>> dependencyToDerivedStates;
        private int deriveStateScopeCount;

        @NotNull
        private final Function1<State<?>, Unit> derivedStateEnterObserver;

        @NotNull
        private final Function1<State<?>, Unit> derivedStateExitObserver;

        @NotNull
        private final IdentityArraySet<Object> invalidated;

        @NotNull
        private final Function1<Object, Unit> onChanged;

        @NotNull
        private final HashMap<DerivedState<?>, Object> recordedDerivedStateValues;

        @NotNull
        private final IdentityArrayMap<Object, IdentityArrayIntMap> scopeToValues;

        @NotNull
        private final IdentityScopeMap<Object> valueToScopes;

        public ObservedScopeMap(@NotNull Function1<Object, Unit> onChanged) {
            Intrinsics.checkNotNullParameter(onChanged, "onChanged");
            this.onChanged = onChanged;
            this.currentToken = -1;
            this.valueToScopes = new IdentityScopeMap<>();
            this.scopeToValues = new IdentityArrayMap<>(0, 1, null);
            this.invalidated = new IdentityArraySet<>();
            this.derivedStateEnterObserver = new Function1<State<?>, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateEnterObserver$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(State<?> state) {
                    invoke2(state);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull State<?> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.this$0.deriveStateScopeCount++;
                }
            };
            this.derivedStateExitObserver = new Function1<State<?>, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateExitObserver$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(State<?> state) {
                    invoke2(state);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull State<?> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    SnapshotStateObserver.ObservedScopeMap observedScopeMap = this.this$0;
                    observedScopeMap.deriveStateScopeCount--;
                }
            };
            this.dependencyToDerivedStates = new IdentityScopeMap<>();
            this.recordedDerivedStateValues = new HashMap<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void clearObsoleteStateReads(Object scope) {
            IdentityArrayIntMap identityArrayIntMap = this.currentScopeReads;
            if (identityArrayIntMap != null) {
                int size = identityArrayIntMap.getSize();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    Object obj = identityArrayIntMap.getKeys()[i11];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
                    int i12 = identityArrayIntMap.getValues()[i11];
                    boolean z10 = i12 != this.currentToken;
                    if (z10) {
                        removeObservation(scope, obj);
                    }
                    if (!z10) {
                        if (i10 != i11) {
                            identityArrayIntMap.getKeys()[i10] = obj;
                            identityArrayIntMap.getValues()[i10] = i12;
                        }
                        i10++;
                    }
                }
                int size2 = identityArrayIntMap.getSize();
                for (int i13 = i10; i13 < size2; i13++) {
                    identityArrayIntMap.getKeys()[i13] = null;
                }
                identityArrayIntMap.setSize(i10);
            }
        }

        private final void removeObservation(Object scope, Object value) {
            this.valueToScopes.remove(value, scope);
            if (!(value instanceof DerivedState) || this.valueToScopes.contains(value)) {
                return;
            }
            this.dependencyToDerivedStates.removeScope(value);
            this.recordedDerivedStateValues.remove(value);
        }

        public final void clear() {
            this.valueToScopes.clear();
            this.scopeToValues.clear();
            this.dependencyToDerivedStates.clear();
            this.recordedDerivedStateValues.clear();
        }

        public final void clearScopeObservations(@NotNull Object scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            IdentityArrayIntMap identityArrayIntMapRemove = this.scopeToValues.remove(scope);
            if (identityArrayIntMapRemove == null) {
                return;
            }
            int size = identityArrayIntMapRemove.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = identityArrayIntMapRemove.getKeys()[i10];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
                int i11 = identityArrayIntMapRemove.getValues()[i10];
                removeObservation(scope, obj);
            }
        }

        @NotNull
        public final Function1<State<?>, Unit> getDerivedStateEnterObserver() {
            return this.derivedStateEnterObserver;
        }

        @NotNull
        public final Function1<State<?>, Unit> getDerivedStateExitObserver() {
            return this.derivedStateExitObserver;
        }

        @NotNull
        public final Function1<Object, Unit> getOnChanged() {
            return this.onChanged;
        }

        public final void notifyInvalidatedScopes() {
            IdentityArraySet<Object> identityArraySet = this.invalidated;
            Function1<Object, Unit> function1 = this.onChanged;
            int size = identityArraySet.size();
            for (int i10 = 0; i10 < size; i10++) {
                function1.invoke(identityArraySet.get(i10));
            }
            this.invalidated.clear();
        }

        public final void observe(@NotNull Object scope, @NotNull Function0<Unit> block) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(block, "block");
            Object obj = this.currentScope;
            IdentityArrayIntMap identityArrayIntMap = this.currentScopeReads;
            int i10 = this.currentToken;
            this.currentScope = scope;
            this.currentScopeReads = (IdentityArrayIntMap) this.scopeToValues.get(scope);
            if (this.currentToken == -1) {
                this.currentToken = SnapshotKt.currentSnapshot().getId();
            }
            block.invoke();
            Object obj2 = this.currentScope;
            Intrinsics.checkNotNull(obj2);
            clearObsoleteStateReads(obj2);
            this.currentScope = obj;
            this.currentScopeReads = identityArrayIntMap;
            this.currentToken = i10;
        }

        public final boolean recordInvalidation(@NotNull Set<? extends Object> changes) {
            IdentityScopeMap<DerivedState<?>> identityScopeMap;
            int iFind;
            IdentityScopeMap<Object> identityScopeMap2;
            int iFind2;
            Intrinsics.checkNotNullParameter(changes, "changes");
            boolean z10 = false;
            for (Object obj : changes) {
                if (this.dependencyToDerivedStates.contains(obj) && (iFind = (identityScopeMap = this.dependencyToDerivedStates).find(obj)) >= 0) {
                    IdentityArraySet identityArraySetScopeSetAt = identityScopeMap.scopeSetAt(iFind);
                    int size = identityArraySetScopeSetAt.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        DerivedState derivedState = (DerivedState) identityArraySetScopeSetAt.get(i10);
                        Intrinsics.checkNotNull(derivedState, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                        Object obj2 = this.recordedDerivedStateValues.get(derivedState);
                        SnapshotMutationPolicy policy = derivedState.getPolicy();
                        if (policy == null) {
                            policy = SnapshotStateKt.structuralEqualityPolicy();
                        }
                        if (!policy.equivalent(derivedState.getCurrentValue(), obj2) && (iFind2 = (identityScopeMap2 = this.valueToScopes).find(derivedState)) >= 0) {
                            IdentityArraySet identityArraySetScopeSetAt2 = identityScopeMap2.scopeSetAt(iFind2);
                            int size2 = identityArraySetScopeSetAt2.size();
                            int i11 = 0;
                            while (i11 < size2) {
                                this.invalidated.add(identityArraySetScopeSetAt2.get(i11));
                                i11++;
                                z10 = true;
                            }
                        }
                    }
                }
                IdentityScopeMap<Object> identityScopeMap3 = this.valueToScopes;
                int iFind3 = identityScopeMap3.find(obj);
                if (iFind3 >= 0) {
                    IdentityArraySet identityArraySetScopeSetAt3 = identityScopeMap3.scopeSetAt(iFind3);
                    int size3 = identityArraySetScopeSetAt3.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        this.invalidated.add(identityArraySetScopeSetAt3.get(i12));
                        i12++;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        public final void recordRead(@NotNull Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            Object obj = this.currentScope;
            Intrinsics.checkNotNull(obj);
            IdentityArrayIntMap identityArrayIntMap = this.currentScopeReads;
            if (identityArrayIntMap == null) {
                identityArrayIntMap = new IdentityArrayIntMap();
                this.currentScopeReads = identityArrayIntMap;
                this.scopeToValues.set(obj, identityArrayIntMap);
            }
            int iAdd = identityArrayIntMap.add(value, this.currentToken);
            if ((value instanceof DerivedState) && iAdd != this.currentToken) {
                DerivedState derivedState = (DerivedState) value;
                for (Object obj2 : derivedState.getDependencies()) {
                    if (obj2 == null) {
                        break;
                    }
                    this.dependencyToDerivedStates.add(obj2, value);
                }
                this.recordedDerivedStateValues.put(value, derivedState.getCurrentValue());
            }
            if (iAdd == -1) {
                this.valueToScopes.add(value, obj);
            }
        }

        public final void removeScopeIf(@NotNull Function1<Object, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            IdentityArrayMap<Object, IdentityArrayIntMap> identityArrayMap = this.scopeToValues;
            int size$runtime_release = identityArrayMap.getSize();
            int i10 = 0;
            for (int i11 = 0; i11 < size$runtime_release; i11++) {
                Object obj = identityArrayMap.getKeys()[i11];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                IdentityArrayIntMap identityArrayIntMap = (IdentityArrayIntMap) identityArrayMap.getValues()[i11];
                Boolean boolInvoke = predicate.invoke(obj);
                if (boolInvoke.booleanValue()) {
                    int size = identityArrayIntMap.getSize();
                    for (int i12 = 0; i12 < size; i12++) {
                        Object obj2 = identityArrayIntMap.getKeys()[i12];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Any");
                        int i13 = identityArrayIntMap.getValues()[i12];
                        removeObservation(obj, obj2);
                    }
                }
                if (!boolInvoke.booleanValue()) {
                    if (i10 != i11) {
                        identityArrayMap.getKeys()[i10] = obj;
                        identityArrayMap.getValues()[i10] = identityArrayMap.getValues()[i11];
                    }
                    i10++;
                }
            }
            if (identityArrayMap.getSize() > i10) {
                int size$runtime_release2 = identityArrayMap.getSize();
                for (int i14 = i10; i14 < size$runtime_release2; i14++) {
                    identityArrayMap.getKeys()[i14] = null;
                    identityArrayMap.getValues()[i14] = null;
                }
                identityArrayMap.setSize$runtime_release(i10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(@NotNull Function1<? super Function0<Unit>, Unit> onChangedExecutor) {
        Intrinsics.checkNotNullParameter(onChangedExecutor, "onChangedExecutor");
        this.onChangedExecutor = onChangedExecutor;
        this.pendingChanges = new AtomicReference<>(null);
        this.applyObserver = new Function2<Set<? extends Object>, Snapshot, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, Snapshot snapshot) {
                invoke2(set, snapshot);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Set<? extends Object> applied, @NotNull Snapshot snapshot) {
                Intrinsics.checkNotNullParameter(applied, "applied");
                Intrinsics.checkNotNullParameter(snapshot, "<anonymous parameter 1>");
                this.this$0.addChanges(applied);
                if (this.this$0.drainChanges()) {
                    this.this$0.sendNotifications();
                }
            }
        };
        this.readObserver = new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$readObserver$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object state) {
                Intrinsics.checkNotNullParameter(state, "state");
                if (this.this$0.isPaused) {
                    return;
                }
                MutableVector mutableVector = this.this$0.observedScopeMaps;
                SnapshotStateObserver snapshotStateObserver = this.this$0;
                synchronized (mutableVector) {
                    SnapshotStateObserver.ObservedScopeMap observedScopeMap = snapshotStateObserver.currentMap;
                    Intrinsics.checkNotNull(observedScopeMap);
                    observedScopeMap.recordRead(state);
                    Unit unit = Unit.f93236a;
                }
            }
        };
        this.observedScopeMaps = new MutableVector<>(new ObservedScopeMap[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addChanges(Set<? extends Object> set) {
        Object obj;
        List listPlus;
        do {
            obj = this.pendingChanges.get();
            if (obj == null) {
                listPlus = set;
            } else if (obj instanceof Set) {
                listPlus = CollectionsKt.listOf((Object[]) new Set[]{(Set) obj, set});
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new g();
                }
                listPlus = CollectionsKt.plus((Collection) obj, (Iterable) CollectionsKt.listOf(set));
            }
        } while (!c.a(this.pendingChanges, obj, listPlus));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean drainChanges() {
        boolean z10;
        synchronized (this.observedScopeMaps) {
            z10 = this.sendingNotifications;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            Set<? extends Object> setRemoveChanges = removeChanges();
            if (setRemoveChanges == null) {
                return z11;
            }
            synchronized (this.observedScopeMaps) {
                try {
                    MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                    int size = mutableVector.getSize();
                    if (size > 0) {
                        ObservedScopeMap[] content = mutableVector.getContent();
                        int i10 = 0;
                        do {
                            z11 = content[i10].recordInvalidation(setRemoveChanges) || z11;
                            i10++;
                        } while (i10 < size);
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private final <T> ObservedScopeMap ensureMap(Function1<? super T, Unit> onChanged) {
        ObservedScopeMap observedScopeMap;
        MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
        int size = mutableVector.getSize();
        if (size > 0) {
            ObservedScopeMap[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                observedScopeMap = content[i10];
                if (observedScopeMap.getOnChanged() == onChanged) {
                    break;
                }
                i10++;
            } while (i10 < size);
            observedScopeMap = null;
        } else {
            observedScopeMap = null;
        }
        ObservedScopeMap observedScopeMap2 = observedScopeMap;
        if (observedScopeMap2 != null) {
            return observedScopeMap2;
        }
        Intrinsics.checkNotNull(onChanged, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        ObservedScopeMap observedScopeMap3 = new ObservedScopeMap((Function1) b1.g(onChanged, 1));
        this.observedScopeMaps.add(observedScopeMap3);
        return observedScopeMap3;
    }

    private final void forEachScopeMap(Function1<? super ObservedScopeMap, Unit> block) {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    ObservedScopeMap[] content = mutableVector.getContent();
                    int i10 = 0;
                    do {
                        block.invoke(content[i10]);
                        i10++;
                    } while (i10 < size);
                }
                Unit unit = Unit.f93236a;
                z.b(1);
            } catch (Throwable th2) {
                z.b(1);
                z.a(1);
                throw th2;
            }
        }
        z.a(1);
    }

    private final Set<Object> removeChanges() {
        Object obj;
        Object objSubList;
        Set<Object> set;
        do {
            obj = this.pendingChanges.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new g();
                }
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!c.a(this.pendingChanges, obj, objSubList));
        return set;
    }

    private final Void report() {
        ComposerKt.composeRuntimeError("Unexpected notification");
        throw new g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendNotifications() {
        this.onChangedExecutor.invoke(new Function0<Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver.sendNotifications.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                do {
                    MutableVector mutableVector = SnapshotStateObserver.this.observedScopeMaps;
                    SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
                    synchronized (mutableVector) {
                        try {
                            if (!snapshotStateObserver.sendingNotifications) {
                                snapshotStateObserver.sendingNotifications = true;
                                try {
                                    MutableVector mutableVector2 = snapshotStateObserver.observedScopeMaps;
                                    int size = mutableVector2.getSize();
                                    if (size > 0) {
                                        Object[] content = mutableVector2.getContent();
                                        int i10 = 0;
                                        do {
                                            ((ObservedScopeMap) content[i10]).notifyInvalidatedScopes();
                                            i10++;
                                        } while (i10 < size);
                                    }
                                    snapshotStateObserver.sendingNotifications = false;
                                } finally {
                                }
                            }
                            Unit unit = Unit.f93236a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } while (SnapshotStateObserver.this.drainChanges());
            }
        });
    }

    public final void clear(@NotNull Object scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    ObservedScopeMap[] content = mutableVector.getContent();
                    int i10 = 0;
                    do {
                        content[i10].clearScopeObservations(scope);
                        i10++;
                    } while (i10 < size);
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clearIf(@NotNull Function1<Object, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    ObservedScopeMap[] content = mutableVector.getContent();
                    int i10 = 0;
                    do {
                        content[i10].removeScopeIf(predicate);
                        i10++;
                    } while (i10 < size);
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void notifyChanges(@NotNull Set<? extends Object> changes, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.applyObserver.invoke(changes, snapshot);
    }

    public final <T> void observeReads(@NotNull T scope, @NotNull Function1<? super T, Unit> onValueChangedForScope, @NotNull final Function0<Unit> block) {
        ObservedScopeMap observedScopeMapEnsureMap;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onValueChangedForScope, "onValueChangedForScope");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this.observedScopeMaps) {
            observedScopeMapEnsureMap = ensureMap(onValueChangedForScope);
        }
        boolean z10 = this.isPaused;
        ObservedScopeMap observedScopeMap = this.currentMap;
        try {
            this.isPaused = false;
            this.currentMap = observedScopeMapEnsureMap;
            Object obj = observedScopeMapEnsureMap.currentScope;
            IdentityArrayIntMap identityArrayIntMap = observedScopeMapEnsureMap.currentScopeReads;
            int i10 = observedScopeMapEnsureMap.currentToken;
            observedScopeMapEnsureMap.currentScope = scope;
            observedScopeMapEnsureMap.currentScopeReads = (IdentityArrayIntMap) observedScopeMapEnsureMap.scopeToValues.get(scope);
            if (observedScopeMapEnsureMap.currentToken == -1) {
                observedScopeMapEnsureMap.currentToken = SnapshotKt.currentSnapshot().getId();
            }
            SnapshotStateKt.observeDerivedStateRecalculations(observedScopeMapEnsureMap.getDerivedStateEnterObserver(), observedScopeMapEnsureMap.getDerivedStateExitObserver(), new Function0<Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$observeReads$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Snapshot.INSTANCE.observe(this.this$0.readObserver, null, block);
                }
            });
            Object obj2 = observedScopeMapEnsureMap.currentScope;
            Intrinsics.checkNotNull(obj2);
            observedScopeMapEnsureMap.clearObsoleteStateReads(obj2);
            observedScopeMapEnsureMap.currentScope = obj;
            observedScopeMapEnsureMap.currentScopeReads = identityArrayIntMap;
            observedScopeMapEnsureMap.currentToken = i10;
            this.currentMap = observedScopeMap;
            this.isPaused = z10;
        } catch (Throwable th2) {
            this.currentMap = observedScopeMap;
            this.isPaused = z10;
            throw th2;
        }
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.INSTANCE.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    public final void withNoObservations(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boolean z10 = this.isPaused;
        this.isPaused = true;
        try {
            block.invoke();
        } finally {
            this.isPaused = z10;
        }
    }

    public final void clear() {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    ObservedScopeMap[] content = mutableVector.getContent();
                    int i10 = 0;
                    do {
                        content[i10].clear();
                        i10++;
                    } while (i10 < size);
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
