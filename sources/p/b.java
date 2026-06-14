package p;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.InspectionModeKt;
import b0.c;
import coil.compose.AsyncImagePainter;
import kotlin.jvm.functions.Function1;
import y.h;
import z.c;
import z.i;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f97986a = new a();

    public static final class a implements b0.c {
        a() {
        }

        @Override // a0.a
        public void a(Drawable drawable) {
            c.a.c(this, drawable);
        }

        @Override // a0.a
        public void b(Drawable drawable) {
            c.a.b(this, drawable);
        }

        @Override // a0.a
        public void c(Drawable drawable) {
            c.a.a(this, drawable);
        }
    }

    private static final boolean c(long j10) {
        return ((double) Size.m1440getWidthimpl(j10)) >= 0.5d && ((double) Size.m1437getHeightimpl(j10)) >= 0.5d;
    }

    public static final AsyncImagePainter d(Object obj, o.e eVar, Function1 function1, Function1 function12, ContentScale contentScale, int i10, Composer composer, int i11, int i12) {
        composer.startReplaceableGroup(-2020614074);
        if ((i12 & 4) != 0) {
            function1 = AsyncImagePainter.INSTANCE.a();
        }
        if ((i12 & 8) != 0) {
            function12 = null;
        }
        if ((i12 & 16) != 0) {
            contentScale = ContentScale.INSTANCE.getFit();
        }
        if ((i12 & 32) != 0) {
            i10 = DrawScope.INSTANCE.m2071getDefaultFilterQualityfv9h1I();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2020614074, i11, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:131)");
        }
        h hVarD = g.d(obj, composer, 8);
        h(hVarD);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new AsyncImagePainter(hVarD, eVar);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) objRememberedValue;
        asyncImagePainter.x(function1);
        asyncImagePainter.s(function12);
        asyncImagePainter.p(contentScale);
        asyncImagePainter.q(i10);
        asyncImagePainter.u(((Boolean) composer.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue());
        asyncImagePainter.r(eVar);
        asyncImagePainter.v(hVarD);
        asyncImagePainter.onRemembered();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asyncImagePainter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i e(long j10) {
        if (j10 == Size.INSTANCE.m1448getUnspecifiedNHjbRc()) {
            return i.f119134d;
        }
        if (!c(j10)) {
            return null;
        }
        float fM1440getWidthimpl = Size.m1440getWidthimpl(j10);
        z.c cVarA = (Float.isInfinite(fM1440getWidthimpl) || Float.isNaN(fM1440getWidthimpl)) ? c.b.f119121a : z.a.a(zf.a.d(Size.m1440getWidthimpl(j10)));
        float fM1437getHeightimpl = Size.m1437getHeightimpl(j10);
        return new i(cVarA, (Float.isInfinite(fM1437getHeightimpl) || Float.isNaN(fM1437getHeightimpl)) ? c.b.f119121a : z.a.a(zf.a.d(Size.m1437getHeightimpl(j10))));
    }

    private static final Void f(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    static /* synthetic */ Void g(String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return f(str, str2);
    }

    private static final void h(h hVar) {
        Object objM = hVar.m();
        if (objM instanceof h.a) {
            f("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new lf.g();
        }
        if (objM instanceof ImageBitmap) {
            g("ImageBitmap", null, 2, null);
            throw new lf.g();
        }
        if (objM instanceof ImageVector) {
            g("ImageVector", null, 2, null);
            throw new lf.g();
        }
        if (objM instanceof Painter) {
            g("Painter", null, 2, null);
            throw new lf.g();
        }
        if (hVar.M() != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
    }
}
