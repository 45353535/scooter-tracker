package sg.bigo.ads.core.e.a;

import android.content.Context;
import java.util.Arrays;
import java.util.Map;
import sg.bigo.ads.api.core.q;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes4.dex */
public class b extends c {
    public b(q qVar, e[] eVarArr, e[] eVarArr2, e[] eVarArr3, e[] eVarArr4, Map<String, String> map) {
        super(qVar);
        this.f104074b.addAll(Arrays.asList(eVarArr));
        this.f104075c.addAll(Arrays.asList(eVarArr2));
        this.f104076d.addAll(Arrays.asList(eVarArr3));
        this.f104077e.addAll(Arrays.asList(eVarArr4));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public final void a(final Context context, final int i10) {
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.b.2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f104064b = false;

            @Override // java.lang.Runnable
            public final void run() {
                b.this.a(context, this.f104064b, i10);
            }
        });
    }

    public final void a(Map<String, String> map) {
        if (k.a(map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }
}
