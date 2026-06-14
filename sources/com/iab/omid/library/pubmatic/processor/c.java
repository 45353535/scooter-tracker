package com.iab.omid.library.pubmatic.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.pubmatic.processor.a;
import com.iab.omid.library.pubmatic.utils.e;
import com.iab.omid.library.pubmatic.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f35746a;

    public c(a aVar) {
        this.f35746a = aVar;
    }

    @NonNull
    ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.pubmatic.internal.c cVarC = com.iab.omid.library.pubmatic.internal.c.c();
        if (cVarC != null) {
            Collection<com.iab.omid.library.pubmatic.adsession.a> collectionA = cVarC.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionA.size() * 2) + 3);
            Iterator<com.iab.omid.library.pubmatic.adsession.a> it = collectionA.iterator();
            while (it.hasNext()) {
                View viewE = it.next().e();
                if (viewE != null && h.g(viewE) && (rootView = viewE.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fD = h.d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.d(arrayList.get(size - 1)) > fD) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.pubmatic.processor.a
    public JSONObject a(View view) {
        JSONObject jSONObjectA = com.iab.omid.library.pubmatic.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.pubmatic.utils.c.a(jSONObjectA, e.a());
        return jSONObjectA;
    }

    @Override // com.iab.omid.library.pubmatic.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0414a interfaceC0414a, boolean z10, boolean z11) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0414a.a(it.next(), this.f35746a, jSONObject, z11);
        }
    }
}
