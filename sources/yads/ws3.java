package yads;

import android.webkit.WebView;
import j$.util.DesugarCollections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ws3 implements wt3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ws3 f117555f = new ws3(new yt3());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iu3 f117556a = new iu3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Date f117557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f117558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yt3 f117559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f117560e;

    public ws3(yt3 yt3Var) {
        this.f117559d = yt3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.wt3
    public final void a(boolean z10) {
        if (!this.f117560e && z10) {
            this.f117556a.getClass();
            Date date = new Date();
            Date date2 = this.f117557b;
            if (date2 == null || date.after(date2)) {
                this.f117557b = date;
                if (this.f117558c) {
                    Iterator it = DesugarCollections.unmodifiableCollection(ut3.f116776c.f116778b).iterator();
                    while (it.hasNext()) {
                        ia iaVar = ((dt3) it.next()).f110065e;
                        Date date3 = this.f117557b;
                        Date date4 = date3 != null ? (Date) date3.clone() : null;
                        iaVar.getClass();
                        if (date4 != null) {
                            JSONObject jSONObject = new JSONObject();
                            st3.a(jSONObject, "timestamp", Long.valueOf(date4.getTime()));
                            pu3.f114791a.a((WebView) iaVar.f111922b.get(), "setLastActivity", jSONObject);
                        }
                    }
                }
            }
        }
        this.f117560e = z10;
    }
}
