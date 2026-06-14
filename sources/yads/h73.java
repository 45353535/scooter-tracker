package yads;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h73 {
    public static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, i73 i73Var, f73 f73Var, Map map, int i12) {
        f73 f73Var2;
        int i13 = i73Var.f111901h;
        if (i13 != -1 || i73Var.f111902i != -1) {
            if (((i13 == 1 ? (char) 1 : (char) 0) | (i73Var.f111902i == 1 ? (char) 2 : (char) 0)) != -1) {
                int i14 = i73Var.f111901h;
                spannableStringBuilder.setSpan(new StyleSpan((i14 == -1 && i73Var.f111902i == -1) ? -1 : (i14 == 1 ? 1 : 0) | (i73Var.f111902i == 1 ? 2 : 0)), i10, i11, 33);
            }
        }
        if (i73Var.f111899f == 1) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (i73Var.f111900g == 1) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (i73Var.f111896c) {
            if (!i73Var.f111896c) {
                throw new IllegalStateException("Font color has not been defined.");
            }
            qz2.a(spannableStringBuilder, new ForegroundColorSpan(i73Var.f111895b), i10, i11);
        }
        if (i73Var.f111898e) {
            if (!i73Var.f111898e) {
                throw new IllegalStateException("Background color has not been defined.");
            }
            qz2.a(spannableStringBuilder, new BackgroundColorSpan(i73Var.f111897d), i10, i11);
        }
        if (i73Var.f111894a != null) {
            qz2.a(spannableStringBuilder, new TypefaceSpan(i73Var.f111894a), i10, i11);
        }
        if (i73Var.f111911r != null) {
            qz2.a(spannableStringBuilder, new i33(), i10, i11);
        }
        int i15 = i73Var.f111906m;
        if (i15 == 2) {
            f73 f73Var3 = f73Var;
            while (true) {
                if (f73Var3 == null) {
                    f73Var3 = null;
                    break;
                }
                i73 i73VarA = a(f73Var3.f110628f, f73Var3.f110629g, map);
                if (i73VarA != null && i73VarA.f111906m == 1) {
                    break;
                } else {
                    f73Var3 = f73Var3.f110632j;
                }
            }
            if (f73Var3 != null) {
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(f73Var3);
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        f73Var2 = null;
                        break;
                    }
                    f73 f73Var4 = (f73) arrayDeque.pop();
                    i73 i73VarA2 = a(f73Var4.f110628f, f73Var4.f110629g, map);
                    if (i73VarA2 != null && i73VarA2.f111906m == 3) {
                        f73Var2 = f73Var4;
                        break;
                    }
                    ArrayList arrayList = f73Var4.f110635m;
                    for (int size = (arrayList == null ? 0 : arrayList.size()) - 1; size >= 0; size--) {
                        arrayDeque.push(f73Var4.a(size));
                    }
                }
                if (f73Var2 != null) {
                    ArrayList arrayList2 = f73Var2.f110635m;
                    if (arrayList2 == null || arrayList2.size() != 1 || f73Var2.a(0).f110624b == null) {
                        uf1.c("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                    } else {
                        String str = f73Var2.a(0).f110624b;
                        int i16 = w83.f117341a;
                        i73 i73VarA3 = a(f73Var2.f110628f, f73Var2.f110629g, map);
                        if (i73VarA3 == null || i73VarA3.f111907n == -1) {
                            a(f73Var3.f110628f, f73Var3.f110629g, map);
                        }
                        spannableStringBuilder.setSpan(new up2(), i10, i11, 33);
                    }
                }
            }
        } else if (i15 == 3 || i15 == 4) {
            spannableStringBuilder.setSpan(new ef0(), i10, i11, 33);
        }
        if (i73Var.f111910q == 1) {
            qz2.a(spannableStringBuilder, new nz0(), i10, i11);
        }
        int i17 = i73Var.f111903j;
        if (i17 == 1) {
            qz2.a(spannableStringBuilder, new AbsoluteSizeSpan((int) i73Var.f111904k, true), i10, i11);
        } else if (i17 == 2) {
            qz2.a(spannableStringBuilder, new RelativeSizeSpan(i73Var.f111904k), i10, i11);
        } else {
            if (i17 != 3) {
                return;
            }
            qz2.a(spannableStringBuilder, new RelativeSizeSpan(i73Var.f111904k / 100.0f), i10, i11);
        }
    }

    public static i73 a(i73 i73Var, String[] strArr, Map map) {
        int i10 = 0;
        if (i73Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (i73) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                i73 i73Var2 = new i73();
                int length = strArr.length;
                while (i10 < length) {
                    i73Var2.a((i73) map.get(strArr[i10]));
                    i10++;
                }
                return i73Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return i73Var.a((i73) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    i73Var.a((i73) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return i73Var;
    }
}
