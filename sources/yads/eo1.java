package yads;

import com.appodeal.ads.modules.common.internal.LogConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class eo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f110428a;

    public /* synthetic */ eo1() {
        this(CollectionsKt.listOf((Object[]) new String[]{"AppOpenAd", "Banner", "Interstitial", "Rewarded", LogConstants.KEY_NATIVE}));
    }

    public final qz a(cp1 cp1Var) {
        Object next;
        String strQ0 = StringsKt.Q0(StringsKt.k1(cp1Var.f109504b, '.', null, 2, null), "Adapter");
        if (strQ0.length() <= 0) {
            strQ0 = null;
        }
        if (strQ0 == null) {
            return null;
        }
        Iterator it = this.f110428a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt.M(strQ0, (String) next, false, 2, null)) {
                break;
            }
        }
        String str = (String) next;
        if (str == null) {
            return null;
        }
        pz pzVar = qz.f115220c;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        pzVar.getClass();
        return pz.a(lowerCase);
    }

    public final String b(cp1 cp1Var) {
        Object next;
        String strQ0 = StringsKt.Q0(StringsKt.k1(cp1Var.f109504b, '.', null, 2, null), "Adapter");
        if (strQ0.length() <= 0) {
            strQ0 = null;
        }
        if (strQ0 == null) {
            return null;
        }
        Iterator it = this.f110428a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt.M(strQ0, (String) next, false, 2, null)) {
                break;
            }
        }
        String str = (String) next;
        if (str != null) {
            String strQ02 = StringsKt.Q0(strQ0, str);
            if (strQ02.length() > 0) {
                return strQ02;
            }
        }
        return null;
    }

    public eo1(List list) {
        this.f110428a = list;
    }
}
