package org.bidon.sdk.databinders;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lorg/bidon/sdk/databinders/DataBinderType;", "", "<init>", "(Ljava/lang/String;I)V", "Device", "App", RtspHeaders.SESSION, "User", "Token", "Placement", "AvailableAdapters", "Segment", "Reg", "Test", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DataBinderType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DataBinderType[] $VALUES;
    public static final DataBinderType Device = new DataBinderType("Device", 0);
    public static final DataBinderType App = new DataBinderType("App", 1);
    public static final DataBinderType Session = new DataBinderType(RtspHeaders.SESSION, 2);
    public static final DataBinderType User = new DataBinderType("User", 3);
    public static final DataBinderType Token = new DataBinderType("Token", 4);
    public static final DataBinderType Placement = new DataBinderType("Placement", 5);
    public static final DataBinderType AvailableAdapters = new DataBinderType("AvailableAdapters", 6);
    public static final DataBinderType Segment = new DataBinderType("Segment", 7);
    public static final DataBinderType Reg = new DataBinderType("Reg", 8);
    public static final DataBinderType Test = new DataBinderType("Test", 9);

    private static final /* synthetic */ DataBinderType[] $values() {
        return new DataBinderType[]{Device, App, Session, User, Token, Placement, AvailableAdapters, Segment, Reg, Test};
    }

    static {
        DataBinderType[] dataBinderTypeArr$values = $values();
        $VALUES = dataBinderTypeArr$values;
        $ENTRIES = a.a(dataBinderTypeArr$values);
    }

    private DataBinderType(String str, int i10) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static DataBinderType valueOf(String str) {
        return (DataBinderType) Enum.valueOf(DataBinderType.class, str);
    }

    public static DataBinderType[] values() {
        return (DataBinderType[]) $VALUES.clone();
    }
}
