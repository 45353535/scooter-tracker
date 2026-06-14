package sg.bigo.ads.controller;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.core.f;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f103128a;

    public a(c cVar) {
        this.f103128a = cVar;
    }

    @Override // sg.bigo.ads.controller.e
    public final void a(int i10, int i11, int i12, @NonNull String str, @Nullable Pair<sg.bigo.ads.api.b, l> pair) {
        c cVar = this.f103128a;
        if (cVar != null) {
            cVar.a(i10, i11, i12, str, pair);
        }
    }

    @Override // sg.bigo.ads.controller.e
    public final /* bridge */ /* synthetic */ void a(int i10, @NonNull sg.bigo.ads.api.b bVar, @NonNull f[] fVarArr) {
        sg.bigo.ads.api.b bVar2 = bVar;
        f[] fVarArr2 = fVarArr;
        c cVar = this.f103128a;
        if (cVar != null) {
            cVar.a(i10, bVar2, fVarArr2);
        }
    }
}
