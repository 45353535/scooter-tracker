package qd;

import com.adjust.sdk.Constants;
import com.ironsource.C4240b4;
import eg.g;
import eg.m1;
import java.io.File;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONException;
import org.json.JSONObject;
import pd.x;
import uf.i;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f99097f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f99098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ud.b f99099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f99100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f99101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f99102e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f99103r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ File f99104s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, Continuation continuation) {
            super(2, continuation);
            this.f99104s = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f99104s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f99103r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            td.b.f(this.f99104s);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class c extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f99105r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f99106s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ File f99107t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ d f99108u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file, d dVar, Continuation continuation) {
            super(2, continuation);
            this.f99107t = file;
            this.f99108u = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(this.f99107t, this.f99108u, continuation);
            cVar.f99106s = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            qd.c cVar;
            qd.c cVar2;
            pf.b.g();
            if (this.f99105r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            if (!this.f99107t.exists()) {
                return null;
            }
            Object obj3 = this.f99108u.f99100c;
            d dVar = this.f99108u;
            File file = this.f99107t;
            synchronized (obj3) {
                try {
                    qd.c cVar3 = (qd.c) dVar.f99101d.get(file.getName());
                    if (cVar3 != null) {
                        return cVar3;
                    }
                    qd.c cVarK = dVar.k(file);
                    if (cVarK != null) {
                        Map map = dVar.f99101d;
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "mediaFile.name");
                        map.put(name, cVarK);
                        return cVarK;
                    }
                    try {
                        long length = file.length();
                        b.a aVar = kotlin.time.b.f93560c;
                        cg.b bVar = cg.b.f6838e;
                        obj2 = obj3;
                        try {
                            cVar = new qd.c(file, "", length, 0L, kotlin.time.c.s(0, bVar), kotlin.time.c.s(0, bVar), new Date(file.lastModified()), new Date(file.lastModified()), null);
                        } catch (Throwable unused) {
                            cVar = null;
                        }
                    } catch (Throwable unused2) {
                        obj2 = obj3;
                    }
                    if (cVar != null) {
                        try {
                            dVar.n(cVar);
                            cVar2 = cVar;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        cVar2 = null;
                    }
                    return cVar2;
                } catch (Throwable th3) {
                    th = th3;
                    obj2 = obj3;
                }
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: qd.d$d, reason: collision with other inner class name */
    static final class C1175d extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f99109r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f99110s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ qd.c f99112u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1175d(qd.c cVar, Continuation continuation) {
            super(2, continuation);
            this.f99112u = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            C1175d c1175d = d.this.new C1175d(this.f99112u, continuation);
            c1175d.f99110s = obj;
            return c1175d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f99109r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            d dVar = d.this;
            qd.c cVar = this.f99112u;
            try {
                File fileL = dVar.l(cVar.e());
                String string = dVar.o(cVar).toString(2);
                Intrinsics.checkNotNullExpressionValue(string, "mediaFileMetadata.toJSONObject().toString(2)");
                i.p(fileL, string, null, 2, null);
                Unit unit = Unit.f93236a;
            } catch (Throwable unused) {
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C1175d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class e extends Lambda implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineScope invoke() {
            return kotlinx.coroutines.i.a(m1.b(null, 1, null).plus(d.this.f99098a.e()));
        }
    }

    static final class f extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f99114r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ File f99116t;

        static final class a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ File f99117f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(File file) {
                super(0);
                this.f99117f = file;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Track usage for " + this.f99117f.getName();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(File file, Continuation continuation) {
            super(2, continuation);
            this.f99116t = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return d.this.new f(this.f99116t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objH;
            Object objG = pf.b.g();
            int i10 = this.f99114r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                d.this.f99099b.a("MediaFileMetadataManager", new a(this.f99116t));
                d dVar = d.this;
                File file = this.f99116t;
                this.f99114r = 1;
                objH = dVar.h(file, this);
                if (objH == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                objH = obj;
            }
            qd.c cVar = (qd.c) objH;
            if (cVar == null) {
                return null;
            }
            d.this.n(qd.c.b(cVar, null, null, 0L, cVar.j() + 1, 0L, 0L, new Date(), null, 183, null));
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public d(x dispatchers, ud.b logger) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f99098a = dispatchers;
        this.f99099b = logger;
        this.f99100c = new Object();
        this.f99101d = new LinkedHashMap();
        this.f99102e = lf.i.a(new e());
    }

    private final CoroutineScope i() {
        return (CoroutineScope) this.f99102e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qd.c k(File file) {
        try {
            File fileL = l(file);
            if (fileL.exists() && fileL.length() != 0) {
                return p(new JSONObject(i.m(fileL, null, 1, null)));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject o(qd.c cVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C4240b4.i.f42616b, cVar.e().getPath());
        jSONObject.put("mime", cVar.g());
        jSONObject.put("size", cVar.i());
        jSONObject.put("frequency", cVar.j());
        jSONObject.put("pingTime", kotlin.time.b.q(cVar.h()));
        jSONObject.put("downloadTime", kotlin.time.b.q(cVar.d()));
        jSONObject.put("lastUsed", cVar.f().getTime());
        jSONObject.put("createdAt", cVar.c().getTime());
        return jSONObject;
    }

    private final qd.c p(JSONObject jSONObject) {
        try {
            File file = new File(jSONObject.getString(C4240b4.i.f42616b));
            String string = jSONObject.getString("mime");
            Intrinsics.checkNotNullExpressionValue(string, "getString(KEY_MIME_TYPE)");
            long j10 = jSONObject.getLong("size");
            long j11 = jSONObject.getLong("frequency");
            b.a aVar = kotlin.time.b.f93560c;
            long j12 = jSONObject.getLong("pingTime");
            cg.b bVar = cg.b.f6838e;
            return new qd.c(file, string, j10, j11, kotlin.time.c.t(j12, bVar), kotlin.time.c.t(jSONObject.getLong("downloadTime"), bVar), new Date(jSONObject.getLong("lastUsed")), new Date(jSONObject.getLong("createdAt")), null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void g(File mediaFile) {
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        synchronized (this.f99100c) {
        }
        eg.i.d(i(), null, null, new b(mediaFile, null), 3, null);
    }

    public final Object h(File file, Continuation continuation) {
        return g.g(this.f99098a.e(), new c(file, this, null), continuation);
    }

    public final boolean j(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return Intrinsics.areEqual(i.y(file), Constants.REFERRER_API_META);
    }

    public final File l(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        if (j(file)) {
            return file;
        }
        return new File(file.getParentFile(), i.z(file) + ".meta");
    }

    public final void m() {
        synchronized (this.f99100c) {
            this.f99101d.clear();
            Unit unit = Unit.f93236a;
        }
    }

    public final void n(qd.c mediaFileMetadata) {
        Intrinsics.checkNotNullParameter(mediaFileMetadata, "mediaFileMetadata");
        synchronized (this.f99100c) {
            Map map = this.f99101d;
            String name = mediaFileMetadata.e().getName();
            Intrinsics.checkNotNullExpressionValue(name, "mediaFileMetadata.file.name");
            map.put(name, mediaFileMetadata);
            Unit unit = Unit.f93236a;
        }
        eg.i.d(i(), null, null, new C1175d(mediaFileMetadata, null), 3, null);
    }

    public final Object q(File file, Continuation continuation) {
        return g.g(this.f99098a.e(), new f(file, null), continuation);
    }
}
