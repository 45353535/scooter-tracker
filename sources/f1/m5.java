package f1;

import com.ironsource.D5;
import f1.z;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class m5 extends z {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h2 f70466v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f70467w;

    /* JADX WARN: Illegal instructions before constructor call */
    public m5(String url, h2 trackingEventCache, String sessionId, z.a callback, Cif eventTracker) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(trackingEventCache, "trackingEventCache");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        h1.b bVar = h1.b.f72867a;
        super(bVar.a(url), bVar.d(url), (n3) null, r.f70879e, callback, eventTracker, (wc) null, 64, (DefaultConstructorMarker) null);
        this.f70466v = trackingEventCache;
        this.f70467w = sessionId;
        this.f71691t = false;
    }

    public final Map F(String str) {
        return MapsKt.mapOf(TuplesKt.to("Accept", D5.L), TuplesKt.to("X-Chartboost-Client", g3.c()), TuplesKt.to("X-Chartboost-API", "9.10.2"), TuplesKt.to("x-monetization-session-id", str));
    }

    @Override // f1.z, f1.bd
    public qd a() {
        Map mapF = F(this.f70467w);
        JSONArray jSONArrayB = B();
        return new qd(mapF, jSONArrayB != null ? tb.c(jSONArrayB) : null, D5.L);
    }

    public /* synthetic */ m5(String str, h2 h2Var, String str2, z.a aVar, Cif cif, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, h2Var, str2, (i10 & 8) != 0 ? new a(h2Var) : aVar, cif);
    }

    public static final class a implements z.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h2 f70468b;

        public a(h2 h2Var) {
            this.f70468b = h2Var;
        }

        @Override // f1.z.a
        public void c(z zVar, g1.a aVar) {
            JSONArray jSONArrayB;
            eg.e("Request " + (zVar != null ? zVar.j() : null) + " failed!", null, 2, null);
            if (zVar == null || (jSONArrayB = zVar.B()) == null) {
                return;
            }
            this.f70468b.g(jSONArrayB);
        }

        @Override // f1.z.a
        public void b(z zVar, JSONObject jSONObject) {
        }
    }
}
