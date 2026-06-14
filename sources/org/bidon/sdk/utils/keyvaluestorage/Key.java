package org.bidon.sdk.utils.keyvaluestorage;

import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lorg/bidon/sdk/utils/keyvaluestorage/Key;", "", "<init>", "(Ljava/lang/String;I)V", "Token", "BidonAppKey", "ClientApplicationId", HttpHeaders.HOST, "SegmentUid", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Key {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Key[] $VALUES;
    public static final Key Token = new Key("Token", 0);
    public static final Key BidonAppKey = new Key("BidonAppKey", 1);
    public static final Key ClientApplicationId = new Key("ClientApplicationId", 2);
    public static final Key Host = new Key(HttpHeaders.HOST, 3);
    public static final Key SegmentUid = new Key("SegmentUid", 4);

    private static final /* synthetic */ Key[] $values() {
        return new Key[]{Token, BidonAppKey, ClientApplicationId, Host, SegmentUid};
    }

    static {
        Key[] keyArr$values = $values();
        $VALUES = keyArr$values;
        $ENTRIES = qf.a.a(keyArr$values);
    }

    private Key(String str, int i10) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static Key valueOf(String str) {
        return (Key) Enum.valueOf(Key.class, str);
    }

    public static Key[] values() {
        return (Key[]) $VALUES.clone();
    }
}
