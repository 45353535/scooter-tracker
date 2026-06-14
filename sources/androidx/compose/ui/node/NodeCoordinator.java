package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinatesImpl;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.C4240b4;
import com.ironsource.C4257c4;
import com.taurusx.tax.f.y;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0011\b \u0018\u0000 ²\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005:\u0004²\u0002³\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0017\u001a\u00020\u00072\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\b\u0002\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJY\u0010'\u001a\u00020\u0007\"\b\b\u0000\u0010\u001c*\u00020\u001b*\u0004\u0018\u00018\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010 \u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&Ja\u0010,\u001a\u00020\u0007\"\b\b\u0000\u0010\u001c*\u00020\u001b*\u0004\u0018\u00018\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010 \u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010)\u001a\u00020(H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+Ja\u0010.\u001a\u00020\u0007\"\b\b\u0000\u0010\u001c*\u00020\u001b*\u0004\u0018\u00018\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010 \u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010)\u001a\u00020(H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010+J\u0013\u0010/\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b/\u00100J%\u00106\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u000202H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J%\u00108\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u000202H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00105J%\u0010<\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u001fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;J'\u0010<\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\fH\u0002¢\u0006\u0004\b<\u0010@J\u001f\u0010B\u001a\u00020\u00072\u0006\u0010A\u001a\u00020=2\u0006\u0010?\u001a\u00020\fH\u0002¢\u0006\u0004\bB\u0010CJ\u001d\u0010F\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010EJ7\u0010J\u001a\u00020\u00072\u0006\u0010H\u001a\u00020G2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0002¢\u0006\u0004\bJ\u0010KJC\u0010J\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u001c\u0018\u00012\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000L2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010OJ\u001f\u0010R\u001a\u00020\f2\n\u0010M\u001a\u0006\u0012\u0002\b\u00030Lø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bP\u0010QJ.\u0010U\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001c\u0018\u00012\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000LH\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bS\u0010TJ)\u0010W\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001c2\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000Lø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bV\u0010TJ\r\u0010X\u001a\u00020\f¢\u0006\u0004\bX\u0010YJ\u000f\u0010[\u001a\u00020\u0007H\u0010¢\u0006\u0004\bZ\u0010\u001aJ\u0019\u0010`\u001a\u00020\u00072\b\u0010]\u001a\u0004\u0018\u00010\\H\u0000¢\u0006\u0004\b^\u0010_J\u0017\u0010c\u001a\u00020\u00072\u0006\u0010b\u001a\u00020aH\u0004¢\u0006\u0004\bc\u0010dJ\u0017\u0010e\u001a\u00020a2\u0006\u0010]\u001a\u00020\\H&¢\u0006\u0004\be\u0010fJ\u001f\u0010i\u001a\u00020\u00072\u0006\u0010g\u001a\u00020G2\u0006\u0010h\u001a\u00020GH\u0014¢\u0006\u0004\bi\u0010jJ/\u0010q\u001a\u00020n2\u0006\u0010l\u001a\u00020k2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020n0mH\u0084\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bo\u0010pJ\r\u0010r\u001a\u00020\u0007¢\u0006\u0004\br\u0010\u001aJ;\u0010x\u001a\u00020\u00072\u0006\u0010t\u001a\u00020s2\u0006\u0010u\u001a\u00020(2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bv\u0010wJ\u0015\u0010y\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\by\u0010\u0013J\u0017\u0010z\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\bz\u0010\u0013J\r\u0010{\u001a\u00020\u0007¢\u0006\u0004\b{\u0010\u001aJ\u0018\u0010|\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b|\u0010\u0013J-\u0010}\u001a\u00020\u00072\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\b\u0002\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b}\u0010\u0018JR\u0010\u0080\u0001\u001a\u00020\u0007\"\b\b\u0000\u0010\u001c*\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010 \u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b~\u0010\u007fJU\u0010\u0082\u0001\u001a\u00020\u0007\"\b\b\u0000\u0010\u001c*\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010 \u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0081\u0001\u0010\u007fJ\u0011\u0010\u0084\u0001\u001a\u00030\u0083\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J \u0010\u0088\u0001\u001a\u00020\u001f2\u0007\u0010\u0086\u0001\u001a\u00020\u001fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0087\u0001\u0010EJ \u0010\u008b\u0001\u001a\u00020\u001f2\u0007\u0010\u0089\u0001\u001a\u00020\u001fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u008a\u0001\u0010EJ*\u0010\u0090\u0001\u001a\u00020\u001f2\u0007\u0010\u008c\u0001\u001a\u00020\u00032\u0007\u0010\u008d\u0001\u001a\u00020\u001fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J)\u0010\u0093\u0001\u001a\u00020\u00072\u0007\u0010\u008c\u0001\u001a\u00020\u00032\u0006\u00103\u001a\u000202H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J$\u0010\u0094\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u008c\u0001\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\fH\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J \u0010\u0097\u0001\u001a\u00020\u001f2\u0007\u0010\u0089\u0001\u001a\u00020\u001fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0096\u0001\u0010EJ2\u0010\u0098\u0001\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00062\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0084\bø\u0001\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001f\u0010\u009b\u0001\u001a\u00020\u001f2\u0006\u0010t\u001a\u00020\u001fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u009a\u0001\u0010EJ\u001f\u0010\u009d\u0001\u001a\u00020\u001f2\u0006\u0010t\u001a\u00020\u001fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u009c\u0001\u0010EJ$\u0010 \u0001\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u009f\u0001\u001a\u00030\u009e\u0001H\u0004¢\u0006\u0006\b \u0001\u0010¡\u0001J\u000f\u0010¢\u0001\u001a\u00020\u0007¢\u0006\u0005\b¢\u0001\u0010\u001aJ\u000f\u0010£\u0001\u001a\u00020\u0007¢\u0006\u0005\b£\u0001\u0010\u001aJ-\u0010§\u0001\u001a\u00020\u00072\u0006\u0010A\u001a\u00020=2\u0006\u0010?\u001a\u00020\f2\t\b\u0002\u0010¤\u0001\u001a\u00020\fH\u0000¢\u0006\u0006\b¥\u0001\u0010¦\u0001J \u0010ª\u0001\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b¨\u0001\u0010©\u0001J \u0010¬\u0001\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b«\u0001\u0010©\u0001J\u0011\u0010\u00ad\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\b\u00ad\u0001\u0010\u001aJ\u001f\u0010®\u0001\u001a\u00020\u00072\u0007\u0010>\u001a\u00030\u0083\u0001H\u0096@ø\u0001\u0001¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u0011\u0010°\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\b°\u0001\u0010\u001aJ\u001b\u0010´\u0001\u001a\u00020\u00002\u0007\u0010±\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\b²\u0001\u0010³\u0001J\u000f\u0010µ\u0001\u001a\u00020\f¢\u0006\u0005\bµ\u0001\u0010YJ\"\u0010¹\u0001\u001a\u00030¶\u00012\b\u0010·\u0001\u001a\u00030¶\u0001H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b¸\u0001\u0010EJ*\u0010¼\u0001\u001a\u00020(2\u0006\u0010 \u001a\u00020\u001f2\b\u0010·\u0001\u001a\u00030¶\u0001H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bº\u0001\u0010»\u0001R\u001d\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\t\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001R+\u0010À\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R+\u0010Æ\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÆ\u0001\u0010Á\u0001\u001a\u0006\bÇ\u0001\u0010Ã\u0001\"\u0006\bÈ\u0001\u0010Å\u0001R\u0019\u0010É\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u0019\u0010Ë\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010Ê\u0001RD\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0015\u0010Ì\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0004@BX\u0084\u000e¢\u0006\u000f\n\u0005\b\u0015\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u001a\u0010Ñ\u0001\u001a\u00030Ð\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R\u001a\u0010Ô\u0001\u001a\u00030Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u0019\u0010Ö\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u001c\u0010Ù\u0001\u001a\u0005\u0018\u00010Ø\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001R,\u0010b\u001a\u0004\u0018\u00010a2\t\u0010Ì\u0001\u001a\u0004\u0018\u00010a8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\bb\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001R)\u0010à\u0001\u001a\u0012\u0012\u0005\u0012\u00030ß\u0001\u0012\u0004\u0012\u00020G\u0018\u00010Þ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R9\u0010t\u001a\u00020s2\u0007\u0010Ì\u0001\u001a\u00020s8\u0016@TX\u0096\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0003¢\u0006\u0017\n\u0005\bt\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001R0\u0010u\u001a\u00020(2\u0007\u0010Ì\u0001\u001a\u00020(8\u0006@DX\u0086\u000e¢\u0006\u0017\n\u0005\bu\u0010×\u0001\u001a\u0006\bç\u0001\u0010è\u0001\"\u0006\bé\u0001\u0010ê\u0001R\u001b\u0010ë\u0001\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u001c\u0010î\u0001\u001a\u0005\u0018\u00010í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u001d\u0010ð\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070m8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bð\u0001\u0010ñ\u0001R)\u0010ò\u0001\u001a\u00020\f2\u0007\u0010Ì\u0001\u001a\u00020\f8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\bò\u0001\u0010Ê\u0001\u001a\u0005\bó\u0001\u0010YR0\u0010õ\u0001\u001a\u0005\u0018\u00010ô\u00012\n\u0010Ì\u0001\u001a\u0005\u0018\u00010ô\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bõ\u0001\u0010ö\u0001\u001a\u0006\b÷\u0001\u0010ø\u0001R\u0018\u0010ü\u0001\u001a\u00030ù\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bú\u0001\u0010û\u0001R\u0017\u0010ÿ\u0001\u001a\u00020\u000e8&X¦\u0004¢\u0006\b\u001a\u0006\bý\u0001\u0010þ\u0001R\u0018\u0010\u0082\u0002\u001a\u00030Ó\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002R\u0017\u0010\u0084\u0002\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0002\u0010è\u0001R\u0017\u0010\u0086\u0002\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0002\u0010è\u0001R\u0019\u0010\u0089\u0002\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002R\u0017\u0010\u008c\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002R\u001e\u0010\u008f\u0002\u001a\u00030\u008d\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0003¢\u0006\b\u001a\u0006\b\u008e\u0002\u0010ä\u0001R\u0018\u0010\u0093\u0002\u001a\u00030\u0090\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0019\u0010\u0095\u0002\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0094\u0002\u0010\u0088\u0002R\u0016\u0010\u0097\u0002\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0002\u0010YR\u0016\u0010\u0098\u0002\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0002\u0010YR,\u0010\u009e\u0002\u001a\u00030Ø\u00012\b\u0010\u0099\u0002\u001a\u00030Ø\u00018P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002\"\u0006\b\u009c\u0002\u0010\u009d\u0002R\u001f\u0010¢\u0002\u001a\n\u0012\u0005\u0012\u00030ß\u00010\u009f\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b \u0002\u0010¡\u0002R\u001a\u0010¦\u0002\u001a\u0005\u0018\u00010£\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¤\u0002\u0010¥\u0002R\u0016\u0010¨\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b§\u0002\u0010\u008b\u0002R\u0016\u0010ª\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b©\u0002\u0010\u008b\u0002R\u0017\u0010\u00ad\u0002\u001a\u00020=8DX\u0084\u0004¢\u0006\b\u001a\u0006\b«\u0002\u0010¬\u0002R \u0010¯\u0002\u001a\u00020k8@X\u0080\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0003¢\u0006\b\u001a\u0006\b®\u0002\u0010ä\u0001R\u0016\u0010°\u0002\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b°\u0002\u0010YR\u001e\u0010·\u0001\u001a\u00030¶\u00018Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0003¢\u0006\b\u001a\u0006\b±\u0002\u0010ä\u0001\u0082\u0002\u0016\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0002\b!¨\u0006´\u0002"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "includeTail", "Landroidx/compose/ui/Modifier$Node;", "headNode", "(Z)Landroidx/compose/ui/Modifier$Node;", "canvas", "drawContainedDrawModifiers", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "layerBlock", "forceLayerInvalidated", "onLayerBlockUpdated", "(Lkotlin/jvm/functions/Function1;Z)V", "updateLayerParameters", "()V", "Landroidx/compose/ui/node/DelegatableNode;", "T", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "hitTestSource", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "isTouchEvent", "isInLayer", "hit-1hIXUjU", "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hit", "", "distanceFromEdge", "hitNear-JHbHoSQ", "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZF)V", "hitNear", "speculativeHit-JHbHoSQ", "speculativeHit", "toCoordinator", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/node/NodeCoordinator;", "ancestor", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transformToAncestor-EL8BTi8", "(Landroidx/compose/ui/node/NodeCoordinator;[F)V", "transformToAncestor", "transformFromAncestor-EL8BTi8", "transformFromAncestor", "offset", "ancestorToLocal-R5De75A", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "ancestorToLocal", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "clipBounds", "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/geometry/MutableRect;Z)V", "bounds", "fromParentRect", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "offsetFromEdge-MK-Hz9U", "(J)J", "offsetFromEdge", "", "mask", "block", "visitNodes", "(IZLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/node/NodeKind;", "type", "visitNodes-aLcG6gQ", "(ILkotlin/jvm/functions/Function1;)V", "hasNode-H91voCI", "(I)Z", "hasNode", "head-H91voCI", "(I)Ljava/lang/Object;", "head", "headUnchecked-H91voCI", "headUnchecked", "isTransparent", "()Z", "replace$ui_release", "replace", "Landroidx/compose/ui/layout/LookaheadScope;", "scope", "updateLookaheadScope$ui_release", "(Landroidx/compose/ui/layout/LookaheadScope;)V", "updateLookaheadScope", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "updateLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "createLookaheadDelegate", "(Landroidx/compose/ui/layout/LookaheadScope;)Landroidx/compose/ui/node/LookaheadDelegate;", "width", "height", "onMeasureResultChanged", "(II)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/Placeable;", "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "performingMeasure", "onMeasured", "Landroidx/compose/ui/unit/IntOffset;", C4240b4.i.L, "zIndex", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "draw", "performDraw", "onPlaced", "invoke", "updateLayerBlock", "hitTest-YqVAtuI", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTest", "hitTestChild-YqVAtuI", "hitTestChild", "Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "()Landroidx/compose/ui/geometry/Rect;", "relativeToWindow", "windowToLocal-MK-Hz9U", "windowToLocal", "relativeToLocal", "localToWindow-MK-Hz9U", "localToWindow", "sourceCoordinates", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFrom", "localBoundingBoxOf", "(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;", "localToRoot-MK-Hz9U", "localToRoot", "withPositionTranslation", "(Landroidx/compose/ui/graphics/Canvas;Lkotlin/jvm/functions/Function1;)V", "toParentPosition-MK-Hz9U", "toParentPosition", "fromParentPosition-MK-Hz9U", "fromParentPosition", "Landroidx/compose/ui/graphics/Paint;", "paint", "drawBorder", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Paint;)V", "onLayoutNodeAttach", "onRelease", "clipToMinimumTouchTargetSize", "rectInParent$ui_release", "(Landroidx/compose/ui/geometry/MutableRect;ZZ)V", "rectInParent", "withinLayerBounds-k-4lQ0M", "(J)Z", "withinLayerBounds", "isPointerInBounds-k-4lQ0M", "isPointerInBounds", "invalidateLayer", "propagateRelocationRequest", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onLayoutModifierNodeChanged", "other", "findCommonAncestor$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;", "findCommonAncestor", "shouldSharePointerInputWithSiblings", "Landroidx/compose/ui/geometry/Size;", "minimumTouchTargetSize", "calculateMinimumTouchTargetPadding-E7KxVPU", "calculateMinimumTouchTargetPadding", "distanceInMinimumTouchTarget-tz77jQw", "(JJ)F", "distanceInMinimumTouchTarget", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "wrapped", "Landroidx/compose/ui/node/NodeCoordinator;", "getWrapped$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "setWrapped$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrappedBy", "getWrappedBy$ui_release", "setWrappedBy$ui_release", "released", "Z", "isClipping", "<set-?>", "Lkotlin/jvm/functions/Function1;", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/unit/Density;", "layerDensity", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "layerLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "lastLayerAlpha", "F", "Landroidx/compose/ui/layout/MeasureResult;", "_measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate$ui_release", "()Landroidx/compose/ui/node/LookaheadDelegate;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "oldAlignmentLines", "Ljava/util/Map;", "J", "getPosition-nOcc-ac", "()J", "setPosition--gyyYBs", "(J)V", "getZIndex", "()F", "setZIndex", "(F)V", "_rectCache", "Landroidx/compose/ui/geometry/MutableRect;", "Landroidx/compose/ui/node/LayerPositionalProperties;", "layerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "invalidateParentLayer", "Lkotlin/jvm/functions/Function0;", "lastLayerDrawingWasSkipped", "getLastLayerDrawingWasSkipped$ui_release", "Landroidx/compose/ui/node/OwnedLayer;", AdRevenueConstants.LAYER_KEY, "Landroidx/compose/ui/node/OwnedLayer;", "getLayer", "()Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "tail", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "density", "getFontScale", "fontScale", "getParent", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "parent", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", C4257c4.f42802f, "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "size", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "getChild", "child", "getHasMeasureResult", "hasMeasureResult", "isAttached", "value", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "setMeasureResult$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "measureResult", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "providedAlignmentLines", "", "getParentData", "()Ljava/lang/Object;", "parentData", "getParentLayoutCoordinates", "parentLayoutCoordinates", "getParentCoordinates", "parentCoordinates", "getRectCache", "()Landroidx/compose/ui/geometry/MutableRect;", "rectCache", "getLastMeasurementConstraints-msEJaDk$ui_release", "lastMeasurementConstraints", "isValidOwnerScope", "getMinimumTouchTargetSize-NH-jbRc", y.f66058y, "HitTestSource", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope, Function1<Canvas, Unit> {

    @NotNull
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";

    @NotNull
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";

    @Nullable
    private MeasureResult _measureResult;

    @Nullable
    private MutableRect _rectCache;

    @NotNull
    private final Function0<Unit> invalidateParentLayer;
    private boolean isClipping;
    private float lastLayerAlpha;
    private boolean lastLayerDrawingWasSkipped;

    @Nullable
    private OwnedLayer layer;

    @Nullable
    private Function1<? super GraphicsLayerScope, Unit> layerBlock;

    @NotNull
    private Density layerDensity;

    @NotNull
    private LayoutDirection layerLayoutDirection;

    @Nullable
    private LayerPositionalProperties layerPositionalProperties;

    @NotNull
    private final LayoutNode layoutNode;

    @Nullable
    private LookaheadDelegate lookaheadDelegate;

    @Nullable
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position;
    private boolean released;

    @Nullable
    private NodeCoordinator wrapped;

    @Nullable
    private NodeCoordinator wrappedBy;
    private float zIndex;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Function1<NodeCoordinator, Unit> onCommitAffectingLayerParams = new Function1<NodeCoordinator, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NodeCoordinator nodeCoordinator) {
            invoke2(nodeCoordinator);
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull NodeCoordinator coordinator) {
            Intrinsics.checkNotNullParameter(coordinator, "coordinator");
            if (coordinator.isValidOwnerScope()) {
                LayerPositionalProperties layerPositionalProperties = coordinator.layerPositionalProperties;
                if (layerPositionalProperties == null) {
                    coordinator.updateLayerParameters();
                    return;
                }
                NodeCoordinator.tmpLayerPositionalProperties.copyFrom(layerPositionalProperties);
                coordinator.updateLayerParameters();
                if (NodeCoordinator.tmpLayerPositionalProperties.hasSameValuesAs(layerPositionalProperties)) {
                    return;
                }
                LayoutNode layoutNode = coordinator.getLayoutNode();
                LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if (layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if (layoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                        LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                    }
                    layoutDelegate.getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
                }
                Owner owner = layoutNode.getOwner();
                if (owner != null) {
                    owner.requestOnPositionedCallback(layoutNode);
                }
            }
        }
    };

    @NotNull
    private static final Function1<NodeCoordinator, Unit> onCommitAffectingLayer = new Function1<NodeCoordinator, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NodeCoordinator nodeCoordinator) {
            invoke2(nodeCoordinator);
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull NodeCoordinator coordinator) {
            Intrinsics.checkNotNullParameter(coordinator, "coordinator");
            OwnedLayer layer = coordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
    };

    @NotNull
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();

    @NotNull
    private static final LayerPositionalProperties tmpLayerPositionalProperties = new LayerPositionalProperties();

    @NotNull
    private static final float[] tmpMatrix = Matrix.m1809constructorimpl$default(null, 1, null);

    @NotNull
    private static final HitTestSource<PointerInputModifierNode> PointerInputSource = new HitTestSource<PointerInputModifierNode>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: childHitTest-YqVAtuI, reason: not valid java name */
        public void mo3194childHitTestYqVAtuI(@NotNull LayoutNode layoutNode, long pointerPosition, @NotNull HitTestResult<PointerInputModifierNode> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
            layoutNode.m3126hitTestM_7yMNQ$ui_release(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: entityType-OLwlOKw, reason: not valid java name */
        public int mo3195entityTypeOLwlOKw() {
            return NodeKind.m3199constructorimpl(16);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(@NotNull LayoutNode parentLayoutNode) {
            Intrinsics.checkNotNullParameter(parentLayoutNode, "parentLayoutNode");
            return true;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(@NotNull PointerInputModifierNode node) {
            Intrinsics.checkNotNullParameter(node, "node");
            return node.interceptOutOfBoundsChildEvents();
        }
    };

    @NotNull
    private static final HitTestSource<SemanticsModifierNode> SemanticsSource = new HitTestSource<SemanticsModifierNode>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: childHitTest-YqVAtuI */
        public void mo3194childHitTestYqVAtuI(@NotNull LayoutNode layoutNode, long pointerPosition, @NotNull HitTestResult<SemanticsModifierNode> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
            layoutNode.m3127hitTestSemanticsM_7yMNQ$ui_release(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: entityType-OLwlOKw */
        public int mo3195entityTypeOLwlOKw() {
            return NodeKind.m3199constructorimpl(8);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(@NotNull SemanticsModifierNode node) {
            Intrinsics.checkNotNullParameter(node, "node");
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(@NotNull LayoutNode parentLayoutNode) {
            SemanticsConfiguration semanticsConfigurationCollapsedSemanticsConfiguration;
            Intrinsics.checkNotNullParameter(parentLayoutNode, "parentLayoutNode");
            SemanticsModifierNode outerSemantics = SemanticsNodeKt.getOuterSemantics(parentLayoutNode);
            boolean z10 = false;
            if (outerSemantics != null && (semanticsConfigurationCollapsedSemanticsConfiguration = SemanticsModifierNodeKt.collapsedSemanticsConfiguration(outerSemantics)) != null && semanticsConfigurationCollapsedSemanticsConfiguration.getIsClearingSemantics()) {
                z10 = true;
            }
            return !z10;
        }
    };

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0018\u001a\u00020\u0019X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$Companion;", "", "()V", "ExpectAttachedLayoutCoordinates", "", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "getPointerInputSource$annotations", "getPointerInputSource", "()Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "SemanticsSource", "Landroidx/compose/ui/node/SemanticsModifierNode;", "getSemanticsSource", "UnmeasuredError", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "onCommitAffectingLayer", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "", "onCommitAffectingLayerParams", "tmpLayerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "tmpMatrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getPointerInputSource$annotations() {
        }

        @NotNull
        public final HitTestSource<PointerInputModifierNode> getPointerInputSource() {
            return NodeCoordinator.PointerInputSource;
        }

        @NotNull
        public final HitTestSource<SemanticsModifierNode> getSemanticsSource() {
            return NodeCoordinator.SemanticsSource;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003JC\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H&ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0007H&ø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "N", "Landroidx/compose/ui/node/DelegatableNode;", "", "childHitTest", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "isTouchEvent", "", "isInLayer", "childHitTest-YqVAtuI", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "entityType", "Landroidx/compose/ui/node/NodeKind;", "entityType-OLwlOKw", "()I", "interceptOutOfBoundsChildEvents", "node", "(Landroidx/compose/ui/node/DelegatableNode;)Z", "shouldHitTestChildren", "parentLayoutNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface HitTestSource<N extends DelegatableNode> {
        /* JADX INFO: renamed from: childHitTest-YqVAtuI */
        void mo3194childHitTestYqVAtuI(@NotNull LayoutNode layoutNode, long pointerPosition, @NotNull HitTestResult<N> hitTestResult, boolean isTouchEvent, boolean isInLayer);

        /* JADX INFO: renamed from: entityType-OLwlOKw */
        int mo3195entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(@NotNull N node);

        boolean shouldHitTestChildren(@NotNull LayoutNode parentLayoutNode);
    }

    public NodeCoordinator(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
        this.layerDensity = getLayoutNode().getDensity();
        this.layerLayoutDirection = getLayoutNode().getLayoutDirection();
        this.lastLayerAlpha = 0.8f;
        this.position = IntOffset.INSTANCE.m4079getZeronOccac();
        this.invalidateParentLayer = new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1
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
                NodeCoordinator wrappedBy = this.this$0.getWrappedBy();
                if (wrappedBy != null) {
                    wrappedBy.invalidateLayer();
                }
            }
        };
    }

    private final void ancestorToLocal(NodeCoordinator ancestor, MutableRect rect, boolean clipBounds) {
        if (ancestor == this) {
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.ancestorToLocal(ancestor, rect, clipBounds);
        }
        fromParentRect(rect, clipBounds);
    }

    /* JADX INFO: renamed from: ancestorToLocal-R5De75A, reason: not valid java name */
    private final long m3172ancestorToLocalR5De75A(NodeCoordinator ancestor, long offset) {
        if (ancestor == this) {
            return offset;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        return (nodeCoordinator == null || Intrinsics.areEqual(ancestor, nodeCoordinator)) ? m3181fromParentPositionMKHz9U(offset) : m3181fromParentPositionMKHz9U(nodeCoordinator.m3172ancestorToLocalR5De75A(ancestor, offset));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawContainedDrawModifiers(Canvas canvas) {
        int iM3199constructorimpl = NodeKind.m3199constructorimpl(4);
        boolean zM3207getIncludeSelfInTraversalH91voCI = NodeKindKt.m3207getIncludeSelfInTraversalH91voCI(iM3199constructorimpl);
        Modifier.Node tail = getTail();
        if (zM3207getIncludeSelfInTraversalH91voCI || (tail = tail.getParent()) != null) {
            Modifier.Node nodeHeadNode = headNode(zM3207getIncludeSelfInTraversalH91voCI);
            while (true) {
                if (nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM3199constructorimpl) != 0) {
                    if ((nodeHeadNode.getKindSet() & iM3199constructorimpl) == 0) {
                        if (nodeHeadNode == tail) {
                            break;
                        } else {
                            nodeHeadNode = nodeHeadNode.getChild();
                        }
                    } else {
                        drawModifierNode = nodeHeadNode instanceof DrawModifierNode ? nodeHeadNode : null;
                    }
                } else {
                    break;
                }
            }
        }
        DrawModifierNode drawModifierNode = drawModifierNode;
        if (drawModifierNode == null) {
            performDraw(canvas);
        } else {
            getLayoutNode().getMDrawScope$ui_release().m3136drawx_KDEd0$ui_release(canvas, IntSizeKt.m4121toSizeozmzZPI(mo3015getSizeYbymL2g()), this, drawModifierNode);
        }
    }

    private final void fromParentRect(MutableRect bounds, boolean clipBounds) {
        float fM4069getXimpl = IntOffset.m4069getXimpl(getPosition());
        bounds.setLeft(bounds.getLeft() - fM4069getXimpl);
        bounds.setRight(bounds.getRight() - fM4069getXimpl);
        float fM4070getYimpl = IntOffset.m4070getYimpl(getPosition());
        bounds.setTop(bounds.getTop() - fM4070getYimpl);
        bounds.setBottom(bounds.getBottom() - fM4070getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(bounds, true);
            if (this.isClipping && clipBounds) {
                bounds.intersect(0.0f, 0.0f, IntSize.m4111getWidthimpl(mo3015getSizeYbymL2g()), IntSize.m4110getHeightimpl(mo3015getSizeYbymL2g()));
                bounds.isEmpty();
            }
        }
    }

    private final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node headNode(boolean includeTail) {
        Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui_release() == this) {
            return getLayoutNode().getNodes().getHead();
        }
        if (!includeTail) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                return nodeCoordinator.getTail();
            }
            return null;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 == null || (tail = nodeCoordinator2.getTail()) == null) {
            return null;
        }
        return tail.getChild();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: hit-1hIXUjU, reason: not valid java name */
    public final <T extends DelegatableNode> void m3173hit1hIXUjU(final T t10, final HitTestSource<T> hitTestSource, final long j10, final HitTestResult<T> hitTestResult, final boolean z10, final boolean z11) {
        if (t10 == null) {
            mo3121hitTestChildYqVAtuI(hitTestSource, j10, hitTestResult, z10, z11);
        } else {
            hitTestResult.hit(t10, z11, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$hit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/node/NodeCoordinator;TT;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource<TT;>;JLandroidx/compose/ui/node/HitTestResult<TT;>;ZZ)V */
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
                    this.this$0.m3173hit1hIXUjU((DelegatableNode) NodeCoordinatorKt.m3197nextUncheckedUntilhw7D004(t10, hitTestSource.mo3195entityTypeOLwlOKw(), NodeKind.m3199constructorimpl(2)), hitTestSource, j10, hitTestResult, z10, z11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: hitNear-JHbHoSQ, reason: not valid java name */
    public final <T extends DelegatableNode> void m3174hitNearJHbHoSQ(final T t10, final HitTestSource<T> hitTestSource, final long j10, final HitTestResult<T> hitTestResult, final boolean z10, final boolean z11, final float f10) {
        if (t10 == null) {
            mo3121hitTestChildYqVAtuI(hitTestSource, j10, hitTestResult, z10, z11);
        } else {
            hitTestResult.hitInMinimumTouchTarget(t10, f10, z11, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$hitNear$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/node/NodeCoordinator;TT;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource<TT;>;JLandroidx/compose/ui/node/HitTestResult<TT;>;ZZF)V */
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
                    this.this$0.m3174hitNearJHbHoSQ((DelegatableNode) NodeCoordinatorKt.m3197nextUncheckedUntilhw7D004(t10, hitTestSource.mo3195entityTypeOLwlOKw(), NodeKind.m3199constructorimpl(2)), hitTestSource, j10, hitTestResult, z10, z11, f10);
                }
            });
        }
    }

    /* JADX INFO: renamed from: offsetFromEdge-MK-Hz9U, reason: not valid java name */
    private final long m3175offsetFromEdgeMKHz9U(long pointerPosition) {
        float fM1371getXimpl = Offset.m1371getXimpl(pointerPosition);
        float fMax = Math.max(0.0f, fM1371getXimpl < 0.0f ? -fM1371getXimpl : fM1371getXimpl - getMeasuredWidth());
        float fM1372getYimpl = Offset.m1372getYimpl(pointerPosition);
        return OffsetKt.Offset(fMax, Math.max(0.0f, fM1372getYimpl < 0.0f ? -fM1372getYimpl : fM1372getYimpl - getMeasuredHeight()));
    }

    private final void onLayerBlockUpdated(Function1<? super GraphicsLayerScope, Unit> layerBlock, boolean forceLayerInvalidated) {
        Owner owner;
        boolean z10 = (this.layerBlock == layerBlock && Intrinsics.areEqual(this.layerDensity, getLayoutNode().getDensity()) && this.layerLayoutDirection == getLayoutNode().getLayoutDirection() && !forceLayerInvalidated) ? false : true;
        this.layerBlock = layerBlock;
        this.layerDensity = getLayoutNode().getDensity();
        this.layerLayoutDirection = getLayoutNode().getLayoutDirection();
        if (!isAttached() || layerBlock == null) {
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.destroy();
                getLayoutNode().setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
                if (isAttached() && (owner = getLayoutNode().getOwner()) != null) {
                    owner.onLayoutChange(getLayoutNode());
                }
            }
            this.layer = null;
            this.lastLayerDrawingWasSkipped = false;
            return;
        }
        if (this.layer != null) {
            if (z10) {
                updateLayerParameters();
                return;
            }
            return;
        }
        OwnedLayer ownedLayerCreateLayer = LayoutNodeKt.requireOwner(getLayoutNode()).createLayer(this, this.invalidateParentLayer);
        ownedLayerCreateLayer.mo3244resizeozmzZPI(getMeasuredSize());
        ownedLayerCreateLayer.mo3243movegyyYBs(getPosition());
        this.layer = ownedLayerCreateLayer;
        updateLayerParameters();
        getLayoutNode().setInnerLayerCoordinatorIsDirty$ui_release(true);
        this.invalidateParentLayer.invoke();
    }

    static /* synthetic */ void onLayerBlockUpdated$default(NodeCoordinator nodeCoordinator, Function1 function1, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLayerBlockUpdated");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        nodeCoordinator.onLayerBlockUpdated(function1, z10);
    }

    static /* synthetic */ Object propagateRelocationRequest$suspendImpl(NodeCoordinator nodeCoordinator, Rect rect, Continuation continuation) {
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.wrappedBy;
        if (nodeCoordinator2 == null) {
            return Unit.f93236a;
        }
        Object objPropagateRelocationRequest = nodeCoordinator2.propagateRelocationRequest(rect.m1408translatek4lQ0M(nodeCoordinator2.localBoundingBoxOf(nodeCoordinator, false).m1406getTopLeftF1C5BW0()), continuation);
        return objPropagateRelocationRequest == pf.b.g() ? objPropagateRelocationRequest : Unit.f93236a;
    }

    public static /* synthetic */ void rectInParent$ui_release$default(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        nodeCoordinator.rectInParent$ui_release(mutableRect, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: speculativeHit-JHbHoSQ, reason: not valid java name */
    public final <T extends DelegatableNode> void m3176speculativeHitJHbHoSQ(final T t10, final HitTestSource<T> hitTestSource, final long j10, final HitTestResult<T> hitTestResult, final boolean z10, final boolean z11, final float f10) {
        if (t10 == null) {
            mo3121hitTestChildYqVAtuI(hitTestSource, j10, hitTestResult, z10, z11);
        } else if (hitTestSource.interceptOutOfBoundsChildEvents(t10)) {
            hitTestResult.speculativeHit(t10, f10, z11, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/node/NodeCoordinator;TT;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource<TT;>;JLandroidx/compose/ui/node/HitTestResult<TT;>;ZZF)V */
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
                    this.this$0.m3176speculativeHitJHbHoSQ((DelegatableNode) NodeCoordinatorKt.m3197nextUncheckedUntilhw7D004(t10, hitTestSource.mo3195entityTypeOLwlOKw(), NodeKind.m3199constructorimpl(2)), hitTestSource, j10, hitTestResult, z10, z11, f10);
                }
            });
        } else {
            m3176speculativeHitJHbHoSQ((DelegatableNode) NodeCoordinatorKt.m3197nextUncheckedUntilhw7D004(t10, hitTestSource.mo3195entityTypeOLwlOKw(), NodeKind.m3199constructorimpl(2)), hitTestSource, j10, hitTestResult, z10, z11, f10);
        }
    }

    private final NodeCoordinator toCoordinator(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator coordinator;
        LookaheadLayoutCoordinatesImpl lookaheadLayoutCoordinatesImpl = layoutCoordinates instanceof LookaheadLayoutCoordinatesImpl ? (LookaheadLayoutCoordinatesImpl) layoutCoordinates : null;
        if (lookaheadLayoutCoordinatesImpl != null && (coordinator = lookaheadLayoutCoordinatesImpl.getCoordinator()) != null) {
            return coordinator;
        }
        Intrinsics.checkNotNull(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) layoutCoordinates;
    }

    /* JADX INFO: renamed from: transformFromAncestor-EL8BTi8, reason: not valid java name */
    private final void m3177transformFromAncestorEL8BTi8(NodeCoordinator ancestor, float[] matrix) {
        if (Intrinsics.areEqual(ancestor, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        Intrinsics.checkNotNull(nodeCoordinator);
        nodeCoordinator.m3177transformFromAncestorEL8BTi8(ancestor, matrix);
        if (!IntOffset.m4068equalsimpl0(getPosition(), IntOffset.INSTANCE.m4079getZeronOccac())) {
            float[] fArr = tmpMatrix;
            Matrix.m1818resetimpl(fArr);
            Matrix.m1829translateimpl$default(fArr, -IntOffset.m4069getXimpl(getPosition()), -IntOffset.m4070getYimpl(getPosition()), 0.0f, 4, null);
            Matrix.m1826timesAssign58bKbWc(matrix, fArr);
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo3240inverseTransform58bKbWc(matrix);
        }
    }

    /* JADX INFO: renamed from: transformToAncestor-EL8BTi8, reason: not valid java name */
    private final void m3178transformToAncestorEL8BTi8(NodeCoordinator ancestor, float[] matrix) {
        NodeCoordinator nodeCoordinator = this;
        while (!Intrinsics.areEqual(nodeCoordinator, ancestor)) {
            OwnedLayer ownedLayer = nodeCoordinator.layer;
            if (ownedLayer != null) {
                ownedLayer.mo3245transform58bKbWc(matrix);
            }
            if (!IntOffset.m4068equalsimpl0(nodeCoordinator.getPosition(), IntOffset.INSTANCE.m4079getZeronOccac())) {
                float[] fArr = tmpMatrix;
                Matrix.m1818resetimpl(fArr);
                Matrix.m1829translateimpl$default(fArr, IntOffset.m4069getXimpl(r1), IntOffset.m4070getYimpl(r1), 0.0f, 4, null);
                Matrix.m1826timesAssign58bKbWc(matrix, fArr);
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinator);
        }
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator nodeCoordinator, Function1 function1, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        nodeCoordinator.updateLayerBlock(function1, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLayerParameters() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            final Function1<? super GraphicsLayerScope, Unit> function1 = this.layerBlock;
            if (function1 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
            reusableGraphicsLayerScope.reset();
            reusableGraphicsLayerScope.setGraphicsDensity$ui_release(getLayoutNode().getDensity());
            reusableGraphicsLayerScope.m1886setSizeuvyYCjk(IntSizeKt.m4121toSizeozmzZPI(mo3015getSizeYbymL2g()));
            getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayerParams, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator.updateLayerParameters.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    function1.invoke(NodeCoordinator.graphicsLayerScope);
                }
            });
            LayerPositionalProperties layerPositionalProperties = this.layerPositionalProperties;
            if (layerPositionalProperties == null) {
                layerPositionalProperties = new LayerPositionalProperties();
                this.layerPositionalProperties = layerPositionalProperties;
            }
            layerPositionalProperties.copyFrom(reusableGraphicsLayerScope);
            ownedLayer.mo3246updateLayerPropertiesdDxrwY(reusableGraphicsLayerScope.getScaleX(), reusableGraphicsLayerScope.getScaleY(), reusableGraphicsLayerScope.getAlpha(), reusableGraphicsLayerScope.getTranslationX(), reusableGraphicsLayerScope.getTranslationY(), reusableGraphicsLayerScope.getShadowElevation(), reusableGraphicsLayerScope.getRotationX(), reusableGraphicsLayerScope.getRotationY(), reusableGraphicsLayerScope.getRotationZ(), reusableGraphicsLayerScope.getCameraDistance(), reusableGraphicsLayerScope.getTransformOrigin(), reusableGraphicsLayerScope.getShape(), reusableGraphicsLayerScope.getClip(), reusableGraphicsLayerScope.getRenderEffect(), reusableGraphicsLayerScope.getAmbientShadowColor(), reusableGraphicsLayerScope.getSpotShadowColor(), reusableGraphicsLayerScope.getCompositingStrategy(), getLayoutNode().getLayoutDirection(), getLayoutNode().getDensity());
            this.isClipping = reusableGraphicsLayerScope.getClip();
        } else if (this.layerBlock != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.lastLayerAlpha = graphicsLayerScope.getAlpha();
        Owner owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.onLayoutChange(getLayoutNode());
        }
    }

    /* JADX INFO: renamed from: calculateMinimumTouchTargetPadding-E7KxVPU, reason: not valid java name */
    protected final long m3179calculateMinimumTouchTargetPaddingE7KxVPU(long minimumTouchTargetSize) {
        return SizeKt.Size(Math.max(0.0f, (Size.m1440getWidthimpl(minimumTouchTargetSize) - getMeasuredWidth()) / 2.0f), Math.max(0.0f, (Size.m1437getHeightimpl(minimumTouchTargetSize) - getMeasuredHeight()) / 2.0f));
    }

    @NotNull
    public abstract LookaheadDelegate createLookaheadDelegate(@NotNull LookaheadScope scope);

    /* JADX INFO: renamed from: distanceInMinimumTouchTarget-tz77jQw, reason: not valid java name */
    protected final float m3180distanceInMinimumTouchTargettz77jQw(long pointerPosition, long minimumTouchTargetSize) {
        if (getMeasuredWidth() >= Size.m1440getWidthimpl(minimumTouchTargetSize) && getMeasuredHeight() >= Size.m1437getHeightimpl(minimumTouchTargetSize)) {
            return Float.POSITIVE_INFINITY;
        }
        long jM3179calculateMinimumTouchTargetPaddingE7KxVPU = m3179calculateMinimumTouchTargetPaddingE7KxVPU(minimumTouchTargetSize);
        float fM1440getWidthimpl = Size.m1440getWidthimpl(jM3179calculateMinimumTouchTargetPaddingE7KxVPU);
        float fM1437getHeightimpl = Size.m1437getHeightimpl(jM3179calculateMinimumTouchTargetPaddingE7KxVPU);
        long jM3175offsetFromEdgeMKHz9U = m3175offsetFromEdgeMKHz9U(pointerPosition);
        if ((fM1440getWidthimpl > 0.0f || fM1437getHeightimpl > 0.0f) && Offset.m1371getXimpl(jM3175offsetFromEdgeMKHz9U) <= fM1440getWidthimpl && Offset.m1372getYimpl(jM3175offsetFromEdgeMKHz9U) <= fM1437getHeightimpl) {
            return Offset.m1370getDistanceSquaredimpl(jM3175offsetFromEdgeMKHz9U);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas);
            return;
        }
        float fM4069getXimpl = IntOffset.m4069getXimpl(getPosition());
        float fM4070getYimpl = IntOffset.m4070getYimpl(getPosition());
        canvas.translate(fM4069getXimpl, fM4070getYimpl);
        drawContainedDrawModifiers(canvas);
        canvas.translate(-fM4069getXimpl, -fM4070getYimpl);
    }

    protected final void drawBorder(@NotNull Canvas canvas, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawRect(new Rect(0.5f, 0.5f, IntSize.m4111getWidthimpl(getMeasuredSize()) - 0.5f, IntSize.m4110getHeightimpl(getMeasuredSize()) - 0.5f), paint);
    }

    @NotNull
    public final NodeCoordinator findCommonAncestor$ui_release(@NotNull NodeCoordinator other) {
        Intrinsics.checkNotNullParameter(other, "other");
        LayoutNode layoutNode = other.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.Node tail = other.getTail();
            Modifier.Node tail2 = getTail();
            int iM3199constructorimpl = NodeKind.m3199constructorimpl(2);
            if (!tail2.getNode().getIsAttached()) {
                throw new IllegalStateException("Check failed.");
            }
            for (Modifier.Node parent = tail2.getNode().getParent(); parent != null; parent = parent.getParent()) {
                if ((parent.getKindSet() & iM3199constructorimpl) != 0 && parent == tail) {
                    return other;
                }
            }
            return this;
        }
        while (layoutNode.getDepth() > layoutNode2.getDepth()) {
            layoutNode = layoutNode.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode);
        }
        while (layoutNode2.getDepth() > layoutNode.getDepth()) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui_release();
            layoutNode2 = layoutNode2.getParent$ui_release();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNode2 != getLayoutNode()) {
            if (layoutNode != other.getLayoutNode()) {
                return layoutNode.getInnerCoordinator$ui_release();
            }
            return other;
        }
        return this;
    }

    /* JADX INFO: renamed from: fromParentPosition-MK-Hz9U, reason: not valid java name */
    public long m3181fromParentPositionMKHz9U(long position) {
        long jM4081minusNvtHpc = IntOffsetKt.m4081minusNvtHpc(position, getPosition());
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.mo3242mapOffset8S9VItk(jM4081minusNvtHpc, true) : jM4081minusNvtHpc;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate().getAlignmentLinesOwner$ui_release();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public LayoutCoordinates getCoordinates() {
        return this;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    /* JADX INFO: renamed from: getLastLayerDrawingWasSkipped$ui_release, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    /* JADX INFO: renamed from: getLastMeasurementConstraints-msEJaDk$ui_release, reason: not valid java name */
    public final long m3182getLastMeasurementConstraintsmsEJaDk$ui_release() {
        return getMeasurementConstraints();
    }

    @Nullable
    public final OwnedLayer getLayer() {
        return this.layer;
    }

    @Nullable
    protected final Function1<GraphicsLayerScope, Unit> getLayerBlock() {
        return this.layerBlock;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    @NotNull
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Nullable
    /* JADX INFO: renamed from: getLookaheadDelegate$ui_release, reason: from getter */
    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException(UnmeasuredError);
    }

    /* JADX INFO: renamed from: getMinimumTouchTargetSize-NH-jbRc, reason: not valid java name */
    public final long m3183getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo309toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo3130getMinimumTouchTargetSizeMYxV2XQ());
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @Nullable
    public final LayoutCoordinates getParentCoordinates() {
        if (isAttached()) {
            return this.wrappedBy;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates);
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    @Nullable
    public Object getParentData() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Modifier.Node tail = getTail();
        if (getLayoutNode().getNodes().m3162hasH91voCI$ui_release(NodeKind.m3199constructorimpl(64))) {
            Density density = getLayoutNode().getDensity();
            for (Modifier.Node tail2 = getLayoutNode().getNodes().getTail(); tail2 != null; tail2 = tail2.getParent()) {
                if (tail2 != tail && (NodeKind.m3199constructorimpl(64) & tail2.getKindSet()) != 0 && (tail2 instanceof ParentDataModifierNode)) {
                    ref$ObjectRef.f93280b = ((ParentDataModifierNode) tail2).modifyParentData(density, ref$ObjectRef.f93280b);
                }
            }
        }
        return ref$ObjectRef.f93280b;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @Nullable
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (isAttached()) {
            return getLayoutNode().getOuterCoordinator$ui_release().wrappedBy;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* JADX INFO: renamed from: getPosition-nOcc-ac, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @NotNull
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        LinkedHashSet linkedHashSet = null;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrapped) {
            MeasureResult measureResult = nodeCoordinator._measureResult;
            Map<AlignmentLine, Integer> alignmentLines = measureResult != null ? measureResult.getAlignmentLines() : null;
            if (alignmentLines != null && (!alignmentLines.isEmpty())) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(alignmentLines.keySet());
            }
        }
        return linkedHashSet == null ? SetsKt.emptySet() : linkedHashSet;
    }

    @NotNull
    protected final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public final long mo3015getSizeYbymL2g() {
        return getMeasuredSize();
    }

    @NotNull
    public abstract Modifier.Node getTail();

    @Nullable
    /* JADX INFO: renamed from: getWrapped$ui_release, reason: from getter */
    public final NodeCoordinator getWrapped() {
        return this.wrapped;
    }

    @Nullable
    /* JADX INFO: renamed from: getWrappedBy$ui_release, reason: from getter */
    public final NodeCoordinator getWrappedBy() {
        return this.wrappedBy;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    /* JADX INFO: renamed from: hasNode-H91voCI, reason: not valid java name */
    public final boolean m3184hasNodeH91voCI(int type) {
        Modifier.Node nodeHeadNode = headNode(NodeKindKt.m3207getIncludeSelfInTraversalH91voCI(type));
        return nodeHeadNode != null && DelegatableNodeKt.m3099has64DMado(nodeHeadNode, type);
    }

    /* JADX INFO: renamed from: head-H91voCI, reason: not valid java name */
    public final /* synthetic */ <T> T m3185headH91voCI(int type) {
        boolean zM3207getIncludeSelfInTraversalH91voCI = NodeKindKt.m3207getIncludeSelfInTraversalH91voCI(type);
        Modifier.Node tail = getTail();
        if (!zM3207getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return null;
        }
        for (Object obj = (T) headNode(zM3207getIncludeSelfInTraversalH91voCI); obj != null && (((Modifier.Node) obj).getAggregateChildKindSet() & type) != 0; obj = (T) ((Modifier.Node) obj).getChild()) {
            if ((((Modifier.Node) obj).getKindSet() & type) != 0) {
                Intrinsics.reifiedOperationMarker(2, "T");
                return (T) obj;
            }
            if (obj == tail) {
                return null;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: headUnchecked-H91voCI, reason: not valid java name */
    public final <T> T m3186headUncheckedH91voCI(int type) {
        boolean zM3207getIncludeSelfInTraversalH91voCI = NodeKindKt.m3207getIncludeSelfInTraversalH91voCI(type);
        Modifier.Node tail = getTail();
        if (!zM3207getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return null;
        }
        for (Object obj = (T) headNode(zM3207getIncludeSelfInTraversalH91voCI); obj != null && (((Modifier.Node) obj).getAggregateChildKindSet() & type) != 0; obj = (T) ((Modifier.Node) obj).getChild()) {
            if ((((Modifier.Node) obj).getKindSet() & type) != 0) {
                return (T) obj;
            }
            if (obj == tail) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: hitTest-YqVAtuI, reason: not valid java name */
    public final <T extends DelegatableNode> void m3187hitTestYqVAtuI(@NotNull HitTestSource<T> hitTestSource, long pointerPosition, @NotNull HitTestResult<T> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        Intrinsics.checkNotNullParameter(hitTestSource, "hitTestSource");
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        DelegatableNode delegatableNode = (DelegatableNode) m3186headUncheckedH91voCI(hitTestSource.mo3195entityTypeOLwlOKw());
        if (!m3193withinLayerBoundsk4lQ0M(pointerPosition)) {
            if (isTouchEvent) {
                float fM3180distanceInMinimumTouchTargettz77jQw = m3180distanceInMinimumTouchTargettz77jQw(pointerPosition, m3183getMinimumTouchTargetSizeNHjbRc());
                if (Float.isInfinite(fM3180distanceInMinimumTouchTargettz77jQw) || Float.isNaN(fM3180distanceInMinimumTouchTargettz77jQw) || !hitTestResult.isHitInMinimumTouchTargetBetter(fM3180distanceInMinimumTouchTargettz77jQw, false)) {
                    return;
                }
                m3174hitNearJHbHoSQ(delegatableNode, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, false, fM3180distanceInMinimumTouchTargettz77jQw);
                return;
            }
            return;
        }
        if (delegatableNode == null) {
            mo3121hitTestChildYqVAtuI(hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        if (m3188isPointerInBoundsk4lQ0M(pointerPosition)) {
            m3173hit1hIXUjU(delegatableNode, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        float fM3180distanceInMinimumTouchTargettz77jQw2 = !isTouchEvent ? Float.POSITIVE_INFINITY : m3180distanceInMinimumTouchTargettz77jQw(pointerPosition, m3183getMinimumTouchTargetSizeNHjbRc());
        if (Float.isInfinite(fM3180distanceInMinimumTouchTargettz77jQw2) || Float.isNaN(fM3180distanceInMinimumTouchTargettz77jQw2) || !hitTestResult.isHitInMinimumTouchTargetBetter(fM3180distanceInMinimumTouchTargettz77jQw2, isInLayer)) {
            m3176speculativeHitJHbHoSQ(delegatableNode, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, fM3180distanceInMinimumTouchTargettz77jQw2);
        } else {
            m3174hitNearJHbHoSQ(delegatableNode, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, fM3180distanceInMinimumTouchTargettz77jQw2);
        }
    }

    /* JADX INFO: renamed from: hitTestChild-YqVAtuI */
    public <T extends DelegatableNode> void mo3121hitTestChildYqVAtuI(@NotNull HitTestSource<T> hitTestSource, long pointerPosition, @NotNull HitTestResult<T> hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        Intrinsics.checkNotNullParameter(hitTestSource, "hitTestSource");
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m3187hitTestYqVAtuI(hitTestSource, nodeCoordinator.m3181fromParentPositionMKHz9U(pointerPosition), hitTestResult, isTouchEvent, isInLayer);
        }
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas) {
        invoke2(canvas);
        return Unit.f93236a;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return !this.released && getLayoutNode().isAttached();
    }

    /* JADX INFO: renamed from: isPointerInBounds-k-4lQ0M, reason: not valid java name */
    protected final boolean m3188isPointerInBoundsk4lQ0M(long pointerPosition) {
        float fM1371getXimpl = Offset.m1371getXimpl(pointerPosition);
        float fM1372getYimpl = Offset.m1372getYimpl(pointerPosition);
        return fM1371getXimpl >= 0.0f && fM1372getYimpl >= 0.0f && fM1371getXimpl < ((float) getMeasuredWidth()) && fM1372getYimpl < ((float) getMeasuredHeight());
    }

    public final boolean isTransparent() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.isTransparent();
        }
        return false;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.layer != null && isAttached();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @NotNull
    public Rect localBoundingBoxOf(@NotNull LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        if (!sourceCoordinates.isAttached()) {
            throw new IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
        }
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        MutableRect rectCache = getRectCache();
        rectCache.setLeft(0.0f);
        rectCache.setTop(0.0f);
        rectCache.setRight(IntSize.m4111getWidthimpl(sourceCoordinates.mo3015getSizeYbymL2g()));
        rectCache.setBottom(IntSize.m4110getHeightimpl(sourceCoordinates.mo3015getSizeYbymL2g()));
        NodeCoordinator nodeCoordinator = coordinator;
        while (nodeCoordinator != nodeCoordinatorFindCommonAncestor$ui_release) {
            boolean z10 = clipBounds;
            rectInParent$ui_release$default(nodeCoordinator, rectCache, z10, false, 4, null);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinator);
            clipBounds = z10;
        }
        ancestorToLocal(nodeCoordinatorFindCommonAncestor$ui_release, rectCache, clipBounds);
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-R5De75A */
    public long mo3016localPositionOfR5De75A(@NotNull LayoutCoordinates sourceCoordinates, long relativeToSource) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        while (coordinator != nodeCoordinatorFindCommonAncestor$ui_release) {
            relativeToSource = coordinator.m3191toParentPositionMKHz9U(relativeToSource);
            coordinator = coordinator.wrappedBy;
            Intrinsics.checkNotNull(coordinator);
        }
        return m3172ancestorToLocalR5De75A(nodeCoordinatorFindCommonAncestor$ui_release, relativeToSource);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToRoot-MK-Hz9U */
    public long mo3017localToRootMKHz9U(long relativeToLocal) {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            relativeToLocal = nodeCoordinator.m3191toParentPositionMKHz9U(relativeToLocal);
        }
        return relativeToLocal;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToWindow-MK-Hz9U */
    public long mo3018localToWindowMKHz9U(long relativeToLocal) {
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo3248calculatePositionInWindowMKHz9U(mo3017localToRootMKHz9U(relativeToLocal));
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void onLayoutNodeAttach() {
        onLayerBlockUpdated$default(this, this.layerBlock, false, 2, null);
    }

    protected void onMeasureResultChanged(int width, int height) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo3244resizeozmzZPI(IntSizeKt.IntSize(width, height));
        } else {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                nodeCoordinator.invalidateLayer();
            }
        }
        Owner owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.onLayoutChange(getLayoutNode());
        }
        m3044setMeasuredSizeozmzZPI(IntSizeKt.IntSize(width, height));
        graphicsLayerScope.m1886setSizeuvyYCjk(IntSizeKt.m4121toSizeozmzZPI(getMeasuredSize()));
        int iM3199constructorimpl = NodeKind.m3199constructorimpl(4);
        boolean zM3207getIncludeSelfInTraversalH91voCI = NodeKindKt.m3207getIncludeSelfInTraversalH91voCI(iM3199constructorimpl);
        Modifier.Node tail = getTail();
        if (!zM3207getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(zM3207getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM3199constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
            if ((nodeHeadNode.getKindSet() & iM3199constructorimpl) != 0 && (nodeHeadNode instanceof DrawModifierNode)) {
                ((DrawModifierNode) nodeHeadNode).onMeasureResultChanged();
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    public final void onMeasured() {
        Modifier.Node parent;
        if (m3184hasNodeH91voCI(NodeKind.m3199constructorimpl(128))) {
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    int iM3199constructorimpl = NodeKind.m3199constructorimpl(128);
                    boolean zM3207getIncludeSelfInTraversalH91voCI = NodeKindKt.m3207getIncludeSelfInTraversalH91voCI(iM3199constructorimpl);
                    if (!zM3207getIncludeSelfInTraversalH91voCI) {
                        parent = getTail().getParent();
                        if (parent == null) {
                        }
                        Unit unit = Unit.f93236a;
                        snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    }
                    parent = getTail();
                    for (Modifier.Node nodeHeadNode = headNode(zM3207getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM3199constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
                        if ((nodeHeadNode.getKindSet() & iM3199constructorimpl) != 0 && (nodeHeadNode instanceof LayoutAwareModifierNode)) {
                            ((LayoutAwareModifierNode) nodeHeadNode).mo3038onRemeasuredozmzZPI(getMeasuredSize());
                        }
                        if (nodeHeadNode == parent) {
                            break;
                        }
                    }
                    Unit unit2 = Unit.f93236a;
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                } catch (Throwable th2) {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th2;
                }
            } finally {
                snapshotCreateNonObservableSnapshot.dispose();
            }
        }
    }

    public final void onPlaced() {
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        if (lookaheadDelegate != null) {
            int iM3199constructorimpl = NodeKind.m3199constructorimpl(128);
            boolean zM3207getIncludeSelfInTraversalH91voCI = NodeKindKt.m3207getIncludeSelfInTraversalH91voCI(iM3199constructorimpl);
            Modifier.Node tail = getTail();
            if (zM3207getIncludeSelfInTraversalH91voCI || (tail = tail.getParent()) != null) {
                for (Modifier.Node nodeHeadNode = headNode(zM3207getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & iM3199constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
                    if ((nodeHeadNode.getKindSet() & iM3199constructorimpl) != 0 && (nodeHeadNode instanceof LayoutAwareModifierNode)) {
                        ((LayoutAwareModifierNode) nodeHeadNode).onLookaheadPlaced(lookaheadDelegate.getLookaheadLayoutCoordinates());
                    }
                    if (nodeHeadNode == tail) {
                        break;
                    }
                }
            }
        }
        int iM3199constructorimpl2 = NodeKind.m3199constructorimpl(128);
        boolean zM3207getIncludeSelfInTraversalH91voCI2 = NodeKindKt.m3207getIncludeSelfInTraversalH91voCI(iM3199constructorimpl2);
        Modifier.Node tail2 = getTail();
        if (!zM3207getIncludeSelfInTraversalH91voCI2 && (tail2 = tail2.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode2 = headNode(zM3207getIncludeSelfInTraversalH91voCI2); nodeHeadNode2 != null && (nodeHeadNode2.getAggregateChildKindSet() & iM3199constructorimpl2) != 0; nodeHeadNode2 = nodeHeadNode2.getChild()) {
            if ((nodeHeadNode2.getKindSet() & iM3199constructorimpl2) != 0 && (nodeHeadNode2 instanceof LayoutAwareModifierNode)) {
                ((LayoutAwareModifierNode) nodeHeadNode2).onPlaced(this);
            }
            if (nodeHeadNode2 == tail2) {
                return;
            }
        }
    }

    public final void onRelease() {
        this.released = true;
        if (this.layer != null) {
            onLayerBlockUpdated$default(this, null, false, 2, null);
        }
    }

    public void performDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.draw(canvas);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    protected final Placeable m3189performingMeasureK40F9xA(long constraints, @NotNull Function0<? extends Placeable> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        m3045setMeasurementConstraintsBRTryo0(constraints);
        Placeable placeableInvoke = block.invoke();
        OwnedLayer layer = getLayer();
        if (layer != null) {
            layer.mo3244resizeozmzZPI(getMeasuredSize());
        }
        return placeableInvoke;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo3012placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock) {
        onLayerBlockUpdated$default(this, layerBlock, false, 2, null);
        if (!IntOffset.m4068equalsimpl0(getPosition(), position)) {
            m3190setPositiongyyYBs(position);
            getLayoutNode().getLayoutDelegate().getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo3243movegyyYBs(position);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            invalidateAlignmentLinesFromPositionChange(this);
            Owner owner = getLayoutNode().getOwner();
            if (owner != null) {
                owner.onLayoutChange(getLayoutNode());
            }
        }
        this.zIndex = zIndex;
    }

    @Nullable
    public Object propagateRelocationRequest(@NotNull Rect rect, @NotNull Continuation continuation) {
        return propagateRelocationRequest$suspendImpl(this, rect, continuation);
    }

    public final void rectInParent$ui_release(@NotNull MutableRect bounds, boolean clipBounds, boolean clipToMinimumTouchTargetSize) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (clipToMinimumTouchTargetSize) {
                    long jM3183getMinimumTouchTargetSizeNHjbRc = m3183getMinimumTouchTargetSizeNHjbRc();
                    float fM1440getWidthimpl = Size.m1440getWidthimpl(jM3183getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    float fM1437getHeightimpl = Size.m1437getHeightimpl(jM3183getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    bounds.intersect(-fM1440getWidthimpl, -fM1437getHeightimpl, IntSize.m4111getWidthimpl(mo3015getSizeYbymL2g()) + fM1440getWidthimpl, IntSize.m4110getHeightimpl(mo3015getSizeYbymL2g()) + fM1437getHeightimpl);
                } else if (clipBounds) {
                    bounds.intersect(0.0f, 0.0f, IntSize.m4111getWidthimpl(mo3015getSizeYbymL2g()), IntSize.m4110getHeightimpl(mo3015getSizeYbymL2g()));
                }
                if (bounds.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(bounds, false);
        }
        float fM4069getXimpl = IntOffset.m4069getXimpl(getPosition());
        bounds.setLeft(bounds.getLeft() + fM4069getXimpl);
        bounds.setRight(bounds.getRight() + fM4069getXimpl);
        float fM4070getYimpl = IntOffset.m4070getYimpl(getPosition());
        bounds.setTop(bounds.getTop() + fM4070getYimpl);
        bounds.setBottom(bounds.getBottom() + fM4070getYimpl);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo3012placeAtf8xVGno(getPosition(), this.zIndex, this.layerBlock);
    }

    public void setMeasureResult$ui_release(@NotNull MeasureResult value) {
        Intrinsics.checkNotNullParameter(value, "value");
        MeasureResult measureResult = this._measureResult;
        if (value != measureResult) {
            this._measureResult = value;
            if (measureResult == null || value.getWidth() != measureResult.getWidth() || value.getHeight() != measureResult.getHeight()) {
                onMeasureResultChanged(value.getWidth(), value.getHeight());
            }
            Map<AlignmentLine, Integer> map = this.oldAlignmentLines;
            if (((map == null || map.isEmpty()) && value.getAlignmentLines().isEmpty()) || Intrinsics.areEqual(value.getAlignmentLines(), this.oldAlignmentLines)) {
                return;
            }
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            Map linkedHashMap = this.oldAlignmentLines;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.oldAlignmentLines = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(value.getAlignmentLines());
        }
    }

    /* JADX INFO: renamed from: setPosition--gyyYBs, reason: not valid java name */
    protected void m3190setPositiongyyYBs(long j10) {
        this.position = j10;
    }

    public final void setWrapped$ui_release(@Nullable NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    public final void setWrappedBy$ui_release(@Nullable NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    protected final void setZIndex(float f10) {
        this.zIndex = f10;
    }

    public final boolean shouldSharePointerInputWithSiblings() {
        Modifier.Node nodeHeadNode = headNode(NodeKindKt.m3207getIncludeSelfInTraversalH91voCI(NodeKind.m3199constructorimpl(16)));
        if (nodeHeadNode == null) {
            return false;
        }
        int iM3199constructorimpl = NodeKind.m3199constructorimpl(16);
        if (!nodeHeadNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        Modifier.Node node = nodeHeadNode.getNode();
        if ((node.getAggregateChildKindSet() & iM3199constructorimpl) != 0) {
            for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iM3199constructorimpl) != 0 && (child instanceof PointerInputModifierNode) && ((PointerInputModifierNode) child).sharePointerInputWithSiblings()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: toParentPosition-MK-Hz9U, reason: not valid java name */
    public long m3191toParentPositionMKHz9U(long position) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            position = ownedLayer.mo3242mapOffset8S9VItk(position, false);
        }
        return IntOffsetKt.m4083plusNvtHpc(position, getPosition());
    }

    @NotNull
    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.INSTANCE.getZero();
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect rectCache = getRectCache();
        long jM3179calculateMinimumTouchTargetPaddingE7KxVPU = m3179calculateMinimumTouchTargetPaddingE7KxVPU(m3183getMinimumTouchTargetSizeNHjbRc());
        rectCache.setLeft(-Size.m1440getWidthimpl(jM3179calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setTop(-Size.m1437getHeightimpl(jM3179calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setRight(getMeasuredWidth() + Size.m1440getWidthimpl(jM3179calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setBottom(getMeasuredHeight() + Size.m1437getHeightimpl(jM3179calculateMinimumTouchTargetPaddingE7KxVPU));
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != layoutCoordinatesFindRootCoordinates) {
            nodeCoordinator.rectInParent$ui_release(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinator);
        }
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformFrom-EL8BTi8 */
    public void mo3019transformFromEL8BTi8(@NotNull LayoutCoordinates sourceCoordinates, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        Matrix.m1818resetimpl(matrix);
        coordinator.m3178transformToAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui_release, matrix);
        m3177transformFromAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui_release, matrix);
    }

    public final void updateLayerBlock(@Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock, boolean forceLayerInvalidated) {
        boolean z10 = this.layerBlock != layerBlock || forceLayerInvalidated;
        this.layerBlock = layerBlock;
        onLayerBlockUpdated(layerBlock, z10);
    }

    protected final void updateLookaheadDelegate(@NotNull LookaheadDelegate lookaheadDelegate) {
        Intrinsics.checkNotNullParameter(lookaheadDelegate, "lookaheadDelegate");
        this.lookaheadDelegate = lookaheadDelegate;
    }

    public final void updateLookaheadScope$ui_release(@Nullable LookaheadScope scope) {
        LookaheadDelegate lookaheadDelegateCreateLookaheadDelegate = null;
        if (scope != null) {
            LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
            lookaheadDelegateCreateLookaheadDelegate = !Intrinsics.areEqual(scope, lookaheadDelegate != null ? lookaheadDelegate.getLookaheadScope() : null) ? createLookaheadDelegate(scope) : this.lookaheadDelegate;
        }
        this.lookaheadDelegate = lookaheadDelegateCreateLookaheadDelegate;
    }

    public final void visitNodes(int mask, boolean includeTail, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Modifier.Node tail = getTail();
        if (!includeTail && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(includeTail); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & mask) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
            if ((nodeHeadNode.getKindSet() & mask) != 0) {
                block.invoke(nodeHeadNode);
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: visitNodes-aLcG6gQ, reason: not valid java name */
    public final /* synthetic */ <T> void m3192visitNodesaLcG6gQ(int type, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boolean zM3207getIncludeSelfInTraversalH91voCI = NodeKindKt.m3207getIncludeSelfInTraversalH91voCI(type);
        Modifier.Node tail = getTail();
        if (!zM3207getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(zM3207getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & type) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
            if ((nodeHeadNode.getKindSet() & type) != 0) {
                Intrinsics.reifiedOperationMarker(3, "T");
                block.invoke(nodeHeadNode);
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U */
    public long mo3020windowToLocalMKHz9U(long relativeToWindow) {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        return mo3016localPositionOfR5De75A(layoutCoordinatesFindRootCoordinates, Offset.m1375minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).mo3247calculateLocalPositionMKHz9U(relativeToWindow), LayoutCoordinatesKt.positionInRoot(layoutCoordinatesFindRootCoordinates)));
    }

    protected final void withPositionTranslation(@NotNull Canvas canvas, @NotNull Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(block, "block");
        float fM4069getXimpl = IntOffset.m4069getXimpl(getPosition());
        float fM4070getYimpl = IntOffset.m4070getYimpl(getPosition());
        canvas.translate(fM4069getXimpl, fM4070getYimpl);
        block.invoke(canvas);
        canvas.translate(-fM4069getXimpl, -fM4070getYimpl);
    }

    /* JADX INFO: renamed from: withinLayerBounds-k-4lQ0M, reason: not valid java name */
    protected final boolean m3193withinLayerBoundsk4lQ0M(long pointerPosition) {
        if (!OffsetKt.m1388isFinitek4lQ0M(pointerPosition)) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer == null || !this.isClipping || ownedLayer.mo3241isInLayerk4lQ0M(pointerPosition);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(@NotNull final Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!getLayoutNode().getIsPlaced()) {
            this.lastLayerDrawingWasSkipped = true;
        } else {
            getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayer, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator.invoke.1
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
                    NodeCoordinator.this.drawContainedDrawModifiers(canvas);
                }
            });
            this.lastLayerDrawingWasSkipped = false;
        }
    }
}
