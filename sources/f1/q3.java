package f1;

import f1.bd;
import java.io.File;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q3 extends bd {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f70802l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f70803m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f70804n;

    public interface a {
        void a(String str, String str2);

        void b(String str, String str2, long j10, e9 e9Var);

        void c(String str, String str2, g1.a aVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(i iVar, File outputFile, String uri, a aVar, r priority, String appId) {
        super(bd.c.f69468b, uri, priority, outputFile);
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.f70802l = iVar;
        this.f70803m = aVar;
        this.f70804n = appId;
        this.f69463j = bd.b.f69465c;
    }

    @Override // f1.bd
    public qd a() {
        HashMap map = new HashMap();
        map.put("X-Chartboost-App", this.f70804n);
        map.put("X-Chartboost-Client", g3.c());
        i iVar = this.f70802l;
        map.put("X-Chartboost-Reachability", String.valueOf(iVar != null ? iVar.c() : null));
        return new qd(map, null, null);
    }

    @Override // f1.bd
    public void c(g1.a aVar, ef efVar) {
        a aVar2 = this.f70803m;
        if (aVar2 != null) {
            String strJ = j();
            File file = this.f69458e;
            Intrinsics.checkNotNull(file);
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            aVar2.c(strJ, name, aVar);
        }
    }

    @Override // f1.bd
    public void d(Object obj, ef efVar) {
        a aVar = this.f70803m;
        if (aVar != null) {
            String strJ = j();
            File file = this.f69458e;
            Intrinsics.checkNotNull(file);
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            aVar.a(strJ, name);
        }
    }

    @Override // f1.bd
    public void f(String uri, long j10) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        a aVar = this.f70803m;
        if (aVar != null) {
            File file = this.f69458e;
            Intrinsics.checkNotNull(file);
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            aVar.b(uri, name, j10, null);
        }
    }
}
