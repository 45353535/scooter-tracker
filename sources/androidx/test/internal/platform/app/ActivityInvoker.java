package androidx.test.internal.platform.app;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface ActivityInvoker {
    void finishActivity(Activity activity);

    Instrumentation.ActivityResult getActivityResult();

    Intent getIntentForActivity(Class<? extends Activity> cls);

    void pauseActivity(Activity activity);

    void recreateActivity(Activity activity);

    void resumeActivity(Activity activity);

    void startActivity(Intent intent);

    void startActivity(Intent intent, @Nullable Bundle bundle);

    void startActivityForResult(Intent intent);

    void startActivityForResult(Intent intent, @Nullable Bundle bundle);

    void stopActivity(Activity activity);
}
