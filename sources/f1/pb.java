package f1;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes6.dex */
public abstract class pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f70787a = new Regex("^market://details\\?id=(.*)$");

    public static final String a(ia iaVar) {
        List listC;
        MatchResult matchResultD = f70787a.d(iaVar.d());
        if (matchResultD == null || (listC = matchResultD.c()) == null) {
            return null;
        }
        return (String) CollectionsKt.getOrNull(listC, 1);
    }

    public static final ia b(ia iaVar) {
        Intrinsics.checkNotNullParameter(iaVar, "<this>");
        String strA = a(iaVar);
        if (strA == null) {
            return iaVar;
        }
        String str = String.format("https://play.google.com/store/apps/details?id=%s", Arrays.copyOf(new Object[]{strA}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        ia iaVarB = ia.b(iaVar, str, null, false, 6, null);
        return iaVarB == null ? iaVar : iaVarB;
    }
}
