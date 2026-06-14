package kotlin.text;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class a extends CharsKt__CharJVMKt {
    public static int f(char c10) {
        int iA = CharsKt__CharJVMKt.a(c10, 10);
        if (iA >= 0) {
            return iA;
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a decimal digit");
    }

    public static final boolean g(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static boolean h(char c10) {
        return 55296 <= c10 && c10 < 57344;
    }

    public static String i(char c10) {
        return d0.a(c10);
    }
}
