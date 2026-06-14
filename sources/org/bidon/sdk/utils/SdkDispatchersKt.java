package org.bidon.sdk.utils;

import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\"&\u0010\u0000\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"&\u0010\b\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\u0007\"&\u0010\f\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\u0005\"\u0004\b\u000f\u0010\u0007\"&\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"defaultDispatcherOverridden", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDefaultDispatcherOverridden$annotations", "()V", "getDefaultDispatcherOverridden", "()Lkotlinx/coroutines/CoroutineDispatcher;", "setDefaultDispatcherOverridden", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "ioDispatcherOverridden", "getIoDispatcherOverridden$annotations", "getIoDispatcherOverridden", "setIoDispatcherOverridden", "singleDispatcherOverridden", "getSingleDispatcherOverridden$annotations", "getSingleDispatcherOverridden", "setSingleDispatcherOverridden", "mainDispatcherOverridden", "getMainDispatcherOverridden$annotations", "getMainDispatcherOverridden", "setMainDispatcherOverridden", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SdkDispatchersKt {

    @Nullable
    private static CoroutineDispatcher defaultDispatcherOverridden;

    @Nullable
    private static CoroutineDispatcher ioDispatcherOverridden;

    @Nullable
    private static CoroutineDispatcher mainDispatcherOverridden;

    @Nullable
    private static CoroutineDispatcher singleDispatcherOverridden;

    @Nullable
    public static final CoroutineDispatcher getDefaultDispatcherOverridden() {
        return defaultDispatcherOverridden;
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultDispatcherOverridden$annotations() {
    }

    @Nullable
    public static final CoroutineDispatcher getIoDispatcherOverridden() {
        return ioDispatcherOverridden;
    }

    @VisibleForTesting
    public static /* synthetic */ void getIoDispatcherOverridden$annotations() {
    }

    @Nullable
    public static final CoroutineDispatcher getMainDispatcherOverridden() {
        return mainDispatcherOverridden;
    }

    @VisibleForTesting
    public static /* synthetic */ void getMainDispatcherOverridden$annotations() {
    }

    @Nullable
    public static final CoroutineDispatcher getSingleDispatcherOverridden() {
        return singleDispatcherOverridden;
    }

    @VisibleForTesting
    public static /* synthetic */ void getSingleDispatcherOverridden$annotations() {
    }

    public static final void setDefaultDispatcherOverridden(@Nullable CoroutineDispatcher coroutineDispatcher) {
        defaultDispatcherOverridden = coroutineDispatcher;
    }

    public static final void setIoDispatcherOverridden(@Nullable CoroutineDispatcher coroutineDispatcher) {
        ioDispatcherOverridden = coroutineDispatcher;
    }

    public static final void setMainDispatcherOverridden(@Nullable CoroutineDispatcher coroutineDispatcher) {
        mainDispatcherOverridden = coroutineDispatcher;
    }

    public static final void setSingleDispatcherOverridden(@Nullable CoroutineDispatcher coroutineDispatcher) {
        singleDispatcherOverridden = coroutineDispatcher;
    }
}
