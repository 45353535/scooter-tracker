package com.bytedance.sdk.openadsdk.multipro.aidl.qdl;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class wd extends qdl {
    private static final Map<String, RemoteCallbackList<IRewardAdInteractionListener>> qdl = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static volatile wd f17766ud;

    public static wd qdl() {
        if (f17766ud == null) {
            synchronized (wd.class) {
                try {
                    if (f17766ud == null) {
                        f17766ud = new wd();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f17766ud;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeRewardVideoCallback(String str, String str2, boolean z10, int i10, String str3, int i11, String str4) throws RemoteException {
        qdl(str, str2, z10, i10, str3, i11, str4);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iRewardAdInteractionListener);
        qdl.put(str, remoteCallbackList);
    }

    private synchronized void qdl(String str, String str2, boolean z10, int i10, String str3, int i11, String str4) {
        RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackListRemove;
        try {
            Map<String, RemoteCallbackList<IRewardAdInteractionListener>> map = qdl;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackListRemove = map.remove(str);
                } else {
                    remoteCallbackListRemove = map.get(str);
                }
                if (remoteCallbackListRemove != null) {
                    int iBeginBroadcast = remoteCallbackListRemove.beginBroadcast();
                    for (int i12 = 0; i12 < iBeginBroadcast; i12++) {
                        try {
                            IRewardAdInteractionListener iRewardAdInteractionListener = (IRewardAdInteractionListener) remoteCallbackListRemove.getBroadcastItem(i12);
                            if (iRewardAdInteractionListener != null) {
                                if ("onAdShow".equals(str2)) {
                                    iRewardAdInteractionListener.onAdShow();
                                } else if ("onAdClose".equals(str2)) {
                                    iRewardAdInteractionListener.onAdClose();
                                } else if ("onAdVideoBarClick".equals(str2)) {
                                    iRewardAdInteractionListener.onAdVideoBarClick();
                                } else if ("onRewardVerify".equals(str2)) {
                                    iRewardAdInteractionListener.onRewardVerify(z10, i10, str3, i11, str4);
                                } else if ("recycleRes".equals(str2)) {
                                    iRewardAdInteractionListener.onDestroy();
                                }
                            }
                        } catch (Throwable th2) {
                            aaj.qdl("MultiProcess", "reward1 '" + str2 + "'  throws Exception :", th2);
                        }
                    }
                    remoteCallbackListRemove.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackListRemove.kill();
                    }
                }
            }
        } catch (Throwable th3) {
            aaj.qdl("MultiProcess", "reward2 '" + str2 + "'  throws Exception :", th3);
        }
    }
}
