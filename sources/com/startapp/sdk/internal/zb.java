package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class zb {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f65686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static zb f65687g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f65689b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f65690c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f65691d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wb f65692e;

    static {
        int i10 = q0.f65128a;
        "startapp.".concat(zb.class.getSimpleName());
        f65686f = new Object();
    }

    public zb(Context context) {
        this.f65688a = context;
        this.f65692e = new wb(this, context.getMainLooper());
    }

    public static zb a(Context context) {
        zb zbVar;
        synchronized (f65686f) {
            try {
                if (f65687g == null) {
                    Context contextA = x0.a(context);
                    if (contextA != null) {
                        context = contextA;
                    }
                    f65687g = new zb(context);
                }
                zbVar = f65687g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zbVar;
    }

    public final void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f65689b) {
            try {
                yb ybVar = new yb(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) this.f65689b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f65689b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(intentFilter);
                for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                    String action = intentFilter.getAction(i10);
                    ArrayList arrayList2 = (ArrayList) this.f65690c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f65690c.put(action, arrayList2);
                    }
                    arrayList2.add(ybVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f65689b) {
            try {
                ArrayList arrayList = (ArrayList) this.f65689b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    IntentFilter intentFilter = (IntentFilter) arrayList.get(i10);
                    for (int i11 = 0; i11 < intentFilter.countActions(); i11++) {
                        String action = intentFilter.getAction(i11);
                        ArrayList arrayList2 = (ArrayList) this.f65690c.get(action);
                        if (arrayList2 != null) {
                            int i12 = 0;
                            while (i12 < arrayList2.size()) {
                                if (((yb) arrayList2.get(i12)).f65601b == broadcastReceiver) {
                                    arrayList2.remove(i12);
                                    i12--;
                                }
                                i12++;
                            }
                            if (arrayList2.size() <= 0) {
                                this.f65690c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(Intent intent) {
        synchronized (this.f65689b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f65688a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                ArrayList arrayList = (ArrayList) this.f65690c.get(intent.getAction());
                if (arrayList != null) {
                    ArrayList arrayList2 = null;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        yb ybVar = (yb) arrayList.get(i10);
                        if (!ybVar.f65602c && ybVar.f65600a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager") >= 0) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(ybVar);
                            ybVar.f65602c = true;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            ((yb) arrayList2.get(i11)).f65602c = false;
                        }
                        this.f65691d.add(new xb(intent, arrayList2));
                        if (!this.f65692e.hasMessages(1)) {
                            this.f65692e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
