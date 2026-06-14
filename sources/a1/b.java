package a1;

import a1.g;
import a1.k;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.webkit.ProxyConfig;
import com.ironsource.D5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f3291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u f3292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3293c = false;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f3295b;

        static {
            int[] iArr = new int[j.values().length];
            f3295b = iArr;
            try {
                iArr[j.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3295b[j.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3295b[j.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3295b[j.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3295b[j.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3295b[j.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3295b[j.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3295b[j.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3295b[j.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3295b[j.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3295b[j.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3295b[j.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3295b[j.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3295b[j.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3295b[j.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f3295b[j.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f3295b[j.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f3295b[j.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f3295b[j.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f3295b[j.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f3295b[j.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f3295b[j.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f3295b[j.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f3295b[j.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[c.values().length];
            f3294a = iArr2;
            try {
                iArr2[c.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f3294a[c.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f3294a[c.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: a1.b$b, reason: collision with other inner class name */
    private static class C0001b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c f3297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f3298c;

        C0001b(String str, c cVar, String str2) {
            this.f3296a = str;
            this.f3297b = cVar;
            this.f3298c = str2;
        }
    }

    private enum c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    private static class d extends k.i {

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f3304a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f3305b;

            a(int i10, int i11) {
                this.f3304a = i10;
                this.f3305b = i11;
            }
        }

        d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        private int C(int i10) {
            if (i10 >= 48 && i10 <= 57) {
                return i10 - 48;
            }
            if (i10 >= 65 && i10 <= 70) {
                return i10 - 55;
            }
            if (i10 < 97 || i10 > 102) {
                return -1;
            }
            return i10 - 87;
        }

        private a D() {
            a1.c cVarC;
            a aVar;
            if (h()) {
                return null;
            }
            int i10 = this.f3765b;
            if (!f('(')) {
                return null;
            }
            A();
            int i11 = 1;
            if (g("odd")) {
                aVar = new a(2, 1);
            } else {
                if (g("even")) {
                    aVar = new a(2, 0);
                } else {
                    int i12 = (!f('+') && f('-')) ? -1 : 1;
                    a1.c cVarC2 = a1.c.c(this.f3764a, this.f3765b, this.f3766c, false);
                    if (cVarC2 != null) {
                        this.f3765b = cVarC2.a();
                    }
                    if (f('n') || f('N')) {
                        if (cVarC2 == null) {
                            cVarC2 = new a1.c(1L, this.f3765b);
                        }
                        A();
                        boolean zF = f('+');
                        if (!zF && (zF = f('-'))) {
                            i11 = -1;
                        }
                        if (zF) {
                            A();
                            cVarC = a1.c.c(this.f3764a, this.f3765b, this.f3766c, false);
                            if (cVarC == null) {
                                this.f3765b = i10;
                                return null;
                            }
                            this.f3765b = cVarC.a();
                            int i13 = i11;
                            i11 = i12;
                            i12 = i13;
                        } else {
                            int i14 = i11;
                            i11 = i12;
                            i12 = i14;
                            cVarC = null;
                        }
                    } else {
                        cVarC = cVarC2;
                        cVarC2 = null;
                    }
                    aVar = new a(cVarC2 == null ? 0 : i11 * cVarC2.d(), cVarC != null ? i12 * cVarC.d() : 0);
                }
            }
            A();
            if (f(')')) {
                return aVar;
            }
            this.f3765b = i10;
            return null;
        }

        private String E() {
            if (h()) {
                return null;
            }
            String strQ = q();
            return strQ != null ? strQ : H();
        }

        private List G() {
            if (h()) {
                return null;
            }
            int i10 = this.f3765b;
            if (!f('(')) {
                return null;
            }
            A();
            ArrayList arrayList = null;
            do {
                String strH = H();
                if (strH == null) {
                    this.f3765b = i10;
                    return null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strH);
                A();
            } while (z());
            if (f(')')) {
                return arrayList;
            }
            this.f3765b = i10;
            return null;
        }

        private List K() {
            List list;
            List list2;
            if (h()) {
                return null;
            }
            int i10 = this.f3765b;
            if (!f('(')) {
                return null;
            }
            A();
            List listL = L();
            if (listL == null) {
                this.f3765b = i10;
                return null;
            }
            if (!f(')')) {
                this.f3765b = i10;
                return null;
            }
            Iterator it = listL.iterator();
            while (it.hasNext() && (list = ((s) it.next()).f3361a) != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext() && (list2 = ((t) it2.next()).f3366d) != null) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (((g) it3.next()) instanceof k) {
                            return null;
                        }
                    }
                }
            }
            return listL;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List L() {
            a aVar = null;
            if (h()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            s sVar = new s(aVar);
            while (!h() && M(sVar)) {
                if (z()) {
                    arrayList.add(sVar);
                    sVar = new s(aVar);
                }
            }
            if (!sVar.f()) {
                arrayList.add(sVar);
            }
            return arrayList;
        }

        private void O(s sVar, t tVar) throws a1.a {
            g gVar;
            g hVar;
            g gVar2;
            String strH = H();
            if (strH == null) {
                throw new a1.a("Invalid pseudo class");
            }
            j jVarA = j.a(strH);
            a aVar = null;
            switch (a.f3295b[jVarA.ordinal()]) {
                case 1:
                    g hVar2 = new h(0, 1, true, false, null);
                    sVar.b();
                    gVar2 = hVar2;
                    gVar = gVar2;
                    tVar.b(gVar);
                    return;
                case 2:
                    g hVar3 = new h(0, 1, false, false, null);
                    sVar.b();
                    gVar = hVar3;
                    tVar.b(gVar);
                    return;
                case 3:
                    g mVar = new m(false, null);
                    sVar.b();
                    gVar = mVar;
                    tVar.b(gVar);
                    return;
                case 4:
                    hVar = new h(0, 1, true, true, tVar.f3364b);
                    sVar.b();
                    gVar = hVar;
                    tVar.b(gVar);
                    return;
                case 5:
                    g hVar4 = new h(0, 1, false, true, tVar.f3364b);
                    sVar.b();
                    gVar = hVar4;
                    tVar.b(gVar);
                    return;
                case 6:
                    g mVar2 = new m(true, tVar.f3364b);
                    sVar.b();
                    gVar = mVar2;
                    tVar.b(gVar);
                    return;
                case 7:
                    g nVar = new n(aVar);
                    sVar.b();
                    gVar = nVar;
                    tVar.b(gVar);
                    return;
                case 8:
                    g iVar = new i(aVar);
                    sVar.b();
                    gVar = iVar;
                    tVar.b(gVar);
                    return;
                case 9:
                case 10:
                case 11:
                case 12:
                    boolean z10 = jVarA == j.nth_child || jVarA == j.nth_of_type;
                    boolean z11 = jVarA == j.nth_of_type || jVarA == j.nth_last_of_type;
                    a aVarD = D();
                    if (aVarD == null) {
                        throw new a1.a("Invalid or missing parameter section for pseudo class: " + strH);
                    }
                    hVar = new h(aVarD.f3304a, aVarD.f3305b, z10, z11, tVar.f3364b);
                    sVar.b();
                    gVar = hVar;
                    tVar.b(gVar);
                    return;
                case 13:
                    List listK = K();
                    if (listK == null) {
                        throw new a1.a("Invalid or missing parameter section for pseudo class: " + strH);
                    }
                    k kVar = new k(listK);
                    sVar.f3362b = kVar.b();
                    gVar2 = kVar;
                    gVar = gVar2;
                    tVar.b(gVar);
                    return;
                case 14:
                    g oVar = new o(aVar);
                    sVar.b();
                    gVar = oVar;
                    tVar.b(gVar);
                    return;
                case 15:
                    G();
                    g lVar = new l(strH);
                    sVar.b();
                    gVar = lVar;
                    tVar.b(gVar);
                    return;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    g lVar2 = new l(strH);
                    sVar.b();
                    gVar = lVar2;
                    tVar.b(gVar);
                    return;
                default:
                    throw new a1.a("Unsupported pseudo class: " + strH);
            }
        }

        private int P() {
            int i10;
            if (h()) {
                return this.f3765b;
            }
            int i11 = this.f3765b;
            int iCharAt = this.f3764a.charAt(i11);
            if (iCharAt == 45) {
                iCharAt = a();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i10 = i11;
            } else {
                int iA = a();
                while (true) {
                    if ((iA < 65 || iA > 90) && ((iA < 97 || iA > 122) && !((iA >= 48 && iA <= 57) || iA == 45 || iA == 95))) {
                        break;
                    }
                    iA = a();
                }
                i10 = this.f3765b;
            }
            this.f3765b = i11;
            return i10;
        }

        String F() {
            int iC;
            if (h()) {
                return null;
            }
            char cCharAt = this.f3764a.charAt(this.f3765b);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            this.f3765b++;
            int iIntValue = l().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = l().intValue();
                    if (iIntValue != -1) {
                        if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                            iIntValue = l().intValue();
                        } else {
                            int iC2 = C(iIntValue);
                            if (iC2 != -1) {
                                for (int i10 = 1; i10 <= 5 && (iC = C((iIntValue = l().intValue()))) != -1; i10++) {
                                    iC2 = (iC2 * 16) + iC;
                                }
                                sb2.append((char) iC2);
                            }
                        }
                    }
                }
                sb2.append((char) iIntValue);
                iIntValue = l().intValue();
            }
            return sb2.toString();
        }

        String H() {
            int iP = P();
            int i10 = this.f3765b;
            if (iP == i10) {
                return null;
            }
            String strSubstring = this.f3764a.substring(i10, iP);
            this.f3765b = iP;
            return strSubstring;
        }

        String I() {
            char cCharAt;
            int iC;
            StringBuilder sb2 = new StringBuilder();
            while (!h() && (cCharAt = this.f3764a.charAt(this.f3765b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !k(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                this.f3765b++;
                if (cCharAt == '\\') {
                    if (!h()) {
                        String str = this.f3764a;
                        int i10 = this.f3765b;
                        this.f3765b = i10 + 1;
                        cCharAt = str.charAt(i10);
                        if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                            int iC2 = C(cCharAt);
                            if (iC2 != -1) {
                                for (int i11 = 1; i11 <= 5 && !h() && (iC = C(this.f3764a.charAt(this.f3765b))) != -1; i11++) {
                                    this.f3765b++;
                                    iC2 = (iC2 * 16) + iC;
                                }
                                sb2.append((char) iC2);
                            }
                        }
                    }
                }
                sb2.append(cCharAt);
            }
            if (sb2.length() == 0) {
                return null;
            }
            return sb2.toString();
        }

        String J() {
            if (h()) {
                return null;
            }
            int i10 = this.f3765b;
            int iCharAt = this.f3764a.charAt(i10);
            int i11 = i10;
            while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && !j(iCharAt)) {
                if (!k(iCharAt)) {
                    i11 = this.f3765b + 1;
                }
                iCharAt = a();
            }
            if (this.f3765b > i10) {
                return this.f3764a.substring(i10, i11);
            }
            this.f3765b = i10;
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        boolean M(a1.b.s r11) throws a1.a {
            /*
                Method dump skipped, instruction units count: 310
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a1.b.d.M(a1.b$s):boolean");
        }

        String N() {
            if (h()) {
                return null;
            }
            int i10 = this.f3765b;
            if (!g("url(")) {
                return null;
            }
            A();
            String strF = F();
            if (strF == null) {
                strF = I();
            }
            if (strF == null) {
                this.f3765b = i10;
                return null;
            }
            A();
            if (h() || g(")")) {
                return strF;
            }
            this.f3765b = i10;
            return null;
        }
    }

    private enum e {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    enum f {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    private interface g {
        boolean a(q qVar, g.l0 l0Var);
    }

    private static class h implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f3324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f3325d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f3326e;

        h(int i10, int i11, boolean z10, boolean z11, String str) {
            this.f3322a = i10;
            this.f3323b = i11;
            this.f3324c = z10;
            this.f3325d = z11;
            this.f3326e = str;
        }

        @Override // a1.b.g
        public boolean a(q qVar, g.l0 l0Var) {
            int i10;
            int i11;
            String strB = (this.f3325d && this.f3326e == null) ? l0Var.b() : this.f3326e;
            g.j0 j0Var = l0Var.f3560b;
            if (j0Var != null) {
                Iterator it = j0Var.getChildren().iterator();
                i10 = 0;
                i11 = 0;
                while (it.hasNext()) {
                    g.l0 l0Var2 = (g.l0) ((g.n0) it.next());
                    if (l0Var2 == l0Var) {
                        i10 = i11;
                    }
                    if (strB == null || l0Var2.b().equals(strB)) {
                        i11++;
                    }
                }
            } else {
                i10 = 0;
                i11 = 1;
            }
            int i12 = this.f3324c ? i10 + 1 : i11 - i10;
            int i13 = this.f3322a;
            if (i13 == 0) {
                return i12 == this.f3323b;
            }
            int i14 = this.f3323b;
            return (i12 - i14) % i13 == 0 && (Integer.signum(i12 - i14) == 0 || Integer.signum(i12 - this.f3323b) == Integer.signum(this.f3322a));
        }

        public String toString() {
            String str = this.f3324c ? "" : "last-";
            return this.f3325d ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.f3322a), Integer.valueOf(this.f3323b), this.f3326e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(this.f3322a), Integer.valueOf(this.f3323b));
        }
    }

    private static class i implements g {
        private i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // a1.b.g
        public boolean a(q qVar, g.l0 l0Var) {
            return !(l0Var instanceof g.j0) || ((g.j0) l0Var).getChildren().size() == 0;
        }

        public String toString() {
            return "empty";
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    private enum j {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;

        private static final Map A = new HashMap();

        static {
            for (j jVar : values()) {
                if (jVar != UNSUPPORTED) {
                    A.put(jVar.name().replace('_', '-'), jVar);
                }
            }
        }

        public static j a(String str) {
            j jVar = (j) A.get(str);
            return jVar != null ? jVar : UNSUPPORTED;
        }
    }

    private static class k implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f3352a;

        k(List list) {
            this.f3352a = list;
        }

        @Override // a1.b.g
        public boolean a(q qVar, g.l0 l0Var) {
            Iterator it = this.f3352a.iterator();
            while (it.hasNext()) {
                if (b.l(qVar, (s) it.next(), l0Var)) {
                    return false;
                }
            }
            return true;
        }

        int b() {
            Iterator it = this.f3352a.iterator();
            int i10 = Integer.MIN_VALUE;
            while (it.hasNext()) {
                int i11 = ((s) it.next()).f3362b;
                if (i11 > i10) {
                    i10 = i11;
                }
            }
            return i10;
        }

        public String toString() {
            return "not(" + this.f3352a + ")";
        }
    }

    private static class l implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f3353a;

        l(String str) {
            this.f3353a = str;
        }

        @Override // a1.b.g
        public boolean a(q qVar, g.l0 l0Var) {
            return false;
        }

        public String toString() {
            return this.f3353a;
        }
    }

    private static class m implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f3354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f3355b;

        public m(boolean z10, String str) {
            this.f3354a = z10;
            this.f3355b = str;
        }

        @Override // a1.b.g
        public boolean a(q qVar, g.l0 l0Var) {
            int i10;
            String strB = (this.f3354a && this.f3355b == null) ? l0Var.b() : this.f3355b;
            g.j0 j0Var = l0Var.f3560b;
            if (j0Var != null) {
                Iterator it = j0Var.getChildren().iterator();
                i10 = 0;
                while (it.hasNext()) {
                    g.l0 l0Var2 = (g.l0) ((g.n0) it.next());
                    if (strB == null || l0Var2.b().equals(strB)) {
                        i10++;
                    }
                }
            } else {
                i10 = 1;
            }
            return i10 == 1;
        }

        public String toString() {
            return this.f3354a ? String.format("only-of-type <%s>", this.f3355b) : String.format("only-child", new Object[0]);
        }
    }

    private static class n implements g {
        private n() {
        }

        @Override // a1.b.g
        public boolean a(q qVar, g.l0 l0Var) {
            return l0Var.f3560b == null;
        }

        public String toString() {
            return "root";
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    private static class o implements g {
        private o() {
        }

        @Override // a1.b.g
        public boolean a(q qVar, g.l0 l0Var) {
            return qVar != null && l0Var == qVar.f3359a;
        }

        public String toString() {
            return TypedValues.AttributesType.S_TARGET;
        }

        /* synthetic */ o(a aVar) {
            this();
        }
    }

    static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        s f3356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g.e0 f3357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        u f3358c;

        p(s sVar, g.e0 e0Var, u uVar) {
            this.f3356a = sVar;
            this.f3357b = e0Var;
            this.f3358c = uVar;
        }

        public String toString() {
            return String.valueOf(this.f3356a) + " {...} (src=" + this.f3358c + ")";
        }
    }

    static class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g.l0 f3359a;

        q() {
        }

        public String toString() {
            g.l0 l0Var = this.f3359a;
            return l0Var != null ? String.format("<%s id=\"%s\">", l0Var.b(), this.f3359a.f3549c) : "";
        }
    }

    static class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f3360a = null;

        r() {
        }

        void a(p pVar) {
            if (this.f3360a == null) {
                this.f3360a = new ArrayList();
            }
            for (int i10 = 0; i10 < this.f3360a.size(); i10++) {
                if (((p) this.f3360a.get(i10)).f3356a.f3362b > pVar.f3356a.f3362b) {
                    this.f3360a.add(i10, pVar);
                    return;
                }
            }
            this.f3360a.add(pVar);
        }

        void b(r rVar) {
            if (rVar.f3360a == null) {
                return;
            }
            if (this.f3360a == null) {
                this.f3360a = new ArrayList(rVar.f3360a.size());
            }
            Iterator it = rVar.f3360a.iterator();
            while (it.hasNext()) {
                a((p) it.next());
            }
        }

        List c() {
            return this.f3360a;
        }

        boolean d() {
            List list = this.f3360a;
            return list == null || list.isEmpty();
        }

        void e(u uVar) {
            List list = this.f3360a;
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((p) it.next()).f3358c == uVar) {
                    it.remove();
                }
            }
        }

        int f() {
            List list = this.f3360a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            if (this.f3360a == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator it = this.f3360a.iterator();
            while (it.hasNext()) {
                sb2.append(((p) it.next()).toString());
                sb2.append('\n');
            }
            return sb2.toString();
        }
    }

    private static class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e f3363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f3364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List f3365c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        List f3366d = null;

        t(e eVar, String str) {
            this.f3363a = null;
            this.f3364b = null;
            this.f3363a = eVar == null ? e.DESCENDANT : eVar;
            this.f3364b = str;
        }

        void a(String str, c cVar, String str2) {
            if (this.f3365c == null) {
                this.f3365c = new ArrayList();
            }
            this.f3365c.add(new C0001b(str, cVar, str2));
        }

        void b(g gVar) {
            if (this.f3366d == null) {
                this.f3366d = new ArrayList();
            }
            this.f3366d.add(gVar);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            e eVar = this.f3363a;
            if (eVar == e.CHILD) {
                sb2.append("> ");
            } else if (eVar == e.FOLLOWS) {
                sb2.append("+ ");
            }
            String str = this.f3364b;
            if (str == null) {
                str = ProxyConfig.MATCH_ALL_SCHEMES;
            }
            sb2.append(str);
            List<C0001b> list = this.f3365c;
            if (list != null) {
                for (C0001b c0001b : list) {
                    sb2.append('[');
                    sb2.append(c0001b.f3296a);
                    int i10 = a.f3294a[c0001b.f3297b.ordinal()];
                    if (i10 == 1) {
                        sb2.append(D5.T);
                        sb2.append(c0001b.f3298c);
                    } else if (i10 == 2) {
                        sb2.append("~=");
                        sb2.append(c0001b.f3298c);
                    } else if (i10 == 3) {
                        sb2.append("|=");
                        sb2.append(c0001b.f3298c);
                    }
                    sb2.append(']');
                }
            }
            List<g> list2 = this.f3366d;
            if (list2 != null) {
                for (g gVar : list2) {
                    sb2.append(':');
                    sb2.append(gVar);
                }
            }
            return sb2.toString();
        }
    }

    enum u {
        Document,
        RenderOptions
    }

    b(f fVar, u uVar) {
        this.f3291a = fVar;
        this.f3292b = uVar;
    }

    private static int a(List list, int i10, g.l0 l0Var) {
        int i11 = 0;
        if (i10 < 0) {
            return 0;
        }
        Object obj = list.get(i10);
        g.j0 j0Var = l0Var.f3560b;
        if (obj != j0Var) {
            return -1;
        }
        Iterator it = j0Var.getChildren().iterator();
        while (it.hasNext()) {
            if (((g.n0) it.next()) == l0Var) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    static boolean b(String str, f fVar) {
        d dVar = new d(str);
        dVar.A();
        return c(h(dVar), fVar);
    }

    private static boolean c(List list, f fVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar2 = (f) it.next();
            if (fVar2 == f.all || fVar2 == fVar) {
                return true;
            }
        }
        return false;
    }

    private void e(r rVar, d dVar) throws a1.a {
        String strH = dVar.H();
        dVar.A();
        if (strH == null) {
            throw new a1.a("Invalid '@' rule");
        }
        if (!this.f3293c && strH.equals("media")) {
            List listH = h(dVar);
            if (!dVar.f('{')) {
                throw new a1.a("Invalid @media rule: missing rule set");
            }
            dVar.A();
            if (c(listH, this.f3291a)) {
                this.f3293c = true;
                rVar.b(j(dVar));
                this.f3293c = false;
            } else {
                j(dVar);
            }
            if (!dVar.h() && !dVar.f('}')) {
                throw new a1.a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f3293c || !strH.equals("import")) {
            p("Ignoring @%s rule", strH);
            o(dVar);
        } else {
            String strN = dVar.N();
            if (strN == null) {
                strN = dVar.F();
            }
            if (strN == null) {
                throw new a1.a("Invalid @import rule: expected string or url()");
            }
            dVar.A();
            h(dVar);
            if (!dVar.h() && !dVar.f(';')) {
                throw new a1.a("Invalid @media rule: expected '}' at end of rule set");
            }
            a1.g.k();
        }
        dVar.A();
    }

    public static List f(String str) {
        d dVar = new d(str);
        ArrayList arrayList = null;
        while (!dVar.h()) {
            String strR = dVar.r();
            if (strR != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strR);
                dVar.A();
            }
        }
        return arrayList;
    }

    private g.e0 g(d dVar) throws a1.a {
        g.e0 e0Var = new g.e0();
        do {
            String strH = dVar.H();
            dVar.A();
            if (!dVar.f(':')) {
                throw new a1.a("Expected ':'");
            }
            dVar.A();
            String strJ = dVar.J();
            if (strJ == null) {
                throw new a1.a("Expected property value");
            }
            dVar.A();
            if (dVar.f('!')) {
                dVar.A();
                if (!dVar.g("important")) {
                    throw new a1.a("Malformed rule set: found unexpected '!'");
                }
                dVar.A();
            }
            dVar.f(';');
            a1.k.S0(e0Var, strH, strJ);
            dVar.A();
            if (dVar.h()) {
                break;
            }
        } while (!dVar.f('}'));
        return e0Var;
    }

    private static List h(d dVar) {
        String strW;
        ArrayList arrayList = new ArrayList();
        while (!dVar.h() && (strW = dVar.w()) != null) {
            try {
                arrayList.add(f.valueOf(strW));
            } catch (IllegalArgumentException unused) {
            }
            if (!dVar.z()) {
                break;
            }
        }
        return arrayList;
    }

    private boolean i(r rVar, d dVar) throws a1.a {
        List listL = dVar.L();
        if (listL == null || listL.isEmpty()) {
            return false;
        }
        if (!dVar.f('{')) {
            throw new a1.a("Malformed rule block: expected '{'");
        }
        dVar.A();
        g.e0 e0VarG = g(dVar);
        dVar.A();
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            rVar.a(new p((s) it.next(), e0VarG, this.f3292b));
        }
        return true;
    }

    private r j(d dVar) {
        r rVar = new r();
        while (!dVar.h()) {
            try {
                if (!dVar.g("<!--") && !dVar.g("-->")) {
                    if (!dVar.f('@')) {
                        if (!i(rVar, dVar)) {
                            break;
                        }
                    } else {
                        e(rVar, dVar);
                    }
                }
            } catch (a1.a e10) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e10.getMessage());
            }
        }
        return rVar;
    }

    private static boolean k(q qVar, s sVar, int i10, List list, int i11, g.l0 l0Var) {
        t tVarE = sVar.e(i10);
        if (!n(qVar, tVarE, list, i11, l0Var)) {
            return false;
        }
        e eVar = tVarE.f3363a;
        if (eVar == e.DESCENDANT) {
            if (i10 == 0) {
                return true;
            }
            while (i11 >= 0) {
                if (m(qVar, sVar, i10 - 1, list, i11)) {
                    return true;
                }
                i11--;
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m(qVar, sVar, i10 - 1, list, i11);
        }
        int iA = a(list, i11, l0Var);
        if (iA <= 0) {
            return false;
        }
        return k(qVar, sVar, i10 - 1, list, i11, (g.l0) l0Var.f3560b.getChildren().get(iA - 1));
    }

    static boolean l(q qVar, s sVar, g.l0 l0Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj = l0Var.f3560b; obj != null; obj = ((g.n0) obj).f3560b) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        return sVar.g() == 1 ? n(qVar, sVar.e(0), arrayList, size, l0Var) : k(qVar, sVar, sVar.g() - 1, arrayList, size, l0Var);
    }

    private static boolean m(q qVar, s sVar, int i10, List list, int i11) {
        t tVarE = sVar.e(i10);
        g.l0 l0Var = (g.l0) list.get(i11);
        if (!n(qVar, tVarE, list, i11, l0Var)) {
            return false;
        }
        e eVar = tVarE.f3363a;
        if (eVar == e.DESCENDANT) {
            if (i10 == 0) {
                return true;
            }
            while (i11 > 0) {
                i11--;
                if (m(qVar, sVar, i10 - 1, list, i11)) {
                    return true;
                }
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m(qVar, sVar, i10 - 1, list, i11 - 1);
        }
        int iA = a(list, i11, l0Var);
        if (iA <= 0) {
            return false;
        }
        return k(qVar, sVar, i10 - 1, list, i11, (g.l0) l0Var.f3560b.getChildren().get(iA - 1));
    }

    private static boolean n(q qVar, t tVar, List list, int i10, g.l0 l0Var) {
        List list2;
        String str = tVar.f3364b;
        if (str != null && !str.equals(l0Var.b().toLowerCase(Locale.US))) {
            return false;
        }
        List<C0001b> list3 = tVar.f3365c;
        if (list3 != null) {
            for (C0001b c0001b : list3) {
                String str2 = c0001b.f3296a;
                str2.getClass();
                if (str2.equals("id")) {
                    if (!c0001b.f3298c.equals(l0Var.f3549c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (list2 = l0Var.f3553g) == null || !list2.contains(c0001b.f3298c)) {
                    return false;
                }
            }
        }
        List list4 = tVar.f3366d;
        if (list4 == null) {
            return true;
        }
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).a(qVar, l0Var)) {
                return false;
            }
        }
        return true;
    }

    private void o(d dVar) {
        int i10 = 0;
        while (!dVar.h()) {
            int iIntValue = dVar.l().intValue();
            if (iIntValue == 59 && i10 == 0) {
                return;
            }
            if (iIntValue == 123) {
                i10++;
            } else if (iIntValue == 125 && i10 > 0 && i10 - 1 == 0) {
                return;
            }
        }
    }

    private static void p(String str, Object... objArr) {
        Log.w("CSSParser", String.format(str, objArr));
    }

    r d(String str) {
        d dVar = new d(str);
        dVar.A();
        return j(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List f3361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3362b;

        private s() {
            this.f3361a = null;
            this.f3362b = 0;
        }

        void a(t tVar) {
            if (this.f3361a == null) {
                this.f3361a = new ArrayList();
            }
            this.f3361a.add(tVar);
        }

        void b() {
            this.f3362b += 1000;
        }

        void c() {
            this.f3362b++;
        }

        void d() {
            this.f3362b += 1000000;
        }

        t e(int i10) {
            return (t) this.f3361a.get(i10);
        }

        boolean f() {
            List list = this.f3361a;
            return list == null || list.isEmpty();
        }

        int g() {
            List list = this.f3361a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            Iterator it = this.f3361a.iterator();
            while (it.hasNext()) {
                sb2.append((t) it.next());
                sb2.append(' ');
            }
            sb2.append('[');
            sb2.append(this.f3362b);
            sb2.append(']');
            return sb2.toString();
        }

        /* synthetic */ s(a aVar) {
            this();
        }
    }
}
