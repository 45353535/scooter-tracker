package f1;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o2 {
    public static final Context a() {
        Context applicationContext = rd.f70996b.d().getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    public static final o6 b() {
        return rd.f70996b.a().v();
    }
}
