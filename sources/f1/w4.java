package f1;

import android.net.Uri;
import com.amazon.device.ads.DtbConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class w4 {
    public static final a6 a(int i10) {
        Object next;
        Iterator<E> it = a6.g().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((a6) next).h() == i10) {
                break;
            }
        }
        a6 a6Var = (a6) next;
        return a6Var == null ? a6.f69372c : a6Var;
    }

    public static final String b(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (url.length() <= 0) {
            return "";
        }
        if (!StringsKt.a0(url, DtbConstants.HTTPS, false, 2, null) && !StringsKt.a0(url, "http://", false, 2, null)) {
            url = DtbConstants.HTTPS + url;
        }
        Uri uri = Uri.parse(url);
        if (uri == null) {
            return "";
        }
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNull(pathSegments);
        return CollectionsKt.joinToString$default(pathSegments, "_", null, null, 0, null, null, 62, null);
    }
}
