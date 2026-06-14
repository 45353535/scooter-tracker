package b9;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5949a;

    public s(Context context) {
        this.f5949a = context.getApplicationContext();
    }

    public boolean a() {
        return this.f5949a.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }
}
