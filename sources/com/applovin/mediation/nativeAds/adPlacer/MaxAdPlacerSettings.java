package com.applovin.mediation.nativeAds.adPlacer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.o;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes6.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f11774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f11775c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11776d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11777e = 256;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11778f = 4;

    public MaxAdPlacerSettings(String str) {
        this.f11773a = str;
    }

    public void addFixedPosition(int i10) {
        this.f11775c.add(Integer.valueOf(i10));
    }

    public String getAdUnitId() {
        return this.f11773a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f11775c;
    }

    public int getMaxAdCount() {
        return this.f11777e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f11778f;
    }

    @Nullable
    public String getPlacement() {
        return this.f11774b;
    }

    public int getRepeatingInterval() {
        return this.f11776d;
    }

    public boolean hasValidPositioning() {
        return !this.f11775c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f11776d >= 2;
    }

    public void resetFixedPositions() {
        this.f11775c.clear();
    }

    public void setMaxAdCount(int i10) {
        this.f11777e = i10;
    }

    public void setMaxPreloadedAdCount(int i10) {
        this.f11778f = i10;
    }

    public void setPlacement(@Nullable String str) {
        this.f11774b = str;
    }

    public void setRepeatingInterval(int i10) {
        if (i10 >= 2) {
            this.f11776d = i10;
            o.g("MaxAdPlacerSettings", "Repeating interval set to " + i10);
            return;
        }
        this.f11776d = 0;
        o.j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i10 + ", which is less than minimum value of 2");
    }

    @NonNull
    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.f11773a + "', fixedPositions=" + this.f11775c + ", repeatingInterval=" + this.f11776d + ", maxAdCount=" + this.f11777e + ", maxPreloadedAdCount=" + this.f11778f + '}';
    }
}
