package coil.compose;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import eg.m1;
import eg.o0;
import hg.l0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p.g;
import pf.b;
import y.h;
import y.i;
import y.p;
import z.j;

/* JADX INFO: loaded from: classes5.dex */
@Stable
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0002-{B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u000e*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0001*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\t*\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010%H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010\u000bJ\u000f\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010\u000bJ\u000f\u0010+\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010\u000bR\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u00104\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b2\u00103R/\u0010<\u001a\u0004\u0018\u00010\u00012\b\u00105\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R+\u0010!\u001a\u00020 2\u0006\u00105\u001a\u00020 8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR/\u0010&\u001a\u0004\u0018\u00010%2\b\u00105\u001a\u0004\u0018\u00010%8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bB\u00107\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010J\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\u000e8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\n\u0010H\"\u0004\bI\u0010\u0011R(\u0010M\u001a\u0004\u0018\u00010\u00012\b\u0010G\u001a\u0004\u0018\u00010\u00018\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b>\u0010K\"\u0004\bL\u0010;R.\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0N8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR0\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010N8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010O\u001a\u0004\bV\u0010Q\"\u0004\bW\u0010SR\"\u0010_\u001a\u00020Y8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R+\u0010g\u001a\u00020`8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010m\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR+\u0010q\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000e8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u00107\u001a\u0004\bn\u0010o\"\u0004\bp\u0010\u0011R+\u0010\u0004\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00038F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bE\u00107\u001a\u0004\ba\u0010r\"\u0004\bs\u0010tR+\u0010\u0006\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00058F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b]\u00107\u001a\u0004\bU\u0010u\"\u0004\bv\u0010wR\u001d\u0010z\u001a\u0002018VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bx\u0010y\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006|"}, d2 = {"Lcoil/compose/AsyncImagePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/RememberObserver;", "Ly/h;", "request", "Lo/e;", "imageLoader", "<init>", "(Ly/h;Lo/e;)V", "", "g", "()V", "C", "(Ly/h;)Ly/h;", "Lcoil/compose/AsyncImagePainter$State;", "input", "D", "(Lcoil/compose/AsyncImagePainter$State;)V", "previous", "current", "Lcoil/compose/CrossfadePainter;", "m", "(Lcoil/compose/AsyncImagePainter$State;Lcoil/compose/AsyncImagePainter$State;)Lcoil/compose/CrossfadePainter;", "Ly/i;", "B", "(Ly/i;)Lcoil/compose/AsyncImagePainter$State;", "Landroid/graphics/drawable/Drawable;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Landroid/graphics/drawable/Drawable;)Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "alpha", "", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "onRemembered", "onForgotten", "onAbandoned", "Lkotlinx/coroutines/CoroutineScope;", "b", "Lkotlinx/coroutines/CoroutineScope;", "rememberScope", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/ui/geometry/Size;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lkotlinx/coroutines/flow/MutableStateFlow;", "drawSize", "<set-?>", "d", "Landroidx/compose/runtime/MutableState;", CampaignEx.JSON_KEY_AD_K, "()Landroidx/compose/ui/graphics/painter/Painter;", ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "(Landroidx/compose/ui/graphics/painter/Painter;)V", "painter", EidRequestBuilder.REQUEST_FIELD_EMAIL, "h", "()F", "n", "(F)V", InneractiveMediationDefs.GENDER_FEMALE, CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "()Landroidx/compose/ui/graphics/ColorFilter;", "o", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "value", "Lcoil/compose/AsyncImagePainter$State;", "z", "_state", "Landroidx/compose/ui/graphics/painter/Painter;", "y", "_painter", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getTransform$coil_compose_base_release", "()Lkotlin/jvm/functions/Function1;", "x", "(Lkotlin/jvm/functions/Function1;)V", "transform", "j", "getOnState$coil_compose_base_release", "s", "onState", "Landroidx/compose/ui/layout/ContentScale;", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale$coil_compose_base_release", "()Landroidx/compose/ui/layout/ContentScale;", "p", "(Landroidx/compose/ui/layout/ContentScale;)V", "contentScale", "Landroidx/compose/ui/graphics/FilterQuality;", CmcdData.Factory.STREAM_TYPE_LIVE, "I", "getFilterQuality-f-v9h1I$coil_compose_base_release", "()I", CampaignEx.JSON_KEY_AD_Q, "(I)V", "filterQuality", "Z", "isPreview$coil_compose_base_release", "()Z", ApsMetricsDataMap.APSMETRICS_FIELD_URL, "(Z)V", "isPreview", "getState", "()Lcoil/compose/AsyncImagePainter$State;", POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "state", "()Ly/h;", "v", "(Ly/h;)V", "()Lo/e;", "r", "(Lo/e;)V", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "State", "coil-compose-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AsyncImagePainter extends Painter implements RememberObserver {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Function1 f6874r = a.f6893f;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private CoroutineScope rememberScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow drawSize = l0.a(Size.m1428boximpl(Size.INSTANCE.m1449getZeroNHjbRc()));

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final MutableState painter = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final MutableState alpha = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final MutableState colorFilter = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private State _state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Painter _painter;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Function1 transform;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Function1 onState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private ContentScale contentScale;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int filterQuality;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean isPreview;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableState state;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final MutableState request;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final MutableState imageLoader;

    public static abstract class State {

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Error;", "Lcoil/compose/AsyncImagePainter$State;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "Ly/e;", "result", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Ly/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/painter/Painter;", "a", "()Landroidx/compose/ui/graphics/painter/Painter;", "Ly/e;", "b", "()Ly/e;", "coil-compose-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final /* data */ class Error extends State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final y.e result;

            @Nullable
            private final Painter painter;

            public Error(Painter painter, y.e eVar) {
                super(null);
                this.painter = painter;
                this.result = eVar;
            }

            @Override // coil.compose.AsyncImagePainter.State
            /* JADX INFO: renamed from: a, reason: from getter */
            public Painter getPainter() {
                return this.painter;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final y.e getResult() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return Intrinsics.areEqual(getPainter(), error.getPainter()) && Intrinsics.areEqual(this.result, error.result);
            }

            public int hashCode() {
                return ((getPainter() == null ? 0 : getPainter().hashCode()) * 31) + this.result.hashCode();
            }

            public String toString() {
                return "Error(painter=" + getPainter() + ", result=" + this.result + ')';
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Loading;", "Lcoil/compose/AsyncImagePainter$State;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/painter/Painter;", "a", "()Landroidx/compose/ui/graphics/painter/Painter;", "coil-compose-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final /* data */ class Loading extends State {

            @Nullable
            private final Painter painter;

            public Loading(Painter painter) {
                super(null);
                this.painter = painter;
            }

            @Override // coil.compose.AsyncImagePainter.State
            /* JADX INFO: renamed from: a, reason: from getter */
            public Painter getPainter() {
                return this.painter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loading) && Intrinsics.areEqual(getPainter(), ((Loading) other).getPainter());
            }

            public int hashCode() {
                if (getPainter() == null) {
                    return 0;
                }
                return getPainter().hashCode();
            }

            public String toString() {
                return "Loading(painter=" + getPainter() + ')';
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Success;", "Lcoil/compose/AsyncImagePainter$State;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "Ly/p;", "result", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Ly/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/painter/Painter;", "a", "()Landroidx/compose/ui/graphics/painter/Painter;", "Ly/p;", "b", "()Ly/p;", "coil-compose-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final /* data */ class Success extends State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final p result;

            @NotNull
            private final Painter painter;

            public Success(Painter painter, p pVar) {
                super(null);
                this.painter = painter;
                this.result = pVar;
            }

            @Override // coil.compose.AsyncImagePainter.State
            /* JADX INFO: renamed from: a, reason: from getter */
            public Painter getPainter() {
                return this.painter;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final p getResult() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.areEqual(getPainter(), success.getPainter()) && Intrinsics.areEqual(this.result, success.result);
            }

            public int hashCode() {
                return (getPainter().hashCode() * 31) + this.result.hashCode();
            }

            public String toString() {
                return "Success(painter=" + getPainter() + ", result=" + this.result + ')';
            }
        }

        public static final class a extends State {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f6892a = new a();

            private a() {
                super(null);
            }

            @Override // coil.compose.AsyncImagePainter.State
            /* JADX INFO: renamed from: a */
            public Painter getPainter() {
                return null;
            }
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public abstract Painter getPainter();

        private State() {
        }
    }

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f6893f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final State invoke(State state) {
            return state;
        }
    }

    /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function1 a() {
            return AsyncImagePainter.f6874r;
        }

        private Companion() {
        }
    }

    static final class c extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6894r;

        static final class a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ AsyncImagePainter f6896f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AsyncImagePainter asyncImagePainter) {
                super(0);
                this.f6896f = asyncImagePainter;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final h invoke() {
                return this.f6896f.l();
            }
        }

        static final class b extends k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f6897r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f6898s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ AsyncImagePainter f6899t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AsyncImagePainter asyncImagePainter, Continuation continuation) {
                super(2, continuation);
                this.f6899t = asyncImagePainter;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h hVar, Continuation continuation) {
                return ((b) create(hVar, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.f6899t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AsyncImagePainter asyncImagePainter;
                Object objG = pf.b.g();
                int i10 = this.f6898s;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    AsyncImagePainter asyncImagePainter2 = this.f6899t;
                    o.e eVarJ = asyncImagePainter2.j();
                    AsyncImagePainter asyncImagePainter3 = this.f6899t;
                    h hVarC = asyncImagePainter3.C(asyncImagePainter3.l());
                    this.f6897r = asyncImagePainter2;
                    this.f6898s = 1;
                    Object objA = eVarJ.a(hVarC, this);
                    if (objA == objG) {
                        return objG;
                    }
                    asyncImagePainter = asyncImagePainter2;
                    obj = objA;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    asyncImagePainter = (AsyncImagePainter) this.f6897r;
                    kotlin.d.b(obj);
                }
                return asyncImagePainter.B((i) obj);
            }
        }

        /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$c$c, reason: collision with other inner class name */
        /* synthetic */ class C0155c implements FlowCollector, v {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AsyncImagePainter f6900b;

            C0155c(AsyncImagePainter asyncImagePainter) {
                this.f6900b = asyncImagePainter;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(State state, Continuation continuation) {
                Object objI = c.i(this.f6900b, state, continuation);
                return objI == pf.b.g() ? objI : Unit.f93236a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof v)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((v) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.v
            public final lf.e getFunctionDelegate() {
                return new kotlin.jvm.internal.a(2, this.f6900b, AsyncImagePainter.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        c(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object i(AsyncImagePainter asyncImagePainter, State state, Continuation continuation) {
            asyncImagePainter.D(state);
            return Unit.f93236a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return AsyncImagePainter.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f6894r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                Flow flowG = hg.i.G(SnapshotStateKt.snapshotFlow(new a(AsyncImagePainter.this)), new b(AsyncImagePainter.this, null));
                C0155c c0155c = new C0155c(AsyncImagePainter.this);
                this.f6894r = 1;
                if (flowG.collect(c0155c, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public static final class d implements a0.a {
        public d() {
        }

        @Override // a0.a
        public void a(Drawable drawable) {
        }

        @Override // a0.a
        public void b(Drawable drawable) {
            AsyncImagePainter.this.D(new State.Loading(drawable != null ? AsyncImagePainter.this.A(drawable) : null));
        }

        @Override // a0.a
        public void c(Drawable drawable) {
        }
    }

    static final class e implements j {

        public static final class a implements Flow {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Flow f6903b;

            /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$e$a$a, reason: collision with other inner class name */
            public static final class C0156a implements FlowCollector {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ FlowCollector f6904b;

                /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$e$a$a$a, reason: collision with other inner class name */
                public static final class C0157a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f6905r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    int f6906s;

                    public C0157a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f6905r = obj;
                        this.f6906s |= Integer.MIN_VALUE;
                        return C0156a.this.emit(null, this);
                    }
                }

                public C0156a(FlowCollector flowCollector) {
                    this.f6904b = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof coil.compose.AsyncImagePainter.e.a.C0156a.C0157a
                        if (r0 == 0) goto L13
                        r0 = r8
                        coil.compose.AsyncImagePainter$e$a$a$a r0 = (coil.compose.AsyncImagePainter.e.a.C0156a.C0157a) r0
                        int r1 = r0.f6906s
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f6906s = r1
                        goto L18
                    L13:
                        coil.compose.AsyncImagePainter$e$a$a$a r0 = new coil.compose.AsyncImagePainter$e$a$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f6905r
                        java.lang.Object r1 = pf.b.g()
                        int r2 = r0.f6906s
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.d.b(r8)
                        goto L4b
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        kotlin.d.b(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.f6904b
                        androidx.compose.ui.geometry.Size r7 = (androidx.compose.ui.geometry.Size) r7
                        long r4 = r7.getPackedValue()
                        z.i r7 = p.b.b(r4)
                        if (r7 == 0) goto L4b
                        r0.f6906s = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L4b
                        return r1
                    L4b:
                        kotlin.Unit r7 = kotlin.Unit.f93236a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: coil.compose.AsyncImagePainter.e.a.C0156a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public a(Flow flow) {
                this.f6903b = flow;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f6903b.collect(new C0156a(flowCollector), continuation);
                return objCollect == b.g() ? objCollect : Unit.f93236a;
            }
        }

        e() {
        }

        @Override // z.j
        public final Object b(Continuation continuation) {
            return hg.i.x(new a(AsyncImagePainter.this.drawSize), continuation);
        }
    }

    public AsyncImagePainter(h hVar, o.e eVar) {
        State.a aVar = State.a.f6892a;
        this._state = aVar;
        this.transform = f6874r;
        this.contentScale = ContentScale.INSTANCE.getFit();
        this.filterQuality = DrawScope.INSTANCE.m2071getDefaultFilterQualityfv9h1I();
        this.state = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(aVar, null, 2, null);
        this.request = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(hVar, null, 2, null);
        this.imageLoader = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(eVar, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Painter A(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? BitmapPainterKt.m2136BitmapPainterQZhYCtY$default(AndroidImageBitmap_androidKt.asImageBitmap(((BitmapDrawable) drawable).getBitmap()), 0L, 0L, this.filterQuality, 6, null) : drawable instanceof ColorDrawable ? new ColorPainter(ColorKt.Color(((ColorDrawable) drawable).getColor()), null) : new DrawablePainter(drawable.mutate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State B(i iVar) {
        if (iVar instanceof p) {
            p pVar = (p) iVar;
            return new State.Success(A(pVar.a()), pVar);
        }
        if (!(iVar instanceof y.e)) {
            throw new m();
        }
        Drawable drawableA = iVar.a();
        return new State.Error(drawableA != null ? A(drawableA) : null, (y.e) iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h C(h request) {
        h.a aVarL = h.R(request, null, 1, null).l(new d());
        if (request.q().m() == null) {
            aVarL.k(new e());
        }
        if (request.q().l() == null) {
            aVarL.j(g.f(this.contentScale));
        }
        if (request.q().k() != z.e.EXACT) {
            aVarL.d(z.e.INEXACT);
        }
        return aVarL.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(State input) {
        State state = this._state;
        State state2 = (State) this.transform.invoke(input);
        z(state2);
        m(state, state2);
        y(state2.getPainter());
        if (this.rememberScope != null && state.getPainter() != state2.getPainter()) {
            Object painter = state.getPainter();
            RememberObserver rememberObserver = painter instanceof RememberObserver ? (RememberObserver) painter : null;
            if (rememberObserver != null) {
                rememberObserver.onForgotten();
            }
            Object painter2 = state2.getPainter();
            RememberObserver rememberObserver2 = painter2 instanceof RememberObserver ? (RememberObserver) painter2 : null;
            if (rememberObserver2 != null) {
                rememberObserver2.onRemembered();
            }
        }
        Function1 function1 = this.onState;
        if (function1 != null) {
            function1.invoke(state2);
        }
    }

    private final void g() {
        CoroutineScope coroutineScope = this.rememberScope;
        if (coroutineScope != null) {
            kotlinx.coroutines.i.f(coroutineScope, null, 1, null);
        }
        this.rememberScope = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float h() {
        return ((Number) this.alpha.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ColorFilter i() {
        return (ColorFilter) this.colorFilter.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Painter k() {
        return (Painter) this.painter.getValue();
    }

    private final CrossfadePainter m(State previous, State current) {
        i result;
        if (!(current instanceof State.Success)) {
            if (current instanceof State.Error) {
                result = ((State.Error) current).getResult();
            }
            return null;
        }
        result = ((State.Success) current).getResult();
        result.b().P().a(p.b.f97986a, result);
        return null;
    }

    private final void n(float f10) {
        this.alpha.setValue(Float.valueOf(f10));
    }

    private final void o(ColorFilter colorFilter) {
        this.colorFilter.setValue(colorFilter);
    }

    private final void t(Painter painter) {
        this.painter.setValue(painter);
    }

    private final void w(State state) {
        this.state.setValue(state);
    }

    private final void y(Painter painter) {
        this._painter = painter;
        t(painter);
    }

    private final void z(State state) {
        this._state = state;
        w(state);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float alpha) {
        n(alpha);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(ColorFilter colorFilter) {
        o(colorFilter);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        Painter painterK = k();
        return painterK != null ? painterK.getIntrinsicSize() : Size.INSTANCE.m1448getUnspecifiedNHjbRc();
    }

    public final o.e j() {
        return (o.e) this.imageLoader.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final h l() {
        return (h) this.request.getValue();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        g();
        Object obj = this._painter;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onAbandoned();
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void onDraw(DrawScope drawScope) {
        this.drawSize.setValue(Size.m1428boximpl(drawScope.mo2040getSizeNHjbRc()));
        Painter painterK = k();
        if (painterK != null) {
            painterK.m2139drawx_KDEd0(drawScope, drawScope.mo2040getSizeNHjbRc(), h(), i());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        g();
        Object obj = this._painter;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onForgotten();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        if (this.rememberScope != null) {
            return;
        }
        CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(m1.b(null, 1, null).plus(o0.c().w()));
        this.rememberScope = coroutineScopeA;
        Object obj = this._painter;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onRemembered();
        }
        if (!this.isPreview) {
            eg.i.d(coroutineScopeA, null, null, new c(null), 3, null);
        } else {
            Drawable drawableF = h.R(l(), null, 1, null).c(j().c()).a().F();
            D(new State.Loading(drawableF != null ? A(drawableF) : null));
        }
    }

    public final void p(ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final void q(int i10) {
        this.filterQuality = i10;
    }

    public final void r(o.e eVar) {
        this.imageLoader.setValue(eVar);
    }

    public final void s(Function1 function1) {
        this.onState = function1;
    }

    public final void u(boolean z10) {
        this.isPreview = z10;
    }

    public final void v(h hVar) {
        this.request.setValue(hVar);
    }

    public final void x(Function1 function1) {
        this.transform = function1;
    }
}
