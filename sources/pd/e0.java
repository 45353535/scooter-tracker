package pd;

import android.net.Uri;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e0 {
    public static final Uri a(String str) {
        Uri uriM;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Uri uri = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri, "parse(this)");
            String scheme = uri.getScheme();
            if (scheme != null && scheme.length() != 0) {
                return uri;
            }
            if (!StringsKt.a0(str, "/", false, 2, null) && (uriM = f0.m(str)) != null) {
                String scheme2 = uriM.getScheme();
                if (scheme2 != null) {
                    Intrinsics.checkNotNullExpressionValue(scheme2, "scheme");
                    if (scheme2.length() > 0) {
                        return uriM;
                    }
                }
                String string = uriM.toString();
                Intrinsics.checkNotNullExpressionValue(string, "newUri.toString()");
                if (StringsKt.a0(string, "/", false, 2, null)) {
                    return uriM;
                }
            }
            return uri;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Uri b(Uri uri, String... parameterNames) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(parameterNames, "parameterNames");
        if (parameterNames.length == 0) {
            return uri;
        }
        Set set = ArraysKt.toSet(parameterNames);
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        Intrinsics.checkNotNullExpressionValue(builderClearQuery, "buildUpon().clearQuery()");
        for (String str : uri.getQueryParameterNames()) {
            if (!set.contains(str)) {
                Iterator<String> it = uri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    builderClearQuery.appendQueryParameter(str, it.next());
                }
            }
        }
        Uri uriBuild = builderClearQuery.build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "builder.build()");
        return uriBuild;
    }
}
