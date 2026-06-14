package f1;

import android.content.Context;
import android.view.View;
import android.webkit.WebChromeClient;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public abstract class r6 extends k6 {

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f70967f = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l4 invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new l4(it);
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ da f70968f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ tf f70969g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(da daVar, tf tfVar) {
            super(1);
            this.f70968f = daVar;
            this.f70969g = tfVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WebChromeClient invoke(View container) {
            Intrinsics.checkNotNullParameter(container, "container");
            return new p0(container, this.f70968f, this.f70969g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(Context context, String html, v5 callback, zb impressionInterface, String str, da nativeBridgeCommand, tf webViewCorsErrorHandler, Cif eventTracker, Function1 cbWebViewFactory) {
        super(context, html, callback, impressionInterface, str, eventTracker, cbWebViewFactory, new b(nativeBridgeCommand, webViewCorsErrorHandler), null, 256, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(webViewCorsErrorHandler, "webViewCorsErrorHandler");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
    }

    public /* synthetic */ r6(Context context, String str, v5 v5Var, zb zbVar, String str2, da daVar, tf tfVar, Cif cif, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, v5Var, zbVar, str2, daVar, (i10 & 64) != 0 ? new tf() : tfVar, cif, (i10 & 256) != 0 ? a.f70967f : function1);
    }
}
