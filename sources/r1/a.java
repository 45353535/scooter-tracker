package r1;

import android.content.ComponentName;
import android.os.IBinder;

/* JADX INFO: loaded from: classes6.dex */
public interface a {
    void onIgniteServiceAuthenticated(String str);

    void onIgniteServiceAuthenticationFailed(String str);

    void onIgniteServiceConnected(ComponentName componentName, IBinder iBinder);

    void onIgniteServiceConnectionFailed(String str);

    void onOdtUnsupported();
}
