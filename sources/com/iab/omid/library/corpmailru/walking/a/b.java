package com.iab.omid.library.corpmailru.walking.a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f34979a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final InterfaceC0391b f34980d;

    public interface a {
        void a(b bVar);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.corpmailru.walking.a.b$b, reason: collision with other inner class name */
    public interface InterfaceC0391b {
        void a(JSONObject jSONObject);

        JSONObject b();
    }

    public b(InterfaceC0391b interfaceC0391b) {
        this.f34980d = interfaceC0391b;
    }

    public void a(a aVar) {
        this.f34979a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f34979a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
