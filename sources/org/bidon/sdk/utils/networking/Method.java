package org.bidon.sdk.utils.networking;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/utils/networking/Method;", "", "<init>", "(Ljava/lang/String;I)V", "GET", "POST", "PUT", "DELETE", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Method {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Method[] $VALUES;
    public static final Method GET = new Method("GET", 0);
    public static final Method POST = new Method("POST", 1);
    public static final Method PUT = new Method("PUT", 2);
    public static final Method DELETE = new Method("DELETE", 3);

    private static final /* synthetic */ Method[] $values() {
        return new Method[]{GET, POST, PUT, DELETE};
    }

    static {
        Method[] methodArr$values = $values();
        $VALUES = methodArr$values;
        $ENTRIES = a.a(methodArr$values);
    }

    private Method(String str, int i10) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static Method valueOf(String str) {
        return (Method) Enum.valueOf(Method.class, str);
    }

    public static Method[] values() {
        return (Method[]) $VALUES.clone();
    }
}
