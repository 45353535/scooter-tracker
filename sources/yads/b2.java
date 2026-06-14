package yads;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f108889a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f108890b = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f108891c;

    public b2(Context context) {
        this.f108891c = a(context);
    }

    public static int a(Context context) {
        return context.getResources().getConfiguration().orientation;
    }
}
