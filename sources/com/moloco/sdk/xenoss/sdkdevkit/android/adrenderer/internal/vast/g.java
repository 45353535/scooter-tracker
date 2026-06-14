package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public interface g {

    public static final class a {
        public static /* synthetic */ Object a(g gVar, String str, String str2, boolean z10, Continuation continuation, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i10 & 2) != 0) {
                str2 = "UNKNOWN_MTID";
            }
            return gVar.b(str, str2, z10, continuation);
        }
    }

    Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, long j10, Continuation continuation);

    Object b(String str, String str2, boolean z10, Continuation continuation);
}
