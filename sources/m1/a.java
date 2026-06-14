package m1;

import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import org.json.JSONObject;
import p1.d;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends IIgniteServiceCallback.Stub {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n1.a f94397c;

    public a(n1.a aVar) {
        this.f94397c = aVar;
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        this.f94397c.a(str);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        String string;
        try {
            string = new JSONObject(str).getJSONObject("data").getString("token");
        } catch (Exception e10) {
            p1.b.a(d.ONE_DT_GENERAL_ERROR, e10);
            t1.b.b("%s : resolveClientToken : %s", "IgniteAuthenticationCallback", e10.toString());
            string = null;
        }
        this.f94397c.c(string);
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
