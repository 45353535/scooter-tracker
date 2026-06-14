package com.moloco.sdk.internal.services.init;

import android.content.SharedPreferences;
import com.moloco.sdk.Init$SDKInitResponse;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f55640a = a.f55641a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f55641a = new a();

        public final g a(SharedPreferences sharedPreferences) {
            Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
            return new h(sharedPreferences, com.moloco.sdk.internal.scheduling.c.a().getIo());
        }
    }

    Object a(com.moloco.sdk.internal.services.init.a aVar, com.moloco.sdk.acm.recorder.a aVar2, Init$SDKInitResponse init$SDKInitResponse, Continuation continuation);

    Object a(Continuation continuation);

    Object b(com.moloco.sdk.internal.services.init.a aVar, com.moloco.sdk.acm.recorder.a aVar2, Continuation continuation);

    Object c(com.moloco.sdk.internal.services.init.a aVar, com.moloco.sdk.acm.recorder.a aVar2, Continuation continuation);
}
