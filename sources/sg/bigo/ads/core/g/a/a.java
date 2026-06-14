package sg.bigo.ads.core.g.a;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.core.t;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.g.a.b;
import sg.bigo.ads.core.g.f;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements sg.bigo.ads.core.g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ViewGroup f104276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public b f104277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1292a f104278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b.a f104279d = new b.a() { // from class: sg.bigo.ads.core.g.a.a.1
        @Override // sg.bigo.ads.core.g.a.b.a
        public final void a() {
            InterfaceC1292a interfaceC1292a = a.this.f104278c;
            if (interfaceC1292a != null) {
                interfaceC1292a.a();
            }
            b bVarB = a.this.b();
            u.a(bVarB, a.this.f104276a, null, -1);
            bVarB.setVPAIDEvenListener(a.this.f104277b.getVPAIDEvenListener());
            bVarB.setLayoutParams(a.this.f104277b.getLayoutParams());
            u.b(a.this.f104277b);
            a.this.f104277b = bVarB;
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f104280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f104281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f104282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f104283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f f104284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f104285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f104286k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private t f104287l;

    /* JADX INFO: renamed from: sg.bigo.ads.core.g.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC1292a {
        void a();
    }

    public a(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull String str, int i10, int i11, @NonNull f fVar, @Nullable String str2, int i12, t tVar) {
        this.f104280e = context;
        this.f104276a = viewGroup;
        this.f104281f = str;
        this.f104282g = i10;
        this.f104283h = i11;
        this.f104284i = fVar;
        this.f104285j = str2;
        this.f104286k = i12;
        this.f104287l = tVar;
        b bVarB = b();
        this.f104277b = bVarB;
        u.a(bVarB, viewGroup, null, 0);
    }

    @Override // sg.bigo.ads.api.c.a
    public final void a() {
        this.f104277b.a("window.vpaidwrapper.pauseAd()");
    }

    final b b() {
        b bVar = new b(this.f104280e, this.f104281f, this.f104282g, this.f104283h, this.f104284i, this.f104285j, this.f104286k, this.f104287l);
        bVar.setOnRenderProcessGoneListener(this.f104279d);
        return bVar;
    }
}
