package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfzj {
    @NotNull
    public static final zzfzh zza(@NotNull final ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        return new zzfzh() { // from class: com.google.android.gms.internal.ads.zzfzi
            @Override // com.google.android.gms.internal.ads.zzfzh
            public final /* synthetic */ CoroutineScope zza() {
                return kotlinx.coroutines.i.a(eg.w0.c(executorService));
            }
        };
    }
}
