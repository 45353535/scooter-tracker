package v;

import android.content.Context;
import android.net.Uri;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import kotlin.jvm.internal.Intrinsics;
import y.m;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements d {
    private final boolean b(int i10, Context context) {
        return context.getResources().getResourceEntryName(i10) != null;
    }

    @Override // v.d
    public /* bridge */ /* synthetic */ Object a(Object obj, m mVar) {
        return c(((Number) obj).intValue(), mVar);
    }

    public Uri c(int i10, m mVar) {
        if (!b(i10, mVar.g())) {
            return null;
        }
        Uri uri = Uri.parse("android.resource://" + mVar.g().getPackageName() + IOUtils.DIR_SEPARATOR_UNIX + i10);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(this)");
        return uri;
    }
}
