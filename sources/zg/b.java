package zg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final byte a(char c10) {
        if (c10 < '~') {
            return p.f119465c[c10];
        }
        return (byte) 0;
    }

    public static final char b(int i10) {
        if (i10 < 117) {
            return p.f119464b[i10];
        }
        return (char) 0;
    }

    public static final String c(byte b10) {
        return b10 == 1 ? "quotation mark '\"'" : b10 == 2 ? "string escape sequence '\\'" : b10 == 4 ? "comma ','" : b10 == 5 ? "colon ':'" : b10 == 6 ? "start of the object '{'" : b10 == 7 ? "end of the object '}'" : b10 == 8 ? "start of the array '['" : b10 == 9 ? "end of the array ']'" : b10 == 10 ? "end of the input" : b10 == 127 ? "invalid token" : "valid token";
    }
}
