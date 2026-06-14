package com.ironsource;

import com.ironsource.O;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Q implements O, O.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ReadWriteLock f41602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, N> f41603b;

    public Q() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.O
    @Nullable
    public N a(@NotNull String adId) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f41602a.readLock().lock();
        try {
            return this.f41603b.get(adId);
        } finally {
            this.f41602a.readLock().unlock();
        }
    }

    public Q(@NotNull ReadWriteLock readWriteLock) {
        Intrinsics.checkNotNullParameter(readWriteLock, "readWriteLock");
        this.f41602a = readWriteLock;
        this.f41603b = new LinkedHashMap();
    }

    @Override // com.ironsource.O
    @NotNull
    public List<N> a() {
        this.f41602a.readLock().lock();
        List<N> list = CollectionsKt.toList(this.f41603b.values());
        this.f41602a.readLock().unlock();
        return list;
    }

    public /* synthetic */ Q(ReadWriteLock readWriteLock, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ReentrantReadWriteLock() : readWriteLock);
    }

    @Override // com.ironsource.O.a
    public void a(@NotNull N adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f41602a.writeLock().lock();
        try {
            if (this.f41603b.get(adInfo.c()) == null) {
                this.f41603b.put(adInfo.c(), adInfo);
            }
        } finally {
            this.f41602a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.O.a
    public void a(@NotNull JSONObject json, @NotNull EnumC4422m0 adStatus, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(adStatus, "adStatus");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f41602a.writeLock().lock();
        try {
            N n10 = this.f41603b.get(adId);
            if (n10 == null) {
                this.f41602a.writeLock().unlock();
                return;
            }
            String bundleId = json.optString("bundleId");
            Intrinsics.checkNotNullExpressionValue(bundleId, "bundleId");
            if (bundleId.length() > 0) {
                n10.a(bundleId);
            }
            String dynamicDemandSourceId = json.optString("dynamicDemandSource");
            Intrinsics.checkNotNullExpressionValue(dynamicDemandSourceId, "dynamicDemandSourceId");
            if (dynamicDemandSourceId.length() > 0) {
                n10.a(T7.f41797b.a(dynamicDemandSourceId));
            }
            n10.a(adStatus);
            this.f41602a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f41602a.writeLock().unlock();
            throw th2;
        }
    }

    @Override // com.ironsource.O.a
    public void a(@NotNull EnumC4422m0 adStatus, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(adStatus, "adStatus");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f41602a.writeLock().lock();
        try {
            N n10 = this.f41603b.get(adId);
            if (n10 == null) {
                return;
            }
            n10.a(adStatus);
            n10.a(System.currentTimeMillis() / 1000.0d);
        } finally {
            this.f41602a.writeLock().unlock();
        }
    }
}
