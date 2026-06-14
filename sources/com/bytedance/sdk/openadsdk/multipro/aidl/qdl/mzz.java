package com.bytedance.sdk.openadsdk.multipro.aidl.qdl;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class mzz extends qdl {
    private static final Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> qdl = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static volatile mzz f17764ud;

    public static mzz qdl() {
        if (f17764ud == null) {
            synchronized (mzz.class) {
                try {
                    if (f17764ud == null) {
                        f17764ud = new mzz();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f17764ud;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeFullVideoCallback(String str, String str2) throws RemoteException {
        qdl(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iFullScreenVideoAdInteractionListener);
        qdl.put(str, remoteCallbackList);
    }

    private synchronized void qdl(String str, String str2) {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackListRemove;
        try {
            Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> map = qdl;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackListRemove = map.remove(str);
                } else {
                    remoteCallbackListRemove = map.get(str);
                }
                if (remoteCallbackListRemove != null) {
                    int iBeginBroadcast = remoteCallbackListRemove.beginBroadcast();
                    for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                        try {
                            IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener = (IFullScreenVideoAdInteractionListener) remoteCallbackListRemove.getBroadcastItem(i10);
                            if (iFullScreenVideoAdInteractionListener != null) {
                                if ("onAdShow".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onAdShow();
                                } else if ("onAdClose".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onAdClose();
                                } else if ("onAdVideoBarClick".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onAdVideoBarClick();
                                } else if ("recycleRes".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onDestroy();
                                }
                            }
                        } catch (Throwable th2) {
                            aaj.qdl("MultiProcess", "fullScreen2 method " + str2 + " throws Exception :", th2);
                        }
                    }
                    remoteCallbackListRemove.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackListRemove.kill();
                    }
                }
            }
        } catch (Throwable th3) {
            aaj.qdl("MultiProcess", "fullScreen1 method " + str2 + " throws Exception :", th3);
        }
    }
}
