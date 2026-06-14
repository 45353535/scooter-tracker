package f1;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static s3 f71042a = new s3();

    public static s3 d() {
        return f71042a;
    }

    public Task a(Context context) {
        try {
            return AppSet.getClient(context).getAppSetIdInfo();
        } catch (Exception e10) {
            eg.i("Cannot retrieve appSetId client", e10);
            return null;
        }
    }

    public String b() {
        return Build.VERSION.RELEASE;
    }

    public boolean c(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence);
    }
}
