package m1;

import android.text.TextUtils;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import java.util.ArrayList;
import java.util.Iterator;
import n1.h;
import p1.c;
import p1.d;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends IIgniteServiceCallback.Stub {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f94398c;

    public b(q1.a aVar) {
        ArrayList arrayList = new ArrayList();
        this.f94398c = arrayList;
        arrayList.add(aVar);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        t1.b.a("%s : unable to retrieve property: %s", "IgnitePropertyCallback", str);
        Iterator it = this.f94398c.iterator();
        while (it.hasNext()) {
            h hVar = ((q1.a) it.next()).f98675a;
            if (hVar != null) {
                t1.b.a("%s : on one dt error", "OneDTAuthenticator");
                hVar.f95060l.set(true);
                if (hVar.f95053e != null) {
                    t1.b.b("%s : on one dt error : %s", "IgniteManager", str);
                }
            }
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        t1.b.a("%s : property retrieved", "IgnitePropertyCallback");
        Iterator it = this.f94398c.iterator();
        while (it.hasNext()) {
            h hVar = ((q1.a) it.next()).f98675a;
            if (hVar != null) {
                if (TextUtils.isEmpty(str)) {
                    t1.b.a("%s : on one dt error", "OneDTAuthenticator");
                    hVar.f95060l.set(true);
                    if (hVar.f95053e != null) {
                        t1.b.b("%s : on one dt error : %s", "IgniteManager", "One DT is empty");
                    }
                    p1.b.b(d.RAW_ONE_DT_ERROR, "error_code", c.ONE_DT_EMPTY_ENTITY.d());
                } else {
                    hVar.f95054f.b(str);
                    hVar.f95055g.getClass();
                    l1.c cVarA = u1.b.a(str);
                    hVar.f95056h = cVarA;
                    l1.a aVar = hVar.f95053e;
                    if (aVar != null) {
                        t1.b.a("%s : setting one dt entity", "IgniteManager");
                        aVar.f93863b = cVarA;
                    }
                }
            }
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
    }
}
