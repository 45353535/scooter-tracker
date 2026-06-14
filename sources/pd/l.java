package pd;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f98244a = new l();

    private l() {
    }

    public static final boolean a(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        return o.d(context, intent);
    }

    public static final boolean b(Context context, String str, h hVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        return o.f(context, str, hVar);
    }

    public static final ComponentName c(List resolveInfoList) {
        Object next;
        Intrinsics.checkNotNullParameter(resolveInfoList, "resolveInfoList");
        Iterator it = resolveInfoList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((ResolveInfo) next).activityInfo.packageName, "com.android.vending")) {
                break;
            }
        }
        ResolveInfo resolveInfo = (ResolveInfo) next;
        if (resolveInfo == null) {
            return null;
        }
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        return new ComponentName(activityInfo.packageName, activityInfo.name);
    }

    public static final boolean d(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        return o.j(context, str);
    }

    public static final Intent e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return o.o(uri, false, 1, null);
    }

    public static final Intent f(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Uri uri = Uri.parse(url);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(url)");
        return e(uri);
    }
}
