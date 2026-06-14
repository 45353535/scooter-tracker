package x9;

import java.util.Map;
import s9.k;
import y9.i;
import y9.j;

/* JADX INFO: loaded from: classes12.dex */
public abstract class g {
    public static k a(j jVar, String str, i iVar, int i10, Map map) {
        return new k.b().i(iVar.b(str)).h(iVar.f108451a).g(iVar.f108452b).f(b(jVar, iVar)).b(i10).e(map).a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b(j jVar, i iVar) {
        String strA = jVar.a();
        return strA != null ? strA : iVar.b(((y9.b) jVar.f108457c.get(0)).f108401a).toString();
    }
}
