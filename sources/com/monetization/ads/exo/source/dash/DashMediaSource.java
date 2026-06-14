package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import yads.a01;
import yads.ac0;
import yads.b30;
import yads.ba2;
import yads.bl1;
import yads.c30;
import yads.ca2;
import yads.cu;
import yads.d30;
import yads.da2;
import yads.dk1;
import yads.dn0;
import yads.dy;
import yads.e63;
import yads.ek1;
import yads.eo;
import yads.ev2;
import yads.f43;
import yads.fe1;
import yads.fi;
import yads.ge1;
import yads.gk1;
import yads.gm2;
import yads.hk1;
import yads.hq2;
import yads.hz2;
import yads.ik1;
import yads.iz2;
import yads.je1;
import yads.jj0;
import yads.jl1;
import yads.jz2;
import yads.ke;
import yads.ke1;
import yads.kk1;
import yads.kl1;
import yads.ld0;
import yads.lk1;
import yads.ll1;
import yads.m20;
import yads.mk1;
import yads.ne1;
import yads.nj0;
import yads.nk2;
import yads.no;
import yads.np;
import yads.oj0;
import yads.ok1;
import yads.ol1;
import yads.p20;
import yads.pe1;
import yads.pt0;
import yads.qe1;
import yads.r20;
import yads.re1;
import yads.rk1;
import yads.ro;
import yads.s20;
import yads.sa2;
import yads.se1;
import yads.tk1;
import yads.u20;
import yads.ub0;
import yads.uc0;
import yads.uf1;
import yads.v20;
import yads.v83;
import yads.vk1;
import yads.vl0;
import yads.w83;
import yads.wl0;
import yads.xb;
import yads.xb0;
import yads.yb0;

/* JADX INFO: loaded from: classes10.dex */
public final class DashMediaSource extends eo {
    public static final long DEFAULT_FALLBACK_TARGET_LIVE_OFFSET_MS = 30000;

    @Deprecated
    public static final long DEFAULT_LIVE_PRESENTATION_DELAY_MS = 30000;
    public static final String DEFAULT_MEDIA_ID = "DashMediaSource";
    private static final long DEFAULT_NOTIFY_MANIFEST_INTERVAL_MS = 5000;
    private static final long MIN_LIVE_DEFAULT_START_POSITION_US = 5000000;
    private static final String TAG = "DashMediaSource";
    private final no baseUrlExclusionList;
    private final m20 chunkSourceFactory;
    private final dy compositeSequenceableLoaderFactory;
    private c30 dataSource;
    private final nj0 drmSessionManager;
    private long elapsedRealtimeOffsetMs;
    private long expiredManifestPublishTimeUs;
    private final long fallbackTargetLiveOffsetMs;
    private int firstPeriodId;
    private Handler handler;
    private Uri initialManifestUri;
    private kk1 liveConfiguration;
    private final fe1 loadErrorHandlingPolicy;
    private qe1 loader;
    private p20 manifest;
    private final e manifestCallback;
    private final b30 manifestDataSourceFactory;
    private final ol1 manifestEventDispatcher;
    private IOException manifestFatalError;
    private long manifestLoadEndTimestampMs;
    private final se1 manifestLoadErrorThrower;
    private boolean manifestLoadPending;
    private long manifestLoadStartTimestampMs;
    private final ca2 manifestParser;
    private Uri manifestUri;
    private final Object manifestUriLock;
    private final rk1 mediaItem;

    @Nullable
    private e63 mediaTransferListener;
    private final SparseArray<u20> periodsById;
    private final j playerEmsgCallback;
    private final Runnable refreshManifestRunnable;
    private final boolean sideloadedManifest;
    private final Runnable simulateManifestRefreshRunnable;
    private int staleManifestReloadAttempt;

    static {
        dn0.a("goog.exo.dash");
    }

