package com.appodeal.ads.modules.common.internal.data;

import androidx.compose.foundation.c;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0006\u0010\r\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/appodeal/ads/modules/common/internal/data/ConnectionData;", "", "", "type", "subType", "", "isFast", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/appodeal/ads/modules/common/internal/data/ConnectionData;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType", "b", "getSubType", "setSubType", "(Ljava/lang/String;)V", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Z", "setFast", "(Z)V", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ConnectionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public String subType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean isFast;

    public ConnectionData(String str, String str2, boolean z10) {
        this.type = str;
        this.subType = str2;
        this.isFast = z10;
    }

    public static /* synthetic */ ConnectionData copy$default(ConnectionData connectionData, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = connectionData.type;
        }
        if ((i10 & 2) != 0) {
            str2 = connectionData.subType;
        }
        if ((i10 & 4) != 0) {
            z10 = connectionData.isFast;
        }
        return connectionData.copy(str, str2, z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsFast() {
        return this.isFast;
    }

    public final ConnectionData copy(String type, String subType, boolean isFast) {
        return new ConnectionData(type, subType, isFast);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectionData)) {
            return false;
        }
        ConnectionData connectionData = (ConnectionData) other;
        return Intrinsics.areEqual(this.type, connectionData.type) && Intrinsics.areEqual(this.subType, connectionData.subType) && this.isFast == connectionData.isFast;
    }

    public final String getSubType() {
        return this.subType;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subType;
        return c.a(this.isFast) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final boolean isFast() {
        return this.isFast;
    }

    public final void setFast(boolean z10) {
        this.isFast = z10;
    }

    public final void setSubType(String str) {
        this.subType = str;
    }

    public String toString() {
        return "ConnectionData(type=" + this.type + ", subType=" + this.subType + ", isFast=" + this.isFast + ")";
    }
}
