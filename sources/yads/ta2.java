package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class ta2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f116145a;

    public ta2(Context context) {
        this.f116145a = context.getApplicationContext();
    }

    public final boolean a(String str) {
        try {
            return this.f116145a.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }
}
