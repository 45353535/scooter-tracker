package io.sentry.android.core.internal.threaddump;

import com.ironsource.C4240b4;
import io.sentry.g7;
import io.sentry.h7;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.b0;
import io.sentry.protocol.c0;
import io.sentry.protocol.d0;
import io.sentry.v7;
import io.sentry.z7;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f82517f = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f82518g = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f82519h = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f82520i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f82521j = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f82522k = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f82523l = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f82524m = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f82525n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f82526o = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f82527p = Pattern.compile(" *- waiting to lock an unknown object");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Pattern f82528q = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v7 f82529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f82530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z7 f82531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f82532d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f82533e = new ArrayList();

    public c(v7 v7Var, boolean z10) {
        this.f82529a = v7Var;
        this.f82530b = z10;
        this.f82531c = new z7(v7Var);
    }

    private static String a(String str) {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new BigInteger("10" + str, 16).toByteArray());
            byteBufferWrap.get();
            return String.format("%08x-%04x-%04x-%04x-%04x%08x", Integer.valueOf(byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN).getInt()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.order(ByteOrder.BIG_ENDIAN).getShort()), Short.valueOf(byteBufferWrap.getShort()), Integer.valueOf(byteBufferWrap.getInt()));
        } catch (NumberFormatException | BufferUnderflowException unused) {
            return null;
        }
    }

    private void b(d0 d0Var, h7 h7Var) {
        Map mapK = d0Var.k();
        if (mapK == null) {
            mapK = new HashMap();
        }
        h7 h7Var2 = (h7) mapK.get(h7Var.f());
        if (h7Var2 != null) {
            h7Var2.l(Math.max(h7Var2.g(), h7Var.g()));
        } else {
            mapK.put(h7Var.f(), new h7(h7Var));
        }
        d0Var.t(mapK);
    }

    private Integer d(Matcher matcher, int i10, Integer num) {
        String strGroup = matcher.group(i10);
        return (strGroup == null || strGroup.length() == 0) ? num : Integer.valueOf(Integer.parseInt(strGroup));
    }

    private Long e(Matcher matcher, int i10, Long l10) {
        String strGroup = matcher.group(i10);
        return (strGroup == null || strGroup.length() == 0) ? l10 : Long.valueOf(Long.parseLong(strGroup));
    }

    private Integer g(Matcher matcher, int i10, Integer num) {
        String strGroup = matcher.group(i10);
        if (strGroup != null && strGroup.length() != 0) {
            int i11 = Integer.parseInt(strGroup);
            Integer numValueOf = Integer.valueOf(i11);
            if (i11 >= 0) {
                return numValueOf;
            }
        }
        return num;
    }

    private boolean h(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    private c0 j(b bVar, d0 d0Var) {
        Matcher matcher;
        Matcher matcher2;
        b0 b0Var;
        Matcher matcher3;
        int i10 = 0;
        ArrayList arrayList = new ArrayList();
        Matcher matcher4 = f82519h.matcher("");
        Matcher matcher5 = f82520i.matcher("");
        Matcher matcher6 = f82521j.matcher("");
        Matcher matcher7 = f82522k.matcher("");
        Matcher matcher8 = f82524m.matcher("");
        Matcher matcher9 = f82523l.matcher("");
        Matcher matcher10 = f82526o.matcher("");
        Matcher matcher11 = f82525n.matcher("");
        Matcher matcher12 = f82527p.matcher("");
        Matcher matcher13 = f82528q.matcher("");
        b0 b0Var2 = null;
        while (true) {
            if (!bVar.a()) {
                break;
            }
            a aVarB = bVar.b();
            if (aVarB == null) {
                this.f82529a.getLogger().c(g7.WARNING, "Internal error while parsing thread dump.", new Object[i10]);
                break;
            }
            String str = aVarB.f82512b;
            int i11 = i10;
            if (h(matcher5, str)) {
                b0 b0Var3 = new b0();
                String strGroup = matcher5.group(1);
                String strGroup2 = matcher5.group(2);
                matcher = matcher13;
                Object[] objArr = new Object[2];
                objArr[i11] = strGroup;
                objArr[1] = strGroup2;
                String str2 = String.format("%s.%s", objArr);
                b0Var3.E(str2);
                b0Var3.z(matcher5.group(3));
                b0Var3.y(matcher5.group(4));
                b0Var3.C(g(matcher5, 5, null));
                b0Var3.A(this.f82531c.b(str2));
                arrayList.add(b0Var3);
                b0Var2 = b0Var3;
                matcher2 = matcher5;
            } else {
                matcher = matcher13;
                if (h(matcher4, str)) {
                    b0 b0Var4 = new b0();
                    b0Var4.G(matcher4.group(3));
                    b0Var4.z(matcher4.group(6));
                    b0Var4.C(d(matcher4, 7, null));
                    b0Var4.B("0x" + matcher4.group(2));
                    b0Var4.H("native");
                    String strGroup3 = matcher4.group(8);
                    String strA = strGroup3 == null ? null : a(strGroup3);
                    if (strA != null) {
                        if (this.f82532d.containsKey(strA)) {
                            matcher2 = matcher5;
                        } else {
                            DebugImage debugImage = new DebugImage();
                            debugImage.setDebugId(strA);
                            matcher2 = matcher5;
                            debugImage.setType("elf");
                            debugImage.setCodeFile(matcher4.group(4));
                            debugImage.setCodeId(strGroup3);
                            this.f82532d.put(strA, debugImage);
                        }
                        b0Var4.x("rel:" + strA);
                    } else {
                        matcher2 = matcher5;
                    }
                    arrayList.add(b0Var4);
                    matcher3 = matcher;
                    b0Var2 = null;
                } else {
                    matcher2 = matcher5;
                    if (h(matcher6, str)) {
                        b0 b0Var5 = new b0();
                        String strGroup4 = matcher6.group(1);
                        String strGroup5 = matcher6.group(2);
                        Object[] objArr2 = new Object[2];
                        objArr2[i11] = strGroup4;
                        objArr2[1] = strGroup5;
                        String str3 = String.format("%s.%s", objArr2);
                        b0Var5.E(str3);
                        b0Var5.z(matcher6.group(3));
                        b0Var5.A(this.f82531c.b(str3));
                        b0Var5.F(Boolean.TRUE);
                        arrayList.add(b0Var5);
                        b0Var2 = b0Var5;
                    } else {
                        if (h(matcher7, str)) {
                            b0Var = b0Var2;
                            if (b0Var != null) {
                                h7 h7Var = new h7();
                                h7Var.l(1);
                                h7Var.h(matcher7.group(1));
                                h7Var.j(matcher7.group(2));
                                h7Var.i(matcher7.group(3));
                                b0Var.D(h7Var);
                                b(d0Var, h7Var);
                            }
                        } else {
                            b0Var = b0Var2;
                            if (h(matcher8, str)) {
                                if (b0Var != null) {
                                    h7 h7Var2 = new h7();
                                    h7Var2.l(2);
                                    h7Var2.h(matcher8.group(1));
                                    h7Var2.j(matcher8.group(2));
                                    h7Var2.i(matcher8.group(3));
                                    b0Var.D(h7Var2);
                                    b(d0Var, h7Var2);
                                }
                            } else if (h(matcher9, str)) {
                                if (b0Var != null) {
                                    h7 h7Var3 = new h7();
                                    h7Var3.l(4);
                                    h7Var3.h(matcher9.group(1));
                                    h7Var3.j(matcher9.group(2));
                                    h7Var3.i(matcher9.group(3));
                                    b0Var.D(h7Var3);
                                    b(d0Var, h7Var3);
                                }
                            } else if (!h(matcher10, str)) {
                                if (!h(matcher11, str)) {
                                    if (!h(matcher12, str)) {
                                        if (str.length() == 0) {
                                            break;
                                        }
                                        matcher3 = matcher;
                                        if (h(matcher3, str)) {
                                            break;
                                        }
                                        b0Var2 = b0Var;
                                    } else if (b0Var != null) {
                                        h7 h7Var4 = new h7();
                                        h7Var4.l(8);
                                        b0Var.D(h7Var4);
                                        b(d0Var, h7Var4);
                                    }
                                } else if (b0Var != null) {
                                    h7 h7Var5 = new h7();
                                    h7Var5.l(8);
                                    h7Var5.h(matcher11.group(1));
                                    h7Var5.j(matcher11.group(2));
                                    h7Var5.i(matcher11.group(3));
                                    b0Var.D(h7Var5);
                                    b(d0Var, h7Var5);
                                } else {
                                    matcher3 = matcher;
                                    b0Var2 = b0Var;
                                }
                                matcher3 = matcher;
                                b0Var2 = b0Var;
                            } else if (b0Var != null) {
                                h7 h7Var6 = new h7();
                                h7Var6.l(8);
                                h7Var6.h(matcher10.group(1));
                                h7Var6.j(matcher10.group(2));
                                h7Var6.i(matcher10.group(3));
                                h7Var6.k(e(matcher10, 4, null));
                                b0Var.D(h7Var6);
                                b(d0Var, h7Var6);
                            }
                        }
                        matcher3 = matcher;
                        b0Var2 = b0Var;
                    }
                }
                matcher13 = matcher3;
                i10 = i11;
                matcher5 = matcher2;
            }
            matcher3 = matcher;
            matcher13 = matcher3;
            i10 = i11;
            matcher5 = matcher2;
        }
        Collections.reverse(arrayList);
        c0 c0Var = new c0(arrayList);
        c0Var.e(Boolean.TRUE);
        return c0Var;
    }

    private d0 k(b bVar) {
        d0 d0Var = new d0();
        Matcher matcher = f82517f.matcher("");
        Matcher matcher2 = f82518g.matcher("");
        if (!bVar.a()) {
            return null;
        }
        a aVarB = bVar.b();
        boolean z10 = false;
        if (aVarB == null) {
            this.f82529a.getLogger().c(g7.WARNING, "Internal error while parsing thread dump.", new Object[0]);
            return null;
        }
        if (h(matcher, aVarB.f82512b)) {
            Long lE = e(matcher, 4, null);
            if (lE == null) {
                this.f82529a.getLogger().c(g7.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            d0Var.u(lE);
            d0Var.w(matcher.group(1));
            String strGroup = matcher.group(5);
            if (strGroup != null) {
                if (strGroup.contains(" ")) {
                    d0Var.z(strGroup.substring(0, strGroup.indexOf(32)));
                } else {
                    d0Var.z(strGroup);
                }
            }
        } else if (h(matcher2, aVarB.f82512b)) {
            Long lE2 = e(matcher2, 3, null);
            if (lE2 == null) {
                this.f82529a.getLogger().c(g7.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            d0Var.u(lE2);
            d0Var.w(matcher2.group(1));
        }
        String strM = d0Var.m();
        if (strM != null) {
            boolean zEquals = strM.equals(C4240b4.i.Z);
            d0Var.v(Boolean.valueOf(zEquals));
            d0Var.q(Boolean.valueOf(zEquals));
            if (zEquals && !this.f82530b) {
                z10 = true;
            }
            d0Var.r(Boolean.valueOf(z10));
        }
        d0Var.y(j(bVar, d0Var));
        return d0Var;
    }

    public List c() {
        return new ArrayList(this.f82532d.values());
    }

    public List f() {
        return this.f82533e;
    }

    public void i(b bVar) {
        Matcher matcher = f82517f.matcher("");
        Matcher matcher2 = f82518g.matcher("");
        while (bVar.a()) {
            a aVarB = bVar.b();
            if (aVarB == null) {
                this.f82529a.getLogger().c(g7.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return;
            }
            String str = aVarB.f82512b;
            if (h(matcher, str) || h(matcher2, str)) {
                bVar.d();
                d0 d0VarK = k(bVar);
                if (d0VarK != null) {
                    this.f82533e.add(d0VarK);
                }
            }
        }
    }
}
