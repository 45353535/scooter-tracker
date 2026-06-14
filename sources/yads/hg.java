package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hg {
    public static final String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
            boolean z10 = lb1.f113032a;
            return null;
        }
    }

    public static final String b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            boolean z10 = lb1.f113032a;
            return null;
        }
    }
}
