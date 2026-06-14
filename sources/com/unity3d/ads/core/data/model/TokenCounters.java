package com.unity3d.ads.core.data.model;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/unity3d/ads/core/data/model/TokenCounters;", "", "seq", "", "wins", "starts", "(III)V", "getSeq", "()I", "setSeq", "(I)V", "getStarts", "setStarts", "getWins", "setWins", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "hashCode", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TokenCounters {
    private int seq;
    private int starts;
    private int wins;

    public TokenCounters(int i10, int i11, int i12) {
        this.seq = i10;
        this.wins = i11;
        this.starts = i12;
    }

    public static /* synthetic */ TokenCounters copy$default(TokenCounters tokenCounters, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = tokenCounters.seq;
        }
        if ((i13 & 2) != 0) {
            i11 = tokenCounters.wins;
        }
        if ((i13 & 4) != 0) {
            i12 = tokenCounters.starts;
        }
        return tokenCounters.copy(i10, i11, i12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSeq() {
        return this.seq;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWins() {
        return this.wins;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStarts() {
        return this.starts;
    }

    @NotNull
    public final TokenCounters copy(int seq, int wins, int starts) {
        return new TokenCounters(seq, wins, starts);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenCounters)) {
            return false;
        }
        TokenCounters tokenCounters = (TokenCounters) other;
        return this.seq == tokenCounters.seq && this.wins == tokenCounters.wins && this.starts == tokenCounters.starts;
    }

    public final int getSeq() {
        return this.seq;
    }

    public final int getStarts() {
        return this.starts;
    }

    public final int getWins() {
        return this.wins;
    }

    public int hashCode() {
        return (((this.seq * 31) + this.wins) * 31) + this.starts;
    }

    public final void setSeq(int i10) {
        this.seq = i10;
    }

    public final void setStarts(int i10) {
        this.starts = i10;
    }

    public final void setWins(int i10) {
        this.wins = i10;
    }

    @NotNull
    public String toString() {
        return "TokenCounters(seq=" + this.seq + ", wins=" + this.wins + ", starts=" + this.starts + ')';
    }
}
