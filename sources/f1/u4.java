package f1;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public final class u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wf f71227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h2 f71228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f71229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cif f71230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f71231e;

    public /* synthetic */ class a extends kotlin.jvm.internal.y implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f71232b = new a();

        public a() {
            super(1, JSONArray.class, "<init>", "<init>(Ljava/util/Collection;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONArray invoke(Collection collection) {
            return new JSONArray(collection);
        }
    }

    public u4(wf networkService, h2 trackingEventCache, Function1 jsonFactory, Cif eventTracker, String sessionId) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(trackingEventCache, "trackingEventCache");
        Intrinsics.checkNotNullParameter(jsonFactory, "jsonFactory");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f71227a = networkService;
        this.f71228b = trackingEventCache;
        this.f71229c = jsonFactory;
        this.f71230d = eventTracker;
        this.f71231e = sessionId;
    }

    public final void a(String url, List events) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(events, "events");
        m5 m5Var = new m5(url, this.f71228b, this.f71231e, null, this.f71230d, 8, null);
        m5Var.t((JSONArray) this.f71229c.invoke(events));
        this.f71227a.b(m5Var);
    }

    public /* synthetic */ u4(wf wfVar, h2 h2Var, Function1 function1, Cif cif, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(wfVar, h2Var, (i10 & 4) != 0 ? a.f71232b : function1, cif, str);
    }
}
