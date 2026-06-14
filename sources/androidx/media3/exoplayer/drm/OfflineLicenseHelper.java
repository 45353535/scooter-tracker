package androidx.media3.exoplayer.drm;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class OfflineLicenseHelper {
    private static final Format FORMAT_WITH_EMPTY_DRM_INIT_DATA = new Format.Builder().setDrmInitData(new DrmInitData(new DrmInitData.SchemeData[0])).build();
    private final ConditionVariable drmListenerConditionVariable;
    private final DefaultDrmSessionManager drmSessionManager;
    private final DrmSessionEventListener.EventDispatcher eventDispatcher;
    private final Handler handler;
    private final HandlerThread handlerThread;

    public OfflineLicenseHelper(DefaultDrmSessionManager defaultDrmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.drmSessionManager = defaultDrmSessionManager;
        this.eventDispatcher = eventDispatcher;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper());
        this.drmListenerConditionVariable = new ConditionVariable();
        eventDispatcher.addEventListener(new Handler(handlerThread.getLooper()), new DrmSessionEventListener() { // from class: androidx.media3.exoplayer.drm.OfflineLicenseHelper.1
            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysLoaded(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysRemoved(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysRestored(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public /* synthetic */ void onDrmSessionAcquired(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
                j.d(this, i10, mediaPeriodId);
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmSessionManagerError(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public /* synthetic */ void onDrmSessionReleased(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
                j.g(this, i10, mediaPeriodId);
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public /* synthetic */ void onDrmSessionAcquired(int i10, MediaSource.MediaPeriodId mediaPeriodId, int i11) {
                j.e(this, i10, mediaPeriodId, i11);
            }
        });
    }

    public static /* synthetic */ void a(OfflineLicenseHelper offlineLicenseHelper, DrmSession drmSession, SettableFuture settableFuture) {
        offlineLicenseHelper.getClass();
        try {
            DrmSession.DrmSessionException error = drmSession.getError();
            if (drmSession.getState() == 1) {
                drmSession.release(offlineLicenseHelper.eventDispatcher);
                offlineLicenseHelper.drmSessionManager.release();
            }
            settableFuture.set(error);
        } catch (Throwable th2) {
            settableFuture.setException(th2);
            drmSession.release(offlineLicenseHelper.eventDispatcher);
            offlineLicenseHelper.drmSessionManager.release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DrmSession acquireFirstSessionOnHandlerThread(final int i10, @Nullable final byte[] bArr, final Format format) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(format.drmInitData);
        final SettableFuture settableFutureCreate = SettableFuture.create();
        this.drmListenerConditionVariable.close();
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.g0
            @Override // java.lang.Runnable
            public final void run() {
                OfflineLicenseHelper.d(this.f4988b, i10, bArr, settableFutureCreate, format);
            }
        });
        try {
            final DrmSession drmSession = (DrmSession) settableFutureCreate.get();
            this.drmListenerConditionVariable.block();
            final SettableFuture settableFutureCreate2 = SettableFuture.create();
            this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.h0
                @Override // java.lang.Runnable
                public final void run() {
                    OfflineLicenseHelper.a(this.f4994b, drmSession, settableFutureCreate2);
                }
            });
            try {
                if (settableFutureCreate2.get() == 0) {
                    return drmSession;
                }
                throw ((DrmSession.DrmSessionException) settableFutureCreate2.get());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IllegalStateException(e10);
            }
        } catch (InterruptedException | ExecutionException e11) {
            throw new IllegalStateException(e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private byte[] acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(int i10, @Nullable byte[] bArr, Format format) throws DrmSession.DrmSessionException {
        final DrmSession drmSessionAcquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(i10, bArr, format);
        final SettableFuture settableFutureCreate = SettableFuture.create();
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.j0
            @Override // java.lang.Runnable
            public final void run() {
                OfflineLicenseHelper.c(this.f4999b, settableFutureCreate, drmSessionAcquireFirstSessionOnHandlerThread);
            }
        });
        try {
            try {
                return (byte[]) Assertions.checkNotNull((byte[]) settableFutureCreate.get());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IllegalStateException(e10);
            }
        } finally {
            releaseManagerOnHandlerThread();
        }
    }

    public static /* synthetic */ void b(OfflineLicenseHelper offlineLicenseHelper, SettableFuture settableFuture) {
        offlineLicenseHelper.getClass();
        try {
            offlineLicenseHelper.drmSessionManager.release();
            settableFuture.set(null);
        } catch (Throwable th2) {
            settableFuture.setException(th2);
        }
    }

    public static /* synthetic */ void c(OfflineLicenseHelper offlineLicenseHelper, SettableFuture settableFuture, DrmSession drmSession) {
        offlineLicenseHelper.getClass();
        try {
            settableFuture.set(drmSession.getOfflineLicenseKeySetId());
        } catch (Throwable th2) {
            try {
                settableFuture.setException(th2);
            } finally {
                drmSession.release(offlineLicenseHelper.eventDispatcher);
            }
        }
    }

    public static /* synthetic */ void d(OfflineLicenseHelper offlineLicenseHelper, int i10, byte[] bArr, SettableFuture settableFuture, Format format) {
        offlineLicenseHelper.getClass();
        try {
            offlineLicenseHelper.drmSessionManager.setPlayer((Looper) Assertions.checkNotNull(Looper.myLooper()), PlayerId.UNSET);
            offlineLicenseHelper.drmSessionManager.prepare();
            try {
                offlineLicenseHelper.drmSessionManager.setMode(i10, bArr);
                settableFuture.set((DrmSession) Assertions.checkNotNull(offlineLicenseHelper.drmSessionManager.acquireSession(offlineLicenseHelper.eventDispatcher, format)));
            } finally {
            }
        } catch (Throwable th2) {
            settableFuture.setException(th2);
        }
    }

    public static /* synthetic */ void e(OfflineLicenseHelper offlineLicenseHelper, SettableFuture settableFuture, DrmSession drmSession) {
        offlineLicenseHelper.getClass();
        try {
            settableFuture.set((Pair) Assertions.checkNotNull(WidevineUtil.getLicenseDurationRemainingSec(drmSession)));
        } catch (Throwable th2) {
            try {
                settableFuture.setException(th2);
            } finally {
                drmSession.release(offlineLicenseHelper.eventDispatcher);
            }
        }
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, DataSource.Factory factory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, false, factory, eventDispatcher);
    }

    private void releaseManagerOnHandlerThread() {
        final SettableFuture settableFutureCreate = SettableFuture.create();
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.i0
            @Override // java.lang.Runnable
            public final void run() {
                OfflineLicenseHelper.b(this.f4997b, settableFutureCreate);
            }
        });
        try {
            settableFutureCreate.get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public synchronized byte[] downloadLicense(Format format) throws DrmSession.DrmSessionException {
        Assertions.checkArgument(format.drmInitData != null);
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, null, format);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized Pair<Long, Long> getLicenseDurationRemainingSec(byte[] bArr) throws DrmSession.DrmSessionException {
        final SettableFuture settableFutureCreate;
        Assertions.checkNotNull(bArr);
        try {
            final DrmSession drmSessionAcquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(1, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
            settableFutureCreate = SettableFuture.create();
            this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.f0
                @Override // java.lang.Runnable
                public final void run() {
                    OfflineLicenseHelper.e(this.f4984b, settableFutureCreate, drmSessionAcquireFirstSessionOnHandlerThread);
                }
            });
            try {
                try {
                } catch (InterruptedException | ExecutionException e10) {
                    throw new IllegalStateException(e10);
                }
            } finally {
                releaseManagerOnHandlerThread();
            }
        } catch (DrmSession.DrmSessionException e11) {
            if (e11.getCause() instanceof KeysExpiredException) {
                return Pair.create(0L, 0L);
            }
            throw e11;
        }
        return (Pair) settableFutureCreate.get();
    }

    public void release() {
        this.handlerThread.quit();
    }

    public synchronized void releaseLicense(byte[] bArr) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(bArr);
        acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(3, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
    }

    public synchronized byte[] renewLicense(byte[] bArr) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(bArr);
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, boolean z10, DataSource.Factory factory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, z10, factory, null, eventDispatcher);
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, boolean z10, DataSource.Factory factory, @Nullable Map<String, String> map, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return new OfflineLicenseHelper(new DefaultDrmSessionManager.Builder().setKeyRequestParameters(map).build(new HttpMediaDrmCallback(str, z10, factory)), eventDispatcher);
    }
}
