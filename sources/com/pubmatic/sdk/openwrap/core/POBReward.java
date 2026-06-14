package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.ui.POBCoreReward;
import j$.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class POBReward implements POBCoreReward {
    public static final int DEFAULT_REWARD_AMOUNT_VALUE = 0;
    public static final String DEFAULT_REWARD_TYPE_LABEL = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f62816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f62817b;

    public POBReward(@NonNull String str, int i10) {
        this.f62816a = str;
        this.f62817b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            POBReward pOBReward = (POBReward) obj;
            if (this.f62817b == pOBReward.f62817b && this.f62816a.equals(pOBReward.f62816a)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.pubmatic.sdk.common.ui.POBCoreReward
    public int getAmount() {
        return this.f62817b;
    }

    @Override // com.pubmatic.sdk.common.ui.POBCoreReward
    @NonNull
    public String getCurrencyType() {
        return this.f62816a;
    }

    public int hashCode() {
        return Objects.hash(this.f62816a, Integer.valueOf(this.f62817b));
    }

    @NonNull
    public String toString() {
        return "POBReward{currencyType='" + this.f62816a + "', amount='" + this.f62817b + "'}";
    }
}
