package yads;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nt3 extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public et3 f114032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mt3 f114033b;

    public nt3(mt3 mt3Var) {
        this.f114033b = mt3Var;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        et3 et3Var = this.f114032a;
        if (et3Var != null) {
            tt3 tt3Var = (tt3) et3Var;
            tt3Var.f116385c = null;
            tt3Var.a();
        }
    }

    public final void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
