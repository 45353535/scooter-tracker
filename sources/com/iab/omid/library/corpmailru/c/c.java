package com.iab.omid.library.corpmailru.c;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.corpmailru.c.a;
import com.iab.omid.library.corpmailru.d.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f34932a;

    public c(a aVar) {
        this.f34932a = aVar;
    }

    @NonNull
    ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.corpmailru.b.a aVarA = com.iab.omid.library.corpmailru.b.a.a();
        if (aVarA != null) {
            Collection<com.iab.omid.library.corpmailru.adsession.a> collectionC = aVarA.c();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionC.size() * 2) + 3);
            Iterator<com.iab.omid.library.corpmailru.adsession.a> it = collectionC.iterator();
            while (it.hasNext()) {
                View viewD = it.next().d();
                if (viewD != null && f.c(viewD) && (rootView = viewD.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fA = f.a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && f.a(arrayList.get(size - 1)) > fA) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.corpmailru.c.a
    public JSONObject a(View view) {
        return com.iab.omid.library.corpmailru.d.b.a(0, 0, 0, 0);
    }

    @Override // com.iab.omid.library.corpmailru.c.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0389a interfaceC0389a, boolean z10) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0389a.a(it.next(), this.f34932a, jSONObject);
        }
    }
}
