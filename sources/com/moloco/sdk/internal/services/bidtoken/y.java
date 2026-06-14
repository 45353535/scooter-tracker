package com.moloco.sdk.internal.services.bidtoken;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f55494a = a.f55495a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f55495a = new a();

        public final y a(com.moloco.sdk.internal.bidtoken.b bidTokenParser, com.moloco.sdk.internal.services.i timeProviderService) {
            Intrinsics.checkNotNullParameter(bidTokenParser, "bidTokenParser");
            Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
            return new z(bidTokenParser, timeProviderService);
        }
    }

    n a();

    Object a(n nVar, Continuation continuation);

    Object a(Continuation continuation);
}
