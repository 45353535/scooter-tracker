package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.Struct;
import io.bidmachine.protobuf.Extras;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public class ExtraParamsManager {

    @NonNull
    static final String KEY_MRAID_JS = "mraid_js";

    @Nullable
    private static volatile ExtraParamsManager instance;

    @Nullable
    private Struct privateExtras;

    @NonNull
    private final AtomicBoolean isExtrasPrepared = new AtomicBoolean(false);

    @NonNull
    private final AtomicBoolean needLoadFromStore = new AtomicBoolean(true);

    @NonNull
    private final Object loadFromStoreLock = new Object();

    @NonNull
    private final Object updateExtrasLock = new Object();

    @NonNull
    private final be.h publicDataRetriever = new be.h();

    @NonNull
    private final be.h internalDataRetriever = new be.h();

    private ExtraParamsManager() {
    }

    private void checkAndPrepareExtras(@NonNull Context context, @Nullable Extras extras) {
        synchronized (this.updateExtrasLock) {
            try {
                if (isExtrasPrepared()) {
                    return;
                }
                setExtras(context, extras);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public static ExtraParamsManager get() {
        ExtraParamsManager extraParamsManager;
        ExtraParamsManager extraParamsManager2 = instance;
        if (extraParamsManager2 != null) {
            return extraParamsManager2;
        }
        synchronized (ExtraParamsManager.class) {
            try {
                extraParamsManager = instance;
                if (extraParamsManager == null) {
                    extraParamsManager = new ExtraParamsManager();
                    instance = extraParamsManager;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return extraParamsManager;
    }

    @NonNull
    public be.h getInternalDataRetriever(@NonNull Context context) {
        loadFromStore(context);
        return this.internalDataRetriever;
    }

    @Nullable
    public Struct getPrivateStruct(@NonNull Context context) {
        loadFromStore(context);
        return this.privateExtras;
    }

    @Nullable
    public Object getPublic(@NonNull Context context, @NonNull String str) {
        loadFromStore(context);
        return this.publicDataRetriever.p(str);
    }

    boolean isExtrasPrepared() {
        return this.isExtrasPrepared.get();
    }

    @VisibleForTesting
    void loadFromStore(@NonNull Context context) {
        if (isExtrasPrepared()) {
            return;
        }
        synchronized (this.loadFromStoreLock) {
            try {
                if (this.needLoadFromStore.compareAndSet(true, false)) {
                    checkAndPrepareExtras(context, n2.i(context));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void setExtras(@NonNull Context context, @Nullable Extras extras) {
        this.isExtrasPrepared.set(true);
        this.needLoadFromStore.set(false);
        synchronized (this.updateExtrasLock) {
            try {
                if (extras == null) {
                    this.publicDataRetriever.s();
                    this.internalDataRetriever.s();
                    this.privateExtras = null;
                    n2.d(context);
                    return;
                }
                this.publicDataRetriever.w(extras.getPublic());
                this.internalDataRetriever.w(extras.getInternal());
                this.privateExtras = extras.getPrivate();
                n2.P(context, extras);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
