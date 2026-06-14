package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.service_locator.b;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public interface u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f55474a = a.f55475a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f55475a = new a();

        public final u a() {
            return new v(b.h.f55827a.h(), s.f55468a.a(), com.moloco.sdk.internal.services.encryption.a.f55544a.a(), com.moloco.sdk.internal.services.bidtoken.providers.m.f55422a.a());
        }
    }

    Object a(com.moloco.sdk.acm.recorder.a aVar, String str, i iVar, Continuation continuation);
}
