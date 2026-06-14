package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import com.applovin.mediation.MaxReward;

/* JADX INFO: loaded from: classes6.dex */
public class MaxRewardImpl implements MaxReward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9397b;

    private MaxRewardImpl(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
        }
        this.f9396a = str;
        this.f9397b = i10;
    }

    public static MaxReward create(int i10, String str) {
        return new MaxRewardImpl(i10, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.f9397b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.f9396a;
    }

    @NonNull
    public String toString() {
        return "MaxReward{amount=" + this.f9397b + ", label=" + this.f9396a + "}";
    }
}
