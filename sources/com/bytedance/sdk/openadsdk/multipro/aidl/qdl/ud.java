package com.bytedance.sdk.openadsdk.multipro.aidl.qdl;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.ironsource.Df;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends qdl {
    private static final Map<String, RemoteCallbackList<IAppOpenAdInteractionListener>> qdl = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static volatile ud f17765ud;

    public static ud qdl() {
        if (f17765ud == null) {
            synchronized (ud.class) {
                try {
                    if (f17765ud == null) {
                        f17765ud = new ud();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f17765ud;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeAppOpenAdCallback(String str, String str2) throws RemoteException {
        qdl(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IAppOpenAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iAppOpenAdInteractionListener);
        qdl.put(str, remoteCallbackList);
    }

    private synchronized void qdl(String str, String str2) {
        RemoteCallbackList<IAppOpenAdInteractionListener> remoteCallbackListRemove;
        try {
            Map<String, RemoteCallbackList<IAppOpenAdInteractionListener>> map = qdl;
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
                            IAppOpenAdInteractionListener iAppOpenAdInteractionListener = (IAppOpenAdInteractionListener) remoteCallbackListRemove.getBroadcastItem(i10);
                            if (iAppOpenAdInteractionListener != null) {
                                if ("onAdShow".equals(str2)) {
                                    iAppOpenAdInteractionListener.onAdShow();
                                } else if (Df.f40645f.equals(str2)) {
                                    iAppOpenAdInteractionListener.onAdClicked();
                                } else if ("onAdSkip".equals(str2)) {
                                    iAppOpenAdInteractionListener.onAdSkip();
                                } else if ("onAdTimeOver".equals(str2)) {
                                    iAppOpenAdInteractionListener.onAdTimeOver();
                                } else if ("recycleRes".equals(str2)) {
                                    iAppOpenAdInteractionListener.onDestroy();
                                }
                            }
                        } catch (Throwable th2) {
                            aaj.qdl("MultiProcess", "appOpenAd2 method " + str2 + " throws Exception :", th2);
                        }
                    }
                    remoteCallbackListRemove.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackListRemove.kill();
                    }
                }
            }
        } catch (Throwable th3) {
            aaj.qdl("MultiProcess", "appOpenAd1 method " + str2 + " throws Exception :", th3);
        }
    }
}
