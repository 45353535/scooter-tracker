package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.R;
import androidx.compose.ui.TempListUtilsKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.AccessibilityIterators;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Î\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u0087\u00022\u00020\u0001:\u000e\u0088\u0002\u0089\u0002\u008a\u0002\u0087\u0002\u008b\u0002\u008c\u0002\u008d\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JG\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u001a\b\u0002\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00120\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010\"J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010%J=\u0010,\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J?\u00107\u001a\u00020.2\u0006\u0010\u0007\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u00010\u00062\b\u00103\u001a\u0004\u0018\u00010\u00062\b\u00104\u001a\u0004\u0018\u00010\u00062\b\u00106\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b9\u0010%J)\u0010=\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\b\u0010<\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0004\b=\u0010>J1\u0010@\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\b2\u0006\u0010?\u001a\u00020*2\b\u0010<\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0004\b@\u0010AJ#\u0010F\u001a\u0004\u0018\u00010E2\b\u0010B\u001a\u0004\u0018\u00010\u000e2\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\bH\u0010IJ/\u0010L\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010J*\u0002052\b\u00106\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010K\u001a\u00020\u0006H\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u001b2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QJ%\u0010T\u001a\u00020\u001b2\u0006\u0010O\u001a\u00020N2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00060RH\u0002¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u001bH\u0002¢\u0006\u0004\bV\u0010\u001dJ\u000f\u0010W\u001a\u00020\u001bH\u0002¢\u0006\u0004\bW\u0010\u001dJ%\u0010[\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020\u00062\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0)H\u0002¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020\u001b2\u0006\u0010]\u001a\u00020YH\u0002¢\u0006\u0004\b^\u0010_J)\u0010b\u001a\u00020\u001b2\u0006\u0010`\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\b\u0010a\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\bb\u0010cJ\u001f\u0010g\u001a\u00020\u001b2\u0006\u0010d\u001a\u00020\u000e2\u0006\u0010f\u001a\u00020eH\u0002¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020\u00062\u0006\u0010X\u001a\u00020\u0006H\u0002¢\u0006\u0004\bi\u0010jJ/\u0010n\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010k\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u000b2\u0006\u0010m\u001a\u00020\u000bH\u0002¢\u0006\u0004\bn\u0010oJ\u0017\u0010p\u001a\u00020\u001b2\u0006\u0010`\u001a\u00020\u0006H\u0002¢\u0006\u0004\bp\u0010IJ/\u0010t\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010q\u001a\u00020\u00062\u0006\u0010r\u001a\u00020\u00062\u0006\u0010s\u001a\u00020\u000bH\u0002¢\u0006\u0004\bt\u0010uJ\u0017\u0010v\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\bv\u0010wJ\u0017\u0010x\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\bx\u0010wJ\u0017\u0010y\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\by\u0010zJ#\u0010|\u001a\u0004\u0018\u00010{2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0006\u0010k\u001a\u00020\u0006H\u0002¢\u0006\u0004\b|\u0010}J\u001b\u0010~\u001a\u0004\u0018\u00010*2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b~\u0010\u007fJ\u001a\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u0001*\u00030\u0080\u0001H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J4\u0010\u008a\u0001\u001a\u00020\u000b2\u0007\u0010\u0084\u0001\u001a\u00020\u000b2\u0007\u0010\u0085\u0001\u001a\u00020\u00062\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001JE\u0010\u008a\u0001\u001a\u00020\u000b2\u000f\u0010\u008d\u0001\u001a\n\u0012\u0005\u0012\u00030\u008c\u00010\u008b\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u000b2\u0007\u0010\u0085\u0001\u001a\u00020\u00062\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J+\u0010\u0091\u0001\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0007\u0010\u0090\u0001\u001a\u00020\u000eH\u0007¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\"\u0010\u0095\u0001\u001a\u00020.2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0001¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0019\u0010\u0097\u0001\u001a\u00020\u000b2\u0007\u0010/\u001a\u00030\u0096\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J&\u0010\u009e\u0001\u001a\u00020\u00062\b\u0010\u009a\u0001\u001a\u00030\u0099\u00012\b\u0010\u009b\u0001\u001a\u00030\u0099\u0001H\u0001¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001d\u0010¢\u0001\u001a\u00030¡\u00012\b\u0010 \u0001\u001a\u00030\u009f\u0001H\u0016¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0011\u0010¥\u0001\u001a\u00020\u001bH\u0000¢\u0006\u0005\b¤\u0001\u0010\u001dJ\u0016\u0010¦\u0001\u001a\u00020\u001bH\u0086@ø\u0001\u0001¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0019\u0010©\u0001\u001a\u00020\u001b2\u0006\u0010O\u001a\u00020NH\u0000¢\u0006\u0005\b¨\u0001\u0010QJ)\u0010®\u0001\u001a\u00020\u001b2\u0015\u0010«\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030\u008c\u00010ª\u0001H\u0001¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0003\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R(\u0010²\u0001\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0005\b¶\u0001\u0010IR'\u0010¸\u0001\u001a\u00030·\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b¸\u0001\u0010¹\u0001\u0012\u0005\b¼\u0001\u0010\u001d\u001a\u0006\bº\u0001\u0010»\u0001R)\u0010½\u0001\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R'\u0010Ä\u0001\u001a\u00030Ã\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\bÄ\u0001\u0010Å\u0001\u0012\u0005\bÈ\u0001\u0010\u001d\u001a\u0006\bÆ\u0001\u0010Ç\u0001R'\u0010Ê\u0001\u001a\u00030É\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\bÊ\u0001\u0010Ë\u0001\u0012\u0005\bÎ\u0001\u0010\u001d\u001a\u0006\bÌ\u0001\u0010Í\u0001RD\u0010Ñ\u0001\u001a-\u0012\u000f\u0012\r Ð\u0001*\u0005\u0018\u00010Ï\u00010Ï\u0001 Ð\u0001*\u0015\u0012\u000f\u0012\r Ð\u0001*\u0005\u0018\u00010Ï\u00010Ï\u0001\u0018\u00010)0\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R\u0018\u0010Ô\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u001a\u0010Ö\u0001\u001a\u00030¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u0019\u0010Ø\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010³\u0001R'\u0010Ú\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002050Ù\u00010Ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R-\u0010Ü\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00060ª\u00010Ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0001\u0010Û\u0001R\u0019\u0010Ý\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010³\u0001R\u001b\u0010Þ\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u001d\u0010à\u0001\u001a\b\u0012\u0004\u0012\u00020N0R8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u001e\u0010ã\u0001\u001a\t\u0012\u0004\u0012\u00020\u001b0â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R\u0019\u0010å\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010¾\u0001R\u001c\u0010ç\u0001\u001a\u0005\u0018\u00010æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bç\u0001\u0010è\u0001R/\u0010\u008d\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030\u008c\u00010ª\u00018B@\u0002X\u0082\u000e¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001R\u001f\u0010ì\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060R8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bì\u0001\u0010á\u0001R7\u0010ï\u0001\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060í\u0001j\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`î\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R7\u0010ñ\u0001\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060í\u0001j\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`î\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010ð\u0001R\u0017\u0010ò\u0001\u001a\u00020*8\u0002X\u0082D¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R\u0017\u0010ô\u0001\u001a\u00020*8\u0002X\u0082D¢\u0006\b\n\u0006\bô\u0001\u0010ó\u0001R<\u0010õ\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020e0\u00148\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bõ\u0001\u0010é\u0001\u0012\u0005\bø\u0001\u0010\u001d\u001a\u0006\bö\u0001\u0010ë\u0001\"\u0006\b÷\u0001\u0010\u00ad\u0001R\u0019\u0010ù\u0001\u001a\u00020e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bù\u0001\u0010ú\u0001R\u0019\u0010û\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bû\u0001\u0010¾\u0001R\u0018\u0010ý\u0001\u001a\u00030ü\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bý\u0001\u0010þ\u0001R\u001d\u0010ÿ\u0001\u001a\b\u0012\u0004\u0012\u00020Y0\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÿ\u0001\u0010Ò\u0001R$\u0010\u0081\u0002\u001a\u000f\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u001b0\u0080\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0002\u0010\u0082\u0002R\u001e\u0010\u0085\u0002\u001a\u00020\u000b8@X\u0081\u0004¢\u0006\u000f\u0012\u0005\b\u0084\u0002\u0010\u001d\u001a\u0006\b\u0083\u0002\u0010À\u0001R\u0017\u0010\u0086\u0002\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0086\u0002\u0010À\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u008e\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/AccessibilityDelegateCompat;", "Landroidx/compose/ui/platform/AndroidComposeView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "createNodeInfo", "(I)Landroid/view/accessibility/AccessibilityNodeInfo;", "", "layoutIsRtl", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "semanticComparator", "(Z)Ljava/util/Comparator;", "", "parentListToSort", "", "containerChildrenMapping", "sortByGeometryGroupings", "(ZLjava/util/List;Ljava/util/Map;)Ljava/util/List;", "listToSort", "subtreeSortedByGeometryGrouping", "(ZLjava/util/List;)Ljava/util/List;", "", "setTraversalValues", "()V", "node", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "setContentInvalid", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "setText", "isAccessibilityFocused", "(I)Z", "requestAccessibilityFocus", "eventType", "contentChangeType", "", "", "contentDescription", "sendEventForVirtualView", "(IILjava/lang/Integer;Ljava/util/List;)Z", "Landroid/view/accessibility/AccessibilityEvent;", "event", "sendEvent", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "fromIndex", "toIndex", "itemCount", "", "text", "createTextSelectionChangedEvent", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "clearAccessibilityFocus", "action", "Landroid/os/Bundle;", "arguments", "performActionHelper", "(IILandroid/os/Bundle;)Z", "extraDataKey", "addExtraDataToAccessibilityNodeInfoHelper", "(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V", "textNode", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroid/graphics/RectF;", "toScreenCoords", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/RectF;", "updateHoveredVirtualView", "(I)V", "T", "size", "trimToSize", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "notifySubtreeAccessibilityStateChangedIfNeeded", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/collection/ArraySet;", "subtreeChangedSemanticsNodesIds", "sendSubtreeChangeAccessibilityEvents", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/collection/ArraySet;)V", "checkForSemanticsChanges", "updateSemanticsNodesCopyAndPanes", "id", "Landroidx/compose/ui/platform/ScrollObservationScope;", "oldScrollObservationScopes", "registerScrollingId", "(ILjava/util/List;)Z", "scrollObservationScope", "sendScrollEventIfNeeded", "(Landroidx/compose/ui/platform/ScrollObservationScope;)V", "semanticsNodeId", "title", "sendPaneChangeEvents", "(IILjava/lang/String;)V", "newNode", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "oldNode", "sendSemanticsStructureChangeEvents", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;)V", "semanticsNodeIdToAccessibilityVirtualNodeId", "(I)I", "granularity", ToolBar.FORWARD, "extendSelection", "traverseAtGranularity", "(Landroidx/compose/ui/semantics/SemanticsNode;IZZ)Z", "sendPendingTextTraversedAtGranularityEvent", "start", "end", "traversalMode", "setAccessibilitySelection", "(Landroidx/compose/ui/semantics/SemanticsNode;IIZ)Z", "getAccessibilitySelectionStart", "(Landroidx/compose/ui/semantics/SemanticsNode;)I", "getAccessibilitySelectionEnd", "isAccessibilitySelectionExtendable", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "getIteratorForGranularity", "(Landroidx/compose/ui/semantics/SemanticsNode;I)Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "getIterableTextForAccessibility", "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/lang/String;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Landroidx/compose/ui/text/AnnotatedString;", "getTextForTextField", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Landroidx/compose/ui/text/AnnotatedString;", "vertical", "direction", "Landroidx/compose/ui/geometry/Offset;", C4240b4.i.L, "canScroll-0AR0LA0$ui_release", "(ZIJ)Z", "canScroll", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "currentSemanticsNodes", "canScroll-moWRBKg$ui_release", "(Ljava/util/Collection;ZIJ)Z", "semanticsNode", "populateAccessibilityNodeInfoProperties", "(ILandroidx/core/view/accessibility/AccessibilityNodeInfoCompat;Landroidx/compose/ui/semantics/SemanticsNode;)V", "createEvent$ui_release", "(II)Landroid/view/accessibility/AccessibilityEvent;", "createEvent", "Landroid/view/MotionEvent;", "dispatchHoverEvent", "(Landroid/view/MotionEvent;)Z", "", "x", "y", "hitTestSemanticsAt$ui_release", "(FF)I", "hitTestSemanticsAt", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "getAccessibilityNodeProvider", "(Landroid/view/View;)Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "onSemanticsChange$ui_release", "onSemanticsChange", "boundsUpdatesEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onLayoutChange$ui_release", "onLayoutChange", "", "newSemanticsNodes", "sendSemanticsPropertyChangeEvents$ui_release", "(Ljava/util/Map;)V", "sendSemanticsPropertyChangeEvents", "Landroidx/compose/ui/platform/AndroidComposeView;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "hoveredVirtualViewId", "I", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "getAccessibilityManager$ui_release", "()Landroid/view/accessibility/AccessibilityManager;", "getAccessibilityManager$ui_release$annotations", "accessibilityForceEnabledForTesting", "Z", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "enabledStateListener", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "getEnabledStateListener$ui_release", "()Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "getEnabledStateListener$ui_release$annotations", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "touchExplorationStateListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "getTouchExplorationStateListener$ui_release", "()Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "getTouchExplorationStateListener$ui_release$annotations", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "kotlin.jvm.PlatformType", "enabledServices", "Ljava/util/List;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "nodeProvider", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "focusedVirtualViewId", "Landroidx/collection/SparseArrayCompat;", "actionIdToLabel", "Landroidx/collection/SparseArrayCompat;", "labelToActionId", "accessibilityCursorPosition", "previousTraversedNode", "Ljava/lang/Integer;", "subtreeChangedLayoutNodes", "Landroidx/collection/ArraySet;", "Lgg/g;", "boundsUpdateChannel", "Lgg/g;", "currentSemanticsNodesInvalidated", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "pendingTextTraversedEvent", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "Ljava/util/Map;", "getCurrentSemanticsNodes", "()Ljava/util/Map;", "paneDisplayed", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "idToBeforeMap", "Ljava/util/HashMap;", "idToAfterMap", "EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL", "Ljava/lang/String;", "EXTRA_DATA_TEST_TRAVERSALAFTER_VAL", "previousSemanticsNodes", "getPreviousSemanticsNodes$ui_release", "setPreviousSemanticsNodes$ui_release", "getPreviousSemanticsNodes$ui_release$annotations", "previousSemanticsRoot", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "semanticsChangeChecker", "Ljava/lang/Runnable;", "scrollObservationScopes", "Lkotlin/Function1;", "sendScrollEventIfNeededLambda", "Lkotlin/jvm/functions/Function1;", "isEnabled$ui_release", "isEnabled$ui_release$annotations", "isEnabled", "isTouchExplorationEnabled", com.taurusx.tax.f.y.f66058y, "Api24Impl", "Api28Impl", "Api29Impl", "MyNodeProvider", "PendingTextTraversedEvent", "SemanticsNodeCopy", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat {
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;

    @NotNull
    public static final String ClassName = "android.view.View";

    @NotNull
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;

    @NotNull
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final long SendRecurringAccessibilityEventsIntervalMillis = 100;

    @NotNull
    public static final String TextClassName = "android.widget.TextView";

    @NotNull
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;

    @NotNull
    private final String EXTRA_DATA_TEST_TRAVERSALAFTER_VAL;

    @NotNull
    private final String EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL;
    private int accessibilityCursorPosition;
    private boolean accessibilityForceEnabledForTesting;

    @NotNull
    private final android.view.accessibility.AccessibilityManager accessibilityManager;

    @NotNull
    private SparseArrayCompat<SparseArrayCompat<CharSequence>> actionIdToLabel;

    @NotNull
    private final gg.g boundsUpdateChannel;
    private boolean checkingForSemanticsChanges;

    @NotNull
    private Map<Integer, SemanticsNodeWithAdjustedBounds> currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private List<AccessibilityServiceInfo> enabledServices;

    @NotNull
    private final AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;
    private int focusedVirtualViewId;

    @NotNull
    private final Handler handler;
    private int hoveredVirtualViewId;

    @NotNull
    private HashMap<Integer, Integer> idToAfterMap;

    @NotNull
    private HashMap<Integer, Integer> idToBeforeMap;

    @NotNull
    private SparseArrayCompat<Map<CharSequence, Integer>> labelToActionId;

    @NotNull
    private AccessibilityNodeProviderCompat nodeProvider;

    @NotNull
    private ArraySet<Integer> paneDisplayed;

    @Nullable
    private PendingTextTraversedEvent pendingTextTraversedEvent;

    @NotNull
    private Map<Integer, SemanticsNodeCopy> previousSemanticsNodes;

    @NotNull
    private SemanticsNodeCopy previousSemanticsRoot;

    @Nullable
    private Integer previousTraversedNode;

    @NotNull
    private final List<ScrollObservationScope> scrollObservationScopes;

    @NotNull
    private final Runnable semanticsChangeChecker;

    @NotNull
    private final Function1<ScrollObservationScope, Unit> sendScrollEventIfNeededLambda;

    @NotNull
    private final ArraySet<LayoutNode> subtreeChangedLayoutNodes;

    @NotNull
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;

    @NotNull
    private final AndroidComposeView view;

    @NotNull
    private static final int[] AccessibilityActionsResourceIds = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    @RequiresApi(24)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl;", "", "()V", "addSetProgressAction", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Api24Impl {

        @NotNull
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @DoNotInline
        public static final void addSetProgressAction(@NotNull AccessibilityNodeInfoCompat info, @NotNull SemanticsNode semanticsNode) {
            AccessibilityAction accessibilityAction;
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetProgress())) == null) {
                return;
            }
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
        }
    }

    @RequiresApi(28)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api28Impl;", "", "()V", "setScrollEventDelta", "", "event", "Landroid/view/accessibility/AccessibilityEvent;", "deltaX", "", "deltaY", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Api28Impl {

        @NotNull
        public static final Api28Impl INSTANCE = new Api28Impl();

        private Api28Impl() {
        }

        @DoNotInline
        public static final void setScrollEventDelta(@NotNull AccessibilityEvent event, int deltaX, int deltaY) {
            Intrinsics.checkNotNullParameter(event, "event");
            event.setScrollDeltaX(deltaX);
            event.setScrollDeltaY(deltaY);
        }
    }

    @RequiresApi(29)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api29Impl;", "", "()V", "addPageActions", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Api29Impl {

        @NotNull
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @DoNotInline
        public static final void addPageActions(@NotNull AccessibilityNodeInfoCompat info, @NotNull SemanticsNode semanticsNode) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
                SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig, semanticsActions.getPageUp());
                if (accessibilityAction != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getPageDown());
                if (accessibilityAction2 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getPageLeft());
                if (accessibilityAction3 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getPageRight());
                if (accessibilityAction4 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                }
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$MyNodeProvider;", "Landroid/view/accessibility/AccessibilityNodeProvider;", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "addExtraDataToAccessibilityNodeInfo", "", "virtualViewId", "", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "extraDataKey", "", "arguments", "Landroid/os/Bundle;", "createAccessibilityNodeInfo", "performAction", "", "action", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class MyNodeProvider extends AccessibilityNodeProvider {
        public MyNodeProvider() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int virtualViewId, @NotNull AccessibilityNodeInfo info, @NotNull String extraDataKey, @Nullable Bundle arguments) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(extraDataKey, "extraDataKey");
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, info, extraDataKey, arguments);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        @Nullable
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int virtualViewId) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.createNodeInfo(virtualViewId);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int virtualViewId, int action, @Nullable Bundle arguments) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(virtualViewId, action, arguments);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "action", "", "granularity", "fromIndex", "toIndex", "traverseTime", "", "(Landroidx/compose/ui/semantics/SemanticsNode;IIIIJ)V", "getAction", "()I", "getFromIndex", "getGranularity", "getNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "getToIndex", "getTraverseTime", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;

        @NotNull
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public PendingTextTraversedEvent(@NotNull SemanticsNode node, int i10, int i11, int i12, int i13, long j10) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.node = node;
            this.action = i10;
            this.granularity = i11;
            this.fromIndex = i12;
            this.toIndex = i13;
            this.traverseTime = j10;
        }

        public final int getAction() {
            return this.action;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        @NotNull
        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "currentSemanticsNodes", "", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "(Landroidx/compose/ui/semantics/SemanticsNode;Ljava/util/Map;)V", "children", "", "getChildren", "()Ljava/util/Set;", "getSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "unmergedConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "hasPaneTitle", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @VisibleForTesting
    public static final class SemanticsNodeCopy {

        @NotNull
        private final Set<Integer> children;

        @NotNull
        private final SemanticsNode semanticsNode;

        @NotNull
        private final SemanticsConfiguration unmergedConfig;

        public SemanticsNodeCopy(@NotNull SemanticsNode semanticsNode, @NotNull Map<Integer, SemanticsNodeWithAdjustedBounds> currentSemanticsNodes) {
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            Intrinsics.checkNotNullParameter(currentSemanticsNodes, "currentSemanticsNodes");
            this.semanticsNode = semanticsNode;
            this.unmergedConfig = semanticsNode.getUnmergedConfig();
            this.children = new LinkedHashSet();
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i10 = 0; i10 < size; i10++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i10);
                if (currentSemanticsNodes.containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                    this.children.add(Integer.valueOf(semanticsNode2.getId()));
                }
            }
        }

        @NotNull
        public final Set<Integer> getChildren() {
            return this.children;
        }

        @NotNull
        public final SemanticsNode getSemanticsNode() {
            return this.semanticsNode;
        }

        @NotNull
        public final SemanticsConfiguration getUnmergedConfig() {
            return this.unmergedConfig;
        }

        public final boolean hasPaneTitle() {
            return this.unmergedConfig.contains(SemanticsProperties.INSTANCE.getPaneTitle());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {2024, 2054}, m = "boundsUpdatesEventLoop")
    static final class C16011 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C16011(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidComposeViewAccessibilityDelegateCompat.this.boundsUpdatesEventLoop(this);
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(@NotNull AndroidComposeView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.hoveredVirtualViewId = Integer.MIN_VALUE;
        Object systemService = view.getContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        this.enabledStateListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.i
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z10) {
                AndroidComposeViewAccessibilityDelegateCompat.enabledStateListener$lambda$0(this.f4432b, z10);
            }
        };
        this.touchExplorationStateListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.j
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                AndroidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener$lambda$1(this.f4433a, z10);
            }
        };
        this.enabledServices = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new AccessibilityNodeProviderCompat(new MyNodeProvider());
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.actionIdToLabel = new SparseArrayCompat<>();
        this.labelToActionId = new SparseArrayCompat<>();
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new ArraySet<>();
        this.boundsUpdateChannel = gg.j.b(-1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        this.currentSemanticsNodes = MapsKt.emptyMap();
        this.paneDisplayed = new ArraySet<>();
        this.idToBeforeMap = new HashMap<>();
        this.idToAfterMap = new HashMap<>();
        this.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.previousSemanticsNodes = new LinkedHashMap();
        this.previousSemanticsRoot = new SemanticsNodeCopy(view.getSemanticsOwner().getUnmergedRootSemanticsNode(), MapsKt.emptyMap());
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
                AndroidComposeViewAccessibilityDelegateCompat.this.getAccessibilityManager().addAccessibilityStateChangeListener(AndroidComposeViewAccessibilityDelegateCompat.this.getEnabledStateListener());
                AndroidComposeViewAccessibilityDelegateCompat.this.getAccessibilityManager().addTouchExplorationStateChangeListener(AndroidComposeViewAccessibilityDelegateCompat.this.getTouchExplorationStateListener());
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
                AndroidComposeViewAccessibilityDelegateCompat.this.handler.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.semanticsChangeChecker);
                AndroidComposeViewAccessibilityDelegateCompat.this.getAccessibilityManager().removeAccessibilityStateChangeListener(AndroidComposeViewAccessibilityDelegateCompat.this.getEnabledStateListener());
                AndroidComposeViewAccessibilityDelegateCompat.this.getAccessibilityManager().removeTouchExplorationStateChangeListener(AndroidComposeViewAccessibilityDelegateCompat.this.getTouchExplorationStateListener());
            }
        });
        this.semanticsChangeChecker = new Runnable() { // from class: androidx.compose.ui.platform.k
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$38(this.f4434b);
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.sendScrollEventIfNeededLambda = new Function1<ScrollObservationScope, Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeededLambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScrollObservationScope scrollObservationScope) {
                invoke2(scrollObservationScope);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ScrollObservationScope it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.sendScrollEventIfNeeded(it);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int virtualViewId, AccessibilityNodeInfo info, String extraDataKey, Bundle arguments) {
        SemanticsNode semanticsNode;
        String str;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(virtualViewId));
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (Intrinsics.areEqual(extraDataKey, this.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL)) {
            Integer num = this.idToBeforeMap.get(Integer.valueOf(virtualViewId));
            if (num != null) {
                info.getExtras().putInt(extraDataKey, num.intValue());
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(extraDataKey, this.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL)) {
            Integer num2 = this.idToAfterMap.get(Integer.valueOf(virtualViewId));
            if (num2 != null) {
                info.getExtras().putInt(extraDataKey, num2.intValue());
                return;
            }
            return;
        }
        SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (!unmergedConfig.contains(semanticsActions.getGetTextLayoutResult()) || arguments == null || !Intrinsics.areEqual(extraDataKey, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            SemanticsConfiguration unmergedConfig2 = semanticsNode.getUnmergedConfig();
            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
            if (!unmergedConfig2.contains(semanticsProperties.getTestTag()) || arguments == null || !Intrinsics.areEqual(extraDataKey, ExtraDataTestTagKey) || (str = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getTestTag())) == null) {
                return;
            }
            info.getExtras().putCharSequence(extraDataKey, str);
            return;
        }
        int i10 = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i11 = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i11 > 0 && i10 >= 0) {
            if (i10 < (iterableTextForAccessibility != null ? iterableTextForAccessibility.length() : Integer.MAX_VALUE)) {
                ArrayList arrayList = new ArrayList();
                Function1 function1 = (Function1) ((AccessibilityAction) semanticsNode.getUnmergedConfig().get(semanticsActions.getGetTextLayoutResult())).getAction();
                if (Intrinsics.areEqual(function1 != null ? (Boolean) function1.invoke(arrayList) : null, Boolean.TRUE)) {
                    TextLayoutResult textLayoutResult = (TextLayoutResult) arrayList.get(0);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i12 = 0; i12 < i11; i12++) {
                        int i13 = i10 + i12;
                        if (i13 >= textLayoutResult.getLayoutInput().getText().length()) {
                            arrayList2.add(null);
                        } else {
                            arrayList2.add(toScreenCoords(semanticsNode, textLayoutResult.getBoundingBox(i13)));
                        }
                    }
                    info.getExtras().putParcelableArray(extraDataKey, (Parcelable[]) arrayList2.toArray(new RectF[0]));
                    return;
                }
                return;
            }
        }
        Log.e(LogTag, "Invalid arguments for accessibility character locations");
    }

    private final void checkForSemanticsChanges() {
        sendSemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
        sendSemanticsPropertyChangeEvents$ui_release(getCurrentSemanticsNodes());
        updateSemanticsNodesCopyAndPanes();
    }

    private final boolean clearAccessibilityFocus(int virtualViewId) {
        if (!isAccessibilityFocused(virtualViewId)) {
            return false;
        }
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.view.invalidate();
        sendEventForVirtualView$default(this, virtualViewId, 65536, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccessibilityNodeInfo createNodeInfo(int virtualViewId) {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = this.view.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getState()) == Lifecycle.State.DESTROYED) {
            return null;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
        Intrinsics.checkNotNullExpressionValue(accessibilityNodeInfoCompatObtain, "obtain()");
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(virtualViewId));
        if (semanticsNodeWithAdjustedBounds == null) {
            return null;
        }
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        if (virtualViewId == -1) {
            Object parentForAccessibility = ViewCompat.getParentForAccessibility(this.view);
            accessibilityNodeInfoCompatObtain.setParent(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
        } else {
            if (semanticsNode.getParent() == null) {
                throw new IllegalStateException("semanticsNode " + virtualViewId + " has null parent");
            }
            SemanticsNode parent = semanticsNode.getParent();
            Intrinsics.checkNotNull(parent);
            int id2 = parent.getId();
            accessibilityNodeInfoCompatObtain.setParent(this.view, id2 != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId() ? id2 : -1);
        }
        accessibilityNodeInfoCompatObtain.setSource(this.view, virtualViewId);
        Rect adjustedBounds = semanticsNodeWithAdjustedBounds.getAdjustedBounds();
        long jMo2973localToScreenMKHz9U = this.view.mo2973localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.left, adjustedBounds.top));
        long jMo2973localToScreenMKHz9U2 = this.view.mo2973localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.right, adjustedBounds.bottom));
        accessibilityNodeInfoCompatObtain.setBoundsInScreen(new Rect((int) Math.floor(Offset.m1371getXimpl(jMo2973localToScreenMKHz9U)), (int) Math.floor(Offset.m1372getYimpl(jMo2973localToScreenMKHz9U)), (int) Math.ceil(Offset.m1371getXimpl(jMo2973localToScreenMKHz9U2)), (int) Math.ceil(Offset.m1372getYimpl(jMo2973localToScreenMKHz9U2))));
        populateAccessibilityNodeInfoProperties(virtualViewId, accessibilityNodeInfoCompatObtain, semanticsNode);
        return accessibilityNodeInfoCompatObtain.unwrap();
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int virtualViewId, Integer fromIndex, Integer toIndex, Integer itemCount, CharSequence text) {
        AccessibilityEvent accessibilityEventCreateEvent$ui_release = createEvent$ui_release(virtualViewId, 8192);
        if (fromIndex != null) {
            accessibilityEventCreateEvent$ui_release.setFromIndex(fromIndex.intValue());
        }
        if (toIndex != null) {
            accessibilityEventCreateEvent$ui_release.setToIndex(toIndex.intValue());
        }
        if (itemCount != null) {
            accessibilityEventCreateEvent$ui_release.setItemCount(itemCount.intValue());
        }
        if (text != null) {
            accessibilityEventCreateEvent$ui_release.getText().add(text);
        }
        return accessibilityEventCreateEvent$ui_release;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat this$0, boolean z10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.enabledServices = z10 ? this$0.accessibilityManager.getEnabledAccessibilityServiceList(-1) : CollectionsKt.emptyList();
    }

    @VisibleForTesting
    public static /* synthetic */ void getAccessibilityManager$ui_release$annotations() {
    }

    private final int getAccessibilitySelectionEnd(SemanticsNode node) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (unmergedConfig.contains(semanticsProperties.getContentDescription()) || !node.getUnmergedConfig().contains(semanticsProperties.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m3498getEndimpl(((TextRange) node.getUnmergedConfig().get(semanticsProperties.getTextSelectionRange())).getPackedValue());
    }

    private final int getAccessibilitySelectionStart(SemanticsNode node) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (unmergedConfig.contains(semanticsProperties.getContentDescription()) || !node.getUnmergedConfig().contains(semanticsProperties.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m3503getStartimpl(((TextRange) node.getUnmergedConfig().get(semanticsProperties.getTextSelectionRange())).getPackedValue());
    }

    private final Map<Integer, SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getAllUncoveredSemanticsNodesToMap(this.view.getSemanticsOwner());
            setTraversalValues();
        }
        return this.currentSemanticsNodes;
    }

    @VisibleForTesting
    public static /* synthetic */ void getEnabledStateListener$ui_release$annotations() {
    }

    private final String getIterableTextForAccessibility(SemanticsNode node) {
        AnnotatedString annotatedString;
        if (node == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig.contains(semanticsProperties.getContentDescription())) {
            return TempListUtilsKt.fastJoinToString$default((List) node.getUnmergedConfig().get(semanticsProperties.getContentDescription()), StringUtils.COMMA, null, null, 0, null, null, 62, null);
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(node)) {
            AnnotatedString textForTextField = getTextForTextField(node.getUnmergedConfig());
            if (textForTextField != null) {
                return textForTextField.getText();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getText());
        if (list == null || (annotatedString = (AnnotatedString) CollectionsKt.firstOrNull(list)) == null) {
            return null;
        }
        return annotatedString.getText();
    }

    private final AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(SemanticsNode node, int granularity) {
        String iterableTextForAccessibility;
        if (node == null || (iterableTextForAccessibility = getIterableTextForAccessibility(node)) == null || iterableTextForAccessibility.length() == 0) {
            return null;
        }
        if (granularity == 1) {
            AccessibilityIterators.CharacterTextSegmentIterator.Companion companion = AccessibilityIterators.CharacterTextSegmentIterator.INSTANCE;
            Locale locale = this.view.getContext().getResources().getConfiguration().locale;
            Intrinsics.checkNotNullExpressionValue(locale, "view.context.resources.configuration.locale");
            AccessibilityIterators.CharacterTextSegmentIterator companion2 = companion.getInstance(locale);
            companion2.initialize(iterableTextForAccessibility);
            return companion2;
        }
        if (granularity == 2) {
            AccessibilityIterators.WordTextSegmentIterator.Companion companion3 = AccessibilityIterators.WordTextSegmentIterator.INSTANCE;
            Locale locale2 = this.view.getContext().getResources().getConfiguration().locale;
            Intrinsics.checkNotNullExpressionValue(locale2, "view.context.resources.configuration.locale");
            AccessibilityIterators.WordTextSegmentIterator companion4 = companion3.getInstance(locale2);
            companion4.initialize(iterableTextForAccessibility);
            return companion4;
        }
        if (granularity != 4) {
            if (granularity == 8) {
                AccessibilityIterators.ParagraphTextSegmentIterator companion5 = AccessibilityIterators.ParagraphTextSegmentIterator.INSTANCE.getInstance();
                companion5.initialize(iterableTextForAccessibility);
                return companion5;
            }
            if (granularity != 16) {
                return null;
            }
        }
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (!unmergedConfig.contains(semanticsActions.getGetTextLayoutResult())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Function1 function1 = (Function1) ((AccessibilityAction) node.getUnmergedConfig().get(semanticsActions.getGetTextLayoutResult())).getAction();
        if (!Intrinsics.areEqual(function1 != null ? (Boolean) function1.invoke(arrayList) : null, Boolean.TRUE)) {
            return null;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) arrayList.get(0);
        if (granularity == 4) {
            AccessibilityIterators.LineTextSegmentIterator companion6 = AccessibilityIterators.LineTextSegmentIterator.INSTANCE.getInstance();
            companion6.initialize(iterableTextForAccessibility, textLayoutResult);
            return companion6;
        }
        AccessibilityIterators.PageTextSegmentIterator companion7 = AccessibilityIterators.PageTextSegmentIterator.INSTANCE.getInstance();
        companion7.initialize(iterableTextForAccessibility, textLayoutResult, node);
        return companion7;
    }

    @VisibleForTesting
    public static /* synthetic */ void getPreviousSemanticsNodes$ui_release$annotations() {
    }

    private final AnnotatedString getTextForTextField(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    @VisibleForTesting
    public static /* synthetic */ void getTouchExplorationStateListener$ui_release$annotations() {
    }

    private final boolean isAccessibilityFocused(int virtualViewId) {
        return this.focusedVirtualViewId == virtualViewId;
    }

    private final boolean isAccessibilitySelectionExtendable(SemanticsNode node) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return !unmergedConfig.contains(semanticsProperties.getContentDescription()) && node.getUnmergedConfig().contains(semanticsProperties.getEditableText());
    }

    @VisibleForTesting
    public static /* synthetic */ void isEnabled$ui_release$annotations() {
    }

    private final boolean isTouchExplorationEnabled() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled();
    }

    private final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.e(Unit.f93236a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x018a -> B:89:0x018b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:89:0x018b
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final boolean performActionHelper(int r17, int r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 1628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.performActionHelper(int, int, android.os.Bundle):boolean");
    }

    private static final boolean performActionHelper$canScroll(ScrollAxisRange scrollAxisRange, float f10) {
        if (f10 >= 0.0f || scrollAxisRange.getValue().invoke().floatValue() <= 0.0f) {
            return f10 > 0.0f && scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue();
        }
        return true;
    }

    private static final float performActionHelper$scrollDelta(float f10, float f11) {
        if (Math.signum(f10) == Math.signum(f11)) {
            return Math.abs(f10) < Math.abs(f11) ? f10 : f11;
        }
        return 0.0f;
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.getValue().invoke().floatValue() <= 0.0f || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.getValue().invoke().floatValue() >= scrollAxisRange.getMaxValue().invoke().floatValue() || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.getValue().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private final boolean registerScrollingId(int id2, List<ScrollObservationScope> oldScrollObservationScopes) {
        boolean z10;
        ScrollObservationScope scrollObservationScopeFindById = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findById(oldScrollObservationScopes, id2);
        if (scrollObservationScopeFindById != null) {
            z10 = false;
        } else {
            ScrollObservationScope scrollObservationScope = new ScrollObservationScope(id2, this.scrollObservationScopes, null, null, null, null);
            z10 = true;
            scrollObservationScopeFindById = scrollObservationScope;
        }
        this.scrollObservationScopes.add(scrollObservationScopeFindById);
        return z10;
    }

    private final boolean requestAccessibilityFocus(int virtualViewId) {
        if (!isTouchExplorationEnabled() || isAccessibilityFocused(virtualViewId)) {
            return false;
        }
        int i10 = this.focusedVirtualViewId;
        if (i10 != Integer.MIN_VALUE) {
            sendEventForVirtualView$default(this, i10, 65536, null, null, 12, null);
        }
        this.focusedVirtualViewId = virtualViewId;
        this.view.invalidate();
        sendEventForVirtualView$default(this, virtualViewId, 32768, null, null, 12, null);
        return true;
    }

    private final Comparator<SemanticsNode> semanticComparator(boolean layoutIsRtl) {
        final Comparator comparatorB = mf.a.b(new Function1<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Comparable<?> invoke(@NotNull SemanticsNode it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Float.valueOf(it.getBoundsInWindow().getLeft());
            }
        }, new Function1<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$2
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Comparable<?> invoke(@NotNull SemanticsNode it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Float.valueOf(it.getBoundsInWindow().getTop());
            }
        }, new Function1<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$3
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Comparable<?> invoke(@NotNull SemanticsNode it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Float.valueOf(it.getBoundsInWindow().getBottom());
            }
        }, new Function1<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$4
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Comparable<?> invoke(@NotNull SemanticsNode it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Float.valueOf(it.getBoundsInWindow().getRight());
            }
        });
        if (layoutIsRtl) {
            comparatorB = mf.a.b(new Function1<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Comparable<?> invoke(@NotNull SemanticsNode it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Float.valueOf(it.getBoundsInWindow().getRight());
                }
            }, new Function1<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.2
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Comparable<?> invoke(@NotNull SemanticsNode it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Float.valueOf(it.getBoundsInWindow().getTop());
                }
            }, new Function1<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.3
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Comparable<?> invoke(@NotNull SemanticsNode it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Float.valueOf(it.getBoundsInWindow().getBottom());
                }
            }, new Function1<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.4
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Comparable<?> invoke(@NotNull SemanticsNode it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Float.valueOf(it.getBoundsInWindow().getLeft());
                }
            });
        }
        final Comparator<LayoutNode> zComparator$ui_release = LayoutNode.INSTANCE.getZComparator$ui_release();
        final Comparator comparator = new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                int iCompare = comparatorB.compare(t10, t11);
                return iCompare != 0 ? iCompare : zComparator$ui_release.compare(((SemanticsNode) t10).getLayoutNode(), ((SemanticsNode) t11).getLayoutNode());
            }
        };
        return new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                int iCompare = comparator.compare(t10, t11);
                return iCompare != 0 ? iCompare : mf.a.d(Integer.valueOf(((SemanticsNode) t10).getId()), Integer.valueOf(((SemanticsNode) t11).getId()));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void semanticsChangeChecker$lambda$38(AndroidComposeViewAccessibilityDelegateCompat this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        androidx.compose.ui.node.e.e(this$0.view, false, 1, null);
        this$0.checkForSemanticsChanges();
        this$0.checkingForSemanticsChanges = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int id2) {
        if (id2 == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return id2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean sendEvent(AccessibilityEvent event) {
        if (isEnabled$ui_release()) {
            return this.view.getParent().requestSendAccessibilityEvent(this.view, event);
        }
        return false;
    }

    private final boolean sendEventForVirtualView(int virtualViewId, int eventType, Integer contentChangeType, List<String> contentDescription) {
        if (virtualViewId == Integer.MIN_VALUE || !isEnabled$ui_release()) {
            return false;
        }
        AccessibilityEvent accessibilityEventCreateEvent$ui_release = createEvent$ui_release(virtualViewId, eventType);
        if (contentChangeType != null) {
            accessibilityEventCreateEvent$ui_release.setContentChangeTypes(contentChangeType.intValue());
        }
        if (contentDescription != null) {
            accessibilityEventCreateEvent$ui_release.setContentDescription(TempListUtilsKt.fastJoinToString$default(contentDescription, StringUtils.COMMA, null, null, 0, null, null, 62, null));
        }
        return sendEvent(accessibilityEventCreateEvent$ui_release);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i10, int i11, Integer num, List list, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i10, i11, num, list);
    }

    private final void sendPaneChangeEvents(int semanticsNodeId, int contentChangeType, String title) {
        AccessibilityEvent accessibilityEventCreateEvent$ui_release = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNodeId), 32);
        accessibilityEventCreateEvent$ui_release.setContentChangeTypes(contentChangeType);
        if (title != null) {
            accessibilityEventCreateEvent$ui_release.getText().add(title);
        }
        sendEvent(accessibilityEventCreateEvent$ui_release);
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int semanticsNodeId) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (semanticsNodeId != pendingTextTraversedEvent.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                AccessibilityEvent accessibilityEventCreateEvent$ui_release = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent.getNode().getId()), 131072);
                accessibilityEventCreateEvent$ui_release.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                accessibilityEventCreateEvent$ui_release.setToIndex(pendingTextTraversedEvent.getToIndex());
                accessibilityEventCreateEvent$ui_release.setAction(pendingTextTraversedEvent.getAction());
                accessibilityEventCreateEvent$ui_release.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                accessibilityEventCreateEvent$ui_release.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent.getNode()));
                sendEvent(accessibilityEventCreateEvent$ui_release);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendScrollEventIfNeeded(final ScrollObservationScope scrollObservationScope) {
        if (scrollObservationScope.isValidOwnerScope()) {
            this.view.getSnapshotObserver().observeReads$ui_release(scrollObservationScope, this.sendScrollEventIfNeededLambda, new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendScrollEventIfNeeded.1
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
                    ScrollAxisRange horizontalScrollAxisRange = scrollObservationScope.getHorizontalScrollAxisRange();
                    ScrollAxisRange verticalScrollAxisRange = scrollObservationScope.getVerticalScrollAxisRange();
                    Float oldXValue = scrollObservationScope.getOldXValue();
                    Float oldYValue = scrollObservationScope.getOldYValue();
                    float fFloatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.getValue().invoke().floatValue() - oldXValue.floatValue();
                    float fFloatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.getValue().invoke().floatValue() - oldYValue.floatValue();
                    if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                        int iSemanticsNodeIdToAccessibilityVirtualNodeId = this.semanticsNodeIdToAccessibilityVirtualNodeId(scrollObservationScope.getSemanticsNodeId());
                        AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(this, iSemanticsNodeIdToAccessibilityVirtualNodeId, 2048, 1, null, 8, null);
                        AccessibilityEvent accessibilityEventCreateEvent$ui_release = this.createEvent$ui_release(iSemanticsNodeIdToAccessibilityVirtualNodeId, 4096);
                        if (horizontalScrollAxisRange != null) {
                            accessibilityEventCreateEvent$ui_release.setScrollX((int) horizontalScrollAxisRange.getValue().invoke().floatValue());
                            accessibilityEventCreateEvent$ui_release.setMaxScrollX((int) horizontalScrollAxisRange.getMaxValue().invoke().floatValue());
                        }
                        if (verticalScrollAxisRange != null) {
                            accessibilityEventCreateEvent$ui_release.setScrollY((int) verticalScrollAxisRange.getValue().invoke().floatValue());
                            accessibilityEventCreateEvent$ui_release.setMaxScrollY((int) verticalScrollAxisRange.getMaxValue().invoke().floatValue());
                        }
                        if (Build.VERSION.SDK_INT >= 28) {
                            Api28Impl.setScrollEventDelta(accessibilityEventCreateEvent$ui_release, (int) fFloatValue, (int) fFloatValue2);
                        }
                        this.sendEvent(accessibilityEventCreateEvent$ui_release);
                    }
                    if (horizontalScrollAxisRange != null) {
                        scrollObservationScope.setOldXValue(horizontalScrollAxisRange.getValue().invoke());
                    }
                    if (verticalScrollAxisRange != null) {
                        scrollObservationScope.setOldYValue(verticalScrollAxisRange.getValue().invoke());
                    }
                }
            });
        }
    }

    private final void sendSemanticsStructureChangeEvents(SemanticsNode newNode, SemanticsNodeCopy oldNode) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<SemanticsNode> replacedChildren$ui_release = newNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i10 = 0; i10 < size; i10++) {
            SemanticsNode semanticsNode = replacedChildren$ui_release.get(i10);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode.getId()))) {
                if (!oldNode.getChildren().contains(Integer.valueOf(semanticsNode.getId()))) {
                    notifySubtreeAccessibilityStateChangedIfNeeded(newNode.getLayoutNode());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(semanticsNode.getId()));
            }
        }
        Iterator<Integer> it = oldNode.getChildren().iterator();
        while (it.hasNext()) {
            if (!linkedHashSet.contains(Integer.valueOf(it.next().intValue()))) {
                notifySubtreeAccessibilityStateChangedIfNeeded(newNode.getLayoutNode());
                return;
            }
        }
        List<SemanticsNode> replacedChildren$ui_release2 = newNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release2.get(i11);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(Integer.valueOf(semanticsNode2.getId()));
                Intrinsics.checkNotNull(semanticsNodeCopy);
                sendSemanticsStructureChangeEvents(semanticsNode2, semanticsNodeCopy);
            }
        }
    }

    private final void sendSubtreeChangeAccessibilityEvents(LayoutNode layoutNode, ArraySet<Integer> subtreeChangedSemanticsNodesIds) {
        LayoutNode layoutNodeFindClosestParentNode;
        SemanticsModifierNode outerSemantics;
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            SemanticsModifierNode outerSemantics2 = SemanticsNodeKt.getOuterSemantics(layoutNode);
            if (outerSemantics2 == null) {
                LayoutNode layoutNodeFindClosestParentNode2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsWrapper$1
                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final Boolean invoke(@NotNull LayoutNode it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.valueOf(SemanticsNodeKt.getOuterSemantics(it) != null);
                    }
                });
                outerSemantics2 = layoutNodeFindClosestParentNode2 != null ? SemanticsNodeKt.getOuterSemantics(layoutNodeFindClosestParentNode2) : null;
                if (outerSemantics2 == null) {
                    return;
                }
            }
            if (!SemanticsModifierNodeKt.collapsedSemanticsConfiguration(outerSemantics2).getIsMergingSemanticsOfDescendants() && (layoutNodeFindClosestParentNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull LayoutNode it) {
                    SemanticsConfiguration semanticsConfigurationCollapsedSemanticsConfiguration;
                    Intrinsics.checkNotNullParameter(it, "it");
                    SemanticsModifierNode outerSemantics3 = SemanticsNodeKt.getOuterSemantics(it);
                    boolean z10 = false;
                    if (outerSemantics3 != null && (semanticsConfigurationCollapsedSemanticsConfiguration = SemanticsModifierNodeKt.collapsedSemanticsConfiguration(outerSemantics3)) != null && semanticsConfigurationCollapsedSemanticsConfiguration.getIsMergingSemanticsOfDescendants()) {
                        z10 = true;
                    }
                    return Boolean.valueOf(z10);
                }
            })) != null && (outerSemantics = SemanticsNodeKt.getOuterSemantics(layoutNodeFindClosestParentNode)) != null) {
                outerSemantics2 = outerSemantics;
            }
            int semanticsId = DelegatableNodeKt.requireLayoutNode(outerSemantics2).getSemanticsId();
            if (subtreeChangedSemanticsNodesIds.add(Integer.valueOf(semanticsId))) {
                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsId), 2048, 1, null, 8, null);
            }
        }
    }

    private final boolean setAccessibilitySelection(SemanticsNode node, int start, int end, boolean traversalMode) {
        String iterableTextForAccessibility;
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (unmergedConfig.contains(semanticsActions.getSetSelection()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(node)) {
            Function3 function3 = (Function3) ((AccessibilityAction) node.getUnmergedConfig().get(semanticsActions.getSetSelection())).getAction();
            if (function3 != null) {
                return ((Boolean) function3.invoke(Integer.valueOf(start), Integer.valueOf(end), Boolean.valueOf(traversalMode))).booleanValue();
            }
            return false;
        }
        if ((start == end && end == this.accessibilityCursorPosition) || (iterableTextForAccessibility = getIterableTextForAccessibility(node)) == null) {
            return false;
        }
        if (start < 0 || start != end || end > iterableTextForAccessibility.length()) {
            start = -1;
        }
        this.accessibilityCursorPosition = start;
        boolean z10 = iterableTextForAccessibility.length() > 0;
        sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(node.getId()), z10 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z10 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z10 ? Integer.valueOf(iterableTextForAccessibility.length()) : null, iterableTextForAccessibility));
        sendPendingTextTraversedAtGranularityEvent(node.getId());
        return true;
    }

    private final void setContentInvalid(SemanticsNode node, AccessibilityNodeInfoCompat info) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig.contains(semanticsProperties.getError())) {
            info.setContentInvalid(true);
            info.setError((CharSequence) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getError()));
        }
    }

    private final void setText(SemanticsNode node, AccessibilityNodeInfoCompat info) {
        AnnotatedString annotatedString;
        FontFamily.Resolver fontFamilyResolver = this.view.getFontFamilyResolver();
        AnnotatedString textForTextField = getTextForTextField(node.getUnmergedConfig());
        SpannableString accessibilitySpannableString = null;
        SpannableString spannableString = (SpannableString) trimToSize(textForTextField != null ? AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(textForTextField, this.view.getDensity(), fontFamilyResolver) : null, 100000);
        List list = (List) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), SemanticsProperties.INSTANCE.getText());
        if (list != null && (annotatedString = (AnnotatedString) CollectionsKt.firstOrNull(list)) != null) {
            accessibilitySpannableString = AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.view.getDensity(), fontFamilyResolver);
        }
        SpannableString spannableString2 = (SpannableString) trimToSize(accessibilitySpannableString, 100000);
        if (spannableString == null) {
            spannableString = spannableString2;
        }
        info.setText(spannableString);
    }

    private final void setTraversalValues() {
        this.idToBeforeMap.clear();
        this.idToAfterMap.clear();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(-1);
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
        Intrinsics.checkNotNull(semanticsNode);
        List<SemanticsNode> listSubtreeSortedByGeometryGrouping = subtreeSortedByGeometryGrouping(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode), CollectionsKt.toMutableList((Collection) semanticsNode.getChildren()));
        int lastIndex = CollectionsKt.getLastIndex(listSubtreeSortedByGeometryGrouping);
        int i10 = 1;
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int id2 = listSubtreeSortedByGeometryGrouping.get(i10 - 1).getId();
            int id3 = listSubtreeSortedByGeometryGrouping.get(i10).getId();
            this.idToBeforeMap.put(Integer.valueOf(id2), Integer.valueOf(id3));
            this.idToAfterMap.put(Integer.valueOf(id3), Integer.valueOf(id2));
            if (i10 == lastIndex) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final List<SemanticsNode> sortByGeometryGroupings(boolean layoutIsRtl, List<SemanticsNode> parentListToSort, Map<Integer, List<SemanticsNode>> containerChildrenMapping) {
        ArrayList arrayList = new ArrayList();
        int lastIndex = CollectionsKt.getLastIndex(parentListToSort);
        if (lastIndex >= 0) {
            int i10 = 0;
            while (true) {
                SemanticsNode semanticsNode = parentListToSort.get(i10);
                if (i10 == 0 || !sortByGeometryGroupings$placedEntryRowOverlaps(arrayList, semanticsNode)) {
                    arrayList.add(new Pair(semanticsNode.getBoundsInWindow(), CollectionsKt.mutableListOf(semanticsNode)));
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        CollectionsKt.sortWith(arrayList, mf.a.b(new Function1<Pair<? extends androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>>, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.1
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Comparable<?> invoke2(@NotNull Pair<androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Float.valueOf(it.getFirst().getTop());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Comparable<?> invoke(Pair<? extends androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>> pair) {
                return invoke2((Pair<androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>>) pair);
            }
        }, new Function1<Pair<? extends androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>>, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.2
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Comparable<?> invoke2(@NotNull Pair<androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Float.valueOf(it.getFirst().getBottom());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Comparable<?> invoke(Pair<? extends androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>> pair) {
                return invoke2((Pair<androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>>) pair);
            }
        }));
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Pair pair = (Pair) arrayList.get(i11);
            CollectionsKt.sortWith((List) pair.getSecond(), semanticComparator(layoutIsRtl));
            List list = (List) pair.getSecond();
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                SemanticsNode semanticsNode2 = (SemanticsNode) list.get(i12);
                List<SemanticsNode> listMutableListOf = containerChildrenMapping.get(Integer.valueOf(semanticsNode2.getId()));
                if (listMutableListOf == null) {
                    listMutableListOf = CollectionsKt.mutableListOf(semanticsNode2);
                }
                arrayList2.addAll(listMutableListOf);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List sortByGeometryGroupings$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z10, List list, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = new LinkedHashMap();
        }
        return androidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings(z10, list, map);
    }

    private static final boolean sortByGeometryGroupings$placedEntryRowOverlaps(List<Pair<androidx.compose.ui.geometry.Rect, List<SemanticsNode>>> list, SemanticsNode semanticsNode) {
        float top = semanticsNode.getBoundsInWindow().getTop();
        float bottom = semanticsNode.getBoundsInWindow().getBottom();
        OpenEndRange<Float> openEndRangeRangeUntil = AndroidComposeViewAccessibilityDelegateCompat_androidKt.rangeUntil(top, bottom);
        int lastIndex = CollectionsKt.getLastIndex(list);
        if (lastIndex >= 0) {
            int i10 = 0;
            while (true) {
                androidx.compose.ui.geometry.Rect first = list.get(i10).getFirst();
                if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.overlaps(AndroidComposeViewAccessibilityDelegateCompat_androidKt.rangeUntil(first.getTop(), first.getBottom()), openEndRangeRangeUntil)) {
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                } else {
                    list.set(i10, new Pair<>(first.intersect(new androidx.compose.ui.geometry.Rect(0.0f, top, Float.POSITIVE_INFINITY, bottom)), list.get(i10).getSecond()));
                    list.get(i10).getSecond().add(semanticsNode);
                    return true;
                }
            }
        }
        return false;
    }

    private final List<SemanticsNode> subtreeSortedByGeometryGrouping(boolean layoutIsRtl, List<SemanticsNode> listToSort) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        int size = listToSort.size();
        for (int i10 = 0; i10 < size; i10++) {
            subtreeSortedByGeometryGrouping$depthFirstSearch(arrayList, linkedHashMap, this, layoutIsRtl, listToSort.get(i10));
        }
        return sortByGeometryGroupings(layoutIsRtl, arrayList, linkedHashMap);
    }

    private static final void subtreeSortedByGeometryGrouping$depthFirstSearch(List<SemanticsNode> list, Map<Integer, List<SemanticsNode>> map, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z10, SemanticsNode semanticsNode) {
        list.add(semanticsNode);
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.getSemanticsNodeIsStructurallySignificant(semanticsNode)) {
            map.put(Integer.valueOf(semanticsNode.getId()), androidComposeViewAccessibilityDelegateCompat.subtreeSortedByGeometryGrouping(z10, CollectionsKt.toMutableList((Collection) semanticsNode.getChildren())));
            return;
        }
        List<SemanticsNode> children = semanticsNode.getChildren();
        int size = children.size();
        for (int i10 = 0; i10 < size; i10++) {
            subtreeSortedByGeometryGrouping$depthFirstSearch(list, map, androidComposeViewAccessibilityDelegateCompat, z10, children.get(i10));
        }
    }

    private final RectF toScreenCoords(SemanticsNode textNode, androidx.compose.ui.geometry.Rect bounds) {
        if (textNode == null) {
            return null;
        }
        androidx.compose.ui.geometry.Rect rectM1408translatek4lQ0M = bounds.m1408translatek4lQ0M(textNode.m3358getPositionInRootF1C5BW0());
        androidx.compose.ui.geometry.Rect boundsInRoot = textNode.getBoundsInRoot();
        androidx.compose.ui.geometry.Rect rectIntersect = rectM1408translatek4lQ0M.overlaps(boundsInRoot) ? rectM1408translatek4lQ0M.intersect(boundsInRoot) : null;
        if (rectIntersect == null) {
            return null;
        }
        long jMo2973localToScreenMKHz9U = this.view.mo2973localToScreenMKHz9U(OffsetKt.Offset(rectIntersect.getLeft(), rectIntersect.getTop()));
        long jMo2973localToScreenMKHz9U2 = this.view.mo2973localToScreenMKHz9U(OffsetKt.Offset(rectIntersect.getRight(), rectIntersect.getBottom()));
        return new RectF(Offset.m1371getXimpl(jMo2973localToScreenMKHz9U), Offset.m1372getYimpl(jMo2973localToScreenMKHz9U), Offset.m1371getXimpl(jMo2973localToScreenMKHz9U2), Offset.m1372getYimpl(jMo2973localToScreenMKHz9U2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchExplorationStateListener$lambda$1(AndroidComposeViewAccessibilityDelegateCompat this$0, boolean z10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.enabledServices = this$0.accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean traverseAtGranularity(SemanticsNode node, int granularity, boolean forward, boolean extendSelection) {
        int accessibilitySelectionStart;
        int i10;
        int id2 = node.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id2 != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(node.getId());
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(node);
        boolean z10 = false;
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
            AccessibilityIterators.TextSegmentIterator iteratorForGranularity = getIteratorForGranularity(node, granularity);
            if (iteratorForGranularity == null) {
                return false;
            }
            int accessibilitySelectionEnd = getAccessibilitySelectionEnd(node);
            if (accessibilitySelectionEnd == -1) {
                accessibilitySelectionEnd = forward ? 0 : iterableTextForAccessibility.length();
            }
            int[] iArrFollowing = forward ? iteratorForGranularity.following(accessibilitySelectionEnd) : iteratorForGranularity.preceding(accessibilitySelectionEnd);
            if (iArrFollowing == null) {
                return false;
            }
            int i11 = iArrFollowing[0];
            z10 = true;
            int i12 = iArrFollowing[1];
            if (extendSelection && isAccessibilitySelectionExtendable(node)) {
                accessibilitySelectionStart = getAccessibilitySelectionStart(node);
                if (accessibilitySelectionStart == -1) {
                    accessibilitySelectionStart = forward ? i11 : i12;
                }
                i10 = forward ? i12 : i11;
            } else {
                accessibilitySelectionStart = forward ? i12 : i11;
                i10 = accessibilitySelectionStart;
            }
            this.pendingTextTraversedEvent = new PendingTextTraversedEvent(node, forward ? 256 : 512, granularity, i11, i12, SystemClock.uptimeMillis());
            setAccessibilitySelection(node, accessibilitySelectionStart, i10, true);
        }
        return z10;
    }

    private final <T extends CharSequence> T trimToSize(T text, @IntRange(from = 1) int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (text == null || text.length() == 0 || text.length() <= size) {
            return text;
        }
        int i10 = size - 1;
        if (Character.isHighSurrogate(text.charAt(i10)) && Character.isLowSurrogate(text.charAt(size))) {
            size = i10;
        }
        T t10 = (T) text.subSequence(0, size);
        Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return t10;
    }

    private final void updateHoveredVirtualView(int virtualViewId) {
        int i10 = this.hoveredVirtualViewId;
        if (i10 == virtualViewId) {
            return;
        }
        this.hoveredVirtualViewId = virtualViewId;
        sendEventForVirtualView$default(this, virtualViewId, 128, null, null, 12, null);
        sendEventForVirtualView$default(this, i10, 256, null, null, 12, null);
    }

    private final void updateSemanticsNodesCopyAndPanes() {
        SemanticsConfiguration unmergedConfig;
        ArraySet<? extends Integer> arraySet = new ArraySet<>();
        for (Integer id2 : this.paneDisplayed) {
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(id2);
            String str = null;
            SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
            if (semanticsNode == null || !AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(semanticsNode)) {
                arraySet.add(id2);
                Intrinsics.checkNotNullExpressionValue(id2, "id");
                int iIntValue = id2.intValue();
                SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(id2);
                if (semanticsNodeCopy != null && (unmergedConfig = semanticsNodeCopy.getUnmergedConfig()) != null) {
                    str = (String) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsProperties.INSTANCE.getPaneTitle());
                }
                sendPaneChangeEvents(iIntValue, 32, str);
            }
        }
        this.paneDisplayed.removeAll(arraySet);
        this.previousSemanticsNodes.clear();
        for (Map.Entry<Integer, SemanticsNodeWithAdjustedBounds> entry : getCurrentSemanticsNodes().entrySet()) {
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(entry.getValue().getSemanticsNode()) && this.paneDisplayed.add(entry.getKey())) {
                sendPaneChangeEvents(entry.getKey().intValue(), 16, (String) entry.getValue().getSemanticsNode().getUnmergedConfig().get(SemanticsProperties.INSTANCE.getPaneTitle()));
            }
            this.previousSemanticsNodes.put(entry.getKey(), new SemanticsNodeCopy(entry.getValue().getSemanticsNode(), getCurrentSemanticsNodes()));
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes());
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c3, code lost:
    
        if (eg.k0.a(100, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:13:0x0034, B:25:0x0063, B:29:0x0075, B:31:0x007d, B:33:0x0086, B:35:0x008f, B:36:0x00a0, B:38:0x00a7, B:39:0x00b0, B:20:0x0050), top: B:48:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c3 -> B:14:0x0037). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object boundsUpdatesEventLoop(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: canScroll-0AR0LA0$ui_release, reason: not valid java name */
    public final boolean m3272canScroll0AR0LA0$ui_release(boolean vertical, int direction, long position) {
        return m3273canScrollmoWRBKg$ui_release(getCurrentSemanticsNodes().values(), vertical, direction, position);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    @androidx.annotation.VisibleForTesting(otherwise = 2)
    /* JADX INFO: renamed from: canScroll-moWRBKg$ui_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m3273canScrollmoWRBKg$ui_release(@org.jetbrains.annotations.NotNull java.util.Collection<androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> r6, boolean r7, int r8, long r9) {
        /*
            r5 = this;
            java.lang.String r0 = "currentSemanticsNodes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.INSTANCE
            long r0 = r0.m1386getUnspecifiedF1C5BW0()
            boolean r0 = androidx.compose.ui.geometry.Offset.m1368equalsimpl0(r9, r0)
            r1 = 0
            if (r0 != 0) goto Lbd
            boolean r0 = androidx.compose.ui.geometry.Offset.m1374isValidimpl(r9)
            if (r0 != 0) goto L1a
            goto Lbd
        L1a:
            r0 = 1
            if (r7 != r0) goto L24
            androidx.compose.ui.semantics.SemanticsProperties r7 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r7 = r7.getVerticalScrollAxisRange()
            goto L2c
        L24:
            if (r7 != 0) goto Lb7
            androidx.compose.ui.semantics.SemanticsProperties r7 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r7 = r7.getHorizontalScrollAxisRange()
        L2c:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r2 = r6
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L38
            return r1
        L38:
            java.util.Iterator r6 = r6.iterator()
        L3c:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lb6
            java.lang.Object r2 = r6.next()
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r2 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r2
            android.graphics.Rect r3 = r2.getAdjustedBounds()
            androidx.compose.ui.geometry.Rect r3 = androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(r3)
            boolean r3 = r3.m1397containsk4lQ0M(r9)
            if (r3 != 0) goto L58
        L56:
            r2 = r1
            goto Lb3
        L58:
            androidx.compose.ui.semantics.SemanticsNode r2 = r2.getSemanticsNode()
            androidx.compose.ui.semantics.SemanticsConfiguration r2 = r2.getConfig()
            java.lang.Object r2 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r2, r7)
            androidx.compose.ui.semantics.ScrollAxisRange r2 = (androidx.compose.ui.semantics.ScrollAxisRange) r2
            if (r2 != 0) goto L69
            goto L56
        L69:
            boolean r3 = r2.getReverseScrolling()
            if (r3 == 0) goto L71
            int r3 = -r8
            goto L72
        L71:
            r3 = r8
        L72:
            if (r8 != 0) goto L7b
            boolean r4 = r2.getReverseScrolling()
            if (r4 == 0) goto L7b
            r3 = -1
        L7b:
            if (r3 >= 0) goto L92
            kotlin.jvm.functions.Function0 r2 = r2.getValue()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L56
        L90:
            r2 = r0
            goto Lb3
        L92:
            kotlin.jvm.functions.Function0 r3 = r2.getValue()
            java.lang.Object r3 = r3.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            kotlin.jvm.functions.Function0 r2 = r2.getMaxValue()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L56
            goto L90
        Lb3:
            if (r2 == 0) goto L3c
            return r0
        Lb6:
            return r1
        Lb7:
            lf.m r6 = new lf.m
            r6.<init>()
            throw r6
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m3273canScrollmoWRBKg$ui_release(java.util.Collection, boolean, int, long):boolean");
    }

    @VisibleForTesting
    @NotNull
    public final AccessibilityEvent createEvent$ui_release(int virtualViewId, int eventType) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(eventType);
        Intrinsics.checkNotNullExpressionValue(accessibilityEventObtain, "obtain(eventType)");
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName(ClassName);
        accessibilityEventObtain.setPackageName(this.view.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.view, virtualViewId);
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(virtualViewId));
        if (semanticsNodeWithAdjustedBounds != null) {
            accessibilityEventObtain.setPassword(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode()));
        }
        return accessibilityEventObtain;
    }

    public final boolean dispatchHoverEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isTouchExplorationEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action == 7 || action == 9) {
            int iHitTestSemanticsAt$ui_release = hitTestSemanticsAt$ui_release(event.getX(), event.getY());
            boolean zDispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
            updateHoveredVirtualView(iHitTestSemanticsAt$ui_release);
            if (iHitTestSemanticsAt$ui_release == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId == Integer.MIN_VALUE) {
            return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
        }
        updateHoveredVirtualView(Integer.MIN_VALUE);
        return true;
    }

    /* JADX INFO: renamed from: getAccessibilityForceEnabledForTesting$ui_release, reason: from getter */
    public final boolean getAccessibilityForceEnabledForTesting() {
        return this.accessibilityForceEnabledForTesting;
    }

    @NotNull
    /* JADX INFO: renamed from: getAccessibilityManager$ui_release, reason: from getter */
    public final android.view.accessibility.AccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    @NotNull
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@NotNull View host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return this.nodeProvider;
    }

    @NotNull
    /* JADX INFO: renamed from: getEnabledStateListener$ui_release, reason: from getter */
    public final AccessibilityManager.AccessibilityStateChangeListener getEnabledStateListener() {
        return this.enabledStateListener;
    }

    /* JADX INFO: renamed from: getHoveredVirtualViewId$ui_release, reason: from getter */
    public final int getHoveredVirtualViewId() {
        return this.hoveredVirtualViewId;
    }

    @NotNull
    public final Map<Integer, SemanticsNodeCopy> getPreviousSemanticsNodes$ui_release() {
        return this.previousSemanticsNodes;
    }

    @NotNull
    /* JADX INFO: renamed from: getTouchExplorationStateListener$ui_release, reason: from getter */
    public final AccessibilityManager.TouchExplorationStateChangeListener getTouchExplorationStateListener() {
        return this.touchExplorationStateListener;
    }

    @NotNull
    public final AndroidComposeView getView() {
        return this.view;
    }

    @VisibleForTesting
    public final int hitTestSemanticsAt$ui_release(float x10, float y10) {
        LayoutNode layoutNodeRequireLayoutNode;
        SemanticsModifierNode outerSemantics = null;
        androidx.compose.ui.node.e.e(this.view, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        LayoutNode.m3123hitTestSemanticsM_7yMNQ$ui_release$default(this.view.getRoot(), OffsetKt.Offset(x10, y10), hitTestResult, false, false, 12, null);
        SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) CollectionsKt.lastOrNull((List) hitTestResult);
        if (semanticsModifierNode != null && (layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(semanticsModifierNode)) != null) {
            outerSemantics = SemanticsNodeKt.getOuterSemantics(layoutNodeRequireLayoutNode);
        }
        SemanticsModifierNode semanticsModifierNode2 = outerSemantics;
        if (semanticsModifierNode2 == null || !AndroidComposeViewAccessibilityDelegateCompat_androidKt.isVisible(new SemanticsNode(semanticsModifierNode2, false, null, 4, null))) {
            return Integer.MIN_VALUE;
        }
        LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(semanticsModifierNode2);
        if (this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(layoutNodeRequireLayoutNode2) == null) {
            return semanticsNodeIdToAccessibilityVirtualNodeId(layoutNodeRequireLayoutNode2.getSemanticsId());
        }
        return Integer.MIN_VALUE;
    }

    public final boolean isEnabled$ui_release() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        if (!this.accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledServices = this.enabledServices;
        Intrinsics.checkNotNullExpressionValue(enabledServices, "enabledServices");
        return !enabledServices.isEmpty();
    }

    public final void onLayoutChange$ui_release(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
        }
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (!isEnabled$ui_release() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.semanticsChangeChecker);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:348:0x09c7  */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [int] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [int] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.util.List] */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void populateAccessibilityNodeInfoProperties(int r21, @org.jetbrains.annotations.NotNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat r22, @org.jetbrains.annotations.NotNull androidx.compose.ui.semantics.SemanticsNode r23) {
        /*
            Method dump skipped, instruction units count: 2667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties(int, androidx.core.view.accessibility.AccessibilityNodeInfoCompat, androidx.compose.ui.semantics.SemanticsNode):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04f9  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.Collection, java.util.LinkedHashSet, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.Collection, java.util.LinkedHashSet, java.util.Set] */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void sendSemanticsPropertyChangeEvents$ui_release(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.Integer, androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> r29) {
        /*
            Method dump skipped, instruction units count: 1348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSemanticsPropertyChangeEvents$ui_release(java.util.Map):void");
    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean z10) {
        this.accessibilityForceEnabledForTesting = z10;
    }

    public final void setHoveredVirtualViewId$ui_release(int i10) {
        this.hoveredVirtualViewId = i10;
    }

    public final void setPreviousSemanticsNodes$ui_release(@NotNull Map<Integer, SemanticsNodeCopy> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.previousSemanticsNodes = map;
    }
}
