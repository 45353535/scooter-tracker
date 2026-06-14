package com.bytedance.sdk.openadsdk.component.reward.ud;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.ljh;

/* JADX INFO: loaded from: classes6.dex */
public class mo {
    @NonNull
    public static ud qdl(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        ljh ljhVar = qdlVar.f17090ud;
        return (!wd.qdl(ljhVar) || lnr.qdl(ljhVar)) ? jpc.qdl(ljhVar) ? new jpc(qdlVar) : mml.qdl(ljhVar) ? new mml(qdlVar) : lnr.qdl(ljhVar) ? new lnr(qdlVar) : new mzz(qdlVar) : new wd(qdlVar);
    }
}
