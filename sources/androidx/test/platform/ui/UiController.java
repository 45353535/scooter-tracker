package androidx.test.platform.ui;

import android.view.KeyEvent;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes5.dex */
public interface UiController {
    boolean injectKeyEvent(KeyEvent keyEvent) throws InjectEventSecurityException;

    boolean injectMotionEvent(MotionEvent motionEvent) throws InjectEventSecurityException;

    boolean injectString(String str) throws InjectEventSecurityException;

    void loopMainThreadForAtLeast(long j10);

    void loopMainThreadUntilIdle();
}
