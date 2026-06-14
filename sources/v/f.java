package v;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import y.m;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements d {
    private final boolean b(Uri uri) {
        String authority;
        return Intrinsics.areEqual(uri.getScheme(), "android.resource") && (authority = uri.getAuthority()) != null && !StringsKt.y0(authority) && uri.getPathSegments().size() == 2;
    }

    @Override // v.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Uri a(Uri uri, m mVar) throws PackageManager.NameNotFoundException {
        if (!b(uri)) {
            return null;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = mVar.g().getPackageManager().getResourcesForApplication(authority);
        List<String> pathSegments = uri.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier == 0) {
            throw new IllegalStateException(("Invalid android.resource URI: " + uri).toString());
        }
        Uri uri2 = Uri.parse("android.resource://" + authority + IOUtils.DIR_SEPARATOR_UNIX + identifier);
        Intrinsics.checkNotNullExpressionValue(uri2, "parse(this)");
        return uri2;
    }
}
