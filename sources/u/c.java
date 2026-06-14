package u;

import android.net.Uri;
import c0.i;
import kotlin.jvm.internal.Intrinsics;
import y.m;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements b {
    @Override // u.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(Uri uri, m mVar) {
        if (!Intrinsics.areEqual(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uri);
        sb2.append('-');
        sb2.append(i.k(mVar.g().getResources().getConfiguration()));
        return sb2.toString();
    }
}
