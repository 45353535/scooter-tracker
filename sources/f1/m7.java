package f1;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class m7 extends r6 {

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f70469f = new a();

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(Context context, String html, v5 callback, zb impressionInterface, String str, da nativeBridgeCommand, Cif eventTracker, Function1 cbWebViewFactory) {
        super(context, html, callback, impressionInterface, str, nativeBridgeCommand, null, eventTracker, cbWebViewFactory, 64, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        addView(getWebViewContainer());
        callback.a();
        callback.d();
    }

    public /* synthetic */ m7(Context context, String str, v5 v5Var, zb zbVar, String str2, da daVar, Cif cif, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, v5Var, zbVar, str2, daVar, cif, (i10 & 128) != 0 ? a.f70469f : function1);
    }
}
