package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes12.dex */
public class SessionManager {

    @NonNull
    public static final String SESSION_ID_EMPTY = "";

    @NonNull
    private static final String TAG = "SessionManager";

    @Nullable
    private static volatile SessionManager instance;

    @Nullable
    private volatile Context applicationContext;
    private long pauseTime;
    private long resumeTime;
    private long sessionResetAfterSec;
    private long sessionStartTime;

    @NonNull
    private final k9.e versionManager = new k9.e();

    @NonNull
    private final SessionManagerKtWrapper sessionManagerKtWrapper = new SessionManagerKtWrapper(this);

    @NonNull
    private String sessionId = "";

    @NonNull
    private final CopyOnWriteArraySet<a> observers = new CopyOnWriteArraySet<>();

    interface a {
        void a(b bVar);
    }

    enum b {
        START,
        RESUME,
        PAUSE
    }

    private SessionManager() {
        startNewSession();
    }

    public static /* synthetic */ void b(SessionManager sessionManager, Context context) {
        sessionManager.versionManager.k(context, sessionManager.sessionManagerKtWrapper);
        n2.z(context);
        n2.b(context);
    }

    @NonNull
    static SessionManager get() {
        SessionManager sessionManager;
        SessionManager sessionManager2 = instance;
        if (sessionManager2 != null) {
            return sessionManager2;
        }
        synchronized (SessionManager.class) {
            try {
                sessionManager = instance;
                if (sessionManager == null) {
                    sessionManager = new SessionManager();
                    instance = sessionManager;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sessionManager;
    }

    private long getLastSessionDurationMs() {
        Context context = this.applicationContext;
        if (context != null) {
            return n2.r(context);
        }
        io.bidmachine.core.a.m(TAG, "Context not attached");
        return 0L;
    }

    private void notifyObservers(@NonNull b bVar) {
        Iterator<a> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    private void onContextAttached() {
        onNewSessionStarted();
    }

    private void onNewSessionStarted() {
        io.bidmachine.core.h.F(this.applicationContext, new Executable() { // from class: io.bidmachine.f5
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                SessionManager.b(this.f80096a, (Context) obj);
            }
        });
    }

    private void onSessionPaused() {
        io.bidmachine.core.h.F(this.applicationContext, new Executable() { // from class: io.bidmachine.h5
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                SessionManager sessionManager = this.f80124a;
                sessionManager.versionManager.i((Context) obj, sessionManager.sessionManagerKtWrapper);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveCurrentSessionDuration(@NonNull final Context context) {
        io.bidmachine.core.h.S(new Runnable() { // from class: io.bidmachine.i5
            @Override // java.lang.Runnable
            public final void run() {
                n2.O(context, this.f80132b.getSessionDurationMs());
            }
        });
    }

    void addObserver(@NonNull a aVar) {
        this.observers.add(aVar);
    }

    synchronized void attachContext(@NonNull Context context) {
        boolean z10 = this.applicationContext == null;
        this.applicationContext = context.getApplicationContext();
        if (z10) {
            onContextAttached();
        }
    }

    int getLastSessionDurationSec() {
        return (int) (getLastSessionDurationMs() / 1000);
    }

    @WorkerThread
    int getSessionCount() {
        Context context = this.applicationContext;
        if (context != null) {
            return n2.t(context);
        }
        io.bidmachine.core.a.m(TAG, "Context not attached");
        return 0;
    }

    long getSessionDurationMs() {
        if (this.resumeTime == 0) {
            return 0L;
        }
        return io.bidmachine.core.c.a() - this.sessionStartTime;
    }

    int getSessionDurationSec() {
        return (int) (getSessionDurationMs() / 1000);
    }

    @NonNull
    String getSessionId() {
        return this.sessionId;
    }

    long getSessionStartTime() {
        return this.sessionStartTime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void pause() {
        if (this.resumeTime == 0) {
            return;
        }
        this.pauseTime = io.bidmachine.core.c.a();
        onSessionPaused();
        notifyObservers(b.PAUSE);
        io.bidmachine.core.h.F(this.applicationContext, new Executable() { // from class: io.bidmachine.g5
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                this.f80113a.saveCurrentSessionDuration((Context) obj);
            }
        });
        io.bidmachine.core.a.c(TAG, "Session paused: " + getSessionDurationSec() + " sec.");
    }

    void removeObserver(@NonNull a aVar) {
        this.observers.remove(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void resume() {
        /*
            r8 = this;
            long r0 = io.bidmachine.core.c.a()
            long r2 = r8.sessionResetAfterSec
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1f
            long r6 = r8.pauseTime
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L1f
            long r4 = r0 - r6
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r6
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto L1f
            r8.startNewSession()
            goto L2b
        L1f:
            io.bidmachine.SessionManager$b r2 = io.bidmachine.SessionManager.b.RESUME
            r8.notifyObservers(r2)
            java.lang.String r2 = "SessionManager"
            java.lang.String r3 = "Session resumed"
            io.bidmachine.core.a.c(r2, r3)
        L2b:
            r8.resumeTime = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.SessionManager.resume():void");
    }

    void setSessionResetAfter(long j10) {
        this.sessionResetAfterSec = j10;
    }

    @VisibleForTesting
    void startNewSession() {
        this.sessionId = UUID.randomUUID().toString();
        this.sessionStartTime = io.bidmachine.core.c.a();
        this.pauseTime = 0L;
        this.resumeTime = 0L;
        onNewSessionStarted();
        notifyObservers(b.START);
        io.bidmachine.core.a.c(TAG, "New session started");
    }
}
