package v;

import android.net.Uri;
import c0.i;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import y.m;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements d {
    private final boolean b(Uri uri) {
        String scheme;
        if (!i.q(uri) && ((scheme = uri.getScheme()) == null || Intrinsics.areEqual(scheme, C4240b4.i.f42616b))) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            if (StringsKt.b1(path, IOUtils.DIR_SEPARATOR_UNIX, false, 2, null) && i.h(uri) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // v.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public File a(Uri uri, m mVar) {
        if (!b(uri)) {
            return null;
        }
        if (uri.getScheme() != null) {
            uri = uri.buildUpon().scheme(null).build();
        }
        return new File(uri.toString());
    }
}
