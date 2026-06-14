package com.ironsource.adapters.inmobi;

import com.inmobi.sdk.SdkInitializationListener;
import com.ironsource.adapters.inmobi.InMobiAdapter;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ironsource/adapters/inmobi/InMobiInitListener;", "Lcom/inmobi/sdk/SdkInitializationListener;", "<init>", "()V", "onInitializationComplete", "", "error", "Ljava/lang/Error;", "Lkotlin/Error;", "inmobiadapter_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiInitListener implements SdkInitializationListener {
    @Override // com.inmobi.sdk.SdkInitializationListener
    public void onInitializationComplete(@Nullable Error error) {
        if (error != null) {
            InMobiAdapter.Companion companion = InMobiAdapter.INSTANCE;
            companion.setInitState$inmobiadapter_release(InMobiAdapter.InitState.INIT_STATE_ERROR);
            Iterator<T> it = companion.getInitCallbackListeners$inmobiadapter_release().iterator();
            while (it.hasNext()) {
                ((INetworkInitCallbackListener) it.next()).onNetworkInitCallbackFailed(error.getMessage());
            }
        } else {
            InMobiAdapter.Companion companion2 = InMobiAdapter.INSTANCE;
            companion2.setInitState$inmobiadapter_release(InMobiAdapter.InitState.INIT_STATE_SUCCESS);
            Iterator<T> it2 = companion2.getInitCallbackListeners$inmobiadapter_release().iterator();
            while (it2.hasNext()) {
                ((INetworkInitCallbackListener) it2.next()).onNetworkInitCallbackSuccess();
            }
        }
        InMobiAdapter.INSTANCE.getInitCallbackListeners$inmobiadapter_release().clear();
    }
}
