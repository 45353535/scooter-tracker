package yads;

import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class tp1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final sp1 f116316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f116317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final tp1 f116318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final tp1 f116319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final tp1 f116320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final tp1 f116321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final tp1 f116322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final tp1 f116323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final tp1 f116324k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final tp1 f116325l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final tp1 f116326m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final tp1 f116327n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final tp1 f116328o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final tp1 f116329p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final tp1 f116330q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final tp1 f116331r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final tp1 f116332s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final tp1 f116333t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final tp1 f116334u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final tp1 f116335v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final tp1 f116336w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final tp1 f116337x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ tp1[] f116338y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116339b;

    static {
        tp1 tp1Var = new tp1(0, "APPLOVIN", "applovin");
        f116318e = tp1Var;
        tp1 tp1Var2 = new tp1(1, "APPLOVIN_MAX", "applovin_max");
        f116319f = tp1Var2;
        tp1 tp1Var3 = new tp1(2, "APPNEXT", "appnext");
        f116320g = tp1Var3;
        tp1 tp1Var4 = new tp1(3, "BIGOADS", "bigoads");
        f116321h = tp1Var4;
        tp1 tp1Var5 = new tp1(4, "CHARTBOOST", "chartboost");
        f116322i = tp1Var5;
        tp1 tp1Var6 = new tp1(5, "ADMOB", "admob");
        f116323j = tp1Var6;
        tp1 tp1Var7 = new tp1(6, "ADMANAGER", "admanager");
        f116324k = tp1Var7;
        tp1 tp1Var8 = new tp1(7, "DIGITAL_TURBINE", "digitalturbine");
        f116325l = tp1Var8;
        tp1 tp1Var9 = new tp1(8, "INMOBI", "inmobi");
        f116326m = tp1Var9;
        tp1 tp1Var10 = new tp1(9, "IRONSOURCE", "ironsource");
        f116327n = tp1Var10;
        tp1 tp1Var11 = new tp1(10, "MINTEGRAL", "mintegral");
        f116328o = tp1Var11;
        tp1 tp1Var12 = new tp1(11, "MYTARGET", "mytarget");
        f116329p = tp1Var12;
        tp1 tp1Var13 = new tp1(12, "PANGLE", "pangle");
        f116330q = tp1Var13;
        tp1 tp1Var14 = new tp1(13, "PETALADS", "petalads");
        f116331r = tp1Var14;
        tp1 tp1Var15 = new tp1(14, "STARTAPP", "startapp");
        f116332s = tp1Var15;
        tp1 tp1Var16 = new tp1(15, "TAPJOY", "tapjoy");
        f116333t = tp1Var16;
        tp1 tp1Var17 = new tp1(16, "UNITYADS", "unityads");
        f116334u = tp1Var17;
        tp1 tp1Var18 = new tp1(17, "VUNGLE", "vungle");
        f116335v = tp1Var18;
        tp1 tp1Var19 = new tp1(18, "ZMATICOO", "zmaticoo");
        f116336w = tp1Var19;
        tp1 tp1Var20 = new tp1(19, "UNDEFINED", "undefined");
        f116337x = tp1Var20;
        tp1[] tp1VarArr = {tp1Var, tp1Var2, tp1Var3, tp1Var4, tp1Var5, tp1Var6, tp1Var7, tp1Var8, tp1Var9, tp1Var10, tp1Var11, tp1Var12, tp1Var13, tp1Var14, tp1Var15, tp1Var16, tp1Var17, tp1Var18, tp1Var19, tp1Var20};
        f116338y = tp1VarArr;
        EnumEntries enumEntriesA = qf.a.a(tp1VarArr);
        f116316c = new sp1();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(enumEntriesA, 10)), 16));
        for (Object obj : enumEntriesA) {
            linkedHashMap.put(((tp1) obj).f116339b, obj);
        }
        f116317d = linkedHashMap;
    }

    public tp1(int i10, String str, String str2) {
        this.f116339b = str2;
    }

    public static tp1 valueOf(String str) {
        return (tp1) Enum.valueOf(tp1.class, str);
    }

    public static tp1[] values() {
        return (tp1[]) f116338y.clone();
    }
}
