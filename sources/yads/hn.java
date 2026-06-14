package yads;

import android.content.Context;
import android.net.Uri;
import com.ironsource.C4240b4;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hn extends i53 {
    public final c4 C;
    public final String D;
    public final hz1 E;
    public final rv2 F;
    public final nv2 G;
    public final a5 H;
    public final m9 I;
    public final Context J;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ hn(Context context, c4 c4Var, mr1 mr1Var, String str, String str2, hz1 hz1Var, pm2 pm2Var, go goVar, an2 an2Var, rv2 rv2Var, int i10) {
        rv2 rv2VarA;
        if ((i10 & 512) != 0) {
            rv2.f115619a.getClass();
            rv2VarA = qv2.a(context);
        } else {
            rv2VarA = rv2Var;
        }
        this(context, c4Var, mr1Var, str, str2, hz1Var, pm2Var, goVar, an2Var, rv2VarA, new nv2(rv2VarA), new a5(), new m9());
    }

    @Override // yads.i53, yads.ho, yads.km2
    public final oj3 a(oj3 oj3Var) {
        boolean z10 = lb1.f113032a;
        int i10 = g4.f111053d;
        return super.a((oj3) f4.a(oj3Var.f114340b));
    }

    @Override // yads.km2
    public final byte[] b() {
        if (1 != e()) {
            return null;
        }
        try {
            String str = this.D;
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            byte[] bytes = str.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException unused) {
            boolean z10 = lb1.f113032a;
            return null;
        }
    }

    @Override // yads.i53, yads.km2
    public Map d() {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        String strA = ((sv2) this.F).a();
        if (strA != null) {
            boolean z10 = lb1.f113032a;
        }
        mapCreateMapBuilder.put(f01.F.a(), this.H.b(this.J));
        mapCreateMapBuilder.put(f01.G.a(), this.H.a(this.J));
        mapCreateMapBuilder.putAll(this.C.c().a());
        return MapsKt.build(mapCreateMapBuilder);
    }

    @Override // yads.km2
    public final String g() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f112763c == 0) {
            sb2.append(this.D);
        }
        List list = this.C.f109195b.f108850a.f110761b;
        if (sb2.length() > 0 && !list.isEmpty()) {
            sb2.append(C4240b4.j.f42670c);
        }
        sb2.append(CollectionsKt.joinToString$default(list, C4240b4.j.f42670c, null, null, 0, null, gn.f111282b, 30, null));
        return Uri.parse(this.f112764d).buildUpon().encodedQuery(sb2.toString()).build().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x024e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x016a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02be  */
    @Override // yads.i53
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.qn2 a(yads.r62 r56, int r57) {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.hn.a(yads.r62, int):yads.qn2");
    }

    public boolean b(r62 r62Var, int i10) {
        byte[] bArr;
        if (200 == i10 && (bArr = r62Var.f115341b) != null) {
            if (!(bArr.length == 0)) {
                return true;
            }
        }
        return false;
    }

    public final void b(Context context) {
        int iIntValue;
        Integer num;
        Integer num2;
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(context);
        if (hr2VarA != null && (num2 = hr2VarA.f111754t0) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = this.C.f109209p;
        }
        this.I.f113350a.getClass();
        hr2 hr2VarA2 = ut2.a().a(context);
        this.f112775o = new zd0(1.0f, iIntValue, (hr2VarA2 == null || (num = hr2VarA2.J) == null) ? 0 : num.intValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(Context context, c4 c4Var, mr1 mr1Var, String str, String str2, hz1 hz1Var, pm2 pm2Var, go goVar, an2 an2Var, rv2 rv2Var, nv2 nv2Var, a5 a5Var, m9 m9Var) {
        super(context, c4Var, 1, str, goVar, c4Var, an2Var, pm2Var, mr1Var, 1536);
        c4Var.c().getClass();
        this.C = c4Var;
        this.D = str2;
        this.E = hz1Var;
        this.F = rv2Var;
        this.G = nv2Var;
        this.H = a5Var;
        this.I = m9Var;
        this.J = context.getApplicationContext();
        boolean z10 = lb1.f113032a;
        b(context);
    }
}