    private static long getAvailableEndTimeInManifestUs(sa2 sa2Var, long j10, long j11) {
        long jA = w83.a(sa2Var.f115731b);
        boolean zHasVideoOrAudioAdaptationSets = hasVideoOrAudioAdaptationSets(sa2Var);
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < sa2Var.f115732c.size(); i10++) {
            xb xbVar = (xb) sa2Var.f115732c.get(i10);
            List list = xbVar.f117770c;
            if ((!zHasVideoOrAudioAdaptationSets || xbVar.f117769b != 3) && !list.isEmpty()) {
                v20 v20VarD = ((gm2) list.get(0)).d();
                if (v20VarD == null) {
                    return jA + j10;
                }
                long jE = v20VarD.e(j10, j11);
                if (jE == 0) {
                    return jA;
                }
                long jC = (v20VarD.c(j10, j11) + jE) - 1;
                jMin = Math.min(jMin, v20VarD.b(jC, j10) + v20VarD.a(jC) + jA);
            }
        }
        return jMin;
    }

    private static long getAvailableStartTimeInManifestUs(sa2 sa2Var, long j10, long j11) {
        long jA = w83.a(sa2Var.f115731b);
        boolean zHasVideoOrAudioAdaptationSets = hasVideoOrAudioAdaptationSets(sa2Var);
        long jMax = jA;
        for (int i10 = 0; i10 < sa2Var.f115732c.size(); i10++) {
            xb xbVar = (xb) sa2Var.f115732c.get(i10);
            List list = xbVar.f117770c;
            if ((!zHasVideoOrAudioAdaptationSets || xbVar.f117769b != 3) && !list.isEmpty()) {
                v20 v20VarD = ((gm2) list.get(0)).d();
                if (v20VarD == null || v20VarD.e(j10, j11) == 0) {
                    return jA;
                }
                jMax = Math.max(jMax, v20VarD.a(v20VarD.c(j10, j11)) + jA);
            }
        }
        return jMax;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b7, code lost:
    
        if (r5 > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ba, code lost:
    
        if (r9 > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        if (r9 < 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long getIntervalUntilNextManifestRefreshMs(yads.p20 r20, long r21) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monetization.ads.exo.source.dash.DashMediaSource.getIntervalUntilNextManifestRefreshMs(yads.p20, long):long");
    }

    private long getManifestLoadRetryDelayMillis() {
        return Math.min((this.staleManifestReloadAttempt - 1) * 1000, 5000);
    }

    private static boolean hasVideoOrAudioAdaptationSets(sa2 sa2Var) {
        for (int i10 = 0; i10 < sa2Var.f115732c.size(); i10++) {
            int i11 = ((xb) sa2Var.f115732c.get(i10)).f117769b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean isIndexExplicit(sa2 sa2Var) {
        for (int i10 = 0; i10 < sa2Var.f115732c.size(); i10++) {
            v20 v20VarD = ((gm2) ((xb) sa2Var.f115732c.get(i10)).f117770c.get(0)).d();
            if (v20VarD == null || v20VarD.a()) {
                return true;
            }
        }
        return false;
    }

    private void loadNtpTimeOffset() {
        boolean z10;
        qe1 qe1Var = this.loader;
        a aVar = new a(this);
        synchronized (jz2.f112523b) {
            z10 = jz2.f112524c;
        }
        if (z10) {
            aVar.a();
            return;
        }
        if (qe1Var == null) {
            qe1Var = new qe1("SntpClient");
        }
        qe1Var.a(new iz2(), new hz2(aVar), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUtcTimestampResolutionError(IOException iOException) {
        uf1.b("DashMediaSource", uf1.a("Failed to resolve time offset.", iOException));
        processManifest(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUtcTimestampResolved(long j10) {
        this.elapsedRealtimeOffsetMs = j10;
        processManifest(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [int] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r15v7, types: [yads.bo0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void processManifest(boolean z10) {
        long jB;
        long j10;
        boolean z11;
        boolean z12 = false;
        int i10 = 0;
        while (i10 < this.periodsById.size()) {
            int iKeyAt = this.periodsById.keyAt(i10);
            if (iKeyAt >= this.firstPeriodId) {
                u20 u20VarValueAt = this.periodsById.valueAt(i10);
                p20 p20Var = this.manifest;
                int i11 = iKeyAt - this.firstPeriodId;
                u20VarValueAt.f116462w = p20Var;
                u20VarValueAt.f116463x = i11;
                l lVar = u20VarValueAt.f116453n;
                lVar.f59010i = z12;
                lVar.f59008g = p20Var;
                Iterator it = lVar.f59007f.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < lVar.f59008g.f114533h) {
                        it.remove();
                    }
                }
                cu[] cuVarArr = u20VarValueAt.f116459t;
                if (cuVarArr != null) {
                    int length = cuVarArr.length;
                    for (?? r10 = z12; r10 < length; r10++) {
                        ac0 ac0Var = (ac0) cuVarArr[r10].f109576f;
                        ac0Var.getClass();
                        try {
                            ac0Var.f108633j = p20Var;
                            ac0Var.f108634k = i11;
                            long jA = w83.a(p20Var.b(i11));
                            ArrayList arrayListA = ac0Var.a();
                            for (?? r14 = z12; r14 < ac0Var.f108631h.length; r14++) {
                                gm2 gm2Var = (gm2) arrayListA.get(ac0Var.f108632i.b(r14));
                                try {
                                    yb0[] yb0VarArr = ac0Var.f108631h;
                                    yb0VarArr[r14] = yb0VarArr[r14].a(jA, gm2Var);
                                } catch (ro e10) {
                                    e = e10;
                                    ac0Var.f108635l = e;
                                    z12 = false;
                                }
                            }
                        } catch (ro e11) {
                            e = e11;
                        }
                        z12 = false;
                    }
                    z11 = true;
                    u20VarValueAt.f116458s.a((ev2) u20VarValueAt);
                } else {
                    z11 = true;
                }
                u20VarValueAt.f116464y = ((sa2) p20Var.f114538m.get(i11)).f115733d;
                for (vl0 vl0Var : u20VarValueAt.f116460u) {
                    Iterator it2 = u20VarValueAt.f116464y.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            wl0 wl0Var = (wl0) it2.next();
                            String str = wl0Var.f117509c + "/" + wl0Var.f117510d;
                            wl0 wl0Var2 = vl0Var.f117060f;
                            if (str.equals(wl0Var2.f117509c + "/" + wl0Var2.f117510d)) {
                                vl0Var.a(wl0Var, (p20Var.f114529d && i11 == p20Var.f114538m.size() + (-1)) ? z11 : false);
                            }
                        }
                    }
                }
            }
            i10++;
            z12 = false;
        }
        sa2 sa2Var = (sa2) this.manifest.f114538m.get(0);
        int size = this.manifest.f114538m.size() - 1;
        sa2 sa2Var2 = (sa2) this.manifest.f114538m.get(size);
        long jA2 = w83.a(this.manifest.b(size));
        long j11 = this.elapsedRealtimeOffsetMs;
        long jA3 = w83.a(j11 == -9223372036854775807L ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime());
        long availableStartTimeInManifestUs = getAvailableStartTimeInManifestUs(sa2Var, w83.a(this.manifest.b(0)), jA3);
        long availableEndTimeInManifestUs = getAvailableEndTimeInManifestUs(sa2Var2, jA2, jA3);
        boolean z13 = this.manifest.f114529d && !isIndexExplicit(sa2Var2);
        if (z13) {
            long j12 = this.manifest.f114531f;
            if (j12 != -9223372036854775807L) {
                availableStartTimeInManifestUs = Math.max(availableStartTimeInManifestUs, availableEndTimeInManifestUs - w83.a(j12));
            }
        }
        long j13 = availableEndTimeInManifestUs - availableStartTimeInManifestUs;
        p20 p20Var2 = this.manifest;
        if (p20Var2.f114529d) {
            long j14 = p20Var2.f114526a;
            if (j14 == -9223372036854775807L) {
                throw new IllegalStateException();
            }
            long jA4 = (jA3 - w83.a(j14)) - availableStartTimeInManifestUs;
            updateLiveConfiguration(jA4, j13);
            jB = w83.b(availableStartTimeInManifestUs) + this.manifest.f114526a;
            long jA5 = jA4 - w83.a(this.liveConfiguration.f112731b);
            long jMin = Math.min(MIN_LIVE_DEFAULT_START_POSITION_US, j13 / 2);
            j10 = jA5 < jMin ? jMin : jA5;
        } else {
            jB = -9223372036854775807L;
            j10 = 0;
        }
        long jA6 = availableStartTimeInManifestUs - w83.a(sa2Var.f115731b);
        p20 p20Var3 = this.manifest;
        refreshSourceInfo(new b(p20Var3.f114526a, jB, this.elapsedRealtimeOffsetMs, this.firstPeriodId, jA6, j13, j10, p20Var3, this.mediaItem, p20Var3.f114529d ? this.liveConfiguration : null));
        if (this.sideloadedManifest) {
            return;
        }
        this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
        if (z13) {
            Handler handler = this.handler;
            Runnable runnable = this.simulateManifestRefreshRunnable;
            p20 p20Var4 = this.manifest;
            long j15 = this.elapsedRealtimeOffsetMs;
            handler.postDelayed(runnable, getIntervalUntilNextManifestRefreshMs(p20Var4, j15 == -9223372036854775807L ? System.currentTimeMillis() : j15 + SystemClock.elapsedRealtime()));
        }
        if (this.manifestLoadPending) {
            startLoadingManifest();
            return;
        }
        if (z10) {
            p20 p20Var5 = this.manifest;
            if (p20Var5.f114529d) {
                long j16 = p20Var5.f114530e;
                if (j16 != -9223372036854775807L) {
                    if (j16 == 0) {
                        j16 = 5000;
                    }
                    scheduleManifestRefresh(Math.max(0L, (this.manifestLoadStartTimestampMs + j16) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void resolveUtcTimingElement(v83 v83Var) {
        String str = v83Var.f116901a;
        if (w83.a(str, "urn:mpeg:dash:utc:direct:2014") || w83.a(str, "urn:mpeg:dash:utc:direct:2012")) {
            resolveUtcTimingElementDirect(v83Var);
            return;
        }
        if (w83.a(str, "urn:mpeg:dash:utc:http-iso:2014") || w83.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            resolveUtcTimingElementHttp(v83Var, new d());
            return;
        }
        if (w83.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || w83.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            resolveUtcTimingElementHttp(v83Var, new h());
        } else if (w83.a(str, "urn:mpeg:dash:utc:ntp:2014") || w83.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
            loadNtpTimeOffset();
        } else {
            onUtcTimestampResolutionError(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void resolveUtcTimingElementDirect(v83 v83Var) {
        try {
            onUtcTimestampResolved(w83.f(v83Var.f116902b) - this.manifestLoadEndTimestampMs);
        } catch (ba2 e10) {
            onUtcTimestampResolutionError(e10);
        }
    }

    private void resolveUtcTimingElementHttp(v83 v83Var, ca2 ca2Var) {
        startLoading(new da2(this.dataSource, Uri.parse(v83Var.f116902b), 5, ca2Var), new g(this), 1);
    }

    private void scheduleManifestRefresh(long j10) {
        this.handler.postDelayed(this.refreshManifestRunnable, j10);
    }

    private <T> void startLoading(da2 da2Var, je1 je1Var, int i10) {
        this.loader.a(da2Var, je1Var, i10);
        ol1 ol1Var = this.manifestEventDispatcher;
        long j10 = da2Var.f109861a;
        Uri uri = da2Var.f109862b.f111452a;
        ol1Var.c(new ge1(), new tk1(da2Var.f109863c, -1, null, 0, null, ol1Var.a(-9223372036854775807L), ol1Var.a(-9223372036854775807L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLoadingManifest() {
        Uri uri;
        this.handler.removeCallbacks(this.refreshManifestRunnable);
        qe1 qe1Var = this.loader;
        if (qe1Var.f114976c != null) {
            return;
        }
        if (qe1Var.b()) {
            this.manifestLoadPending = true;
            return;
        }
        synchronized (this.manifestUriLock) {
            uri = this.manifestUri;
        }
        this.manifestLoadPending = false;
        startLoading(new da2(this.dataSource, uri, 4, this.manifestParser), this.manifestCallback, ((ld0) this.loadErrorHandlingPolicy).a(4));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateLiveConfiguration(long r19, long r21) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monetization.ads.exo.source.dash.DashMediaSource.updateLiveConfiguration(long, long):void");
    }

    @Override // yads.ml1
    public bl1 createPeriod(kl1 kl1Var, ke keVar, long j10) {
        int iIntValue = ((Integer) kl1Var.f109962a).intValue() - this.firstPeriodId;
        ol1 ol1VarCreateEventDispatcher = createEventDispatcher(kl1Var, ((sa2) this.manifest.f114538m.get(iIntValue)).f115731b);
        jj0 jj0VarCreateDrmEventDispatcher = createDrmEventDispatcher(kl1Var);
        int i10 = this.firstPeriodId + iIntValue;
        u20 u20Var = new u20(i10, this.manifest, this.baseUrlExclusionList, iIntValue, this.chunkSourceFactory, this.mediaTransferListener, this.drmSessionManager, jj0VarCreateDrmEventDispatcher, this.loadErrorHandlingPolicy, ol1VarCreateEventDispatcher, this.elapsedRealtimeOffsetMs, this.manifestLoadErrorThrower, keVar, this.compositeSequenceableLoaderFactory, this.playerEmsgCallback, getPlayerId());
        this.periodsById.put(i10, u20Var);
        return u20Var;
    }

    @Override // yads.eo, yads.ml1
    @Nullable
    public /* bridge */ /* synthetic */ f43 getInitialTimeline() {
        return np.a(this);
    }

    @Override // yads.ml1
    public rk1 getMediaItem() {
        return this.mediaItem;
    }

    @Override // yads.eo, yads.ml1
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return np.b(this);
    }

    @Override // yads.ml1
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.manifestLoadErrorThrower.a();
    }

    void onDashManifestPublishTimeExpired(long j10) {
        long j11 = this.expiredManifestPublishTimeUs;
        if (j11 == -9223372036854775807L || j11 < j10) {
            this.expiredManifestPublishTimeUs = j10;
        }
    }

    void onDashManifestRefreshRequested() {
        this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
        startLoadingManifest();
    }

    void onLoadCanceled(da2 da2Var, long j10, long j11) {
        long j12 = da2Var.f109861a;
        Uri uri = da2Var.f109864d.f109698c;
        ge1 ge1Var = new ge1();
        this.loadErrorHandlingPolicy.getClass();
        ol1 ol1Var = this.manifestEventDispatcher;
        ol1Var.a(ge1Var, new tk1(da2Var.f109863c, -1, null, 0, null, ol1Var.a(-9223372036854775807L), ol1Var.a(-9223372036854775807L)));
    }

    void onManifestLoadCompleted(da2 da2Var, long j10, long j11) {
        long j12 = da2Var.f109861a;
        Uri uri = da2Var.f109864d.f109698c;
        ge1 ge1Var = new ge1();
        this.loadErrorHandlingPolicy.getClass();
        ol1 ol1Var = this.manifestEventDispatcher;
        ol1Var.b(ge1Var, new tk1(da2Var.f109863c, -1, null, 0, null, ol1Var.a(-9223372036854775807L), ol1Var.a(-9223372036854775807L)));
        p20 p20Var = (p20) da2Var.f109866f;
        p20 p20Var2 = this.manifest;
        int size = p20Var2 == null ? 0 : p20Var2.f114538m.size();
        long j13 = ((sa2) p20Var.f114538m.get(0)).f115731b;
        int i10 = 0;
        while (i10 < size && ((sa2) this.manifest.f114538m.get(i10)).f115731b < j13) {
            i10++;
        }
        if (p20Var.f114529d) {
            if (size - i10 > p20Var.f114538m.size()) {
                uf1.d("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = this.expiredManifestPublishTimeUs;
                if (j14 == -9223372036854775807L || p20Var.f114533h * 1000 > j14) {
                    this.staleManifestReloadAttempt = 0;
                } else {
                    uf1.d("DashMediaSource", "Loaded stale dynamic manifest: " + p20Var.f114533h + ", " + this.expiredManifestPublishTimeUs);
                }
            }
            int i11 = this.staleManifestReloadAttempt;
            this.staleManifestReloadAttempt = i11 + 1;
            if (i11 < ((ld0) this.loadErrorHandlingPolicy).a(da2Var.f109863c)) {
                scheduleManifestRefresh(getManifestLoadRetryDelayMillis());
                return;
            } else {
                this.manifestFatalError = new s20();
                return;
            }
        }
        this.manifest = p20Var;
        this.manifestLoadPending = p20Var.f114529d & this.manifestLoadPending;
        this.manifestLoadStartTimestampMs = j10 - j11;
        this.manifestLoadEndTimestampMs = j10;
        synchronized (this.manifestUriLock) {
            try {
                if (da2Var.f109862b.f111452a == this.manifestUri) {
                    Uri uri2 = this.manifest.f114536k;
                    if (uri2 == null) {
                        uri2 = da2Var.f109864d.f109698c;
                    }
                    this.manifestUri = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (size != 0) {
            this.firstPeriodId += i10;
            processManifest(true);
            return;
        }
        p20 p20Var3 = this.manifest;
        if (!p20Var3.f114529d) {
            processManifest(true);
            return;
        }
        v83 v83Var = p20Var3.f114534i;
        if (v83Var != null) {
            resolveUtcTimingElement(v83Var);
        } else {
            loadNtpTimeOffset();
        }
    }

    ke1 onManifestLoadError(da2 da2Var, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        long j12 = da2Var.f109861a;
        Uri uri = da2Var.f109864d.f109698c;
        ge1 ge1Var = new ge1();
        ((ld0) this.loadErrorHandlingPolicy).getClass();
        if ((iOException instanceof ba2) || (iOException instanceof FileNotFoundException) || (iOException instanceof a01) || (iOException instanceof pe1)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i11 = d30.f109729c;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof d30) && ((d30) cause).f109730b == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i10 - 1) * 1000, 5000);
        ke1 ke1Var = jMin == -9223372036854775807L ? qe1.f114973e : new ke1(0, jMin);
        int i12 = ke1Var.f112694a;
        boolean z10 = i12 == 0 || i12 == 1;
        ol1 ol1Var = this.manifestEventDispatcher;
        ol1Var.a(ge1Var, new tk1(da2Var.f109863c, -1, null, 0, null, ol1Var.a(-9223372036854775807L), ol1Var.a(-9223372036854775807L)), iOException, true ^ z10);
        if (!z10) {
            this.loadErrorHandlingPolicy.getClass();
        }
        return ke1Var;
    }

    void onUtcTimestampLoadCompleted(da2 da2Var, long j10, long j11) {
        long j12 = da2Var.f109861a;
        Uri uri = da2Var.f109864d.f109698c;
        ge1 ge1Var = new ge1();
        this.loadErrorHandlingPolicy.getClass();
        ol1 ol1Var = this.manifestEventDispatcher;
        ol1Var.b(ge1Var, new tk1(da2Var.f109863c, -1, null, 0, null, ol1Var.a(-9223372036854775807L), ol1Var.a(-9223372036854775807L)));
        onUtcTimestampResolved(((Long) da2Var.f109866f).longValue() - j10);
    }

    ke1 onUtcTimestampLoadError(da2 da2Var, long j10, long j11, IOException iOException) {
        ol1 ol1Var = this.manifestEventDispatcher;
        long j12 = da2Var.f109861a;
        Uri uri = da2Var.f109864d.f109698c;
        ol1Var.a(new ge1(), new tk1(da2Var.f109863c, -1, null, 0, null, ol1Var.a(-9223372036854775807L), ol1Var.a(-9223372036854775807L)), iOException, true);
        this.loadErrorHandlingPolicy.getClass();
        onUtcTimestampResolutionError(iOException);
        return qe1.f114972d;
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void prepareSource(ll1 ll1Var, @Nullable e63 e63Var) {
        np.c(this, ll1Var, e63Var);
    }

    @Override // yads.eo
    protected void prepareSourceInternal(@Nullable e63 e63Var) {
        this.mediaTransferListener = e63Var;
        this.drmSessionManager.prepare();
        this.drmSessionManager.a(Looper.myLooper(), getPlayerId());
        if (this.sideloadedManifest) {
            processManifest(false);
            return;
        }
        this.dataSource = this.manifestDataSourceFactory.a();
        this.loader = new qe1("DashMediaSource");
        this.handler = w83.a((Handler.Callback) null);
        startLoadingManifest();
    }

    @Override // yads.ml1
    public void releasePeriod(bl1 bl1Var) {
        u20 u20Var = (u20) bl1Var;
        l lVar = u20Var.f116453n;
        lVar.f59011j = true;
        lVar.f59006e.removeCallbacksAndMessages(null);
        for (cu cuVar : u20Var.f116459t) {
            cuVar.f109589s = u20Var;
            hq2 hq2Var = cuVar.f109584n;
            hq2Var.a();
            hq2Var.d();
            for (hq2 hq2Var2 : cuVar.f109585o) {
                hq2Var2.a();
                hq2Var2.d();
            }
            cuVar.f109580j.a(cuVar);
        }
        u20Var.f116458s = null;
        this.periodsById.remove(u20Var.f116441b);
    }

    @Override // yads.eo
    protected void releaseSourceInternal() {
        this.manifestLoadPending = false;
        this.dataSource = null;
        qe1 qe1Var = this.loader;
        if (qe1Var != null) {
            qe1Var.a((ne1) null);
            this.loader = null;
        }
        this.manifestLoadStartTimestampMs = 0L;
        this.manifestLoadEndTimestampMs = 0L;
        this.manifest = this.sideloadedManifest ? this.manifest : null;
        this.manifestUri = this.initialManifestUri;
        this.manifestFatalError = null;
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.handler = null;
        }
        this.elapsedRealtimeOffsetMs = -9223372036854775807L;
        this.staleManifestReloadAttempt = 0;
        this.expiredManifestPublishTimeUs = -9223372036854775807L;
        this.firstPeriodId = 0;
        this.periodsById.clear();
        no noVar = this.baseUrlExclusionList;
        noVar.f113988a.clear();
        noVar.f113989b.clear();
        noVar.f113990c.clear();
        this.drmSessionManager.release();
    }

    public void replaceManifestUri(Uri uri) {
        synchronized (this.manifestUriLock) {
            this.manifestUri = uri;
            this.initialManifestUri = uri;
        }
    }

    private DashMediaSource(rk1 rk1Var, @Nullable p20 p20Var, @Nullable b30 b30Var, @Nullable ca2 ca2Var, m20 m20Var, dy dyVar, nj0 nj0Var, fe1 fe1Var, long j10) {
        this.mediaItem = rk1Var;
        this.liveConfiguration = rk1Var.f115476d;
        this.manifestUri = ((lk1) fi.a(rk1Var.f115475c)).f113131a;
        this.initialManifestUri = rk1Var.f115475c.f113131a;
        this.manifest = p20Var;
        this.manifestDataSourceFactory = b30Var;
        this.manifestParser = ca2Var;
        this.chunkSourceFactory = m20Var;
        this.drmSessionManager = nj0Var;
        this.loadErrorHandlingPolicy = fe1Var;
        this.fallbackTargetLiveOffsetMs = j10;
        this.compositeSequenceableLoaderFactory = dyVar;
        this.baseUrlExclusionList = new no();
        boolean z10 = p20Var != null;
        this.sideloadedManifest = z10;
        this.manifestEventDispatcher = createEventDispatcher(null);
        this.manifestUriLock = new Object();
        this.periodsById = new SparseArray<>();
        this.playerEmsgCallback = new c(this);
        this.expiredManifestPublishTimeUs = -9223372036854775807L;
        this.elapsedRealtimeOffsetMs = -9223372036854775807L;
        if (!z10) {
            this.manifestCallback = new e(this);
            this.manifestLoadErrorThrower = new f(this);
            this.refreshManifestRunnable = new Runnable() { // from class: com.monetization.ads.exo.source.dash.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f59012b.startLoadingManifest();
                }
            };
            this.simulateManifestRefreshRunnable = new Runnable() { // from class: com.monetization.ads.exo.source.dash.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f59013b.processManifest(false);
                }
            };
            return;
        }
        fi.b(true ^ p20Var.f114529d);
        this.manifestCallback = null;
        this.refreshManifestRunnable = null;
        this.simulateManifestRefreshRunnable = null;
        this.manifestLoadErrorThrower = new re1();
    }

    public static final class Factory implements jl1 {
        private final m20 chunkSourceFactory;
        private dy compositeSequenceableLoaderFactory;
        private oj0 drmSessionManagerProvider;
        private long fallbackTargetLiveOffsetMs;
        private fe1 loadErrorHandlingPolicy;

        @Nullable
        private final b30 manifestDataSourceFactory;

        @Nullable
        private ca2 manifestParser;

        public Factory(m20 m20Var, @Nullable b30 b30Var) {
            this.chunkSourceFactory = (m20) fi.a(m20Var);
            this.manifestDataSourceFactory = b30Var;
            this.drmSessionManagerProvider = new uc0();
            this.loadErrorHandlingPolicy = new ld0();
            this.fallbackTargetLiveOffsetMs = 30000L;
            this.compositeSequenceableLoaderFactory = new ub0();
        }

        public DashMediaSource createMediaSource(p20 p20Var) {
            mk1 mk1Var;
            ek1 ek1Var = new ek1();
            hk1 hk1Var = new hk1();
            List list = Collections.EMPTY_LIST;
            nk2 nk2Var = nk2.f113952f;
            ok1 ok1Var = ok1.f114343d;
            Uri uri = Uri.EMPTY;
            if (hk1Var.f111617b != null && hk1Var.f111616a == null) {
                throw new IllegalStateException();
            }
            ik1 ik1Var = null;
            if (uri != null) {
                if (hk1Var.f111616a != null) {
                    ik1Var = new ik1(hk1Var);
                }
                mk1Var = new mk1(uri, "application/dash+xml", ik1Var, list, null, nk2Var, null);
            } else {
                mk1Var = null;
            }
            return createMediaSource(p20Var, new rk1("DashMediaSource", new gk1(ek1Var), mk1Var, new kk1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), vk1.H, ok1Var));
        }

        public int[] getSupportedTypes() {
            return new int[]{0};
        }

        public Factory setCompositeSequenceableLoaderFactory(dy dyVar) {
            if (dyVar == null) {
                throw new NullPointerException("DashMediaSource.Factory#setCompositeSequenceableLoaderFactory no longer handles null by instantiating a new DefaultCompositeSequenceableLoaderFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
            }
            this.compositeSequenceableLoaderFactory = dyVar;
            return this;
        }

        @Override // yads.jl1
        public Factory setDrmSessionManagerProvider(oj0 oj0Var) {
            if (oj0Var == null) {
                throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            }
            this.drmSessionManagerProvider = oj0Var;
            return this;
        }

        public Factory setFallbackTargetLiveOffsetMs(long j10) {
            this.fallbackTargetLiveOffsetMs = j10;
            return this;
        }

        @Override // yads.jl1
        public Factory setLoadErrorHandlingPolicy(fe1 fe1Var) {
            if (fe1Var == null) {
                throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            }
            this.loadErrorHandlingPolicy = fe1Var;
            return this;
        }

        public Factory setManifestParser(@Nullable ca2 ca2Var) {
            this.manifestParser = ca2Var;
            return this;
        }

        public Factory(b30 b30Var) {
            this(new xb0(b30Var), b30Var);
        }

        public DashMediaSource createMediaSource(p20 p20Var, rk1 rk1Var) {
            if (!p20Var.f114529d) {
                dk1 dk1VarA = rk1Var.a();
                dk1VarA.f109945c = "application/dash+xml";
                if (rk1Var.f115475c == null) {
                    dk1VarA.f109944b = Uri.EMPTY;
                }
                rk1 rk1VarA = dk1VarA.a();
                return new DashMediaSource(rk1VarA, p20Var, null, null, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, ((uc0) this.drmSessionManagerProvider).a(rk1VarA), this.loadErrorHandlingPolicy, this.fallbackTargetLiveOffsetMs);
            }
            throw new IllegalArgumentException();
        }

        @Override // yads.jl1
        public DashMediaSource createMediaSource(rk1 rk1Var) {
            rk1Var.f115475c.getClass();
            ca2 r20Var = this.manifestParser;
            if (r20Var == null) {
                r20Var = new r20();
            }
            List list = rk1Var.f115475c.f113134d;
            return new DashMediaSource(rk1Var, null, this.manifestDataSourceFactory, !list.isEmpty() ? new pt0(r20Var, list) : r20Var, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, ((uc0) this.drmSessionManagerProvider).a(rk1Var), this.loadErrorHandlingPolicy, this.fallbackTargetLiveOffsetMs);
        }
    }
}
