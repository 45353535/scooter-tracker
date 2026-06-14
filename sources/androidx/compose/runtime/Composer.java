package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u0095\u00012\u00020\u0001:\u0002\u0095\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H'¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0004H'¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00042\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001d\u001a\u00020\u00042\u001a\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a0\u0019H'¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H&¢\u0006\u0004\b$\u0010\bJ\u000f\u0010%\u001a\u00020\u0004H'¢\u0006\u0004\b%\u0010\bJ\u0017\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H'¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0004H'¢\u0006\u0004\b*\u0010\bJ\u000f\u0010+\u001a\u00020\u0004H'¢\u0006\u0004\b+\u0010\bJ\u000f\u0010,\u001a\u00020\u0004H'¢\u0006\u0004\b,\u0010\bJ#\u00100\u001a\u00020\u0004\"\u0004\b\u0000\u0010-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.H'¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0004H'¢\u0006\u0004\b2\u0010\bJ\u000f\u00103\u001a\u00020\u0004H'¢\u0006\u0004\b3\u0010\bJ!\u00104\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b4\u0010\u000bJ\u000f\u00105\u001a\u00020\u0004H'¢\u0006\u0004\b5\u0010\bJ\u000f\u00106\u001a\u00020\u0004H'¢\u0006\u0004\b6\u0010\bJ\u000f\u00107\u001a\u00020\u0004H'¢\u0006\u0004\b7\u0010\bJ\u0017\u00109\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0002H'¢\u0006\u0004\b9\u0010\u0006J=\u0010=\u001a\u00020\u0004\"\u0004\b\u0000\u0010:\"\u0004\b\u0001\u0010-2\u0006\u0010\u0015\u001a\u00028\u00002\u0018\u0010<\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040;H'¢\u0006\u0004\b=\u0010>J#\u0010A\u001a\u00020\u00012\b\u0010?\u001a\u0004\u0018\u00010\u00012\b\u0010@\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\bA\u0010BJ\u0011\u0010C\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\bC\u0010DJ\u0019\u0010E\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\bE\u0010FJ\u0019\u0010'\u001a\u00020&2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b'\u0010GJ\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020&H\u0017¢\u0006\u0004\b'\u0010HJ\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020IH\u0017¢\u0006\u0004\b'\u0010JJ\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020KH\u0017¢\u0006\u0004\b'\u0010LJ\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020MH\u0017¢\u0006\u0004\b'\u0010NJ\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u0002H\u0017¢\u0006\u0004\b'\u0010OJ\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020PH\u0017¢\u0006\u0004\b'\u0010QJ\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020RH\u0017¢\u0006\u0004\b'\u0010SJ\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020TH\u0017¢\u0006\u0004\b'\u0010UJ\u0019\u0010V\u001a\u00020&2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0004\bV\u0010GJ\u0017\u0010Y\u001a\u00020\u00042\u0006\u0010X\u001a\u00020WH'¢\u0006\u0004\bY\u0010ZJ\u001d\u0010\\\u001a\u00020\u00042\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00040.H'¢\u0006\u0004\b\\\u00101J#\u0010^\u001a\u00028\u0000\"\u0004\b\u0000\u0010-2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000]H'¢\u0006\u0004\b^\u0010_J#\u0010c\u001a\u00020\u00042\u0012\u0010b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030a0`H'¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\u0004H'¢\u0006\u0004\be\u0010\bJ\u000f\u0010f\u001a\u00020\u0004H&¢\u0006\u0004\bf\u0010\bJ\u000f\u0010h\u001a\u00020gH'¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020\u0004H&¢\u0006\u0004\bj\u0010\bR\u001e\u0010o\u001a\u0006\u0012\u0002\b\u00030k8&X§\u0004¢\u0006\f\u0012\u0004\bn\u0010\b\u001a\u0004\bl\u0010mR\u001a\u0010s\u001a\u00020&8&X§\u0004¢\u0006\f\u0012\u0004\br\u0010\b\u001a\u0004\bp\u0010qR\u001a\u0010v\u001a\u00020&8&X§\u0004¢\u0006\f\u0012\u0004\bu\u0010\b\u001a\u0004\bt\u0010qR\u001a\u0010y\u001a\u00020&8&X§\u0004¢\u0006\f\u0012\u0004\bx\u0010\b\u001a\u0004\bw\u0010qR\u001c\u0010}\u001a\u0004\u0018\u00010W8&X§\u0004¢\u0006\f\u0012\u0004\b|\u0010\b\u001a\u0004\bz\u0010{R\u001d\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00018&X§\u0004¢\u0006\f\u0012\u0004\b\u007f\u0010\b\u001a\u0004\b~\u0010DR\u001e\u0010\u0084\u0001\u001a\u00020\u00028&X§\u0004¢\u0006\u000f\u0012\u0005\b\u0083\u0001\u0010\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001e\u0010\u0087\u0001\u001a\u00020\u00028&X§\u0004¢\u0006\u000f\u0012\u0005\b\u0086\u0001\u0010\b\u001a\u0006\b\u0085\u0001\u0010\u0082\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001f\u0010\u0090\u0001\u001a\u00030\u008c\u00018fX§\u0004¢\u0006\u000f\u0012\u0005\b\u008f\u0001\u0010\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0094\u0001\u001a\u00030\u0091\u00018fX¦\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\u0082\u0001\u0002\u0096\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0097\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/Composer;", "", "", C4240b4.i.W, "", "startReplaceableGroup", "(I)V", "endReplaceableGroup", "()V", "dataKey", "startMovableGroup", "(ILjava/lang/Object;)V", "endMovableGroup", "startDefaults", "endDefaults", "startRestartGroup", "(I)Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "()Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/MovableContent;", "value", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "insertMovableContent", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;)V", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContentReferences", "(Ljava/util/List;)V", "", "sourceInformation", "(Ljava/lang/String;)V", "sourceInformationMarkerStart", "(ILjava/lang/String;)V", "sourceInformationMarkerEnd", "skipToGroupEnd", "", "changed", "deactivateToEndGroup", "(Z)V", "skipCurrentGroup", "startNode", "startReusableNode", "T", "Lkotlin/Function0;", "factory", "createNode", "(Lkotlin/jvm/functions/Function0;)V", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "disableReusing", "enableReusing", "marker", "endToMarker", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function2;", "block", "apply", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "left", "right", "joinKey", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "rememberedValue", "()Ljava/lang/Object;", "updateRememberedValue", "(Ljava/lang/Object;)V", "(Ljava/lang/Object;)Z", "(Z)Z", "", "(C)Z", "", "(B)Z", "", "(S)Z", "(I)Z", "", "(F)Z", "", "(J)Z", "", "(D)Z", "changedInstance", "Landroidx/compose/runtime/RecomposeScope;", "scope", "recordUsed", "(Landroidx/compose/runtime/RecomposeScope;)V", "effect", "recordSideEffect", "Landroidx/compose/runtime/CompositionLocal;", "consume", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/ProvidedValue;", "values", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "collectParameterInformation", "Landroidx/compose/runtime/CompositionContext;", "buildContext", "()Landroidx/compose/runtime/CompositionContext;", "disableSourceInformation", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "getApplier$annotations", "applier", "getInserting", "()Z", "getInserting$annotations", "inserting", "getSkipping", "getSkipping$annotations", "skipping", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope$annotations", "recomposeScope", "getRecomposeScopeIdentity", "getRecomposeScopeIdentity$annotations", "recomposeScopeIdentity", "getCompoundKeyHash", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "getCurrentMarker", "getCurrentMarker$annotations", "currentMarker", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "Landroidx/compose/runtime/ControlledComposition;", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "composition", y.f66058y, "Landroidx/compose/runtime/ComposerImpl;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Composer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/Composer$Companion;", "", "()V", "Empty", "getEmpty", "()Ljava/lang/Object;", "setTracer", "", "tracer", "Landroidx/compose/runtime/CompositionTracer;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final Object Empty = new Object() { // from class: androidx.compose.runtime.Composer$Companion$Empty$1
            @NotNull
            public String toString() {
                return "Empty";
            }
        };

        private Companion() {
        }

        @NotNull
        public final Object getEmpty() {
            return Empty;
        }

        @InternalComposeTracingApi
        public final void setTracer(@NotNull CompositionTracer tracer) {
            Intrinsics.checkNotNullParameter(tracer, "tracer");
            ComposerKt.compositionTracer = tracer;
        }
    }

    @ComposeCompilerApi
    <V, T> void apply(V value, @NotNull Function2<? super T, ? super V, Unit> block);

    @InternalComposeApi
    @NotNull
    CompositionContext buildContext();

    @ComposeCompilerApi
    boolean changed(byte value);

    @ComposeCompilerApi
    boolean changed(char value);

    @ComposeCompilerApi
    boolean changed(double value);

    @ComposeCompilerApi
    boolean changed(float value);

    @ComposeCompilerApi
    boolean changed(int value);

    @ComposeCompilerApi
    boolean changed(long value);

    @ComposeCompilerApi
    boolean changed(@Nullable Object value);

    @ComposeCompilerApi
    boolean changed(short value);

    @ComposeCompilerApi
    boolean changed(boolean value);

    @ComposeCompilerApi
    boolean changedInstance(@Nullable Object value);

    void collectParameterInformation();

    @InternalComposeApi
    <T> T consume(@NotNull CompositionLocal<T> key);

    @ComposeCompilerApi
    <T> void createNode(@NotNull Function0<? extends T> factory);

    @ComposeCompilerApi
    void deactivateToEndGroup(boolean changed);

    @ComposeCompilerApi
    void disableReusing();

    void disableSourceInformation();

    @ComposeCompilerApi
    void enableReusing();

    @ComposeCompilerApi
    void endDefaults();

    @ComposeCompilerApi
    void endMovableGroup();

    @ComposeCompilerApi
    void endNode();

    @InternalComposeApi
    void endProviders();

    @ComposeCompilerApi
    void endReplaceableGroup();

    @ComposeCompilerApi
    @Nullable
    ScopeUpdateScope endRestartGroup();

    @ComposeCompilerApi
    void endReusableGroup();

    @ComposeCompilerApi
    void endToMarker(int marker);

    @NotNull
    Applier<?> getApplier();

    @NotNull
    CoroutineContext getApplyCoroutineContext();

    @NotNull
    ControlledComposition getComposition();

    @NotNull
    CompositionData getCompositionData();

    int getCompoundKeyHash();

    int getCurrentMarker();

    boolean getDefaultsInvalid();

    boolean getInserting();

    @Nullable
    RecomposeScope getRecomposeScope();

    @Nullable
    Object getRecomposeScopeIdentity();

    boolean getSkipping();

    @InternalComposeApi
    void insertMovableContent(@NotNull MovableContent<?> value, @Nullable Object parameter);

    @InternalComposeApi
    void insertMovableContentReferences(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> references);

    @ComposeCompilerApi
    @NotNull
    Object joinKey(@Nullable Object left, @Nullable Object right);

    @InternalComposeApi
    void recordSideEffect(@NotNull Function0<Unit> effect);

    @InternalComposeApi
    void recordUsed(@NotNull RecomposeScope scope);

    @ComposeCompilerApi
    @Nullable
    Object rememberedValue();

    @ComposeCompilerApi
    void skipCurrentGroup();

    @ComposeCompilerApi
    void skipToGroupEnd();

    void sourceInformation(@NotNull String sourceInformation);

    void sourceInformationMarkerEnd();

    void sourceInformationMarkerStart(int key, @NotNull String sourceInformation);

    @ComposeCompilerApi
    void startDefaults();

    @ComposeCompilerApi
    void startMovableGroup(int key, @Nullable Object dataKey);

    @ComposeCompilerApi
    void startNode();

    @InternalComposeApi
    void startProviders(@NotNull ProvidedValue<?>[] values);

    @ComposeCompilerApi
    void startReplaceableGroup(int key);

    @ComposeCompilerApi
    @NotNull
    Composer startRestartGroup(int key);

    @ComposeCompilerApi
    void startReusableGroup(int key, @Nullable Object dataKey);

    @ComposeCompilerApi
    void startReusableNode();

    @ComposeCompilerApi
    void updateRememberedValue(@Nullable Object value);

    @ComposeCompilerApi
    void useNode();
}
