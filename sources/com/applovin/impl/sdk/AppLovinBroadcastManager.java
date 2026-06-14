package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class AppLovinBroadcastManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f10442a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f10443b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ArrayList f10444c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Handler f10445d = new a(Looper.getMainLooper());

    public interface Receiver {
        void onReceive(Intent intent, @Nullable Map<String, Object> map);
    }

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.b();
            } else {
                super.handleMessage(message);
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f10446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f10447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final List f10448c;

        b(Intent intent, Map map, List list) {
            this.f10446a = intent;
            this.f10447b = map;
            this.f10448c = list;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final IntentFilter f10449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Receiver f10450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f10451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f10452d;

        c(IntentFilter intentFilter, Receiver receiver) {
            this.f10449a = intentFilter;
            this.f10450b = receiver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (f10442a) {
                try {
                    ArrayList arrayList = f10444c;
                    size = arrayList.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    arrayList.toArray(bVarArr);
                    arrayList.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                if (bVar != null) {
                    for (c cVar : bVar.f10448c) {
                        if (cVar != null && !cVar.f10452d) {
                            cVar.f10450b.onReceive(bVar.f10446a, bVar.f10447b);
                        }
                    }
                }
            }
        }
    }

    public static void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        Map map = f10442a;
        synchronized (map) {
            try {
                c cVar = new c(intentFilter, receiver);
                ArrayList arrayList = (ArrayList) map.get(receiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    map.put(receiver, arrayList);
                }
                arrayList.add(cVar);
                Iterator<String> itActionsIterator = intentFilter.actionsIterator();
                while (itActionsIterator.hasNext()) {
                    String next = itActionsIterator.next();
                    Map map2 = f10443b;
                    ArrayList arrayList2 = (ArrayList) map2.get(next);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        map2.put(next, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean sendBroadcast(Intent intent, @Nullable Map<String, Object> map) {
        synchronized (f10442a) {
            try {
                List listA = a(intent);
                if (listA == null) {
                    return false;
                }
                f10444c.add(new b(intent, map, listA));
                Handler handler = f10445d;
                if (!handler.hasMessages(1)) {
                    handler.sendEmptyMessage(1);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void sendBroadcastSync(Intent intent, @Nullable Map<String, Object> map) {
        List<c> listA = a(intent);
        if (listA == null) {
            return;
        }
        for (c cVar : listA) {
            if (!cVar.f10452d) {
                cVar.f10450b.onReceive(intent, map);
            }
        }
    }

    public static void sendBroadcastSyncWithPendingBroadcasts(Intent intent, @Nullable Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            b();
        }
    }

    public static boolean sendBroadcastWithAdObject(String str, Object obj) {
        HashMap map = new HashMap(1);
        map.put("ad", obj);
        return sendBroadcast(new Intent(str), map);
    }

    public static void unregisterReceiver(Receiver receiver) {
        Map map = f10442a;
        synchronized (map) {
            try {
                List<c> list = (List) map.remove(receiver);
                if (list == null) {
                    return;
                }
                for (c cVar : list) {
                    cVar.f10452d = true;
                    Iterator<String> itActionsIterator = cVar.f10449a.actionsIterator();
                    while (itActionsIterator.hasNext()) {
                        String next = itActionsIterator.next();
                        List list2 = (List) f10443b.get(next);
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (((c) it.next()).f10450b == receiver) {
                                    cVar.f10452d = true;
                                    it.remove();
                                }
                            }
                            if (list2.size() <= 0) {
                                f10443b.remove(next);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static List a(Intent intent) {
        synchronized (f10442a) {
            try {
                String action = intent.getAction();
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                List<c> list = (List) f10443b.get(action);
                if (list == null) {
                    return null;
                }
                ArrayList arrayList = null;
                for (c cVar : list) {
                    if (!cVar.f10451c && cVar.f10449a.match(action, null, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(cVar);
                        cVar.f10451c = true;
                    }
                }
                if (arrayList == null) {
                    return null;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f10451c = false;
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
