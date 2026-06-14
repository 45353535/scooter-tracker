package yads;

import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class bl3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final al3 f109041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f109042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bl3 f109043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ bl3[] f109044f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109045b;

    static {
        bl3 bl3Var = new bl3(0, "DEFAULT", "default");
        f109043e = bl3Var;
        bl3[] bl3VarArr = {bl3Var, new bl3(1, "CACHE_ELSE_NETWORK", "cache_else_network"), new bl3(2, "CACHE_ONLY", "cache_only"), new bl3(3, "DISABLED", "disabled")};
        f109044f = bl3VarArr;
        EnumEntries enumEntriesA = qf.a.a(bl3VarArr);
        f109041c = new al3();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(enumEntriesA, 10)), 16));
        for (Object obj : enumEntriesA) {
            linkedHashMap.put(((bl3) obj).f109045b, obj);
        }
        f109042d = linkedHashMap;
    }

    public bl3(int i10, String str, String str2) {
        this.f109045b = str2;
    }

    public static bl3 valueOf(String str) {
        return (bl3) Enum.valueOf(bl3.class, str);
    }

    public static bl3[] values() {
        return (bl3[]) f109044f.clone();
    }
}
