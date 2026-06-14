package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.z;
import lf.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0000\u0018\u00002\u00020\u0001:\u0002«\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ%\u0010\u0013\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001f\u001a\u00020\n2,\u0010\u001e\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\n0\u001aj\u0002`\u001d0\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 J>\u0010'\u001a\u00028\u0000\"\u0004\b\u0000\u0010!2&\u0010&\u001a\"\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020$\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010%0#\u0012\u0004\u0012\u00028\u00000\"H\u0082\b¢\u0006\u0004\b'\u0010(J$\u0010*\u001a\u00028\u0000\"\u0004\b\u0000\u0010!2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0082\b¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\nH\u0002¢\u0006\u0004\b,\u0010\fJ)\u00102\u001a\u0002012\u0006\u0010-\u001a\u00020$2\u0006\u0010/\u001a\u00020.2\b\u00100\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b2\u00103J#\u00104\u001a\u0016\u0012\u0004\u0012\u00020$\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010%0#H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\n2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J$\u0010:\u001a\u00028\u0000\"\u0004\b\u0000\u0010!2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0082\b¢\u0006\u0004\b:\u0010+J\"\u0010=\u001a\u00020\n2\u0011\u0010<\u001a\r\u0012\u0004\u0012\u00020\n0)¢\u0006\u0002\b;H\u0016¢\u0006\u0004\b=\u0010>J\u0015\u0010A\u001a\u00020\n2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\"\u0010C\u001a\u00020\n2\u0011\u0010<\u001a\r\u0012\u0004\u0012\u00020\n0)¢\u0006\u0002\b;H\u0016¢\u0006\u0004\bC\u0010>J\u000f\u0010D\u001a\u00020\nH\u0016¢\u0006\u0004\bD\u0010\fJ\u001d\u0010E\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\bE\u0010FJ\u001d\u0010G\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\bG\u0010HJ\u001d\u0010I\u001a\u00020\n2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0)H\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\bK\u0010\u0018J\u0017\u0010L\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\bL\u0010\u0018J\u000f\u0010M\u001a\u00020\u0011H\u0016¢\u0006\u0004\bM\u0010NJ+\u0010S\u001a\u00020\n2\u001a\u0010R\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020Q\u0012\u0006\u0012\u0004\u0018\u00010Q0P0OH\u0016¢\u0006\u0004\bS\u0010 J\u0017\u0010V\u001a\u00020\n2\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\nH\u0016¢\u0006\u0004\bX\u0010\fJ\u000f\u0010Y\u001a\u00020\nH\u0016¢\u0006\u0004\bY\u0010\fJ\u000f\u0010Z\u001a\u00020\nH\u0016¢\u0006\u0004\bZ\u0010\fJ\u000f\u0010[\u001a\u00020\nH\u0016¢\u0006\u0004\b[\u0010\fJ\u000f\u0010\\\u001a\u00020\nH\u0016¢\u0006\u0004\b\\\u0010\fJ5\u0010`\u001a\u00028\u0000\"\u0004\b\u0000\u0010]2\b\u0010^\u001a\u0004\u0018\u00010\u00012\u0006\u0010_\u001a\u00020?2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0016¢\u0006\u0004\b`\u0010aJ\u001f\u0010b\u001a\u0002012\u0006\u0010-\u001a\u00020$2\b\u00100\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bb\u0010cJ\u001f\u0010f\u001a\u00020\n2\u0006\u00100\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020$H\u0000¢\u0006\u0004\bd\u0010eJ\u001b\u0010j\u001a\u00020\n2\n\u0010U\u001a\u0006\u0012\u0002\b\u00030gH\u0000¢\u0006\u0004\bh\u0010iR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010kR\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010lR(\u0010o\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000f0mj\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f`n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010q\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR$\u0010v\u001a\u0012\u0012\u0004\u0012\u00020t0sj\b\u0012\u0004\u0012\u00020t`u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u001a\u00107\u001a\u0002068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u0010x\u001a\u0004\by\u0010zR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020$0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R$\u0010~\u001a\u0012\u0012\u0004\u0012\u00020$0sj\b\u0012\u0004\u0012\u00020$`u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010wR\u001e\u0010\u007f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030g0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010}R;\u0010\u001e\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\n0\u001aj\u0002`\u001d0\u00198\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010\u0080\u0001R=\u0010\u0081\u0001\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\n0\u001aj\u0002`\u001d0\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0080\u0001R\u001c\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020$0{8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010}R-\u0010\u0083\u0001\u001a\u0016\u0012\u0004\u0012\u00020$\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010%0#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R(\u0010\u0085\u0001\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010N\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001b\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010\u008c\u0001\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001b\u0010\u0093\u0001\u001a\u00020\u00118\u0006¢\u0006\u000f\n\u0006\b\u0093\u0001\u0010\u0086\u0001\u001a\u0005\b\u0093\u0001\u0010NR\u0019\u0010\u0094\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0086\u0001R3\u0010\u0095\u0001\u001a\r\u0012\u0004\u0012\u00020\n0)¢\u0006\u0002\b;8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0005\b\u0099\u0001\u0010>R\u0016\u0010\u009b\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010NR\u001d\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0O8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001d\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0O8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010\u009d\u0001R\u001d\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020$0O8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010\u009d\u0001R\u0013\u0010\u0007\u001a\u00020\u00068F¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u0016\u0010¥\u0001\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010NR\u0016\u0010¦\u0001\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010NR\u0016\u0010¨\u0001\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b§\u0001\u0010NR\u0016\u0010ª\u0001\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b©\u0001\u0010N¨\u0006¬\u0001"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/Applier;", "applier", "Lkotlin/coroutines/CoroutineContext;", "recomposeContext", "<init>", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "", "drainPendingModificationsForCompositionLocked", "()V", "drainPendingModificationsLocked", "", "", "values", "", "forgetConditionalScopes", "addPendingInvalidationsLocked", "(Ljava/util/Set;Z)V", "cleanUpDerivedStateObservations", "value", "invalidateScopeOfLocked", "(Ljava/lang/Object;)V", "", "Lkotlin/Function3;", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "Landroidx/compose/runtime/Change;", "changes", "applyChangesInLocked", "(Ljava/util/List;)V", "T", "Lkotlin/Function1;", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "block", "guardInvalidationsLocked", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlin/Function0;", "guardChanges", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "abandonChanges", "scope", "Landroidx/compose/runtime/Anchor;", "anchor", C4424m2.f43617p, "Landroidx/compose/runtime/InvalidationResult;", "invalidateChecked", "(Landroidx/compose/runtime/RecomposeScopeImpl;Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "takeInvalidations", "()Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/SlotTable;", "slotTable", "validateRecomposeScopeAnchors", "(Landroidx/compose/runtime/SlotTable;)V", "trackAbandonedValues", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "", C4240b4.i.W, "invalidateGroupsWithKey", "(I)V", "composeContent", "dispose", "recordModificationsOf", "(Ljava/util/Set;)V", "observesAnyOf", "(Ljava/util/Set;)Z", "prepareCompose", "(Lkotlin/jvm/functions/Function0;)V", "recordReadOf", "recordWriteOf", "recompose", "()Z", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContent", "Landroidx/compose/runtime/MovableContentState;", "state", "disposeUnusedMovableContent", "(Landroidx/compose/runtime/MovableContentState;)V", "applyChanges", "applyLateChanges", "changesApplied", "invalidateAll", "verifyConsistent", "R", TypedValues.TransitionType.S_TO, "groupIndex", "delegateInvalidations", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "invalidate", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "removeObservation$runtime_release", "(Ljava/lang/Object;Landroidx/compose/runtime/RecomposeScopeImpl;)V", "removeObservation", "Landroidx/compose/runtime/DerivedState;", "removeDerivedStateObservation$runtime_release", "(Landroidx/compose/runtime/DerivedState;)V", "removeDerivedStateObservation", "Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Applier;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "pendingModifications", "Ljava/util/concurrent/atomic/AtomicReference;", "lock", "Ljava/lang/Object;", "Ljava/util/HashSet;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/collections/HashSet;", "abandonSet", "Ljava/util/HashSet;", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "observations", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "conditionallyInvalidatedScopes", "derivedStates", "Ljava/util/List;", "lateChanges", "observationsProcessed", "invalidations", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "pendingInvalidScopes", "Z", "getPendingInvalidScopes$runtime_release", "setPendingInvalidScopes$runtime_release", "(Z)V", "invalidationDelegate", "Landroidx/compose/runtime/CompositionImpl;", "invalidationDelegateGroup", "I", "Landroidx/compose/runtime/ComposerImpl;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "_recomposeContext", "Lkotlin/coroutines/CoroutineContext;", "isRoot", "disposed", "composable", "Lkotlin/jvm/functions/Function2;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "getAreChildrenComposing", "areChildrenComposing", "getObservedObjects$runtime_release", "()Ljava/util/List;", "observedObjects", "getDerivedStateDependencies$runtime_release", "derivedStateDependencies", "getConditionalScopes$runtime_release", "conditionalScopes", "getRecomposeContext", "()Lkotlin/coroutines/CoroutineContext;", "isComposing", "isDisposed", "getHasPendingChanges", "hasPendingChanges", "getHasInvalidations", "hasInvalidations", "RememberEventDispatcher", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CompositionImpl implements ControlledComposition {

    @Nullable
    private final CoroutineContext _recomposeContext;

    @NotNull
    private final HashSet<RememberObserver> abandonSet;

    @NotNull
    private final Applier<?> applier;

    @NotNull
    private final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes;

    @NotNull
    private Function2<? super Composer, ? super Integer, Unit> composable;

    @NotNull
    private final ComposerImpl composer;

    @NotNull
    private final HashSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;

    @NotNull
    private final IdentityScopeMap<DerivedState<?>> derivedStates;
    private boolean disposed;

    @Nullable
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;

    @NotNull
    private IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidations;
    private final boolean isRoot;

    @NotNull
    private final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> lateChanges;

    @NotNull
    private final Object lock;

    @NotNull
    private final IdentityScopeMap<RecomposeScopeImpl> observations;

    @NotNull
    private final IdentityScopeMap<RecomposeScopeImpl> observationsProcessed;

    @NotNull
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;

    @NotNull
    private final AtomicReference<Object> pendingModifications;

    @NotNull
    private final SlotTable slotTable;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0006\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u000eJ\u0006\u0010\u0013\u001a\u00020\u000eJ\u0010\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0016\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/CompositionImpl$RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "abandoning", "", "Landroidx/compose/runtime/RememberObserver;", "(Ljava/util/Set;)V", "deactivating", "", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "forgetting", "releasing", "remembering", "sideEffects", "Lkotlin/Function0;", "", C4424m2.f43617p, "dispatchAbandons", "dispatchNodeCallbacks", "dispatchRememberObservers", "dispatchSideEffects", "sideEffect", "effect", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class RememberEventDispatcher implements RememberManager {

        @NotNull
        private final Set<RememberObserver> abandoning;

        @Nullable
        private List<ComposeNodeLifecycleCallback> deactivating;

        @NotNull
        private final List<RememberObserver> forgetting;

        @Nullable
        private List<ComposeNodeLifecycleCallback> releasing;

        @NotNull
        private final List<RememberObserver> remembering;

        @NotNull
        private final List<Function0<Unit>> sideEffects;

        public RememberEventDispatcher(@NotNull Set<RememberObserver> abandoning) {
            Intrinsics.checkNotNullParameter(abandoning, "abandoning");
            this.abandoning = abandoning;
            this.remembering = new ArrayList();
            this.forgetting = new ArrayList();
            this.sideEffects = new ArrayList();
        }

        @Override // androidx.compose.runtime.RememberManager
        public void deactivating(@NotNull ComposeNodeLifecycleCallback instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            List arrayList = this.deactivating;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.deactivating = arrayList;
            }
            arrayList.add(instance);
        }

        public final void dispatchAbandons() {
            if (this.abandoning.isEmpty()) {
                return;
            }
            Object objBeginSection = Trace.INSTANCE.beginSection("Compose:abandons");
            try {
                Iterator<RememberObserver> it = this.abandoning.iterator();
                while (it.hasNext()) {
                    RememberObserver next = it.next();
                    it.remove();
                    next.onAbandoned();
                }
                Unit unit = Unit.f93236a;
                Trace.INSTANCE.endSection(objBeginSection);
            } catch (Throwable th2) {
                Trace.INSTANCE.endSection(objBeginSection);
                throw th2;
            }
        }

        /* JADX WARN: Finally extract failed */
        public final void dispatchNodeCallbacks() {
            Object objBeginSection;
            List<ComposeNodeLifecycleCallback> list = this.deactivating;
            List<ComposeNodeLifecycleCallback> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                objBeginSection = Trace.INSTANCE.beginSection("Compose:deactivations");
                try {
                    for (int size = list.size() - 1; -1 < size; size--) {
                        list.get(size).onDeactivate();
                    }
                    Unit unit = Unit.f93236a;
                    Trace.INSTANCE.endSection(objBeginSection);
                    list.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            List<ComposeNodeLifecycleCallback> list3 = this.releasing;
            List<ComposeNodeLifecycleCallback> list4 = list3;
            if (list4 == null || list4.isEmpty()) {
                return;
            }
            objBeginSection = Trace.INSTANCE.beginSection("Compose:releases");
            try {
                for (int size2 = list3.size() - 1; -1 < size2; size2--) {
                    list3.get(size2).onRelease();
                }
                Unit unit2 = Unit.f93236a;
                Trace.INSTANCE.endSection(objBeginSection);
                list3.clear();
            } finally {
                Trace.INSTANCE.endSection(objBeginSection);
            }
        }

        /* JADX WARN: Finally extract failed */
        public final void dispatchRememberObservers() {
            Object objBeginSection;
            if (!this.forgetting.isEmpty()) {
                objBeginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
                try {
                    for (int size = this.forgetting.size() - 1; -1 < size; size--) {
                        RememberObserver rememberObserver = this.forgetting.get(size);
                        if (!this.abandoning.contains(rememberObserver)) {
                            rememberObserver.onForgotten();
                        }
                    }
                    Unit unit = Unit.f93236a;
                    Trace.INSTANCE.endSection(objBeginSection);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.remembering.isEmpty()) {
                return;
            }
            objBeginSection = Trace.INSTANCE.beginSection("Compose:onRemembered");
            try {
                List<RememberObserver> list = this.remembering;
                int size2 = list.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    RememberObserver rememberObserver2 = list.get(i10);
                    this.abandoning.remove(rememberObserver2);
                    rememberObserver2.onRemembered();
                }
                Unit unit2 = Unit.f93236a;
                Trace.INSTANCE.endSection(objBeginSection);
            } finally {
                Trace.INSTANCE.endSection(objBeginSection);
            }
        }

        public final void dispatchSideEffects() {
            if (this.sideEffects.isEmpty()) {
                return;
            }
            Object objBeginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
            try {
                List<Function0<Unit>> list = this.sideEffects;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).invoke();
                }
                this.sideEffects.clear();
                Unit unit = Unit.f93236a;
                Trace.INSTANCE.endSection(objBeginSection);
            } catch (Throwable th2) {
                Trace.INSTANCE.endSection(objBeginSection);
                throw th2;
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void forgetting(@NotNull RememberObserver instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            int iLastIndexOf = this.remembering.lastIndexOf(instance);
            if (iLastIndexOf < 0) {
                this.forgetting.add(instance);
            } else {
                this.remembering.remove(iLastIndexOf);
                this.abandoning.remove(instance);
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void releasing(@NotNull ComposeNodeLifecycleCallback instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            List arrayList = this.releasing;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.releasing = arrayList;
            }
            arrayList.add(instance);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void remembering(@NotNull RememberObserver instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            int iLastIndexOf = this.forgetting.lastIndexOf(instance);
            if (iLastIndexOf < 0) {
                this.remembering.add(instance);
            } else {
                this.forgetting.remove(iLastIndexOf);
                this.abandoning.remove(instance);
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void sideEffect(@NotNull Function0<Unit> effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            this.sideEffects.add(effect);
        }
    }

    public CompositionImpl(@NotNull CompositionContext parent, @NotNull Applier<?> applier, @Nullable CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(applier, "applier");
        this.parent = parent;
        this.applier = applier;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        HashSet<RememberObserver> hashSet = new HashSet<>();
        this.abandonSet = hashSet;
        SlotTable slotTable = new SlotTable();
        this.slotTable = slotTable;
        this.observations = new IdentityScopeMap<>();
        this.conditionallyInvalidatedScopes = new HashSet<>();
        this.derivedStates = new IdentityScopeMap<>();
        ArrayList arrayList = new ArrayList();
        this.changes = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.lateChanges = arrayList2;
        this.observationsProcessed = new IdentityScopeMap<>();
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, parent, slotTable, hashSet, arrayList, arrayList2, this);
        parent.registerComposer$runtime_release(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = coroutineContext;
        this.isRoot = parent instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m1223getLambda1$runtime_release();
    }

    private final void abandonChanges() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        this.abandonSet.clear();
    }

    private final void addPendingInvalidationsLocked(Set<? extends Object> values, boolean forgetConditionalScopes) {
        Object obj;
        HashSet hashSet;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Iterator<? extends Object> it = values.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) next).invalidateForResult(null);
            } else {
                addPendingInvalidationsLocked$invalidate(this, forgetConditionalScopes, ref$ObjectRef, next);
                IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
                int iFind = identityScopeMap.find(next);
                if (iFind >= 0) {
                    IdentityArraySet identityArraySetScopeSetAt = identityScopeMap.scopeSetAt(iFind);
                    int size = identityArraySetScopeSetAt.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        addPendingInvalidationsLocked$invalidate(this, forgetConditionalScopes, ref$ObjectRef, (DerivedState) identityArraySetScopeSetAt.get(i10));
                    }
                }
            }
        }
        if (!forgetConditionalScopes || this.conditionallyInvalidatedScopes.isEmpty()) {
            HashSet hashSet2 = (HashSet) ref$ObjectRef.f93280b;
            if (hashSet2 != null) {
                IdentityScopeMap<RecomposeScopeImpl> identityScopeMap2 = this.observations;
                int size2 = identityScopeMap2.getSize();
                int i11 = 0;
                for (int i12 = 0; i12 < size2; i12++) {
                    int i13 = identityScopeMap2.getValueOrder()[i12];
                    IdentityArraySet<RecomposeScopeImpl> identityArraySet = identityScopeMap2.getScopeSets()[i13];
                    Intrinsics.checkNotNull(identityArraySet);
                    int size3 = identityArraySet.size();
                    int i14 = 0;
                    for (int i15 = 0; i15 < size3; i15++) {
                        Object obj2 = identityArraySet.getValues()[i15];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        if (!hashSet2.contains((RecomposeScopeImpl) obj2)) {
                            if (i14 != i15) {
                                identityArraySet.getValues()[i14] = obj2;
                            }
                            i14++;
                        }
                    }
                    int size4 = identityArraySet.size();
                    for (int i16 = i14; i16 < size4; i16++) {
                        identityArraySet.getValues()[i16] = null;
                    }
                    identityArraySet.setSize(i14);
                    if (identityArraySet.size() > 0) {
                        if (i11 != i12) {
                            int i17 = identityScopeMap2.getValueOrder()[i11];
                            identityScopeMap2.getValueOrder()[i11] = i13;
                            identityScopeMap2.getValueOrder()[i12] = i17;
                        }
                        i11++;
                    }
                }
                int size5 = identityScopeMap2.getSize();
                for (int i18 = i11; i18 < size5; i18++) {
                    identityScopeMap2.getValues()[identityScopeMap2.getValueOrder()[i18]] = null;
                }
                identityScopeMap2.setSize(i11);
                cleanUpDerivedStateObservations();
                return;
            }
            return;
        }
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap3 = this.observations;
        int size6 = identityScopeMap3.getSize();
        int i19 = 0;
        int i20 = 0;
        while (i19 < size6) {
            int i21 = identityScopeMap3.getValueOrder()[i19];
            IdentityArraySet<RecomposeScopeImpl> identityArraySet2 = identityScopeMap3.getScopeSets()[i21];
            Intrinsics.checkNotNull(identityArraySet2);
            int size7 = identityArraySet2.size();
            int i22 = 0;
            int i23 = 0;
            while (i22 < size7) {
                Object obj3 = identityArraySet2.getValues()[i22];
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj3;
                Object obj4 = obj;
                if (!this.conditionallyInvalidatedScopes.contains(recomposeScopeImpl) && ((hashSet = (HashSet) ref$ObjectRef.f93280b) == null || !hashSet.contains(recomposeScopeImpl))) {
                    if (i23 != i22) {
                        identityArraySet2.getValues()[i23] = obj3;
                    }
                    i23++;
                }
                i22++;
                obj = obj4;
            }
            Object obj5 = obj;
            int size8 = identityArraySet2.size();
            for (int i24 = i23; i24 < size8; i24++) {
                identityArraySet2.getValues()[i24] = obj5;
            }
            identityArraySet2.setSize(i23);
            if (identityArraySet2.size() > 0) {
                if (i20 != i19) {
                    int i25 = identityScopeMap3.getValueOrder()[i20];
                    identityScopeMap3.getValueOrder()[i20] = i21;
                    identityScopeMap3.getValueOrder()[i19] = i25;
                }
                i20++;
            }
            i19++;
            obj = obj5;
        }
        Object obj6 = obj;
        int size9 = identityScopeMap3.getSize();
        for (int i26 = i20; i26 < size9; i26++) {
            identityScopeMap3.getValues()[identityScopeMap3.getValueOrder()[i26]] = obj6;
        }
        identityScopeMap3.setSize(i20);
        cleanUpDerivedStateObservations();
        this.conditionallyInvalidatedScopes.clear();
    }

    private static final void addPendingInvalidationsLocked$invalidate(CompositionImpl compositionImpl, boolean z10, Ref$ObjectRef ref$ObjectRef, Object obj) {
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = compositionImpl.observations;
        int iFind = identityScopeMap.find(obj);
        if (iFind >= 0) {
            IdentityArraySet identityArraySetScopeSetAt = identityScopeMap.scopeSetAt(iFind);
            int size = identityArraySetScopeSetAt.size();
            for (int i10 = 0; i10 < size; i10++) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) identityArraySetScopeSetAt.get(i10);
                if (!compositionImpl.observationsProcessed.remove(obj, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                    if (!recomposeScopeImpl.isConditional() || z10) {
                        HashSet hashSet = (HashSet) ref$ObjectRef.f93280b;
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            ref$ObjectRef.f93280b = hashSet;
                        }
                        hashSet.add(recomposeScopeImpl);
                    } else {
                        compositionImpl.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                    }
                }
            }
        }
    }

    private final void applyChangesInLocked(List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes) {
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        try {
            if (changes.isEmpty()) {
                if (this.lateChanges.isEmpty()) {
                    rememberEventDispatcher.dispatchAbandons();
                    return;
                }
                return;
            }
            Object objBeginSection = Trace.INSTANCE.beginSection("Compose:applyChanges");
            try {
                this.applier.onBeginChanges();
                SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                try {
                    Applier<?> applier = this.applier;
                    int size = changes.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        changes.get(i10).invoke(applier, slotWriterOpenWriter, rememberEventDispatcher);
                    }
                    changes.clear();
                    Unit unit = Unit.f93236a;
                    slotWriterOpenWriter.close();
                    this.applier.onEndChanges();
                    Trace trace = Trace.INSTANCE;
                    trace.endSection(objBeginSection);
                    rememberEventDispatcher.dispatchRememberObservers();
                    rememberEventDispatcher.dispatchNodeCallbacks();
                    rememberEventDispatcher.dispatchSideEffects();
                    if (this.pendingInvalidScopes) {
                        objBeginSection = trace.beginSection("Compose:unobserve");
                        try {
                            this.pendingInvalidScopes = false;
                            IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = this.observations;
                            int size2 = identityScopeMap.getSize();
                            int i11 = 0;
                            for (int i12 = 0; i12 < size2; i12++) {
                                int i13 = identityScopeMap.getValueOrder()[i12];
                                IdentityArraySet<RecomposeScopeImpl> identityArraySet = identityScopeMap.getScopeSets()[i13];
                                Intrinsics.checkNotNull(identityArraySet);
                                int size3 = identityArraySet.size();
                                int i14 = 0;
                                for (int i15 = 0; i15 < size3; i15++) {
                                    Object obj = identityArraySet.getValues()[i15];
                                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    if (((RecomposeScopeImpl) obj).getValid()) {
                                        if (i14 != i15) {
                                            identityArraySet.getValues()[i14] = obj;
                                        }
                                        i14++;
                                    }
                                }
                                int size4 = identityArraySet.size();
                                for (int i16 = i14; i16 < size4; i16++) {
                                    identityArraySet.getValues()[i16] = null;
                                }
                                identityArraySet.setSize(i14);
                                if (identityArraySet.size() > 0) {
                                    if (i11 != i12) {
                                        int i17 = identityScopeMap.getValueOrder()[i11];
                                        identityScopeMap.getValueOrder()[i11] = i13;
                                        identityScopeMap.getValueOrder()[i12] = i17;
                                    }
                                    i11++;
                                }
                            }
                            int size5 = identityScopeMap.getSize();
                            for (int i18 = i11; i18 < size5; i18++) {
                                identityScopeMap.getValues()[identityScopeMap.getValueOrder()[i18]] = null;
                            }
                            identityScopeMap.setSize(i11);
                            cleanUpDerivedStateObservations();
                            Unit unit2 = Unit.f93236a;
                            Trace.INSTANCE.endSection(objBeginSection);
                        } finally {
                        }
                    }
                    if (this.lateChanges.isEmpty()) {
                        rememberEventDispatcher.dispatchAbandons();
                    }
                } finally {
                    slotWriterOpenWriter.close();
                }
            } finally {
                Trace.INSTANCE.endSection(objBeginSection);
            }
        } finally {
            if (this.lateChanges.isEmpty()) {
                rememberEventDispatcher.dispatchAbandons();
            }
        }
    }

    private final void cleanUpDerivedStateObservations() {
        IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
        int size = identityScopeMap.getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = identityScopeMap.getValueOrder()[i11];
            IdentityArraySet<DerivedState<?>> identityArraySet = identityScopeMap.getScopeSets()[i12];
            Intrinsics.checkNotNull(identityArraySet);
            int size2 = identityArraySet.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size2; i14++) {
                Object obj = identityArraySet.getValues()[i14];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (this.observations.contains((DerivedState) obj)) {
                    if (i13 != i14) {
                        identityArraySet.getValues()[i13] = obj;
                    }
                    i13++;
                }
            }
            int size3 = identityArraySet.size();
            for (int i15 = i13; i15 < size3; i15++) {
                identityArraySet.getValues()[i15] = null;
            }
            identityArraySet.setSize(i13);
            if (identityArraySet.size() > 0) {
                if (i10 != i11) {
                    int i16 = identityScopeMap.getValueOrder()[i10];
                    identityScopeMap.getValueOrder()[i10] = i12;
                    identityScopeMap.getValueOrder()[i11] = i16;
                }
                i10++;
            }
        }
        int size4 = identityScopeMap.getSize();
        for (int i17 = i10; i17 < size4; i17++) {
            identityScopeMap.getValues()[identityScopeMap.getValueOrder()[i17]] = null;
        }
        identityScopeMap.setSize(i10);
        Iterator<RecomposeScopeImpl> it = this.conditionallyInvalidatedScopes.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator()");
        while (it.hasNext()) {
            if (!it.next().isConditional()) {
                it.remove();
            }
        }
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object andSet = this.pendingModifications.getAndSet(CompositionKt.PendingApplyNoModifications);
        if (andSet != null) {
            if (Intrinsics.areEqual(andSet, CompositionKt.PendingApplyNoModifications)) {
                ComposerKt.composeRuntimeError("pending composition has not been applied");
                throw new g();
            }
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new g();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, true);
            }
        }
    }

    private final void drainPendingModificationsLocked() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (Intrinsics.areEqual(andSet, CompositionKt.PendingApplyNoModifications)) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
            return;
        }
        if (andSet == null) {
            ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new g();
        }
        ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new g();
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    private final <T> T guardChanges(Function0<? extends T> block) throws Exception {
        try {
            try {
                T tInvoke = block.invoke();
                z.b(1);
                z.a(1);
                return tInvoke;
            } catch (Throwable th2) {
                z.b(1);
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                z.a(1);
                throw th2;
            }
        } catch (Exception e10) {
            abandonChanges();
            throw e10;
        }
    }

    private final <T> T guardInvalidationsLocked(Function1<? super IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>>, ? extends T> block) throws Exception {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMapTakeInvalidations = takeInvalidations();
        try {
            return block.invoke(identityArrayMapTakeInvalidations);
        } catch (Exception e10) {
            this.invalidations = identityArrayMapTakeInvalidations;
            throw e10;
        }
    }

    private final InvalidationResult invalidateChecked(RecomposeScopeImpl scope, Anchor anchor, Object instance) {
        synchronized (this.lock) {
            try {
                CompositionImpl compositionImpl = this.invalidationDelegate;
                if (compositionImpl == null || !this.slotTable.groupContainsAnchor(this.invalidationDelegateGroup, anchor)) {
                    compositionImpl = null;
                }
                if (compositionImpl == null) {
                    if (isComposing() && this.composer.tryImminentInvalidation$runtime_release(scope, instance)) {
                        return InvalidationResult.IMMINENT;
                    }
                    if (instance == null) {
                        this.invalidations.set(scope, null);
                    } else {
                        CompositionKt.addValue(this.invalidations, scope, instance);
                    }
                }
                if (compositionImpl != null) {
                    return compositionImpl.invalidateChecked(scope, anchor, instance);
                }
                this.parent.invalidate$runtime_release(this);
                return isComposing() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
            } finally {
            }
        }
    }

    private final void invalidateScopeOfLocked(Object value) {
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = this.observations;
        int iFind = identityScopeMap.find(value);
        if (iFind >= 0) {
            IdentityArraySet identityArraySetScopeSetAt = identityScopeMap.scopeSetAt(iFind);
            int size = identityArraySetScopeSetAt.size();
            for (int i10 = 0; i10 < size; i10++) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) identityArraySetScopeSetAt.get(i10);
                if (recomposeScopeImpl.invalidateForResult(value) == InvalidationResult.IMMINENT) {
                    this.observationsProcessed.add(value, recomposeScopeImpl);
                }
            }
        }
    }

    private final IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations() {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap = this.invalidations;
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        return identityArrayMap;
    }

    private final <T> T trackAbandonedValues(Function0<? extends T> block) {
        try {
            T tInvoke = block.invoke();
            z.b(1);
            z.a(1);
            return tInvoke;
        } catch (Throwable th2) {
            z.b(1);
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            z.a(1);
            throw th2;
        }
    }

    private final void validateRecomposeScopeAnchors(SlotTable slotTable) {
        Object[] slots = slotTable.getSlots();
        ArrayList arrayList = new ArrayList();
        for (Object obj : slots) {
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i10);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !slotTable.slotsOf$runtime_release(anchor.toIndexFor(slotTable)).contains(recomposeScopeImpl2)) {
                throw new IllegalStateException(("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + ArraysKt.indexOf((RecomposeScopeImpl[]) slotTable.getSlots(), recomposeScopeImpl2)).toString());
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                        }
                        throw th2;
                    } catch (Exception e10) {
                        abandonChanges();
                        throw e10;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (!this.lateChanges.isEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                        }
                        throw th2;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                } catch (Exception e10) {
                    abandonChanges();
                    throw e10;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime_release();
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                        }
                        throw th2;
                    } catch (Exception e10) {
                        abandonChanges();
                        throw e10;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        try {
            synchronized (this.lock) {
                drainPendingModificationsForCompositionLocked();
                IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMapTakeInvalidations = takeInvalidations();
                try {
                    this.composer.composeContent$runtime_release(identityArrayMapTakeInvalidations, content);
                    Unit unit = Unit.f93236a;
                } catch (Exception e10) {
                    this.invalidations = identityArrayMapTakeInvalidations;
                    throw e10;
                }
            }
        } finally {
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(@Nullable ControlledComposition to, int groupIndex, @NotNull Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (to == null || Intrinsics.areEqual(to, this) || groupIndex < 0) {
            return block.invoke();
        }
        this.invalidationDelegate = (CompositionImpl) to;
        this.invalidationDelegateGroup = groupIndex;
        try {
            return block.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            try {
                if (!this.disposed) {
                    boolean z10 = true;
                    this.disposed = true;
                    this.composable = ComposableSingletons$CompositionKt.INSTANCE.m1224getLambda2$runtime_release();
                    List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> deferredChanges$runtime_release = this.composer.getDeferredChanges$runtime_release();
                    if (deferredChanges$runtime_release != null) {
                        applyChangesInLocked(deferredChanges$runtime_release);
                    }
                    if (this.slotTable.getGroupsSize() <= 0) {
                        z10 = false;
                    }
                    if (z10 || !this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                        if (z10) {
                            SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                            try {
                                ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
                                Unit unit = Unit.f93236a;
                                slotWriterOpenWriter.close();
                                this.applier.clear();
                                rememberEventDispatcher.dispatchRememberObservers();
                                rememberEventDispatcher.dispatchNodeCallbacks();
                            } catch (Throwable th2) {
                                slotWriterOpenWriter.close();
                                throw th2;
                            }
                        }
                        rememberEventDispatcher.dispatchAbandons();
                    }
                    this.composer.dispose$runtime_release();
                }
                Unit unit2 = Unit.f93236a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.parent.unregisterComposition$runtime_release(this);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(@NotNull MovableContentState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        SlotWriter slotWriterOpenWriter = state.getSlotTable().openWriter();
        try {
            ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
            Unit unit = Unit.f93236a;
            slotWriterOpenWriter.close();
            rememberEventDispatcher.dispatchRememberObservers();
            rememberEventDispatcher.dispatchNodeCallbacks();
        } catch (Throwable th2) {
            slotWriterOpenWriter.close();
            throw th2;
        }
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getComposable() {
        return this.composable;
    }

    @NotNull
    public final List<RecomposeScopeImpl> getConditionalScopes$runtime_release() {
        return CollectionsKt.toList(this.conditionallyInvalidatedScopes);
    }

    @NotNull
    public final List<Object> getDerivedStateDependencies$runtime_release() {
        return ArraysKt.filterNotNull(this.derivedStates.getValues());
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z10;
        synchronized (this.lock) {
            z10 = this.invalidations.getSize() > 0;
        }
        return z10;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.lock) {
            hasPendingChanges$runtime_release = this.composer.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    @NotNull
    public final List<Object> getObservedObjects$runtime_release() {
        return ArraysKt.filterNotNull(this.observations.getValues());
    }

    /* JADX INFO: renamed from: getPendingInvalidScopes$runtime_release, reason: from getter */
    public final boolean getPendingInvalidScopes() {
        return this.pendingInvalidScopes;
    }

    @NotNull
    public final CoroutineContext getRecomposeContext() {
        CoroutineContext coroutineContext = this._recomposeContext;
        return coroutineContext == null ? this.parent.getRecomposeCoroutineContext$runtime_release() : coroutineContext;
    }

    @NotNull
    /* JADX INFO: renamed from: getSlotTable$runtime_release, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> references) {
        boolean z10 = true;
        Intrinsics.checkNotNullParameter(references, "references");
        int size = references.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (!Intrinsics.areEqual(references.get(i10).getFirst().getComposition(), this)) {
                z10 = false;
                break;
            }
            i10++;
        }
        ComposerKt.runtimeCheck(z10);
        try {
            this.composer.insertMovableContentReferences(references);
            Unit unit = Unit.f93236a;
        } finally {
        }
    }

    @NotNull
    public final InvalidationResult invalidate(@NotNull RecomposeScopeImpl scope, @Nullable Object instance) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (scope.getDefaultsInScope()) {
            scope.setDefaultsInvalid(true);
        }
        Anchor anchor = scope.getAnchor();
        return (anchor != null && this.slotTable.ownsAnchor(anchor) && anchor.getValid()) ? !anchor.getValid() ? InvalidationResult.IGNORED : !scope.getCanRecompose() ? InvalidationResult.IGNORED : invalidateChecked(scope, anchor, instance) : InvalidationResult.IGNORED;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized (this.lock) {
            try {
                for (Object obj : this.slotTable.getSlots()) {
                    RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.invalidate();
                    }
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void invalidateGroupsWithKey(int key) {
        List<RecomposeScopeImpl> listInvalidateGroupsWithKey$runtime_release;
        synchronized (this.lock) {
            listInvalidateGroupsWithKey$runtime_release = this.slotTable.invalidateGroupsWithKey$runtime_release(key);
        }
        if (listInvalidateGroupsWithKey$runtime_release != null) {
            int size = listInvalidateGroupsWithKey$runtime_release.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (listInvalidateGroupsWithKey$runtime_release.get(i10).invalidateForResult(null) != InvalidationResult.IGNORED) {
                }
            }
            return;
        }
        if (this.composer.forceRecomposeScopes$runtime_release()) {
            this.parent.invalidate$runtime_release(this);
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.getIsComposing();
    }

    @Override // androidx.compose.runtime.Composition
    /* JADX INFO: renamed from: isDisposed, reason: from getter */
    public boolean getDisposed() {
        return this.disposed;
    }

    /* JADX INFO: renamed from: isRoot, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean observesAnyOf(@NotNull Set<? extends Object> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        for (Object obj : values) {
            if (this.observations.contains(obj) || this.derivedStates.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.composer.prepareCompose$runtime_release(block);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean zRecompose$runtime_release;
        synchronized (this.lock) {
            try {
                drainPendingModificationsForCompositionLocked();
                try {
                    IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMapTakeInvalidations = takeInvalidations();
                    try {
                        zRecompose$runtime_release = this.composer.recompose$runtime_release(identityArrayMapTakeInvalidations);
                        if (!zRecompose$runtime_release) {
                            drainPendingModificationsLocked();
                        }
                    } catch (Exception e10) {
                        this.invalidations = identityArrayMapTakeInvalidations;
                        throw e10;
                    }
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zRecompose$runtime_release;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(@NotNull Set<? extends Object> values) {
        Object obj;
        Object objPlus;
        Intrinsics.checkNotNullParameter(values, "values");
        do {
            obj = this.pendingModifications.get();
            if (obj == null ? true : Intrinsics.areEqual(obj, CompositionKt.PendingApplyNoModifications)) {
                objPlus = values;
            } else if (obj instanceof Set) {
                objPlus = new Set[]{(Set) obj, values};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                objPlus = ArraysKt.plus((Set<? extends Object>[]) obj, values);
            }
        } while (!androidx.compose.animation.core.c.a(this.pendingModifications, obj, objPlus));
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
                Unit unit = Unit.f93236a;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordReadOf(@NotNull Object value) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        Intrinsics.checkNotNullParameter(value, "value");
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime_release = this.composer.getCurrentRecomposeScope$runtime_release()) == null) {
            return;
        }
        currentRecomposeScope$runtime_release.setUsed(true);
        this.observations.add(value, currentRecomposeScope$runtime_release);
        if (value instanceof DerivedState) {
            this.derivedStates.removeScope(value);
            for (Object obj : ((DerivedState) value).getDependencies()) {
                if (obj == null) {
                    break;
                }
                this.derivedStates.add(obj, value);
            }
        }
        currentRecomposeScope$runtime_release.recordRead(value);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.lock) {
            try {
                invalidateScopeOfLocked(value);
                IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
                int iFind = identityScopeMap.find(value);
                if (iFind >= 0) {
                    IdentityArraySet identityArraySetScopeSetAt = identityScopeMap.scopeSetAt(iFind);
                    int size = identityArraySetScopeSetAt.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        invalidateScopeOfLocked((DerivedState) identityArraySetScopeSetAt.get(i10));
                    }
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void removeDerivedStateObservation$runtime_release(@NotNull DerivedState<?> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.observations.contains(state)) {
            return;
        }
        this.derivedStates.removeScope(state);
    }

    public final void removeObservation$runtime_release(@NotNull Object instance, @NotNull RecomposeScopeImpl scope) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.observations.remove(instance, scope);
    }

    public final void setComposable(@NotNull Function2<? super Composer, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.composable = function2;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (this.disposed) {
            throw new IllegalStateException("The composition is disposed");
        }
        this.composable = content;
        this.parent.composeInitial$runtime_release(this, content);
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z10) {
        this.pendingInvalidScopes = z10;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.lock) {
            try {
                if (!isComposing()) {
                    this.composer.verifyConsistent$runtime_release();
                    this.slotTable.verifyWellFormed();
                    validateRecomposeScopeAnchors(this.slotTable);
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i10 & 4) != 0 ? null : coroutineContext);
    }
}
