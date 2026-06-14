package yads;

import android.content.Context;
import android.net.Uri;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gt0 {
    /* JADX WARN: Can't wrap try/catch for region: R(40:0|2|(2:162|3)|6|(4:8|(1:16)(1:15)|17|(1:22))|23|(4:25|(1:33)(1:32)|34|(1:39))|40|(2:170|41)|(2:43|(1:49)(1:46))(0)|50|(2:168|51)|(1:53)(1:55)|56|(2:160|57)|(1:59)(1:61)|62|(2:158|63)|(42:66|(1:68)|69|(4:71|(3:73|(2:75|193)(2:76|192)|77)|191|78)|81|(1:83)(1:84)|85|174|86|89|166|90|93|164|94|(1:96)|97|(1:99)(1:100)|101|(1:103)(1:104)|105|(1:107)(1:108)|109|348|113|(1:115)|116|(1:118)(1:119)|(1:121)|122|(1:124)|125|(3:128|(4:177|133|(2:134|(1:IC)(2:136|(3:179|138|183)(1:184)))|180)(2:181|180)|126)|178|139|(4:142|(3:186|144|189)(1:188)|187|140)|185|145|(2:148|146)|190|149|150)(1:65)|80|81|(0)(0)|85|174|86|89|166|90|93|164|94|(0)|97|(0)(0)|101|(0)(0)|105|(0)(0)|109|348) */
    /* JADX WARN: Can't wrap try/catch for region: R(42:0|2|(2:162|3)|6|(4:8|(1:16)(1:15)|17|(1:22))|23|(4:25|(1:33)(1:32)|34|(1:39))|40|170|41|(2:43|(1:49)(1:46))(0)|50|168|51|(1:53)(1:55)|56|(2:160|57)|(1:59)(1:61)|62|(2:158|63)|(42:66|(1:68)|69|(4:71|(3:73|(2:75|193)(2:76|192)|77)|191|78)|81|(1:83)(1:84)|85|174|86|89|166|90|93|164|94|(1:96)|97|(1:99)(1:100)|101|(1:103)(1:104)|105|(1:107)(1:108)|109|348|113|(1:115)|116|(1:118)(1:119)|(1:121)|122|(1:124)|125|(3:128|(4:177|133|(2:134|(1:IC)(2:136|(3:179|138|183)(1:184)))|180)(2:181|180)|126)|178|139|(4:142|(3:186|144|189)(1:188)|187|140)|185|145|(2:148|146)|190|149|150)(1:65)|80|81|(0)(0)|85|174|86|89|166|90|93|164|94|(0)|97|(0)(0)|101|(0)(0)|105|(0)(0)|109|348) */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01e3, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0205, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0349 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.ft0 a(android.content.Context r19, yads.bv2 r20, yads.ax r21, yads.nn2 r22, yads.c92 r23) {
        /*
            Method dump skipped, instruction units count: 1087
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.gt0.a(android.content.Context, yads.bv2, yads.ax, yads.nn2, yads.c92):yads.ft0");
    }

    public static ft0 a(Context context, c4 c4Var, bv2 bv2Var) {
        String str;
        String string;
        String strDecode;
        String strDecode2;
        ft0 ft0VarA = a(context, bv2Var, c4Var.f109195b, new nn2(), new c92(gf1.a(context)));
        e9 e9Var = c4Var.f109198e;
        if (e9Var != null) {
            ft0VarA.I = ft0VarA.f110856a ? null : e9Var;
            String str2 = e9Var.f110255d;
            if (str2 == null || str2.length() == 0) {
                strDecode = null;
            } else {
                String strEncode = Uri.encode(str2);
                if (strEncode != null && strEncode.length() > 1024) {
                    nt1 nt1Var = bj2.f109020a;
                    bj2.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 1024, 1024);
                    String strEncode2 = Uri.encode(" ");
                    String strSubstring = strEncode.substring(0, 1024);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    boolean Z = StringsKt.Z(strEncode, strEncode2, 1024, false, 4, null);
                    int iC0 = StringsKt.C0(strSubstring, strEncode2, 0, false, 6, null);
                    if (Z || iC0 < 0) {
                        strEncode = strSubstring;
                    } else {
                        strEncode = strSubstring.substring(0, iC0);
                        Intrinsics.checkNotNullExpressionValue(strEncode, "substring(...)");
                    }
                }
                strDecode = Uri.decode(strEncode);
            }
            ft0VarA.T = strDecode;
            List<String> list = e9Var.f110256e;
            String string2 = "";
            if (list != null) {
                StringBuilder sb2 = new StringBuilder();
                for (String str3 : list) {
                    sb2.append(string2);
                    sb2.append(str3);
                    sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                    string2 = "3";
                }
                string2 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            }
            if (string2.length() == 0) {
                strDecode2 = null;
            } else {
                String strEncode3 = Uri.encode(string2);
                if (strEncode3 != null && strEncode3.length() > 2048) {
                    nt1 nt1Var2 = bj2.f109020a;
                    bj2.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 2048, 2048);
                    String strEncode4 = Uri.encode(IOUtils.LINE_SEPARATOR_UNIX);
                    String strSubstring2 = strEncode3.substring(0, 2048);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    int iC02 = StringsKt.C0(strSubstring2, strEncode4, 0, false, 6, null);
                    if (StringsKt.M(strSubstring2, strEncode4, false, 2, null) || iC02 < 0) {
                        strEncode3 = strSubstring2;
                    } else {
                        strEncode3 = strSubstring2.substring(0, iC02);
                        Intrinsics.checkNotNullExpressionValue(strEncode3, "substring(...)");
                    }
                }
                strDecode2 = Uri.decode(strEncode3);
            }
            ft0VarA.U = strDecode2;
            ft0VarA.f110905y0 = k9.a(e9Var.f110253b);
            ft0VarA.f110907z0 = k9.a(e9Var.f110254c);
            ft0VarA.f110859b0 = e9Var.f110259h;
            bn2 bn2Var = e9Var.f110261j;
            if (bn2Var != null) {
                ft0VarA.D0 = k9.a(bn2Var.f109065b);
            }
            HashMap mapA = k9.a(e9Var.f110258g);
            if (mapA != null) {
                ft0VarA.f110870h.putAll(mapA);
            }
        }
        qz qzVar = c4Var.f109194a;
        if (qzVar != null) {
            ft0VarA.f110898v = qzVar.f115230b;
        }
        ft0VarA.f110880m = c4Var.f109204k;
        ft0VarA.f110896u = c4Var.f109196c.f110681a;
        k32 k32Var = c4Var.f109200g;
        if (k32Var != null) {
            ft0VarA.W = k32Var.f112575b;
        }
        mx2 mx2Var = c4Var.f109197d.f114071a;
        if (mx2Var != null) {
            ft0VarA.f110904y = mx2Var.a().f113267b;
            ft0VarA.f110900w = Integer.valueOf(mx2Var.c(context));
            ft0VarA.f110902x = Integer.valueOf(mx2Var.a(context));
        }
        o32 o32Var = c4Var.f109199f;
        if (o32Var != null && o32.f114181d == o32Var) {
            ft0VarA.X = o32Var.f114183b;
        }
        ft0VarA.f110861c0 = c4Var.f109202i;
        ft0VarA.f110863d0 = c4Var.f109203j;
        int i10 = c4Var.f109208o;
        if (1 == i10) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        ft0VarA.f110906z = str;
        String str4 = c4Var.f109196c.f110681a;
        if (str4 != null && (string = bw2.a(new bw2(), context, "ViewSizeInfoStorage").getString(ki3.a(new li3(i10, str4)), null)) != null) {
            ft0VarA.F0 = string;
        }
        return ft0VarA;
    }
}
