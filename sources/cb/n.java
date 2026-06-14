package cb;

import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.sdk.adsbase.model.AdPreferences;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import n9.t;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImmutableList f6680d;

    /* JADX WARN: Multi-variable type inference failed */
    public n(String str, String str2, List list) {
        super(str);
        q9.a.a(!list.isEmpty());
        this.f6678b = str2;
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) list);
        this.f6680d = immutableListCopyOf;
        this.f6679c = (String) immutableListCopyOf.get(0);
    }

    private static List b(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // cb.i, n9.v.a
    public void a(t.b bVar) {
        String str = this.f6666a;
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b10 = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b10 = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b10 = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b10 = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b10 = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b10 = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b10 = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b10 = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b10 = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b10 = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b10 = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b10 = Ascii.VT;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    b10 = Ascii.FF;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b10 = 13;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b10 = Ascii.SO;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b10 = Ascii.SI;
                }
                break;
            case 2571565:
                if (str.equals(AdPreferences.TYPE_TEXT)) {
                    b10 = Ascii.DLE;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b10 = 17;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b10 = Ascii.DC2;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b10 = 19;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b10 = Ascii.DC4;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b10 = Ascii.NAK;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b10 = Ascii.SYN;
                }
                break;
        }
        try {
            switch (b10) {
                case 0:
                case 10:
                    bVar.P((CharSequence) this.f6680d.get(0));
                    break;
                case 1:
                case 11:
                    bVar.U((CharSequence) this.f6680d.get(0));
                    break;
                case 2:
                case 13:
                    String str2 = (String) this.f6680d.get(0);
                    bVar.h0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).g0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    bVar.Q((CharSequence) this.f6680d.get(0));
                    break;
                case 4:
                case 19:
                    bVar.O((CharSequence) this.f6680d.get(0));
                    break;
                case 5:
                case 20:
                    bVar.V((CharSequence) this.f6680d.get(0));
                    break;
                case 6:
                case 21:
                    String[] strArrJ1 = o0.j1((String) this.f6680d.get(0), "/");
                    bVar.s0(Integer.valueOf(Integer.parseInt(strArrJ1[0]))).r0(strArrJ1.length > 1 ? Integer.valueOf(Integer.parseInt(strArrJ1[1])) : null);
                    break;
                case 7:
                case 17:
                    bVar.p0((CharSequence) this.f6680d.get(0));
                    break;
                case 8:
                case 16:
                    bVar.t0((CharSequence) this.f6680d.get(0));
                    break;
                case 9:
                case 22:
                    bVar.i0(Integer.valueOf(Integer.parseInt((String) this.f6680d.get(0))));
                    break;
                case 12:
                    Integer numTryParse = Ints.tryParse((String) this.f6680d.get(0));
                    if (numTryParse != null) {
                        String strA = j.a(numTryParse.intValue());
                        if (strA != null) {
                            bVar.c0(strA);
                        }
                    } else {
                        bVar.c0((CharSequence) this.f6680d.get(0));
                    }
                    break;
                case 14:
                    List listB = b((String) this.f6680d.get(0));
                    int size = listB.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.g0((Integer) listB.get(2));
                            }
                        }
                        bVar.h0((Integer) listB.get(1));
                    }
                    bVar.i0((Integer) listB.get(0));
                    break;
                case 15:
                    List listB2 = b((String) this.f6680d.get(0));
                    int size2 = listB2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.j0((Integer) listB2.get(2));
                            }
                        }
                        bVar.k0((Integer) listB2.get(1));
                    }
                    bVar.l0((Integer) listB2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f6666a, nVar.f6666a) && Objects.equals(this.f6678b, nVar.f6678b) && this.f6680d.equals(nVar.f6680d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f6666a.hashCode()) * 31;
        String str = this.f6678b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f6680d.hashCode();
    }

    @Override // cb.i
    public String toString() {
        return this.f6666a + ": description=" + this.f6678b + ": values=" + this.f6680d;
    }
}
