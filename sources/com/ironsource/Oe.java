package com.ironsource;

import com.ironsource.N8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.FeaturesManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Oe implements N8, N8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private Map<String, C4592w> f41520a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4417lc f41521b = new C4417lc();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ReadWriteLock f41522c = new ReentrantReadWriteLock();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41523a;

        static {
            int[] iArr = new int[Ne.values().length];
            try {
                iArr[Ne.CurrentlyLoadedAdsAndFullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ne.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Ne.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41523a = iArr;
        }
    }

    private final void b() {
        Me configuration = FeaturesManager.getInstance().getSessionHistoryConfig();
        C4417lc c4417lc = this.f41521b;
        Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
        c4417lc.a(a(configuration));
        this.f41521b.a(a());
    }

    @Override // com.ironsource.N8.a
    public void a(@NotNull Pe historyRecord) {
        Intrinsics.checkNotNullParameter(historyRecord, "historyRecord");
        this.f41522c.writeLock().lock();
        try {
            N nA = historyRecord.a();
            String strValueOf = String.valueOf(nA != null ? nA.b() : null);
            Map<String, C4592w> map = this.f41520a;
            C4592w c4592w = map.get(strValueOf);
            if (c4592w == null) {
                c4592w = new C4592w();
                map.put(strValueOf, c4592w);
            }
            c4592w.a(historyRecord.a(new Ve()));
            this.f41522c.writeLock().unlock();
            b();
        } catch (Throwable th2) {
            this.f41522c.writeLock().unlock();
            throw th2;
        }
    }

    @Override // com.ironsource.N8
    @NotNull
    public JSONObject a(@NotNull Ye mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f41522c.readLock().lock();
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, C4592w> entry : this.f41520a.entrySet()) {
                String key = entry.getKey();
                JSONObject jSONObjectA = entry.getValue().a(mode);
                if (jSONObjectA.length() > 0) {
                    jSONObject.put(key, jSONObjectA);
                }
            }
            return jSONObject;
        } finally {
            this.f41522c.readLock().unlock();
        }
    }

    @Override // com.ironsource.N8
    public int a(@NotNull IronSource.a adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f41522c.readLock().lock();
        try {
            C4592w c4592w = this.f41520a.get(adFormat.toString());
            return c4592w != null ? c4592w.a() : 0;
        } finally {
            this.f41522c.readLock().unlock();
        }
    }

    @Override // com.ironsource.N8
    @NotNull
    public List<String> a() {
        this.f41522c.readLock().lock();
        try {
            Map<String, C4592w> map = this.f41520a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, C4592w> entry : map.entrySet()) {
                if (entry.getValue().b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            List<String> list = CollectionsKt.toList(linkedHashMap.keySet());
            this.f41522c.readLock().unlock();
            return list;
        } catch (Throwable th2) {
            this.f41522c.readLock().unlock();
            throw th2;
        }
    }

    @Override // com.ironsource.N8
    @NotNull
    public Map<String, JSONObject> a(@NotNull Me configuration) {
        Map<String, JSONObject> mapMutableMapOf;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f41522c.readLock().lock();
        try {
            int i10 = a.f41523a[configuration.a().ordinal()];
            if (i10 == 1) {
                mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(N6.f41442z1, a(Ye.FullHistory)), TuplesKt.to(N6.A1, a(Ye.CurrentlyLoadedAds)));
            } else if (i10 == 2) {
                mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(N6.A1, a(Ye.CurrentlyLoadedAds)));
            } else {
                if (i10 != 3) {
                    throw new lf.m();
                }
                mapMutableMapOf = MapsKt.emptyMap();
            }
            this.f41522c.readLock().unlock();
            return mapMutableMapOf;
        } catch (Throwable th2) {
            this.f41522c.readLock().unlock();
            throw th2;
        }
    }
}
