package yads;

import android.net.Uri;
import android.view.View;
import com.ironsource.C4240b4;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class hh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gu f111591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hu f111592b;

    public hh0(gu guVar) {
        this.f111591a = guVar;
    }

    public final void a(Uri uri, View view) {
        Map mapEmptyMap;
        mi miVar;
        View.OnClickListener onClickListener;
        View.OnClickListener onClickListener2;
        String queryParameter = uri.getQueryParameter("assetName");
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter(C4240b4.i.L);
            Integer intOrNull = queryParameter2 != null ? StringsKt.toIntOrNull(queryParameter2) : null;
            if (intOrNull == null) {
                mi miVar2 = this.f111591a.f111338a;
                if (miVar2 == null || (onClickListener2 = (View.OnClickListener) miVar2.f113506a.get(queryParameter)) == null) {
                    return;
                }
                onClickListener2.onClick(view);
                return;
            }
            hu huVar = this.f111592b;
            if (huVar == null || (mapEmptyMap = huVar.f111776a) == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            gu guVar = (gu) mapEmptyMap.get(intOrNull);
            if (guVar == null || (miVar = guVar.f111338a) == null || (onClickListener = (View.OnClickListener) miVar.f113506a.get(queryParameter)) == null) {
                return;
            }
            onClickListener.onClick(view);
        }
    }
}
