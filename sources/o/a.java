package o;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f96176a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static e f96177b;

    private a() {
    }

    public static final e a(Context context) {
        e eVar = f96177b;
        return eVar == null ? f96176a.b(context) : eVar;
    }

    private final synchronized e b(Context context) {
        e eVar = f96177b;
        if (eVar != null) {
            return eVar;
        }
        context.getApplicationContext();
        e eVarA = f.a(context);
        f96177b = eVarA;
        return eVarA;
    }
}
