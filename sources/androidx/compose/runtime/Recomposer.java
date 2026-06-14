package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import eg.s;
import eg.u0;
import hg.i;
import hg.l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.g;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 Å\u00012\u00020\u0001:\nÅ\u0001Æ\u0001Ç\u0001È\u0001É\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\n\u001a\u00020\u00072\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\fH\u0082\b¢\u0006\u0004\b\n\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u001a\u001a\u00020\u00072\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u000bJ#\u0010$\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0082@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J=\u0010-\u001a\u00020\u00072(\u0010,\u001a$\b\u0001\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070*\u0012\u0006\u0012\u0004\u0018\u00010+0(H\u0082@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\rH\u0002¢\u0006\u0004\b0\u00101J)\u00104\u001a\u0004\u0018\u00010\r2\u0006\u0010/\u001a\u00020\r2\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020+\u0018\u000102H\u0002¢\u0006\u0004\b4\u00105J3\u00109\u001a\b\u0012\u0004\u0012\u00020\r062\f\u00108\u001a\b\u0012\u0004\u0012\u000207062\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020+\u0018\u000102H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0007H\u0002¢\u0006\u0004\b;\u0010\u000bJ#\u0010<\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010/\u001a\u00020\rH\u0002¢\u0006\u0004\b<\u0010=J3\u0010>\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010/\u001a\u00020\r2\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020+\u0018\u000102H\u0002¢\u0006\u0004\b>\u0010?J<\u0010B\u001a\u00028\u0000\"\u0004\b\u0000\u0010@2\u0006\u0010/\u001a\u00020\r2\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020+\u0018\u0001022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000AH\u0082\b¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\u00072\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bF\u0010GJ\r\u0010I\u001a\u00020H¢\u0006\u0004\bI\u0010JJ\u0013\u0010K\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\bK\u0010'J\u001b\u0010M\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\u0002H\u0087@ø\u0001\u0000¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020\u0007¢\u0006\u0004\bO\u0010\u000bJ\r\u0010P\u001a\u00020\u0007¢\u0006\u0004\bP\u0010\u000bJ\u0013\u0010Q\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\bQ\u0010'J*\u0010V\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\r2\u0011\u0010S\u001a\r\u0012\u0004\u0012\u00020\u00070A¢\u0006\u0002\bRH\u0010¢\u0006\u0004\bT\u0010UJ\u0013\u0010W\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\bW\u0010'J\u001d\u0010]\u001a\u00020\u00072\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0XH\u0010¢\u0006\u0004\b[\u0010\\J\u0017\u0010_\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\rH\u0010¢\u0006\u0004\b^\u00101J\u0017\u0010a\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\rH\u0010¢\u0006\u0004\b`\u00101J\u0017\u0010c\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\rH\u0010¢\u0006\u0004\bb\u00101J\u0017\u0010h\u001a\u00020\u00072\u0006\u0010e\u001a\u00020dH\u0010¢\u0006\u0004\bf\u0010gJ\u0017\u0010l\u001a\u00020\u00072\u0006\u0010i\u001a\u000207H\u0010¢\u0006\u0004\bj\u0010kJ\u0017\u0010n\u001a\u00020\u00072\u0006\u0010i\u001a\u000207H\u0010¢\u0006\u0004\bm\u0010kJ\u001f\u0010s\u001a\u00020\u00072\u0006\u0010i\u001a\u0002072\u0006\u0010p\u001a\u00020oH\u0010¢\u0006\u0004\bq\u0010rJ\u0019\u0010v\u001a\u0004\u0018\u00010o2\u0006\u0010i\u001a\u000207H\u0010¢\u0006\u0004\bt\u0010uR$\u0010y\u001a\u00020w2\u0006\u0010x\u001a\u00020w8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0017\u0010\u0080\u0001\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001c\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001e\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00020\r0\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001f\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020+0X8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001e\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020\r0\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0089\u0001R\u001e\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00020\r0\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0089\u0001R\u001e\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u0002070\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u0089\u0001R4\u0010\u0091\u0001\u001a\u001f\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010+0\u0090\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002070\u0087\u00010\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R$\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020o0\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0092\u0001R\"\u0010\u0094\u0001\u001a\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0089\u0001R!\u0010\u0095\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0019\u0010\u009a\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001b\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001f\u0010 \u0001\u001a\n\u0012\u0005\u0012\u00030\u009f\u00010\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0018\u0010£\u0001\u001a\u00030¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R\u001c\u0010©\u0001\u001a\u00070¨\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0017\u0010\u00ad\u0001\u001a\u00020\u00188BX\u0082\u0004¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001R&\u0010²\u0001\u001a\n\u0012\u0005\u0012\u00030\u009f\u00010®\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b±\u0001\u0010\u000b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0017\u0010´\u0001\u001a\u00020\u00188BX\u0082\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010¬\u0001R\u0017\u0010¶\u0001\u001a\u00020\u00188BX\u0082\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¬\u0001R\u0017\u0010¸\u0001\u001a\u00020\u00188BX\u0082\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010¬\u0001R\u0016\u0010L\u001a\u00020\u00028PX\u0090\u0004¢\u0006\b\u001a\u0006\b¹\u0001\u0010§\u0001R\u001c\u0010½\u0001\u001a\n\u0012\u0005\u0012\u00030\u009f\u00010º\u00018F¢\u0006\b\u001a\u0006\b»\u0001\u0010¼\u0001R\u0014\u0010¿\u0001\u001a\u00020\u00188F¢\u0006\b\u001a\u0006\b¾\u0001\u0010¬\u0001R\u0018\u0010Â\u0001\u001a\u00030\u0097\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0017\u0010Ä\u0001\u001a\u00020\u00188PX\u0090\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010¬\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Ê\u0001"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Lkotlinx/coroutines/CancellableContinuation;", "", "deriveStateLocked", "()Lkotlinx/coroutines/CancellableContinuation;", "recordComposerModificationsLocked", "()V", "Lkotlin/Function1;", "Landroidx/compose/runtime/ControlledComposition;", "onEachInvalidComposition", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/Job;", "callingJob", "registerRunnerJob", "(Lkotlinx/coroutines/Job;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "failedInitialComposition", "", "recoverable", "processCompositionError", "(Ljava/lang/Exception;Landroidx/compose/runtime/ControlledComposition;Z)V", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "resetErrorState", "()Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "retryFailedCompositions", "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "Landroidx/compose/runtime/ProduceFrameSignal;", "frameSignal", "runFrameLoop", "(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitWorkAvailable", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "block", "recompositionRunner", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "composition", "performInitialMovableContentInserts", "(Landroidx/compose/runtime/ControlledComposition;)V", "Landroidx/compose/runtime/collection/IdentityArraySet;", "modifiedValues", "performRecompose", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)Landroidx/compose/runtime/ControlledComposition;", "", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "performInsertValues", "(Ljava/util/List;Landroidx/compose/runtime/collection/IdentityArraySet;)Ljava/util/List;", "discardUnusedValues", "readObserverOf", "(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/jvm/functions/Function1;", "writeObserverOf", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;)Lkotlin/jvm/functions/Function1;", "T", "Lkotlin/Function0;", "composing", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/collection/IdentityArraySet;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "snapshot", "applyAndCheck", "(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "Landroidx/compose/runtime/RecomposerInfo;", "asRecomposerInfo", "()Landroidx/compose/runtime/RecomposerInfo;", "runRecomposeAndApplyChanges", "recomposeCoroutineContext", "runRecomposeConcurrentlyAndApplyChanges", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", MenuActionType.CANCEL, "close", "join", "Landroidx/compose/runtime/Composable;", "content", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composeInitial", "awaitIdle", "", "Landroidx/compose/runtime/tooling/CompositionData;", D5.Q, "recordInspectionTable$runtime_release", "(Ljava/util/Set;)V", "recordInspectionTable", "registerComposition$runtime_release", "registerComposition", "unregisterComposition$runtime_release", "unregisterComposition", "invalidate$runtime_release", "invalidate", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "invalidateScope$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "invalidateScope", TypedValues.Custom.S_REFERENCE, "insertMovableContent$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "deletedMovableContent$runtime_release", "deletedMovableContent", "Landroidx/compose/runtime/MovableContentState;", "data", "movableContentStateReleased$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;)V", "movableContentStateReleased", "movableContentStateResolve$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "", "<set-?>", "changeCount", "J", "getChangeCount", "()J", "Landroidx/compose/runtime/BroadcastFrameClock;", "broadcastFrameClock", "Landroidx/compose/runtime/BroadcastFrameClock;", "stateLock", "Ljava/lang/Object;", "runnerJob", "Lkotlinx/coroutines/Job;", "", "closeCause", "Ljava/lang/Throwable;", "", "knownCompositions", "Ljava/util/List;", "snapshotInvalidations", "Ljava/util/Set;", "compositionInvalidations", "compositionsAwaitingApply", "compositionValuesAwaitingInsert", "", "Landroidx/compose/runtime/MovableContent;", "compositionValuesRemoved", "Ljava/util/Map;", "compositionValueStatesAvailable", "failedCompositions", "workContinuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "concurrentCompositionsOutstanding", "I", "isClosed", "Z", "errorState", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/Recomposer$State;", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Leg/s;", "effectJob", "Leg/s;", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext$runtime_release", "()Lkotlin/coroutines/CoroutineContext;", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "recomposerInfo", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "getShouldKeepRecomposing", "()Z", "shouldKeepRecomposing", "Lkotlinx/coroutines/flow/Flow;", "getState", "()Lkotlinx/coroutines/flow/Flow;", "getState$annotations", "state", "getHasSchedulingWork", "hasSchedulingWork", "getHasFrameWorkLocked", "hasFrameWorkLocked", "getHasConcurrentFrameWorkLocked", "hasConcurrentFrameWorkLocked", "getRecomposeCoroutineContext$runtime_release", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentState", "()Lkotlinx/coroutines/flow/StateFlow;", "currentState", "getHasPendingWork", "hasPendingWork", "getCompoundHashKey$runtime_release", "()I", "compoundHashKey", "getCollectingParameterInformation$runtime_release", "collectingParameterInformation", y.f66058y, "HotReloadable", "RecomposerErrorState", "RecomposerInfoImpl", "State", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Recomposer extends CompositionContext {

    @NotNull
    private final MutableStateFlow _state;

    @NotNull
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;

    @Nullable
    private Throwable closeCause;

    @NotNull
    private final List<ControlledComposition> compositionInvalidations;

    @NotNull
    private final Map<MovableContentStateReference, MovableContentState> compositionValueStatesAvailable;

    @NotNull
    private final List<MovableContentStateReference> compositionValuesAwaitingInsert;

    @NotNull
    private final Map<MovableContent<Object>, List<MovableContentStateReference>> compositionValuesRemoved;

    @NotNull
    private final List<ControlledComposition> compositionsAwaitingApply;
    private int concurrentCompositionsOutstanding;

    @NotNull
    private final CoroutineContext effectCoroutineContext;

    @NotNull
    private final s effectJob;

    @Nullable
    private RecomposerErrorState errorState;

    @Nullable
    private List<ControlledComposition> failedCompositions;
    private boolean isClosed;

    @NotNull
    private final List<ControlledComposition> knownCompositions;

    @NotNull
    private final RecomposerInfoImpl recomposerInfo;

    @Nullable
    private Job runnerJob;

    @NotNull
    private Set<Object> snapshotInvalidations;

    @NotNull
    private final Object stateLock;

    @Nullable
    private CancellableContinuation workContinuation;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final MutableStateFlow _runningRecomposers = l0.a(ExtensionsKt.persistentSetOf());

    @NotNull
    private static final AtomicReference<Boolean> _hotReloadEnabled = new AtomicReference<>(Boolean.FALSE);

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u000bR\u00020\fH\u0002J\r\u0010\u0016\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0017J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0000¢\u0006\u0002\b\u001bJ\u0015\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ\u0015\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0001H\u0000¢\u0006\u0002\b\"J\u0014\u0010#\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u000bR\u00020\fH\u0002J\r\u0010$\u001a\u00020\u0001H\u0000¢\u0006\u0002\b%J\u0015\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0005H\u0000¢\u0006\u0002\b(R.\u0010\u0003\u001a\"\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004j\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u000bR\u00020\f0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006)"}, d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "()V", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "_runningRecomposers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/Recomposer;", "runningRecomposers", "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/compose/runtime/RecomposerInfo;", "getRunningRecomposers", "()Lkotlinx/coroutines/flow/StateFlow;", "addRunning", "", "info", "clearErrors", "clearErrors$runtime_release", "getCurrentErrors", "", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentErrors$runtime_release", "invalidateGroupsWithKey", C4240b4.i.W, "", "invalidateGroupsWithKey$runtime_release", "loadStateAndComposeForHotReload", "token", "loadStateAndComposeForHotReload$runtime_release", "removeRunning", "saveStateAndDisposeForHotReload", "saveStateAndDisposeForHotReload$runtime_release", "setHotReloadEnabled", "value", "setHotReloadEnabled$runtime_release", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addRunning(RecomposerInfoImpl info) {
            PersistentSet persistentSet;
            PersistentSet persistentSetAdd;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                persistentSetAdd = persistentSet.add(info);
                if (persistentSet == persistentSetAdd) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.b(persistentSet, persistentSetAdd));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeRunning(RecomposerInfoImpl info) {
            PersistentSet persistentSet;
            PersistentSet persistentSetRemove;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                persistentSetRemove = persistentSet.remove(info);
                if (persistentSet == persistentSetRemove) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.b(persistentSet, persistentSetRemove));
        }

        public final void clearErrors$runtime_release() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorState recomposerErrorStateResetErrorState = ((RecomposerInfoImpl) it.next()).resetErrorState();
                if (recomposerErrorStateResetErrorState != null) {
                    arrayList.add(recomposerErrorStateResetErrorState);
                }
            }
        }

        @NotNull
        public final List<RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorInfo currentError = ((RecomposerInfoImpl) it.next()).getCurrentError();
                if (currentError != null) {
                    arrayList.add(currentError);
                }
            }
            return arrayList;
        }

        @NotNull
        public final StateFlow getRunningRecomposers() {
            return Recomposer._runningRecomposers;
        }

        public final void invalidateGroupsWithKey$runtime_release(int key) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            for (RecomposerInfoImpl recomposerInfoImpl : (Iterable) Recomposer._runningRecomposers.getValue()) {
                RecomposerErrorInfo currentError = recomposerInfoImpl.getCurrentError();
                if (currentError == null || currentError.getRecoverable()) {
                    recomposerInfoImpl.resetErrorState();
                    recomposerInfoImpl.invalidateGroupsWithKey(key);
                    recomposerInfoImpl.retryFailedCompositions();
                }
            }
        }

        public final void loadStateAndComposeForHotReload$runtime_release(@NotNull Object token) {
            Intrinsics.checkNotNullParameter(token, "token");
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterator it = ((Iterable) Recomposer._runningRecomposers.getValue()).iterator();
            while (it.hasNext()) {
                ((RecomposerInfoImpl) it.next()).resetErrorState();
            }
            List list = (List) token;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((HotReloadable) list.get(i10)).resetContent();
            }
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((HotReloadable) list.get(i11)).recompose();
            }
            Iterator it2 = ((Iterable) Recomposer._runningRecomposers.getValue()).iterator();
            while (it2.hasNext()) {
                ((RecomposerInfoImpl) it2.next()).retryFailedCompositions();
            }
        }

        @NotNull
        public final Object saveStateAndDisposeForHotReload$runtime_release() {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((RecomposerInfoImpl) it.next()).saveStateAndDisposeForHotReload());
            }
            return arrayList;
        }

        public final void setHotReloadEnabled$runtime_release(boolean value) {
            Recomposer._hotReloadEnabled.set(Boolean.valueOf(value));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007R\u001b\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/Recomposer$HotReloadable;", "", "composition", "Landroidx/compose/runtime/CompositionImpl;", "(Landroidx/compose/runtime/CompositionImpl;)V", "composable", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/jvm/functions/Function2;", "clearContent", "recompose", "resetContent", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class HotReloadable {

        @NotNull
        private Function2<? super Composer, ? super Integer, Unit> composable;

        @NotNull
        private final CompositionImpl composition;

        public HotReloadable(@NotNull CompositionImpl composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            this.composition = composition;
            this.composable = composition.getComposable();
        }

        public final void clearContent() {
            if (this.composition.getIsRoot()) {
                this.composition.setContent(ComposableSingletons$RecomposerKt.INSTANCE.m1225getLambda1$runtime_release());
            }
        }

        public final void recompose() {
            if (this.composition.getIsRoot()) {
                this.composition.setContent(this.composable);
            }
        }

        public final void resetContent() {
            this.composition.setComposable(this.composable);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007R\u0018\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "Landroidx/compose/runtime/RecomposerErrorInfo;", "recoverable", "", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(ZLjava/lang/Exception;)V", "getCause", "()Ljava/lang/Exception;", "getRecoverable", "()Z", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class RecomposerErrorState implements RecomposerErrorInfo {

        @NotNull
        private final Exception cause;
        private final boolean recoverable;

        public RecomposerErrorState(boolean z10, @NotNull Exception cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.recoverable = z10;
            this.cause = cause;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        @NotNull
        public Exception getCause() {
            return this.cause;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public boolean getRecoverable() {
            return this.recoverable;
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0006\u0010\u001a\u001a\u00020\u0015J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cR\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/RecomposerInfo;", "(Landroidx/compose/runtime/Recomposer;)V", "changeCount", "", "getChangeCount", "()J", "currentError", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentError", "()Landroidx/compose/runtime/RecomposerErrorInfo;", "hasPendingWork", "", "getHasPendingWork", "()Z", "state", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/compose/runtime/Recomposer$State;", "getState", "()Lkotlinx/coroutines/flow/Flow;", "invalidateGroupsWithKey", "", C4240b4.i.W, "", "resetErrorState", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "retryFailedCompositions", "saveStateAndDisposeForHotReload", "", "Landroidx/compose/runtime/Recomposer$HotReloadable;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class RecomposerInfoImpl implements RecomposerInfo {
        public RecomposerInfoImpl() {
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public long getChangeCount() {
            return Recomposer.this.getChangeCount();
        }

        @Nullable
        public final RecomposerErrorInfo getCurrentError() {
            RecomposerErrorState recomposerErrorState;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                recomposerErrorState = recomposer.errorState;
            }
            return recomposerErrorState;
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public boolean getHasPendingWork() {
            return Recomposer.this.getHasPendingWork();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        @NotNull
        public Flow getState() {
            return Recomposer.this.getCurrentState();
        }

        public final void invalidateGroupsWithKey(int key) {
            List mutableList;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                mutableList = CollectionsKt.toMutableList((Collection) recomposer.knownCompositions);
            }
            ArrayList arrayList = new ArrayList(mutableList.size());
            int size = mutableList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ControlledComposition controlledComposition = (ControlledComposition) mutableList.get(i10);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((CompositionImpl) arrayList.get(i11)).invalidateGroupsWithKey(key);
            }
        }

        @Nullable
        public final RecomposerErrorState resetErrorState() {
            return Recomposer.this.resetErrorState();
        }

        public final void retryFailedCompositions() {
            Recomposer.this.retryFailedCompositions();
        }

        @NotNull
        public final List<HotReloadable> saveStateAndDisposeForHotReload() {
            List mutableList;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                mutableList = CollectionsKt.toMutableList((Collection) recomposer.knownCompositions);
            }
            ArrayList arrayList = new ArrayList(mutableList.size());
            int size = mutableList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ControlledComposition controlledComposition = (ControlledComposition) mutableList.get(i10);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                HotReloadable hotReloadable = new HotReloadable((CompositionImpl) arrayList.get(i11));
                hotReloadable.clearContent();
                arrayList2.add(hotReloadable);
            }
            return arrayList2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$awaitIdle$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.runtime.Recomposer$awaitIdle$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<State, Continuation, Object> {
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
        public final Object invoke(@NotNull State state, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(state, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(((State) this.L$0).compareTo(State.Idle) > 0);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$join$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
    static final class C15812 extends k implements Function2<State, Continuation, Object> {
        /* synthetic */ Object L$0;
        int label;

        C15812(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C15812 c15812 = new C15812(continuation);
            c15812.L$0 = obj;
            return c15812;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull State state, @Nullable Continuation continuation) {
            return ((C15812) create(state, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(((State) this.L$0) == State.ShutDown);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {898}, m = "invokeSuspend")
    static final class C15822 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function3<CoroutineScope, MonotonicFrameClock, Continuation, Object> $block;
        final /* synthetic */ MonotonicFrameClock $parentFrameClock;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {899}, m = "invokeSuspend")
        static final class C00972 extends k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ Function3<CoroutineScope, MonotonicFrameClock, Continuation, Object> $block;
            final /* synthetic */ MonotonicFrameClock $parentFrameClock;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00972(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation, ? extends Object> function3, MonotonicFrameClock monotonicFrameClock, Continuation continuation) {
                super(2, continuation);
                this.$block = function3;
                this.$parentFrameClock = monotonicFrameClock;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                C00972 c00972 = new C00972(this.$block, this.$parentFrameClock, continuation);
                c00972.L$0 = obj;
                return c00972;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = pf.b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    Function3<CoroutineScope, MonotonicFrameClock, Continuation, Object> function3 = this.$block;
                    MonotonicFrameClock monotonicFrameClock = this.$parentFrameClock;
                    this.label = 1;
                    if (function3.invoke(coroutineScope, monotonicFrameClock, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                return Unit.f93236a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                return ((C00972) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C15822(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation, ? extends Object> function3, MonotonicFrameClock monotonicFrameClock, Continuation continuation) {
            super(2, continuation);
            this.$block = function3;
            this.$parentFrameClock = monotonicFrameClock;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C15822 c15822 = Recomposer.this.new C15822(this.$block, this.$parentFrameClock, continuation);
            c15822.L$0 = obj;
            return c15822;
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 233
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C15822.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C15822) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$runFrameLoop$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.runtime.Recomposer", f = "Recomposer.kt", l = {777, 784}, m = "runFrameLoop")
    static final class C15831 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C15831(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Recomposer.this.runFrameLoop(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {492, 510}, m = "invokeSuspend")
    static final class C15852 extends k implements Function3<CoroutineScope, MonotonicFrameClock, Continuation, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        C15852(Continuation continuation) {
            super(3, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$clearRecompositionState(List<ControlledComposition> list, List<MovableContentStateReference> list2, List<ControlledComposition> list3, Set<ControlledComposition> set, Set<ControlledComposition> set2) {
            list.clear();
            list2.clear();
            list3.clear();
            set.clear();
            set2.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
            list.clear();
            synchronized (recomposer.stateLock) {
                try {
                    List list2 = recomposer.compositionValuesAwaitingInsert;
                    int size = list2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.add((MovableContentStateReference) list2.get(i10));
                    }
                    recomposer.compositionValuesAwaitingInsert.clear();
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c3 -> B:11:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00e6 -> B:33:0x00ec). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 247
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C15852.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @NotNull MonotonicFrameClock monotonicFrameClock, @Nullable Continuation continuation) {
            C15852 c15852 = Recomposer.this.new C15852(continuation);
            c15852.L$0 = monotonicFrameClock;
            return c15852.invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", l = {746, 766, 767}, m = "invokeSuspend")
    static final class C15862 extends k implements Function3<CoroutineScope, MonotonicFrameClock, Continuation, Object> {
        final /* synthetic */ CoroutineContext $recomposeCoroutineContext;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ Recomposer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15862(CoroutineContext coroutineContext, Recomposer recomposer, Continuation continuation) {
            super(3, continuation);
            this.$recomposeCoroutineContext = coroutineContext;
            this.this$0 = recomposer;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a2, code lost:
        
            if (r10.awaitWorkAvailable(r20) == r2) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0177, code lost:
        
            if (kotlinx.coroutines.z.g(r0, r20) != r2) goto L60;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0157  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00a2 -> B:24:0x00a6). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 412
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C15862.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @NotNull MonotonicFrameClock monotonicFrameClock, @Nullable Continuation continuation) {
            C15862 c15862 = new C15862(this.$recomposeCoroutineContext, this.this$0, continuation);
            c15862.L$0 = coroutineScope;
            c15862.L$1 = monotonicFrameClock;
            return c15862.invokeSuspend(Unit.f93236a);
        }
    }

    public Recomposer(@NotNull CoroutineContext effectCoroutineContext) {
        Intrinsics.checkNotNullParameter(effectCoroutineContext, "effectCoroutineContext");
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Function0<Unit>() { // from class: androidx.compose.runtime.Recomposer$broadcastFrameClock$1
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
                CancellableContinuation cancellableContinuationDeriveStateLocked;
                Object obj = this.this$0.stateLock;
                Recomposer recomposer = this.this$0;
                synchronized (obj) {
                    cancellableContinuationDeriveStateLocked = recomposer.deriveStateLocked();
                    if (((Recomposer.State) recomposer._state.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                        throw u0.a("Recomposer shutdown; frame clock awaiter will never resume", recomposer.closeCause);
                    }
                }
                if (cancellableContinuationDeriveStateLocked != null) {
                    Result.Companion companion = Result.f93230c;
                    cancellableContinuationDeriveStateLocked.resumeWith(Result.b(Unit.f93236a));
                }
            }
        });
        this.broadcastFrameClock = broadcastFrameClock;
        this.stateLock = new Object();
        this.knownCompositions = new ArrayList();
        this.snapshotInvalidations = new LinkedHashSet();
        this.compositionInvalidations = new ArrayList();
        this.compositionsAwaitingApply = new ArrayList();
        this.compositionValuesAwaitingInsert = new ArrayList();
        this.compositionValuesRemoved = new LinkedHashMap();
        this.compositionValueStatesAvailable = new LinkedHashMap();
        this._state = l0.a(State.Inactive);
        s sVarA = z.a((Job) effectCoroutineContext.get(Job.N8));
        sVarA.q(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable final Throwable th2) {
                CancellableContinuation cancellableContinuation;
                CancellableContinuation cancellableContinuation2;
                CancellationException cancellationExceptionA = u0.a("Recomposer effect job completed", th2);
                Object obj = this.this$0.stateLock;
                final Recomposer recomposer = this.this$0;
                synchronized (obj) {
                    try {
                        Job job = recomposer.runnerJob;
                        cancellableContinuation = null;
                        if (job != null) {
                            recomposer._state.setValue(Recomposer.State.ShuttingDown);
                            if (recomposer.isClosed) {
                                if (recomposer.workContinuation != null) {
                                    cancellableContinuation2 = recomposer.workContinuation;
                                }
                                recomposer.workContinuation = null;
                                job.q(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th3) {
                                        invoke2(th3);
                                        return Unit.f93236a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@Nullable Throwable th3) {
                                        Object obj2 = recomposer.stateLock;
                                        Recomposer recomposer2 = recomposer;
                                        Throwable th4 = th2;
                                        synchronized (obj2) {
                                            if (th4 == null) {
                                                th4 = null;
                                            } else if (th3 != null) {
                                                try {
                                                    if (th3 instanceof CancellationException) {
                                                        th3 = null;
                                                    }
                                                    if (th3 != null) {
                                                        lf.c.a(th4, th3);
                                                    }
                                                } catch (Throwable th5) {
                                                    throw th5;
                                                }
                                            }
                                            recomposer2.closeCause = th4;
                                            recomposer2._state.setValue(Recomposer.State.ShutDown);
                                            Unit unit = Unit.f93236a;
                                        }
                                    }
                                });
                                cancellableContinuation = cancellableContinuation2;
                            } else {
                                job.cancel(cancellationExceptionA);
                            }
                            cancellableContinuation2 = null;
                            recomposer.workContinuation = null;
                            job.q(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th3) {
                                    invoke2(th3);
                                    return Unit.f93236a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@Nullable Throwable th3) {
                                    Object obj2 = recomposer.stateLock;
                                    Recomposer recomposer2 = recomposer;
                                    Throwable th4 = th2;
                                    synchronized (obj2) {
                                        if (th4 == null) {
                                            th4 = null;
                                        } else if (th3 != null) {
                                            try {
                                                if (th3 instanceof CancellationException) {
                                                    th3 = null;
                                                }
                                                if (th3 != null) {
                                                    lf.c.a(th4, th3);
                                                }
                                            } catch (Throwable th5) {
                                                throw th5;
                                            }
                                        }
                                        recomposer2.closeCause = th4;
                                        recomposer2._state.setValue(Recomposer.State.ShutDown);
                                        Unit unit = Unit.f93236a;
                                    }
                                }
                            });
                            cancellableContinuation = cancellableContinuation2;
                        } else {
                            recomposer.closeCause = cancellationExceptionA;
                            recomposer._state.setValue(Recomposer.State.ShutDown);
                            Unit unit = Unit.f93236a;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (cancellableContinuation != null) {
                    Result.Companion companion = Result.f93230c;
                    cancellableContinuation.resumeWith(Result.b(Unit.f93236a));
                }
            }
        });
        this.effectJob = sVarA;
        this.effectCoroutineContext = effectCoroutineContext.plus(broadcastFrameClock).plus(sVarA);
        this.recomposerInfo = new RecomposerInfoImpl();
    }

    private final void applyAndCheck(MutableSnapshot snapshot) {
        try {
            if (snapshot.apply() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            snapshot.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitWorkAvailable(Continuation continuation) {
        if (getHasSchedulingWork()) {
            return Unit.f93236a;
        }
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        synchronized (this.stateLock) {
            try {
                if (getHasSchedulingWork()) {
                    Result.Companion companion = Result.f93230c;
                    eVar.resumeWith(Result.b(Unit.f93236a));
                } else {
                    this.workContinuation = eVar;
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            g.c(continuation);
        }
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }

    private final <T> T composing(ControlledComposition composition, IdentityArraySet<Object> modifiedValues, Function0<? extends T> block) {
        MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, modifiedValues));
        try {
            Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
            try {
                return block.invoke();
            } finally {
                kotlin.jvm.internal.z.b(1);
                mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                kotlin.jvm.internal.z.a(1);
            }
        } finally {
            kotlin.jvm.internal.z.b(1);
            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
            kotlin.jvm.internal.z.a(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CancellableContinuation deriveStateLocked() {
        State state;
        if (((State) this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
            this.knownCompositions.clear();
            this.snapshotInvalidations = new LinkedHashSet();
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.compositionValuesAwaitingInsert.clear();
            this.failedCompositions = null;
            CancellableContinuation cancellableContinuation = this.workContinuation;
            if (cancellableContinuation != null) {
                CancellableContinuation.a.a(cancellableContinuation, null, 1, null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new LinkedHashSet();
            this.compositionInvalidations.clear();
            state = this.broadcastFrameClock.getHasAwaiters() ? State.InactivePendingWork : State.Inactive;
        } else {
            state = (this.compositionInvalidations.isEmpty() && this.snapshotInvalidations.isEmpty() && this.compositionsAwaitingApply.isEmpty() && this.compositionValuesAwaitingInsert.isEmpty() && this.concurrentCompositionsOutstanding <= 0 && !this.broadcastFrameClock.getHasAwaiters()) ? State.Idle : State.PendingWork;
        }
        this._state.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        CancellableContinuation cancellableContinuation2 = this.workContinuation;
        this.workContinuation = null;
        return cancellableContinuation2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardUnusedValues() {
        int i10;
        List listEmptyList;
        synchronized (this.stateLock) {
            try {
                if (this.compositionValuesRemoved.isEmpty()) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    List listFlatten = CollectionsKt.flatten(this.compositionValuesRemoved.values());
                    this.compositionValuesRemoved.clear();
                    listEmptyList = new ArrayList(listFlatten.size());
                    int size = listFlatten.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MovableContentStateReference movableContentStateReference = (MovableContentStateReference) listFlatten.get(i11);
                        listEmptyList.add(TuplesKt.to(movableContentStateReference, this.compositionValueStatesAvailable.get(movableContentStateReference)));
                    }
                    this.compositionValueStatesAvailable.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size2 = listEmptyList.size();
        for (i10 = 0; i10 < size2; i10++) {
            Pair pair = (Pair) listEmptyList.get(i10);
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.component1();
            MovableContentState movableContentState = (MovableContentState) pair.component2();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasConcurrentFrameWorkLocked() {
        return !this.compositionsAwaitingApply.isEmpty() || this.broadcastFrameClock.getHasAwaiters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasFrameWorkLocked() {
        return !this.compositionInvalidations.isEmpty() || this.broadcastFrameClock.getHasAwaiters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean getHasSchedulingWork() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.stateLock
            monitor-enter(r0)
            java.util.Set<java.lang.Object> r1 = r2.snapshotInvalidations     // Catch: java.lang.Throwable -> L22
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L22
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            java.util.List<androidx.compose.runtime.ControlledComposition> r1 = r2.compositionInvalidations     // Catch: java.lang.Throwable -> L22
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L22
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            androidx.compose.runtime.BroadcastFrameClock r1 = r2.broadcastFrameClock     // Catch: java.lang.Throwable -> L22
            boolean r1 = r1.getHasAwaiters()     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L20
            goto L24
        L20:
            r1 = 0
            goto L25
        L22:
            r1 = move-exception
            goto L27
        L24:
            r1 = 1
        L25:
            monitor-exit(r0)
            return r1
        L27:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.getHasSchedulingWork():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldKeepRecomposing() {
        boolean z10;
        synchronized (this.stateLock) {
            z10 = this.isClosed;
        }
        if (!z10) {
            return true;
        }
        Iterator it = this.effectJob.getChildren().iterator();
        while (it.hasNext()) {
            if (((Job) it.next()).isActive()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void getState$annotations() {
    }

    private final void performInitialMovableContentInserts(ControlledComposition composition) {
        synchronized (this.stateLock) {
            List<MovableContentStateReference> list = this.compositionValuesAwaitingInsert;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (Intrinsics.areEqual(list.get(i10).getComposition(), composition)) {
                    Unit unit = Unit.f93236a;
                    ArrayList arrayList = new ArrayList();
                    performInitialMovableContentInserts$fillToInsert(arrayList, this, composition);
                    while (!arrayList.isEmpty()) {
                        performInsertValues(arrayList, null);
                        performInitialMovableContentInserts$fillToInsert(arrayList, this, composition);
                    }
                    return;
                }
            }
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                Iterator<MovableContentStateReference> it = recomposer.compositionValuesAwaitingInsert.iterator();
                while (it.hasNext()) {
                    MovableContentStateReference next = it.next();
                    if (Intrinsics.areEqual(next.getComposition(), controlledComposition)) {
                        list.add(next);
                        it.remove();
                    }
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ControlledComposition> performInsertValues(List<MovableContentStateReference> references, IdentityArraySet<Object> modifiedValues) {
        ArrayList arrayList;
        HashMap map = new HashMap(references.size());
        int size = references.size();
        for (int i10 = 0; i10 < size; i10++) {
            MovableContentStateReference movableContentStateReference = references.get(i10);
            ControlledComposition composition = movableContentStateReference.getComposition();
            Object arrayList2 = map.get(composition);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(composition, arrayList2);
            }
            ((ArrayList) arrayList2).add(movableContentStateReference);
        }
        for (Map.Entry entry : map.entrySet()) {
            ControlledComposition controlledComposition = (ControlledComposition) entry.getKey();
            List list = (List) entry.getValue();
            ComposerKt.runtimeCheck(!controlledComposition.isComposing());
            MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, modifiedValues));
            try {
                Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
                try {
                    synchronized (this.stateLock) {
                        arrayList = new ArrayList(list.size());
                        int size2 = list.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) list.get(i11);
                            arrayList.add(TuplesKt.to(movableContentStateReference2, RecomposerKt.removeLastMultiValue(this.compositionValuesRemoved, movableContentStateReference2.getContent$runtime_release())));
                        }
                    }
                    controlledComposition.insertMovableContent(arrayList);
                    Unit unit = Unit.f93236a;
                } finally {
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                }
            } finally {
                applyAndCheck(mutableSnapshotTakeMutableSnapshot);
            }
        }
        return CollectionsKt.toList(map.keySet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ControlledComposition performRecompose(final ControlledComposition composition, final IdentityArraySet<Object> modifiedValues) {
        if (composition.isComposing() || composition.getDisposed()) {
            return null;
        }
        MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, modifiedValues));
        try {
            Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
            if (modifiedValues != null) {
                try {
                    if (modifiedValues.isNotEmpty()) {
                        composition.prepareCompose(new Function0<Unit>() { // from class: androidx.compose.runtime.Recomposer$performRecompose$1$1
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
                                IdentityArraySet<Object> identityArraySet = modifiedValues;
                                ControlledComposition controlledComposition = composition;
                                int size = identityArraySet.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    controlledComposition.recordWriteOf(identityArraySet.get(i10));
                                }
                            }
                        });
                    }
                } catch (Throwable th2) {
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th2;
                }
            }
            boolean zRecompose = composition.recompose();
            mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
            if (zRecompose) {
                return composition;
            }
            return null;
        } finally {
            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
        }
    }

    private final void processCompositionError(Exception e10, ControlledComposition failedInitialComposition, boolean recoverable) throws Exception {
        Boolean bool = _hotReloadEnabled.get();
        Intrinsics.checkNotNullExpressionValue(bool, "_hotReloadEnabled.get()");
        if (!bool.booleanValue() || (e10 instanceof ComposeRuntimeError)) {
            throw e10;
        }
        synchronized (this.stateLock) {
            try {
                ActualAndroid_androidKt.logError("Error was captured in composition while live edit was enabled.", e10);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.clear();
                this.snapshotInvalidations = new LinkedHashSet();
                this.compositionValuesAwaitingInsert.clear();
                this.compositionValuesRemoved.clear();
                this.compositionValueStatesAvailable.clear();
                this.errorState = new RecomposerErrorState(recoverable, e10);
                if (failedInitialComposition != null) {
                    List arrayList = this.failedCompositions;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.failedCompositions = arrayList;
                    }
                    if (!arrayList.contains(failedInitialComposition)) {
                        arrayList.add(failedInitialComposition);
                    }
                    this.knownCompositions.remove(failedInitialComposition);
                }
                deriveStateLocked();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static /* synthetic */ void processCompositionError$default(Recomposer recomposer, Exception exc, ControlledComposition controlledComposition, boolean z10, int i10, Object obj) throws Exception {
        if ((i10 & 2) != 0) {
            controlledComposition = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        recomposer.processCompositionError(exc, controlledComposition, z10);
    }

    private final Function1<Object, Unit> readObserverOf(final ControlledComposition composition) {
        return new Function1<Object, Unit>() { // from class: androidx.compose.runtime.Recomposer.readObserverOf.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object value) {
                Intrinsics.checkNotNullParameter(value, "value");
                composition.recordReadOf(value);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object recompositionRunner(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation, ? extends Object> function3, Continuation continuation) {
        Object objG = eg.g.g(this.broadcastFrameClock, new C15822(function3, MonotonicFrameClockKt.getMonotonicFrameClock(continuation.getContext()), null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordComposerModificationsLocked() {
        Set<? extends Object> set = this.snapshotInvalidations;
        if (set.isEmpty()) {
            return;
        }
        List<ControlledComposition> list = this.knownCompositions;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).recordModificationsOf(set);
            if (((State) this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
                break;
            }
        }
        this.snapshotInvalidations = new LinkedHashSet();
        if (deriveStateLocked() != null) {
            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRunnerJob(Job callingJob) {
        synchronized (this.stateLock) {
            Throwable th2 = this.closeCause;
            if (th2 != null) {
                throw th2;
            }
            if (((State) this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.runnerJob = callingJob;
            deriveStateLocked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecomposerErrorState resetErrorState() {
        RecomposerErrorState recomposerErrorState;
        synchronized (this.stateLock) {
            recomposerErrorState = this.errorState;
            if (recomposerErrorState != null) {
                this.errorState = null;
                deriveStateLocked();
            }
        }
        return recomposerErrorState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryFailedCompositions() {
        synchronized (this.stateLock) {
            try {
                List<ControlledComposition> list = this.failedCompositions;
                if (list == null) {
                    return;
                }
                while (!list.isEmpty()) {
                    ControlledComposition controlledComposition = (ControlledComposition) CollectionsKt.removeLast(list);
                    if (controlledComposition instanceof CompositionImpl) {
                        controlledComposition.invalidateAll();
                        controlledComposition.setContent(((CompositionImpl) controlledComposition).getComposable());
                        if (this.errorState != null) {
                            break;
                        }
                    }
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        if (r5.withFrameNanos(r10, r0) != r1) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a2 -> B:13:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object runFrameLoop(androidx.compose.runtime.MonotonicFrameClock r8, androidx.compose.runtime.ProduceFrameSignal r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.runtime.Recomposer.C15831
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = (androidx.compose.runtime.Recomposer.C15831) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = new androidx.compose.runtime.Recomposer$runFrameLoop$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L65
            if (r2 == r4) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            kotlin.d.b(r10)
        L3f:
            r10 = r9
            r9 = r2
            r2 = r8
            r8 = r5
            r5 = r6
            goto L73
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4d:
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            kotlin.d.b(r10)
            goto L8d
        L65:
            kotlin.d.b(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5 = r7
        L73:
            java.lang.Object r6 = r5.stateLock
            r0.L$0 = r5
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r10
            r0.L$4 = r2
            r0.label = r4
            java.lang.Object r6 = r9.awaitFrameRequest(r6, r0)
            if (r6 != r1) goto L88
            goto La4
        L88:
            r6 = r5
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L8d:
            androidx.compose.runtime.Recomposer$runFrameLoop$2 r10 = new androidx.compose.runtime.Recomposer$runFrameLoop$2
            r10.<init>()
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r2
            r0.L$3 = r9
            r0.L$4 = r8
            r0.label = r3
            java.lang.Object r10 = r5.withFrameNanos(r10, r0)
            if (r10 != r1) goto L3f
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.runFrameLoop(androidx.compose.runtime.MonotonicFrameClock, androidx.compose.runtime.ProduceFrameSignal, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Function1<Object, Unit> writeObserverOf(final ControlledComposition composition, final IdentityArraySet<Object> modifiedValues) {
        return new Function1<Object, Unit>() { // from class: androidx.compose.runtime.Recomposer.writeObserverOf.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object value) {
                Intrinsics.checkNotNullParameter(value, "value");
                composition.recordWriteOf(value);
                IdentityArraySet<Object> identityArraySet = modifiedValues;
                if (identityArraySet != null) {
                    identityArraySet.add(value);
                }
            }
        };
    }

    @NotNull
    public final RecomposerInfo asRecomposerInfo() {
        return this.recomposerInfo;
    }

    @Nullable
    public final Object awaitIdle(@NotNull Continuation continuation) {
        Object objK = i.k(i.V(getCurrentState(), new AnonymousClass2(null)), continuation);
        return objK == pf.b.g() ? objK : Unit.f93236a;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            try {
                if (((State) this._state.getValue()).compareTo(State.Idle) >= 0) {
                    this._state.setValue(State.ShuttingDown);
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Job.a.a(this.effectJob, null, 1, null);
    }

    public final void close() {
        if (this.effectJob.complete()) {
            synchronized (this.stateLock) {
                this.isClosed = true;
                Unit unit = Unit.f93236a;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @ComposableInferredTarget(scheme = "[0[0]]")
    public void composeInitial$runtime_release(@NotNull ControlledComposition composition, @NotNull Function2<? super Composer, ? super Integer, Unit> content) throws Exception {
        Throwable th2;
        Intrinsics.checkNotNullParameter(composition, "composition");
        Intrinsics.checkNotNullParameter(content, "content");
        boolean zIsComposing = composition.isComposing();
        try {
            Snapshot.Companion companion = Snapshot.INSTANCE;
            MutableSnapshot mutableSnapshotTakeMutableSnapshot = companion.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, null));
            try {
                Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
                try {
                    composition.composeContent(content);
                    Unit unit = Unit.f93236a;
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    applyAndCheck(mutableSnapshotTakeMutableSnapshot);
                    if (!zIsComposing) {
                        companion.notifyObjectsInitialized();
                    }
                    synchronized (this.stateLock) {
                        try {
                            if (((State) this._state.getValue()).compareTo(State.ShuttingDown) > 0) {
                                try {
                                    if (!this.knownCompositions.contains(composition)) {
                                        this.knownCompositions.add(composition);
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            try {
                                performInitialMovableContentInserts(composition);
                                try {
                                    composition.applyChanges();
                                    composition.applyLateChanges();
                                    if (zIsComposing) {
                                        return;
                                    }
                                    companion.notifyObjectsInitialized();
                                } catch (Exception e10) {
                                    processCompositionError$default(this, e10, null, false, 6, null);
                                }
                            } catch (Exception e11) {
                                processCompositionError(e11, composition, true);
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                        throw th5;
                    } catch (Throwable th6) {
                        th = th6;
                        Throwable th7 = th;
                        try {
                            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
                            throw th7;
                        } catch (Exception e12) {
                            e = e12;
                            processCompositionError(e, composition, true);
                        }
                    }
                }
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Exception e13) {
            e = e13;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime_release(@NotNull MovableContentStateReference reference) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        synchronized (this.stateLock) {
            RecomposerKt.addMultiValue(this.compositionValuesRemoved, reference.getContent$runtime_release(), reference);
        }
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingParameterInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public int getCompoundHashKey$runtime_release() {
        return 1000;
    }

    @NotNull
    public final StateFlow getCurrentState() {
        return this._state;
    }

    @Override // androidx.compose.runtime.CompositionContext
    @NotNull
    /* JADX INFO: renamed from: getEffectCoroutineContext$runtime_release, reason: from getter */
    public CoroutineContext getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean getHasPendingWork() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.stateLock
            monitor-enter(r0)
            java.util.Set<java.lang.Object> r1 = r2.snapshotInvalidations     // Catch: java.lang.Throwable -> L30
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L30
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L32
            java.util.List<androidx.compose.runtime.ControlledComposition> r1 = r2.compositionInvalidations     // Catch: java.lang.Throwable -> L30
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L30
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L32
            int r1 = r2.concurrentCompositionsOutstanding     // Catch: java.lang.Throwable -> L30
            if (r1 > 0) goto L32
            java.util.List<androidx.compose.runtime.ControlledComposition> r1 = r2.compositionsAwaitingApply     // Catch: java.lang.Throwable -> L30
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L30
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L32
            androidx.compose.runtime.BroadcastFrameClock r1 = r2.broadcastFrameClock     // Catch: java.lang.Throwable -> L30
            boolean r1 = r1.getHasAwaiters()     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L2e
            goto L32
        L2e:
            r1 = 0
            goto L33
        L30:
            r1 = move-exception
            goto L35
        L32:
            r1 = 1
        L33:
            monitor-exit(r0)
            return r1
        L35:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.getHasPendingWork():boolean");
    }

    @Override // androidx.compose.runtime.CompositionContext
    @NotNull
    public CoroutineContext getRecomposeCoroutineContext$runtime_release() {
        return kotlin.coroutines.e.f93267b;
    }

    @NotNull
    public final Flow getState() {
        return getCurrentState();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime_release(@NotNull MovableContentStateReference reference) {
        CancellableContinuation cancellableContinuationDeriveStateLocked;
        Intrinsics.checkNotNullParameter(reference, "reference");
        synchronized (this.stateLock) {
            this.compositionValuesAwaitingInsert.add(reference);
            cancellableContinuationDeriveStateLocked = deriveStateLocked();
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            Result.Companion companion = Result.f93230c;
            cancellableContinuationDeriveStateLocked.resumeWith(Result.b(Unit.f93236a));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime_release(@NotNull ControlledComposition composition) {
        CancellableContinuation cancellableContinuationDeriveStateLocked;
        Intrinsics.checkNotNullParameter(composition, "composition");
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(composition)) {
                cancellableContinuationDeriveStateLocked = null;
            } else {
                this.compositionInvalidations.add(composition);
                cancellableContinuationDeriveStateLocked = deriveStateLocked();
            }
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            Result.Companion companion = Result.f93230c;
            cancellableContinuationDeriveStateLocked.resumeWith(Result.b(Unit.f93236a));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidateScope$runtime_release(@NotNull RecomposeScopeImpl scope) {
        CancellableContinuation cancellableContinuationDeriveStateLocked;
        Intrinsics.checkNotNullParameter(scope, "scope");
        synchronized (this.stateLock) {
            this.snapshotInvalidations.add(scope);
            cancellableContinuationDeriveStateLocked = deriveStateLocked();
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            Result.Companion companion = Result.f93230c;
            cancellableContinuationDeriveStateLocked.resumeWith(Result.b(Unit.f93236a));
        }
    }

    @Nullable
    public final Object join(@NotNull Continuation continuation) {
        Object objY = i.y(getCurrentState(), new C15812(null), continuation);
        return objY == pf.b.g() ? objY : Unit.f93236a;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void movableContentStateReleased$runtime_release(@NotNull MovableContentStateReference reference, @NotNull MovableContentState data) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(data, "data");
        synchronized (this.stateLock) {
            this.compositionValueStatesAvailable.put(reference, data);
            Unit unit = Unit.f93236a;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @Nullable
    public MovableContentState movableContentStateResolve$runtime_release(@NotNull MovableContentStateReference reference) {
        MovableContentState movableContentStateRemove;
        Intrinsics.checkNotNullParameter(reference, "reference");
        synchronized (this.stateLock) {
            movableContentStateRemove = this.compositionValueStatesAvailable.remove(reference);
        }
        return movableContentStateRemove;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime_release(@NotNull Set<CompositionData> table) {
        Intrinsics.checkNotNullParameter(table, "table");
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void registerComposition$runtime_release(@NotNull ControlledComposition composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
    }

    @Nullable
    public final Object runRecomposeAndApplyChanges(@NotNull Continuation continuation) {
        Object objRecompositionRunner = recompositionRunner(new C15852(null), continuation);
        return objRecompositionRunner == pf.b.g() ? objRecompositionRunner : Unit.f93236a;
    }

    @ExperimentalComposeApi
    @Nullable
    public final Object runRecomposeConcurrentlyAndApplyChanges(@NotNull CoroutineContext coroutineContext, @NotNull Continuation continuation) {
        Object objRecompositionRunner = recompositionRunner(new C15862(coroutineContext, this, null), continuation);
        return objRecompositionRunner == pf.b.g() ? objRecompositionRunner : Unit.f93236a;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime_release(@NotNull ControlledComposition composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        synchronized (this.stateLock) {
            this.knownCompositions.remove(composition);
            this.compositionInvalidations.remove(composition);
            this.compositionsAwaitingApply.remove(composition);
            Unit unit = Unit.f93236a;
        }
    }

    private final void recordComposerModificationsLocked(Function1<? super ControlledComposition, Unit> onEachInvalidComposition) {
        Set<? extends Object> set = this.snapshotInvalidations;
        if (!set.isEmpty()) {
            List list = this.knownCompositions;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((ControlledComposition) list.get(i10)).recordModificationsOf(set);
            }
            this.snapshotInvalidations = new LinkedHashSet();
        }
        List list2 = this.compositionInvalidations;
        int size2 = list2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            onEachInvalidComposition.invoke(list2.get(i11));
        }
        this.compositionInvalidations.clear();
        if (deriveStateLocked() != null) {
            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
        }
    }
}
