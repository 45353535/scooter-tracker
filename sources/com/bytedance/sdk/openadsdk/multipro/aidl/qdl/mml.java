package com.bytedance.sdk.openadsdk.multipro.aidl.qdl;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class mml extends qdl {
    public static ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> qdl = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static volatile mml f17763ud;

    public static mml qdl() {
        if (f17763ud == null) {
            synchronized (mml.class) {
                try {
                    if (f17763ud == null) {
                        f17763ud = new mml();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f17763ud;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
        qdl(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iDislikeClosedListener);
        qdl.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl, com.bytedance.sdk.openadsdk.IListenerManager
    public void unregisterDisLikeClosedListener(String str) throws RemoteException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        qdl.remove(str);
    }

    private synchronized void qdl(String str, String str2) {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList;
        try {
            ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> concurrentHashMap = qdl;
            if (concurrentHashMap != null && (remoteCallbackList = concurrentHashMap.get(str)) != null) {
                int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                    try {
                        IDislikeClosedListener iDislikeClosedListener = (IDislikeClosedListener) remoteCallbackList.getBroadcastItem(i10);
                        if (iDislikeClosedListener != null && "onItemClickClosed".equals(str2)) {
                            iDislikeClosedListener.onItemClickClosed();
                        }
                    } catch (Throwable th2) {
                        aaj.qdl("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th2);
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th3) {
            aaj.qdl("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th3);
        }
    }
}
