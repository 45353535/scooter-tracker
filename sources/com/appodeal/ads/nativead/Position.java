package com.appodeal.ads.nativead;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/appodeal/ads/nativead/Position;", "", "", "a", "I", "getGravity", "()I", "gravity", "START_TOP", "START_BOTTOM", "END_TOP", "END_BOTTOM", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Position {
    private static final /* synthetic */ Position[] $VALUES;
    public static final Position END_BOTTOM;
    public static final Position END_TOP;
    public static final Position START_BOTTOM;
    public static final Position START_TOP;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f13835b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int gravity;

    static {
        Position position = new Position("START_TOP", 0, 8388659);
        START_TOP = position;
        Position position2 = new Position("START_BOTTOM", 1, 8388691);
        START_BOTTOM = position2;
        Position position3 = new Position("END_TOP", 2, 8388661);
        END_TOP = position3;
        Position position4 = new Position("END_BOTTOM", 3, 8388693);
        END_BOTTOM = position4;
        Position[] positionArr = {position, position2, position3, position4};
        $VALUES = positionArr;
        f13835b = qf.a.a(positionArr);
    }

    public Position(String str, int i10, int i11) {
        this.gravity = i11;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f13835b;
    }

    public static Position valueOf(String str) {
        return (Position) Enum.valueOf(Position.class, str);
    }

    public static Position[] values() {
        return (Position[]) $VALUES.clone();
    }

    public final int getGravity() {
        return this.gravity;
    }
}
