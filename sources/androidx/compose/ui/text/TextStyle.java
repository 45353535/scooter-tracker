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
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.webkit.Profile;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import io.appmetrica.analytics.impl.H2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\bG\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u008f\u00012\u00020\u0001:\u0002\u008f\u0001B\u0017\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006BØ\u0001\b\u0017\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'ø\u0001\u0000¢\u0006\u0002\u0010(Bð\u0001\b\u0017\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,ø\u0001\u0000¢\u0006\u0002\u0010-B\u0088\u0002\b\u0016\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101ø\u0001\u0000¢\u0006\u0002\u00102B \u0002\b\u0017\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106ø\u0001\u0000¢\u0006\u0002\u00107Bª\u0002\b\u0017\u0012\b\u00108\u001a\u0004\u0018\u000109\u0012\b\b\u0002\u0010:\u001a\u00020;\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106ø\u0001\u0000¢\u0006\u0002\u0010<B#\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*¢\u0006\u0002\u0010=Jµ\u0002\u0010w\u001a\u00020\u00002\b\u00108\u001a\u0004\u0018\u0001092\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00105\u001a\u0004\u0018\u000106H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bx\u0010yJ«\u0002\u0010w\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00105\u001a\u0004\u0018\u000106H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bz\u0010{Jã\u0001\u0010w\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b|\u0010}Jû\u0001\u0010w\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b~\u0010\u007fJ\u0093\u0002\u0010w\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u000101ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0016\u0010\u0082\u0001\u001a\u00030\u0083\u00012\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0011\u0010\u0085\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u0000J\n\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0016J\u0010\u0010\u0088\u0001\u001a\u00030\u0087\u0001H\u0000¢\u0006\u0003\b\u0089\u0001J\u0012\u0010\u008a\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0005H\u0007J\u0012\u0010\u008a\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0003H\u0007J\u0016\u0010\u008a\u0001\u001a\u00020\u00002\u000b\b\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0000H\u0007J\u0013\u0010\u008b\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0005H\u0087\u0002J\u0013\u0010\u008b\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0003H\u0087\u0002J\u0013\u0010\u008b\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0000H\u0087\u0002J\t\u0010\u008c\u0001\u001a\u00020\u0005H\u0007J\t\u0010\u008d\u0001\u001a\u00020\u0003H\u0007J\t\u0010\u008e\u0001\u001a\u00020\u0014H\u0016R\u001a\u0010:\u001a\u00020;8GX\u0087\u0004¢\u0006\f\u0012\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\u001c\u001a\u00020\b8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bB\u0010CR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00178Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001c\u00108\u001a\u0004\u0018\u0001098GX\u0087\u0004¢\u0006\f\u0012\u0004\bF\u0010?\u001a\u0004\bG\u0010HR\u001a\u0010\u0007\u001a\u00020\b8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bI\u0010CR\u001c\u00103\u001a\u0004\u0018\u0001048GX\u0087\u0004¢\u0006\f\u0012\u0004\bJ\u0010?\u001a\u0004\bK\u0010LR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u001a\u0010\t\u001a\u00020\n8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bQ\u0010CR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000e8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bR\u0010SR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00108Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u001c\u00100\u001a\u0004\u0018\u0001018Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bX\u0010YR\u001a\u0010\u0015\u001a\u00020\n8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bZ\u0010CR\u001c\u0010.\u001a\u0004\u0018\u00010/8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u001a\u0010%\u001a\u00020\n8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b]\u0010CR\u0013\u0010+\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u001c\u0010!\u001a\u0004\u0018\u00010\"8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u001c\u0010#\u001a\u0004\u0018\u00010$8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0013\u0010&\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\br\u0010sR\u001c\u00105\u001a\u0004\u0018\u0001068GX\u0087\u0004¢\u0006\f\u0012\u0004\bt\u0010?\u001a\u0004\bu\u0010v\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0090\u0001"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", "", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "paragraphStyle", "Landroidx/compose/ui/text/ParagraphStyle;", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;)V", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", H2.f75840g, "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "platformStyle", "Landroidx/compose/ui/text/PlatformTextStyle;", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "lineBreak", "Landroidx/compose/ui/text/style/LineBreak;", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/text/PlatformTextStyle;)V", "getAlpha$annotations", "()V", "getAlpha", "()F", "getBackground-0d7_KjU", "()J", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "getBrush$annotations", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getColor-0d7_KjU", "getDrawStyle$annotations", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontFeatureSettings", "()Ljava/lang/String;", "getFontSize-XSAIIZE", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getHyphens-EaSxIns", "()Landroidx/compose/ui/text/style/Hyphens;", "getLetterSpacing-XSAIIZE", "getLineBreak-LgCVezo", "()Landroidx/compose/ui/text/style/LineBreak;", "getLineHeight-XSAIIZE", "getLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "getParagraphStyle$ui_text_release", "()Landroidx/compose/ui/text/ParagraphStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformTextStyle;", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "getSpanStyle$ui_text_release", "()Landroidx/compose/ui/text/SpanStyle;", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "getTextMotion$annotations", "getTextMotion", "()Landroidx/compose/ui/text/style/TextMotion;", MenuActionType.COPY, "copy-aIRg9q4", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-v2rsoow", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-HL5avdY", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/TextStyle;", "copy-NOaFTUo", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;)Landroidx/compose/ui/text/TextStyle;", "copy-CXVQc50", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;)Landroidx/compose/ui/text/TextStyle;", "equals", "", "other", "hasSameLayoutAffectingAttributes", "hashCode", "", "hashCodeLayoutAffectingAttributes", "hashCodeLayoutAffectingAttributes$ui_text_release", "merge", "plus", "toParagraphStyle", "toSpanStyle", "toString", y.f66058y, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextStyle {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final TextStyle Default = new TextStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4194303, (DefaultConstructorMarker) null);

    @NotNull
    private final ParagraphStyle paragraphStyle;

    @Nullable
    private final PlatformTextStyle platformStyle;

    @NotNull
    private final SpanStyle spanStyle;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/TextStyle$Companion;", "", "()V", Profile.DEFAULT_PROFILE_NAME, "Landroidx/compose/ui/text/TextStyle;", "getDefault$annotations", "getDefault", "()Landroidx/compose/ui/text/TextStyle;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }

        @NotNull
        public final TextStyle getDefault() {
            return TextStyle.Default;
        }

        private Companion() {
        }
    }

    @ExperimentalTextApi
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, drawStyle, textAlign, textDirection, j14, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    /* JADX INFO: renamed from: copy-CXVQc50$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m3511copyCXVQc50$default(TextStyle textStyle, long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i10, Object obj) {
        Hyphens hyphens2;
        LineBreak lineBreak2;
        long jM3463getColor0d7_KjU = (i10 & 1) != 0 ? textStyle.spanStyle.m3463getColor0d7_KjU() : j10;
        long fontSize = (i10 & 2) != 0 ? textStyle.spanStyle.getFontSize() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyle2 = (i10 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : fontStyle;
        FontSynthesis fontSynthesis2 = (i10 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : fontSynthesis;
        FontFamily fontFamily2 = (i10 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i10 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long letterSpacing = (i10 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : j12;
        BaselineShift baselineShift2 = (i10 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j15 = jM3463getColor0d7_KjU;
        long background = (i10 & 2048) != 0 ? textStyle.spanStyle.getBackground() : j13;
        TextDecoration textDecoration2 = (i10 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i10 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        TextAlign textAlign2 = (i10 & 16384) != 0 ? textStyle.paragraphStyle.getTextAlign() : textAlign;
        TextDirection textDirection2 = (i10 & 32768) != 0 ? textStyle.paragraphStyle.getTextDirection() : textDirection;
        long lineHeight = (i10 & 65536) != 0 ? textStyle.paragraphStyle.getLineHeight() : j14;
        TextIndent textIndent2 = (i10 & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i10 & 262144) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i10 & 524288) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak lineBreak3 = (i10 & 1048576) != 0 ? textStyle.paragraphStyle.getLineBreak() : lineBreak;
        if ((i10 & 2097152) != 0) {
            lineBreak2 = lineBreak3;
            hyphens2 = textStyle.paragraphStyle.getHyphens();
        } else {
            hyphens2 = hyphens;
            lineBreak2 = lineBreak3;
        }
        return textStyle.m3516copyCXVQc50(j15, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, fontFeatureSettings, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, background, textDecoration3, shadow2, textAlign2, textDirection2, lineHeight, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphens2);
    }

    /* JADX INFO: renamed from: copy-HL5avdY$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m3512copyHL5avdY$default(TextStyle textStyle, long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, int i10, Object obj) {
        long jM3463getColor0d7_KjU = (i10 & 1) != 0 ? textStyle.spanStyle.m3463getColor0d7_KjU() : j10;
        return textStyle.m3517copyHL5avdY(jM3463getColor0d7_KjU, (i10 & 2) != 0 ? textStyle.spanStyle.getFontSize() : j11, (i10 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight, (i10 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : fontStyle, (i10 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : fontSynthesis, (i10 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily, (i10 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str, (i10 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : j12, (i10 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : baselineShift, (i10 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform, (i10 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList, (i10 & 2048) != 0 ? textStyle.spanStyle.getBackground() : j13, (i10 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration, (i10 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow, (i10 & 16384) != 0 ? textStyle.paragraphStyle.getTextAlign() : textAlign, (i10 & 32768) != 0 ? textStyle.paragraphStyle.getTextDirection() : textDirection, (i10 & 65536) != 0 ? textStyle.paragraphStyle.getLineHeight() : j14, (i10 & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent);
    }

    /* JADX INFO: renamed from: copy-NOaFTUo$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m3513copyNOaFTUo$default(TextStyle textStyle, long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i10, Object obj) {
        LineHeightStyle lineHeightStyle2;
        PlatformTextStyle platformTextStyle2;
        long jM3463getColor0d7_KjU = (i10 & 1) != 0 ? textStyle.spanStyle.m3463getColor0d7_KjU() : j10;
        long fontSize = (i10 & 2) != 0 ? textStyle.spanStyle.getFontSize() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyle2 = (i10 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : fontStyle;
        FontSynthesis fontSynthesis2 = (i10 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : fontSynthesis;
        FontFamily fontFamily2 = (i10 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i10 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long letterSpacing = (i10 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : j12;
        BaselineShift baselineShift2 = (i10 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j15 = jM3463getColor0d7_KjU;
        long background = (i10 & 2048) != 0 ? textStyle.spanStyle.getBackground() : j13;
        TextDecoration textDecoration2 = (i10 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i10 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        TextAlign textAlign2 = (i10 & 16384) != 0 ? textStyle.paragraphStyle.getTextAlign() : textAlign;
        TextDirection textDirection2 = (i10 & 32768) != 0 ? textStyle.paragraphStyle.getTextDirection() : textDirection;
        long lineHeight = (i10 & 65536) != 0 ? textStyle.paragraphStyle.getLineHeight() : j14;
        TextIndent textIndent2 = (i10 & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i10 & 262144) != 0 ? textStyle.platformStyle : platformTextStyle;
        if ((i10 & 524288) != 0) {
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = textStyle.paragraphStyle.getLineHeightStyle();
        } else {
            lineHeightStyle2 = lineHeightStyle;
            platformTextStyle2 = platformTextStyle3;
        }
        return textStyle.m3518copyNOaFTUo(j15, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, fontFeatureSettings, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, background, textDecoration3, shadow2, textAlign2, textDirection2, lineHeight, textIndent2, platformTextStyle2, lineHeightStyle2);
    }

    /* JADX INFO: renamed from: copy-aIRg9q4$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m3514copyaIRg9q4$default(TextStyle textStyle, Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i10, Object obj) {
        TextMotion textMotion2;
        Hyphens hyphens2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        TextAlign textAlign2;
        TextDirection textDirection2;
        TextIndent textIndent2;
        PlatformTextStyle platformTextStyle2;
        LineHeightStyle lineHeightStyle2;
        Shadow shadow2;
        long j14;
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        FontSynthesis fontSynthesis2;
        String str2;
        long j15;
        BaselineShift baselineShift2;
        TextGeometricTransform textGeometricTransform2;
        LocaleList localeList2;
        long j16;
        long j17;
        Brush brush2;
        float f11;
        LineBreak lineBreak2;
        TextStyle textStyle2;
        FontFamily fontFamily2;
        float alpha = (i10 & 2) != 0 ? textStyle.spanStyle.getAlpha() : f10;
        long fontSize = (i10 & 4) != 0 ? textStyle.spanStyle.getFontSize() : j10;
        FontWeight fontWeight3 = (i10 & 8) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyle3 = (i10 & 16) != 0 ? textStyle.spanStyle.getFontStyle() : fontStyle;
        FontSynthesis fontSynthesis3 = (i10 & 32) != 0 ? textStyle.spanStyle.getFontSynthesis() : fontSynthesis;
        FontFamily fontFamily3 = (i10 & 64) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i10 & 128) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long letterSpacing = (i10 & 256) != 0 ? textStyle.spanStyle.getLetterSpacing() : j11;
        BaselineShift baselineShift3 = (i10 & 512) != 0 ? textStyle.spanStyle.getBaselineShift() : baselineShift;
        TextGeometricTransform textGeometricTransform3 = (i10 & 1024) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList3 = (i10 & 2048) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long background = (i10 & 4096) != 0 ? textStyle.spanStyle.getBackground() : j12;
        float f12 = alpha;
        TextDecoration textDecoration3 = (i10 & 8192) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow3 = (i10 & 16384) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        DrawStyle drawStyle3 = (i10 & 32768) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        TextAlign textAlign3 = (i10 & 65536) != 0 ? textStyle.paragraphStyle.getTextAlign() : textAlign;
        TextDirection textDirection3 = (i10 & 131072) != 0 ? textStyle.paragraphStyle.getTextDirection() : textDirection;
        long lineHeight = (i10 & 262144) != 0 ? textStyle.paragraphStyle.getLineHeight() : j13;
        TextIndent textIndent3 = (i10 & 524288) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle3 = (i10 & 1048576) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle3 = (i10 & 2097152) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak lineBreak3 = (i10 & 4194304) != 0 ? textStyle.paragraphStyle.getLineBreak() : lineBreak;
        Hyphens hyphens3 = (i10 & 8388608) != 0 ? textStyle.paragraphStyle.getHyphens() : hyphens;
        if ((i10 & 16777216) != 0) {
            hyphens2 = hyphens3;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            textAlign2 = textAlign3;
            textDirection2 = textDirection3;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            lineBreak2 = lineBreak3;
            shadow2 = shadow3;
            j14 = fontSize;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyle3;
            fontSynthesis2 = fontSynthesis3;
            fontFamily2 = fontFamily3;
            str2 = fontFeatureSettings;
            j15 = letterSpacing;
            baselineShift2 = baselineShift3;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j16 = background;
            j17 = lineHeight;
            brush2 = brush;
            f11 = f12;
            textStyle2 = textStyle;
        } else {
            textMotion2 = textMotion;
            hyphens2 = hyphens3;
            textDecoration2 = textDecoration3;
            drawStyle2 = drawStyle3;
            textAlign2 = textAlign3;
            textDirection2 = textDirection3;
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle3;
            lineHeightStyle2 = lineHeightStyle3;
            shadow2 = shadow3;
            j14 = fontSize;
            fontWeight2 = fontWeight3;
            fontStyle2 = fontStyle3;
            fontSynthesis2 = fontSynthesis3;
            str2 = fontFeatureSettings;
            j15 = letterSpacing;
            baselineShift2 = baselineShift3;
            textGeometricTransform2 = textGeometricTransform3;
            localeList2 = localeList3;
            j16 = background;
            j17 = lineHeight;
            brush2 = brush;
            f11 = f12;
            lineBreak2 = lineBreak3;
            textStyle2 = textStyle;
            fontFamily2 = fontFamily3;
        }
        return textStyle2.m3519copyaIRg9q4(brush2, f11, j14, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j15, baselineShift2, textGeometricTransform2, localeList2, j16, textDecoration2, shadow2, drawStyle2, textAlign2, textDirection2, j17, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphens2, textMotion2);
    }

    /* JADX INFO: renamed from: copy-v2rsoow$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m3515copyv2rsoow$default(TextStyle textStyle, long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i10, Object obj) {
        TextMotion textMotion2;
        Hyphens hyphens2;
        long jM3463getColor0d7_KjU = (i10 & 1) != 0 ? textStyle.spanStyle.m3463getColor0d7_KjU() : j10;
        long fontSize = (i10 & 2) != 0 ? textStyle.spanStyle.getFontSize() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle fontStyle2 = (i10 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : fontStyle;
        FontSynthesis fontSynthesis2 = (i10 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : fontSynthesis;
        FontFamily fontFamily2 = (i10 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i10 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long letterSpacing = (i10 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : j12;
        BaselineShift baselineShift2 = (i10 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j15 = jM3463getColor0d7_KjU;
        long background = (i10 & 2048) != 0 ? textStyle.spanStyle.getBackground() : j13;
        TextDecoration textDecoration2 = (i10 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = (i10 & 8192) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration2;
        DrawStyle drawStyle2 = (i10 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : drawStyle;
        TextAlign textAlign2 = (i10 & 32768) != 0 ? textStyle.paragraphStyle.getTextAlign() : textAlign;
        TextDirection textDirection2 = (i10 & 65536) != 0 ? textStyle.paragraphStyle.getTextDirection() : textDirection;
        long lineHeight = (i10 & 131072) != 0 ? textStyle.paragraphStyle.getLineHeight() : j14;
        TextIndent textIndent2 = (i10 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i10 & 524288) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i10 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        LineBreak lineBreak2 = (i10 & 2097152) != 0 ? textStyle.paragraphStyle.getLineBreak() : lineBreak;
        Hyphens hyphens3 = (i10 & 4194304) != 0 ? textStyle.paragraphStyle.getHyphens() : hyphens;
        if ((i10 & 8388608) != 0) {
            hyphens2 = hyphens3;
            textMotion2 = textStyle.paragraphStyle.getTextMotion();
        } else {
            textMotion2 = textMotion;
            hyphens2 = hyphens3;
        }
        return textStyle.m3520copyv2rsoow(j15, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, fontFeatureSettings, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, background, textDecoration3, shadow2, drawStyle2, textAlign2, textDirection2, lineHeight, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphens2, textMotion2);
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

    @ExperimentalTextApi
    public static /* synthetic */ void getTextMotion$annotations() {
    }

    public static /* synthetic */ TextStyle merge$default(TextStyle textStyle, TextStyle textStyle2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textStyle2 = null;
        }
        return textStyle.merge(textStyle2);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-CXVQc50, reason: not valid java name */
    public final TextStyle m3516copyCXVQc50(long color, long fontSize, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String fontFeatureSettings, long letterSpacing, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long background, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable TextAlign textAlign, @Nullable TextDirection textDirection, long lineHeight, @Nullable TextIndent textIndent, @Nullable PlatformTextStyle platformStyle, @Nullable LineHeightStyle lineHeightStyle, @Nullable LineBreak lineBreak, @Nullable Hyphens hyphens) {
        return new TextStyle(new SpanStyle(Color.m1605equalsimpl0(color, this.spanStyle.m3463getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle() : TextForegroundStyle.INSTANCE.m3876from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, getDrawStyle(), (DefaultConstructorMarker) null), new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, hyphens, getTextMotion(), (DefaultConstructorMarker) null), platformStyle);
    }

    /* JADX INFO: renamed from: copy-HL5avdY, reason: not valid java name */
    public final /* synthetic */ TextStyle m3517copyHL5avdY(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent) {
        return new TextStyle(new SpanStyle(Color.m1605equalsimpl0(color, this.spanStyle.m3463getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle() : TextForegroundStyle.INSTANCE.m3876from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, this.spanStyle.getPlatformStyle(), this.spanStyle.getDrawStyle(), (DefaultConstructorMarker) null), new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, this.paragraphStyle.getPlatformStyle(), getLineHeightStyle(), m3529getLineBreakLgCVezo(), m3527getHyphensEaSxIns(), getTextMotion(), (DefaultConstructorMarker) null), this.platformStyle);
    }

    /* JADX INFO: renamed from: copy-NOaFTUo, reason: not valid java name */
    public final /* synthetic */ TextStyle m3518copyNOaFTUo(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle) {
        return new TextStyle(new SpanStyle(Color.m1605equalsimpl0(color, this.spanStyle.m3463getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle() : TextForegroundStyle.INSTANCE.m3876from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, this.spanStyle.getDrawStyle(), (DefaultConstructorMarker) null), new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, m3529getLineBreakLgCVezo(), m3527getHyphensEaSxIns(), getTextMotion(), (DefaultConstructorMarker) null), platformStyle);
    }

    @ExperimentalTextApi
    @NotNull
    /* JADX INFO: renamed from: copy-aIRg9q4, reason: not valid java name */
    public final TextStyle m3519copyaIRg9q4(@Nullable Brush brush, float alpha, long fontSize, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String fontFeatureSettings, long letterSpacing, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long background, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable DrawStyle drawStyle, @Nullable TextAlign textAlign, @Nullable TextDirection textDirection, long lineHeight, @Nullable TextIndent textIndent, @Nullable PlatformTextStyle platformStyle, @Nullable LineHeightStyle lineHeightStyle, @Nullable LineBreak lineBreak, @Nullable Hyphens hyphens, @Nullable TextMotion textMotion) {
        return new TextStyle(new SpanStyle(brush, alpha, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion, (DefaultConstructorMarker) null), platformStyle);
    }

    @ExperimentalTextApi
    @NotNull
    /* JADX INFO: renamed from: copy-v2rsoow, reason: not valid java name */
    public final TextStyle m3520copyv2rsoow(long color, long fontSize, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String fontFeatureSettings, long letterSpacing, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long background, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable DrawStyle drawStyle, @Nullable TextAlign textAlign, @Nullable TextDirection textDirection, long lineHeight, @Nullable TextIndent textIndent, @Nullable PlatformTextStyle platformStyle, @Nullable LineHeightStyle lineHeightStyle, @Nullable LineBreak lineBreak, @Nullable Hyphens hyphens, @Nullable TextMotion textMotion) {
        return new TextStyle(new SpanStyle(Color.m1605equalsimpl0(color, this.spanStyle.m3463getColor0d7_KjU()) ? this.spanStyle.getTextForegroundStyle() : TextForegroundStyle.INSTANCE.m3876from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion, (DefaultConstructorMarker) null), platformStyle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) other;
        return Intrinsics.areEqual(this.spanStyle, textStyle.spanStyle) && Intrinsics.areEqual(this.paragraphStyle, textStyle.paragraphStyle) && Intrinsics.areEqual(this.platformStyle, textStyle.platformStyle);
    }

    @ExperimentalTextApi
    public final float getAlpha() {
        return this.spanStyle.getAlpha();
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m3521getBackground0d7_KjU() {
        return this.spanStyle.getBackground();
    }

    @Nullable
    /* JADX INFO: renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m3522getBaselineShift5SSeXJ0() {
        return this.spanStyle.getBaselineShift();
    }

    @ExperimentalTextApi
    @Nullable
    public final Brush getBrush() {
        return this.spanStyle.getBrush();
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m3523getColor0d7_KjU() {
        return this.spanStyle.m3463getColor0d7_KjU();
    }

    @ExperimentalTextApi
    @Nullable
    public final DrawStyle getDrawStyle() {
        return this.spanStyle.getDrawStyle();
    }

    @Nullable
    public final FontFamily getFontFamily() {
        return this.spanStyle.getFontFamily();
    }

    @Nullable
    public final String getFontFeatureSettings() {
        return this.spanStyle.getFontFeatureSettings();
    }

    /* JADX INFO: renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m3524getFontSizeXSAIIZE() {
        return this.spanStyle.getFontSize();
    }

    @Nullable
    /* JADX INFO: renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m3525getFontStyle4Lr2A7w() {
        return this.spanStyle.getFontStyle();
    }

    @Nullable
    /* JADX INFO: renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m3526getFontSynthesisZQGJjVo() {
        return this.spanStyle.getFontSynthesis();
    }

    @Nullable
    public final FontWeight getFontWeight() {
        return this.spanStyle.getFontWeight();
    }

    @Nullable
    /* JADX INFO: renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m3527getHyphensEaSxIns() {
        return this.paragraphStyle.getHyphens();
    }

    /* JADX INFO: renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m3528getLetterSpacingXSAIIZE() {
        return this.spanStyle.getLetterSpacing();
    }

    @Nullable
    /* JADX INFO: renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m3529getLineBreakLgCVezo() {
        return this.paragraphStyle.getLineBreak();
    }

    /* JADX INFO: renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m3530getLineHeightXSAIIZE() {
        return this.paragraphStyle.getLineHeight();
    }

    @Nullable
    public final LineHeightStyle getLineHeightStyle() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    @Nullable
    public final LocaleList getLocaleList() {
        return this.spanStyle.getLocaleList();
    }

    @NotNull
    /* JADX INFO: renamed from: getParagraphStyle$ui_text_release, reason: from getter */
    public final ParagraphStyle getParagraphStyle() {
        return this.paragraphStyle;
    }

    @Nullable
    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    @Nullable
    public final Shadow getShadow() {
        return this.spanStyle.getShadow();
    }

    @NotNull
    /* JADX INFO: renamed from: getSpanStyle$ui_text_release, reason: from getter */
    public final SpanStyle getSpanStyle() {
        return this.spanStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m3531getTextAlignbuA522U() {
        return this.paragraphStyle.getTextAlign();
    }

    @Nullable
    public final TextDecoration getTextDecoration() {
        return this.spanStyle.getTextDecoration();
    }

    @Nullable
    /* JADX INFO: renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m3532getTextDirectionmmuk1to() {
        return this.paragraphStyle.getTextDirection();
    }

    @Nullable
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.spanStyle.getTextGeometricTransform();
    }

    @Nullable
    public final TextIndent getTextIndent() {
        return this.paragraphStyle.getTextIndent();
    }

    @ExperimentalTextApi
    @Nullable
    public final TextMotion getTextMotion() {
        return this.paragraphStyle.getTextMotion();
    }

    public final boolean hasSameLayoutAffectingAttributes(@NotNull TextStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (this != other) {
            return Intrinsics.areEqual(this.paragraphStyle, other.paragraphStyle) && this.spanStyle.hasSameLayoutAffectingAttributes$ui_text_release(other.spanStyle);
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = ((this.spanStyle.hashCode() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iHashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int iHashCodeLayoutAffectingAttributes$ui_text_release = ((this.spanStyle.hashCodeLayoutAffectingAttributes$ui_text_release() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iHashCodeLayoutAffectingAttributes$ui_text_release + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    @Stable
    @NotNull
    public final TextStyle merge(@Nullable TextStyle other) {
        return (other == null || Intrinsics.areEqual(other, Default)) ? this : new TextStyle(toSpanStyle().merge(other.toSpanStyle()), toParagraphStyle().merge(other.toParagraphStyle()));
    }

    @Stable
    @NotNull
    public final TextStyle plus(@NotNull TextStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return merge(other);
    }

    @Stable
    @NotNull
    public final ParagraphStyle toParagraphStyle() {
        return this.paragraphStyle;
    }

    @Stable
    @NotNull
    public final SpanStyle toSpanStyle() {
        return this.spanStyle;
    }

    @NotNull
    public String toString() {
        return "TextStyle(color=" + ((Object) Color.m1612toStringimpl(m3523getColor0d7_KjU())) + ", brush=" + getBrush() + ", alpha=" + getAlpha() + ", fontSize=" + ((Object) TextUnit.m4139toStringimpl(m3524getFontSizeXSAIIZE())) + ", fontWeight=" + getFontWeight() + ", fontStyle=" + m3525getFontStyle4Lr2A7w() + ", fontSynthesis=" + m3526getFontSynthesisZQGJjVo() + ", fontFamily=" + getFontFamily() + ", fontFeatureSettings=" + getFontFeatureSettings() + ", letterSpacing=" + ((Object) TextUnit.m4139toStringimpl(m3528getLetterSpacingXSAIIZE())) + ", baselineShift=" + m3522getBaselineShift5SSeXJ0() + ", textGeometricTransform=" + getTextGeometricTransform() + ", localeList=" + getLocaleList() + ", background=" + ((Object) Color.m1612toStringimpl(m3521getBackground0d7_KjU())) + ", textDecoration=" + getTextDecoration() + ", shadow=" + getShadow() + ", drawStyle=" + getDrawStyle() + ", textAlign=" + m3531getTextAlignbuA522U() + ", textDirection=" + m3532getTextDirectionmmuk1to() + ", lineHeight=" + ((Object) TextUnit.m4139toStringimpl(m3530getLineHeightXSAIIZE())) + ", textIndent=" + getTextIndent() + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + getLineHeightStyle() + ", lineBreak=" + m3529getLineBreakLgCVezo() + ", hyphens=" + m3527getHyphensEaSxIns() + ", textMotion=" + getTextMotion() + ')';
    }

    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, textAlign, textDirection, j14, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @Stable
    @NotNull
    public final TextStyle plus(@NotNull ParagraphStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return merge(other);
    }

    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, textAlign, textDirection, j14, textIndent, platformTextStyle, lineHeightStyle);
    }

    @Stable
    @NotNull
    public final TextStyle plus(@NotNull SpanStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return merge(other);
    }

    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, textAlign, textDirection, j14, textIndent);
    }

    @ExperimentalTextApi
    public /* synthetic */ TextStyle(Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, f10, j10, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j11, baselineShift, textGeometricTransform, localeList, j12, textDecoration, shadow, drawStyle, textAlign, textDirection, j13, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    public TextStyle(@NotNull SpanStyle spanStyle, @NotNull ParagraphStyle paragraphStyle, @Nullable PlatformTextStyle platformTextStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        Intrinsics.checkNotNullParameter(paragraphStyle, "paragraphStyle");
        this.spanStyle = spanStyle;
        this.paragraphStyle = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }

    @Stable
    @NotNull
    public final TextStyle merge(@NotNull SpanStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new TextStyle(toSpanStyle().merge(other), toParagraphStyle());
    }

    public /* synthetic */ TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(spanStyle, paragraphStyle, (i10 & 4) != 0 ? null : platformTextStyle);
    }

    @Stable
    @NotNull
    public final TextStyle merge(@NotNull ParagraphStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new TextStyle(toSpanStyle(), toParagraphStyle().merge(other));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStyle(@NotNull SpanStyle spanStyle, @NotNull ParagraphStyle paragraphStyle) {
        this(spanStyle, paragraphStyle, TextStyleKt.createPlatformTextStyleInternal(spanStyle.getPlatformStyle(), paragraphStyle.getPlatformStyle()));
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        Intrinsics.checkNotNullParameter(paragraphStyle, "paragraphStyle");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, int i10, DefaultConstructorMarker defaultConstructorMarker) {
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
        long j15 = jM1640getUnspecified0d7_KjU;
        Shadow shadow2 = (i10 & 8192) != 0 ? null : shadow;
        TextAlign textAlign2 = (i10 & 16384) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i10 & 32768) != 0 ? null : textDirection;
        long jM4143getUnspecifiedXSAIIZE3 = (i10 & 65536) != 0 ? TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE() : j14;
        long j16 = jM4143getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j17 = jM4143getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j18 = jM1640getUnspecified0d7_KjU2;
        this(j15, j16, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j17, baselineShift3, textGeometricTransform3, localeList3, j18, textDecoration3, shadow2, textAlign2, textDirection2, jM4143getUnspecifiedXSAIIZE3, (i10 & 131072) != 0 ? null : textIndent, null);
    }

    private TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent) {
        this(new SpanStyle(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, (PlatformSpanStyle) null, (DrawStyle) null, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign, textDirection, j14, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, (DefaultConstructorMarker) null), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
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
        long j15 = jM1640getUnspecified0d7_KjU;
        Shadow shadow2 = (i10 & 8192) != 0 ? null : shadow;
        TextAlign textAlign2 = (i10 & 16384) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i10 & 32768) != 0 ? null : textDirection;
        long jM4143getUnspecifiedXSAIIZE3 = (i10 & 65536) != 0 ? TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE() : j14;
        TextIndent textIndent2 = (i10 & 131072) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i10 & 262144) != 0 ? null : platformTextStyle;
        long j16 = jM4143getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j17 = jM4143getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j18 = jM1640getUnspecified0d7_KjU2;
        this(j15, j16, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j17, baselineShift3, textGeometricTransform3, localeList3, j18, textDecoration3, shadow2, textAlign2, textDirection2, jM4143getUnspecifiedXSAIIZE3, textIndent2, platformTextStyle2, (i10 & 524288) != 0 ? null : lineHeightStyle, null);
    }

    private TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        SpanStyle spanStyle = new SpanStyle(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DrawStyle) null, (DefaultConstructorMarker) null);
        this(spanStyle, new ParagraphStyle(textAlign, textDirection, j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphSyle() : null, lineHeightStyle, (LineBreak) null, (Hyphens) null, (TextMotion) null, (DefaultConstructorMarker) null), platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i10, DefaultConstructorMarker defaultConstructorMarker) {
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
        long j15 = jM1640getUnspecified0d7_KjU;
        Shadow shadow2 = (i10 & 8192) != 0 ? null : shadow;
        TextAlign textAlign2 = (i10 & 16384) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i10 & 32768) != 0 ? null : textDirection;
        long jM4143getUnspecifiedXSAIIZE3 = (i10 & 65536) != 0 ? TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE() : j14;
        TextIndent textIndent2 = (i10 & 131072) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i10 & 262144) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i10 & 524288) != 0 ? null : lineHeightStyle;
        LineBreak lineBreak2 = (i10 & 1048576) != 0 ? null : lineBreak;
        long j16 = jM4143getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j17 = jM4143getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j18 = jM1640getUnspecified0d7_KjU2;
        this(j15, j16, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j17, baselineShift3, textGeometricTransform3, localeList3, j18, textDecoration3, shadow2, textAlign2, textDirection2, jM4143getUnspecifiedXSAIIZE3, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, (i10 & 2097152) != 0 ? null : hyphens, null);
    }

    private TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        this(new SpanStyle(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign, textDirection, j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, hyphens, (DefaultConstructorMarker) null), platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i10, DefaultConstructorMarker defaultConstructorMarker) {
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
        long j15 = jM1640getUnspecified0d7_KjU;
        Shadow shadow2 = (i10 & 8192) != 0 ? null : shadow;
        DrawStyle drawStyle2 = (i10 & 16384) != 0 ? null : drawStyle;
        TextAlign textAlign2 = (i10 & 32768) != 0 ? null : textAlign;
        TextDirection textDirection2 = (i10 & 65536) != 0 ? null : textDirection;
        long jM4143getUnspecifiedXSAIIZE3 = (i10 & 131072) != 0 ? TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE() : j14;
        TextIndent textIndent2 = (i10 & 262144) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i10 & 524288) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i10 & 1048576) != 0 ? null : lineHeightStyle;
        LineBreak lineBreak2 = (i10 & 2097152) != 0 ? null : lineBreak;
        Hyphens hyphens2 = (i10 & 4194304) != 0 ? null : hyphens;
        long j16 = jM4143getUnspecifiedXSAIIZE;
        FontWeight fontWeight3 = fontWeight2;
        TextDecoration textDecoration3 = textDecoration2;
        FontStyle fontStyle3 = fontStyle2;
        FontSynthesis fontSynthesis3 = fontSynthesis2;
        FontFamily fontFamily3 = fontFamily2;
        String str3 = str2;
        long j17 = jM4143getUnspecifiedXSAIIZE2;
        BaselineShift baselineShift3 = baselineShift2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j18 = jM1640getUnspecified0d7_KjU2;
        this(j15, j16, fontWeight3, fontStyle3, fontSynthesis3, fontFamily3, str3, j17, baselineShift3, textGeometricTransform3, localeList3, j18, textDecoration3, shadow2, drawStyle2, textAlign2, textDirection2, jM4143getUnspecifiedXSAIIZE3, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak2, hyphens2, (i10 & 8388608) != 0 ? null : textMotion, (DefaultConstructorMarker) null);
    }

    private TextStyle(long j10, long j11, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j12, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(j10, j11, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j12, baselineShift, textGeometricTransform, localeList, j13, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign, textDirection, j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, (i10 & 2) != 0 ? Float.NaN : f10, (i10 & 4) != 0 ? TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE() : j10, (i10 & 8) != 0 ? null : fontWeight, (i10 & 16) != 0 ? null : fontStyle, (i10 & 32) != 0 ? null : fontSynthesis, (i10 & 64) != 0 ? null : fontFamily, (i10 & 128) != 0 ? null : str, (i10 & 256) != 0 ? TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE() : j11, (i10 & 512) != 0 ? null : baselineShift, (i10 & 1024) != 0 ? null : textGeometricTransform, (i10 & 2048) != 0 ? null : localeList, (i10 & 4096) != 0 ? Color.INSTANCE.m1640getUnspecified0d7_KjU() : j12, (i10 & 8192) != 0 ? null : textDecoration, (i10 & 16384) != 0 ? null : shadow, (32768 & i10) != 0 ? null : drawStyle, (65536 & i10) != 0 ? null : textAlign, (131072 & i10) != 0 ? null : textDirection, (262144 & i10) != 0 ? TextUnit.INSTANCE.m4143getUnspecifiedXSAIIZE() : j13, (524288 & i10) != 0 ? null : textIndent, (1048576 & i10) != 0 ? null : platformTextStyle, (2097152 & i10) != 0 ? null : lineHeightStyle, (4194304 & i10) != 0 ? null : lineBreak, (8388608 & i10) != 0 ? null : hyphens, (i10 & 16777216) != 0 ? null : textMotion, (DefaultConstructorMarker) null);
    }

    private TextStyle(Brush brush, float f10, long j10, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j11, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j12, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j13, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(brush, f10, j10, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j11, baselineShift, textGeometricTransform, localeList, j12, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign, textDirection, j13, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }
}
