package org.bidon.sdk.utils;

import androidx.webkit.Profile;
import eg.o0;
import eg.q1;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00058F¢\u0006\f\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lorg/bidon/sdk/utils/SdkDispatchers;", "", "<init>", "()V", "Bidon", "Lkotlinx/coroutines/CoroutineDispatcher;", "getBidon$annotations", "getBidon", "()Lkotlinx/coroutines/CoroutineDispatcher;", "Main", "getMain", Profile.DEFAULT_PROFILE_NAME, "getDefault", "IO", "getIO", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SdkDispatchers {

    @NotNull
    public static final SdkDispatchers INSTANCE = new SdkDispatchers();

    private SdkDispatchers() {
    }

    public static /* synthetic */ void getBidon$annotations() {
    }

    @NotNull
    public final CoroutineDispatcher getBidon() {
        CoroutineDispatcher singleDispatcherOverridden = SdkDispatchersKt.getSingleDispatcherOverridden();
        return singleDispatcherOverridden == null ? q1.b("Bidon") : singleDispatcherOverridden;
    }

    @NotNull
    public final CoroutineDispatcher getDefault() {
        CoroutineDispatcher defaultDispatcherOverridden = SdkDispatchersKt.getDefaultDispatcherOverridden();
        return defaultDispatcherOverridden == null ? o0.a() : defaultDispatcherOverridden;
    }

    @NotNull
    public final CoroutineDispatcher getIO() {
        CoroutineDispatcher ioDispatcherOverridden = SdkDispatchersKt.getIoDispatcherOverridden();
        return ioDispatcherOverridden == null ? o0.b() : ioDispatcherOverridden;
    }

    @NotNull
    public final CoroutineDispatcher getMain() {
        CoroutineDispatcher mainDispatcherOverridden = SdkDispatchersKt.getMainDispatcherOverridden();
        return mainDispatcherOverridden == null ? o0.c() : mainDispatcherOverridden;
    }
}
