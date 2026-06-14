package sg.bigo.ads.core.e.a;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.amazon.aps.shared.util.APSSharedUtil;
import java.util.Map;
import sg.bigo.ads.api.core.q;
import sg.bigo.ads.core.e.b;

/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f104152b = "h";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final Map<String, String> f104154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f104155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f104156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f104157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f104158g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f104160i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f104159h = {0, 30000, 300000};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f104153a = 0;

    private h(@NonNull Map<String, String> map, q qVar, int i10, String str, String str2, String str3) {
        this.f104154c = map;
        this.f104155d = qVar;
        this.f104156e = str;
        this.f104157f = str2;
        this.f104158g = str3;
        this.f104160i = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str) {
        if (str == null || str.length() < 40) {
            return str;
        }
        return str.substring(0, 20) + APSSharedUtil.TRUNCATE_SEPARATOR + str.substring(str.length() - 10);
    }

    static /* synthetic */ void b(h hVar, Context context) {
        if (TextUtils.equals("va_show", hVar.f104156e) || TextUtils.equals("va_cli", hVar.f104156e) || TextUtils.equals("va_cpn_imp", hVar.f104156e) || TextUtils.equals("va_cpn_cli", hVar.f104156e)) {
            int i10 = hVar.f104153a + 1;
            hVar.f104153a = i10;
            hVar.a(context, i10);
        }
    }

    public static h a(@NonNull Map<String, String> map, q qVar, int i10, String str, String str2, String str3) {
        return new h(map, qVar, i10, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context) {
        sg.bigo.ads.common.t.a.a(0, 3, f104152b, "Vast tracker request start, action: " + this.f104156e + ", url: " + b(this.f104157f));
        sg.bigo.ads.core.e.b.a(context, 0, this.f104156e, new sg.bigo.ads.common.u.b.d(this.f104157f), this.f104158g, this.f104160i, false, this.f104153a, this.f104154c, new b.a() { // from class: sg.bigo.ads.core.e.a.h.2
            @Override // sg.bigo.ads.core.e.b.a
            public final void a() {
                sg.bigo.ads.common.t.a.a(0, 3, h.f104152b, "Vast tracker request error, action: " + h.this.f104156e + ", url: " + h.b(h.this.f104157f));
                h.b(h.this, context);
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final void b() {
                sg.bigo.ads.common.t.a.a(0, 3, h.f104152b, "Vast tracker request success, action: " + h.this.f104156e + ", url: " + h.b(h.this.f104157f));
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final boolean a(int i10) {
                return h.this.f104155d != null && h.this.f104155d.a(i10);
            }
        });
    }

    final void a(final Context context, int i10) {
        if (i10 >= 3) {
            sg.bigo.ads.common.t.a.a(0, 3, f104152b, "Vast tracker retry time exceed, action: " + this.f104156e + ", url: " + b(this.f104157f));
            return;
        }
        int[] iArr = this.f104159h;
        int i11 = iArr[i10 % iArr.length];
        if (i11 <= 0) {
            a(context);
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, f104152b, "Vast tracker retry after " + i11 + " ms, action: " + this.f104156e + ", url: " + b(this.f104157f));
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.h.1
            @Override // java.lang.Runnable
            public final void run() {
                h.this.a(context);
            }
        }, (long) i11);
    }
}
