package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class l20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f112926a;

    public l20(Context context) {
        this.f112926a = gz.a(context);
    }

    public final boolean a() {
        return (this.f112926a.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
