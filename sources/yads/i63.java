package yads;

import android.util.Log;
import android.view.View;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class i63 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        k63 k63Var = k63.f112606g;
        k63Var.getClass();
        k63Var.f112612b.clear();
        Iterator it = DesugarCollections.unmodifiableCollection(ut3.f116776c.f116778b).iterator();
        while (it.hasNext()) {
            ((dt3) it.next()).getClass();
        }
        k63Var.f112616f = System.nanoTime();
        k63Var.f112614d.a();
        long jNanoTime = System.nanoTime();
        rt3 rt3Var = k63Var.f112613c.f112459b;
        if (k63Var.f112614d.f108810f.size() > 0) {
            for (String str : k63Var.f112614d.f108810f) {
                JSONObject jSONObjectA = rt3Var.a(null);
                View view = (View) k63Var.f112614d.f108807c.get(str);
                zt3 zt3Var = k63Var.f112613c.f112458a;
                String str2 = (String) k63Var.f112614d.f108811g.get(str);
                if (str2 != null) {
                    JSONObject jSONObjectA2 = zt3Var.a(view);
                    try {
                        jSONObjectA2.put("adSessionId", str);
                    } catch (JSONException e10) {
                        au3.a("Error with setting ad session id", e10);
                    }
                    try {
                        jSONObjectA2.put("notVisibleReason", str2);
                    } catch (JSONException e11) {
                        Log.e("OMIDLIB", "Error with setting not visible reason", e11);
                    }
                    st3.a(jSONObjectA, jSONObjectA2);
                }
                st3.a(jSONObjectA);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                mt3 mt3Var = k63Var.f112615e;
                mt3Var.f113604b.a(new gu3(mt3Var, hashSet, jSONObjectA, jNanoTime));
            }
        }
        if (k63Var.f112614d.f108809e.size() > 0) {
            JSONObject jSONObjectA3 = rt3Var.a(null);
            rt3Var.a(null, jSONObjectA3, k63Var, true, false);
            st3.a(jSONObjectA3);
            mt3 mt3Var2 = k63Var.f112615e;
            mt3Var2.f113604b.a(new ju3(mt3Var2, k63Var.f112614d.f108809e, jSONObjectA3, jNanoTime));
        } else {
            mt3 mt3Var3 = k63Var.f112615e;
            mt3Var3.f113604b.a(new bu3(mt3Var3));
        }
        at3 at3Var = k63Var.f112614d;
        at3Var.f108805a.clear();
        at3Var.f108806b.clear();
        at3Var.f108807c.clear();
        at3Var.f108808d.clear();
        at3Var.f108809e.clear();
        at3Var.f108810f.clear();
        at3Var.f108811g.clear();
        at3Var.f108814j = false;
        at3Var.f108812h.clear();
        long jNanoTime2 = System.nanoTime() - k63Var.f112616f;
        if (k63Var.f112611a.size() > 0) {
            Iterator it2 = k63Var.f112611a.iterator();
            if (it2.hasNext()) {
                if (it2.next() != null) {
                    throw new ClassCastException();
                }
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                throw null;
            }
        }
        su3.f115957d.a();
    }
}
