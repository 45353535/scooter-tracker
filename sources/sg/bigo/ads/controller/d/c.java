package sg.bigo.ads.controller.d;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.common.j;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends a {
    public c(@NonNull sg.bigo.ads.common.g gVar, @Nullable sg.bigo.ads.controller.a.b bVar) {
        super(gVar, bVar);
    }

    @Override // sg.bigo.ads.common.j
    public final void a(@NonNull Map<String, Object> map, final j.a aVar) {
        new sg.bigo.ads.controller.g.g(map, this.f103520a, this.f103521b, new sg.bigo.ads.controller.b() { // from class: sg.bigo.ads.controller.d.c.1
            @Override // sg.bigo.ads.controller.e
            public final void a(int i10, int i11, int i12, @NonNull String str, @Nullable Object obj) {
                aVar.a(i11, i12, str);
            }

            @Override // sg.bigo.ads.controller.b
            public final void a(int i10, @NonNull String str) {
                aVar.a();
            }
        }).b();
    }
}
