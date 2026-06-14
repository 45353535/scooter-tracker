package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface x {

    public static final class a {
        public static /* synthetic */ void a(x xVar, List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z zVar, Integer num, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
            }
            if ((i10 & 2) != 0) {
                zVar = null;
            }
            if ((i10 & 4) != 0) {
                num = null;
            }
            if ((i10 & 8) != 0) {
                str = null;
            }
            xVar.a(list, zVar, num, str);
        }

        public static /* synthetic */ void b(x xVar, List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z zVar, Integer num, String str, List list2, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, a.AbstractC0780a.f fVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackClick");
            }
            if ((i10 & 2) != 0) {
                zVar = null;
            }
            if ((i10 & 4) != 0) {
                num = null;
            }
            if ((i10 & 8) != 0) {
                str = null;
            }
            xVar.b(list, zVar, num, str, list2, aVar, fVar);
        }
    }

    void a(List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z zVar, Integer num, String str);

    void b(List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z zVar, Integer num, String str, List list2, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, a.AbstractC0780a.f fVar);
}
