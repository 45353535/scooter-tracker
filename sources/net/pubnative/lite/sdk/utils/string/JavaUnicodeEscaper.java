package net.pubnative.lite.sdk.utils.string;

/* JADX INFO: loaded from: classes3.dex */
public class JavaUnicodeEscaper extends UnicodeEscaper {
    public JavaUnicodeEscaper(int i10, int i11, boolean z10) {
        super(i10, i11, z10);
    }

    public static JavaUnicodeEscaper above(int i10) {
        return outsideOf(0, i10);
    }

    public static JavaUnicodeEscaper below(int i10) {
        return outsideOf(i10, Integer.MAX_VALUE);
    }

    public static JavaUnicodeEscaper between(int i10, int i11) {
        return new JavaUnicodeEscaper(i10, i11, true);
    }

    public static JavaUnicodeEscaper outsideOf(int i10, int i11) {
        return new JavaUnicodeEscaper(i10, i11, false);
    }

    @Override // net.pubnative.lite.sdk.utils.string.UnicodeEscaper
    protected String toUtf16Escape(int i10) {
        char[] chars = Character.toChars(i10);
        return "\\u" + CharSequenceTranslator.hex(chars[0]) + "\\u" + CharSequenceTranslator.hex(chars[1]);
    }
}
