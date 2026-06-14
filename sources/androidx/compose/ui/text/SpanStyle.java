package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.my.target.common.menu.MenuActionType;
import io.appmetrica.analytics.impl.H2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001Bª\u0001\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bø\u0001\u0000¢\u0006\u0002\u0010\u001cB¶\u0001\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eø\u0001\u0000¢\u0006\u0002\u0010\u001fBÂ\u0001\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!ø\u0001\u0000¢\u0006\u0002\u0010\"BÌ\u0001\b\u0017\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020&\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!ø\u0001\u0000¢\u0006\u0002\u0010'BÀ\u0001\b\u0000\u0012\u0006\u0010(\u001a\u00020)\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!ø\u0001\u0000¢\u0006\u0002\u0010*J×\u0001\u0010S\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ³\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ¿\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bX\u0010YJÍ\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bZ\u0010[J\u0013\u0010\\\u001a\u00020]2\b\u0010^\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0015\u0010_\u001a\u00020]2\u0006\u0010^\u001a\u00020\u0000H\u0000¢\u0006\u0002\b`J\u0010\u0010a\u001a\u00020]2\u0006\u0010^\u001a\u00020\u0000H\u0002J\b\u0010b\u001a\u00020cH\u0016J\r\u0010d\u001a\u00020cH\u0000¢\u0006\u0002\beJ\u0014\u0010f\u001a\u00020\u00002\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u0000H\u0007J\u0014\u0010g\u001a\u0004\u0018\u00010\u001e2\b\u0010^\u001a\u0004\u0018\u00010\u001eH\u0002J\u0011\u0010h\u001a\u00020\u00002\u0006\u0010^\u001a\u00020\u0000H\u0087\u0002J\b\u0010i\u001a\u00020\u000fH\u0016R\u001a\u0010%\u001a\u00020&8GX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0017\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001c\u0010#\u001a\u0004\u0018\u00010$8GX\u0087\u0004¢\u0006\f\u0012\u0004\b4\u0010,\u001a\u0004\b5\u00106R\u001a\u0010\u0002\u001a\u00020\u00038Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b7\u00100R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010,\u001a\u0004\b9\u0010:R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u00101\u001a\u0004\b?\u00100R\u001c\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u001c\u0010\u0010\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u00101\u001a\u0004\bF\u00100R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0014\u0010(\u001a\u00020)X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010R\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006j"}, d2 = {"Landroidx/compose/ui/text/SpanStyle;", "", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", H2.f75840g, "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "platformStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "textForegroundStyle", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "(Landroidx/compose/ui/text/style/TextForegroundStyle;JLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlpha$annotations", "()V", "getAlpha", "()F", "getBackground-0d7_KjU", "()J", "J", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "getBrush$annotations", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getColor-0d7_KjU", "getDrawStyle$annotations", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontFeatureSettings", "()Ljava/lang/String;", "getFontSize-XSAIIZE", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getLetterSpacing-XSAIIZE", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformSpanStyle;", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "getTextForegroundStyle$ui_text_release", "()Landroidx/compose/ui/text/style/TextForegroundStyle;", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", MenuActionType.COPY, "copy-NcG25M8", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "copy-IuqyXdg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;)Landroidx/compose/ui/text/SpanStyle;", "copy-2BkPm_w", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;)Landroidx/compose/ui/text/SpanStyle;", "copy-GSF8kmg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "equals", "", "other", "hasSameLayoutAffectingAttributes", "hasSameLayoutAffectingAttributes$ui_text_release", "hasSameNonLayoutAttributes", "hashCode", "", "hashCodeLayoutAffectingAttributes", "hashCodeLayoutAffectingAttributes$ui_text_release", "merge", "mergePlatformStyle", "plus", "toString", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SpanStyle {
    public static final int $stable = 0;
    private final long background;

    @Nullable
    private final BaselineShift baselineShift;

    @Nullable
    private final DrawStyle drawStyle;

    @Nullable
    private final FontFamily fontFamily;

    @Nullable
    private final String fontFeatureSettings;
    private final long fontSize;

    @Nullable
    private final FontStyle fontStyle;

    @Nullable
    private final FontSynthesis fontSynthesis;

    @Nullable
    private final FontWeight fontWeight;
    private final long letterSpacing;

    @Nullable
    private final LocaleList localeList;

    @Nullable
    private final PlatformSpanStyle platformStyle;

    @Nullable
    private final Shadow shadow;

    @Nullable
    private final TextDecoration textDecoration;

    @NotNull
    private final TextForegroundStyle textForegroundStyle;

    @Nullable
    private final TextGeometricTransform textGeometricTransform;

    @ExperimentalTextApi
    public /* synthetic */ SpanStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    /* JADX INFO: renamed from: copy-GSF8kmg$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m3454copyGSF8kmg$default(SpanStyle spanStyle, long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i10, Object obj) {
        long jM3463getColor0d7_KjU = (i10 & 1) != 0 ? spanStyle.m3463getColor0d7_KjU() : j10;
        return spanStyle.m3458copyGSF8kmg(jM3463getColor0d7_KjU, (i10 & 2) != 0 ? spanStyle.fontSize : j11, (i10 & 4) != 0 ? spanStyle.fontWeight : fontWeight, (i10 & 8) != 0 ? spanStyle.fontStyle : fontStyle, (i10 & 16) != 0 ? spanStyle.fontSynthesis : fontSynthesis, (i10 & 32) != 0 ? spanStyle.fontFamily : fontFamily, (i10 & 64) != 0 ? spanStyle.fontFeatureSettings : str, (i10 & 128) != 0 ? spanStyle.letterSpacing : j12, (i10 & 256) != 0 ? spanStyle.baselineShift : baselineShift, (i10 & 512) != 0 ? spanStyle.textGeometricTransform : textGeometricTransform, (i10 & 1024) != 0 ? spanStyle.localeList : localeList, (i10 & 2048) != 0 ? spanStyle.background : j13, (i10 & 4096) != 0 ? spanStyle.textDecoration : textDecoration, (i10 & 8192) != 0 ? spanStyle.shadow : shadow, (i10 & 16384) != 0 ? spanStyle.platformStyle : platformSpanStyle, (i10 & 32768) != 0 ? spanStyle.drawStyle : drawStyle);
    }

    /* JADX INFO: renamed from: copy-NcG25M8$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m3456copyNcG25M8$default(SpanStyle spanStyle, Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i10, Object obj) {
        DrawStyle drawStyle2;
        PlatformSpanStyle platformSpanStyle2;
        long j13;
        long j14;
        TextDecoration textDecoration2;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        FontFamily fontFamily2;
        String str2;
        long j15;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        Shadow shadow2;
        float alpha = (i10 & 2) != 0 ? spanStyle.getAlpha() : f10;
        long j16 = (i10 & 4) != 0 ? spanStyle.fontSize : j10;
        FontWeight fontWeight3 = (i10 & 8) != 0 ? spanStyle.fontWeight : fontWeight;
        FontStyle fontStyle3 = (i10 & 16) != 0 ? spanStyle.fontStyle : fontStyle;
        FontSynthesis fontSynthesis3 = (i10 & 32) != 0 ? spanStyle.fontSynthesis : fontSynthesis;
        FontFamily fontFamily3 = (i10 & 64) != 0 ? spanStyle.fontFamily : fontFamily;
        String str3 = (i10 & 128) != 0 ? spanStyle.fontFeatureSettings : str;
        long j17 = (i10 & 256) != 0 ? spanStyle.letterSpacing : j11;
        BaselineShift baselineShift3 = (i10 & 512) != 0 ? spanStyle.baselineShift : baselineShift;
        TextGeometricTransform textGeometricTransform3 = (i10 & 1024) != 0 ? spanStyle.textGeometricTransform : textGeometricTransform;
        LocaleList localeList3 = (i10 & 2048) != 0 ? spanStyle.localeList : localeList;
        float f11 = alpha;
        long j18 = j16;
        long j19 = (i10 & 4096) != 0 ? spanStyle.background : j12;
        TextDecoration textDecoration3 = (i10 & 8192) != 0 ? spanStyle.textDecoration : textDecoration;
        Shadow shadow3 = (i10 & 16384) != 0 ? spanStyle.shadow : shadow;
        PlatformSpanStyle platformSpanStyle3 = (i10 & 32768) != 0 ? spanStyle.platformStyle : platformSpanStyle;
        if ((i10 & 65536) != 0) {
            platformSpanStyle2 = platformSpanStyle3;
            drawStyle2 = spanStyle.drawStyle;
            j14 = j19;
            textDecoration2 = textDecoration3;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyle3;
            fontSynthesis2 = fontSynthesis3;
            fontFamily2 = fontFamily3;
            str2 = str3;
            j15 = j17;
            baselineShift2 = baselineShift3;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            shadow2 = shadow3;
            j13 = j18;
        } else {
            drawStyle2 = drawStyle;
            platformSpanStyle2 = platformSpanStyle3;
            j13 = j18;
            j14 = j19;
            textDecoration2 = textDecoration3;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyle3;
            fontSynthesis2 = fontSynthesis3;
            fontFamily2 = fontFamily3;
            str2 = str3;
            j15 = j17;
            baselineShift2 = baselineShift3;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            shadow2 = shadow3;
        }
        return spanStyle.m3460copyNcG25M8(brush, f11, j13, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j15, baselineShift2, textGeometricTransform2, localeList2, j14, textDecoration2, shadow2, platformSpanStyle2, drawStyle2);
    }

    @ExperimentalTextApi
    public static /* synthetic */ void getAlpha$annotations() {
    }

    @ExperimentalTextApi
    public static /* synthetic */ void getBrush$annotations() {
    }

    @ExperimentalTextApi
    public static /* synthetic */ void getDrawStyle$annotations() {
    }

    private final boolean hasSameNonLayoutAttributes(SpanStyle other) {
        return Intrinsics.areEqual(this.textForegroundStyle, other.textForegroundStyle) && Intrinsics.areEqual(this.textDecoration, other.textDecoration) && Intrinsics.areEqual(this.shadow, other.shadow) && Intrinsics.areEqual(this.drawStyle, other.drawStyle);
    }

    public static /* synthetic */ SpanStyle merge$default(SpanStyle spanStyle, SpanStyle spanStyle2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            spanStyle2 = null;
        }
        return spanStyle.merge(spanStyle2);
    }

    private final PlatformSpanStyle mergePlatformStyle(PlatformSpanStyle other) {
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        return platformSpanStyle == null ? other : other == null ? platformSpanStyle : platformSpanStyle.merge(other);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-2BkPm_w, reason: not valid java name */
    public final SpanStyle m3457copy2BkPm_w(long color, long fontSize, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String fontFeatureSettings, long letterSpacing, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long background, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable PlatformSpanStyle platformStyle) {
        return new SpanStyle(Color.m1605equalsimpl0(color, m3463getColor0d7_KjU()) ? this.textForegroundStyle : TextForegroundStyle.INSTANCE.m3876from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, (DrawStyle) null, 32768, (DefaultConstructorMarker) null);
    }

    @ExperimentalTextApi
    @NotNull
    /* JADX INFO: renamed from: copy-GSF8kmg, reason: not valid java name */
    public final SpanStyle m3458copyGSF8kmg(long color, long fontSize, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String fontFeatureSettings, long letterSpacing, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long background, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable PlatformSpanStyle platformStyle, @Nullable DrawStyle drawStyle) {
        return new SpanStyle(Color.m1605equalsimpl0(color, m3463getColor0d7_KjU()) ? this.textForegroundStyle : TextForegroundStyle.INSTANCE.m3876from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-IuqyXdg, reason: not valid java name */
    public final SpanStyle m3459copyIuqyXdg(long color, long fontSize, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String fontFeatureSettings, long letterSpacing, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long background, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow) {
        return new SpanStyle(Color.m1605equalsimpl0(color, m3463getColor0d7_KjU()) ? this.textForegroundStyle : TextForegroundStyle.INSTANCE.m3876from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, this.platformStyle, this.drawStyle, (DefaultConstructorMarker) null);
    }

    @ExperimentalTextApi
    @NotNull
    /* JADX INFO: renamed from: copy-NcG25M8, reason: not valid java name */
    public final SpanStyle m3460copyNcG25M8(@Nullable Brush brush, float alpha, long fontSize, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String fontFeatureSettings, long letterSpacing, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long background, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable PlatformSpanStyle platformStyle, @Nullable DrawStyle drawStyle) {
        return new SpanStyle(TextForegroundStyle.INSTANCE.from(brush, alpha), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) other;
        return hasSameLayoutAffectingAttributes$ui_text_release(spanStyle) && hasSameNonLayoutAttributes(spanStyle);
    }

    @ExperimentalTextApi
    public final float getAlpha() {
        return this.textForegroundStyle.getAlpha();
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackground() {
        return this.background;
    }

    @Nullable
    /* JADX INFO: renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name and from getter */
    public final BaselineShift getBaselineShift() {
        return this.baselineShift;
    }

    @ExperimentalTextApi
    @Nullable
    public final Brush getBrush() {
        return this.textForegroundStyle.getBrush();
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m3463getColor0d7_KjU() {
        return this.textForegroundStyle.mo3760getColor0d7_KjU();
    }

    @ExperimentalTextApi
    @Nullable
    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    @Nullable
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Nullable
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* JADX INFO: renamed from: getFontSize-XSAIIZE, reason: not valid java name and from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    @Nullable
    /* JADX INFO: renamed from: getFontStyle-4Lr2A7w, reason: not valid java name and from getter */
    public final FontStyle getFontStyle() {
        return this.fontStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name and from getter */
    public final FontSynthesis getFontSynthesis() {
        return this.fontSynthesis;
    }

    @Nullable
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name and from getter */
    public final long getLetterSpacing() {
        return this.letterSpacing;
    }

    @Nullable
    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    @Nullable
    public final PlatformSpanStyle getPlatformStyle() {
        return this.platformStyle;
    }

    @Nullable
    public final Shadow getShadow() {
        return this.shadow;
    }

    @Nullable
    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    @NotNull
    /* JADX INFO: renamed from: getTextForegroundStyle$ui_text_release, reason: from getter */
    public final TextForegroundStyle getTextForegroundStyle() {
        return this.textForegroundStyle;
    }

    @Nullable
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final boolean hasSameLayoutAffectingAttributes$ui_text_release(@NotNull SpanStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (this == other) {
            return true;
        }
        return TextUnit.m4129equalsimpl0(this.fontSize, other.fontSize) && Intrinsics.areEqual(this.fontWeight, other.fontWeight) && Intrinsics.areEqual(this.fontStyle, other.fontStyle) && Intrinsics.areEqual(this.fontSynthesis, other.fontSynthesis) && Intrinsics.areEqual(this.fontFamily, other.fontFamily) && Intrinsics.areEqual(this.fontFeatureSettings, other.fontFeatureSettings) && TextUnit.m4129equalsimpl0(this.letterSpacing, other.letterSpacing) && Intrinsics.areEqual(this.baselineShift, other.baselineShift) && Intrinsics.areEqual(this.textGeometricTransform, other.textGeometricTransform) && Intrinsics.areEqual(this.localeList, other.localeList) && Color.m1605equalsimpl0(this.background, other.background) && Intrinsics.areEqual(this.platformStyle, other.platformStyle);
    }

    public int hashCode() {
        int iM1611hashCodeimpl = Color.m1611hashCodeimpl(m3463getColor0d7_KjU()) * 31;
        Brush brush = getBrush();
        int iHashCode = (((((iM1611hashCodeimpl + (brush != null ? brush.hashCode() : 0)) * 31) + Float.floatToIntBits(getAlpha())) * 31) + TextUnit.m4133hashCodeimpl(this.fontSize)) * 31;
        FontWeight fontWeight = this.fontWeight;
        int iHashCode2 = (iHashCode + (fontWeight != null ? fontWeight.hashCode() : 0)) * 31;
        FontStyle fontStyle = this.fontStyle;
        int iM3589hashCodeimpl = (iHashCode2 + (fontStyle != null ? FontStyle.m3589hashCodeimpl(fontStyle.m3591unboximpl()) : 0)) * 31;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        int iM3598hashCodeimpl = (iM3589hashCodeimpl + (fontSynthesis != null ? FontSynthesis.m3598hashCodeimpl(fontSynthesis.getValue()) : 0)) * 31;
        FontFamily fontFamily = this.fontFamily;
        int iHashCode3 = (iM3598hashCodeimpl + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iHashCode4 = (((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + TextUnit.m4133hashCodeimpl(this.letterSpacing)) * 31;
        BaselineShift baselineShift = this.baselineShift;
        int iM3750hashCodeimpl = (iHashCode4 + (baselineShift != null ? BaselineShift.m3750hashCodeimpl(baselineShift.m3752unboximpl()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode5 = (iM3750hashCodeimpl + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int iHashCode6 = (((iHashCode5 + (localeList != null ? localeList.hashCode() : 0)) * 31) + Color.m1611hashCodeimpl(this.background)) * 31;
        TextDecoration textDecoration = this.textDecoration;
        int iHashCode7 = (iHashCode6 + (textDecoration != null ? textDecoration.hashCode() : 0)) * 31;
        Shadow shadow = this.shadow;
        int iHashCode8 = (iHashCode7 + (shadow != null ? shadow.hashCode() : 0)) * 31;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        int iHashCode9 = (iHashCode8 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0)) * 31;
        DrawStyle drawStyle = this.drawStyle;
        return iHashCode9 + (drawStyle != null ? drawStyle.hashCode() : 0);
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int iM4133hashCodeimpl = TextUnit.m4133hashCodeimpl(this.fontSize) * 31;
        FontWeight fontWeight = this.fontWeight;
        int iHashCode = (iM4133hashCodeimpl + (fontWeight != null ? fontWeight.hashCode() : 0)) * 31;
        FontStyle fontStyle = this.fontStyle;
        int iM3589hashCodeimpl = (iHashCode + (fontStyle != null ? FontStyle.m3589hashCodeimpl(fontStyle.m3591unboximpl()) : 0)) * 31;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        int iM3598hashCodeimpl = (iM3589hashCodeimpl + (fontSynthesis != null ? FontSynthesis.m3598hashCodeimpl(fontSynthesis.getValue()) : 0)) * 31;
        FontFamily fontFamily = this.fontFamily;
        int iHashCode2 = (iM3598hashCodeimpl + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + TextUnit.m4133hashCodeimpl(this.letterSpacing)) * 31;
        BaselineShift baselineShift = this.baselineShift;
        int iM3750hashCodeimpl = (iHashCode3 + (baselineShift != null ? BaselineShift.m3750hashCodeimpl(baselineShift.m3752unboximpl()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode4 = (iM3750hashCodeimpl + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int iHashCode5 = (((iHashCode4 + (localeList != null ? localeList.hashCode() : 0)) * 31) + Color.m1611hashCodeimpl(this.background)) * 31;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        return iHashCode5 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0);
    }

    @Stable
    @NotNull
    public final SpanStyle merge(@Nullable SpanStyle other) {
        if (other == null) {
            return this;
        }
        TextForegroundStyle textForegroundStyleMerge = this.textForegroundStyle.merge(other.textForegroundStyle);
        FontFamily fontFamily = other.fontFamily;
        if (fontFamily == null) {
            fontFamily = this.fontFamily;
        }
        FontFamily fontFamily2 = fontFamily;
        long j10 = !TextUnitKt.m4150isUnspecifiedR2X_6o(other.fontSize) ? other.fontSize : this.fontSize;
        FontWeight fontWeight = other.fontWeight;
        if (fontWeight == null) {
            fontWeight = this.fontWeight;
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyle = other.fontStyle;
        if (fontStyle == null) {
            fontStyle = this.fontStyle;
        }
        FontStyle fontStyle2 = fontStyle;
        FontSynthesis fontSynthesis = other.fontSynthesis;
        if (fontSynthesis == null) {
            fontSynthesis = this.fontSynthesis;
        }
        FontSynthesis fontSynthesis2 = fontSynthesis;
        String str = other.fontFeatureSettings;
        if (str == null) {
            str = this.fontFeatureSettings;
        }
        String str2 = str;
        long j11 = !TextUnitKt.m4150isUnspecifiedR2X_6o(other.letterSpacing) ? other.letterSpacing : this.letterSpacing;
        BaselineShift baselineShift = other.baselineShift;
        if (baselineShift == null) {
            baselineShift = this.baselineShift;
        }
        BaselineShift baselineShift2 = baselineShift;
        TextGeometricTransform textGeometricTransform = other.textGeometricTransform;
        if (textGeometricTransform == null) {
            textGeometricTransform = this.textGeometricTransform;
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = other.localeList;
        if (localeList == null) {
            localeList = this.localeList;
        }
        LocaleList localeList2 = localeList;
        long j12 = other.background;
        if (j12 == Color.INSTANCE.m1640getUnspecified0d7_KjU()) {
            j12 = this.background;
        }
        long j13 = j12;
        TextDecoration textDecoration = other.textDecoration;
        if (textDecoration == null) {
            textDecoration = this.textDecoration;
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = other.shadow;
        if (shadow == null) {
            shadow = this.shadow;
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformSpanStyleMergePlatformStyle = mergePlatformStyle(other.platformStyle);
        DrawStyle drawStyle = other.drawStyle;
        if (drawStyle == null) {
            drawStyle = this.drawStyle;
        }
        return new SpanStyle(textForegroundStyleMerge, j10, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j11, baselineShift2, textGeometricTransform2, localeList2, j13, textDecoration2, shadow2, platformSpanStyleMergePlatformStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    @Stable
    @NotNull
    public final SpanStyle plus(@NotNull SpanStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return merge(other);
    }

    @NotNull
    public String toString() {
        return "SpanStyle(color=" + ((Object) Color.m1612toStringimpl(m3463getColor0d7_KjU())) + ", brush=" + getBrush() + ", alpha=" + getAlpha() + ", fontSize=" + ((Object) TextUnit.m4139toStringimpl(this.fontSize)) + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ", fontSynthesis=" + this.fontSynthesis + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", letterSpacing=" + ((Object) TextUnit.m4139toStringimpl(this.letterSpacing)) + ", baselineShift=" + this.baselineShift + ", textGeometricTransform=" + this.textGeometricTransform + ", localeList=" + this.localeList + ", background=" + ((Object) Color.m1612toStringimpl(this.background)) + ", textDecoration=" + this.textDecoration + ", shadow=" + this.shadow + ", platformStyle=" + this.platformStyle + ", drawStyle=" + this.drawStyle + ')';
    }

    public /* synthetic */ SpanStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformSpanStyle);
    }

    public /* synthetic */ SpanStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow);
    }

    @ExperimentalTextApi
    public /* synthetic */ SpanStyle(Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, f10, j10, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j11, baselineShift, textGeometricTransform, localeList, j12, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(textForegroundStyle, j10, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j11, baselineShift, textGeometricTransform, localeList, j12, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    private SpanStyle(TextForegroundStyle textForegroundStyle, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this.textForegroundStyle = textForegroundStyle;
        this.fontSize = j10;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = str;
        this.letterSpacing = j11;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j12;
        this.textDecoration = textDecoration;
        this.shadow = shadow;
        this.platformStyle = platformSpanStyle;
        this.drawStyle = drawStyle;
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(textForegroundStyle, (i10 & 2) != 0 ? TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE() : j10, (i10 & 4) != 0 ? null : fontWeight, (i10 & 8) != 0 ? null : fontStyle, (i10 & 16) != 0 ? null : fontSynthesis, (i10 & 32) != 0 ? null : fontFamily, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE() : j11, (i10 & 256) != 0 ? null : baselineShift, (i10 & 512) != 0 ? null : textGeometricTransform, (i10 & 1024) != 0 ? null : localeList, (i10 & 2048) != 0 ? Color.INSTANCE.m1640getUnspecified0d7_KjU() : j12, (i10 & 4096) != 0 ? null : textDecoration, (i10 & 8192) != 0 ? null : shadow, (i10 & 16384) != 0 ? null : platformSpanStyle, (i10 & 32768) != 0 ? null : drawStyle, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SpanStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        long jM1640getUnspecified0d7_KjU = (i10 & 1) != 0 ? Color.INSTANCE.m1640getUnspecified0d7_KjU() : j10;
        long jM4143getUnspecifiedXSAIIZE = (i10 & 2) != 0 ? TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i10 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i10 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i10 & 32) != 0 ? null : fontFamily;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jM4143getUnspecifiedXSAIIZE2 = (i10 & 128) != 0 ? TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE() : j12;
        BaselineShift baselineShift2 = (i10 & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? null : localeList;
        long jM1640getUnspecified0d7_KjU2 = (i10 & 2048) != 0 ? Color.INSTANCE.m1640getUnspecified0d7_KjU() : j13;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j14 = jM4143getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j15 = jM1640getUnspecified0d7_KjU2;
        this(jM1640getUnspecified0d7_KjU, jM4143getUnspecifiedXSAIIZE, fontWeight2, fontStyle3, fontSynthesis3, fontFamily3, str3, j14, baselineShift3, textGeometricTransform3, localeList3, j15, (i10 & 4096) != 0 ? null : textDecoration, (i10 & 8192) != 0 ? null : shadow, (DefaultConstructorMarker) null);
    }

    private SpanStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow) {
        this(TextForegroundStyle.INSTANCE.m3876from8_81llA(j10), j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, (PlatformSpanStyle) null, (DrawStyle) null, 32768, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SpanStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        long jM1640getUnspecified0d7_KjU = (i10 & 1) != 0 ? Color.INSTANCE.m1640getUnspecified0d7_KjU() : j10;
        long jM4143getUnspecifiedXSAIIZE = (i10 & 2) != 0 ? TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i10 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i10 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i10 & 32) != 0 ? null : fontFamily;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jM4143getUnspecifiedXSAIIZE2 = (i10 & 128) != 0 ? TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE() : j12;
        BaselineShift baselineShift2 = (i10 & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? null : localeList;
        long jM1640getUnspecified0d7_KjU2 = (i10 & 2048) != 0 ? Color.INSTANCE.m1640getUnspecified0d7_KjU() : j13;
        TextDecoration textDecoration2 = (i10 & 4096) != 0 ? null : textDecoration;
        long j14 = jM1640getUnspecified0d7_KjU;
        long j15 = jM4143getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j16 = jM4143getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j17 = jM1640getUnspecified0d7_KjU2;
        this(j14, j15, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j16, baselineShift3, textGeometricTransform3, localeList3, j17, textDecoration3, (i10 & 8192) != 0 ? null : shadow, (i10 & 16384) != 0 ? null : platformSpanStyle, (DefaultConstructorMarker) null);
    }

    private SpanStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle) {
        this(TextForegroundStyle.INSTANCE.m3876from8_81llA(j10), j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformSpanStyle, (DrawStyle) null, 32768, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SpanStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        long jM1640getUnspecified0d7_KjU = (i10 & 1) != 0 ? Color.INSTANCE.m1640getUnspecified0d7_KjU() : j10;
        long jM4143getUnspecifiedXSAIIZE = (i10 & 2) != 0 ? TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? null : fontWeight;
        FontStyle fontStyle2 = (i10 & 8) != 0 ? null : fontStyle;
        FontSynthesis fontSynthesis2 = (i10 & 16) != 0 ? null : fontSynthesis;
        FontFamily fontFamily2 = (i10 & 32) != 0 ? null : fontFamily;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jM4143getUnspecifiedXSAIIZE2 = (i10 & 128) != 0 ? TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE() : j12;
        BaselineShift baselineShift2 = (i10 & 256) != 0 ? null : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? null : localeList;
        long jM1640getUnspecified0d7_KjU2 = (i10 & 2048) != 0 ? Color.INSTANCE.m1640getUnspecified0d7_KjU() : j13;
        TextDecoration textDecoration2 = (i10 & 4096) != 0 ? null : textDecoration;
        long j14 = jM1640getUnspecified0d7_KjU;
        Shadow shadow2 = (i10 & 8192) != 0 ? null : shadow;
        PlatformSpanStyle platformSpanStyle2 = (i10 & 16384) != 0 ? null : platformSpanStyle;
        long j15 = jM4143getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j16 = jM4143getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j17 = jM1640getUnspecified0d7_KjU2;
        this(j14, j15, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j16, baselineShift3, textGeometricTransform3, localeList3, j17, textDecoration3, shadow2, platformSpanStyle2, (i10 & 32768) != 0 ? null : drawStyle, (DefaultConstructorMarker) null);
    }

    private SpanStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.INSTANCE.m3876from8_81llA(j10), j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformSpanStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ SpanStyle(Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, (i10 & 2) != 0 ? Float.NaN : f10, (i10 & 4) != 0 ? TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : fontWeight, (i10 & 16) != 0 ? null : fontStyle, (i10 & 32) != 0 ? null : fontSynthesis, (i10 & 64) != 0 ? null : fontFamily, (i10 & 128) != 0 ? null : str, (i10 & 256) != 0 ? TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE() : j11, (i10 & 512) != 0 ? null : baselineShift, (i10 & 1024) != 0 ? null : textGeometricTransform, (i10 & 2048) != 0 ? null : localeList, (i10 & 4096) != 0 ? Color.INSTANCE.m1640getUnspecified0d7_KjU() : j12, (i10 & 8192) != 0 ? null : textDecoration, (i10 & 16384) != 0 ? null : shadow, (32768 & i10) != 0 ? null : platformSpanStyle, (i10 & 65536) != 0 ? null : drawStyle, (DefaultConstructorMarker) null);
    }

    private SpanStyle(Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.INSTANCE.from(brush, f10), j10, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j11, baselineShift, textGeometricTransform, localeList, j12, textDecoration, shadow, platformSpanStyle, drawStyle, (DefaultConstructorMarker) null);
    }
}
