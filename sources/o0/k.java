package o0;

import p0.c;

/* JADX INFO: loaded from: classes5.dex */
public class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c.a f96276f = c.a.a("ef");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final c.a f96277g = c.a.a("nm", "v");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k0.a f96278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k0.b f96279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k0.b f96280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private k0.b f96281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k0.b f96282e;

    private void a(p0.c cVar, d0.i iVar) {
        cVar.beginObject();
        String strNextString = "";
        while (cVar.hasNext()) {
            int iQ = cVar.q(f96277g);
            if (iQ == 0) {
                strNextString = cVar.nextString();
            } else if (iQ == 1) {
                strNextString.getClass();
                switch (strNextString) {
                    case "Distance":
                        this.f96281d = d.e(cVar, iVar);
                        break;
                    case "Opacity":
                        this.f96279b = d.f(cVar, iVar, false);
                        break;
                    case "Direction":
                        this.f96280c = d.f(cVar, iVar, false);
                        break;
                    case "Shadow Color":
                        this.f96278a = d.c(cVar, iVar);
                        break;
                    case "Softness":
                        this.f96282e = d.e(cVar, iVar);
                        break;
                    default:
                        cVar.skipValue();
                        break;
                }
            } else {
                cVar.s();
                cVar.skipValue();
            }
        }
        cVar.endObject();
    }

    j b(p0.c cVar, d0.i iVar) {
        k0.b bVar;
        k0.b bVar2;
        k0.b bVar3;
        k0.b bVar4;
        while (cVar.hasNext()) {
            if (cVar.q(f96276f) != 0) {
                cVar.s();
                cVar.skipValue();
            } else {
                cVar.beginArray();
                while (cVar.hasNext()) {
                    a(cVar, iVar);
                }
                cVar.endArray();
            }
        }
        k0.a aVar = this.f96278a;
        if (aVar == null || (bVar = this.f96279b) == null || (bVar2 = this.f96280c) == null || (bVar3 = this.f96281d) == null || (bVar4 = this.f96282e) == null) {
            return null;
        }
        return new j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
