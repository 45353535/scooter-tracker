package vc;

import android.content.Context;
import jd.j;
import kotlin.jvm.internal.Intrinsics;
import pd.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {
    public static void a(c cVar, Context context, String url, h hVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        cVar.b(context, j.d(url), hVar);
    }
}
