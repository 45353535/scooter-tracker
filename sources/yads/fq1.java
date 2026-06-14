package yads;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class fq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final op1 f110829a;

    public fq1(op1 op1Var) {
        this.f110829a = op1Var;
    }

    public static void a(ArrayList arrayList, String str) {
        int iMax = Math.max(4, 44 - str.length());
        int i10 = iMax / 2;
        String strS = StringsKt.S(TokenBuilder.TOKEN_DELIMITER, i10);
        String strS2 = StringsKt.S(TokenBuilder.TOKEN_DELIMITER, (iMax % 2) + i10);
        String strS3 = StringsKt.S(" ", 1);
        arrayList.add(new eq1(strS + strS3 + str + strS3 + strS2, dq1.f110020b));
    }

    public static void a(ArrayList arrayList, List list, String str, boolean z10) {
        dq1 dq1Var;
        String str2;
        String str3;
        if (z10) {
            dq1Var = dq1.f110020b;
            str2 = "ADAPTERS";
            str3 = "INTEGRATED SUCCESSFULLY";
        } else {
            dq1Var = dq1.f110021c;
            str2 = "MISSING ADAPTERS";
            str3 = "NOT INTEGRATED";
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((mp1) it.next()).a());
        }
        arrayList.add(new eq1(CollectionsKt.joinToString$default(arrayList2, null, str2 + ": ", null, 0, null, null, 61, null), dq1Var));
        arrayList.add(new eq1(str + ": " + str3, dq1Var));
    }

    public static void a(ArrayList arrayList, String str, String str2) {
        if (str != null && !StringsKt.y0(str)) {
            arrayList.add(new eq1("SDK Version: " + str, dq1.f110020b));
        }
        if (str2 == null || StringsKt.y0(str2)) {
            return;
        }
        arrayList.add(new eq1("ADAPTERS Version: " + str2, dq1.f110020b));
    }

    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            np1 np1Var = (np1) it.next();
            a(arrayList2, np1Var.f113994a);
            String str = np1Var.f113996c;
            String str2 = ((mp1) CollectionsKt.first(np1Var.f113997d)).f113580b;
            this.f110829a.getClass();
            boolean zA = op1.a(np1Var);
            if (zA) {
                a(arrayList2, str, str2);
            }
            a(arrayList2, np1Var.f113997d, np1Var.f113994a, zA);
        }
        return arrayList2;
    }
}
