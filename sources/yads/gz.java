package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gz {
    public static final Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public static final g92 b(Context context) {
        int i10 = context.getResources().getConfiguration().orientation;
        return i10 != 1 ? i10 != 2 ? g92.f111114e : g92.f111112c : g92.f111113d;
    }
}
