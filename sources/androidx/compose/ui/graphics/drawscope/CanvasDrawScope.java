package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import com.my.target.common.menu.MenuActionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import net.pubnative.lite.sdk.models.APIMeta;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0002\u0097\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJK\u0010\u0019\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018JI\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJk\u0010(\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'Jm\u0010(\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J!\u0010-\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,Ja\u00104\u001a\u0002012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103Ja\u00104\u001a\u0002012\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106JO\u0010<\u001a\u0002012\u0006\u0010\r\u001a\u00020\f2\u0006\u00107\u001a\u00020.2\u0006\u00109\u001a\u0002082\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;JO\u0010<\u001a\u0002012\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00107\u001a\u00020.2\u0006\u00109\u001a\u0002082\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>JG\u0010C\u001a\u0002012\u0006\u0010@\u001a\u00020?2\u0006\u00107\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bA\u0010BJ_\u0010C\u001a\u0002012\u0006\u0010@\u001a\u00020?2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020D2\u0006\u0010I\u001a\u00020F2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bJ\u0010KJg\u0010C\u001a\u0002012\u0006\u0010@\u001a\u00020?2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020D2\u0006\u0010I\u001a\u00020F2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010MJW\u0010R\u001a\u0002012\u0006\u0010\r\u001a\u00020\f2\u0006\u00107\u001a\u00020.2\u0006\u00109\u001a\u0002082\u0006\u0010O\u001a\u00020N2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bP\u0010QJW\u0010R\u001a\u0002012\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00107\u001a\u00020.2\u0006\u00109\u001a\u0002082\u0006\u0010O\u001a\u00020N2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bS\u0010TJO\u0010Y\u001a\u0002012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010U\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bW\u0010XJO\u0010Y\u001a\u0002012\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010U\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bZ\u0010[JO\u0010]\u001a\u0002012\u0006\u0010\r\u001a\u00020\f2\u0006\u00107\u001a\u00020.2\u0006\u00109\u001a\u0002082\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\\\u0010;JO\u0010]\u001a\u0002012\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00107\u001a\u00020.2\u0006\u00109\u001a\u0002082\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b^\u0010>Jg\u0010e\u001a\u0002012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010_\u001a\u00020\u000f2\u0006\u0010`\u001a\u00020\u000f2\u0006\u0010b\u001a\u00020a2\u0006\u00107\u001a\u00020.2\u0006\u00109\u001a\u0002082\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bc\u0010dJg\u0010e\u001a\u0002012\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010_\u001a\u00020\u000f2\u0006\u0010`\u001a\u00020\u000f2\u0006\u0010b\u001a\u00020a2\u0006\u00107\u001a\u00020.2\u0006\u00109\u001a\u0002082\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bf\u0010gJG\u0010l\u001a\u0002012\u0006\u0010i\u001a\u00020h2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bj\u0010kJG\u0010l\u001a\u0002012\u0006\u0010i\u001a\u00020h2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bm\u0010nJg\u0010u\u001a\u0002012\f\u0010p\u001a\b\u0012\u0004\u0012\u00020.0o2\u0006\u0010r\u001a\u00020q2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bs\u0010tJg\u0010u\u001a\u0002012\f\u0010p\u001a\b\u0012\u0004\u0012\u00020.0o2\u0006\u0010r\u001a\u00020q2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bv\u0010wJP\u0010\u0082\u0001\u001a\u0002012\u0006\u0010y\u001a\u00020x2\u0006\u0010{\u001a\u00020z2\u0006\u0010}\u001a\u00020|2\u0006\u00109\u001a\u0002082\u0012\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002010~H\u0086\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001R'\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u0012\u0005\b\u0088\u0001\u0010\u0003\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R \u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008f\u0001R\u0016\u0010{\u001a\u00020z8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010y\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0017\u0010\u0096\u0001\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0094\u0001\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\u0098\u0001"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "<init>", "()V", "Landroidx/compose/ui/graphics/Paint;", "obtainFillPaint", "()Landroidx/compose/ui/graphics/Paint;", "obtainStrokePaint", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "selectPaint", "(Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/graphics/Paint;", "Landroidx/compose/ui/graphics/Brush;", "brush", "style", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "configurePaint-swdJneE", "(Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "configurePaint", "Landroidx/compose/ui/graphics/Color;", "color", "configurePaint-2qPWKa0", "(JLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "strokeWidth", "miter", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "Landroidx/compose/ui/graphics/StrokeJoin;", "join", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "configureStrokePaint-Q_0CZUI", "(JFFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "configureStrokePaint", "configureStrokePaint-ho4zsrM", "(Landroidx/compose/ui/graphics/Brush;FFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "modulate-5vOe2sY", "(JF)J", "modulate", "Landroidx/compose/ui/geometry/Offset;", "start", "end", "", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "topLeft", "Landroidx/compose/ui/geometry/Size;", "size", "drawRect-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "radius", "center", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-AsUm42w", "drawOval", "drawOval-n-J9OG0", "startAngle", "sweepAngle", "", "useCenter", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Path;", "path", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "", APIMeta.POINTS, "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Lkotlin/Function1;", "block", "draw-yzxVdVo", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/functions/Function1;)V", "draw", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "drawParams", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "getDrawParams", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "getDrawParams$annotations", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "fillPaint", "Landroidx/compose/ui/graphics/Paint;", "strokePaint", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "getDensity", "()F", "getFontScale", "fontScale", "DrawParams", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CanvasDrawScope implements DrawScope {

    @Nullable
    private Paint fillPaint;

    @Nullable
    private Paint strokePaint;

    @NotNull
    private final DrawParams drawParams = new DrawParams(null, null, null, 0, 15, null);

    @NotNull
    private final DrawContext drawContext = new DrawContext() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1

        @NotNull
        private final DrawTransform transform = CanvasDrawScopeKt.asDrawTransform(this);

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        @NotNull
        public Canvas getCanvas() {
            return this.this$0.getDrawParams().getCanvas();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public long mo2046getSizeNHjbRc() {
            return this.this$0.getDrawParams().m2044getSizeNHjbRc();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        @NotNull
        public DrawTransform getTransform() {
            return this.transform;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
        public void mo2047setSizeuvyYCjk(long j10) {
            this.this$0.getDrawParams().m2045setSizeuvyYCjk(j10);
        }
    };

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B0\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\nJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u0019\u0010\u001f\u001a\u00020\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J>\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R%\u0010\b\u001a\u00020\tX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "size", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCanvas", "()Landroidx/compose/ui/graphics/Canvas;", "setCanvas", "(Landroidx/compose/ui/graphics/Canvas;)V", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "getSize-NH-jbRc", "()J", "setSize-uvyYCjk", "(J)V", "J", "component1", "component2", "component3", "component4", "component4-NH-jbRc", MenuActionType.COPY, "copy-Ug5Nnss", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;J)Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "equals", "", "other", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class DrawParams {

        @NotNull
        private Canvas canvas;

        @NotNull
        private Density density;

        @NotNull
        private LayoutDirection layoutDirection;
        private long size;

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(density, layoutDirection, canvas, j10);
        }

        /* JADX INFO: renamed from: copy-Ug5Nnss$default, reason: not valid java name */
        public static /* synthetic */ DrawParams m2041copyUg5Nnss$default(DrawParams drawParams, Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                density = drawParams.density;
            }
            if ((i10 & 2) != 0) {
                layoutDirection = drawParams.layoutDirection;
            }
            if ((i10 & 4) != 0) {
                canvas = drawParams.canvas;
            }
            if ((i10 & 8) != 0) {
                j10 = drawParams.size;
            }
            Canvas canvas2 = canvas;
            return drawParams.m2043copyUg5Nnss(density, layoutDirection, canvas2, j10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Density getDensity() {
            return this.density;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Canvas getCanvas() {
            return this.canvas;
        }

        /* JADX INFO: renamed from: component4-NH-jbRc, reason: not valid java name and from getter */
        public final long getSize() {
            return this.size;
        }

        @NotNull
        /* JADX INFO: renamed from: copy-Ug5Nnss, reason: not valid java name */
        public final DrawParams m2043copyUg5Nnss(@NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull Canvas canvas, long size) {
            Intrinsics.checkNotNullParameter(density, "density");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            return new DrawParams(density, layoutDirection, canvas, size, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) other;
            return Intrinsics.areEqual(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && Intrinsics.areEqual(this.canvas, drawParams.canvas) && Size.m1436equalsimpl0(this.size, drawParams.size);
        }

        @NotNull
        public final Canvas getCanvas() {
            return this.canvas;
        }

        @NotNull
        public final Density getDensity() {
            return this.density;
        }

        @NotNull
        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long m2044getSizeNHjbRc() {
            return this.size;
        }

        public int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + Size.m1441hashCodeimpl(this.size);
        }

        public final void setCanvas(@NotNull Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "<set-?>");
            this.canvas = canvas;
        }

        public final void setDensity(@NotNull Density density) {
            Intrinsics.checkNotNullParameter(density, "<set-?>");
            this.density = density;
        }

        public final void setLayoutDirection(@NotNull LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
            this.layoutDirection = layoutDirection;
        }

        /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void m2045setSizeuvyYCjk(long j10) {
            this.size = j10;
        }

        @NotNull
        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) Size.m1444toStringimpl(this.size)) + ')';
        }

        private DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j10) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.canvas = canvas;
            this.size = j10;
        }

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? CanvasDrawScopeKt.DefaultDensity : density, (i10 & 2) != 0 ? LayoutDirection.Ltr : layoutDirection, (i10 & 4) != 0 ? new EmptyCanvas() : canvas, (i10 & 8) != 0 ? Size.INSTANCE.m1449getZeroNHjbRc() : j10, null);
        }
    }

    /* JADX INFO: renamed from: configurePaint-2qPWKa0, reason: not valid java name */
    private final Paint m2010configurePaint2qPWKa0(long color, DrawStyle style, float alpha, ColorFilter colorFilter, int blendMode, int filterQuality) {
        Paint paintSelectPaint = selectPaint(style);
        long jM2018modulate5vOe2sY = m2018modulate5vOe2sY(color, alpha);
        if (!Color.m1605equalsimpl0(paintSelectPaint.mo1486getColor0d7_KjU(), jM2018modulate5vOe2sY)) {
            paintSelectPaint.mo1492setColor8_81llA(jM2018modulate5vOe2sY);
        }
        if (paintSelectPaint.getInternalShader() != null) {
            paintSelectPaint.setShader(null);
        }
        if (!Intrinsics.areEqual(paintSelectPaint.getInternalColorFilter(), colorFilter)) {
            paintSelectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m1523equalsimpl0(paintSelectPaint.get_blendMode(), blendMode)) {
            paintSelectPaint.mo1491setBlendModes9anfk8(blendMode);
        }
        if (!FilterQuality.m1694equalsimpl0(paintSelectPaint.mo1487getFilterQualityfv9h1I(), filterQuality)) {
            paintSelectPaint.mo1493setFilterQualityvDHp3xo(filterQuality);
        }
        return paintSelectPaint;
    }

    /* JADX INFO: renamed from: configurePaint-2qPWKa0$default, reason: not valid java name */
    static /* synthetic */ Paint m2011configurePaint2qPWKa0$default(CanvasDrawScope canvasDrawScope, long j10, DrawStyle drawStyle, float f10, ColorFilter colorFilter, int i10, int i11, int i12, Object obj) {
        return canvasDrawScope.m2010configurePaint2qPWKa0(j10, drawStyle, f10, colorFilter, i10, (i12 & 32) != 0 ? DrawScope.INSTANCE.m2071getDefaultFilterQualityfv9h1I() : i11);
    }

    /* JADX INFO: renamed from: configurePaint-swdJneE, reason: not valid java name */
    private final Paint m2012configurePaintswdJneE(Brush brush, DrawStyle style, float alpha, ColorFilter colorFilter, int blendMode, int filterQuality) {
        Paint paintSelectPaint = selectPaint(style);
        if (brush != null) {
            brush.mo1557applyToPq9zytI(mo2040getSizeNHjbRc(), paintSelectPaint, alpha);
        } else if (paintSelectPaint.getAlpha() != alpha) {
            paintSelectPaint.setAlpha(alpha);
        }
        if (!Intrinsics.areEqual(paintSelectPaint.getInternalColorFilter(), colorFilter)) {
            paintSelectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m1523equalsimpl0(paintSelectPaint.get_blendMode(), blendMode)) {
            paintSelectPaint.mo1491setBlendModes9anfk8(blendMode);
        }
        if (!FilterQuality.m1694equalsimpl0(paintSelectPaint.mo1487getFilterQualityfv9h1I(), filterQuality)) {
            paintSelectPaint.mo1493setFilterQualityvDHp3xo(filterQuality);
        }
        return paintSelectPaint;
    }

    /* JADX INFO: renamed from: configurePaint-swdJneE$default, reason: not valid java name */
    static /* synthetic */ Paint m2013configurePaintswdJneE$default(CanvasDrawScope canvasDrawScope, Brush brush, DrawStyle drawStyle, float f10, ColorFilter colorFilter, int i10, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            i11 = DrawScope.INSTANCE.m2071getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m2012configurePaintswdJneE(brush, drawStyle, f10, colorFilter, i10, i11);
    }

    /* JADX INFO: renamed from: configureStrokePaint-Q_0CZUI, reason: not valid java name */
    private final Paint m2014configureStrokePaintQ_0CZUI(long color, float strokeWidth, float miter, int cap, int join, PathEffect pathEffect, float alpha, ColorFilter colorFilter, int blendMode, int filterQuality) {
        Paint paintObtainStrokePaint = obtainStrokePaint();
        long jM2018modulate5vOe2sY = m2018modulate5vOe2sY(color, alpha);
        if (!Color.m1605equalsimpl0(paintObtainStrokePaint.mo1486getColor0d7_KjU(), jM2018modulate5vOe2sY)) {
            paintObtainStrokePaint.mo1492setColor8_81llA(jM2018modulate5vOe2sY);
        }
        if (paintObtainStrokePaint.getInternalShader() != null) {
            paintObtainStrokePaint.setShader(null);
        }
        if (!Intrinsics.areEqual(paintObtainStrokePaint.getInternalColorFilter(), colorFilter)) {
            paintObtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m1523equalsimpl0(paintObtainStrokePaint.get_blendMode(), blendMode)) {
            paintObtainStrokePaint.mo1491setBlendModes9anfk8(blendMode);
        }
        if (paintObtainStrokePaint.getStrokeWidth() != strokeWidth) {
            paintObtainStrokePaint.setStrokeWidth(strokeWidth);
        }
        if (paintObtainStrokePaint.getStrokeMiterLimit() != miter) {
            paintObtainStrokePaint.setStrokeMiterLimit(miter);
        }
        if (!StrokeCap.m1923equalsimpl0(paintObtainStrokePaint.mo1488getStrokeCapKaPHkGw(), cap)) {
            paintObtainStrokePaint.mo1494setStrokeCapBeK7IIE(cap);
        }
        if (!StrokeJoin.m1933equalsimpl0(paintObtainStrokePaint.mo1489getStrokeJoinLxFBmk8(), join)) {
            paintObtainStrokePaint.mo1495setStrokeJoinWw9F2mQ(join);
        }
        if (!Intrinsics.areEqual(paintObtainStrokePaint.getPathEffect(), pathEffect)) {
            paintObtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m1694equalsimpl0(paintObtainStrokePaint.mo1487getFilterQualityfv9h1I(), filterQuality)) {
            paintObtainStrokePaint.mo1493setFilterQualityvDHp3xo(filterQuality);
        }
        return paintObtainStrokePaint;
    }

    /* JADX INFO: renamed from: configureStrokePaint-Q_0CZUI$default, reason: not valid java name */
    static /* synthetic */ Paint m2015configureStrokePaintQ_0CZUI$default(CanvasDrawScope canvasDrawScope, long j10, float f10, float f11, int i10, int i11, PathEffect pathEffect, float f12, ColorFilter colorFilter, int i12, int i13, int i14, Object obj) {
        return canvasDrawScope.m2014configureStrokePaintQ_0CZUI(j10, f10, f11, i10, i11, pathEffect, f12, colorFilter, i12, (i14 & 512) != 0 ? DrawScope.INSTANCE.m2071getDefaultFilterQualityfv9h1I() : i13);
    }

    /* JADX INFO: renamed from: configureStrokePaint-ho4zsrM, reason: not valid java name */
    private final Paint m2016configureStrokePaintho4zsrM(Brush brush, float strokeWidth, float miter, int cap, int join, PathEffect pathEffect, float alpha, ColorFilter colorFilter, int blendMode, int filterQuality) {
        Paint paintObtainStrokePaint = obtainStrokePaint();
        if (brush != null) {
            brush.mo1557applyToPq9zytI(mo2040getSizeNHjbRc(), paintObtainStrokePaint, alpha);
        } else if (paintObtainStrokePaint.getAlpha() != alpha) {
            paintObtainStrokePaint.setAlpha(alpha);
        }
        if (!Intrinsics.areEqual(paintObtainStrokePaint.getInternalColorFilter(), colorFilter)) {
            paintObtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m1523equalsimpl0(paintObtainStrokePaint.get_blendMode(), blendMode)) {
            paintObtainStrokePaint.mo1491setBlendModes9anfk8(blendMode);
        }
        if (paintObtainStrokePaint.getStrokeWidth() != strokeWidth) {
            paintObtainStrokePaint.setStrokeWidth(strokeWidth);
        }
        if (paintObtainStrokePaint.getStrokeMiterLimit() != miter) {
            paintObtainStrokePaint.setStrokeMiterLimit(miter);
        }
        if (!StrokeCap.m1923equalsimpl0(paintObtainStrokePaint.mo1488getStrokeCapKaPHkGw(), cap)) {
            paintObtainStrokePaint.mo1494setStrokeCapBeK7IIE(cap);
        }
        if (!StrokeJoin.m1933equalsimpl0(paintObtainStrokePaint.mo1489getStrokeJoinLxFBmk8(), join)) {
            paintObtainStrokePaint.mo1495setStrokeJoinWw9F2mQ(join);
        }
        if (!Intrinsics.areEqual(paintObtainStrokePaint.getPathEffect(), pathEffect)) {
            paintObtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m1694equalsimpl0(paintObtainStrokePaint.mo1487getFilterQualityfv9h1I(), filterQuality)) {
            paintObtainStrokePaint.mo1493setFilterQualityvDHp3xo(filterQuality);
        }
        return paintObtainStrokePaint;
    }

    /* JADX INFO: renamed from: configureStrokePaint-ho4zsrM$default, reason: not valid java name */
    static /* synthetic */ Paint m2017configureStrokePaintho4zsrM$default(CanvasDrawScope canvasDrawScope, Brush brush, float f10, float f11, int i10, int i11, PathEffect pathEffect, float f12, ColorFilter colorFilter, int i12, int i13, int i14, Object obj) {
        return canvasDrawScope.m2016configureStrokePaintho4zsrM(brush, f10, f11, i10, i11, pathEffect, f12, colorFilter, i12, (i14 & 512) != 0 ? DrawScope.INSTANCE.m2071getDefaultFilterQualityfv9h1I() : i13);
    }

    public static /* synthetic */ void getDrawParams$annotations() {
    }

    /* JADX INFO: renamed from: modulate-5vOe2sY, reason: not valid java name */
    private final long m2018modulate5vOe2sY(long j10, float f10) {
        return f10 == 1.0f ? j10 : Color.m1603copywmQWz5c$default(j10, Color.m1606getAlphaimpl(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    private final Paint obtainFillPaint() {
        Paint paint = this.fillPaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo1496setStylek9PVt8s(PaintingStyle.INSTANCE.m1845getFillTiuSbCo());
        this.fillPaint = Paint;
        return Paint;
    }

    private final Paint obtainStrokePaint() {
        Paint paint = this.strokePaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo1496setStylek9PVt8s(PaintingStyle.INSTANCE.m1846getStrokeTiuSbCo());
        this.strokePaint = Paint;
        return Paint;
    }

    private final Paint selectPaint(DrawStyle drawStyle) {
        if (Intrinsics.areEqual(drawStyle, Fill.INSTANCE)) {
            return obtainFillPaint();
        }
        if (!(drawStyle instanceof Stroke)) {
            throw new m();
        }
        Paint paintObtainStrokePaint = obtainStrokePaint();
        Stroke stroke = (Stroke) drawStyle;
        if (paintObtainStrokePaint.getStrokeWidth() != stroke.getWidth()) {
            paintObtainStrokePaint.setStrokeWidth(stroke.getWidth());
        }
        if (!StrokeCap.m1923equalsimpl0(paintObtainStrokePaint.mo1488getStrokeCapKaPHkGw(), stroke.getCap())) {
            paintObtainStrokePaint.mo1494setStrokeCapBeK7IIE(stroke.getCap());
        }
        if (paintObtainStrokePaint.getStrokeMiterLimit() != stroke.getMiter()) {
            paintObtainStrokePaint.setStrokeMiterLimit(stroke.getMiter());
        }
        if (!StrokeJoin.m1933equalsimpl0(paintObtainStrokePaint.mo1489getStrokeJoinLxFBmk8(), stroke.getJoin())) {
            paintObtainStrokePaint.mo1495setStrokeJoinWw9F2mQ(stroke.getJoin());
        }
        if (!Intrinsics.areEqual(paintObtainStrokePaint.getPathEffect(), stroke.getPathEffect())) {
            paintObtainStrokePaint.setPathEffect(stroke.getPathEffect());
        }
        return paintObtainStrokePaint;
    }

    /* JADX INFO: renamed from: draw-yzxVdVo, reason: not valid java name */
    public final void m2019drawyzxVdVo(@NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull Canvas canvas, long size, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawParams drawParams = getDrawParams();
        Density density2 = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        Canvas canvas2 = drawParams.getCanvas();
        long size2 = drawParams.getSize();
        DrawParams drawParams2 = getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m2045setSizeuvyYCjk(size);
        canvas.save();
        block.invoke(this);
        canvas.restore();
        DrawParams drawParams3 = getDrawParams();
        drawParams3.setDensity(density2);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas2);
        drawParams3.m2045setSizeuvyYCjk(size2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-illE91I, reason: not valid java name */
    public void mo2020drawArcillE91I(@NotNull Brush brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawArc(Offset.m1371getXimpl(topLeft), Offset.m1372getYimpl(topLeft), Offset.m1371getXimpl(topLeft) + Size.m1440getWidthimpl(size), Offset.m1372getYimpl(topLeft) + Size.m1437getHeightimpl(size), startAngle, sweepAngle, useCenter, m2013configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-yD3GUKo, reason: not valid java name */
    public void mo2021drawArcyD3GUKo(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawArc(Offset.m1371getXimpl(topLeft), Offset.m1372getYimpl(topLeft), Offset.m1371getXimpl(topLeft) + Size.m1440getWidthimpl(size), Offset.m1372getYimpl(topLeft) + Size.m1437getHeightimpl(size), startAngle, sweepAngle, useCenter, m2011configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-V9BoPsw, reason: not valid java name */
    public void mo2022drawCircleV9BoPsw(@NotNull Brush brush, float radius, long center, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().mo1469drawCircle9KIMszo(center, radius, m2013configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-VaOC9Bg, reason: not valid java name */
    public void mo2023drawCircleVaOC9Bg(long color, float radius, long center, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().mo1469drawCircle9KIMszo(center, radius, m2011configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-9jGpkUE, reason: not valid java name */
    public /* synthetic */ void mo2024drawImage9jGpkUE(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().mo1471drawImageRectHPBpro0(image, srcOffset, srcSize, dstOffset, dstSize, m2013configurePaintswdJneE$default(this, null, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-AZ2fEMs, reason: not valid java name */
    public void mo2025drawImageAZ2fEMs(@NotNull ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode, int filterQuality) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().mo1471drawImageRectHPBpro0(image, srcOffset, srcSize, dstOffset, dstSize, m2012configurePaintswdJneE(null, style, alpha, colorFilter, blendMode, filterQuality));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-gbVJVH8, reason: not valid java name */
    public void mo2026drawImagegbVJVH8(@NotNull ImageBitmap image, long topLeft, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().mo1470drawImaged4ec7I(image, topLeft, m2013configurePaintswdJneE$default(this, null, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-1RTmtNc, reason: not valid java name */
    public void mo2027drawLine1RTmtNc(@NotNull Brush brush, long start, long end, float strokeWidth, int cap, @Nullable PathEffect pathEffect, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.drawParams.getCanvas().mo1472drawLineWko1d7g(start, end, m2017configureStrokePaintho4zsrM$default(this, brush, strokeWidth, 4.0f, cap, StrokeJoin.INSTANCE.m1938getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-NGM6Ib0, reason: not valid java name */
    public void mo2028drawLineNGM6Ib0(long color, long start, long end, float strokeWidth, int cap, @Nullable PathEffect pathEffect, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo1472drawLineWko1d7g(start, end, m2015configureStrokePaintQ_0CZUI$default(this, color, strokeWidth, 4.0f, cap, StrokeJoin.INSTANCE.m1938getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-AsUm42w, reason: not valid java name */
    public void mo2029drawOvalAsUm42w(@NotNull Brush brush, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawOval(Offset.m1371getXimpl(topLeft), Offset.m1372getYimpl(topLeft), Offset.m1371getXimpl(topLeft) + Size.m1440getWidthimpl(size), Offset.m1372getYimpl(topLeft) + Size.m1437getHeightimpl(size), m2013configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-n-J9OG0, reason: not valid java name */
    public void mo2030drawOvalnJ9OG0(long color, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawOval(Offset.m1371getXimpl(topLeft), Offset.m1372getYimpl(topLeft), Offset.m1371getXimpl(topLeft) + Size.m1440getWidthimpl(size), Offset.m1372getYimpl(topLeft) + Size.m1437getHeightimpl(size), m2011configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-GBMwjPU, reason: not valid java name */
    public void mo2031drawPathGBMwjPU(@NotNull Path path, @NotNull Brush brush, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawPath(path, m2013configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-LG529CI, reason: not valid java name */
    public void mo2032drawPathLG529CI(@NotNull Path path, long color, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawPath(path, m2011configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-F8ZwMP8, reason: not valid java name */
    public void mo2033drawPointsF8ZwMP8(@NotNull List<Offset> points, int pointMode, long color, float strokeWidth, int cap, @Nullable PathEffect pathEffect, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.drawParams.getCanvas().mo1473drawPointsO7TthRY(pointMode, points, m2015configureStrokePaintQ_0CZUI$default(this, color, strokeWidth, 4.0f, cap, StrokeJoin.INSTANCE.m1938getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-Gsft0Ws, reason: not valid java name */
    public void mo2034drawPointsGsft0Ws(@NotNull List<Offset> points, int pointMode, @NotNull Brush brush, float strokeWidth, int cap, @Nullable PathEffect pathEffect, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.drawParams.getCanvas().mo1473drawPointsO7TthRY(pointMode, points, m2017configureStrokePaintho4zsrM$default(this, brush, strokeWidth, 4.0f, cap, StrokeJoin.INSTANCE.m1938getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-AsUm42w, reason: not valid java name */
    public void mo2035drawRectAsUm42w(@NotNull Brush brush, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawRect(Offset.m1371getXimpl(topLeft), Offset.m1372getYimpl(topLeft), Offset.m1371getXimpl(topLeft) + Size.m1440getWidthimpl(size), Offset.m1372getYimpl(topLeft) + Size.m1437getHeightimpl(size), m2013configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-n-J9OG0, reason: not valid java name */
    public void mo2036drawRectnJ9OG0(long color, long topLeft, long size, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawRect(Offset.m1371getXimpl(topLeft), Offset.m1372getYimpl(topLeft), Offset.m1371getXimpl(topLeft) + Size.m1440getWidthimpl(size), Offset.m1372getYimpl(topLeft) + Size.m1437getHeightimpl(size), m2011configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-ZuiqVtQ, reason: not valid java name */
    public void mo2037drawRoundRectZuiqVtQ(@NotNull Brush brush, long topLeft, long size, long cornerRadius, float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawRoundRect(Offset.m1371getXimpl(topLeft), Offset.m1372getYimpl(topLeft), Offset.m1371getXimpl(topLeft) + Size.m1440getWidthimpl(size), Offset.m1372getYimpl(topLeft) + Size.m1437getHeightimpl(size), CornerRadius.m1346getXimpl(cornerRadius), CornerRadius.m1347getYimpl(cornerRadius), m2013configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-u-Aw5IA, reason: not valid java name */
    public void mo2038drawRoundRectuAw5IA(long color, long topLeft, long size, long cornerRadius, @NotNull DrawStyle style, float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.drawParams.getCanvas().drawRoundRect(Offset.m1371getXimpl(topLeft), Offset.m1372getYimpl(topLeft), Offset.m1371getXimpl(topLeft) + Size.m1440getWidthimpl(size), Offset.m1372getYimpl(topLeft) + Size.m1437getHeightimpl(size), CornerRadius.m1346getXimpl(cornerRadius), CornerRadius.m1347getYimpl(cornerRadius), m2011configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public /* synthetic */ long mo2039getCenterF1C5BW0() {
        return b.b(this);
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.drawParams.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @NotNull
    public DrawContext getDrawContext() {
        return this.drawContext;
    }

    @NotNull
    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.drawParams.getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.drawParams.getLayoutDirection();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public /* synthetic */ long mo2040getSizeNHjbRc() {
        return b.c(this);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo301roundToPxR2X_6o(long j10) {
        return androidx.compose.ui.unit.a.a(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo302roundToPx0680j_4(float f10) {
        return androidx.compose.ui.unit.a.b(this, f10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public /* synthetic */ float mo303toDpGaN1DYA(long j10) {
        return androidx.compose.ui.unit.a.c(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo304toDpu2uoSUM(float f10) {
        return androidx.compose.ui.unit.a.d(this, f10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo306toDpSizekrfVVM(long j10) {
        return androidx.compose.ui.unit.a.f(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo307toPxR2X_6o(long j10) {
        return androidx.compose.ui.unit.a.g(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo308toPx0680j_4(float f10) {
        return androidx.compose.ui.unit.a.h(this, f10);
    }

    @Override // androidx.compose.ui.unit.Density
    public /* synthetic */ Rect toRect(DpRect dpRect) {
        return androidx.compose.ui.unit.a.i(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo309toSizeXkaWNTQ(long j10) {
        return androidx.compose.ui.unit.a.j(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public /* synthetic */ long mo310toSp0xMU5do(float f10) {
        return androidx.compose.ui.unit.a.k(this, f10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo311toSpkPz2Gy4(float f10) {
        return androidx.compose.ui.unit.a.l(this, f10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo305toDpu2uoSUM(int i10) {
        return androidx.compose.ui.unit.a.e(this, i10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo312toSpkPz2Gy4(int i10) {
        return androidx.compose.ui.unit.a.m(this, i10);
    }
}
