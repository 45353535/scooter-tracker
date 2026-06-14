package sg.bigo.ads.core.b.b;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f103943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f103944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f103945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f103946d;

    public static c a() {
        c cVar = new c();
        String strK = sg.bigo.ads.common.x.a.k();
        if (!q.a((CharSequence) strK)) {
            String[] strArrSplit = strK.split(StringUtils.COMMA);
            if (strArrSplit.length == 4) {
                try {
                    cVar.f103943a = Integer.parseInt(strArrSplit[0]);
                    cVar.f103944b = Integer.parseInt(strArrSplit[1]);
                    cVar.f103945c = Integer.parseInt(strArrSplit[2]);
                    cVar.f103946d = Integer.parseInt(strArrSplit[3]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        return cVar;
    }

    protected final boolean b() {
        return ((this.f103943a + this.f103944b) + this.f103945c) + this.f103946d == 0;
    }

    protected final void c() {
        this.f103943a = 0;
        this.f103944b = 0;
        this.f103945c = 0;
        this.f103946d = 0;
        sg.bigo.ads.common.x.a.d(toString());
    }

    @NonNull
    public final String toString() {
        return this.f103943a + StringUtils.COMMA + this.f103944b + StringUtils.COMMA + this.f103945c + StringUtils.COMMA + this.f103946d;
    }

    protected final void a(String str) {
        str.getClass();
        switch (str) {
            case "filled":
                this.f103944b++;
                break;
            case "load":
                this.f103943a++;
                break;
            case "impression":
                this.f103945c++;
                break;
            case "clicked":
                this.f103946d++;
                break;
        }
        sg.bigo.ads.common.x.a.d(toString());
    }
}
