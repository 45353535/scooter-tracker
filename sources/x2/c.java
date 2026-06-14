package x2;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.internal.z;
import com.facebook.s;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f108087a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f108088b = SetsKt.setOf((Object[]) new String[]{"fb_mobile_purchase", "StartTrial", "Subscribe"});

    private c() {
    }

    private final boolean c(com.facebook.appevents.d dVar) {
        if (e3.a.d(this)) {
            return false;
        }
        try {
            return !dVar.m() || (dVar.m() && f108088b.contains(dVar.k()));
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }

    public static final boolean d() {
        if (e3.a.d(c.class)) {
            return false;
        }
        try {
            if (!s.x(s.m()) && !z.U()) {
                if (e.b()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            e3.a.b(th2, c.class);
            return false;
        }
    }

    public static final void e(final String applicationId, final com.facebook.appevents.d event) {
        if (e3.a.d(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(event, "event");
            if (f108087a.c(event)) {
                s.t().execute(new Runnable() { // from class: x2.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.f(applicationId, event);
                    }
                });
            }
        } catch (Throwable th2) {
            e3.a.b(th2, c.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(String applicationId, com.facebook.appevents.d event) {
        if (e3.a.d(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
            Intrinsics.checkNotNullParameter(event, "$event");
            e.c(applicationId, CollectionsKt.listOf(event));
        } catch (Throwable th2) {
            e3.a.b(th2, c.class);
        }
    }

    public static final void g(final String str, final String str2) {
        if (e3.a.d(c.class)) {
            return;
        }
        try {
            final Context contextM = s.m();
            if (contextM == null || str == null || str2 == null) {
                return;
            }
            s.t().execute(new Runnable() { // from class: x2.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.h(contextM, str2, str);
                }
            });
        } catch (Throwable th2) {
            e3.a.b(th2, c.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Context context, String str, String str2) {
        if (e3.a.d(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "$context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            String str3 = str2 + "pingForOnDevice";
            if (sharedPreferences.getLong(str3, 0L) == 0) {
                e.e(str2);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong(str3, System.currentTimeMillis());
                editorEdit.apply();
            }
        } catch (Throwable th2) {
            e3.a.b(th2, c.class);
        }
    }
}
