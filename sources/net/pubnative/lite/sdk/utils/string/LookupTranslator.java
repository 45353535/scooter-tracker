package net.pubnative.lite.sdk.utils.string;

import java.io.IOException;
import java.io.Writer;
import java.security.InvalidParameterException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class LookupTranslator extends CharSequenceTranslator {
    private final int longest;
    private final Map<String, String> lookupMap;
    private final BitSet prefixSet;
    private final int shortest;

    public LookupTranslator(Map<CharSequence, CharSequence> map) {
        if (map == null) {
            throw new InvalidParameterException("lookupMap cannot be null");
        }
        this.lookupMap = new HashMap();
        this.prefixSet = new BitSet();
        int i10 = Integer.MAX_VALUE;
        int i11 = 0;
        for (Map.Entry<CharSequence, CharSequence> entry : map.entrySet()) {
            this.lookupMap.put(entry.getKey().toString(), entry.getValue().toString());
            this.prefixSet.set(entry.getKey().charAt(0));
            int length = entry.getKey().length();
            i10 = length < i10 ? length : i10;
            if (length > i11) {
                i11 = length;
            }
        }
        this.shortest = i10;
        this.longest = i11;
    }

    @Override // net.pubnative.lite.sdk.utils.string.CharSequenceTranslator
    public int translate(CharSequence charSequence, int i10, Writer writer) throws IOException {
        if (this.prefixSet.get(charSequence.charAt(i10))) {
            int length = this.longest;
            if (i10 + length > charSequence.length()) {
                length = charSequence.length() - i10;
            }
            while (length >= this.shortest) {
                CharSequence charSequenceSubSequence = charSequence.subSequence(i10, i10 + length);
                String str = this.lookupMap.get(charSequenceSubSequence.toString());
                if (str != null) {
                    writer.write(str);
                    return Character.codePointCount(charSequenceSubSequence, 0, charSequenceSubSequence.length());
                }
                length--;
            }
        }
        return 0;
    }
}
