package com.appodeal.consent;

import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/appodeal/consent/CmpType;", "", "", "a", "Ljava/lang/String;", "getTypeName", "()Ljava/lang/String;", "typeName", y.f66058y, "com/appodeal/consent/a", "Ump", "None", "consent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CmpType {

    @NotNull
    public static final e Companion;
    public static final CmpType None;
    public static final CmpType Ump;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ CmpType[] f15356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f15357c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String typeName;

    static {
        CmpType cmpType = new CmpType("Ump", 0, "UMP");
        Ump = cmpType;
        CmpType cmpType2 = new CmpType("None", 1, "NONE");
        None = cmpType2;
        CmpType[] cmpTypeArr = {cmpType, cmpType2};
        f15356b = cmpTypeArr;
        f15357c = qf.a.a(cmpTypeArr);
        Companion = new e();
    }

    public CmpType(String str, int i10, String str2) {
        this.typeName = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f15357c;
    }

    public static CmpType valueOf(String str) {
        return (CmpType) Enum.valueOf(CmpType.class, str);
    }

    public static CmpType[] values() {
        return (CmpType[]) f15356b.clone();
    }

    @NotNull
    public final String getTypeName() {
        return this.typeName;
    }
}
