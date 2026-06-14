package p;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import coil.compose.AsyncImagePainter;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public abstract class f {

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f97996f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f97997g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f97998h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f97999i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1 f98000j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Alignment f98001k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ ContentScale f98002l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f98003m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ColorFilter f98004n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f98005o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f98006p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f98007q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, String str, Modifier modifier, Function1 function1, Function1 function12, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, int i10, int i11, int i12) {
            super(2);
            this.f97996f = obj;
            this.f97997g = str;
            this.f97998h = modifier;
            this.f97999i = function1;
            this.f98000j = function12;
            this.f98001k = alignment;
            this.f98002l = contentScale;
            this.f98003m = f10;
            this.f98004n = colorFilter;
            this.f98005o = i10;
            this.f98006p = i11;
            this.f98007q = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Unit.f93236a;
        }

        public final void invoke(Composer composer, int i10) {
            f.a(this.f97996f, this.f97997g, this.f97998h, this.f97999i, this.f98000j, this.f98001k, this.f98002l, this.f98003m, this.f98004n, this.f98005o, composer, this.f98006p | 1, this.f98007q);
        }
    }

    public static final void a(Object obj, String str, Modifier modifier, Function1 function1, Function1 function12, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, int i10, Composer composer, int i11, int i12) {
        int i13;
        Function1 function1A;
        int i14;
        int iM2071getDefaultFilterQualityfv9h1I;
        Composer composerStartRestartGroup = composer.startRestartGroup(-941517612);
        Modifier modifier2 = (i12 & 4) != 0 ? Modifier.INSTANCE : modifier;
        if ((i12 & 8) != 0) {
            i13 = i11;
            function1A = AsyncImagePainter.INSTANCE.a();
            i14 = i13 & (-7169);
        } else {
            i13 = i11;
            function1A = function1;
            i14 = i13;
        }
        Function1 function13 = (i12 & 16) != 0 ? null : function12;
        Alignment center = (i12 & 32) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i12 & 64) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f11 = (i12 & 128) != 0 ? 1.0f : f10;
        ColorFilter colorFilter2 = (i12 & 256) != 0 ? null : colorFilter;
        if ((i12 & 512) != 0) {
            i14 &= -1879048193;
            iM2071getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m2071getDefaultFilterQualityfv9h1I();
        } else {
            iM2071getDefaultFilterQualityfv9h1I = i10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-941517612, i14, -1, "coil.compose.AsyncImage (SingletonAsyncImage.kt:99)");
        }
        int i15 = i14 << 3;
        p.a.a(obj, str, d.c(e.a(), composerStartRestartGroup, 6), modifier2, function1A, function13, center, fit, f11, colorFilter2, iM2071getDefaultFilterQualityfv9h1I, composerStartRestartGroup, (i14 & 112) | IronSourceError.ERROR_NO_INTERNET_CONNECTION | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (234881024 & i15) | (i15 & 1879048192), (i14 >> 27) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(obj, str, modifier2, function1A, function13, center, fit, f11, colorFilter2, iM2071getDefaultFilterQualityfv9h1I, i13, i12));
    }
}
