package androidx.compose.ui.node;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.models.APIMeta;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J5\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0013H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$Jt\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105Jt\u0010%\u001a\u00020\u001e2\u0006\u00106\u001a\u0002072\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109J\\\u0010:\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010;\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\\\u0010:\u001a\u00020\u001e2\u0006\u00106\u001a\u0002072\b\b\u0002\u0010;\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\b\u0010@\u001a\u00020\u001eH\u0016JR\u0010A\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020C2\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010EJp\u0010A\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020C2\b\b\u0002\u0010F\u001a\u00020G2\b\b\u0002\u0010H\u001a\u00020I2\b\b\u0002\u0010J\u001a\u00020G2\b\b\u0002\u0010K\u001a\u00020I2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bL\u0010MJz\u0010A\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020C2\b\b\u0002\u0010F\u001a\u00020G2\b\b\u0002\u0010H\u001a\u00020I2\b\b\u0002\u0010J\u001a\u00020G2\b\b\u0002\u0010K\u001a\u00020I2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u0010N\u001a\u00020OH\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bP\u0010QJn\u0010R\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'2\u0006\u0010S\u001a\u00020\u00072\u0006\u0010T\u001a\u00020\u00072\b\b\u0002\u0010U\u001a\u00020\u000b2\b\b\u0002\u0010V\u001a\u00020W2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010Y2\b\b\u0002\u0010-\u001a\u00020\u000b2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bZ\u0010[Jn\u0010R\u001a\u00020\u001e2\u0006\u00106\u001a\u0002072\u0006\u0010S\u001a\u00020\u00072\u0006\u0010T\u001a\u00020\u00072\b\b\u0002\u0010U\u001a\u00020\u000b2\b\b\u0002\u0010V\u001a\u00020W2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010Y2\b\b\u0002\u0010-\u001a\u00020\u000b2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\\\u0010]J\\\u0010^\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b_\u0010`J\\\u0010^\u001a\u00020\u001e2\u0006\u00106\u001a\u0002072\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\ba\u0010bJP\u0010c\u001a\u00020\u001e2\u0006\u0010d\u001a\u00020e2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bf\u0010gJP\u0010c\u001a\u00020\u001e2\u0006\u0010d\u001a\u00020e2\u0006\u00106\u001a\u0002072\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bh\u0010iJt\u0010j\u001a\u00020\u001e2\f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00070l2\u0006\u0010m\u001a\u00020n2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010U\u001a\u00020\u000b2\b\b\u0002\u0010V\u001a\u00020W2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010Y2\b\b\u0002\u0010-\u001a\u00020\u000b2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bo\u0010pJt\u0010j\u001a\u00020\u001e2\f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00070l2\u0006\u0010m\u001a\u00020n2\u0006\u00106\u001a\u0002072\b\b\u0002\u0010U\u001a\u00020\u000b2\b\b\u0002\u0010V\u001a\u00020W2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010Y2\b\b\u0002\u0010-\u001a\u00020\u000b2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bq\u0010rJ\\\u0010s\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bt\u0010`J\\\u0010s\u001a\u00020\u001e2\u0006\u00106\u001a\u0002072\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bu\u0010bJf\u0010v\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010w\u001a\u00020x2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\by\u0010zJf\u0010v\u001a\u00020\u001e2\u0006\u00106\u001a\u0002072\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010w\u001a\u00020x2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u0010-\u001a\u00020\u000b2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u000203H\u0096\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b{\u0010|J\u0012\u0010}\u001a\u00020\u001e*\u00020\u00132\u0006\u0010\u001f\u001a\u00020 J\u001d\u0010~\u001a\u00020\u007f*\u00030\u0080\u0001H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001d\u0010~\u001a\u00020\u007f*\u00030\u0083\u0001H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001f\u0010\u0086\u0001\u001a\u00030\u0080\u0001*\u00030\u0083\u0001H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J!\u0010\u0086\u0001\u001a\u00030\u0080\u0001*\u00020\u000bH\u0097\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J!\u0010\u0086\u0001\u001a\u00030\u0080\u0001*\u00020\u007fH\u0097\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008b\u0001J\u001e\u0010\u008c\u0001\u001a\u00030\u008d\u0001*\u00020\u001bH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001e\u0010\u0090\u0001\u001a\u00020\u000b*\u00030\u0080\u0001H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0091\u0001\u0010\u008a\u0001J\u001e\u0010\u0090\u0001\u001a\u00020\u000b*\u00030\u0083\u0001H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0088\u0001J\u0010\u0010\u0093\u0001\u001a\u00030\u0094\u0001*\u00030\u0095\u0001H\u0097\u0001J\u001e\u0010\u0096\u0001\u001a\u00020\u001b*\u00030\u008d\u0001H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0097\u0001\u0010\u008f\u0001J\u001f\u0010\u0098\u0001\u001a\u00030\u0083\u0001*\u00030\u0080\u0001H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J!\u0010\u0098\u0001\u001a\u00030\u0083\u0001*\u00020\u000bH\u0097\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u009b\u0001\u0010\u009a\u0001J!\u0010\u0098\u0001\u001a\u00030\u0083\u0001*\u00020\u007fH\u0097\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u00020\u00078VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u000b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0012\u0010\u0016\u001a\u00020\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\t\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009d\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "canvasDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "(Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter-F1C5BW0", "()J", "density", "", "getDensity", "()F", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawNode", "Landroidx/compose/ui/node/DrawModifierNode;", "fontScale", "getFontScale", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "draw", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "coordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "draw-x_KDEd0$ui_release", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/node/DrawModifierNode;)V", "drawArc", "brush", "Landroidx/compose/ui/graphics/Brush;", "startAngle", "sweepAngle", "useCenter", "", "topLeft", "alpha", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "radius", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawContent", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "drawLine", "start", "end", "strokeWidth", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "path", "Landroidx/compose/ui/graphics/Path;", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", APIMeta.POINTS, "", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-AsUm42w", "drawRect-n-J9OG0", "drawRoundRect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "performDraw", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {

    @NotNull
    private final CanvasDrawScope canvasDrawScope;

    @Nullable
    private DrawModifierNode drawNode;

    public LayoutNodeDrawScope() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: draw-x_KDEd0$ui_release, reason: not valid java name */
    public final void m3136drawx_KDEd0$ui_release(@NotNull Canvas canvas, long size, @NotNull NodeCoordinator coordinator, @NotNull DrawModifierNode drawNode) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(drawNode, "drawNode");
        DrawModifierNode drawModifierNode = this.drawNode;
        this.drawNode = drawNode;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        LayoutDirection layoutDirection = coordinator.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density densityComponent1 = drawParams.getDensity();
        LayoutDirection layoutDirectionComponent2 = drawParams.getLayoutDirection();
        Canvas canvasComponent3 = drawParams.getCanvas();
        long jM2042component4NHjbRc = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(coordinator);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m2045setSizeuvyYCjk(size);
        canvas.save();
        drawNode.draw(this);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(densityComponent1);
        drawParams3.setLayoutDirection(layoutDirectionComponent2);
        drawParams3.setCanvas(canvasComponent3);
        drawParams3.m2045setSizeuvyYCjk(jM2042component4NHjbRc);
        this.drawNode = drawModifierNode;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-illE91I */
    public void mo2020drawArcillE91I(@NotNull Brush brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo2020drawArcillE91I(brush, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-yD3GUKo */
    public void mo2021drawArcyD3GUKo(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo2021drawArcyD3GUKo(color, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-V9BoPsw */
    public void mo2022drawCircleV9BoPsw(@NotNull Brush brush, float radius, long center, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo2022drawCircleV9BoPsw(brush, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-VaOC9Bg */
    public void mo2023drawCircleVaOC9Bg(long color, float radius, long center, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo2023drawCircleVaOC9Bg(color, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.ContentDrawScope
    public void drawContent() {
        Canvas canvas = getDrawContext().getCanvas();
        DrawModifierNode drawModifierNode = this.drawNode;
        Intrinsics.checkNotNull(drawModifierNode);
        DrawModifierNode drawModifierNodeNextDrawNode = LayoutNodeDrawScopeKt.nextDrawNode(drawModifierNode);
        if (drawModifierNodeNextDrawNode != null) {
            performDraw(drawModifierNodeNextDrawNode, canvas);
            return;
        }
        NodeCoordinator nodeCoordinatorM3103requireCoordinator64DMado = DelegatableNodeKt.m3103requireCoordinator64DMado(drawModifierNode, NodeKind.m3199constructorimpl(4));
        if (nodeCoordinatorM3103requireCoordinator64DMado.getTail() == drawModifierNode) {
            nodeCoordinatorM3103requireCoordinator64DMado = nodeCoordinatorM3103requireCoordinator64DMado.getWrapped();
            Intrinsics.checkNotNull(nodeCoordinatorM3103requireCoordinator64DMado);
        }
        nodeCoordinatorM3103requireCoordinator64DMado.performDraw(canvas);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-9jGpkUE */
    public /* synthetic */ void mo2024drawImage9jGpkUE(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo2024drawImage9jGpkUE(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-AZ2fEMs */
    public void mo2025drawImageAZ2fEMs(@NotNull ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode, int filterQuality) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo2025drawImageAZ2fEMs(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, filterQuality);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-gbVJVH8 */
    public void mo2026drawImagegbVJVH8(@NotNull ImageBitmap image, long topLeft, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo2026drawImagegbVJVH8(image, topLeft, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-1RTmtNc */
    public void mo2027drawLine1RTmtNc(@NotNull Brush brush, long start, long end, float strokeWidth, int cap, @Nullable PathEffect pathEffect, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.canvasDrawScope.mo2027drawLine1RTmtNc(brush, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-NGM6Ib0 */
    public void mo2028drawLineNGM6Ib0(long color, long start, long end, float strokeWidth, int cap, @Nullable PathEffect pathEffect, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo2028drawLineNGM6Ib0(color, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-AsUm42w */
    public void mo2029drawOvalAsUm42w(@NotNull Brush brush, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo2029drawOvalAsUm42w(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-n-J9OG0 */
    public void mo2030drawOvalnJ9OG0(long color, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo2030drawOvalnJ9OG0(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-GBMwjPU */
    public void mo2031drawPathGBMwjPU(@NotNull Path path, @NotNull Brush brush, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo2031drawPathGBMwjPU(path, brush, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-LG529CI */
    public void mo2032drawPathLG529CI(@NotNull Path path, long color, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo2032drawPathLG529CI(path, color, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-F8ZwMP8 */
    public void mo2033drawPointsF8ZwMP8(@NotNull List<Offset> points, int pointMode, long color, float strokeWidth, int cap, @Nullable PathEffect pathEffect, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.canvasDrawScope.mo2033drawPointsF8ZwMP8(points, pointMode, color, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-Gsft0Ws */
    public void mo2034drawPointsGsft0Ws(@NotNull List<Offset> points, int pointMode, @NotNull Brush brush, float strokeWidth, int cap, @Nullable PathEffect pathEffect, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.canvasDrawScope.mo2034drawPointsGsft0Ws(points, pointMode, brush, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-AsUm42w */
    public void mo2035drawRectAsUm42w(@NotNull Brush brush, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo2035drawRectAsUm42w(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-n-J9OG0 */
    public void mo2036drawRectnJ9OG0(long color, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo2036drawRectnJ9OG0(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-ZuiqVtQ */
    public void mo2037drawRoundRectZuiqVtQ(@NotNull Brush brush, long topLeft, long size, long cornerRadius, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo2037drawRoundRectZuiqVtQ(brush, topLeft, size, cornerRadius, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-u-Aw5IA */
    public void mo2038drawRoundRectuAw5IA(long color, long topLeft, long size, long cornerRadius, @NotNull DrawStyle style, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo2038drawRoundRectuAw5IA(color, topLeft, size, cornerRadius, style, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: getCenter-F1C5BW0 */
    public long mo2039getCenterF1C5BW0() {
        return this.canvasDrawScope.mo2039getCenterF1C5BW0();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @NotNull
    public DrawContext getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: getSize-NH-jbRc */
    public long mo2040getSizeNHjbRc() {
        return this.canvasDrawScope.mo2040getSizeNHjbRc();
    }

    public final void performDraw(@NotNull DrawModifierNode drawModifierNode, @NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(drawModifierNode, "<this>");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        NodeCoordinator nodeCoordinatorM3103requireCoordinator64DMado = DelegatableNodeKt.m3103requireCoordinator64DMado(drawModifierNode, NodeKind.m3199constructorimpl(4));
        nodeCoordinatorM3103requireCoordinator64DMado.getLayoutNode().getMDrawScope$ui_release().m3136drawx_KDEd0$ui_release(canvas, IntSizeKt.m4121toSizeozmzZPI(nodeCoordinatorM3103requireCoordinator64DMado.mo3015getSizeYbymL2g()), nodeCoordinatorM3103requireCoordinator64DMado, drawModifierNode);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public int mo301roundToPxR2X_6o(long j10) {
        return this.canvasDrawScope.mo301roundToPxR2X_6o(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public int mo302roundToPx0680j_4(float f10) {
        return this.canvasDrawScope.mo302roundToPx0680j_4(f10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public float mo303toDpGaN1DYA(long j10) {
        return this.canvasDrawScope.mo303toDpGaN1DYA(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo304toDpu2uoSUM(float f10) {
        return this.canvasDrawScope.mo304toDpu2uoSUM(f10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public long mo306toDpSizekrfVVM(long j10) {
        return this.canvasDrawScope.mo306toDpSizekrfVVM(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public float mo307toPxR2X_6o(long j10) {
        return this.canvasDrawScope.mo307toPxR2X_6o(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public float mo308toPx0680j_4(float f10) {
        return this.canvasDrawScope.mo308toPx0680j_4(f10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.canvasDrawScope.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public long mo309toSizeXkaWNTQ(long j10) {
        return this.canvasDrawScope.mo309toSizeXkaWNTQ(j10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public long mo310toSp0xMU5do(float f10) {
        return this.canvasDrawScope.mo310toSp0xMU5do(f10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo311toSpkPz2Gy4(float f10) {
        return this.canvasDrawScope.mo311toSpkPz2Gy4(f10);
    }

    public LayoutNodeDrawScope(@NotNull CanvasDrawScope canvasDrawScope) {
        Intrinsics.checkNotNullParameter(canvasDrawScope, "canvasDrawScope");
        this.canvasDrawScope = canvasDrawScope;
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo305toDpu2uoSUM(int i10) {
        return this.canvasDrawScope.mo305toDpu2uoSUM(i10);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo312toSpkPz2Gy4(int i10) {
        return this.canvasDrawScope.mo312toSpkPz2Gy4(i10);
    }

    public /* synthetic */ LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
