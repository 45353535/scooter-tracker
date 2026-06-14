package v;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import y.m;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements d {
    @Override // v.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Uri a(String str, m mVar) {
        Uri uri = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(this)");
        return uri;
    }
}
