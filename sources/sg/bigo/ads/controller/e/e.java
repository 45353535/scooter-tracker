package sg.bigo.ads.controller.e;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.adjust.sdk.network.ErrorCodes;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.controller.a.b.d;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends sg.bigo.ads.controller.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final sg.bigo.ads.common.g f103617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final sg.bigo.ads.controller.b.d f103618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final sg.bigo.ads.controller.b.h f103619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final sg.bigo.ads.controller.a.b f103620d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f103624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Context f103625i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f103628l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f103621e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f103622f = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<b> f103626j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicReference<sg.bigo.ads.controller.g.h> f103627k = new AtomicReference<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final AtomicInteger f103623g = new AtomicInteger(0);

    public interface a {
        void a(int i10);

        void a(int i10, int i11, String str);
    }

    static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f103638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f103639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sg.bigo.ads.common.g f103640c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final sg.bigo.ads.controller.b.d f103641d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final sg.bigo.ads.controller.b.h f103642e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final sg.bigo.ads.controller.a.b f103643f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final e f103644g;

        public b(String str, a aVar, @NonNull sg.bigo.ads.controller.b.d dVar, @NonNull sg.bigo.ads.controller.b.h hVar, @NonNull sg.bigo.ads.common.g gVar, @NonNull sg.bigo.ads.controller.a.b bVar, @NonNull e eVar) {
            this.f103638a = str;
            this.f103639b = aVar;
            this.f103640c = gVar;
            this.f103641d = dVar;
            this.f103642e = hVar;
            this.f103643f = bVar;
            this.f103644g = eVar;
            if (c.a().f103593b.compareAndSet(-1, 0)) {
                sg.bigo.ads.common.t.a.a(0, 3, "ConfigInitProcessor", "reinit config and set status.");
            }
        }

        @Override // sg.bigo.ads.controller.e.e.a
        public final void a(int i10) {
            c.a().b();
            a aVar = this.f103639b;
            if (aVar != null) {
                aVar.a(i10);
            }
            if (sg.bigo.ads.api.a.i.f102116a.x()) {
                d.a.f103269a.a(this.f103643f, this.f103640c, this.f103641d, this.f103642e, this.f103644g);
            }
        }

        @Override // sg.bigo.ads.controller.e.e.a
        public final void a(int i10, int i11, String str) {
            c cVarA = c.a();
            String str2 = this.f103638a;
            if (1101 == i11 || 1105 == i11) {
                Map concurrentHashMap = cVarA.f103592a;
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                    cVarA.f103592a = concurrentHashMap;
                }
                if (str2 != null && c.a(concurrentHashMap, str2)) {
                    concurrentHashMap.put(str2, Long.valueOf(SystemClock.elapsedRealtime()));
                }
                if (cVarA.f103593b.compareAndSet(0, -1)) {
                    sg.bigo.ads.common.t.a.a(0, "ConfigInitProcessor", "Failed to init config and set status.");
                }
            }
            a aVar = this.f103639b;
            if (aVar != null) {
                aVar.a(i10, i11, str);
            }
        }
    }

    public e(@NonNull Context context, @NonNull sg.bigo.ads.controller.b.d dVar, @NonNull sg.bigo.ads.controller.b.h hVar, @NonNull sg.bigo.ads.common.g gVar, @NonNull sg.bigo.ads.controller.a.b bVar) {
        this.f103625i = context;
        this.f103617a = gVar;
        this.f103618b = dVar;
        this.f103619c = hVar;
        this.f103620d = bVar;
    }

    private void a(int i10, int i11) {
        if (this.f103627k.get() != null) {
            return;
        }
        this.f103627k.set(new sg.bigo.ads.controller.g.h(this.f103617a, this.f103620d, sg.bigo.ads.controller.b.e.E(), this));
        this.f103624h = i10;
        this.f103621e = SystemClock.elapsedRealtime();
        this.f103622f = sg.bigo.ads.common.f.b.d();
        this.f103623g.incrementAndGet();
        this.f103628l = i11;
        String strA = this.f103617a.a();
        if (q.a((CharSequence) strA)) {
            b(ErrorCodes.THROWABLE, "App id cannot be empty, please pass the id when initializing bigo sdk");
        } else if (c.a().a(strA)) {
            this.f103627k.get().b();
        } else {
            b(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE, "The slot id is invalid, please make sure the id is aligned with app id.");
        }
    }

    final void b(int i10, String str) {
        this.f103627k.set(null);
        if (this.f103626j.isEmpty()) {
            return;
        }
        this.f103626j.remove(0).a(this.f103628l, i10, str);
        if (this.f103626j.isEmpty()) {
            return;
        }
        a(this.f103624h, this.f103628l);
    }

    @Override // sg.bigo.ads.controller.e
    public final void a(final int i10, final int i11, final int i12, @NonNull final String str, @Nullable Object obj) {
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.e.2
            @Override // java.lang.Runnable
            public final void run() {
                e eVar;
                int i13;
                sg.bigo.ads.common.t.a.a(0, "GlobalConfig", "request error, seq=" + i10 + ", error=" + i11 + ", message=" + str);
                StringBuilder sb2 = new StringBuilder("Error from server: ");
                sb2.append(str);
                String string = sb2.toString();
                if (i12 == -9) {
                    eVar = e.this;
                    i13 = 1105;
                } else {
                    eVar = e.this;
                    i13 = 1104;
                }
                eVar.b(i13, string);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                e eVar2 = e.this;
                long j10 = jElapsedRealtime - eVar2.f103621e;
                int i14 = i11;
                int i15 = i12;
                String str2 = str;
                int i16 = eVar2.f103624h;
                boolean z10 = eVar2.f103622f;
                int i17 = eVar2.f103623g.get();
                sg.bigo.ads.common.g gVar = e.this.f103617a;
                sg.bigo.ads.core.d.b.a(j10, i14, i15, str2, i16, z10, i17, gVar == null ? null : gVar.X());
            }
        });
    }

    @Override // sg.bigo.ads.controller.b
    public final void a(int i10, @NonNull String str) {
        a(i10, str, false);
    }

    public final void a(final int i10, @NonNull final String str, final boolean z10) {
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.e.1
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.controller.a.a aVar;
                int andSet = 0;
                sg.bigo.ads.common.t.a.a(0, 3, "GlobalConfig", "request success, seq=" + i10 + ", result=" + str);
                e eVar = e.this;
                int i11 = eVar.f103624h;
                if (z10) {
                    i11 = 2;
                }
                int i12 = i11;
                try {
                    boolean zN = eVar.f103618b.N();
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("global");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("slots");
                    if (jSONObjectOptJSONObject != null && jSONArrayOptJSONArray != null) {
                        if ((((long) e.this.f103618b.e(jSONObjectOptJSONObject)) & 1) != 0 && (aVar = e.this.f103620d.f103205a) != null) {
                            aVar.c();
                        }
                        e eVar2 = e.this;
                        eVar2.f103618b.c(eVar2.f103625i);
                        e.this.f103619c.a(jSONArrayOptJSONArray);
                        e eVar3 = e.this;
                        eVar3.f103619c.c(eVar3.f103625i);
                        sg.bigo.ads.a aVarA = BigoAdSdk.a(e.this.f103625i);
                        aVarA.f100059a = e.this.f103617a.a();
                        aVarA.c(e.this.f103625i);
                        if (!z10) {
                            e.a(e.this);
                            andSet = e.this.f103623g.getAndSet(0);
                        }
                        int i13 = andSet;
                        long jI = e.this.f103618b.i();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        e eVar4 = e.this;
                        long j10 = jElapsedRealtime - eVar4.f103621e;
                        boolean z11 = eVar4.f103622f;
                        sg.bigo.ads.common.g gVar = eVar4.f103617a;
                        sg.bigo.ads.core.d.b.a(jI, j10, zN, i12, z11, i13, gVar == null ? null : gVar.X());
                        h.a().a(e.this.f103618b.J());
                        return;
                    }
                    if (!z10) {
                        e.this.b(1102, "Missing `global` or `slots` params.");
                    }
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    e eVar5 = e.this;
                    long j11 = jElapsedRealtime2 - eVar5.f103621e;
                    boolean z12 = eVar5.f103622f;
                    int i14 = eVar5.f103623g.get();
                    sg.bigo.ads.common.g gVar2 = e.this.f103617a;
                    sg.bigo.ads.core.d.b.a(j11, 1102, Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE, "Missing `global` or `slots` params.", i12, z12, i14, gVar2 == null ? null : gVar2.X());
                } catch (JSONException unused) {
                    if (!z10) {
                        e.this.b(1103, "Failed to parse global config.");
                    }
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    e eVar6 = e.this;
                    long j12 = jElapsedRealtime3 - eVar6.f103621e;
                    boolean z13 = eVar6.f103622f;
                    int i15 = eVar6.f103623g.get();
                    sg.bigo.ads.common.g gVar3 = e.this.f103617a;
                    sg.bigo.ads.core.d.b.a(j12, 1103, Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE, "Failed to parse global config.", i12, z13, i15, gVar3 != null ? gVar3.X() : null);
                }
            }
        });
    }

    @WorkerThread
    public final void a(@Nullable a aVar, int i10) {
        b bVar = new b(this.f103617a.a(), aVar, this.f103618b, this.f103619c, this.f103617a, this.f103620d, this);
        int iC = this.f103618b.C();
        if (iC != 2) {
            if (iC == 3) {
                this.f103626j.add(bVar);
            } else if (iC == 4) {
                bVar.a(iC);
            } else if (iC != 5) {
                return;
            }
            a(i10, iC);
            return;
        }
        bVar.a(iC);
    }

    static /* synthetic */ void a(e eVar) {
        eVar.f103627k.set(null);
        Iterator<b> it = eVar.f103626j.iterator();
        while (it.hasNext()) {
            it.next().a(eVar.f103628l);
        }
        eVar.f103626j.clear();
    }
}
