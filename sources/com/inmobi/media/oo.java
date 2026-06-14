package com.inmobi.media;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class oo {
    public static boolean a(WebView view, RenderProcessGoneDetail renderProcessGoneDetail, String source) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(source, "source");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("source", source), TuplesKt.to("isCrashed", Boolean.valueOf(renderProcessGoneDetail != null ? renderProcessGoneDetail.didCrash() : false)));
        Wj wj = Wj.f37959a;
        Wj.b("WebViewRenderProcessGoneEvent", mapMutableMapOf, EnumC3585ak.f38215a);
        view.destroy();
        return true;
    }
}
