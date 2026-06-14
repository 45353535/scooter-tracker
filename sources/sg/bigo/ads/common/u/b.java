package sg.bigo.ads.common.u;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.u.b.c;
import sg.bigo.ads.common.u.c.c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b<Req extends sg.bigo.ads.common.u.b.c, Res extends sg.bigo.ads.common.u.c.c> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static b<sg.bigo.ads.common.u.b.c, sg.bigo.ads.common.u.c.a> f102733d = new a();

    static class a<Req extends sg.bigo.ads.common.u.b.c> extends b<Req, sg.bigo.ads.common.u.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Req f102734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        sg.bigo.ads.common.u.c.a f102735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        h f102736c;

        a() {
        }

        @Override // sg.bigo.ads.common.u.b
        public final /* bridge */ /* synthetic */ sg.bigo.ads.common.u.c.c a(@NonNull sg.bigo.ads.common.u.c.a aVar) {
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.common.u.b
        public final /* bridge */ /* synthetic */ void a(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull sg.bigo.ads.common.u.c.c cVar2) {
            this.f102734a = cVar;
            this.f102735b = (sg.bigo.ads.common.u.c.a) cVar2;
        }

        @Override // sg.bigo.ads.common.u.b
        public final void a(@NonNull Req req, @NonNull h hVar) {
            this.f102734a = req;
            this.f102736c = hVar;
        }
    }

    public abstract Res a(@NonNull sg.bigo.ads.common.u.c.a aVar);

    public void a(@NonNull Req req) {
    }

    public abstract void a(@NonNull Req req, @NonNull Res res);

    public abstract void a(@NonNull Req req, @NonNull h hVar);

    public void a(@NonNull Req req, @Nullable String str, int i10) {
    }

    public boolean a(@NonNull Req req, int i10) {
        return i10 >= 200 && i10 < 300;
    }
}
