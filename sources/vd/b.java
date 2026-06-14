package vd;

import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements m {
    @Override // vd.m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map a(URLConnection urlConnection) {
        Intrinsics.checkNotNullParameter(urlConnection, "urlConnection");
        Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
        Intrinsics.checkNotNullExpressionValue(headerFields, "urlConnection.headerFields");
        return headerFields;
    }
}
