package androidx.compose.ui.semantics;

import androidx.autofill.HintConstants;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KProperty;
import lf.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a4\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0082\b¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\r\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0011\u0010\u0011\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u000e\u001a\u0011\u0010\u0012\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u000e\u001a\u0011\u0010\u0013\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u000e\u001a\u0019\u0010\u0015\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u001b\u001a\u00020\f*\u00020\u000b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001d\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u000e\u001a9\u0010\"\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u001a\u0010!\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017¢\u0006\u0004\b\"\u0010#\u001a-\u0010%\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$¢\u0006\u0004\b%\u0010&\u001a-\u0010'\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$¢\u0006\u0004\b'\u0010&\u001a9\u0010*\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u001a\u0010!\u001a\u0016\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+\u001a1\u0010,\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00040\u0017¢\u0006\u0004\b,\u0010#\u001a3\u0010-\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017¢\u0006\u0004\b-\u0010#\u001a3\u0010/\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017¢\u0006\u0004\b/\u0010#\u001a?\u00101\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052 \u0010!\u001a\u001c\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u000100¢\u0006\u0004\b1\u00102\u001a-\u00103\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$¢\u0006\u0004\b3\u0010&\u001a-\u00104\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$¢\u0006\u0004\b4\u0010&\u001a-\u00105\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$¢\u0006\u0004\b5\u0010&\u001a-\u00106\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$¢\u0006\u0004\b6\u0010&\u001a-\u00107\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$¢\u0006\u0004\b7\u0010&\u001a-\u00108\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$¢\u0006\u0004\b8\u0010&\u001a-\u00109\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$¢\u0006\u0004\b9\u0010&\u001a-\u0010:\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$¢\u0006\u0004\b:\u0010&\u001a-\u0010;\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$¢\u0006\u0004\b;\u0010&\u001a-\u0010<\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$¢\u0006\u0004\b<\u0010&\u001a-\u0010=\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$¢\u0006\u0004\b=\u0010&\"(\u0010B\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010>\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\u0016\"/\u0010H\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010C\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bD\u0010@\"\u0004\bE\u0010\u0016*\u0004\bF\u0010G\"/\u0010O\u001a\u00020I*\u00020\u000b2\u0006\u0010C\u001a\u00020I8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M*\u0004\bN\u0010G\"/\u0010S\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010C\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bP\u0010@\"\u0004\bQ\u0010\u0016*\u0004\bR\u0010G\"2\u0010Z\u001a\u00020T*\u00020\u000b2\u0006\u0010C\u001a\u00020T8F@FX\u0086\u008e\u0002ø\u0001\u0000¢\u0006\u0012\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X*\u0004\bY\u0010G\"/\u0010`\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010C\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^*\u0004\b_\u0010G\"/\u0010a\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010C\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\ba\u0010\\\"\u0004\bb\u0010^*\u0004\bc\u0010G\"/\u0010j\u001a\u00020d*\u00020\u000b2\u0006\u0010C\u001a\u00020d8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\be\u0010f\"\u0004\bg\u0010h*\u0004\bi\u0010G\"/\u0010n\u001a\u00020d*\u00020\u000b2\u0006\u0010C\u001a\u00020d8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bk\u0010f\"\u0004\bl\u0010h*\u0004\bm\u0010G\"2\u0010s\u001a\u00020o*\u00020\u000b2\u0006\u0010C\u001a\u00020o8F@FX\u0086\u008e\u0002ø\u0001\u0000¢\u0006\u0012\u001a\u0004\bp\u0010V\"\u0004\bq\u0010X*\u0004\br\u0010G\"/\u0010w\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010C\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bt\u0010@\"\u0004\bu\u0010\u0016*\u0004\bv\u0010G\"(\u0010{\u001a\u00020.*\u00020\u000b2\u0006\u0010>\u001a\u00020.8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bx\u0010y\"\u0004\b/\u0010z\"/\u0010\u007f\u001a\u00020.*\u00020\u000b2\u0006\u0010C\u001a\u00020.8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b|\u0010y\"\u0004\b}\u0010z*\u0004\b~\u0010G\":\u0010\u0086\u0001\u001a\u00030\u0080\u0001*\u00020\u000b2\u0007\u0010C\u001a\u00030\u0080\u00018F@FX\u0086\u008e\u0002ø\u0001\u0000¢\u0006\u0017\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001*\u0005\b\u0085\u0001\u0010G\"8\u0010\u008b\u0001\u001a\u00030\u0087\u0001*\u00020\u000b2\u0007\u0010C\u001a\u00030\u0087\u00018F@FX\u0086\u008e\u0002ø\u0001\u0000¢\u0006\u0015\u001a\u0005\b\u0088\u0001\u0010V\"\u0005\b\u0089\u0001\u0010X*\u0005\b\u008a\u0001\u0010G\"3\u0010\u008f\u0001\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010C\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u008c\u0001\u0010\\\"\u0005\b\u008d\u0001\u0010^*\u0005\b\u008e\u0001\u0010G\"7\u0010\u0096\u0001\u001a\u00030\u0090\u0001*\u00020\u000b2\u0007\u0010C\u001a\u00030\u0090\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001*\u0005\b\u0095\u0001\u0010G\"7\u0010\u009d\u0001\u001a\u00030\u0097\u0001*\u00020\u000b2\u0007\u0010C\u001a\u00030\u0097\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001*\u0005\b\u009c\u0001\u0010G\"7\u0010¤\u0001\u001a\u00030\u009e\u0001*\u00020\u000b2\u0007\u0010C\u001a\u00030\u009e\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001*\u0005\b£\u0001\u0010G\"E\u0010¬\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010¥\u0001*\u00020\u000b2\u000e\u0010C\u001a\n\u0012\u0005\u0012\u00030¦\u00010¥\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001*\u0005\b«\u0001\u0010G\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u00ad\u0001"}, d2 = {"T", "throwSemanticsGetNotSupported", "()Ljava/lang/Object;", "Llf/e;", "", "", "name", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/AccessibilityAction;", "ActionPropertyKey", "(Ljava/lang/String;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "heading", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "disabled", "invisibleToUser", "popup", "dialog", HintConstants.AUTOFILL_HINT_PASSWORD, "description", "error", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;)V", "Lkotlin/Function1;", "", "", "mapping", "indexForKey", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/jvm/functions/Function1;)V", "selectableGroup", "label", "", "Landroidx/compose/ui/text/TextLayoutResult;", "action", "getTextLayoutResult", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "onClick", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "onLongClick", "Lkotlin/Function2;", "", "scrollBy", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "scrollToIndex", "setProgress", "Landroidx/compose/ui/text/AnnotatedString;", "setText", "Lkotlin/Function3;", "setSelection", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V", "copyText", "cutText", "pasteText", "expand", "collapse", "dismiss", "requestFocus", "pageUp", "pageDown", "pageLeft", "pageRight", "value", "getContentDescription", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", "setContentDescription", "contentDescription", "<set-?>", "getStateDescription", "setStateDescription", "getStateDescription$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "stateDescription", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "getProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "setProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ProgressBarRangeInfo;)V", "getProgressBarRangeInfo$delegate", "progressBarRangeInfo", "getPaneTitle", "setPaneTitle", "getPaneTitle$delegate", "paneTitle", "Landroidx/compose/ui/semantics/LiveRegionMode;", "getLiveRegion", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", "setLiveRegion-hR3wRGc", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;I)V", "getLiveRegion$delegate", "liveRegion", "getFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", "setFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V", "getFocused$delegate", "focused", "isContainer", "setContainer", "isContainer$delegate", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "getHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", "setHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ScrollAxisRange;)V", "getHorizontalScrollAxisRange$delegate", "horizontalScrollAxisRange", "getVerticalScrollAxisRange", "setVerticalScrollAxisRange", "getVerticalScrollAxisRange$delegate", "verticalScrollAxisRange", "Landroidx/compose/ui/semantics/Role;", "getRole", "setRole-kuIjeqM", "getRole$delegate", "role", "getTestTag", "setTestTag", "getTestTag$delegate", "testTag", "getText", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/text/AnnotatedString;)V", "text", "getEditableText", "setEditableText", "getEditableText$delegate", "editableText", "Landroidx/compose/ui/text/TextRange;", "getTextSelectionRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", "setTextSelectionRange-FDrldGo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;J)V", "getTextSelectionRange$delegate", "textSelectionRange", "Landroidx/compose/ui/text/input/ImeAction;", "getImeAction", "setImeAction-4L7nppU", "getImeAction$delegate", "imeAction", "getSelected", "setSelected", "getSelected$delegate", "selected", "Landroidx/compose/ui/semantics/CollectionInfo;", "getCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", "setCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionInfo;)V", "getCollectionInfo$delegate", "collectionInfo", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "getCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", "setCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionItemInfo;)V", "getCollectionItemInfo$delegate", "collectionItemInfo", "Landroidx/compose/ui/state/ToggleableState;", "getToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", "setToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/state/ToggleableState;)V", "getToggleableState$delegate", "toggleableState", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "getCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", "setCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/util/List;)V", "getCustomActions$delegate", "customActions", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SemanticsPropertiesKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {v0.f(new g0(SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), v0.f(new g0(SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), v0.f(new g0(SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), v0.f(new g0(SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), v0.f(new g0(SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), v0.f(new g0(SemanticsPropertiesKt.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), v0.f(new g0(SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), v0.f(new g0(SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), v0.f(new g0(SemanticsPropertiesKt.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), v0.f(new g0(SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), v0.f(new g0(SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), v0.f(new g0(SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), v0.f(new g0(SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), v0.f(new g0(SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), v0.f(new g0(SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), v0.f(new g0(SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), v0.f(new g0(SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), v0.f(new g0(SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Llf/e;", "", "T", "Landroidx/compose/ui/semantics/AccessibilityAction;", "parentValue", "childValue", "invoke", "(Landroidx/compose/ui/semantics/AccessibilityAction;Landroidx/compose/ui/semantics/AccessibilityAction;)Landroidx/compose/ui/semantics/AccessibilityAction;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1<T> extends Lambda implements Function2<AccessibilityAction<T>, AccessibilityAction<T>, AccessibilityAction<T>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final AccessibilityAction<T> invoke(@Nullable AccessibilityAction<T> accessibilityAction, @NotNull AccessibilityAction<T> childValue) {
            String label;
            e action;
            Intrinsics.checkNotNullParameter(childValue, "childValue");
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = childValue.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = childValue.getAction();
            }
            return new AccessibilityAction<>(label, action);
        }
    }

    static {
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        semanticsProperties.getStateDescription();
        semanticsProperties.getProgressBarRangeInfo();
        semanticsProperties.getPaneTitle();
        semanticsProperties.getLiveRegion();
        semanticsProperties.getFocused();
        semanticsProperties.getIsContainer();
        semanticsProperties.getHorizontalScrollAxisRange();
        semanticsProperties.getVerticalScrollAxisRange();
        semanticsProperties.getRole();
        semanticsProperties.getTestTag();
        semanticsProperties.getEditableText();
        semanticsProperties.getTextSelectionRange();
        semanticsProperties.getImeAction();
        semanticsProperties.getSelected();
        semanticsProperties.getCollectionInfo();
        semanticsProperties.getCollectionItemInfo();
        semanticsProperties.getToggleableState();
        SemanticsActions.INSTANCE.getCustomActions();
    }

    private static final <T extends e> SemanticsPropertyKey<AccessibilityAction<T>> ActionPropertyKey(String str) {
        return new SemanticsPropertyKey<>(str, AnonymousClass1.INSTANCE);
    }

    public static final void collapse(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCollapse(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void collapse$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        collapse(semanticsPropertyReceiver, str, function0);
    }

    public static final void copyText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCopyText(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void copyText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        copyText(semanticsPropertyReceiver, str, function0);
    }

    public static final void cutText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCutText(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void cutText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        cutText(semanticsPropertyReceiver, str, function0);
    }

    public static final void dialog(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIsDialog(), Unit.f93236a);
    }

    public static final void disabled(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getDisabled(), Unit.f93236a);
    }

    public static final void dismiss(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getDismiss(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void dismiss$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        dismiss(semanticsPropertyReceiver, str, function0);
    }

    public static final void error(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull String description) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(description, "description");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getError(), description);
    }

    public static final void expand(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getExpand(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void expand$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        expand(semanticsPropertyReceiver, str, function0);
    }

    @NotNull
    public static final CollectionInfo getCollectionInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getCollectionInfo().getValue(semanticsPropertyReceiver, $$delegatedProperties[14]);
    }

    @NotNull
    public static final CollectionItemInfo getCollectionItemInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getCollectionItemInfo().getValue(semanticsPropertyReceiver, $$delegatedProperties[15]);
    }

    @NotNull
    public static final String getContentDescription(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return (String) throwSemanticsGetNotSupported();
    }

    @NotNull
    public static final List<CustomAccessibilityAction> getCustomActions(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsActions.INSTANCE.getCustomActions().getValue(semanticsPropertyReceiver, $$delegatedProperties[17]);
    }

    @NotNull
    public static final AnnotatedString getEditableText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getEditableText().getValue(semanticsPropertyReceiver, $$delegatedProperties[10]);
    }

    public static final boolean getFocused(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getFocused().getValue(semanticsPropertyReceiver, $$delegatedProperties[4]).booleanValue();
    }

    @NotNull
    public static final ScrollAxisRange getHorizontalScrollAxisRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[6]);
    }

    public static final int getImeAction(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getImeAction().getValue(semanticsPropertyReceiver, $$delegatedProperties[12]).getValue();
    }

    public static final int getLiveRegion(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getLiveRegion().getValue(semanticsPropertyReceiver, $$delegatedProperties[3]).getValue();
    }

    @NotNull
    public static final String getPaneTitle(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getPaneTitle().getValue(semanticsPropertyReceiver, $$delegatedProperties[2]);
    }

    @NotNull
    public static final ProgressBarRangeInfo getProgressBarRangeInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getProgressBarRangeInfo().getValue(semanticsPropertyReceiver, $$delegatedProperties[1]);
    }

    public static final int getRole(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getRole().getValue(semanticsPropertyReceiver, $$delegatedProperties[8]).getValue();
    }

    public static final boolean getSelected(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getSelected().getValue(semanticsPropertyReceiver, $$delegatedProperties[13]).booleanValue();
    }

    @NotNull
    public static final String getStateDescription(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getStateDescription().getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    @NotNull
    public static final String getTestTag(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getTestTag().getValue(semanticsPropertyReceiver, $$delegatedProperties[9]);
    }

    @NotNull
    public static final AnnotatedString getText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return (AnnotatedString) throwSemanticsGetNotSupported();
    }

    public static final void getTextLayoutResult(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function1<? super List<TextLayoutResult>, Boolean> function1) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getGetTextLayoutResult(), new AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void getTextLayoutResult$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        getTextLayoutResult(semanticsPropertyReceiver, str, function1);
    }

    public static final long getTextSelectionRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getTextSelectionRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[11]).getPackedValue();
    }

    @NotNull
    public static final ToggleableState getToggleableState(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getToggleableState().getValue(semanticsPropertyReceiver, $$delegatedProperties[16]);
    }

    @NotNull
    public static final ScrollAxisRange getVerticalScrollAxisRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[7]);
    }

    public static final void heading(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getHeading(), Unit.f93236a);
    }

    public static final void indexForKey(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull Function1<Object, Integer> mapping) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIndexForKey(), mapping);
    }

    @ExperimentalComposeUiApi
    public static final void invisibleToUser(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getInvisibleToUser(), Unit.f93236a);
    }

    public static final boolean isContainer(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return SemanticsProperties.INSTANCE.getIsContainer().getValue(semanticsPropertyReceiver, $$delegatedProperties[5]).booleanValue();
    }

    public static final void onClick(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnClick(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void onClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        onClick(semanticsPropertyReceiver, str, function0);
    }

    public static final void onLongClick(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnLongClick(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void onLongClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        onLongClick(semanticsPropertyReceiver, str, function0);
    }

    public static final void pageDown(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageDown(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pageDown$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        pageDown(semanticsPropertyReceiver, str, function0);
    }

    public static final void pageLeft(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageLeft(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pageLeft$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        pageLeft(semanticsPropertyReceiver, str, function0);
    }

    public static final void pageRight(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageRight(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pageRight$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        pageRight(semanticsPropertyReceiver, str, function0);
    }

    public static final void pageUp(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageUp(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pageUp$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        pageUp(semanticsPropertyReceiver, str, function0);
    }

    public static final void password(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getPassword(), Unit.f93236a);
    }

    public static final void pasteText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPasteText(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pasteText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        pasteText(semanticsPropertyReceiver, str, function0);
    }

    public static final void popup(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIsPopup(), Unit.f93236a);
    }

    public static final void requestFocus(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getRequestFocus(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void requestFocus$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        requestFocus(semanticsPropertyReceiver, str, function0);
    }

    public static final void scrollBy(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function2<? super Float, ? super Float, Boolean> function2) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollBy(), new AccessibilityAction(str, function2));
    }

    public static /* synthetic */ void scrollBy$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        scrollBy(semanticsPropertyReceiver, str, function2);
    }

    public static final void scrollToIndex(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @NotNull Function1<? super Integer, Boolean> action) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollToIndex(), new AccessibilityAction(str, action));
    }

    public static /* synthetic */ void scrollToIndex$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        scrollToIndex(semanticsPropertyReceiver, str, function1);
    }

    public static final void selectableGroup(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getSelectableGroup(), Unit.f93236a);
    }

    public static final void setCollectionInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull CollectionInfo collectionInfo) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(collectionInfo, "<set-?>");
        SemanticsProperties.INSTANCE.getCollectionInfo().setValue(semanticsPropertyReceiver, $$delegatedProperties[14], collectionInfo);
    }

    public static final void setCollectionItemInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull CollectionItemInfo collectionItemInfo) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(collectionItemInfo, "<set-?>");
        SemanticsProperties.INSTANCE.getCollectionItemInfo().setValue(semanticsPropertyReceiver, $$delegatedProperties[15], collectionItemInfo);
    }

    public static final void setContainer(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z10) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        SemanticsProperties.INSTANCE.getIsContainer().setValue(semanticsPropertyReceiver, $$delegatedProperties[5], Boolean.valueOf(z10));
    }

    public static final void setContentDescription(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull String value) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getContentDescription(), CollectionsKt.listOf(value));
    }

    public static final void setCustomActions(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull List<CustomAccessibilityAction> list) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        SemanticsActions.INSTANCE.getCustomActions().setValue(semanticsPropertyReceiver, $$delegatedProperties[17], list);
    }

    public static final void setEditableText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull AnnotatedString annotatedString) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(annotatedString, "<set-?>");
        SemanticsProperties.INSTANCE.getEditableText().setValue(semanticsPropertyReceiver, $$delegatedProperties[10], annotatedString);
    }

    public static final void setFocused(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z10) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        SemanticsProperties.INSTANCE.getFocused().setValue(semanticsPropertyReceiver, $$delegatedProperties[4], Boolean.valueOf(z10));
    }

    public static final void setHorizontalScrollAxisRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull ScrollAxisRange scrollAxisRange) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(scrollAxisRange, "<set-?>");
        SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().setValue(semanticsPropertyReceiver, $$delegatedProperties[6], scrollAxisRange);
    }

    /* JADX INFO: renamed from: setImeAction-4L7nppU, reason: not valid java name */
    public static final void m3362setImeAction4L7nppU(@NotNull SemanticsPropertyReceiver imeAction, int i10) {
        Intrinsics.checkNotNullParameter(imeAction, "$this$imeAction");
        SemanticsProperties.INSTANCE.getImeAction().setValue(imeAction, $$delegatedProperties[12], ImeAction.m3634boximpl(i10));
    }

    /* JADX INFO: renamed from: setLiveRegion-hR3wRGc, reason: not valid java name */
    public static final void m3363setLiveRegionhR3wRGc(@NotNull SemanticsPropertyReceiver liveRegion, int i10) {
        Intrinsics.checkNotNullParameter(liveRegion, "$this$liveRegion");
        SemanticsProperties.INSTANCE.getLiveRegion().setValue(liveRegion, $$delegatedProperties[3], LiveRegionMode.m3334boximpl(i10));
    }

    public static final void setPaneTitle(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull String str) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        SemanticsProperties.INSTANCE.getPaneTitle().setValue(semanticsPropertyReceiver, $$delegatedProperties[2], str);
    }

    public static final void setProgress(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function1<? super Float, Boolean> function1) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetProgress(), new AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void setProgress$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        setProgress(semanticsPropertyReceiver, str, function1);
    }

    public static final void setProgressBarRangeInfo(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull ProgressBarRangeInfo progressBarRangeInfo) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(progressBarRangeInfo, "<set-?>");
        SemanticsProperties.INSTANCE.getProgressBarRangeInfo().setValue(semanticsPropertyReceiver, $$delegatedProperties[1], progressBarRangeInfo);
    }

    /* JADX INFO: renamed from: setRole-kuIjeqM, reason: not valid java name */
    public static final void m3364setRolekuIjeqM(@NotNull SemanticsPropertyReceiver role, int i10) {
        Intrinsics.checkNotNullParameter(role, "$this$role");
        SemanticsProperties.INSTANCE.getRole().setValue(role, $$delegatedProperties[8], Role.m3343boximpl(i10));
    }

    public static final void setSelected(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z10) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        SemanticsProperties.INSTANCE.getSelected().setValue(semanticsPropertyReceiver, $$delegatedProperties[13], Boolean.valueOf(z10));
    }

    public static final void setSelection(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function3<? super Integer, ? super Integer, ? super Boolean, Boolean> function3) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetSelection(), new AccessibilityAction(str, function3));
    }

    public static /* synthetic */ void setSelection$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function3 function3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        setSelection(semanticsPropertyReceiver, str, function3);
    }

    public static final void setStateDescription(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull String str) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        SemanticsProperties.INSTANCE.getStateDescription().setValue(semanticsPropertyReceiver, $$delegatedProperties[0], str);
    }

    public static final void setTestTag(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull String str) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        SemanticsProperties.INSTANCE.getTestTag().setValue(semanticsPropertyReceiver, $$delegatedProperties[9], str);
    }

    public static final void setText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull AnnotatedString value) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getText(), CollectionsKt.listOf(value));
    }

    public static /* synthetic */ void setText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        setText(semanticsPropertyReceiver, str, function1);
    }

    /* JADX INFO: renamed from: setTextSelectionRange-FDrldGo, reason: not valid java name */
    public static final void m3365setTextSelectionRangeFDrldGo(@NotNull SemanticsPropertyReceiver textSelectionRange, long j10) {
        Intrinsics.checkNotNullParameter(textSelectionRange, "$this$textSelectionRange");
        SemanticsProperties.INSTANCE.getTextSelectionRange().setValue(textSelectionRange, $$delegatedProperties[11], TextRange.m3491boximpl(j10));
    }

    public static final void setToggleableState(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull ToggleableState toggleableState) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(toggleableState, "<set-?>");
        SemanticsProperties.INSTANCE.getToggleableState().setValue(semanticsPropertyReceiver, $$delegatedProperties[16], toggleableState);
    }

    public static final void setVerticalScrollAxisRange(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull ScrollAxisRange scrollAxisRange) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(scrollAxisRange, "<set-?>");
        SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().setValue(semanticsPropertyReceiver, $$delegatedProperties[7], scrollAxisRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T throwSemanticsGetNotSupported() {
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    public static final void setText(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @Nullable String str, @Nullable Function1<? super AnnotatedString, Boolean> function1) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetText(), new AccessibilityAction(str, function1));
    }
}
