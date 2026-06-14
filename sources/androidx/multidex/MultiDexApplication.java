package androidx.multidex;

import android.content.Context;
import bin.mt.KillSignbyFuRReX;

/* JADX INFO: loaded from: classes5.dex */
public class MultiDexApplication extends KillSignbyFuRReX {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }
}
