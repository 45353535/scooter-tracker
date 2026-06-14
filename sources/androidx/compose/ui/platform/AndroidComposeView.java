package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AndroidAutofill;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillCallback;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.ui.input.pointer.PointerInputEventProcessorKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.input.pointer.ProcessResult;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.platform.ViewLayer;
import androidx.compose.ui.semantics.SemanticsModifierCore;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.text.input.AndroidTextInputServicePlugin;
import androidx.compose.ui.text.input.PlatformTextInput;
import androidx.compose.ui.text.input.PlatformTextInputAdapter;
import androidx.compose.ui.text.input.PlatformTextInputPlugin;
import androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl;
import androidx.compose.ui.text.input.TextInputForTests;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000È\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019*\u0002\u009d\u0001\b\u0001\u0018\u0000 \u0084\u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004\u0084\u0003\u0085\u0003B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001b\u0010í\u0001\u001a\u00020+2\b\u0010Ð\u0001\u001a\u00030î\u00012\b\u0010ï\u0001\u001a\u00030 \u0001J\u0019\u0010\u001a\u001a\u00020+2\u000f\u0010ð\u0001\u001a\n\u0012\u0005\u0012\u00030ò\u00010ñ\u0001H\u0016J\t\u0010ó\u0001\u001a\u00020RH\u0002J\u0013\u0010ô\u0001\u001a\u00020+H\u0086@ø\u0001\u0000¢\u0006\u0003\u0010õ\u0001J!\u0010ö\u0001\u001a\u00020k2\u0007\u0010÷\u0001\u001a\u00020kH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bø\u0001\u0010ù\u0001J!\u0010ú\u0001\u001a\u00020k2\u0007\u0010û\u0001\u001a\u00020kH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bü\u0001\u0010ù\u0001J\u0012\u0010ý\u0001\u001a\u00020R2\u0007\u0010þ\u0001\u001a\u000201H\u0016J\u0012\u0010ÿ\u0001\u001a\u00020R2\u0007\u0010þ\u0001\u001a\u000201H\u0016J\u0012\u0010\u0080\u0002\u001a\u00020+2\u0007\u0010\u0081\u0002\u001a\u00020\u0001H\u0002J\u001f\u0010\u0082\u0002\u001a\u000f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002010\u0083\u00022\u0007\u0010\u0084\u0002\u001a\u000201H\u0002J.\u0010\u0085\u0002\u001a\u00020;2\u0014\u0010\u0086\u0002\u001a\u000f\u0012\u0005\u0012\u00030\u0087\u0002\u0012\u0004\u0012\u00020+0)2\r\u0010\u0088\u0002\u001a\b\u0012\u0004\u0012\u00020+0>H\u0016J\u0013\u0010\u0089\u0002\u001a\u00020+2\b\u0010\u008a\u0002\u001a\u00030\u008b\u0002H\u0014J\u0013\u0010\u008c\u0002\u001a\u00020R2\b\u0010\u008d\u0002\u001a\u00030\u0099\u0001H\u0016J\u0013\u0010\u008e\u0002\u001a\u00020R2\b\u0010\u008d\u0002\u001a\u00030\u0099\u0001H\u0016J\u0013\u0010\u008f\u0002\u001a\u00020R2\b\u0010\u008d\u0002\u001a\u00030\u0090\u0002H\u0016J\u0013\u0010\u0091\u0002\u001a\u00020R2\b\u0010\u0092\u0002\u001a\u00030\u0099\u0001H\u0016J\u001b\u0010\u0093\u0002\u001a\u00020+2\b\u0010Ð\u0001\u001a\u00030î\u00012\b\u0010\u008a\u0002\u001a\u00030\u008b\u0002J\u001f\u0010\u0094\u0002\u001a\u0005\u0018\u00010Ñ\u00012\u0007\u0010\u0095\u0002\u001a\u0002012\b\u0010\u0096\u0002\u001a\u00030Ñ\u0001H\u0002J\u0013\u0010\u0097\u0002\u001a\u0005\u0018\u00010Ñ\u00012\u0007\u0010\u0095\u0002\u001a\u000201J\u0013\u0010\u0098\u0002\u001a\u00020+2\b\u0010ï\u0001\u001a\u00030 \u0001H\u0016J%\u0010\u0099\u0002\u001a\u0005\u0018\u00010\u009a\u00022\b\u0010\u009b\u0002\u001a\u00030\u009c\u0002H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u009d\u0002\u0010\u009e\u0002J\u0013\u0010\u009f\u0002\u001a\u00020+2\b\u0010 \u0002\u001a\u00030¡\u0002H\u0016J&\u0010¢\u0002\u001a\u00030£\u00022\b\u0010\u0092\u0002\u001a\u00030\u0099\u0001H\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b¤\u0002\u0010¥\u0002J\u0013\u0010¦\u0002\u001a\u00020R2\b\u0010\u008d\u0002\u001a\u00030\u0099\u0001H\u0002J\u001d\u0010§\u0002\u001a\u00020R2\b\u0010\u008d\u0002\u001a\u00030\u0099\u00012\b\u0010¨\u0002\u001a\u00030\u0099\u0001H\u0002J\t\u0010©\u0002\u001a\u00020+H\u0016J\u0013\u0010ª\u0002\u001a\u00020+2\b\u0010«\u0002\u001a\u00030 \u0001H\u0002J\u0013\u0010¬\u0002\u001a\u00020+2\b\u0010«\u0002\u001a\u00030 \u0001H\u0002J\u0013\u0010\u00ad\u0002\u001a\u00020R2\b\u0010\u008d\u0002\u001a\u00030\u0099\u0001H\u0002J\u0013\u0010®\u0002\u001a\u00020R2\b\u0010\u008d\u0002\u001a\u00030\u0099\u0001H\u0002J\u0013\u0010¯\u0002\u001a\u00020R2\b\u0010\u0092\u0002\u001a\u00030\u0099\u0001H\u0002J\u0013\u0010°\u0002\u001a\u00020R2\b\u0010\u008d\u0002\u001a\u00030\u0099\u0001H\u0002J!\u0010±\u0002\u001a\u00020k2\u0007\u0010û\u0001\u001a\u00020kH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b²\u0002\u0010ù\u0001J,\u0010³\u0002\u001a\u00020+2\b\u0010ï\u0001\u001a\u00030 \u00012\b\u0010´\u0002\u001a\u00030\u008a\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bµ\u0002\u0010¶\u0002J\u0012\u0010³\u0002\u001a\u00020+2\u0007\u0010·\u0002\u001a\u00020RH\u0016J\t\u0010¸\u0002\u001a\u00020+H\u0016J!\u0010¹\u0002\u001a\u00020+2\u0007\u0010º\u0002\u001a\u00020;2\u0007\u0010»\u0002\u001a\u00020RH\u0000¢\u0006\u0003\b¼\u0002J\u0013\u0010½\u0002\u001a\u00020+2\b\u0010«\u0002\u001a\u00030 \u0001H\u0016J\t\u0010¾\u0002\u001a\u00020+H\u0014J\t\u0010¿\u0002\u001a\u00020RH\u0016J\u0012\u0010À\u0002\u001a\u00020+2\u0007\u0010Á\u0002\u001a\u00020*H\u0014J\u0016\u0010Â\u0002\u001a\u0005\u0018\u00010Ã\u00022\b\u0010Ä\u0002\u001a\u00030Å\u0002H\u0016J\u0013\u0010Æ\u0002\u001a\u00020+2\b\u0010«\u0002\u001a\u00030 \u0001H\u0016J\t\u0010Ç\u0002\u001a\u00020+H\u0014J\u0013\u0010È\u0002\u001a\u00020+2\b\u0010\u008a\u0002\u001a\u00030\u008b\u0002H\u0014J\t\u0010É\u0002\u001a\u00020+H\u0016J'\u0010Ê\u0002\u001a\u00020+2\u0007\u0010Ë\u0002\u001a\u00020R2\u0007\u0010þ\u0001\u001a\u0002012\n\u0010Ì\u0002\u001a\u0005\u0018\u00010¡\u0002H\u0014J6\u0010Í\u0002\u001a\u00020+2\u0007\u0010Î\u0002\u001a\u00020R2\u0007\u0010Ï\u0002\u001a\u0002012\u0007\u0010Ð\u0002\u001a\u0002012\u0007\u0010Ñ\u0002\u001a\u0002012\u0007\u0010Ò\u0002\u001a\u000201H\u0014J\u0013\u0010Ó\u0002\u001a\u00020+2\b\u0010ï\u0001\u001a\u00030 \u0001H\u0016J\u001b\u0010Ô\u0002\u001a\u00020+2\u0007\u0010Õ\u0002\u001a\u0002012\u0007\u0010Ö\u0002\u001a\u000201H\u0014J\u001e\u0010×\u0002\u001a\u00020+2\n\u0010Ø\u0002\u001a\u0005\u0018\u00010Ù\u00022\u0007\u0010Ú\u0002\u001a\u000201H\u0016J%\u0010Û\u0002\u001a\u00020+2\b\u0010ï\u0001\u001a\u00030 \u00012\u0007\u0010Ü\u0002\u001a\u00020R2\u0007\u0010Ý\u0002\u001a\u00020RH\u0016J%\u0010Þ\u0002\u001a\u00020+2\b\u0010ï\u0001\u001a\u00030 \u00012\u0007\u0010Ü\u0002\u001a\u00020R2\u0007\u0010Ý\u0002\u001a\u00020RH\u0016J\u0013\u0010ß\u0002\u001a\u00020+2\b\u0010à\u0002\u001a\u00030á\u0002H\u0016J\u0011\u0010â\u0002\u001a\u00020+2\u0006\u0010v\u001a\u000201H\u0016J\t\u0010ã\u0002\u001a\u00020+H\u0016J\u0012\u0010ä\u0002\u001a\u00020+2\u0007\u0010å\u0002\u001a\u00020RH\u0016J\t\u0010æ\u0002\u001a\u00020+H\u0002J\u0013\u0010æ\u0002\u001a\u00020+2\b\u0010\u0092\u0002\u001a\u00030\u0099\u0001H\u0002J\t\u0010ç\u0002\u001a\u00020+H\u0002J\u0018\u0010è\u0002\u001a\u00020R2\u0007\u0010º\u0002\u001a\u00020;H\u0000¢\u0006\u0003\bé\u0002J\u0018\u0010ê\u0002\u001a\u00020+2\r\u0010ë\u0002\u001a\b\u0012\u0004\u0012\u00020+0>H\u0016J\u0013\u0010ì\u0002\u001a\u00020+2\b\u0010ë\u0002\u001a\u00030í\u0002H\u0016J\u0011\u0010î\u0002\u001a\u00020+2\b\u0010Ð\u0001\u001a\u00030î\u0001J\u0007\u0010ï\u0002\u001a\u00020+J\u0013\u0010ð\u0002\u001a\u00020+2\b\u0010ï\u0001\u001a\u00030 \u0001H\u0016J\u0017\u0010ñ\u0002\u001a\u00020+2\f\b\u0002\u0010ò\u0002\u001a\u0005\u0018\u00010 \u0001H\u0002J!\u0010ó\u0002\u001a\u00020k2\u0007\u0010ô\u0002\u001a\u00020kH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bõ\u0002\u0010ù\u0001J\"\u0010ö\u0002\u001a\u00020R2\b\u0010\u009b\u0002\u001a\u00030\u009c\u0002H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b÷\u0002\u0010ø\u0002J&\u0010ù\u0002\u001a\u00030£\u00022\b\u0010\u0092\u0002\u001a\u00030\u0099\u0001H\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bú\u0002\u0010¥\u0002J0\u0010û\u0002\u001a\u00020+2\b\u0010\u0092\u0002\u001a\u00030\u0099\u00012\u0007\u0010ü\u0002\u001a\u0002012\u0007\u0010ý\u0002\u001a\u00020m2\t\b\u0002\u0010þ\u0002\u001a\u00020RH\u0002J\u001d\u0010ÿ\u0002\u001a\u00020+2\u0014\u0010\u0080\u0003\u001a\u000f\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0004\u0012\u00020+0)J\t\u0010\u0081\u0003\u001a\u00020RH\u0016J\t\u0010\u0082\u0003\u001a\u00020+H\u0002J\u000e\u0010\u0083\u0003\u001a\u00020R*\u00030 \u0001H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u00020%X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u00100\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u00104\u001a\u0002032\u0006\u00102\u001a\u000203@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020;0:X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020+\u0018\u00010>0=X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\u00020@X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR+\u0010D\u001a\u00020C2\u0006\u00102\u001a\u00020C8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001c\u0010K\u001a\u00020L8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u000e\u0010Q\u001a\u00020RX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020TX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010U\u001a\u00020VX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010WR\u0014\u0010X\u001a\u00020YX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020R8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u000e\u0010_\u001a\u00020RX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010`\u001a\u00020a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u000e\u0010d\u001a\u00020RX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010e\u001a\u00020R8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010^R\u000e\u0010f\u001a\u00020RX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020hX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020RX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010j\u001a\u00020kX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010WR$\u0010l\u001a\u00020m8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bn\u0010N\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u0014\u0010s\u001a\b\u0012\u0004\u0012\u00020;0tX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010v\u001a\u00020u2\u0006\u00102\u001a\u00020u8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b{\u0010J\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u000e\u0010|\u001a\u00020}X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010~\u001a\u00020\u007fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0080\u0001\u001a\u00020m8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010pR\u0018\u0010\u0082\u0001\u001a\u00030\u0083\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0010\u0010\u0086\u0001\u001a\u00030\u0087\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0088\u0001\u001a\u00020RX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u001e\u0010\u008b\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0004\u0012\u00020+\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u008d\u0001\u001a\u00030\u008e\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u0092\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0010\u0010\u0095\u0001\u001a\u00030\u0096\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0097\u0001\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u009a\u0001\u001a\u00020mX\u0082\u000e¢\u0006\u0002\n\u0000R\u0015\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020+0>X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u009c\u0001\u001a\u00030\u009d\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010\u009e\u0001R\u0018\u0010\u009f\u0001\u001a\u00030 \u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010£\u0001\u001a\u00030¤\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b¥\u0001\u0010¦\u0001R\u000f\u0010§\u0001\u001a\u00020hX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010¨\u0001\u001a\u00030©\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010ª\u0001\u001a\u00030«\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010¬\u0001\u001a\u00030\u00ad\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b®\u0001\u0010¯\u0001R\u0010\u0010°\u0001\u001a\u00030±\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010²\u0001\u001a\u00030³\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b´\u0001\u0010µ\u0001R%\u0010¶\u0001\u001a\u00020RX\u0096\u000e¢\u0006\u0018\n\u0000\u0012\u0005\b·\u0001\u0010N\u001a\u0005\b¸\u0001\u0010^\"\u0006\b¹\u0001\u0010º\u0001R\u0018\u0010»\u0001\u001a\u00030¼\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b½\u0001\u0010¾\u0001R\u000f\u0010¿\u0001\u001a\u00020RX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010À\u0001\u001a\u0005\u0018\u00010Á\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0018\u0010Ä\u0001\u001a\u00030Å\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u0018\u0010È\u0001\u001a\u00030É\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u0010\u0010Ì\u0001\u001a\u00030Í\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010Î\u0001\u001a\u00030Ï\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010Ð\u0001\u001a\u00030Ñ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0018\u0010Ô\u0001\u001a\u00030Õ\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÖ\u0001\u0010×\u0001R\u0012\u0010Ø\u0001\u001a\u0005\u0018\u00010Ù\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010Ú\u0001\u001a\u00030Û\u0001X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0005\n\u0003\u0010Ü\u0001R7\u0010Ý\u0001\u001a\u0005\u0018\u00010\u008c\u00012\t\u00102\u001a\u0005\u0018\u00010\u008c\u00018F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\bâ\u0001\u0010J\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0006\bà\u0001\u0010á\u0001R\u000f\u0010ã\u0001\u001a\u00020RX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010ä\u0001\u001a\u00030å\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bæ\u0001\u0010ç\u0001R\u001a\u0010è\u0001\u001a\u00020kX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010WR\u001c\u0010é\u0001\u001a\u00030Û\u0001X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0005\n\u0003\u0010Ü\u0001R\u001b\u0010ê\u0001\u001a\u000201*\u00020*8BX\u0082\u0004¢\u0006\b\u001a\u0006\bë\u0001\u0010ì\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0086\u0003"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/platform/ViewRootForTest;", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "Landroidx/lifecycle/DefaultLifecycleObserver;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "_androidViewsHandler", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "_autofill", "Landroidx/compose/ui/autofill/AndroidAutofill;", "_inputModeManager", "Landroidx/compose/ui/input/InputModeManagerImpl;", "_windowInfo", "Landroidx/compose/ui/platform/WindowInfoImpl;", "accessibilityDelegate", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "accessibilityManager", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "androidViewsHandler", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "autofill", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "autofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "clipboardManager", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/AndroidClipboardManager;", "configurationChangeObserver", "Lkotlin/Function1;", "Landroid/content/res/Configuration;", "", "getConfigurationChangeObserver", "()Lkotlin/jvm/functions/Function1;", "setConfigurationChangeObserver", "(Lkotlin/jvm/functions/Function1;)V", "currentFontWeightAdjustment", "", "<set-?>", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "desiredPointerIcon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "dirtyLayers", "", "Landroidx/compose/ui/node/OwnedLayer;", "endApplyChangesListeners", "Landroidx/compose/runtime/collection/MutableVector;", "Lkotlin/Function0;", "focusOwner", "Landroidx/compose/ui/focus/FocusOwner;", "getFocusOwner", "()Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "fontFamilyResolver$delegate", "Landroidx/compose/runtime/MutableState;", "fontLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader$annotations", "()V", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "forceUseMatrixCache", "", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalPosition", "Landroidx/compose/ui/unit/IntOffset;", "J", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hasPendingMeasureOrLayout", "getHasPendingMeasureOrLayout", "()Z", "hoverExitReceived", "inputModeManager", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "isDrawingContent", "isLifecycleInResumedState", "isRenderNodeCompatible", "keyInputModifier", "Landroidx/compose/ui/Modifier;", "keyboardModifiersRequireUpdate", "lastDownPointerPosition", "Landroidx/compose/ui/geometry/Offset;", "lastMatrixRecalculationAnimationTime", "", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "layerCache", "Landroidx/compose/ui/platform/WeakCache;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection$delegate", "matrixToWindow", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "measureAndLayoutDelegate", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "measureIteration", "getMeasureIteration", "modifierLocalManager", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "motionEventAdapter", "Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "observationClearRequested", "onMeasureConstraints", "Landroidx/compose/ui/unit/Constraints;", "onViewTreeOwnersAvailable", "Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "platformTextInputPluginRegistry", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;", "getPlatformTextInputPluginRegistry", "()Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl;", "pointerIconService", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "pointerInputEventProcessor", "Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "postponedDirtyLayers", "previousMotionEvent", "Landroid/view/MotionEvent;", "relayoutTime", "resendMotionEventOnLayout", "resendMotionEventRunnable", "androidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1", "Landroidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1;", "root", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "rootForTest", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "rotaryInputModifier", "scrollChangedListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "semanticsModifier", "Landroidx/compose/ui/semantics/SemanticsModifierCore;", "semanticsOwner", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/SemanticsOwner;", "sendHoverExitEvent", "Ljava/lang/Runnable;", "sharedDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "showLayoutBounds", "getShowLayoutBounds$annotations", "getShowLayoutBounds", "setShowLayoutBounds", "(Z)V", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "superclassInitComplete", "textInputForTests", "Landroidx/compose/ui/text/input/TextInputForTests;", "getTextInputForTests", "()Landroidx/compose/ui/text/input/TextInputForTests;", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "tmpPositionArray", "", "touchModeChangeListener", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "getView", "()Landroid/view/View;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewLayersContainer", "Landroidx/compose/ui/platform/DrawChildContainer;", "viewToWindowMatrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "viewTreeOwners", "getViewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "setViewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;)V", "viewTreeOwners$delegate", "wasMeasuredWithMultipleConstraints", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "windowPosition", "windowToViewMatrix", "fontWeightAdjustmentCompat", "getFontWeightAdjustmentCompat", "(Landroid/content/res/Configuration;)I", "addAndroidView", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "layoutNode", "values", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "autofillSupported", "boundsUpdatesEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateLocalPosition", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "(J)J", "calculatePositionInWindow", "localPosition", "calculatePositionInWindow-MK-Hz9U", "canScrollHorizontally", "direction", "canScrollVertically", "clearChildInvalidObservations", "viewGroup", "convertMeasureSpec", "Lkotlin/Pair;", "measureSpec", "createLayer", "drawBlock", "Landroidx/compose/ui/graphics/Canvas;", "invalidateParentLayer", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "dispatchGenericMotionEvent", "event", "dispatchHoverEvent", "dispatchKeyEvent", "Landroid/view/KeyEvent;", "dispatchTouchEvent", "motionEvent", "drawAndroidView", "findViewByAccessibilityIdRootedAtCurrentView", "accessibilityId", "currentView", "findViewByAccessibilityIdTraversal", "forceMeasureTheSubtree", "getFocusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "getFocusDirection-P8AzH3I", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;", "getFocusedRect", "rect", "Landroid/graphics/Rect;", "handleMotionEvent", "Landroidx/compose/ui/input/pointer/ProcessResult;", "handleMotionEvent-8iAsVTc", "(Landroid/view/MotionEvent;)I", "handleRotaryEvent", "hasChangedDevices", "lastEvent", "invalidateDescendants", "invalidateLayers", "node", "invalidateLayoutNodeMeasurement", "isBadMotionEvent", "isDevicePressEvent", "isInBounds", "isPositionChanged", "localToScreen", "localToScreen-MK-Hz9U", "measureAndLayout", "constraints", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "sendPointerUpdate", "measureAndLayoutForTest", "notifyLayerIsDirty", AdRevenueConstants.LAYER_KEY, "isDirty", "notifyLayerIsDirty$ui_release", "onAttach", "onAttachedToWindow", "onCheckIsTextEditor", "onConfigurationChanged", "newConfig", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "onDetach", "onDetachedFromWindow", "onDraw", "onEndApplyChanges", "onFocusChanged", "gainFocus", "previouslyFocusedRect", "onLayout", "changed", CmcdData.Factory.STREAM_TYPE_LIVE, ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "r", "b", "onLayoutChange", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onProvideAutofillVirtualStructure", "structure", "Landroid/view/ViewStructure;", "flags", "onRequestMeasure", "affectsLookahead", "forceRequest", "onRequestRelayout", C4240b4.i.f42655u0, "owner", "Landroidx/lifecycle/LifecycleOwner;", "onRtlPropertiesChanged", "onSemanticsChange", "onWindowFocusChanged", "hasWindowFocus", "recalculateWindowPosition", "recalculateWindowViewTransforms", "recycle", "recycle$ui_release", "registerOnEndApplyChangesListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerOnLayoutCompletedListener", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "removeAndroidView", "requestClearInvalidObservations", "requestOnPositionedCallback", "scheduleMeasureAndLayout", "nodeToRemeasure", "screenToLocal", "positionOnScreen", "screenToLocal-MK-Hz9U", "sendKeyEvent", "sendKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "sendMotionEvent", "sendMotionEvent-8iAsVTc", "sendSimulatedEvent", "action", "eventTime", "forceHover", "setOnViewTreeOwnersAvailable", "callback", "shouldDelayChildPressedState", "updatePositionCacheAndDispatch", "childSizeCanAffectParentSize", com.taurusx.tax.f.y.f66058y, "ViewTreeOwners", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ViewConstructor", "VisibleForTests"})
public final class AndroidComposeView extends ViewGroup implements Owner, ViewRootForTest, PositionCalculator, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String FocusTag = "Compose Focus";
    private static final int MaximumLayerCacheSize = 10;

    @Nullable
    private static Method getBooleanMethod;

    @Nullable
    private static Class<?> systemPropertiesClass;

    @Nullable
    private AndroidViewsHandler _androidViewsHandler;

    @Nullable
    private final AndroidAutofill _autofill;

    @NotNull
    private final InputModeManagerImpl _inputModeManager;

    @NotNull
    private final WindowInfoImpl _windowInfo;

    @NotNull
    private final AndroidComposeViewAccessibilityDelegateCompat accessibilityDelegate;

    @NotNull
    private final AndroidAccessibilityManager accessibilityManager;

    @NotNull
    private final AutofillTree autofillTree;

    @NotNull
    private final CanvasHolder canvasHolder;

    @NotNull
    private final AndroidClipboardManager clipboardManager;

    @NotNull
    private Function1<? super Configuration, Unit> configurationChangeObserver;
    private int currentFontWeightAdjustment;

    @NotNull
    private Density density;

    @Nullable
    private PointerIcon desiredPointerIcon;

    @NotNull
    private final List<OwnedLayer> dirtyLayers;

    @NotNull
    private final MutableVector<Function0<Unit>> endApplyChangesListeners;

    @NotNull
    private final FocusOwner focusOwner;

    /* JADX INFO: renamed from: fontFamilyResolver$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState fontFamilyResolver;

    @NotNull
    private final Font.ResourceLoader fontLoader;
    private boolean forceUseMatrixCache;

    @NotNull
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private long globalPosition;

    @NotNull
    private final HapticFeedback hapticFeedBack;
    private boolean hoverExitReceived;
    private boolean isDrawingContent;
    private boolean isRenderNodeCompatible;

    @NotNull
    private final Modifier keyInputModifier;
    private boolean keyboardModifiersRequireUpdate;
    private long lastDownPointerPosition;
    private long lastMatrixRecalculationAnimationTime;

    @NotNull
    private final WeakCache<OwnedLayer> layerCache;

    /* JADX INFO: renamed from: layoutDirection$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState layoutDirection;

    @NotNull
    private final CalculateMatrixToWindow matrixToWindow;

    @NotNull
    private final MeasureAndLayoutDelegate measureAndLayoutDelegate;

    @NotNull
    private final ModifierLocalManager modifierLocalManager;

    @NotNull
    private final MotionEventAdapter motionEventAdapter;
    private boolean observationClearRequested;

    @Nullable
    private Constraints onMeasureConstraints;

    @Nullable
    private Function1<? super ViewTreeOwners, Unit> onViewTreeOwnersAvailable;

    @NotNull
    private final PlatformTextInputPluginRegistryImpl platformTextInputPluginRegistry;

    @NotNull
    private final PointerIconService pointerIconService;

    @NotNull
    private final PointerInputEventProcessor pointerInputEventProcessor;

    @Nullable
    private List<OwnedLayer> postponedDirtyLayers;

    @Nullable
    private MotionEvent previousMotionEvent;
    private long relayoutTime;

    @NotNull
    private final Function0<Unit> resendMotionEventOnLayout;

    @NotNull
    private final AndroidComposeView$resendMotionEventRunnable$1 resendMotionEventRunnable;

    @NotNull
    private final LayoutNode root;

    @NotNull
    private final RootForTest rootForTest;

    @NotNull
    private final Modifier rotaryInputModifier;

    @NotNull
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;

    @NotNull
    private final SemanticsModifierCore semanticsModifier;

    @NotNull
    private final SemanticsOwner semanticsOwner;

    @NotNull
    private final Runnable sendHoverExitEvent;

    @NotNull
    private final LayoutNodeDrawScope sharedDrawScope;
    private boolean showLayoutBounds;

    @NotNull
    private final OwnerSnapshotObserver snapshotObserver;
    private boolean superclassInitComplete;

    @NotNull
    private final TextInputService textInputService;

    @NotNull
    private final TextToolbar textToolbar;

    @NotNull
    private final int[] tmpPositionArray;

    @NotNull
    private final ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;

    @NotNull
    private final ViewConfiguration viewConfiguration;

    @Nullable
    private DrawChildContainer viewLayersContainer;

    @NotNull
    private final float[] viewToWindowMatrix;

    /* JADX INFO: renamed from: viewTreeOwners$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState viewTreeOwners;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;

    @NotNull
    private final float[] windowToViewMatrix;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$Companion;", "", "()V", "FocusTag", "", "MaximumLayerCacheSize", "", "getBooleanMethod", "Ljava/lang/reflect/Method;", "systemPropertiesClass", "Ljava/lang/Class;", "getIsShowingLayoutBounds", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @SuppressLint({"PrivateApi", "BanUncheckedReflection"})
        public final boolean getIsShowingLayoutBounds() {
            try {
                if (AndroidComposeView.systemPropertiesClass == null) {
                    AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.systemPropertiesClass;
                    AndroidComposeView.getBooleanMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.getBooleanMethod;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
            } catch (Exception unused) {
            }
            return false;
        }

        private Companion() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;)V", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ViewTreeOwners {
        public static final int $stable = 8;

        @NotNull
        private final LifecycleOwner lifecycleOwner;

        @NotNull
        private final SavedStateRegistryOwner savedStateRegistryOwner;

        public ViewTreeOwners(@NotNull LifecycleOwner lifecycleOwner, @NotNull SavedStateRegistryOwner savedStateRegistryOwner) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "savedStateRegistryOwner");
            this.lifecycleOwner = lifecycleOwner;
            this.savedStateRegistryOwner = savedStateRegistryOwner;
        }

        @NotNull
        public final LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        @NotNull
        public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r12v11, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    public AndroidComposeView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Offset.Companion companion = Offset.INSTANCE;
        this.lastDownPointerPosition = companion.m1386getUnspecifiedF1C5BW0();
        this.superclassInitComplete = true;
        this.sharedDrawScope = new LayoutNodeDrawScope(null, 1, 0 == true ? 1 : 0);
        this.density = AndroidDensity_androidKt.Density(context);
        SemanticsModifierCore semanticsModifierCore = new SemanticsModifierCore(false, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$semanticsModifier$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SemanticsPropertyReceiver $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.f93236a;
            }
        }, null, 8, null);
        this.semanticsModifier = semanticsModifierCore;
        this.focusOwner = new FocusOwnerImpl(new Function1<Function0<? extends Unit>, Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$focusOwner$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
                invoke2((Function0<Unit>) function0);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Function0<Unit> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.registerOnEndApplyChangesListener(it);
            }
        });
        this._windowInfo = new WindowInfoImpl();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(companion2, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m3271invokeZmokQxo(keyEvent.m2781unboximpl());
            }

            @NotNull
            /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m3271invokeZmokQxo(@NotNull android.view.KeyEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                FocusDirection focusDirectionMo3249getFocusDirectionP8AzH3I = this.this$0.mo3249getFocusDirectionP8AzH3I(it);
                return (focusDirectionMo3249getFocusDirectionP8AzH3I == null || !KeyEventType.m2785equalsimpl0(KeyEvent_androidKt.m2793getTypeZmokQxo(it), KeyEventType.INSTANCE.m2789getKeyDownCS__XNY())) ? Boolean.FALSE : Boolean.valueOf(this.this$0.getFocusOwner().mo1313moveFocus3ESFkO8(focusDirectionMo3249getFocusDirectionP8AzH3I.getValue()));
            }
        });
        this.keyInputModifier = modifierOnKeyEvent;
        Modifier modifierOnRotaryScrollEvent = RotaryInputModifierKt.onRotaryScrollEvent(companion2, new Function1<RotaryScrollEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$rotaryInputModifier$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull RotaryScrollEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.FALSE;
            }
        });
        this.rotaryInputModifier = modifierOnRotaryScrollEvent;
        this.canvasHolder = new CanvasHolder();
        LayoutNode layoutNode = new LayoutNode(false, 0, 3, null);
        layoutNode.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        layoutNode.setDensity(getDensity());
        layoutNode.setModifier(companion2.then(semanticsModifierCore).then(modifierOnRotaryScrollEvent).then(getFocusOwner().getModifier()).then(modifierOnKeyEvent));
        this.root = layoutNode;
        this.rootForTest = this;
        this.semanticsOwner = new SemanticsOwner(getRoot());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.accessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.autofillTree = new AutofillTree();
        this.dirtyLayers = new ArrayList();
        this.motionEventAdapter = new MotionEventAdapter();
        this.pointerInputEventProcessor = new PointerInputEventProcessor(getRoot());
        this.configurationChangeObserver = new Function1<Configuration, Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$configurationChangeObserver$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Configuration it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                invoke2(configuration);
                return Unit.f93236a;
            }
        };
        this._autofill = autofillSupported() ? new AndroidAutofill(this, getAutofillTree()) : null;
        this.clipboardManager = new AndroidClipboardManager(context);
        this.accessibilityManager = new AndroidAccessibilityManager(context);
        this.snapshotObserver = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.measureAndLayoutDelegate = new MeasureAndLayoutDelegate(getRoot());
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        Intrinsics.checkNotNullExpressionValue(viewConfiguration, "get(context)");
        this.viewConfiguration = new AndroidViewConfiguration(viewConfiguration);
        this.globalPosition = IntOffsetKt.IntOffset(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.tmpPositionArray = new int[]{0, 0};
        this.viewToWindowMatrix = Matrix.m1809constructorimpl$default(null, 1, null);
        this.windowToViewMatrix = Matrix.m1809constructorimpl$default(null, 1, null);
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.windowPosition = companion.m1385getInfiniteF1C5BW0();
        this.isRenderNodeCompatible = true;
        this.viewTreeOwners = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.d
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.globalLayoutListener$lambda$1(this.f4427b);
            }
        };
        this.scrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.e
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.scrollChangedListener$lambda$2(this.f4428b);
            }
        };
        this.touchModeChangeListener = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.f
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z10) {
                AndroidComposeView.touchModeChangeListener$lambda$3(this.f4429b, z10);
            }
        };
        this.platformTextInputPluginRegistry = new PlatformTextInputPluginRegistryImpl(new Function2<PlatformTextInputPlugin<?>, PlatformTextInput, PlatformTextInputAdapter>() { // from class: androidx.compose.ui.platform.AndroidComposeView$platformTextInputPluginRegistry$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final PlatformTextInputAdapter invoke(@NotNull PlatformTextInputPlugin<?> factory, @NotNull PlatformTextInput platformTextInput) {
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(platformTextInput, "platformTextInput");
                return factory.createAdapter(platformTextInput, this.this$0);
            }
        });
        this.textInputService = ((AndroidTextInputServicePlugin.Adapter) getPlatformTextInputPluginRegistry().getOrCreateAdapter(AndroidTextInputServicePlugin.INSTANCE).getAdapter()).getService();
        this.fontLoader = new AndroidFontResourceLoader(context);
        this.fontFamilyResolver = SnapshotStateKt.mutableStateOf(FontFamilyResolver_androidKt.createFontFamilyResolver(context), SnapshotStateKt.referentialEqualityPolicy());
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "context.resources.configuration");
        this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(configuration);
        Configuration configuration2 = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "context.resources.configuration");
        this.layoutDirection = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AndroidComposeView_androidKt.getLocaleLayoutDirection(configuration2), null, 2, null);
        this.hapticFeedBack = new PlatformHapticFeedback(this);
        this._inputModeManager = new InputModeManagerImpl(isInTouchMode() ? InputMode.INSTANCE.m2190getTouchaOaMEAU() : InputMode.INSTANCE.m2189getKeyboardaOaMEAU(), new Function1<InputMode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(InputMode inputMode) {
                return m3270invokeiuPiT84(inputMode.getValue());
            }

            @NotNull
            /* JADX INFO: renamed from: invoke-iuPiT84, reason: not valid java name */
            public final Boolean m3270invokeiuPiT84(int i10) {
                InputMode.Companion companion3 = InputMode.INSTANCE;
                return Boolean.valueOf(InputMode.m2185equalsimpl0(i10, companion3.m2190getTouchaOaMEAU()) ? this.this$0.isInTouchMode() : InputMode.m2185equalsimpl0(i10, companion3.m2189getKeyboardaOaMEAU()) ? this.this$0.isInTouchMode() ? this.this$0.requestFocusFromTouch() : true : false);
            }
        }, null);
        this.modifierLocalManager = new ModifierLocalManager(this);
        this.textToolbar = new AndroidTextToolbar(this);
        this.layerCache = new WeakCache<>();
        this.endApplyChangesListeners = new MutableVector<>(new Function0[16], 0);
        this.resendMotionEventRunnable = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                this.this$0.removeCallbacks(this);
                MotionEvent motionEvent = this.this$0.previousMotionEvent;
                if (motionEvent != null) {
                    boolean z10 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z10) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i10 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i10 = 2;
                    }
                    AndroidComposeView androidComposeView = this.this$0;
                    androidComposeView.sendSimulatedEvent(motionEvent, i10, androidComposeView.relayoutTime, false);
                }
            }
        };
        this.sendHoverExitEvent = new Runnable() { // from class: androidx.compose.ui.platform.g
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.sendHoverExitEvent$lambda$5(this.f4430b);
            }
        };
        this.resendMotionEventOnLayout = new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1
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
                MotionEvent motionEvent = this.this$0.previousMotionEvent;
                if (motionEvent != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 7 || actionMasked == 9) {
                        this.this$0.relayoutTime = SystemClock.uptimeMillis();
                        AndroidComposeView androidComposeView = this.this$0;
                        androidComposeView.post(androidComposeView.resendMotionEventRunnable);
                    }
                }
            }
        };
        int i10 = Build.VERSION.SDK_INT;
        this.matrixToWindow = i10 >= 29 ? new CalculateMatrixToWindowApi29() : new CalculateMatrixToWindowApi21();
        setWillNotDraw(false);
        setFocusable(true);
        if (i10 >= 26) {
            AndroidComposeViewVerificationHelperMethodsO.INSTANCE.focusable(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ViewCompat.setAccessibilityDelegate(this, androidComposeViewAccessibilityDelegateCompat);
        Function1<ViewRootForTest, Unit> onViewCreatedCallback = ViewRootForTest.INSTANCE.getOnViewCreatedCallback();
        if (onViewCreatedCallback != null) {
            onViewCreatedCallback.invoke(this);
        }
        getRoot().attach$ui_release(this);
        if (i10 >= 29) {
            AndroidComposeViewForceDarkModeQ.INSTANCE.disallowForceDark(this);
        }
        this.pointerIconService = new PointerIconService() { // from class: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1
            @Override // androidx.compose.ui.input.pointer.PointerIconService
            @NotNull
            public PointerIcon getCurrent() {
                PointerIcon pointerIcon = this.this$0.desiredPointerIcon;
                return pointerIcon == null ? PointerIcon.INSTANCE.getDefault() : pointerIcon;
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public void setCurrent(@NotNull PointerIcon value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this.this$0.desiredPointerIcon = value;
            }
        };
    }

    private final boolean autofillSupported() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private final boolean childSizeCanAffectParentSize(LayoutNode layoutNode) {
        if (this.wasMeasuredWithMultipleConstraints) {
            return true;
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        return (parent$ui_release == null || parent$ui_release.getHasFixedInnerContentConstraints$ui_release()) ? false : true;
    }

    private final void clearChildInvalidObservations(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                clearChildInvalidObservations((ViewGroup) childAt);
            }
        }
    }

    private final Pair<Integer, Integer> convertMeasureSpec(int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode == Integer.MIN_VALUE) {
            return TuplesKt.to(0, Integer.valueOf(size));
        }
        if (mode == 0) {
            return TuplesKt.to(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return TuplesKt.to(Integer.valueOf(size), Integer.valueOf(size));
        }
        throw new IllegalStateException();
    }

    private final View findViewByAccessibilityIdRootedAtCurrentView(int accessibilityId, View currentView) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (Intrinsics.areEqual(declaredMethod.invoke(currentView, null), Integer.valueOf(accessibilityId))) {
                return currentView;
            }
            if (currentView instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) currentView;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    Intrinsics.checkNotNullExpressionValue(childAt, "currentView.getChildAt(i)");
                    View viewFindViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(accessibilityId, childAt);
                    if (viewFindViewByAccessibilityIdRootedAtCurrentView != null) {
                        return viewFindViewByAccessibilityIdRootedAtCurrentView;
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    private final int getFontWeightAdjustmentCompat(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    @VisibleForTesting
    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void globalLayoutListener$lambda$1(AndroidComposeView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updatePositionCacheAndDispatch();
    }

    /* JADX INFO: renamed from: handleMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m3268handleMotionEvent8iAsVTc(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        removeCallbacks(this.resendMotionEventRunnable);
        try {
            recalculateWindowPosition(motionEvent);
            boolean z10 = true;
            this.forceUseMatrixCache = true;
            measureAndLayout(false);
            this.desiredPointerIcon = null;
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.previousMotionEvent;
                boolean z11 = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                if (motionEvent3 == null || !hasChangedDevices(motionEvent, motionEvent3)) {
                    motionEvent2 = motionEvent3;
                } else {
                    if (isDevicePressEvent(motionEvent3)) {
                        this.pointerInputEventProcessor.processCancel();
                    } else if (motionEvent3.getActionMasked() != 10 && z11) {
                        sendSimulatedEvent$default(this, motionEvent3, 10, motionEvent3.getEventTime(), false, 8, null);
                        motionEvent2 = motionEvent3;
                    }
                    motionEvent2 = motionEvent3;
                }
                if (motionEvent.getToolType(0) != 3) {
                    z10 = false;
                }
                if (!z11 && z10 && actionMasked != 3 && actionMasked != 9 && isInBounds(motionEvent)) {
                    sendSimulatedEvent$default(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                int iM3269sendMotionEvent8iAsVTc = m3269sendMotionEvent8iAsVTc(motionEvent);
                Trace.endSection();
                if (Build.VERSION.SDK_INT >= 24) {
                    AndroidComposeViewVerificationHelperMethodsN.INSTANCE.setPointerIcon(this, this.desiredPointerIcon);
                }
                return iM3269sendMotionEvent8iAsVTc;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } finally {
            this.forceUseMatrixCache = false;
        }
    }

    private final boolean handleRotaryEvent(MotionEvent event) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        float f10 = -event.getAxisValue(26);
        return getFocusOwner().dispatchRotaryEvent(new RotaryScrollEvent(ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, getContext()) * f10, f10 * ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, getContext()), event.getEventTime()));
    }

    private final boolean hasChangedDevices(MotionEvent event, MotionEvent lastEvent) {
        return (lastEvent.getSource() == event.getSource() && lastEvent.getToolType(0) == event.getToolType(0)) ? false : true;
    }

    private final void invalidateLayers(LayoutNode node) {
        node.invalidateLayers$ui_release();
        MutableVector<LayoutNode> mutableVector = node.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                invalidateLayers(content[i10]);
                i10++;
            } while (i10 < size);
        }
    }

    private final void invalidateLayoutNodeMeasurement(LayoutNode node) {
        int i10 = 0;
        MeasureAndLayoutDelegate.requestRemeasure$default(this.measureAndLayoutDelegate, node, false, 2, null);
        MutableVector<LayoutNode> mutableVector = node.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            do {
                invalidateLayoutNodeMeasurement(content[i10]);
                i10++;
            } while (i10 < size);
        }
    }

    private final boolean isBadMotionEvent(MotionEvent event) {
        float x10 = event.getX();
        if (Float.isInfinite(x10) || Float.isNaN(x10)) {
            return true;
        }
        float y10 = event.getY();
        if (Float.isInfinite(y10) || Float.isNaN(y10)) {
            return true;
        }
        float rawX = event.getRawX();
        if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
            return true;
        }
        float rawY = event.getRawY();
        return Float.isInfinite(rawY) || Float.isNaN(rawY);
    }

    private final boolean isDevicePressEvent(MotionEvent event) {
        int actionMasked;
        return event.getButtonState() != 0 || (actionMasked = event.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean isInBounds(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return 0.0f <= x10 && x10 <= ((float) getWidth()) && 0.0f <= y10 && y10 <= ((float) getHeight());
    }

    private final boolean isPositionChanged(MotionEvent event) {
        MotionEvent motionEvent;
        return (event.getPointerCount() == 1 && (motionEvent = this.previousMotionEvent) != null && event.getRawX() == motionEvent.getRawX() && event.getRawY() == motionEvent.getRawY()) ? false : true;
    }

    private final void recalculateWindowPosition() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            recalculateWindowViewTransforms();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            float f10 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.tmpPositionArray;
            this.windowPosition = OffsetKt.Offset(f10 - iArr2[0], f11 - iArr2[1]);
        }
    }

    private final void recalculateWindowViewTransforms() {
        this.matrixToWindow.mo3277calculateMatrixToWindowEL8BTi8(this, this.viewToWindowMatrix);
        InvertMatrixKt.m3301invertToJiSxe2E(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    private final void scheduleMeasureAndLayout(LayoutNode nodeToRemeasure) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (nodeToRemeasure != null) {
            while (nodeToRemeasure != null && nodeToRemeasure.getMeasuredByParent() == LayoutNode.UsageByParent.InMeasureBlock && childSizeCanAffectParentSize(nodeToRemeasure)) {
                nodeToRemeasure = nodeToRemeasure.getParent$ui_release();
            }
            if (nodeToRemeasure == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    static /* synthetic */ void scheduleMeasureAndLayout$default(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.scheduleMeasureAndLayout(layoutNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollChangedListener$lambda$2(AndroidComposeView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updatePositionCacheAndDispatch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendHoverExitEvent$lambda$5(AndroidComposeView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hoverExitReceived = false;
        MotionEvent motionEvent = this$0.previousMotionEvent;
        Intrinsics.checkNotNull(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        this$0.m3269sendMotionEvent8iAsVTc(motionEvent);
    }

    /* JADX INFO: renamed from: sendMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m3269sendMotionEvent8iAsVTc(MotionEvent motionEvent) {
        PointerInputEventData pointerInputEventDataPrevious;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            this._windowInfo.m3332setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m2955constructorimpl(motionEvent.getMetaState()));
        }
        PointerInputEvent pointerInputEventConvertToPointerInputEvent$ui_release = this.motionEventAdapter.convertToPointerInputEvent$ui_release(motionEvent, this);
        if (pointerInputEventConvertToPointerInputEvent$ui_release == null) {
            this.pointerInputEventProcessor.processCancel();
            return PointerInputEventProcessorKt.ProcessResult(false, false);
        }
        List<PointerInputEventData> pointers = pointerInputEventConvertToPointerInputEvent$ui_release.getPointers();
        ListIterator<PointerInputEventData> listIterator = pointers.listIterator(pointers.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                pointerInputEventDataPrevious = null;
                break;
            }
            pointerInputEventDataPrevious = listIterator.previous();
            if (pointerInputEventDataPrevious.getDown()) {
                break;
            }
        }
        PointerInputEventData pointerInputEventData = pointerInputEventDataPrevious;
        if (pointerInputEventData != null) {
            this.lastDownPointerPosition = pointerInputEventData.m2920getPositionF1C5BW0();
        }
        int iM2925processBIzXfog = this.pointerInputEventProcessor.m2925processBIzXfog(pointerInputEventConvertToPointerInputEvent$ui_release, this, isInBounds(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 0 || actionMasked == 5) && !ProcessResult.m2980getDispatchedToAPointerInputModifierimpl(iM2925processBIzXfog)) {
            this.motionEventAdapter.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return iM2925processBIzXfog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSimulatedEvent(MotionEvent motionEvent, int action, long eventTime, boolean forceHover) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (action != 9 && action != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            pointerPropertiesArr[i10] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerCoordsArr[i11] = new MotionEvent.PointerCoords();
        }
        int i12 = 0;
        while (i12 < pointerCount) {
            int i13 = ((actionIndex < 0 || i12 < actionIndex) ? 0 : 1) + i12;
            motionEvent.getPointerProperties(i13, pointerPropertiesArr[i12]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i12];
            motionEvent.getPointerCoords(i13, pointerCoords);
            long jMo2973localToScreenMKHz9U = mo2973localToScreenMKHz9U(OffsetKt.Offset(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = Offset.m1371getXimpl(jMo2973localToScreenMKHz9U);
            pointerCoords.y = Offset.m1372getYimpl(jMo2973localToScreenMKHz9U);
            i12++;
        }
        MotionEvent event = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? eventTime : motionEvent.getDownTime(), eventTime, action, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), forceHover ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        MotionEventAdapter motionEventAdapter = this.motionEventAdapter;
        Intrinsics.checkNotNullExpressionValue(event, "event");
        PointerInputEvent pointerInputEventConvertToPointerInputEvent$ui_release = motionEventAdapter.convertToPointerInputEvent$ui_release(event, this);
        Intrinsics.checkNotNull(pointerInputEventConvertToPointerInputEvent$ui_release);
        this.pointerInputEventProcessor.m2925processBIzXfog(pointerInputEventConvertToPointerInputEvent$ui_release, this, true);
        event.recycle();
    }

    static /* synthetic */ void sendSimulatedEvent$default(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i10, long j10, boolean z10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        androidComposeView.sendSimulatedEvent(motionEvent, i10, j10, z10);
    }

    private void setFontFamilyResolver(FontFamily.Resolver resolver) {
        this.fontFamilyResolver.setValue(resolver);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection.setValue(layoutDirection);
    }

    private final void setViewTreeOwners(ViewTreeOwners viewTreeOwners) {
        this.viewTreeOwners.setValue(viewTreeOwners);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchModeChangeListener$lambda$3(AndroidComposeView this$0, boolean z10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0._inputModeManager.m2193setInputModeiuPiT84(z10 ? InputMode.INSTANCE.m2190getTouchaOaMEAU() : InputMode.INSTANCE.m2189getKeyboardaOaMEAU());
    }

    private final void updatePositionCacheAndDispatch() {
        getLocationOnScreen(this.tmpPositionArray);
        long j10 = this.globalPosition;
        int iM4061component1impl = IntOffset.m4061component1impl(j10);
        int iM4062component2impl = IntOffset.m4062component2impl(j10);
        int[] iArr = this.tmpPositionArray;
        boolean z10 = false;
        int i10 = iArr[0];
        if (iM4061component1impl != i10 || iM4062component2impl != iArr[1]) {
            this.globalPosition = IntOffsetKt.IntOffset(i10, iArr[1]);
            if (iM4061component1impl != Integer.MAX_VALUE && iM4062component2impl != Integer.MAX_VALUE) {
                getRoot().getLayoutDelegate().getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
                z10 = true;
            }
        }
        this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z10);
    }

    public final void addAndroidView(@NotNull AndroidViewHolder view, @NotNull final LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(view, layoutNode);
        getAndroidViewsHandler$ui_release().addView(view);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, view);
        ViewCompat.setImportantForAccessibility(view, 1);
        ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat() { // from class: androidx.compose.ui.platform.AndroidComposeView.addAndroidView.1
            /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
            @Override // androidx.core.view.AccessibilityDelegateCompat
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onInitializeAccessibilityNodeInfo(@org.jetbrains.annotations.NotNull android.view.View r3, @org.jetbrains.annotations.NotNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4) {
                /*
                    r2 = this;
                    java.lang.String r0 = "host"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    java.lang.String r0 = "info"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    super.onInitializeAccessibilityNodeInfo(r3, r4)
                    androidx.compose.ui.node.LayoutNode r3 = r1
                    androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1 r0 = new kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, java.lang.Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1
                        static {
                            /*
                                androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1 r0 = new androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1
                                r0.<init>()
                                
                                // error: 0x0005: SPUT (r0 I:androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1) androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1.INSTANCE androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1.<clinit>():void");
                        }

                        {
                            /*
                                r1 = this;
                                r0 = 1
                                r1.<init>(r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1.<init>():void");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @org.jetbrains.annotations.NotNull
                        public final java.lang.Boolean invoke(@org.jetbrains.annotations.NotNull androidx.compose.ui.node.LayoutNode r2) {
                            /*
                                r1 = this;
                                java.lang.String r0 = "it"
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                                androidx.compose.ui.node.SemanticsModifierNode r2 = androidx.compose.ui.semantics.SemanticsNodeKt.getOuterSemantics(r2)
                                if (r2 == 0) goto Ld
                                r2 = 1
                                goto Le
                            Ld:
                                r2 = 0
                            Le:
                                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                                return r2
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1.invoke(androidx.compose.ui.node.LayoutNode):java.lang.Boolean");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode r1) {
                            /*
                                r0 = this;
                                androidx.compose.ui.node.LayoutNode r1 = (androidx.compose.ui.node.LayoutNode) r1
                                java.lang.Boolean r1 = r0.invoke(r1)
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1.invoke(java.lang.Object):java.lang.Object");
                        }
                    }
                    androidx.compose.ui.node.LayoutNode r3 = androidx.compose.ui.semantics.SemanticsNodeKt.findClosestParentNode(r3, r0)
                    if (r3 == 0) goto L20
                    int r3 = r3.getSemanticsId()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    goto L21
                L20:
                    r3 = 0
                L21:
                    if (r3 == 0) goto L37
                    androidx.compose.ui.platform.AndroidComposeView r0 = r2
                    androidx.compose.ui.semantics.SemanticsOwner r0 = r0.getSemanticsOwner()
                    androidx.compose.ui.semantics.SemanticsNode r0 = r0.getUnmergedRootSemanticsNode()
                    int r0 = r0.getId()
                    int r1 = r3.intValue()
                    if (r1 != r0) goto L3c
                L37:
                    r3 = -1
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                L3c:
                    androidx.compose.ui.platform.AndroidComposeView r0 = r3
                    int r3 = r3.intValue()
                    r4.setParent(r0, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.AnonymousClass1.onInitializeAccessibilityNodeInfo(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
            }
        });
    }

    @Override // android.view.View
    public void autofill(@NotNull SparseArray<AutofillValue> values) {
        AndroidAutofill androidAutofill;
        Intrinsics.checkNotNullParameter(values, "values");
        if (!autofillSupported() || (androidAutofill = this._autofill) == null) {
            return;
        }
        AndroidAutofill_androidKt.performAutofill(androidAutofill, values);
    }

    @Nullable
    public final Object boundsUpdatesEventLoop(@NotNull Continuation continuation) {
        Object objBoundsUpdatesEventLoop = this.accessibilityDelegate.boundsUpdatesEventLoop(continuation);
        return objBoundsUpdatesEventLoop == pf.b.g() ? objBoundsUpdatesEventLoop : Unit.f93236a;
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: calculateLocalPosition-MK-Hz9U */
    public long mo3247calculateLocalPositionMKHz9U(long positionInWindow) {
        recalculateWindowPosition();
        return Matrix.m1815mapMKHz9U(this.windowToViewMatrix, positionInWindow);
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: calculatePositionInWindow-MK-Hz9U */
    public long mo3248calculatePositionInWindowMKHz9U(long localPosition) {
        recalculateWindowPosition();
        return Matrix.m1815mapMKHz9U(this.viewToWindowMatrix, localPosition);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        return this.accessibilityDelegate.m3272canScroll0AR0LA0$ui_release(false, direction, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int direction) {
        return this.accessibilityDelegate.m3272canScroll0AR0LA0$ui_release(true, direction, this.lastDownPointerPosition);
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public OwnedLayer createLayer(@NotNull Function1<? super Canvas, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        DrawChildContainer viewLayerContainer;
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        OwnedLayer ownedLayerPop = this.layerCache.pop();
        if (ownedLayerPop != null) {
            ownedLayerPop.reuseLayer(drawBlock, invalidateParentLayer);
            return ownedLayerPop;
        }
        if (isHardwareAccelerated() && this.isRenderNodeCompatible) {
            try {
                return new RenderNodeLayer(this, drawBlock, invalidateParentLayer);
            } catch (Throwable unused) {
                this.isRenderNodeCompatible = false;
            }
        }
        if (this.viewLayersContainer == null) {
            ViewLayer.Companion companion = ViewLayer.INSTANCE;
            if (!companion.getHasRetrievedMethod()) {
                companion.updateDisplayList(new View(getContext()));
            }
            if (companion.getShouldUseDispatchDraw()) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                viewLayerContainer = new DrawChildContainer(context);
            } else {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                viewLayerContainer = new ViewLayerContainer(context2);
            }
            this.viewLayersContainer = viewLayerContainer;
            addView(viewLayerContainer);
        }
        DrawChildContainer drawChildContainer = this.viewLayersContainer;
        Intrinsics.checkNotNull(drawChildContainer);
        return new ViewLayer(this, drawChildContainer, drawBlock, invalidateParentLayer);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!isAttachedToWindow()) {
            invalidateLayers(getRoot());
        }
        androidx.compose.ui.node.e.e(this, false, 1, null);
        this.isDrawingContent = true;
        CanvasHolder canvasHolder = this.canvasHolder;
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        getRoot().draw$ui_release(canvasHolder.getAndroidCanvas());
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        if (!this.dirtyLayers.isEmpty()) {
            int size = this.dirtyLayers.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.dirtyLayers.get(i10).updateDisplayList();
            }
        }
        if (ViewLayer.INSTANCE.getShouldUseDispatchDraw()) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        List<OwnedLayer> list = this.postponedDirtyLayers;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            this.dirtyLayers.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return event.getActionMasked() == 8 ? event.isFromSource(4194304) ? handleRotaryEvent(event) : (isBadMotionEvent(event) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(event) : ProcessResult.m2980getDispatchedToAPointerInputModifierimpl(m3268handleMotionEvent8iAsVTc(event)) : super.dispatchGenericMotionEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (isBadMotionEvent(event) || !isAttachedToWindow()) {
            return false;
        }
        if (event.isFromSource(InputDeviceCompat.SOURCE_TOUCHSCREEN) && event.getToolType(0) == 1) {
            return this.accessibilityDelegate.dispatchHoverEvent(event);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && isInBounds(event)) {
                if (event.getToolType(0) != 3) {
                    MotionEvent motionEvent = this.previousMotionEvent;
                    if (motionEvent != null) {
                        motionEvent.recycle();
                    }
                    this.previousMotionEvent = MotionEvent.obtainNoHistory(event);
                    this.hoverExitReceived = true;
                    post(this.sendHoverExitEvent);
                    return false;
                }
                if (event.getButtonState() != 0) {
                    return false;
                }
            }
        } else if (!isPositionChanged(event)) {
            return false;
        }
        return ProcessResult.m2980getDispatchedToAPointerInputModifierimpl(m3268handleMotionEvent8iAsVTc(event));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@NotNull android.view.KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isFocused()) {
            return super.dispatchKeyEvent(event);
        }
        this._windowInfo.m3332setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m2955constructorimpl(event.getMetaState()));
        return mo3251sendKeyEventZmokQxo(KeyEvent.m2776constructorimpl(event));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            Intrinsics.checkNotNull(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || hasChangedDevices(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !isPositionChanged(motionEvent)) {
            return false;
        }
        int iM3268handleMotionEvent8iAsVTc = m3268handleMotionEvent8iAsVTc(motionEvent);
        if (ProcessResult.m2979getAnyMovementConsumedimpl(iM3268handleMotionEvent8iAsVTc)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return ProcessResult.m2980getDispatchedToAPointerInputModifierimpl(iM3268handleMotionEvent8iAsVTc);
    }

    public final void drawAndroidView(@NotNull AndroidViewHolder view, @NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getAndroidViewsHandler$ui_release().drawView(view, canvas);
    }

    @Nullable
    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return findViewByAccessibilityIdRootedAtCurrentView(accessibilityId, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void forceMeasureTheSubtree(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.measureAndLayoutDelegate.forceMeasureTheSubtree(layoutNode);
    }

    @NotNull
    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this._androidViewsHandler == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(context);
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler);
        }
        AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        Intrinsics.checkNotNull(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // androidx.compose.ui.node.Owner
    @Nullable
    public Autofill getAutofill() {
        return this._autofill;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    @NotNull
    public final Function1<Configuration, Unit> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    @NotNull
    public Density getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.node.Owner
    @Nullable
    /* JADX INFO: renamed from: getFocusDirection-P8AzH3I */
    public FocusDirection mo3249getFocusDirectionP8AzH3I(@NotNull android.view.KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        long jM2792getKeyZmokQxo = KeyEvent_androidKt.m2792getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.INSTANCE;
        if (Key.m2197equalsimpl0(jM2792getKeyZmokQxo, companion.m2720getTabEK5gGoQ())) {
            return FocusDirection.m1292boximpl(KeyEvent_androidKt.m2798isShiftPressedZmokQxo(keyEvent) ? FocusDirection.INSTANCE.m1310getPreviousdhqQ8s() : FocusDirection.INSTANCE.m1308getNextdhqQ8s());
        }
        if (Key.m2197equalsimpl0(jM2792getKeyZmokQxo, companion.m2561getDirectionRightEK5gGoQ())) {
            return FocusDirection.m1292boximpl(FocusDirection.INSTANCE.m1311getRightdhqQ8s());
        }
        if (Key.m2197equalsimpl0(jM2792getKeyZmokQxo, companion.m2560getDirectionLeftEK5gGoQ())) {
            return FocusDirection.m1292boximpl(FocusDirection.INSTANCE.m1307getLeftdhqQ8s());
        }
        if (Key.m2197equalsimpl0(jM2792getKeyZmokQxo, companion.m2562getDirectionUpEK5gGoQ())) {
            return FocusDirection.m1292boximpl(FocusDirection.INSTANCE.m1312getUpdhqQ8s());
        }
        if (Key.m2197equalsimpl0(jM2792getKeyZmokQxo, companion.m2557getDirectionDownEK5gGoQ())) {
            return FocusDirection.m1292boximpl(FocusDirection.INSTANCE.m1303getDowndhqQ8s());
        }
        if (Key.m2197equalsimpl0(jM2792getKeyZmokQxo, companion.m2556getDirectionCenterEK5gGoQ()) ? true : Key.m2197equalsimpl0(jM2792getKeyZmokQxo, companion.m2570getEnterEK5gGoQ()) ? true : Key.m2197equalsimpl0(jM2792getKeyZmokQxo, companion.m2662getNumPadEnterEK5gGoQ())) {
            return FocusDirection.m1292boximpl(FocusDirection.INSTANCE.m1304getEnterdhqQ8s());
        }
        if (Key.m2197equalsimpl0(jM2792getKeyZmokQxo, companion.m2499getBackEK5gGoQ()) ? true : Key.m2197equalsimpl0(jM2792getKeyZmokQxo, companion.m2573getEscapeEK5gGoQ())) {
            return FocusDirection.m1292boximpl(FocusDirection.INSTANCE.m1305getExitdhqQ8s());
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public FocusOwner getFocusOwner() {
        return this.focusOwner;
    }

    @Override // android.view.View
    public void getFocusedRect(@NotNull Rect rect) {
        Unit unit;
        Intrinsics.checkNotNullParameter(rect, "rect");
        androidx.compose.ui.geometry.Rect focusRect = getFocusOwner().getFocusRect();
        if (focusRect != null) {
            rect.left = zf.a.d(focusRect.getLeft());
            rect.top = zf.a.d(focusRect.getTop());
            rect.right = zf.a.d(focusRect.getRight());
            rect.bottom = zf.a.d(focusRect.getBottom());
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public FontFamily.Resolver getFontFamilyResolver() {
        return (FontFamily.Resolver) this.fontFamilyResolver.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public Font.ResourceLoader getFontLoader() {
        return this.fontLoader;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public InputModeManager getInputModeManager() {
        return this._inputModeManager;
    }

    /* JADX INFO: renamed from: getLastMatrixRecalculationAnimationTime$ui_release, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.layoutDirection.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.getMeasureIteration();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public PointerIconService getPointerIconService() {
        return this.pointerIconService;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public LayoutNode getRoot() {
        return this.root;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public RootForTest getRootForTest() {
        return this.rootForTest;
    }

    @Override // androidx.compose.ui.node.RootForTest
    @NotNull
    public SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.RootForTest
    @Nullable
    public TextInputForTests getTextInputForTests() {
        PlatformTextInputAdapter focusedAdapter = getPlatformTextInputPluginRegistry().getFocusedAdapter();
        if (focusedAdapter != null) {
            return focusedAdapter.getInputForTests();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    @NotNull
    public TextInputService getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    @NotNull
    public View getView() {
        return this;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners) this.viewTreeOwners.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public WindowInfo getWindowInfo() {
        return this._windowInfo;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public void invalidateDescendants() {
        invalidateLayers(getRoot());
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean isLifecycleInResumedState() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        return ((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getState()) == Lifecycle.State.RESUMED;
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* JADX INFO: renamed from: localToScreen-MK-Hz9U */
    public long mo2973localToScreenMKHz9U(long localPosition) {
        recalculateWindowPosition();
        long jM1815mapMKHz9U = Matrix.m1815mapMKHz9U(this.viewToWindowMatrix, localPosition);
        return OffsetKt.Offset(Offset.m1371getXimpl(jM1815mapMKHz9U) + Offset.m1371getXimpl(this.windowPosition), Offset.m1372getYimpl(jM1815mapMKHz9U) + Offset.m1372getYimpl(this.windowPosition));
    }

    @Override // androidx.compose.ui.node.Owner
    public void measureAndLayout(boolean sendPointerUpdate) {
        Function0<Unit> function0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (sendPointerUpdate) {
            try {
                function0 = this.resendMotionEventOnLayout;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } else {
            function0 = null;
        }
        if (this.measureAndLayoutDelegate.measureAndLayout(function0)) {
            requestLayout();
        }
        MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
        Unit unit = Unit.f93236a;
        Trace.endSection();
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: measureAndLayout-0kLqBqw */
    public void mo3250measureAndLayout0kLqBqw(@NotNull LayoutNode layoutNode, long constraints) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.m3155measureAndLayout0kLqBqw(layoutNode, constraints);
            MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
            Unit unit = Unit.f93236a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void measureAndLayoutForTest() {
        androidx.compose.ui.node.e.e(this, false, 1, null);
    }

    public final void notifyLayerIsDirty$ui_release(@NotNull OwnedLayer layer, boolean isDirty) {
        Intrinsics.checkNotNullParameter(layer, "layer");
        if (!isDirty) {
            if (this.isDrawingContent) {
                return;
            }
            this.dirtyLayers.remove(layer);
            List<OwnedLayer> list = this.postponedDirtyLayers;
            if (list != null) {
                list.remove(layer);
                return;
            }
            return;
        }
        if (!this.isDrawingContent) {
            this.dirtyLayers.add(layer);
            return;
        }
        List arrayList = this.postponedDirtyLayers;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.postponedDirtyLayers = arrayList;
        }
        arrayList.add(layer);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onAttach(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidAutofill androidAutofill;
        super.onAttachedToWindow();
        invalidateLayoutNodeMeasurement(getRoot());
        invalidateLayers(getRoot());
        getSnapshotObserver().startObserving$ui_release();
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.register(androidAutofill);
        }
        LifecycleOwner lifecycleOwner2 = ViewTreeLifecycleOwner.get(this);
        SavedStateRegistryOwner savedStateRegistryOwner = ViewTreeSavedStateRegistryOwner.get(this);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (lifecycleOwner2 != null && savedStateRegistryOwner != null && (lifecycleOwner2 != viewTreeOwners.getLifecycleOwner() || savedStateRegistryOwner != viewTreeOwners.getLifecycleOwner()))) {
            if (lifecycleOwner2 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (savedStateRegistryOwner == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(this);
            }
            lifecycleOwner2.getLifecycle().addObserver(this);
            ViewTreeOwners viewTreeOwners2 = new ViewTreeOwners(lifecycleOwner2, savedStateRegistryOwner);
            setViewTreeOwners(viewTreeOwners2);
            Function1<? super ViewTreeOwners, Unit> function1 = this.onViewTreeOwnersAvailable;
            if (function1 != null) {
                function1.invoke(viewTreeOwners2);
            }
            this.onViewTreeOwnersAvailable = null;
        }
        this._inputModeManager.m2193setInputModeiuPiT84(isInTouchMode() ? InputMode.INSTANCE.m2190getTouchaOaMEAU() : InputMode.INSTANCE.m2189getKeyboardaOaMEAU());
        ViewTreeOwners viewTreeOwners3 = getViewTreeOwners();
        Intrinsics.checkNotNull(viewTreeOwners3);
        viewTreeOwners3.getLifecycleOwner().getLifecycle().addObserver(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        return getPlatformTextInputPluginRegistry().getFocusedAdapter() != null;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.density = AndroidDensity_androidKt.Density(context);
        if (getFontWeightAdjustmentCompat(newConfig) != this.currentFontWeightAdjustment) {
            this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(newConfig);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            setFontFamilyResolver(FontFamilyResolver_androidKt.createFontFamilyResolver(context2));
        }
        this.configurationChangeObserver.invoke(newConfig);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.a(this, lifecycleOwner);
    }

    @Override // android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NotNull EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        PlatformTextInputAdapter focusedAdapter = getPlatformTextInputPluginRegistry().getFocusedAdapter();
        if (focusedAdapter != null) {
            return focusedAdapter.createInputConnection(outAttrs);
        }
        return null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.b(this, lifecycleOwner);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onDetach(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.measureAndLayoutDelegate.onNodeDetached(node);
        requestClearInvalidObservations();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        AndroidAutofill androidAutofill;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        super.onDetachedFromWindow();
        getSnapshotObserver().stopObserving$ui_release();
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.unregister(androidAutofill);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
    }

    @Override // android.view.View
    protected void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
    }

    @Override // androidx.compose.ui.node.Owner
    public void onEndApplyChanges() {
        if (this.observationClearRequested) {
            getSnapshotObserver().clearInvalidObservations$ui_release();
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            clearChildInvalidObservations(androidViewsHandler);
        }
        while (this.endApplyChangesListeners.isNotEmpty()) {
            int size = this.endApplyChangesListeners.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                Function0<Unit> function0 = this.endApplyChangesListeners.getContent()[i10];
                this.endApplyChangesListeners.set(i10, null);
                if (function0 != null) {
                    function0.invoke();
                }
            }
            this.endApplyChangesListeners.removeRange(0, size);
        }
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean gainFocus, int direction, @Nullable Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        Log.d(FocusTag, "Owner FocusChanged(" + gainFocus + ')');
        if (gainFocus) {
            getFocusOwner().takeFocus();
        } else {
            getFocusOwner().releaseFocus();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
        this.measureAndLayoutDelegate.measureAndLayout(this.resendMotionEventOnLayout);
        this.onMeasureConstraints = null;
        updatePositionCacheAndDispatch();
        if (this._androidViewsHandler != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, r10 - l10, b10 - t10);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onLayoutChange(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.accessibilityDelegate.onLayoutChange$ui_release(layoutNode);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                invalidateLayoutNodeMeasurement(getRoot());
            }
            Pair<Integer, Integer> pairConvertMeasureSpec = convertMeasureSpec(widthMeasureSpec);
            int iIntValue = pairConvertMeasureSpec.component1().intValue();
            int iIntValue2 = pairConvertMeasureSpec.component2().intValue();
            Pair<Integer, Integer> pairConvertMeasureSpec2 = convertMeasureSpec(heightMeasureSpec);
            long jConstraints = ConstraintsKt.Constraints(iIntValue, iIntValue2, pairConvertMeasureSpec2.component1().intValue(), pairConvertMeasureSpec2.component2().intValue());
            Constraints constraints = this.onMeasureConstraints;
            boolean zM3912equalsimpl0 = false;
            if (constraints == null) {
                this.onMeasureConstraints = Constraints.m3907boximpl(jConstraints);
                this.wasMeasuredWithMultipleConstraints = false;
            } else {
                if (constraints != null) {
                    zM3912equalsimpl0 = Constraints.m3912equalsimpl0(constraints.getValue(), jConstraints);
                }
                if (!zM3912equalsimpl0) {
                    this.wasMeasuredWithMultipleConstraints = true;
                }
            }
            this.measureAndLayoutDelegate.m3156updateRootConstraintsBRTryo0(jConstraints);
            this.measureAndLayoutDelegate.measureOnly();
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this._androidViewsHandler != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));
            }
            Unit unit = Unit.f93236a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.c(this, lifecycleOwner);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(@Nullable ViewStructure structure, int flags) {
        AndroidAutofill androidAutofill;
        if (!autofillSupported() || structure == null || (androidAutofill = this._autofill) == null) {
            return;
        }
        AndroidAutofill_androidKt.populateViewStructure(androidAutofill, structure);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestMeasure(@NotNull LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (affectsLookahead) {
            if (this.measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, forceRequest)) {
                scheduleMeasureAndLayout(layoutNode);
            }
        } else if (this.measureAndLayoutDelegate.requestRemeasure(layoutNode, forceRequest)) {
            scheduleMeasureAndLayout(layoutNode);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestRelayout(@NotNull LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (affectsLookahead) {
            if (this.measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, forceRequest)) {
                scheduleMeasureAndLayout$default(this, null, 1, null);
            }
        } else if (this.measureAndLayoutDelegate.requestRelayout(layoutNode, forceRequest)) {
            scheduleMeasureAndLayout$default(this, null, 1, null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        setShowLayoutBounds(INSTANCE.getIsShowingLayoutBounds());
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        if (this.superclassInitComplete) {
            LayoutDirection layoutDirectionLayoutDirectionFromInt = AndroidComposeView_androidKt.layoutDirectionFromInt(layoutDirection);
            setLayoutDirection(layoutDirectionLayoutDirectionFromInt);
            getFocusOwner().setLayoutDirection(layoutDirectionLayoutDirectionFromInt);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onSemanticsChange() {
        this.accessibilityDelegate.onSemanticsChange$ui_release();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.e(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.f(this, lifecycleOwner);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        boolean isShowingLayoutBounds;
        this._windowInfo.setWindowFocused(hasWindowFocus);
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(hasWindowFocus);
        if (!hasWindowFocus || getShowLayoutBounds() == (isShowingLayoutBounds = INSTANCE.getIsShowingLayoutBounds())) {
            return;
        }
        setShowLayoutBounds(isShowingLayoutBounds);
        invalidateDescendants();
    }

    public final boolean recycle$ui_release(@NotNull OwnedLayer layer) {
        Intrinsics.checkNotNullParameter(layer, "layer");
        if (this.viewLayersContainer != null) {
            ViewLayer.INSTANCE.getShouldUseDispatchDraw();
        }
        this.layerCache.push(layer);
        return true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnEndApplyChangesListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.endApplyChangesListeners.contains(listener)) {
            return;
        }
        this.endApplyChangesListeners.add(listener);
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnLayoutCompletedListener(@NotNull Owner.OnLayoutCompletedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.measureAndLayoutDelegate.registerOnLayoutCompletedListener(listener);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    public final void removeAndroidView(@NotNull final AndroidViewHolder view) {
        Intrinsics.checkNotNullParameter(view, "view");
        registerOnEndApplyChangesListener(new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView.removeAndroidView.1
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
                AndroidComposeView.this.getAndroidViewsHandler$ui_release().removeViewInLayout(view);
                HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder = AndroidComposeView.this.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
                kotlin.jvm.internal.b1.d(layoutNodeToHolder).remove(AndroidComposeView.this.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(view));
                ViewCompat.setImportantForAccessibility(view, 0);
            }
        });
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void requestOnPositionedCallback(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.measureAndLayoutDelegate.requestOnPositionedCallback(layoutNode);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U */
    public long mo2974screenToLocalMKHz9U(long positionOnScreen) {
        recalculateWindowPosition();
        return Matrix.m1815mapMKHz9U(this.windowToViewMatrix, OffsetKt.Offset(Offset.m1371getXimpl(positionOnScreen) - Offset.m1371getXimpl(this.windowPosition), Offset.m1372getYimpl(positionOnScreen) - Offset.m1372getYimpl(this.windowPosition)));
    }

    @Override // androidx.compose.ui.node.RootForTest
    /* JADX INFO: renamed from: sendKeyEvent-ZmokQxo */
    public boolean mo3251sendKeyEventZmokQxo(@NotNull android.view.KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        return getFocusOwner().mo1314dispatchKeyEventZmokQxo(keyEvent);
    }

    public final void setConfigurationChangeObserver(@NotNull Function1<? super Configuration, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.configurationChangeObserver = function1;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j10) {
        this.lastMatrixRecalculationAnimationTime = j10;
    }

    public final void setOnViewTreeOwnersAvailable(@NotNull Function1<? super ViewTreeOwners, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.onViewTreeOwnersAvailable = callback;
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z10) {
        this.showLayoutBounds = z10;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public PlatformTextInputPluginRegistryImpl getPlatformTextInputPluginRegistry() {
        return this.platformTextInputPluginRegistry;
    }

    private final void recalculateWindowPosition(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        recalculateWindowViewTransforms();
        long jM1815mapMKHz9U = Matrix.m1815mapMKHz9U(this.viewToWindowMatrix, OffsetKt.Offset(motionEvent.getX(), motionEvent.getY()));
        this.windowPosition = OffsetKt.Offset(motionEvent.getRawX() - Offset.m1371getXimpl(jM1815mapMKHz9U), motionEvent.getRawY() - Offset.m1372getYimpl(jM1815mapMKHz9U));
    }
}
