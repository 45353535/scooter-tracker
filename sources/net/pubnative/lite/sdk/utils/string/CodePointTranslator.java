package net.pubnative.lite.sdk.utils.string;

import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CodePointTranslator extends CharSequenceTranslator {
    @Override // net.pubnative.lite.sdk.utils.string.CharSequenceTranslator
    public final int translate(CharSequence charSequence, int i10, Writer writer) {
        return translate(Character.codePointAt(charSequence, i10), writer) ? 1 : 0;
    }

    public abstract boolean translate(int i10, Writer writer);
}
