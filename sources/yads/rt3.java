package yads;

import android.util.Log;
import android.view.View;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class rt3 implements xs3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xs3 f115594a;

    public rt3(zt3 zt3Var) {
        this.f115594a = zt3Var;
    }

    @Override // yads.xs3
    public final JSONObject a(View view) {
        JSONObject jSONObjectA = st3.a(0, 0, 0, 0);
        try {
            jSONObjectA.put("noOutputDevice", qt3.f115160a[pf0.a(zs3.a() != 1 ? 2 : fu3.f110933a)] == 1);
            return jSONObjectA;
        } catch (JSONException e10) {
            Log.e("OMIDLIB", "Error with setting output device status", e10);
            return jSONObjectA;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.xs3
    public final void a(View view, JSONObject jSONObject, us3 us3Var, boolean z10, boolean z11) {
        View rootView;
        ArrayList arrayList = new ArrayList();
        ut3 ut3Var = ut3.f116776c;
        if (ut3Var != null) {
            Collection collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(ut3Var.f116778b);
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionUnmodifiableCollection.size() * 2) + 3);
            Iterator it = collectionUnmodifiableCollection.iterator();
            while (it.hasNext()) {
                View view2 = (View) ((dt3) it.next()).f110064d.get();
                if (view2 != null && ou3.d(view2) && (rootView = view2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fB = ou3.b(rootView);
                    int size = arrayList.size();
                    while (size > 0 && ou3.b((View) arrayList.get(size - 1)) > fB) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((k63) us3Var).a((View) it2.next(), this.f115594a, jSONObject, z11);
        }
    }
}
