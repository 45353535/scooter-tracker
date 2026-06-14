package g0;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class o extends g {

    class a extends r0.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r0.b f72086d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ r0.c f72087e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ j0.b f72088f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ o f72089g;

        a(o oVar, r0.b bVar, r0.c cVar, j0.b bVar2) {
            this.f72086d = bVar;
            this.f72087e = cVar;
            this.f72088f = bVar2;
            this.f72089g = oVar;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public j0.b a(r0.b bVar) {
            this.f72086d.h(bVar.f(), bVar.a(), ((j0.b) bVar.g()).f85418a, ((j0.b) bVar.b()).f85418a, bVar.d(), bVar.c(), bVar.e());
            String str = (String) this.f72087e.a(this.f72086d);
            j0.b bVar2 = (j0.b) (bVar.c() == 1.0f ? bVar.b() : bVar.g());
            this.f72088f.a(str, bVar2.f85419b, bVar2.f85420c, bVar2.f85421d, bVar2.f85422e, bVar2.f85423f, bVar2.f85424g, bVar2.f85425h, bVar2.f85426i, bVar2.f85427j, bVar2.f85428k, bVar2.f85429l, bVar2.f85430m);
            return this.f72088f;
        }
    }

    public o(List list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g0.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public j0.b i(r0.a aVar, float f10) {
        Object obj;
        r0.c cVar = this.f72042e;
        if (cVar == null) {
            return (f10 != 1.0f || (obj = aVar.f99187c) == null) ? (j0.b) aVar.f99186b : (j0.b) obj;
        }
        float f11 = aVar.f99191g;
        Float f12 = aVar.f99192h;
        float fFloatValue = f12 == null ? Float.MAX_VALUE : f12.floatValue();
        Object obj2 = aVar.f99186b;
        j0.b bVar = (j0.b) obj2;
        Object obj3 = aVar.f99187c;
        return (j0.b) cVar.b(f11, fFloatValue, bVar, obj3 == null ? (j0.b) obj2 : (j0.b) obj3, f10, d(), f());
    }

    public void s(r0.c cVar) {
        super.o(new a(this, new r0.b(), cVar, new j0.b()));
    }
}
