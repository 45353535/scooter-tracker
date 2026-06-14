package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMakerInternalMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class MapMaker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f29848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f29849b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f29850c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    MapMakerInternalMap.Strength f29851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    MapMakerInternalMap.Strength f29852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Equivalence f29853f;

    enum Dummy {
        VALUE
    }

    int a() {
        int i10 = this.f29850c;
        if (i10 == -1) {
            return 4;
        }
        return i10;
    }

    int b() {
        int i10 = this.f29849b;
        if (i10 == -1) {
            return 16;
        }
        return i10;
    }

    Equivalence c() {
        return (Equivalence) MoreObjects.firstNonNull(this.f29853f, d().g());
    }

    @CanIgnoreReturnValue
    public MapMaker concurrencyLevel(int i10) {
        int i11 = this.f29850c;
        Preconditions.checkState(i11 == -1, "concurrency level was already set to %s", i11);
        Preconditions.checkArgument(i10 > 0);
        this.f29850c = i10;
        return this;
    }

    MapMakerInternalMap.Strength d() {
        return (MapMakerInternalMap.Strength) MoreObjects.firstNonNull(this.f29851d, MapMakerInternalMap.Strength.STRONG);
    }

    MapMakerInternalMap.Strength e() {
        return (MapMakerInternalMap.Strength) MoreObjects.firstNonNull(this.f29852e, MapMakerInternalMap.Strength.STRONG);
    }

    MapMaker f(Equivalence equivalence) {
        Equivalence equivalence2 = this.f29853f;
        Preconditions.checkState(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.f29853f = (Equivalence) Preconditions.checkNotNull(equivalence);
        this.f29848a = true;
        return this;
    }

    MapMaker g(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.f29851d;
        Preconditions.checkState(strength2 == null, "Key strength was already set to %s", strength2);
        this.f29851d = (MapMakerInternalMap.Strength) Preconditions.checkNotNull(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f29848a = true;
        }
        return this;
    }

    MapMaker h(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.f29852e;
        Preconditions.checkState(strength2 == null, "Value strength was already set to %s", strength2);
        this.f29852e = (MapMakerInternalMap.Strength) Preconditions.checkNotNull(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f29848a = true;
        }
        return this;
    }

    @CanIgnoreReturnValue
    public MapMaker initialCapacity(int i10) {
        int i11 = this.f29849b;
        Preconditions.checkState(i11 == -1, "initial capacity was already set to %s", i11);
        Preconditions.checkArgument(i10 >= 0);
        this.f29849b = i10;
        return this;
    }

    public <K, V> ConcurrentMap<K, V> makeMap() {
        return !this.f29848a ? new ConcurrentHashMap(b(), 0.75f, a()) : MapMakerInternalMap.a(this);
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        int i10 = this.f29849b;
        if (i10 != -1) {
            stringHelper.add("initialCapacity", i10);
        }
        int i11 = this.f29850c;
        if (i11 != -1) {
            stringHelper.add("concurrencyLevel", i11);
        }
        MapMakerInternalMap.Strength strength = this.f29851d;
        if (strength != null) {
            stringHelper.add("keyStrength", Ascii.toLowerCase(strength.toString()));
        }
        MapMakerInternalMap.Strength strength2 = this.f29852e;
        if (strength2 != null) {
            stringHelper.add("valueStrength", Ascii.toLowerCase(strength2.toString()));
        }
        if (this.f29853f != null) {
            stringHelper.addValue("keyEquivalence");
        }
        return stringHelper.toString();
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public MapMaker weakKeys() {
        return g(MapMakerInternalMap.Strength.WEAK);
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public MapMaker weakValues() {
        return h(MapMakerInternalMap.Strength.WEAK);
    }
}
