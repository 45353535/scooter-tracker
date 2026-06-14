package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class un0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f116721c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile un0 f116722d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sn0 f116723a = new sn0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public iw2 f116724b;

    public final er a(Context context) {
        iw2 iw2VarA;
        synchronized (f116721c) {
            iw2VarA = this.f116724b;
            if (iw2VarA == null) {
                iw2VarA = this.f116723a.a(context);
                this.f116724b = iw2VarA;
            }
        }
        return iw2VarA;
    }
}
