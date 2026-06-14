package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierCore;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4257c4;
import com.ironsource.C4424m2;
import com.taurusx.tax.f.y;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ð\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\bB\b\u0000\u0018\u0000 Ú\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\bÚ\u0002Û\u0002Ü\u0002Ý\u0002B\u0019\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001a\u0010Ù\u0001\u001a\u00030©\u00012\b\u0010³\u0001\u001a\u00030¨\u0001H\u0000¢\u0006\u0003\bÚ\u0001J\u0010\u0010Û\u0001\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bÜ\u0001J\u0010\u0010Ý\u0001\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bÞ\u0001J\u0010\u0010ß\u0001\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bà\u0001J\n\u0010á\u0001\u001a\u00030©\u0001H\u0002J\u0014\u0010â\u0001\u001a\u00030ã\u00012\b\b\u0002\u00106\u001a\u00020\u000bH\u0002J\u0010\u0010ä\u0001\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bå\u0001J\u0010\u0010æ\u0001\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bç\u0001J\u001a\u0010è\u0001\u001a\u00030©\u00012\b\u0010é\u0001\u001a\u00030ê\u0001H\u0000¢\u0006\u0003\bë\u0001J%\u0010ì\u0001\u001a\u00030©\u00012\u0015\u0010í\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0005\u0012\u00030©\u00010§\u0001H\u0086\bø\u0001\u0000J+\u0010î\u0001\u001a\u00030©\u00012\u001b\u0010í\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0000\u0012\u0005\u0012\u00030©\u00010ï\u0001H\u0086\bø\u0001\u0000J#\u0010ð\u0001\u001a\u00030©\u00012\u0016\u0010í\u0001\u001a\u0011\u0012\u0005\u0012\u00030ñ\u0001\u0012\u0005\u0012\u00030©\u00010§\u0001H\u0082\bJ\"\u0010ò\u0001\u001a\u00030©\u00012\u0015\u0010í\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0005\u0012\u00030©\u00010§\u0001H\u0082\bJ\n\u0010ó\u0001\u001a\u00030©\u0001H\u0016J\u0013\u0010ô\u0001\u001a\f\u0018\u00010õ\u0001j\u0005\u0018\u0001`ö\u0001H\u0017J\u0010\u0010÷\u0001\u001a\t\u0012\u0005\u0012\u00030ø\u00010\"H\u0016JJ\u0010ù\u0001\u001a\u00030©\u00012\b\u0010ú\u0001\u001a\u00030û\u00012\u000f\u0010ü\u0001\u001a\n\u0012\u0005\u0012\u00030þ\u00010ý\u00012\t\b\u0002\u0010ÿ\u0001\u001a\u00020\t2\t\b\u0002\u0010\u0080\u0002\u001a\u00020\tH\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u0081\u0002\u0010\u0082\u0002JJ\u0010\u0083\u0002\u001a\u00030©\u00012\b\u0010ú\u0001\u001a\u00030û\u00012\u000f\u0010\u0084\u0002\u001a\n\u0012\u0005\u0012\u00030\u0085\u00020ý\u00012\t\b\u0002\u0010ÿ\u0001\u001a\u00020\t2\t\b\u0002\u0010\u0080\u0002\u001a\u00020\tH\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u0086\u0002\u0010\u0082\u0002J$\u0010A\u001a\u00030©\u00012\u000f\u0010í\u0001\u001a\n\u0012\u0005\u0012\u00030©\u00010\u0087\u0002H\u0080\bø\u0001\u0000¢\u0006\u0003\b\u0088\u0002J\"\u0010\u0089\u0002\u001a\u00030©\u00012\u0007\u0010\u008a\u0002\u001a\u00020\u000b2\u0007\u0010\u008b\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0003\b\u008c\u0002J\n\u0010\u008d\u0002\u001a\u00030©\u0001H\u0002J\n\u0010\u008e\u0002\u001a\u00030©\u0001H\u0002J\u0010\u0010\u008f\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\b\u0090\u0002J\u0010\u0010\u0091\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\b\u0092\u0002J\u0010\u0010\u0093\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\b\u0094\u0002J\u0010\u0010\u0095\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\b\u0096\u0002J\u0013\u0010\u0097\u0002\u001a\u00030©\u00012\t\b\u0002\u0010\u0098\u0002\u001a\u00020\tJ\n\u0010\u0099\u0002\u001a\u00030©\u0001H\u0002J#\u0010\u009a\u0002\u001a\u00020\t2\f\b\u0002\u0010\u009b\u0002\u001a\u0005\u0018\u00010\u009c\u0002H\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0003\b\u009d\u0002J\u0010\u0010\u009e\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\b\u009f\u0002J\u0010\u0010 \u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\b¡\u0002J\u0010\u0010¢\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\b£\u0002J\u0010\u0010¤\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\b¥\u0002J\u0010\u0010¦\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\b§\u0002J\n\u0010¨\u0002\u001a\u00030©\u0001H\u0002J\n\u0010©\u0002\u001a\u00030©\u0001H\u0002J+\u0010ª\u0002\u001a\u00030©\u00012\u0007\u0010«\u0002\u001a\u00020\u000b2\u0007\u0010¬\u0002\u001a\u00020\u000b2\u0007\u0010\u00ad\u0002\u001a\u00020\u000bH\u0000¢\u0006\u0003\b®\u0002J\u0013\u0010¯\u0002\u001a\u00030©\u00012\u0007\u0010°\u0002\u001a\u00020\u0000H\u0002J\n\u0010±\u0002\u001a\u00030©\u0001H\u0016J\n\u0010²\u0002\u001a\u00030©\u0001H\u0002J\n\u0010³\u0002\u001a\u00030©\u0001H\u0016J\u0010\u0010´\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bµ\u0002J\n\u0010¶\u0002\u001a\u00030©\u0001H\u0016J\n\u0010·\u0002\u001a\u00030©\u0001H\u0016J\u0010\u0010¸\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\b¹\u0002J\"\u0010º\u0002\u001a\u00030©\u00012\u0007\u0010»\u0002\u001a\u00020\u000b2\u0007\u0010¼\u0002\u001a\u00020\u000bH\u0000¢\u0006\u0003\b½\u0002J\n\u0010¾\u0002\u001a\u00030©\u0001H\u0002J#\u0010¿\u0002\u001a\u00020\t2\f\b\u0002\u0010\u009b\u0002\u001a\u0005\u0018\u00010\u009c\u0002H\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0003\bÀ\u0002J\u0010\u0010Á\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bÂ\u0002J\"\u0010Ã\u0002\u001a\u00030©\u00012\u0007\u0010\u008a\u0002\u001a\u00020\u000b2\u0007\u0010\u00ad\u0002\u001a\u00020\u000bH\u0000¢\u0006\u0003\bÄ\u0002J\u0010\u0010Å\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bÆ\u0002J\u001b\u0010Ç\u0002\u001a\u00030©\u00012\t\b\u0002\u0010È\u0002\u001a\u00020\tH\u0000¢\u0006\u0003\bÉ\u0002J\u001b\u0010Ê\u0002\u001a\u00030©\u00012\t\b\u0002\u0010È\u0002\u001a\u00020\tH\u0000¢\u0006\u0003\bË\u0002J\u001b\u0010Ì\u0002\u001a\u00030©\u00012\t\b\u0002\u0010È\u0002\u001a\u00020\tH\u0000¢\u0006\u0003\bÍ\u0002J\u001b\u0010Î\u0002\u001a\u00030©\u00012\t\b\u0002\u0010È\u0002\u001a\u00020\tH\u0000¢\u0006\u0003\bÏ\u0002J\u0019\u0010Ð\u0002\u001a\u00030©\u00012\u0007\u0010Ñ\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0003\bÒ\u0002J\n\u0010Ó\u0002\u001a\u00030©\u0001H\u0002J\u0010\u0010Ô\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bÕ\u0002J\t\u0010Ö\u0002\u001a\u00020\tH\u0002J\n\u0010×\u0002\u001a\u00030ã\u0001H\u0016J\u0010\u0010Ø\u0002\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bÙ\u0002R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00000\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010%R\u0014\u0010*\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R$\u00101\u001a\u0002002\u0006\u0010/\u001a\u000200@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00000\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010%R\u0014\u0010=\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u001aR\u0014\u0010?\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u00108R\u000e\u0010A\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010B\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0016\u0010E\u001a\u0004\u0018\u00010\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010DR\u001a\u0010G\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001a\"\u0004\bI\u0010 R\"\u0010J\u001a\n\u0018\u00010Kj\u0004\u0018\u0001`LX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020RX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u001a\u0010U\u001a\u00020VX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u001aR$\u0010\\\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u001a\"\u0004\b]\u0010 R\u001e\u0010_\u001a\u00020\t2\u0006\u0010^\u001a\u00020\t@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b_\u0010\u001aR\u0013\u0010`\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010\u001aR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010c\u001a\u00020dX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR$\u0010h\u001a\u00020g2\u0006\u0010/\u001a\u00020g@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010m\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bn\u0010\u001aR\u0014\u0010o\u001a\u00020p8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010s\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bt\u0010\u001aR\u0014\u0010u\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bv\u0010\u001aR\u001a\u0010w\u001a\b\u0018\u00010xR\u00020d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010{\u001a\u00020|8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R/\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00012\t\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001@BX\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001c\u0010\u0086\u0001\u001a\u00070\u0087\u0001R\u00020d8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0016\u0010\u008a\u0001\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010\u001aR+\u0010\u008d\u0001\u001a\u00030\u008c\u00012\u0007\u0010/\u001a\u00030\u008c\u0001@VX\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001d\u0010\u0092\u0001\u001a\u00020VX\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010X\"\u0005\b\u0094\u0001\u0010ZR\u001d\u0010\u0095\u0001\u001a\u00020VX\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0001\u0010X\"\u0005\b\u0097\u0001\u0010ZR+\u0010\u0099\u0001\u001a\u00030\u0098\u00012\u0007\u0010/\u001a\u00030\u0098\u0001@VX\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001d\u0010\u009e\u0001\u001a\u00020\tX\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0001\u0010\u001a\"\u0005\b \u0001\u0010 R\u000f\u0010¡\u0001\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010¢\u0001\u001a\u00030£\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b¤\u0001\u0010¥\u0001R0\u0010¦\u0001\u001a\u0013\u0012\u0005\u0012\u00030¨\u0001\u0012\u0005\u0012\u00030©\u0001\u0018\u00010§\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R0\u0010®\u0001\u001a\u0013\u0012\u0005\u0012\u00030¨\u0001\u0012\u0005\u0012\u00030©\u0001\u0018\u00010§\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¯\u0001\u0010«\u0001\"\u0006\b°\u0001\u0010\u00ad\u0001R\u0016\u0010±\u0001\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010DR'\u0010³\u0001\u001a\u0005\u0018\u00010¨\u00012\t\u0010^\u001a\u0005\u0018\u00010¨\u0001@BX\u0080\u000e¢\u0006\n\n\u0000\u001a\u0006\b´\u0001\u0010µ\u0001R\u0019\u0010¶\u0001\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001R\u0019\u0010¹\u0001\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001R \u0010¼\u0001\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020\u000b@BX\u0080\u000e¢\u0006\t\n\u0000\u001a\u0005\b½\u0001\u00108R\u000f\u0010¾\u0001\u001a\u00020VX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010¿\u0001\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020\u000b@BX\u0080\u000e¢\u0006\t\n\u0000\u001a\u0005\bÀ\u0001\u00108R\u000f\u0010Á\u0001\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0015\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\bÂ\u0001\u00108R\"\u0010Ã\u0001\u001a\u0005\u0018\u00010Ä\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R\u000f\u0010É\u0001\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010Ê\u0001\u001a\u00030Ë\u0001X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R\u000f\u0010Ð\u0001\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010Ñ\u0001\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÒ\u0001\u00108R\u0010\u0010Ó\u0001\u001a\u00030Ô\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010Õ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e8@X\u0081\u0004¢\u0006\u000e\u0012\u0005\bÖ\u0001\u0010\u001d\u001a\u0005\b×\u0001\u0010\u0010R\u000f\u0010Ø\u0001\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Þ\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/LayoutInfo;", "Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/node/InteroperableComposeUiNode;", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "isVirtual", "", "semanticsId", "", "(ZI)V", "_children", "Landroidx/compose/runtime/collection/MutableVector;", "get_children$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "_foldedChildren", "Landroidx/compose/ui/node/MutableVectorWithMutationTracking;", "_foldedParent", "_innerLayerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "_unfoldedChildren", "_zSortedChildren", "alignmentLinesRequired", "getAlignmentLinesRequired$ui_release", "()Z", "canMultiMeasure", "getCanMultiMeasure$ui_release$annotations", "()V", "getCanMultiMeasure$ui_release", "setCanMultiMeasure$ui_release", "(Z)V", "childLookaheadMeasurables", "", "Landroidx/compose/ui/layout/Measurable;", "getChildLookaheadMeasurables$ui_release", "()Ljava/util/List;", "childMeasurables", "getChildMeasurables$ui_release", "children", "getChildren$ui_release", C4257c4.f42802f, "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "deactivated", "value", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "depth", "getDepth$ui_release", "()I", "setDepth$ui_release", "(I)V", "foldedChildren", "getFoldedChildren$ui_release", "hasFixedInnerContentConstraints", "getHasFixedInnerContentConstraints$ui_release", "height", "getHeight", "ignoreRemeasureRequests", "innerCoordinator", "getInnerCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerLayerCoordinator", "getInnerLayerCoordinator", "innerLayerCoordinatorIsDirty", "getInnerLayerCoordinatorIsDirty$ui_release", "setInnerLayerCoordinatorIsDirty$ui_release", "interopViewFactoryHolder", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "getInteropViewFactoryHolder$ui_release", "()Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "setInteropViewFactoryHolder$ui_release", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "intrinsicsPolicy", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "getIntrinsicsPolicy$ui_release", "()Landroidx/compose/ui/node/IntrinsicsPolicy;", "intrinsicsUsageByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getIntrinsicsUsageByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setIntrinsicsUsageByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "isAttached", "isLookaheadRoot", "setLookaheadRoot", "<set-?>", "isPlaced", "isPlacedInLookahead", "()Ljava/lang/Boolean;", "isValidOwnerScope", "layoutDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "getLayoutDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutPending", "getLayoutPending$ui_release", "layoutState", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "lookaheadLayoutPending", "getLookaheadLayoutPending$ui_release", "lookaheadMeasurePending", "getLookaheadMeasurePending$ui_release", "lookaheadPassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "getLookaheadPassDelegate", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "mDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getMDrawScope$ui_release", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "newScope", "Landroidx/compose/ui/layout/LookaheadScope;", "mLookaheadScope", "getMLookaheadScope$ui_release", "()Landroidx/compose/ui/layout/LookaheadScope;", "setMLookaheadScope", "(Landroidx/compose/ui/layout/LookaheadScope;)V", "measurePassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "getMeasurePassDelegate", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePending", "getMeasurePending$ui_release", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "measuredByParent", "getMeasuredByParent$ui_release", "setMeasuredByParent$ui_release", "measuredByParentInLookahead", "getMeasuredByParentInLookahead$ui_release", "setMeasuredByParentInLookahead$ui_release", "Landroidx/compose/ui/Modifier;", "modifier", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "needsOnPositionedDispatch", "getNeedsOnPositionedDispatch$ui_release", "setNeedsOnPositionedDispatch$ui_release", "nextChildPlaceOrder", "nodes", "Landroidx/compose/ui/node/NodeChain;", "getNodes$ui_release", "()Landroidx/compose/ui/node/NodeChain;", "onAttach", "Lkotlin/Function1;", "Landroidx/compose/ui/node/Owner;", "", "getOnAttach$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnAttach$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onDetach", "getOnDetach$ui_release", "setOnDetach$ui_release", "outerCoordinator", "getOuterCoordinator$ui_release", "owner", "getOwner$ui_release", "()Landroidx/compose/ui/node/Owner;", "parent", "getParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "parentInfo", "getParentInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "placeOrder", "getPlaceOrder$ui_release", "previousIntrinsicsUsageByParent", "previousPlaceOrder", "getPreviousPlaceOrder$ui_release", "relayoutWithoutParentInProgress", "getSemanticsId", "subcompositionsState", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "getSubcompositionsState$ui_release", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "setSubcompositionsState$ui_release", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "unfoldedVirtualChildrenListDirty", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "setViewConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "virtualChildrenCount", "width", "getWidth", "zIndex", "", "zSortedChildren", "getZSortedChildren$annotations", "getZSortedChildren", "zSortedChildrenInvalidated", "attach", "attach$ui_release", "checkChildrenPlaceOrderForUpdates", "checkChildrenPlaceOrderForUpdates$ui_release", "clearPlaceOrder", "clearPlaceOrder$ui_release", "clearSubtreeIntrinsicsUsage", "clearSubtreeIntrinsicsUsage$ui_release", "clearSubtreePlacementIntrinsicsUsage", "debugTreeToString", "", "detach", "detach$ui_release", "dispatchOnPositionedCallbacks", "dispatchOnPositionedCallbacks$ui_release", "draw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "draw$ui_release", "forEachChild", "block", "forEachChildIndexed", "Lkotlin/Function2;", "forEachCoordinator", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "forEachCoordinatorIncludingInner", "forceRemeasure", "getInteropView", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "getModifierInfo", "Landroidx/compose/ui/layout/ModifierInfo;", "hitTest", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "isTouchEvent", "isInLayer", "hitTest-M_7yMNQ$ui_release", "(JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTestSemantics", "hitSemanticsEntities", "Landroidx/compose/ui/node/SemanticsModifierNode;", "hitTestSemantics-M_7yMNQ$ui_release", "Lkotlin/Function0;", "ignoreRemeasureRequests$ui_release", "insertAt", FirebaseAnalytics.Param.INDEX, C4424m2.f43617p, "insertAt$ui_release", "invalidateFocusOnAttach", "invalidateFocusOnDetach", "invalidateLayer", "invalidateLayer$ui_release", "invalidateLayers", "invalidateLayers$ui_release", "invalidateMeasurements", "invalidateMeasurements$ui_release", "invalidateParentData", "invalidateParentData$ui_release", "invalidateSubtree", "isRootOfInvalidation", "invalidateUnfoldedVirtualChildren", "lookaheadRemeasure", "constraints", "Landroidx/compose/ui/unit/Constraints;", "lookaheadRemeasure-_Sx5XlM$ui_release", "lookaheadReplace", "lookaheadReplace$ui_release", "markLayoutPending", "markLayoutPending$ui_release", "markLookaheadLayoutPending", "markLookaheadLayoutPending$ui_release", "markLookaheadMeasurePending", "markLookaheadMeasurePending$ui_release", "markMeasurePending", "markMeasurePending$ui_release", "markNodeAndSubtreeAsPlaced", "markSubtreeAsNotPlaced", "move", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "count", "move$ui_release", "onChildRemoved", "child", "onDeactivate", "onDensityOrLayoutDirectionChanged", "onLayoutComplete", "onNodePlaced", "onNodePlaced$ui_release", "onRelease", "onReuse", "onZSortedChildrenInvalidated", "onZSortedChildrenInvalidated$ui_release", "place", "x", "y", "place$ui_release", "recreateUnfoldedChildrenIfDirty", "remeasure", "remeasure-_Sx5XlM$ui_release", "removeAll", "removeAll$ui_release", "removeAt", "removeAt$ui_release", "replace", "replace$ui_release", "requestLookaheadRelayout", "forceRequest", "requestLookaheadRelayout$ui_release", "requestLookaheadRemeasure", "requestLookaheadRemeasure$ui_release", "requestRelayout", "requestRelayout$ui_release", "requestRemeasure", "requestRemeasure$ui_release", "rescheduleRemeasureOrRelayout", "it", "rescheduleRemeasureOrRelayout$ui_release", "resetModifierState", "resetSubtreeIntrinsicsUsage", "resetSubtreeIntrinsicsUsage$ui_release", "shouldInvalidateParentLayer", "toString", "updateChildrenIfDirty", "updateChildrenIfDirty$ui_release", y.f66058y, "LayoutState", "NoIntrinsicsMeasurePolicy", "UsageByParent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LayoutNode implements ComposeNodeLifecycleCallback, Remeasurement, OwnerScope, LayoutInfo, ComposeUiNode, InteroperableComposeUiNode, Owner.OnLayoutCompletedListener {
    public static final int NotPlacedPlaceOrder = Integer.MAX_VALUE;

    @NotNull
    private final MutableVectorWithMutationTracking<LayoutNode> _foldedChildren;

    @Nullable
    private LayoutNode _foldedParent;

    @Nullable
    private NodeCoordinator _innerLayerCoordinator;

    @Nullable
    private MutableVector<LayoutNode> _unfoldedChildren;

    @NotNull
    private final MutableVector<LayoutNode> _zSortedChildren;
    private boolean canMultiMeasure;
    private boolean deactivated;

    @NotNull
    private Density density;
    private int depth;
    private boolean ignoreRemeasureRequests;
    private boolean innerLayerCoordinatorIsDirty;

    @Nullable
    private AndroidViewHolder interopViewFactoryHolder;

    @NotNull
    private final IntrinsicsPolicy intrinsicsPolicy;

    @NotNull
    private UsageByParent intrinsicsUsageByParent;
    private boolean isLookaheadRoot;
    private boolean isPlaced;
    private final boolean isVirtual;

    @NotNull
    private final LayoutNodeLayoutDelegate layoutDelegate;

    @NotNull
    private LayoutDirection layoutDirection;

    @Nullable
    private LookaheadScope mLookaheadScope;

    @NotNull
    private MeasurePolicy measurePolicy;

    @NotNull
    private UsageByParent measuredByParent;

    @NotNull
    private UsageByParent measuredByParentInLookahead;

    @NotNull
    private Modifier modifier;
    private boolean needsOnPositionedDispatch;
    private int nextChildPlaceOrder;

    @NotNull
    private final NodeChain nodes;

    @Nullable
    private Function1<? super Owner, Unit> onAttach;

    @Nullable
    private Function1<? super Owner, Unit> onDetach;

    @Nullable
    private Owner owner;
    private int placeOrder;

    @NotNull
    private UsageByParent previousIntrinsicsUsageByParent;
    private int previousPlaceOrder;
    private boolean relayoutWithoutParentInProgress;
    private final int semanticsId;

    @Nullable
    private LayoutNodeSubcompositionsState subcompositionsState;
    private boolean unfoldedVirtualChildrenListDirty;

    @NotNull
    private ViewConfiguration viewConfiguration;
    private int virtualChildrenCount;
    private float zIndex;
    private boolean zSortedChildrenInvalidated;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final NoIntrinsicsMeasurePolicy ErrorMeasurePolicy = new NoIntrinsicsMeasurePolicy() { // from class: androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1
        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* JADX INFO: renamed from: measure-3p2s80s */
        public /* bridge */ /* synthetic */ MeasureResult mo30measure3p2s80s(MeasureScope measureScope, List list, long j10) {
            return (MeasureResult) m3131measure3p2s80s(measureScope, (List<? extends Measurable>) list, j10);
        }

        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
        public Void m3131measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j10) {
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException("Undefined measure and it is required");
        }
    };

    @NotNull
    private static final Function0<LayoutNode> Constructor = new Function0<LayoutNode>() { // from class: androidx.compose.ui.node.LayoutNode$Companion$Constructor$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final LayoutNode invoke() {
            return new LayoutNode(false, 0 == true ? 1 : 0, 3, null);
        }
    };

    @NotNull
    private static final ViewConfiguration DummyViewConfiguration = new ViewConfiguration() { // from class: androidx.compose.ui.node.LayoutNode$Companion$DummyViewConfiguration$1
        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapMinTimeMillis() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapTimeoutMillis() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getLongPressTimeoutMillis() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        /* JADX INFO: renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public long mo3130getMinimumTouchTargetSizeMYxV2XQ() {
            return DpSize.INSTANCE.m4059getZeroMYxV2XQ();
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public float getTouchSlop() {
            return 16.0f;
        }
    };

    @NotNull
    private static final Comparator<LayoutNode> ZComparator = new Comparator() { // from class: androidx.compose.ui.node.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return LayoutNode.ZComparator$lambda$41((LayoutNode) obj, (LayoutNode) obj2);
        }
    };

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$Companion;", "", "()V", "Constructor", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "getConstructor$ui_release", "()Lkotlin/jvm/functions/Function0;", "DummyViewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getDummyViewConfiguration$ui_release", "()Landroidx/compose/ui/platform/ViewConfiguration;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "NotPlacedPlaceOrder", "", "ZComparator", "Ljava/util/Comparator;", "getZComparator$ui_release", "()Ljava/util/Comparator;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Function0<LayoutNode> getConstructor$ui_release() {
            return LayoutNode.Constructor;
        }

        @NotNull
        public final ViewConfiguration getDummyViewConfiguration$ui_release() {
            return LayoutNode.DummyViewConfiguration;
        }

        @NotNull
        public final Comparator<LayoutNode> getZComparator$ui_release() {
            return LayoutNode.ZComparator;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "(Ljava/lang/String;I)V", "Measuring", "LookaheadMeasuring", "LayingOut", "LookaheadLayingOut", "Idle", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\"\u0010\u000f\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u0010\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "error", "", "(Ljava/lang/String;)V", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "", "maxIntrinsicWidth", "height", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {

        @NotNull
        private final String error;

        public NoIntrinsicsMeasurePolicy(@NotNull String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return ((Number) m3132maxIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i10)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return ((Number) m3133maxIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i10)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return ((Number) m3134minIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i10)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return ((Number) m3135minIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i10)).intValue();
        }

        @NotNull
        /* JADX INFO: renamed from: maxIntrinsicHeight, reason: collision with other method in class */
        public Void m3132maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        @NotNull
        /* JADX INFO: renamed from: maxIntrinsicWidth, reason: collision with other method in class */
        public Void m3133maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        @NotNull
        /* JADX INFO: renamed from: minIntrinsicHeight, reason: collision with other method in class */
        public Void m3134minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        @NotNull
        /* JADX INFO: renamed from: minIntrinsicWidth, reason: collision with other method in class */
        public Void m3135minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.error.toString());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "(Ljava/lang/String;I)V", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LayoutNode() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ZComparator$lambda$41(LayoutNode layoutNode, LayoutNode layoutNode2) {
        float f10 = layoutNode.zIndex;
        float f11 = layoutNode2.zIndex;
        return f10 == f11 ? Intrinsics.compare(layoutNode.placeOrder, layoutNode2.placeOrder) : Float.compare(f10, f11);
    }

    private final void clearSubtreePlacementIntrinsicsUsage() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                LayoutNode layoutNode = content[i10];
                if (layoutNode.intrinsicsUsageByParent == UsageByParent.InLayoutBlock) {
                    layoutNode.clearSubtreePlacementIntrinsicsUsage();
                }
                i10++;
            } while (i10 < size);
        }
    }

    private final String debugTreeToString(int depth) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < depth; i10++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i11 = 0;
            do {
                sb2.append(content[i11].debugTreeToString(depth + 1));
                i11++;
            } while (i11 < size);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "tree.toString()");
        if (depth != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    static /* synthetic */ String debugTreeToString$default(LayoutNode layoutNode, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return layoutNode.debugTreeToString(i10);
    }

    private final void forEachCoordinator(Function1<? super LayoutModifierNodeCoordinator, Unit> block) {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            block.invoke(layoutModifierNodeCoordinator);
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped();
        }
    }

    private final void forEachCoordinatorIncludingInner(Function1<? super NodeCoordinator, Unit> block) {
        NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            block.invoke(outerCoordinator$ui_release);
        }
    }

    public static /* synthetic */ void getCanMultiMeasure$ui_release$annotations() {
    }

    private final NodeCoordinator getInnerLayerCoordinator() {
        if (this.innerLayerCoordinatorIsDirty) {
            NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
            NodeCoordinator wrappedBy = getOuterCoordinator$ui_release().getWrappedBy();
            this._innerLayerCoordinator = null;
            while (true) {
                if (Intrinsics.areEqual(innerCoordinator$ui_release, wrappedBy)) {
                    break;
                }
                if ((innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getLayer() : null) != null) {
                    this._innerLayerCoordinator = innerCoordinator$ui_release;
                    break;
                }
                innerCoordinator$ui_release = innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getWrappedBy() : null;
            }
        }
        NodeCoordinator nodeCoordinator = this._innerLayerCoordinator;
        if (nodeCoordinator == null || nodeCoordinator.getLayer() != null) {
            return nodeCoordinator;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final LayoutNodeLayoutDelegate.LookaheadPassDelegate getLookaheadPassDelegate() {
        return this.layoutDelegate.getLookaheadPassDelegate();
    }

    private final LayoutNodeLayoutDelegate.MeasurePassDelegate getMeasurePassDelegate() {
        return this.layoutDelegate.getMeasurePassDelegate();
    }

    public static /* synthetic */ void getZSortedChildren$annotations() {
    }

    /* JADX INFO: renamed from: hitTest-M_7yMNQ$ui_release$default, reason: not valid java name */
    public static /* synthetic */ void m3122hitTestM_7yMNQ$ui_release$default(LayoutNode layoutNode, long j10, HitTestResult hitTestResult, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        layoutNode.m3126hitTestM_7yMNQ$ui_release(j10, hitTestResult, z12, z11);
    }

    /* JADX INFO: renamed from: hitTestSemantics-M_7yMNQ$ui_release$default, reason: not valid java name */
    public static /* synthetic */ void m3123hitTestSemanticsM_7yMNQ$ui_release$default(LayoutNode layoutNode, long j10, HitTestResult hitTestResult, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        layoutNode.m3127hitTestSemanticsM_7yMNQ$ui_release(j10, hitTestResult, z10, z11);
    }

    private final void invalidateFocusOnAttach() {
        if (this.nodes.has$ui_release(NodeKind.m3199constructorimpl(1024) | NodeKind.m3199constructorimpl(2048) | NodeKind.m3199constructorimpl(4096))) {
            for (Modifier.Node head = this.nodes.getHead(); head != null; head = head.getChild()) {
                if (((NodeKind.m3199constructorimpl(1024) & head.getKindSet()) != 0) | ((NodeKind.m3199constructorimpl(2048) & head.getKindSet()) != 0) | ((NodeKind.m3199constructorimpl(4096) & head.getKindSet()) != 0)) {
                    NodeKindKt.autoInvalidateInsertedNode(head);
                }
            }
        }
    }

    private final void invalidateFocusOnDetach() {
        if (this.nodes.m3162hasH91voCI$ui_release(NodeKind.m3199constructorimpl(1024))) {
            for (Modifier.Node tail = this.nodes.getTail(); tail != null; tail = tail.getParent()) {
                if ((NodeKind.m3199constructorimpl(1024) & tail.getKindSet()) != 0 && (tail instanceof FocusTargetModifierNode)) {
                    FocusTargetModifierNode focusTargetModifierNode = (FocusTargetModifierNode) tail;
                    if (focusTargetModifierNode.getFocusState().isFocused()) {
                        LayoutNodeKt.requireOwner(this).getFocusOwner().clearFocus(true, false);
                        focusTargetModifierNode.scheduleInvalidationForFocusEvents$ui_release();
                    }
                }
            }
        }
    }

    public static /* synthetic */ void invalidateSubtree$default(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        layoutNode.invalidateSubtree(z10);
    }

    private final void invalidateUnfoldedVirtualChildren() {
        LayoutNode parent$ui_release;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (parent$ui_release = getParent$ui_release()) == null) {
            return;
        }
        parent$ui_release.unfoldedVirtualChildrenListDirty = true;
    }

    /* JADX INFO: renamed from: lookaheadRemeasure-_Sx5XlM$ui_release$default, reason: not valid java name */
    public static /* synthetic */ boolean m3124lookaheadRemeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m3142getLastLookaheadConstraintsDWUhwKw();
        }
        return layoutNode.m3128lookaheadRemeasure_Sx5XlM$ui_release(constraints);
    }

    private final void markNodeAndSubtreeAsPlaced() {
        boolean isPlaced = getIsPlaced();
        this.isPlaced = true;
        if (!isPlaced) {
            if (getMeasurePending$ui_release()) {
                requestRemeasure$ui_release(true);
            } else if (getLookaheadMeasurePending$ui_release()) {
                requestLookaheadRemeasure$ui_release(true);
            }
        }
        NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            if (outerCoordinator$ui_release.getLastLayerDrawingWasSkipped()) {
                outerCoordinator$ui_release.invalidateLayer();
            }
        }
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                LayoutNode layoutNode = content[i10];
                if (layoutNode.placeOrder != Integer.MAX_VALUE) {
                    layoutNode.markNodeAndSubtreeAsPlaced();
                    rescheduleRemeasureOrRelayout$ui_release(layoutNode);
                }
                i10++;
            } while (i10 < size);
        }
    }

    private final void markSubtreeAsNotPlaced() {
        if (getIsPlaced()) {
            int i10 = 0;
            this.isPlaced = false;
            MutableVector<LayoutNode> mutableVector = get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    content[i10].markSubtreeAsNotPlaced();
                    i10++;
                } while (i10 < size);
            }
        }
    }

    private final void onChildRemoved(LayoutNode child) {
        if (child.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            this.layoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(r0.getChildrenAccessingCoordinatesDuringPlacement() - 1);
        }
        if (this.owner != null) {
            child.detach$ui_release();
        }
        child._foldedParent = null;
        child.getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
        if (child.isVirtual) {
            this.virtualChildrenCount--;
            MutableVector<LayoutNode> vector = child._foldedChildren.getVector();
            int size = vector.getSize();
            if (size > 0) {
                LayoutNode[] content = vector.getContent();
                int i10 = 0;
                do {
                    content[i10].getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
                    i10++;
                } while (i10 < size);
            }
        }
        invalidateUnfoldedVirtualChildren();
        onZSortedChildrenInvalidated$ui_release();
    }

    private final void onDensityOrLayoutDirectionChanged() {
        invalidateMeasurements$ui_release();
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateLayers$ui_release();
    }

    private final void recreateUnfoldedChildrenIfDirty() {
        if (this.unfoldedVirtualChildrenListDirty) {
            int i10 = 0;
            this.unfoldedVirtualChildrenListDirty = false;
            MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
            if (mutableVector == null) {
                mutableVector = new MutableVector<>(new LayoutNode[16], 0);
                this._unfoldedChildren = mutableVector;
            }
            mutableVector.clear();
            MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
            int size = vector.getSize();
            if (size > 0) {
                LayoutNode[] content = vector.getContent();
                do {
                    LayoutNode layoutNode = content[i10];
                    if (layoutNode.isVirtual) {
                        mutableVector.addAll(mutableVector.getSize(), layoutNode.get_children$ui_release());
                    } else {
                        mutableVector.add(layoutNode);
                    }
                    i10++;
                } while (i10 < size);
            }
            this.layoutDelegate.markChildrenDirty();
        }
    }

    /* JADX INFO: renamed from: remeasure-_Sx5XlM$ui_release$default, reason: not valid java name */
    public static /* synthetic */ boolean m3125remeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m3141getLastConstraintsDWUhwKw();
        }
        return layoutNode.m3129remeasure_Sx5XlM$ui_release(constraints);
    }

    public static /* synthetic */ void requestLookaheadRelayout$ui_release$default(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        layoutNode.requestLookaheadRelayout$ui_release(z10);
    }

    public static /* synthetic */ void requestLookaheadRemeasure$ui_release$default(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        layoutNode.requestLookaheadRemeasure$ui_release(z10);
    }

    public static /* synthetic */ void requestRelayout$ui_release$default(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        layoutNode.requestRelayout$ui_release(z10);
    }

    public static /* synthetic */ void requestRemeasure$ui_release$default(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        layoutNode.requestRemeasure$ui_release(z10);
    }

    private final void resetModifierState() {
        this.nodes.resetState$ui_release();
    }

    private final void setMLookaheadScope(LookaheadScope lookaheadScope) {
        if (Intrinsics.areEqual(lookaheadScope, this.mLookaheadScope)) {
            return;
        }
        this.mLookaheadScope = lookaheadScope;
        this.layoutDelegate.onLookaheadScopeChanged$ui_release(lookaheadScope);
        NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            outerCoordinator$ui_release.updateLookaheadScope$ui_release(lookaheadScope);
        }
    }

    private final boolean shouldInvalidateParentLayer() {
        if (this.nodes.m3162hasH91voCI$ui_release(NodeKind.m3199constructorimpl(4)) && !this.nodes.m3162hasH91voCI$ui_release(NodeKind.m3199constructorimpl(2))) {
            return true;
        }
        for (Modifier.Node head = this.nodes.getHead(); head != null; head = head.getChild()) {
            if ((NodeKind.m3199constructorimpl(2) & head.getKindSet()) != 0 && (head instanceof LayoutModifierNode) && DelegatableNodeKt.m3103requireCoordinator64DMado(head, NodeKind.m3199constructorimpl(2)).getLayer() != null) {
                return false;
            }
            if ((NodeKind.m3199constructorimpl(4) & head.getKindSet()) != 0) {
                return true;
            }
        }
        return true;
    }

    public final void attach$ui_release(@NotNull Owner owner) {
        LookaheadScope lookaheadScope;
        Intrinsics.checkNotNullParameter(owner, "owner");
        int i10 = 0;
        LookaheadScope lookaheadScope2 = null;
        if (this.owner != null) {
            throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + debugTreeToString$default(this, 0, 1, null)).toString());
        }
        LayoutNode layoutNode = this._foldedParent;
        if (layoutNode != null) {
            if (!Intrinsics.areEqual(layoutNode != null ? layoutNode.owner : null, owner)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Attaching to a different owner(");
                sb2.append(owner);
                sb2.append(") than the parent's owner(");
                LayoutNode parent$ui_release = getParent$ui_release();
                sb2.append(parent$ui_release != null ? parent$ui_release.owner : null);
                sb2.append("). This tree: ");
                sb2.append(debugTreeToString$default(this, 0, 1, null));
                sb2.append(" Parent tree: ");
                LayoutNode layoutNode2 = this._foldedParent;
                sb2.append(layoutNode2 != null ? debugTreeToString$default(layoutNode2, 0, 1, null) : null);
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 == null) {
            this.isPlaced = true;
        }
        this.owner = owner;
        this.depth = (parent$ui_release2 != null ? parent$ui_release2.depth : -1) + 1;
        if (SemanticsNodeKt.getOuterSemantics(this) != null) {
            owner.onSemanticsChange();
        }
        owner.onAttach(this);
        if (parent$ui_release2 != null && (lookaheadScope = parent$ui_release2.mLookaheadScope) != null) {
            lookaheadScope2 = lookaheadScope;
        } else if (this.isLookaheadRoot) {
            lookaheadScope2 = new LookaheadScope(this);
        }
        setMLookaheadScope(lookaheadScope2);
        this.nodes.attach();
        MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
        int size = vector.getSize();
        if (size > 0) {
            LayoutNode[] content = vector.getContent();
            do {
                content[i10].attach$ui_release(owner);
                i10++;
            } while (i10 < size);
        }
        invalidateMeasurements$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateMeasurements$ui_release();
        }
        NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            outerCoordinator$ui_release.onLayoutNodeAttach();
        }
        Function1<? super Owner, Unit> function1 = this.onAttach;
        if (function1 != null) {
            function1.invoke(owner);
        }
        this.layoutDelegate.updateParentData();
        invalidateFocusOnAttach();
    }

    public final void checkChildrenPlaceOrderForUpdates$ui_release() {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                LayoutNode layoutNode = content[i10];
                if (layoutNode.previousPlaceOrder != layoutNode.placeOrder) {
                    onZSortedChildrenInvalidated$ui_release();
                    invalidateLayer$ui_release();
                    if (layoutNode.placeOrder == Integer.MAX_VALUE) {
                        layoutNode.markSubtreeAsNotPlaced();
                    }
                }
                i10++;
            } while (i10 < size);
        }
    }

    public final void clearPlaceOrder$ui_release() {
        int i10 = 0;
        this.nextChildPlaceOrder = 0;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            do {
                LayoutNode layoutNode = content[i10];
                layoutNode.previousPlaceOrder = layoutNode.placeOrder;
                layoutNode.placeOrder = Integer.MAX_VALUE;
                if (layoutNode.measuredByParent == UsageByParent.InLayoutBlock) {
                    layoutNode.measuredByParent = UsageByParent.NotUsed;
                }
                i10++;
            } while (i10 < size);
        }
    }

    public final void clearSubtreeIntrinsicsUsage$ui_release() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                LayoutNode layoutNode = content[i10];
                if (layoutNode.intrinsicsUsageByParent != UsageByParent.NotUsed) {
                    layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
                }
                i10++;
            } while (i10 < size);
        }
    }

    public final void detach$ui_release() {
        Owner owner = this.owner;
        if (owner == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot detach node that is already detached!  Tree: ");
            LayoutNode parent$ui_release = getParent$ui_release();
            sb2.append(parent$ui_release != null ? debugTreeToString$default(parent$ui_release, 0, 1, null) : null);
            throw new IllegalStateException(sb2.toString().toString());
        }
        invalidateFocusOnDetach();
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateLayer$ui_release();
            parent$ui_release2.invalidateMeasurements$ui_release();
            this.measuredByParent = UsageByParent.NotUsed;
        }
        this.layoutDelegate.resetAlignmentLines();
        Function1<? super Owner, Unit> function1 = this.onDetach;
        if (function1 != null) {
            function1.invoke(owner);
        }
        if (SemanticsNodeKt.getOuterSemantics(this) != null) {
            owner.onSemanticsChange();
        }
        this.nodes.detach$ui_release();
        owner.onDetach(this);
        this.owner = null;
        this.depth = 0;
        MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
        int size = vector.getSize();
        if (size > 0) {
            LayoutNode[] content = vector.getContent();
            int i10 = 0;
            do {
                content[i10].detach$ui_release();
                i10++;
            } while (i10 < size);
        }
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this.isPlaced = false;
    }

    public final void dispatchOnPositionedCallbacks$ui_release() {
        if (getLayoutState$ui_release() != LayoutState.Idle || getLayoutPending$ui_release() || getMeasurePending$ui_release() || !getIsPlaced()) {
            return;
        }
        NodeChain nodeChain = this.nodes;
        int iM3199constructorimpl = NodeKind.m3199constructorimpl(256);
        if ((nodeChain.getAggregateChildKindSet() & iM3199constructorimpl) != 0) {
            for (Modifier.Node head = nodeChain.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iM3199constructorimpl) != 0 && (head instanceof GlobalPositionAwareModifierNode)) {
                    GlobalPositionAwareModifierNode globalPositionAwareModifierNode = (GlobalPositionAwareModifierNode) head;
                    globalPositionAwareModifierNode.onGloballyPositioned(DelegatableNodeKt.m3103requireCoordinator64DMado(globalPositionAwareModifierNode, NodeKind.m3199constructorimpl(256)));
                }
                if ((head.getAggregateChildKindSet() & iM3199constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    public final void draw$ui_release(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getOuterCoordinator$ui_release().draw(canvas);
    }

    public final void forEachChild(@NotNull Function1<? super LayoutNode, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                block.invoke(content[i10]);
                i10++;
            } while (i10 < size);
        }
    }

    public final void forEachChildIndexed(@NotNull Function2<? super Integer, ? super LayoutNode, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                block.invoke(Integer.valueOf(i10), content[i10]);
                i10++;
            } while (i10 < size);
        }
    }

    @Override // androidx.compose.ui.layout.Remeasurement
    public void forceRemeasure() {
        requestRemeasure$ui_release$default(this, false, 1, null);
        Constraints constraintsM3141getLastConstraintsDWUhwKw = this.layoutDelegate.m3141getLastConstraintsDWUhwKw();
        if (constraintsM3141getLastConstraintsDWUhwKw != null) {
            Owner owner = this.owner;
            if (owner != null) {
                owner.mo3250measureAndLayout0kLqBqw(this, constraintsM3141getLastConstraintsDWUhwKw.getValue());
                return;
            }
            return;
        }
        Owner owner2 = this.owner;
        if (owner2 != null) {
            e.e(owner2, false, 1, null);
        }
    }

    public final boolean getAlignmentLinesRequired$ui_release() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release;
        AlignmentLines alignmentLines;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        return layoutNodeLayoutDelegate.getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release() || !((lookaheadAlignmentLinesOwner$ui_release = layoutNodeLayoutDelegate.getLookaheadAlignmentLinesOwner$ui_release()) == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) == null || !alignmentLines.getRequired$ui_release());
    }

    /* JADX INFO: renamed from: getCanMultiMeasure$ui_release, reason: from getter */
    public final boolean getCanMultiMeasure() {
        return this.canMultiMeasure;
    }

    @NotNull
    public final List<Measurable> getChildLookaheadMeasurables$ui_release() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        Intrinsics.checkNotNull(lookaheadPassDelegate);
        return lookaheadPassDelegate.getChildMeasurables$ui_release();
    }

    @NotNull
    public final List<Measurable> getChildMeasurables$ui_release() {
        return getMeasurePassDelegate().getChildMeasurables$ui_release();
    }

    @NotNull
    public final List<LayoutNode> getChildren$ui_release() {
        return get_children$ui_release().asMutableList();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @NotNull
    public LayoutCoordinates getCoordinates() {
        return getInnerCoordinator$ui_release();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public Density getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: getDepth$ui_release, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    @NotNull
    public final List<LayoutNode> getFoldedChildren$ui_release() {
        return this._foldedChildren.asList();
    }

    public final boolean getHasFixedInnerContentConstraints$ui_release() {
        long jM3182getLastMeasurementConstraintsmsEJaDk$ui_release = getInnerCoordinator$ui_release().m3182getLastMeasurementConstraintsmsEJaDk$ui_release();
        return Constraints.m3917getHasFixedWidthimpl(jM3182getLastMeasurementConstraintsmsEJaDk$ui_release) && Constraints.m3916getHasFixedHeightimpl(jM3182getLastMeasurementConstraintsmsEJaDk$ui_release);
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getHeight() {
        return this.layoutDelegate.getHeight$ui_release();
    }

    @NotNull
    public final NodeCoordinator getInnerCoordinator$ui_release() {
        return this.nodes.getInnerCoordinator();
    }

    /* JADX INFO: renamed from: getInnerLayerCoordinatorIsDirty$ui_release, reason: from getter */
    public final boolean getInnerLayerCoordinatorIsDirty() {
        return this.innerLayerCoordinatorIsDirty;
    }

    @Override // androidx.compose.ui.node.InteroperableComposeUiNode
    @InternalComposeUiApi
    @Nullable
    public View getInteropView() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            return androidViewHolder.getInteropView();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: getInteropViewFactoryHolder$ui_release, reason: from getter */
    public final AndroidViewHolder getInteropViewFactoryHolder() {
        return this.interopViewFactoryHolder;
    }

    @NotNull
    /* JADX INFO: renamed from: getIntrinsicsPolicy$ui_release, reason: from getter */
    public final IntrinsicsPolicy getIntrinsicsPolicy() {
        return this.intrinsicsPolicy;
    }

    @NotNull
    /* JADX INFO: renamed from: getIntrinsicsUsageByParent$ui_release, reason: from getter */
    public final UsageByParent getIntrinsicsUsageByParent() {
        return this.intrinsicsUsageByParent;
    }

    @NotNull
    /* JADX INFO: renamed from: getLayoutDelegate$ui_release, reason: from getter */
    public final LayoutNodeLayoutDelegate getLayoutDelegate() {
        return this.layoutDelegate;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutDelegate.getLayoutPending();
    }

    @NotNull
    public final LayoutState getLayoutState$ui_release() {
        return this.layoutDelegate.getLayoutState();
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.layoutDelegate.getLookaheadLayoutPending();
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.layoutDelegate.getLookaheadMeasurePending();
    }

    @NotNull
    public final LayoutNodeDrawScope getMDrawScope$ui_release() {
        return LayoutNodeKt.requireOwner(this).getSharedDrawScope();
    }

    @Nullable
    /* JADX INFO: renamed from: getMLookaheadScope$ui_release, reason: from getter */
    public final LookaheadScope getMLookaheadScope() {
        return this.mLookaheadScope;
    }

    public final boolean getMeasurePending$ui_release() {
        return this.layoutDelegate.getMeasurePending();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    @NotNull
    /* JADX INFO: renamed from: getMeasuredByParent$ui_release, reason: from getter */
    public final UsageByParent getMeasuredByParent() {
        return this.measuredByParent;
    }

    @NotNull
    /* JADX INFO: renamed from: getMeasuredByParentInLookahead$ui_release, reason: from getter */
    public final UsageByParent getMeasuredByParentInLookahead() {
        return this.measuredByParentInLookahead;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @NotNull
    public List<ModifierInfo> getModifierInfo() {
        return this.nodes.getModifierInfo();
    }

    /* JADX INFO: renamed from: getNeedsOnPositionedDispatch$ui_release, reason: from getter */
    public final boolean getNeedsOnPositionedDispatch() {
        return this.needsOnPositionedDispatch;
    }

    @NotNull
    /* JADX INFO: renamed from: getNodes$ui_release, reason: from getter */
    public final NodeChain getNodes() {
        return this.nodes;
    }

    @Nullable
    public final Function1<Owner, Unit> getOnAttach$ui_release() {
        return this.onAttach;
    }

    @Nullable
    public final Function1<Owner, Unit> getOnDetach$ui_release() {
        return this.onDetach;
    }

    @NotNull
    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.nodes.getOuterCoordinator();
    }

    @Nullable
    /* JADX INFO: renamed from: getOwner$ui_release, reason: from getter */
    public final Owner getOwner() {
        return this.owner;
    }

    @Nullable
    public final LayoutNode getParent$ui_release() {
        LayoutNode layoutNode = this._foldedParent;
        if (layoutNode == null || !layoutNode.isVirtual) {
            return layoutNode;
        }
        if (layoutNode != null) {
            return layoutNode.getParent$ui_release();
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @Nullable
    public LayoutInfo getParentInfo() {
        return getParent$ui_release();
    }

    /* JADX INFO: renamed from: getPlaceOrder$ui_release, reason: from getter */
    public final int getPlaceOrder() {
        return this.placeOrder;
    }

    /* JADX INFO: renamed from: getPreviousPlaceOrder$ui_release, reason: from getter */
    public final int getPreviousPlaceOrder() {
        return this.previousPlaceOrder;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getSemanticsId() {
        return this.semanticsId;
    }

    @Nullable
    /* JADX INFO: renamed from: getSubcompositionsState$ui_release, reason: from getter */
    public final LayoutNodeSubcompositionsState getSubcompositionsState() {
        return this.subcompositionsState;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getWidth() {
        return this.layoutDelegate.getWidth$ui_release();
    }

    @NotNull
    public final MutableVector<LayoutNode> getZSortedChildren() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.clear();
            MutableVector<LayoutNode> mutableVector = this._zSortedChildren;
            mutableVector.addAll(mutableVector.getSize(), get_children$ui_release());
            this._zSortedChildren.sortWith(ZComparator);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    @NotNull
    public final MutableVector<LayoutNode> get_children$ui_release() {
        updateChildrenIfDirty$ui_release();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.getVector();
        }
        MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
        Intrinsics.checkNotNull(mutableVector);
        return mutableVector;
    }

    /* JADX INFO: renamed from: hitTest-M_7yMNQ$ui_release, reason: not valid java name */
    public final void m3126hitTestM_7yMNQ$ui_release(long pointerPosition, @NotNull HitTestResult<PointerInputModifierNode> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        getOuterCoordinator$ui_release().m3187hitTestYqVAtuI(NodeCoordinator.INSTANCE.getPointerInputSource(), getOuterCoordinator$ui_release().m3181fromParentPositionMKHz9U(pointerPosition), hitTestResult, isTouchEvent, isInLayer);
    }

    /* JADX INFO: renamed from: hitTestSemantics-M_7yMNQ$ui_release, reason: not valid java name */
    public final void m3127hitTestSemanticsM_7yMNQ$ui_release(long pointerPosition, @NotNull HitTestResult<SemanticsModifierNode> hitSemanticsEntities, boolean isTouchEvent, boolean isInLayer) {
        Intrinsics.checkNotNullParameter(hitSemanticsEntities, "hitSemanticsEntities");
        getOuterCoordinator$ui_release().m3187hitTestYqVAtuI(NodeCoordinator.INSTANCE.getSemanticsSource(), getOuterCoordinator$ui_release().m3181fromParentPositionMKHz9U(pointerPosition), hitSemanticsEntities, true, isInLayer);
    }

    public final void ignoreRemeasureRequests$ui_release(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.ignoreRemeasureRequests = true;
        block.invoke();
        this.ignoreRemeasureRequests = false;
    }

    public final void insertAt$ui_release(int index, @NotNull LayoutNode instance) {
        MutableVector<LayoutNode> vector;
        int size;
        Intrinsics.checkNotNullParameter(instance, "instance");
        int i10 = 0;
        NodeCoordinator innerCoordinator$ui_release = null;
        if (instance._foldedParent != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot insert ");
            sb2.append(instance);
            sb2.append(" because it already has a parent. This tree: ");
            sb2.append(debugTreeToString$default(this, 0, 1, null));
            sb2.append(" Other tree: ");
            LayoutNode layoutNode = instance._foldedParent;
            sb2.append(layoutNode != null ? debugTreeToString$default(layoutNode, 0, 1, null) : null);
            throw new IllegalStateException(sb2.toString().toString());
        }
        if (instance.owner != null) {
            throw new IllegalStateException(("Cannot insert " + instance + " because it already has an owner. This tree: " + debugTreeToString$default(this, 0, 1, null) + " Other tree: " + debugTreeToString$default(instance, 0, 1, null)).toString());
        }
        instance._foldedParent = this;
        this._foldedChildren.add(index, instance);
        onZSortedChildrenInvalidated$ui_release();
        if (instance.isVirtual) {
            if (this.isVirtual) {
                throw new IllegalArgumentException("Virtual LayoutNode can't be added into a virtual parent");
            }
            this.virtualChildrenCount++;
        }
        invalidateUnfoldedVirtualChildren();
        NodeCoordinator outerCoordinator$ui_release = instance.getOuterCoordinator$ui_release();
        if (this.isVirtual) {
            LayoutNode layoutNode2 = this._foldedParent;
            if (layoutNode2 != null) {
                innerCoordinator$ui_release = layoutNode2.getInnerCoordinator$ui_release();
            }
        } else {
            innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        }
        outerCoordinator$ui_release.setWrappedBy$ui_release(innerCoordinator$ui_release);
        if (instance.isVirtual && (size = (vector = instance._foldedChildren.getVector()).getSize()) > 0) {
            LayoutNode[] content = vector.getContent();
            do {
                content[i10].getOuterCoordinator$ui_release().setWrappedBy$ui_release(getInnerCoordinator$ui_release());
                i10++;
            } while (i10 < size);
        }
        Owner owner = this.owner;
        if (owner != null) {
            instance.attach$ui_release(owner);
        }
        if (instance.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() + 1);
        }
    }

    public final void invalidateLayer$ui_release() {
        NodeCoordinator innerLayerCoordinator = getInnerLayerCoordinator();
        if (innerLayerCoordinator != null) {
            innerLayerCoordinator.invalidateLayer();
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    public final void invalidateLayers$ui_release() {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            OwnedLayer layer = layoutModifierNodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped();
        }
        OwnedLayer layer2 = getInnerCoordinator$ui_release().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final void invalidateMeasurements$ui_release() {
        if (this.mLookaheadScope != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, 1, null);
        } else {
            requestRemeasure$ui_release$default(this, false, 1, null);
        }
    }

    public final void invalidateParentData$ui_release() {
        this.layoutDelegate.invalidateParentData();
    }

    public final void invalidateSubtree(boolean isRootOfInvalidation) {
        OwnedLayer layer;
        if (isRootOfInvalidation) {
            LayoutNode parent$ui_release = getParent$ui_release();
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
            LayoutNodeKt.requireOwner(this).onSemanticsChange();
        }
        requestRemeasure$ui_release$default(this, false, 1, null);
        NodeChain nodeChain = this.nodes;
        int iM3199constructorimpl = NodeKind.m3199constructorimpl(2);
        if ((nodeChain.getAggregateChildKindSet() & iM3199constructorimpl) != 0) {
            for (Modifier.Node head = nodeChain.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iM3199constructorimpl) != 0 && (head instanceof LayoutModifierNode) && (layer = DelegatableNodeKt.m3103requireCoordinator64DMado((LayoutModifierNode) head, NodeKind.m3199constructorimpl(2)).getLayer()) != null) {
                    layer.invalidate();
                }
                if ((head.getAggregateChildKindSet() & iM3199constructorimpl) == 0) {
                    break;
                }
            }
        }
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                content[i10].invalidateSubtree(false);
                i10++;
            } while (i10 < size);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isAttached() {
        return this.owner != null;
    }

    /* JADX INFO: renamed from: isLookaheadRoot, reason: from getter */
    public final boolean getIsLookaheadRoot() {
        return this.isLookaheadRoot;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    /* JADX INFO: renamed from: isPlaced, reason: from getter */
    public boolean getIsPlaced() {
        return this.isPlaced;
    }

    @Nullable
    public final Boolean isPlacedInLookahead() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        if (lookaheadPassDelegate != null) {
            return Boolean.valueOf(lookaheadPassDelegate.getIsPlaced());
        }
        return null;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttached();
    }

    /* JADX INFO: renamed from: lookaheadRemeasure-_Sx5XlM$ui_release, reason: not valid java name */
    public final boolean m3128lookaheadRemeasure_Sx5XlM$ui_release(@Nullable Constraints constraints) {
        if (constraints == null || this.mLookaheadScope == null) {
            return false;
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        Intrinsics.checkNotNull(lookaheadPassDelegate);
        return lookaheadPassDelegate.m3144remeasureBRTryo0(constraints.getValue());
    }

    public final void lookaheadReplace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        Intrinsics.checkNotNull(lookaheadPassDelegate);
        lookaheadPassDelegate.replace();
    }

    public final void markLayoutPending$ui_release() {
        this.layoutDelegate.markLayoutPending$ui_release();
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.layoutDelegate.markLookaheadLayoutPending$ui_release();
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.layoutDelegate.markLookaheadMeasurePending$ui_release();
    }

    public final void markMeasurePending$ui_release() {
        this.layoutDelegate.markMeasurePending$ui_release();
    }

    public final void move$ui_release(int from, int to, int count) {
        if (from == to) {
            return;
        }
        for (int i10 = 0; i10 < count; i10++) {
            this._foldedChildren.add(from > to ? to + i10 : (to + count) - 2, this._foldedChildren.removeAt(from > to ? from + i10 : from));
        }
        onZSortedChildrenInvalidated$ui_release();
        invalidateUnfoldedVirtualChildren();
        invalidateMeasurements$ui_release();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onDeactivate();
        }
        this.deactivated = true;
        resetModifierState();
    }

    @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
    public void onLayoutComplete() {
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        int iM3199constructorimpl = NodeKind.m3199constructorimpl(128);
        boolean zM3207getIncludeSelfInTraversalH91voCI = NodeKindKt.m3207getIncludeSelfInTraversalH91voCI(iM3199constructorimpl);
        Modifier.Node tail = innerCoordinator$ui_release.getTail();
        if (!zM3207getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = innerCoordinator$ui_release.headNode(zM3207getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM3199constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
            if ((nodeHeadNode.getKindSet() & iM3199constructorimpl) != 0 && (nodeHeadNode instanceof LayoutAwareModifierNode)) {
                ((LayoutAwareModifierNode) nodeHeadNode).onPlaced(getInnerCoordinator$ui_release());
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    public final void onNodePlaced$ui_release() {
        LayoutNode parent$ui_release = getParent$ui_release();
        float zIndex = getInnerCoordinator$ui_release().getZIndex();
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            zIndex += layoutModifierNodeCoordinator.getZIndex();
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped();
        }
        if (zIndex != this.zIndex) {
            this.zIndex = zIndex;
            if (parent$ui_release != null) {
                parent$ui_release.onZSortedChildrenInvalidated$ui_release();
            }
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
        }
        if (!getIsPlaced()) {
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
            markNodeAndSubtreeAsPlaced();
        }
        if (parent$ui_release == null) {
            this.placeOrder = 0;
        } else if (!this.relayoutWithoutParentInProgress && parent$ui_release.getLayoutState$ui_release() == LayoutState.LayingOut) {
            if (this.placeOrder != Integer.MAX_VALUE) {
                throw new IllegalStateException("Place was called on a node which was placed already");
            }
            int i10 = parent$ui_release.nextChildPlaceOrder;
            this.placeOrder = i10;
            parent$ui_release.nextChildPlaceOrder = i10 + 1;
        }
        this.layoutDelegate.getAlignmentLinesOwner$ui_release().layoutChildren();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onRelease();
        }
        NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            outerCoordinator$ui_release.onRelease();
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onReuse();
        }
        if (this.deactivated) {
            this.deactivated = false;
        } else {
            resetModifierState();
        }
        this.nodes.attach();
    }

    public final void onZSortedChildrenInvalidated$ui_release() {
        if (!this.isVirtual) {
            this.zSortedChildrenInvalidated = true;
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.onZSortedChildrenInvalidated$ui_release();
        }
    }

    public final void place$ui_release(int x10, int y10) {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = getMeasurePassDelegate();
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
        int measuredWidth = measurePassDelegate.getMeasuredWidth();
        LayoutDirection layoutDirection = getLayoutDirection();
        LayoutNode parent$ui_release = getParent$ui_release();
        NodeCoordinator innerCoordinator$ui_release = parent$ui_release != null ? parent$ui_release.getInnerCoordinator$ui_release() : null;
        LayoutCoordinates layoutCoordinates = Placeable.PlacementScope._coordinates;
        int parentWidth = companion.getParentWidth();
        LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = Placeable.PlacementScope.layoutDelegate;
        Placeable.PlacementScope.parentWidth = measuredWidth;
        Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
        boolean zConfigureForPlacingForAlignment = companion.configureForPlacingForAlignment(innerCoordinator$ui_release);
        Placeable.PlacementScope.placeRelative$default(companion, measurePassDelegate, x10, y10, 0.0f, 4, null);
        if (innerCoordinator$ui_release != null) {
            innerCoordinator$ui_release.setPlacingForAlignment$ui_release(zConfigureForPlacingForAlignment);
        }
        Placeable.PlacementScope.parentWidth = parentWidth;
        Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
        Placeable.PlacementScope._coordinates = layoutCoordinates;
        Placeable.PlacementScope.layoutDelegate = layoutNodeLayoutDelegate;
    }

    /* JADX INFO: renamed from: remeasure-_Sx5XlM$ui_release, reason: not valid java name */
    public final boolean m3129remeasure_Sx5XlM$ui_release(@Nullable Constraints constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreeIntrinsicsUsage$ui_release();
        }
        return getMeasurePassDelegate().m3147remeasureBRTryo0(constraints.getValue());
    }

    public final void removeAll$ui_release() {
        int size = this._foldedChildren.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                this._foldedChildren.clear();
                return;
            }
            onChildRemoved(this._foldedChildren.get(size));
        }
    }

    public final void removeAt$ui_release(int index, int count) {
        if (count < 0) {
            throw new IllegalArgumentException(("count (" + count + ") must be greater than 0").toString());
        }
        int i10 = (count + index) - 1;
        if (index > i10) {
            return;
        }
        while (true) {
            onChildRemoved(this._foldedChildren.removeAt(i10));
            if (i10 == index) {
                return;
            } else {
                i10--;
            }
        }
    }

    public final void replace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        try {
            this.relayoutWithoutParentInProgress = true;
            getMeasurePassDelegate().replace();
        } finally {
            this.relayoutWithoutParentInProgress = false;
        }
    }

    public final void requestLookaheadRelayout$ui_release(boolean forceRequest) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        owner.onRequestRelayout(this, true, forceRequest);
    }

    public final void requestLookaheadRemeasure$ui_release(boolean forceRequest) {
        if (this.mLookaheadScope == null) {
            throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout");
        }
        Owner owner = this.owner;
        if (owner == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        owner.onRequestMeasure(this, true, forceRequest);
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        Intrinsics.checkNotNull(lookaheadPassDelegate);
        lookaheadPassDelegate.invalidateIntrinsicsParent(forceRequest);
    }

    public final void requestRelayout$ui_release(boolean forceRequest) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        e.g(owner, this, false, forceRequest, 2, null);
    }

    public final void requestRemeasure$ui_release(boolean forceRequest) {
        Owner owner;
        if (this.ignoreRemeasureRequests || this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        e.f(owner, this, false, forceRequest, 2, null);
        getMeasurePassDelegate().invalidateIntrinsicsParent(forceRequest);
    }

    public final void rescheduleRemeasureOrRelayout$ui_release(@NotNull LayoutNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (WhenMappings.$EnumSwitchMapping$0[it.getLayoutState$ui_release().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + it.getLayoutState$ui_release());
        }
        if (it.getMeasurePending$ui_release()) {
            it.requestRemeasure$ui_release(true);
            return;
        }
        if (it.getLayoutPending$ui_release()) {
            it.requestRelayout$ui_release(true);
        } else if (it.getLookaheadMeasurePending$ui_release()) {
            it.requestLookaheadRemeasure$ui_release(true);
        } else if (it.getLookaheadLayoutPending$ui_release()) {
            it.requestLookaheadRelayout$ui_release(true);
        }
    }

    public final void resetSubtreeIntrinsicsUsage$ui_release() {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                LayoutNode layoutNode = content[i10];
                UsageByParent usageByParent = layoutNode.previousIntrinsicsUsageByParent;
                layoutNode.intrinsicsUsageByParent = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                }
                i10++;
            } while (i10 < size);
        }
    }

    public final void setCanMultiMeasure$ui_release(boolean z10) {
        this.canMultiMeasure = z10;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setDensity(@NotNull Density value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.density, value)) {
            return;
        }
        this.density = value;
        onDensityOrLayoutDirectionChanged();
    }

    public final void setDepth$ui_release(int i10) {
        this.depth = i10;
    }

    public final void setInnerLayerCoordinatorIsDirty$ui_release(boolean z10) {
        this.innerLayerCoordinatorIsDirty = z10;
    }

    public final void setInteropViewFactoryHolder$ui_release(@Nullable AndroidViewHolder androidViewHolder) {
        this.interopViewFactoryHolder = androidViewHolder;
    }

    public final void setIntrinsicsUsageByParent$ui_release(@NotNull UsageByParent usageByParent) {
        Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
        this.intrinsicsUsageByParent = usageByParent;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setLayoutDirection(@NotNull LayoutDirection value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.layoutDirection != value) {
            this.layoutDirection = value;
            onDensityOrLayoutDirectionChanged();
        }
    }

    public final void setLookaheadRoot(boolean z10) {
        if (z10 != this.isLookaheadRoot) {
            if (z10) {
                setMLookaheadScope(new LookaheadScope(this));
            } else {
                setMLookaheadScope(null);
            }
            this.isLookaheadRoot = z10;
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setMeasurePolicy(@NotNull MeasurePolicy value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.measurePolicy, value)) {
            return;
        }
        this.measurePolicy = value;
        this.intrinsicsPolicy.updateFrom(getMeasurePolicy());
        invalidateMeasurements$ui_release();
    }

    public final void setMeasuredByParent$ui_release(@NotNull UsageByParent usageByParent) {
        Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
        this.measuredByParent = usageByParent;
    }

    public final void setMeasuredByParentInLookahead$ui_release(@NotNull UsageByParent usageByParent) {
        Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
        this.measuredByParentInLookahead = usageByParent;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setModifier(@NotNull Modifier value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.isVirtual && getModifier() != Modifier.INSTANCE) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes");
        }
        this.modifier = value;
        this.nodes.updateFrom$ui_release(value);
        NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            outerCoordinator$ui_release.updateLookaheadScope$ui_release(this.mLookaheadScope);
        }
        this.layoutDelegate.updateParentData();
    }

    public final void setNeedsOnPositionedDispatch$ui_release(boolean z10) {
        this.needsOnPositionedDispatch = z10;
    }

    public final void setOnAttach$ui_release(@Nullable Function1<? super Owner, Unit> function1) {
        this.onAttach = function1;
    }

    public final void setOnDetach$ui_release(@Nullable Function1<? super Owner, Unit> function1) {
        this.onDetach = function1;
    }

    public final void setSubcompositionsState$ui_release(@Nullable LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.subcompositionsState = layoutNodeSubcompositionsState;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setViewConfiguration(@NotNull ViewConfiguration viewConfiguration) {
        Intrinsics.checkNotNullParameter(viewConfiguration, "<set-?>");
        this.viewConfiguration = viewConfiguration;
    }

    @NotNull
    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + " children: " + getChildren$ui_release().size() + " measurePolicy: " + getMeasurePolicy();
    }

    public final void updateChildrenIfDirty$ui_release() {
        if (this.virtualChildrenCount > 0) {
            recreateUnfoldedChildrenIfDirty();
        }
    }

    public LayoutNode(boolean z10, int i10) {
        this.isVirtual = z10;
        this.semanticsId = i10;
        this._foldedChildren = new MutableVectorWithMutationTracking<>(new MutableVector(new LayoutNode[16], 0), new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNode$_foldedChildren$1
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
                this.this$0.getLayoutDelegate().markChildrenDirty();
            }
        });
        this._zSortedChildren = new MutableVector<>(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = ErrorMeasurePolicy;
        this.intrinsicsPolicy = new IntrinsicsPolicy(this);
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = DummyViewConfiguration;
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.measuredByParent = usageByParent;
        this.measuredByParentInLookahead = usageByParent;
        this.intrinsicsUsageByParent = usageByParent;
        this.previousIntrinsicsUsageByParent = usageByParent;
        this.nodes = new NodeChain(this);
        this.layoutDelegate = new LayoutNodeLayoutDelegate(this);
        this.innerLayerCoordinatorIsDirty = true;
        this.modifier = Modifier.INSTANCE;
    }

    public /* synthetic */ LayoutNode(boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? SemanticsModifierCore.INSTANCE.generateSemanticsId() : i10);
    }
}
