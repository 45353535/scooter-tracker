package com.iab.omid.library.ironsrc.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f35391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final InterfaceC0404b f35392b;

    public interface a {
        void a(b bVar);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.walking.async.b$b, reason: collision with other inner class name */
    public interface InterfaceC0404b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0404b interfaceC0404b) {
        this.f35392b = interfaceC0404b;
    }

    public void a(a aVar) {
        this.f35391a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f35391a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
