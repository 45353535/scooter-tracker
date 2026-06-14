package p;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d {

    static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f97994f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final o.e invoke() {
            return null;
        }
    }

    public static /* synthetic */ ProvidableCompositionLocal b(ProvidableCompositionLocal providableCompositionLocal, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            providableCompositionLocal = CompositionLocalKt.staticCompositionLocalOf(a.f97994f);
        }
        return a(providableCompositionLocal);
    }

    public static final o.e c(ProvidableCompositionLocal providableCompositionLocal, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-617597678, i10, -1, "coil.compose.ImageLoaderProvidableCompositionLocal.<get-current> (LocalImageLoader.kt:49)");
        }
        o.e eVarA = (o.e) composer.consume(providableCompositionLocal);
        if (eVarA == null) {
            eVarA = o.a.a((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return eVarA;
    }

    public static ProvidableCompositionLocal a(ProvidableCompositionLocal providableCompositionLocal) {
        return providableCompositionLocal;
    }
}
